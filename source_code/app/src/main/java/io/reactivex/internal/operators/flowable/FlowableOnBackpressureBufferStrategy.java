package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends AbstractFlowableWithUpstream<T, T> {
    final long bufferSize;
    final Action onOverflow;
    final BackpressureOverflowStrategy strategy;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureOverflowStrategy;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            $SwitchMap$io$reactivex$BackpressureOverflowStrategy = iArr;
            try {
                iArr[BackpressureOverflowStrategy.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureOverflowStrategy[BackpressureOverflowStrategy.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 3240706908776709697L;
        final long bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final c downstream;
        Throwable error;
        final Action onOverflow;
        final BackpressureOverflowStrategy strategy;
        d upstream;
        final AtomicLong requested = new AtomicLong();
        final Deque<T> deque = new ArrayDeque();

        public OnBackpressureBufferStrategySubscriber(c cVar, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy, long j5) {
            this.downstream = cVar;
            this.onOverflow = action;
            this.strategy = backpressureOverflowStrategy;
            this.bufferSize = j5;
        }

        @Override // qg.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                clear(this.deque);
            }
        }

        public void clear(Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }

        public void drain() {
            boolean isEmpty;
            T poll;
            boolean z2;
            if (getAndIncrement() == 0) {
                Deque<T> deque = this.deque;
                c cVar = this.downstream;
                int i4 = 1;
                do {
                    long j5 = this.requested.get();
                    long j6 = 0;
                    while (j6 != j5) {
                        if (this.cancelled) {
                            clear(deque);
                            return;
                        }
                        boolean z10 = this.done;
                        synchronized (deque) {
                            poll = deque.poll();
                        }
                        if (poll == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z10) {
                            Throwable th = this.error;
                            if (th != null) {
                                clear(deque);
                                cVar.onError(th);
                                return;
                            } else if (z2) {
                                cVar.onComplete();
                                return;
                            }
                        }
                        if (z2) {
                            break;
                        }
                        cVar.onNext(poll);
                        j6++;
                    }
                    if (j6 == j5) {
                        if (this.cancelled) {
                            clear(deque);
                            return;
                        }
                        boolean z11 = this.done;
                        synchronized (deque) {
                            isEmpty = deque.isEmpty();
                        }
                        if (z11) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                clear(deque);
                                cVar.onError(th2);
                                return;
                            } else if (isEmpty) {
                                cVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (j6 != 0) {
                        BackpressureHelper.produced(this.requested, j6);
                    }
                    i4 = addAndGet(-i4);
                } while (i4 != 0);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.done = true;
            drain();
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
            boolean z2;
            boolean z10;
            if (!this.done) {
                Deque<T> deque = this.deque;
                synchronized (deque) {
                    try {
                        z2 = false;
                        if (deque.size() == this.bufferSize) {
                            int i4 = AnonymousClass1.$SwitchMap$io$reactivex$BackpressureOverflowStrategy[this.strategy.ordinal()];
                            z10 = true;
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    deque.poll();
                                    deque.offer(t5);
                                }
                            } else {
                                deque.pollLast();
                                deque.offer(t5);
                            }
                            z10 = false;
                            z2 = true;
                        } else {
                            deque.offer(t5);
                            z10 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z2) {
                    Action action = this.onOverflow;
                    if (action != null) {
                        try {
                            action.run();
                            return;
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.upstream.cancel();
                            onError(th2);
                            return;
                        }
                    }
                    return;
                }
                if (z10) {
                    this.upstream.cancel();
                    onError(new MissingBackpressureException());
                } else {
                    drain();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                drain();
            }
        }
    }

    public FlowableOnBackpressureBufferStrategy(Flowable<T> flowable, long j5, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        super(flowable);
        this.bufferSize = j5;
        this.onOverflow = action;
        this.strategy = backpressureOverflowStrategy;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new OnBackpressureBufferStrategySubscriber(cVar, this.onOverflow, this.strategy, this.bufferSize));
    }
}
