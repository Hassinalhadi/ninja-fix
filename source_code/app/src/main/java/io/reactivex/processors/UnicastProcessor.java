package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    final AtomicReference<c> downstream;
    boolean enableOperatorFusion;
    Throwable error;
    final AtomicReference<Runnable> onTerminate;
    final AtomicBoolean once;
    final SpscLinkedArrayQueue<T> queue;
    final AtomicLong requested;
    final BasicIntQueueSubscription<T> wip;

    /* loaded from: classes2.dex */
    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public UnicastQueueSubscription() {
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void cancel() {
            if (!UnicastProcessor.this.cancelled) {
                UnicastProcessor.this.cancelled = true;
                UnicastProcessor.this.doTerminate();
                UnicastProcessor.this.downstream.lazySet(null);
                if (UnicastProcessor.this.wip.getAndIncrement() == 0) {
                    UnicastProcessor.this.downstream.lazySet(null);
                    UnicastProcessor unicastProcessor = UnicastProcessor.this;
                    if (!unicastProcessor.enableOperatorFusion) {
                        unicastProcessor.queue.clear();
                    }
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastProcessor.this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastProcessor.this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return UnicastProcessor.this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(UnicastProcessor.this.requested, j5);
                UnicastProcessor.this.drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i4) {
            if ((i4 & 2) != 0) {
                UnicastProcessor.this.enableOperatorFusion = true;
                return 2;
            }
            return 0;
        }
    }

    public UnicastProcessor(int i4) {
        this(i4, null, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create() {
        return new UnicastProcessor<>(Flowable.bufferSize());
    }

    public boolean checkTerminated(boolean z2, boolean z10, boolean z11, c cVar, SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.cancelled) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            return true;
        }
        if (z10) {
            if (z2 && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                cVar.onError(this.error);
                return true;
            }
            if (z11) {
                Throwable th = this.error;
                this.downstream.lazySet(null);
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public void doTerminate() {
        Runnable andSet = this.onTerminate.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    public void drain() {
        if (this.wip.getAndIncrement() == 0) {
            c cVar = this.downstream.get();
            int i4 = 1;
            while (cVar == null) {
                i4 = this.wip.addAndGet(-i4);
                if (i4 == 0) {
                    return;
                } else {
                    cVar = this.downstream.get();
                }
            }
            if (this.enableOperatorFusion) {
                drainFused(cVar);
            } else {
                drainRegular(cVar);
            }
        }
    }

    public void drainFused(c cVar) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z2 = this.delayError;
        int i4 = 1;
        while (!this.cancelled) {
            boolean z10 = this.done;
            if (!z2 && z10 && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                cVar.onError(this.error);
                return;
            }
            cVar.onNext(null);
            if (z10) {
                this.downstream.lazySet(null);
                Throwable th = this.error;
                if (th != null) {
                    cVar.onError(th);
                    return;
                } else {
                    cVar.onComplete();
                    return;
                }
            }
            i4 = this.wip.addAndGet(-i4);
            if (i4 == 0) {
                return;
            }
        }
        this.downstream.lazySet(null);
    }

    public void drainRegular(c cVar) {
        boolean z2;
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z10 = !this.delayError;
        int i4 = 1;
        do {
            long j5 = this.requested.get();
            long j6 = 0;
            while (j5 != j6) {
                boolean z11 = this.done;
                T poll = spscLinkedArrayQueue.poll();
                if (poll == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!checkTerminated(z10, z11, z2, cVar, spscLinkedArrayQueue)) {
                    if (z2) {
                        break;
                    }
                    cVar.onNext(poll);
                    j6++;
                } else {
                    return;
                }
            }
            if (j5 != j6 || !checkTerminated(z10, this.done, spscLinkedArrayQueue.isEmpty(), cVar, spscLinkedArrayQueue)) {
                if (j6 != 0 && j5 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j6);
                }
                i4 = this.wip.addAndGet(-i4);
            } else {
                return;
            }
        } while (i4 != 0);
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        if (this.done && this.error == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        if (this.downstream.get() != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        if (this.done && this.error != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onComplete() {
        if (!this.done && !this.cancelled) {
            this.done = true;
            doTerminate();
            drain();
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.done && !this.cancelled) {
            this.error = th;
            this.done = true;
            doTerminate();
            drain();
            return;
        }
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onNext(T t5) {
        ObjectHelper.requireNonNull(t5, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.done && !this.cancelled) {
            this.queue.offer(t5);
            drain();
        }
    }

    @Override // qg.c
    public void onSubscribe(d dVar) {
        if (!this.done && !this.cancelled) {
            dVar.request(Long.MAX_VALUE);
        } else {
            dVar.cancel();
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        if (!this.once.get() && this.once.compareAndSet(false, true)) {
            cVar.onSubscribe(this.wip);
            this.downstream.set(cVar);
            if (this.cancelled) {
                this.downstream.lazySet(null);
                return;
            } else {
                drain();
                return;
            }
        }
        EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
    }

    public UnicastProcessor(int i4, Runnable runnable) {
        this(i4, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i4) {
        return new UnicastProcessor<>(i4);
    }

    public UnicastProcessor(int i4, Runnable runnable, boolean z2) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i4, "capacityHint"));
        this.onTerminate = new AtomicReference<>(runnable);
        this.delayError = z2;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueSubscription();
        this.requested = new AtomicLong();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(boolean z2) {
        return new UnicastProcessor<>(Flowable.bufferSize(), null, z2);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i4, Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i4, runnable);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i4, Runnable runnable, boolean z2) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i4, runnable, z2);
    }
}
