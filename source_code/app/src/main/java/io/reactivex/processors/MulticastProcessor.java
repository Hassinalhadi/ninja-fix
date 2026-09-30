package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

@SchedulerSupport(SchedulerSupport.NONE)
@BackpressureSupport(BackpressureKind.FULL)
/* loaded from: classes2.dex */
public final class MulticastProcessor<T> extends FlowableProcessor<T> {
    static final MulticastSubscription[] EMPTY = new MulticastSubscription[0];
    static final MulticastSubscription[] TERMINATED = new MulticastSubscription[0];
    final int bufferSize;
    int consumed;
    volatile boolean done;
    volatile Throwable error;
    int fusionMode;
    final int limit;
    final AtomicBoolean once;
    volatile SimpleQueue<T> queue;
    final boolean refcount;
    final AtomicReference<MulticastSubscription<T>[]> subscribers;
    final AtomicReference<d> upstream;
    final AtomicInteger wip;

    /* loaded from: classes2.dex */
    public static final class MulticastSubscription<T> extends AtomicLong implements d {
        private static final long serialVersionUID = -363282618957264509L;
        final c downstream;
        long emitted;
        final MulticastProcessor<T> parent;

        public MulticastSubscription(c cVar, MulticastProcessor<T> multicastProcessor) {
            this.downstream = cVar;
            this.parent = multicastProcessor;
        }

        @Override // qg.d
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            }
        }

        public void onNext(T t5) {
            if (get() != Long.MIN_VALUE) {
                this.emitted++;
                this.downstream.onNext(t5);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            long j6;
            long j7;
            if (!SubscriptionHelper.validate(j5)) {
                return;
            }
            do {
                j6 = get();
                if (j6 != Long.MIN_VALUE) {
                    j7 = Long.MAX_VALUE;
                    if (j6 != Long.MAX_VALUE) {
                        long j10 = j6 + j5;
                        if (j10 >= 0) {
                            j7 = j10;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(j6, j7));
            this.parent.drain();
        }
    }

    public MulticastProcessor(int i4, boolean z2) {
        ObjectHelper.verifyPositive(i4, "bufferSize");
        this.bufferSize = i4;
        this.limit = i4 - (i4 >> 2);
        this.wip = new AtomicInteger();
        this.subscribers = new AtomicReference<>(EMPTY);
        this.upstream = new AtomicReference<>();
        this.refcount = z2;
        this.once = new AtomicBoolean();
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create() {
        return new MulticastProcessor<>(Flowable.bufferSize(), false);
    }

    public boolean add(MulticastSubscription<T> multicastSubscription) {
        while (true) {
            MulticastSubscription<T>[] multicastSubscriptionArr = this.subscribers.get();
            if (multicastSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = multicastSubscriptionArr.length;
            MulticastSubscription<T>[] multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
            System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
            multicastSubscriptionArr2[length] = multicastSubscription;
            AtomicReference<MulticastSubscription<T>[]> atomicReference = this.subscribers;
            while (!atomicReference.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2)) {
                if (atomicReference.get() != multicastSubscriptionArr) {
                    break;
                }
            }
            return true;
        }
    }

    public void drain() {
        T t5;
        boolean z2;
        if (this.wip.getAndIncrement() == 0) {
            AtomicReference<MulticastSubscription<T>[]> atomicReference = this.subscribers;
            int i4 = this.consumed;
            int i5 = this.limit;
            int i10 = this.fusionMode;
            int i11 = 1;
            while (true) {
                SimpleQueue<T> simpleQueue = this.queue;
                if (simpleQueue != null) {
                    MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference.get();
                    if (multicastSubscriptionArr.length != 0) {
                        int i12 = 0;
                        long j5 = -1;
                        for (MulticastSubscription<T> multicastSubscription : multicastSubscriptionArr) {
                            long j6 = multicastSubscription.get();
                            if (j6 >= 0) {
                                if (j5 == -1) {
                                    j5 = j6 - multicastSubscription.emitted;
                                } else {
                                    j5 = Math.min(j5, j6 - multicastSubscription.emitted);
                                }
                            }
                        }
                        int i13 = i4;
                        while (j5 > 0) {
                            MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                            if (multicastSubscriptionArr2 == TERMINATED) {
                                simpleQueue.clear();
                                return;
                            }
                            if (multicastSubscriptionArr != multicastSubscriptionArr2) {
                                break;
                            }
                            boolean z10 = this.done;
                            try {
                                t5 = simpleQueue.poll();
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                SubscriptionHelper.cancel(this.upstream);
                                this.error = th;
                                this.done = true;
                                t5 = null;
                                z10 = true;
                            }
                            if (t5 == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z10 && z2) {
                                Throwable th2 = this.error;
                                if (th2 != null) {
                                    MulticastSubscription<T>[] andSet = atomicReference.getAndSet(TERMINATED);
                                    int length = andSet.length;
                                    while (i12 < length) {
                                        andSet[i12].onError(th2);
                                        i12++;
                                    }
                                    return;
                                }
                                MulticastSubscription<T>[] andSet2 = atomicReference.getAndSet(TERMINATED);
                                int length2 = andSet2.length;
                                while (i12 < length2) {
                                    andSet2[i12].onComplete();
                                    i12++;
                                }
                                return;
                            }
                            if (z2) {
                                break;
                            }
                            for (MulticastSubscription<T> multicastSubscription2 : multicastSubscriptionArr) {
                                multicastSubscription2.onNext(t5);
                            }
                            j5--;
                            if (i10 != 1 && (i13 = i13 + 1) == i5) {
                                this.upstream.get().request(i5);
                                i13 = 0;
                            }
                        }
                        if (j5 == 0) {
                            MulticastSubscription<T>[] multicastSubscriptionArr3 = atomicReference.get();
                            MulticastSubscription<T>[] multicastSubscriptionArr4 = TERMINATED;
                            if (multicastSubscriptionArr3 == multicastSubscriptionArr4) {
                                simpleQueue.clear();
                                return;
                            }
                            if (multicastSubscriptionArr != multicastSubscriptionArr3) {
                                i4 = i13;
                            } else if (this.done && simpleQueue.isEmpty()) {
                                Throwable th3 = this.error;
                                if (th3 != null) {
                                    MulticastSubscription<T>[] andSet3 = atomicReference.getAndSet(multicastSubscriptionArr4);
                                    int length3 = andSet3.length;
                                    while (i12 < length3) {
                                        andSet3[i12].onError(th3);
                                        i12++;
                                    }
                                    return;
                                }
                                MulticastSubscription<T>[] andSet4 = atomicReference.getAndSet(multicastSubscriptionArr4);
                                int length4 = andSet4.length;
                                while (i12 < length4) {
                                    andSet4[i12].onComplete();
                                    i12++;
                                }
                                return;
                            }
                        }
                        i4 = i13;
                    }
                }
                this.consumed = i4;
                i11 = this.wip.addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public Throwable getThrowable() {
        if (this.once.get()) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        if (this.once.get() && this.error == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        if (this.subscribers.get().length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        if (this.once.get() && this.error != null) {
            return true;
        }
        return false;
    }

    public boolean offer(T t5) {
        if (this.once.get()) {
            return false;
        }
        ObjectHelper.requireNonNull(t5, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.fusionMode != 0 || !this.queue.offer(t5)) {
            return false;
        }
        drain();
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            this.done = true;
            drain();
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.once.compareAndSet(false, true)) {
            this.error = th;
            this.done = true;
            drain();
            return;
        }
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onNext(T t5) {
        if (this.once.get()) {
            return;
        }
        if (this.fusionMode == 0) {
            ObjectHelper.requireNonNull(t5, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.queue.offer(t5)) {
                SubscriptionHelper.cancel(this.upstream);
                onError(new MissingBackpressureException());
                return;
            }
        }
        drain();
    }

    @Override // qg.c
    public void onSubscribe(d dVar) {
        if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
            if (dVar instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) dVar;
                int requestFusion = queueSubscription.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    drain();
                    return;
                }
                if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    dVar.request(this.bufferSize);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.bufferSize);
            dVar.request(this.bufferSize);
        }
    }

    public void remove(MulticastSubscription<T> multicastSubscription) {
        while (true) {
            MulticastSubscription<T>[] multicastSubscriptionArr = this.subscribers.get();
            int length = multicastSubscriptionArr.length;
            if (length != 0) {
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        if (multicastSubscriptionArr[i4] == multicastSubscription) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 < 0) {
                    return;
                }
                if (length == 1) {
                    if (this.refcount) {
                        AtomicReference<MulticastSubscription<T>[]> atomicReference = this.subscribers;
                        MulticastSubscription<T>[] multicastSubscriptionArr2 = TERMINATED;
                        while (!atomicReference.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2)) {
                            if (atomicReference.get() != multicastSubscriptionArr) {
                                break;
                            }
                        }
                        SubscriptionHelper.cancel(this.upstream);
                        this.once.set(true);
                        return;
                    }
                    AtomicReference<MulticastSubscription<T>[]> atomicReference2 = this.subscribers;
                    MulticastSubscription<T>[] multicastSubscriptionArr3 = EMPTY;
                    while (!atomicReference2.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr3)) {
                        if (atomicReference2.get() != multicastSubscriptionArr) {
                            break;
                        }
                    }
                    return;
                }
                MulticastSubscription<T>[] multicastSubscriptionArr4 = new MulticastSubscription[length - 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr4, 0, i4);
                System.arraycopy(multicastSubscriptionArr, i4 + 1, multicastSubscriptionArr4, i4, (length - i4) - 1);
                AtomicReference<MulticastSubscription<T>[]> atomicReference3 = this.subscribers;
                while (!atomicReference3.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr4)) {
                    if (atomicReference3.get() != multicastSubscriptionArr) {
                        break;
                    }
                }
                return;
            }
            return;
        }
    }

    public void start() {
        if (SubscriptionHelper.setOnce(this.upstream, EmptySubscription.INSTANCE)) {
            this.queue = new SpscArrayQueue(this.bufferSize);
        }
    }

    public void startUnbounded() {
        if (SubscriptionHelper.setOnce(this.upstream, EmptySubscription.INSTANCE)) {
            this.queue = new SpscLinkedArrayQueue(this.bufferSize);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        Throwable th;
        MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(cVar, this);
        cVar.onSubscribe(multicastSubscription);
        if (add(multicastSubscription)) {
            if (multicastSubscription.get() == Long.MIN_VALUE) {
                remove(multicastSubscription);
                return;
            } else {
                drain();
                return;
            }
        }
        if ((this.once.get() || !this.refcount) && (th = this.error) != null) {
            cVar.onError(th);
        } else {
            cVar.onComplete();
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(boolean z2) {
        return new MulticastProcessor<>(Flowable.bufferSize(), z2);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i4) {
        return new MulticastProcessor<>(i4, false);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i4, boolean z2) {
        return new MulticastProcessor<>(i4, z2);
    }
}
