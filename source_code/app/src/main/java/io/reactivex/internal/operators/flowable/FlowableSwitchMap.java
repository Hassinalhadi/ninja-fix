package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableSwitchMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends b> mapper;

    /* loaded from: classes2.dex */
    public static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<d> implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long index;
        final SwitchMapSubscriber<T, R> parent;
        volatile SimpleQueue<R> queue;

        public SwitchMapInnerSubscriber(SwitchMapSubscriber<T, R> switchMapSubscriber, long j5, int i4) {
            this.parent = switchMapSubscriber;
            this.index = j5;
            this.bufferSize = i4;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                this.done = true;
                switchMapSubscriber.drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique && switchMapSubscriber.error.addThrowable(th)) {
                if (!switchMapSubscriber.delayErrors) {
                    switchMapSubscriber.upstream.cancel();
                    switchMapSubscriber.done = true;
                }
                this.done = true;
                switchMapSubscriber.drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(R r4) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                if (this.fusionMode == 0 && !this.queue.offer(r4)) {
                    onError(new MissingBackpressureException("Queue full?!"));
                } else {
                    switchMapSubscriber.drain();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
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

        public void request(long j5) {
            if (this.fusionMode != 1) {
                get().request(j5);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d {
        static final SwitchMapInnerSubscriber<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final c downstream;
        final Function<? super T, ? extends b> mapper;
        volatile long unique;
        d upstream;
        final AtomicReference<SwitchMapInnerSubscriber<T, R>> active = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicThrowable error = new AtomicThrowable();

        static {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = new SwitchMapInnerSubscriber<>(null, -1L, 1);
            CANCELLED = switchMapInnerSubscriber;
            switchMapInnerSubscriber.cancel();
        }

        public SwitchMapSubscriber(c cVar, Function<? super T, ? extends b> function, int i4, boolean z2) {
            this.downstream = cVar;
            this.mapper = function;
            this.bufferSize = i4;
            this.delayErrors = z2;
        }

        @Override // qg.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                disposeInner();
            }
        }

        public void disposeInner() {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.active.get();
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber3 = CANCELLED;
            if (switchMapInnerSubscriber2 != switchMapInnerSubscriber3 && (switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.active.getAndSet(switchMapInnerSubscriber3)) != switchMapInnerSubscriber3 && switchMapInnerSubscriber != null) {
                switchMapInnerSubscriber.cancel();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:77:0x00fa, code lost:
        
            r14 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drain() {
            SimpleQueue<R> simpleQueue;
            boolean z2;
            R r4;
            boolean z10;
            if (getAndIncrement() == 0) {
                c cVar = this.downstream;
                int i4 = 1;
                while (!this.cancelled) {
                    if (this.done) {
                        if (this.delayErrors) {
                            if (this.active.get() == null) {
                                if (this.error.get() != null) {
                                    cVar.onError(this.error.terminate());
                                    return;
                                } else {
                                    cVar.onComplete();
                                    return;
                                }
                            }
                        } else if (this.error.get() != null) {
                            disposeInner();
                            cVar.onError(this.error.terminate());
                            return;
                        } else if (this.active.get() == null) {
                            cVar.onComplete();
                            return;
                        }
                    }
                    SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.active.get();
                    if (switchMapInnerSubscriber != null) {
                        simpleQueue = switchMapInnerSubscriber.queue;
                    } else {
                        simpleQueue = null;
                    }
                    if (simpleQueue != null) {
                        if (switchMapInnerSubscriber.done) {
                            if (!this.delayErrors) {
                                if (this.error.get() != null) {
                                    disposeInner();
                                    cVar.onError(this.error.terminate());
                                    return;
                                } else if (simpleQueue.isEmpty()) {
                                    AtomicReference<SwitchMapInnerSubscriber<T, R>> atomicReference = this.active;
                                    while (!atomicReference.compareAndSet(switchMapInnerSubscriber, null) && atomicReference.get() == switchMapInnerSubscriber) {
                                    }
                                }
                            } else if (simpleQueue.isEmpty()) {
                                AtomicReference<SwitchMapInnerSubscriber<T, R>> atomicReference2 = this.active;
                                while (!atomicReference2.compareAndSet(switchMapInnerSubscriber, null) && atomicReference2.get() == switchMapInnerSubscriber) {
                                }
                            }
                        }
                        long j5 = this.requested.get();
                        long j6 = 0;
                        while (true) {
                            z2 = false;
                            if (j6 != j5) {
                                if (!this.cancelled) {
                                    boolean z11 = switchMapInnerSubscriber.done;
                                    try {
                                        r4 = simpleQueue.poll();
                                    } catch (Throwable th) {
                                        Exceptions.throwIfFatal(th);
                                        switchMapInnerSubscriber.cancel();
                                        this.error.addThrowable(th);
                                        r4 = null;
                                        z11 = true;
                                    }
                                    if (r4 == null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (switchMapInnerSubscriber != this.active.get()) {
                                        break;
                                    }
                                    if (z11) {
                                        if (!this.delayErrors) {
                                            if (this.error.get() != null) {
                                                cVar.onError(this.error.terminate());
                                                return;
                                            } else if (z10) {
                                                AtomicReference<SwitchMapInnerSubscriber<T, R>> atomicReference3 = this.active;
                                                while (!atomicReference3.compareAndSet(switchMapInnerSubscriber, null) && atomicReference3.get() == switchMapInnerSubscriber) {
                                                }
                                            }
                                        } else if (z10) {
                                            AtomicReference<SwitchMapInnerSubscriber<T, R>> atomicReference4 = this.active;
                                            while (!atomicReference4.compareAndSet(switchMapInnerSubscriber, null) && atomicReference4.get() == switchMapInnerSubscriber) {
                                            }
                                        }
                                    }
                                    if (z10) {
                                        break;
                                    }
                                    cVar.onNext(r4);
                                    j6++;
                                } else {
                                    return;
                                }
                            } else {
                                break;
                            }
                        }
                        if (j6 != 0 && !this.cancelled) {
                            if (j5 != Long.MAX_VALUE) {
                                this.requested.addAndGet(-j6);
                            }
                            switchMapInnerSubscriber.request(j6);
                        }
                        if (z2) {
                            continue;
                        }
                    }
                    i4 = addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (!this.done && this.error.addThrowable(th)) {
                if (!this.delayErrors) {
                    disposeInner();
                }
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!this.done) {
                long j5 = this.unique + 1;
                this.unique = j5;
                SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.active.get();
                if (switchMapInnerSubscriber != null) {
                    switchMapInnerSubscriber.cancel();
                }
                try {
                    b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(t5), "The publisher returned is null");
                    SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = new SwitchMapInnerSubscriber<>(this, j5, this.bufferSize);
                    while (true) {
                        SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber3 = this.active.get();
                        if (switchMapInnerSubscriber3 == CANCELLED) {
                            return;
                        }
                        AtomicReference<SwitchMapInnerSubscriber<T, R>> atomicReference = this.active;
                        while (!atomicReference.compareAndSet(switchMapInnerSubscriber3, switchMapInnerSubscriber2)) {
                            if (atomicReference.get() != switchMapInnerSubscriber3) {
                                break;
                            }
                        }
                        bVar.subscribe(switchMapInnerSubscriber2);
                        return;
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.upstream.cancel();
                    onError(th);
                }
            }
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
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                if (this.unique == 0) {
                    this.upstream.request(Long.MAX_VALUE);
                } else {
                    drain();
                }
            }
        }
    }

    public FlowableSwitchMap(Flowable<T> flowable, Function<? super T, ? extends b> function, int i4, boolean z2) {
        super(flowable);
        this.mapper = function;
        this.bufferSize = i4;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) new SwitchMapSubscriber(cVar, this.mapper, this.bufferSize, this.delayErrors));
    }
}
