package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean delayError;
    final int prefetch;
    final Scheduler scheduler;

    /* loaded from: classes2.dex */
    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        SimpleQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        int sourceMode;
        d upstream;
        final Scheduler.Worker worker;

        public BaseObserveOnSubscriber(Scheduler.Worker worker, boolean z2, int i4) {
            this.worker = worker;
            this.delayError = z2;
            this.prefetch = i4;
            this.limit = i4 - (i4 >> 2);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                this.worker.dispose();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public final boolean checkTerminated(boolean z2, boolean z10, c cVar) {
            if (this.cancelled) {
                clear();
                return true;
            }
            if (z2) {
                if (this.delayError) {
                    if (z10) {
                        this.cancelled = true;
                        Throwable th = this.error;
                        if (th != null) {
                            cVar.onError(th);
                        } else {
                            cVar.onComplete();
                        }
                        this.worker.dispose();
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.error;
                if (th2 != null) {
                    this.cancelled = true;
                    clear();
                    cVar.onError(th2);
                    this.worker.dispose();
                    return true;
                }
                if (z10) {
                    this.cancelled = true;
                    cVar.onComplete();
                    this.worker.dispose();
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                trySchedule();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            trySchedule();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public final void onNext(T t5) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 2) {
                trySchedule();
                return;
            }
            if (!this.queue.offer(t5)) {
                this.upstream.cancel();
                this.error = new MissingBackpressureException("Queue is full?!");
                this.done = true;
            }
            trySchedule();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public final void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                trySchedule();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i4) {
            if ((i4 & 2) != 0) {
                this.outputFused = true;
                return 2;
            }
            return 0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.outputFused) {
                runBackfused();
            } else if (this.sourceMode == 1) {
                runSync();
            } else {
                runAsync();
            }
        }

        public abstract void runAsync();

        public abstract void runBackfused();

        public abstract void runSync();

        public final void trySchedule() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.worker.schedule(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long consumed;
        final ConditionalSubscriber<? super T> downstream;

        public ObserveOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Scheduler.Worker worker, boolean z2, int i4) {
            super(worker, z2, i4);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        dVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll = this.queue.poll();
            if (poll != null && this.sourceMode != 1) {
                long j5 = this.consumed + 1;
                if (j5 == this.limit) {
                    this.consumed = 0L;
                    this.upstream.request(j5);
                    return poll;
                }
                this.consumed = j5;
            }
            return poll;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runAsync() {
            boolean z2;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j5 = this.produced;
            long j6 = this.consumed;
            int i4 = 1;
            while (true) {
                long j7 = this.requested.get();
                while (j5 != j7) {
                    boolean z10 = this.done;
                    try {
                        T poll = simpleQueue.poll();
                        if (poll == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!checkTerminated(z10, z2, conditionalSubscriber)) {
                            if (z2) {
                                break;
                            }
                            if (conditionalSubscriber.tryOnNext(poll)) {
                                j5++;
                            }
                            j6++;
                            if (j6 == this.limit) {
                                this.upstream.request(j6);
                                j6 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        simpleQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j5 != j7 || !checkTerminated(this.done, simpleQueue.isEmpty(), conditionalSubscriber)) {
                    int i5 = get();
                    if (i4 == i5) {
                        this.produced = j5;
                        this.consumed = j6;
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else {
                        i4 = i5;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runBackfused() {
            int i4 = 1;
            while (!this.cancelled) {
                boolean z2 = this.done;
                this.downstream.onNext(null);
                if (z2) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runSync() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j5 = this.produced;
            int i4 = 1;
            while (true) {
                long j6 = this.requested.get();
                while (j5 != j6) {
                    try {
                        T poll = simpleQueue.poll();
                        if (!this.cancelled) {
                            if (poll == null) {
                                this.cancelled = true;
                                conditionalSubscriber.onComplete();
                                this.worker.dispose();
                                return;
                            } else if (conditionalSubscriber.tryOnNext(poll)) {
                                j5++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        conditionalSubscriber.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (simpleQueue.isEmpty()) {
                        this.cancelled = true;
                        conditionalSubscriber.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        int i5 = get();
                        if (i4 == i5) {
                            this.produced = j5;
                            i4 = addAndGet(-i4);
                            if (i4 == 0) {
                                return;
                            }
                        } else {
                            i4 = i5;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final c downstream;

        public ObserveOnSubscriber(c cVar, Scheduler.Worker worker, boolean z2, int i4) {
            super(worker, z2, i4);
            this.downstream = cVar;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        dVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll = this.queue.poll();
            if (poll != null && this.sourceMode != 1) {
                long j5 = this.produced + 1;
                if (j5 == this.limit) {
                    this.produced = 0L;
                    this.upstream.request(j5);
                    return poll;
                }
                this.produced = j5;
            }
            return poll;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runAsync() {
            boolean z2;
            c cVar = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j5 = this.produced;
            int i4 = 1;
            while (true) {
                long j6 = this.requested.get();
                while (j5 != j6) {
                    boolean z10 = this.done;
                    try {
                        T poll = simpleQueue.poll();
                        if (poll == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!checkTerminated(z10, z2, cVar)) {
                            if (z2) {
                                break;
                            }
                            cVar.onNext(poll);
                            j5++;
                            if (j5 == this.limit) {
                                if (j6 != Long.MAX_VALUE) {
                                    j6 = this.requested.addAndGet(-j5);
                                }
                                this.upstream.request(j5);
                                j5 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        simpleQueue.clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j5 != j6 || !checkTerminated(this.done, simpleQueue.isEmpty(), cVar)) {
                    int i5 = get();
                    if (i4 == i5) {
                        this.produced = j5;
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else {
                        i4 = i5;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runBackfused() {
            int i4 = 1;
            while (!this.cancelled) {
                boolean z2 = this.done;
                this.downstream.onNext(null);
                if (z2) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runSync() {
            c cVar = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j5 = this.produced;
            int i4 = 1;
            while (true) {
                long j6 = this.requested.get();
                while (j5 != j6) {
                    try {
                        T poll = simpleQueue.poll();
                        if (!this.cancelled) {
                            if (poll == null) {
                                this.cancelled = true;
                                cVar.onComplete();
                                this.worker.dispose();
                                return;
                            }
                            cVar.onNext(poll);
                            j5++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (simpleQueue.isEmpty()) {
                        this.cancelled = true;
                        cVar.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        int i5 = get();
                        if (i4 == i5) {
                            this.produced = j5;
                            i4 = addAndGet(-i4);
                            if (i4 == 0) {
                                return;
                            }
                        } else {
                            i4 = i5;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public FlowableObserveOn(Flowable<T> flowable, Scheduler scheduler, boolean z2, int i4) {
        super(flowable);
        this.scheduler = scheduler;
        this.delayError = z2;
        this.prefetch = i4;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        if (cVar instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber) new ObserveOnConditionalSubscriber((ConditionalSubscriber) cVar, createWorker, this.delayError, this.prefetch));
        } else {
            this.source.subscribe((FlowableSubscriber) new ObserveOnSubscriber(cVar, createWorker, this.delayError, this.prefetch));
        }
    }
}
