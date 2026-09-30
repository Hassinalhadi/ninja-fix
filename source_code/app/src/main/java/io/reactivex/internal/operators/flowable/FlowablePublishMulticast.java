package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowablePublishMulticast<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final boolean delayError;
    final int prefetch;
    final Function<? super Flowable<T>, ? extends b> selector;

    /* loaded from: classes2.dex */
    public static final class MulticastProcessor<T> extends Flowable<T> implements FlowableSubscriber<T>, Disposable {
        static final MulticastSubscription[] EMPTY = new MulticastSubscription[0];
        static final MulticastSubscription[] TERMINATED = new MulticastSubscription[0];
        int consumed;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        final int prefetch;
        volatile SimpleQueue<T> queue;
        int sourceMode;
        final AtomicInteger wip = new AtomicInteger();
        final AtomicReference<d> upstream = new AtomicReference<>();
        final AtomicReference<MulticastSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);

        public MulticastProcessor(int i4, boolean z2) {
            this.prefetch = i4;
            this.limit = i4 - (i4 >> 2);
            this.delayError = z2;
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

        public void completeAll() {
            for (MulticastSubscription<T> multicastSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SimpleQueue<T> simpleQueue;
            SubscriptionHelper.cancel(this.upstream);
            if (this.wip.getAndIncrement() == 0 && (simpleQueue = this.queue) != null) {
                simpleQueue.clear();
            }
        }

        public void drain() {
            boolean z2;
            AtomicReference<MulticastSubscription<T>[]> atomicReference;
            Throwable th;
            boolean z10;
            Throwable th2;
            if (this.wip.getAndIncrement() == 0) {
                SimpleQueue<T> simpleQueue = this.queue;
                int i4 = this.consumed;
                int i5 = this.limit;
                if (this.sourceMode != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                AtomicReference<MulticastSubscription<T>[]> atomicReference2 = this.subscribers;
                MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference2.get();
                int i10 = 1;
                while (true) {
                    int length = multicastSubscriptionArr.length;
                    if (simpleQueue != null && length != 0) {
                        int length2 = multicastSubscriptionArr.length;
                        long j5 = Long.MAX_VALUE;
                        long j6 = Long.MAX_VALUE;
                        int i11 = 0;
                        while (i11 < length2) {
                            MulticastSubscription<T> multicastSubscription = multicastSubscriptionArr[i11];
                            AtomicReference<MulticastSubscription<T>[]> atomicReference3 = atomicReference2;
                            long j7 = multicastSubscription.get() - multicastSubscription.emitted;
                            if (j7 != Long.MIN_VALUE) {
                                if (j6 > j7) {
                                    j6 = j7;
                                }
                            } else {
                                length--;
                            }
                            i11++;
                            atomicReference2 = atomicReference3;
                        }
                        atomicReference = atomicReference2;
                        long j10 = 0;
                        if (length == 0) {
                            j6 = 0;
                        }
                        while (j6 != j10) {
                            if (isDisposed()) {
                                simpleQueue.clear();
                                return;
                            }
                            boolean z11 = this.done;
                            if (z11 && !this.delayError && (th2 = this.error) != null) {
                                errorAll(th2);
                                return;
                            }
                            try {
                                T poll = simpleQueue.poll();
                                if (poll == null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z11 && z10) {
                                    Throwable th3 = this.error;
                                    if (th3 != null) {
                                        errorAll(th3);
                                        return;
                                    } else {
                                        completeAll();
                                        return;
                                    }
                                }
                                if (z10) {
                                    break;
                                }
                                int length3 = multicastSubscriptionArr.length;
                                int i12 = 0;
                                boolean z12 = false;
                                while (i12 < length3) {
                                    MulticastSubscription<T> multicastSubscription2 = multicastSubscriptionArr[i12];
                                    long j11 = multicastSubscription2.get();
                                    if (j11 != Long.MIN_VALUE) {
                                        if (j11 != j5) {
                                            multicastSubscription2.emitted++;
                                        }
                                        multicastSubscription2.downstream.onNext(poll);
                                    } else {
                                        z12 = true;
                                    }
                                    i12++;
                                    j5 = Long.MAX_VALUE;
                                }
                                j6--;
                                if (z2 && (i4 = i4 + 1) == i5) {
                                    this.upstream.get().request(i5);
                                    i4 = 0;
                                }
                                MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                                if (!z12 && multicastSubscriptionArr2 == multicastSubscriptionArr) {
                                    j10 = 0;
                                    j5 = Long.MAX_VALUE;
                                } else {
                                    multicastSubscriptionArr = multicastSubscriptionArr2;
                                    break;
                                }
                            } catch (Throwable th4) {
                                Exceptions.throwIfFatal(th4);
                                SubscriptionHelper.cancel(this.upstream);
                                errorAll(th4);
                                return;
                            }
                        }
                        if (j6 == j10) {
                            if (isDisposed()) {
                                simpleQueue.clear();
                                return;
                            }
                            boolean z13 = this.done;
                            if (z13 && !this.delayError && (th = this.error) != null) {
                                errorAll(th);
                                return;
                            }
                            if (z13 && simpleQueue.isEmpty()) {
                                Throwable th5 = this.error;
                                if (th5 != null) {
                                    errorAll(th5);
                                    return;
                                } else {
                                    completeAll();
                                    return;
                                }
                            }
                        }
                    } else {
                        atomicReference = atomicReference2;
                    }
                    this.consumed = i4;
                    i10 = this.wip.addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                    if (simpleQueue == null) {
                        simpleQueue = this.queue;
                    }
                    multicastSubscriptionArr = atomicReference.get();
                    atomicReference2 = atomicReference;
                }
            }
        }

        public void errorAll(Throwable th) {
            for (MulticastSubscription<T> multicastSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.upstream.get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 0 && !this.queue.offer(t5)) {
                this.upstream.get().cancel();
                onError(new MissingBackpressureException());
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        QueueDrainHelper.request(dVar, this.prefetch);
                        return;
                    }
                }
                this.queue = QueueDrainHelper.createQueue(this.prefetch);
                QueueDrainHelper.request(dVar, this.prefetch);
            }
        }

        public void remove(MulticastSubscription<T> multicastSubscription) {
            MulticastSubscription<T>[] multicastSubscriptionArr;
            while (true) {
                MulticastSubscription<T>[] multicastSubscriptionArr2 = this.subscribers.get();
                int length = multicastSubscriptionArr2.length;
                if (length != 0) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            if (multicastSubscriptionArr2[i4] == multicastSubscription) {
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
                        multicastSubscriptionArr = EMPTY;
                    } else {
                        MulticastSubscription<T>[] multicastSubscriptionArr3 = new MulticastSubscription[length - 1];
                        System.arraycopy(multicastSubscriptionArr2, 0, multicastSubscriptionArr3, 0, i4);
                        System.arraycopy(multicastSubscriptionArr2, i4 + 1, multicastSubscriptionArr3, i4, (length - i4) - 1);
                        multicastSubscriptionArr = multicastSubscriptionArr3;
                    }
                    AtomicReference<MulticastSubscription<T>[]> atomicReference = this.subscribers;
                    while (!atomicReference.compareAndSet(multicastSubscriptionArr2, multicastSubscriptionArr)) {
                        if (atomicReference.get() != multicastSubscriptionArr2) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(c cVar) {
            MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(cVar, this);
            cVar.onSubscribe(multicastSubscription);
            if (add(multicastSubscription)) {
                if (multicastSubscription.isCancelled()) {
                    remove(multicastSubscription);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            Throwable th = this.error;
            if (th != null) {
                cVar.onError(th);
            } else {
                cVar.onComplete();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class MulticastSubscription<T> extends AtomicLong implements d {
        private static final long serialVersionUID = 8664815189257569791L;
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
                this.parent.drain();
            }
        }

        public boolean isCancelled() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.addCancel(this, j5);
                this.parent.drain();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class OutputCanceller<R> implements FlowableSubscriber<R>, d {
        final c downstream;
        final MulticastProcessor<?> processor;
        d upstream;

        public OutputCanceller(c cVar, MulticastProcessor<?> multicastProcessor) {
            this.downstream = cVar;
            this.processor = multicastProcessor;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.cancel();
            this.processor.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.downstream.onComplete();
            this.processor.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.processor.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(R r4) {
            this.downstream.onNext(r4);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            this.upstream.request(j5);
        }
    }

    public FlowablePublishMulticast(Flowable<T> flowable, Function<? super Flowable<T>, ? extends b> function, int i4, boolean z2) {
        super(flowable);
        this.selector = function;
        this.prefetch = i4;
        this.delayError = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        MulticastProcessor multicastProcessor = new MulticastProcessor(this.prefetch, this.delayError);
        try {
            ((b) ObjectHelper.requireNonNull(this.selector.apply(multicastProcessor), "selector returned a null Publisher")).subscribe(new OutputCanceller(cVar, multicastProcessor));
            this.source.subscribe((FlowableSubscriber) multicastProcessor);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
