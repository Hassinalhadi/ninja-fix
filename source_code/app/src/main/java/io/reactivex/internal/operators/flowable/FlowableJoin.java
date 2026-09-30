package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.operators.flowable.FlowableGroupJoin;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractFlowableWithUpstream<TLeft, R> {
    final Function<? super TLeft, ? extends b> leftEnd;
    final b other;
    final BiFunction<? super TLeft, ? super TRight, ? extends R> resultSelector;
    final Function<? super TRight, ? extends b> rightEnd;

    /* loaded from: classes2.dex */
    public static final class JoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements d, FlowableGroupJoin.JoinSupport {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean cancelled;
        final c downstream;
        final Function<? super TLeft, ? extends b> leftEnd;
        int leftIndex;
        final BiFunction<? super TLeft, ? super TRight, ? extends R> resultSelector;
        final Function<? super TRight, ? extends b> rightEnd;
        int rightIndex;
        static final Integer LEFT_VALUE = 1;
        static final Integer RIGHT_VALUE = 2;
        static final Integer LEFT_CLOSE = 3;
        static final Integer RIGHT_CLOSE = 4;
        final AtomicLong requested = new AtomicLong();
        final CompositeDisposable disposables = new CompositeDisposable();
        final SpscLinkedArrayQueue<Object> queue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
        final Map<Integer, TLeft> lefts = new LinkedHashMap();
        final Map<Integer, TRight> rights = new LinkedHashMap();
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger active = new AtomicInteger(2);

        public JoinSubscription(c cVar, Function<? super TLeft, ? extends b> function, Function<? super TRight, ? extends b> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
            this.downstream = cVar;
            this.leftEnd = function;
            this.rightEnd = function2;
            this.resultSelector = biFunction;
        }

        @Override // qg.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public void cancelAll() {
            this.disposables.dispose();
        }

        public void drain() {
            boolean z2;
            boolean z10;
            if (getAndIncrement() == 0) {
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                c cVar = this.downstream;
                boolean z11 = true;
                int i4 = 1;
                while (!this.cancelled) {
                    if (this.error.get() != null) {
                        spscLinkedArrayQueue.clear();
                        cancelAll();
                        errorAll(cVar);
                        return;
                    }
                    if (this.active.get() == 0) {
                        z2 = z11;
                    } else {
                        z2 = false;
                    }
                    Integer num = (Integer) spscLinkedArrayQueue.poll();
                    if (num == null) {
                        z10 = z11;
                    } else {
                        z10 = false;
                    }
                    if (z2 && z10) {
                        this.lefts.clear();
                        this.rights.clear();
                        this.disposables.dispose();
                        cVar.onComplete();
                        return;
                    }
                    if (z10) {
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else {
                        Object poll = spscLinkedArrayQueue.poll();
                        if (num == LEFT_VALUE) {
                            int i5 = this.leftIndex;
                            this.leftIndex = i5 + 1;
                            this.lefts.put(Integer.valueOf(i5), poll);
                            try {
                                b bVar = (b) ObjectHelper.requireNonNull(this.leftEnd.apply(poll), "The leftEnd returned a null Publisher");
                                FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber = new FlowableGroupJoin.LeftRightEndSubscriber(this, z11, i5);
                                this.disposables.add(leftRightEndSubscriber);
                                bVar.subscribe(leftRightEndSubscriber);
                                if (this.error.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    cancelAll();
                                    errorAll(cVar);
                                    return;
                                }
                                long j5 = this.requested.get();
                                Iterator<TRight> it = this.rights.values().iterator();
                                long j6 = 0;
                                while (it.hasNext()) {
                                    try {
                                        Object requireNonNull = ObjectHelper.requireNonNull(this.resultSelector.apply(poll, it.next()), "The resultSelector returned a null value");
                                        if (j6 != j5) {
                                            cVar.onNext(requireNonNull);
                                            j6++;
                                        } else {
                                            ExceptionHelper.addThrowable(this.error, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                            spscLinkedArrayQueue.clear();
                                            cancelAll();
                                            errorAll(cVar);
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        fail(th, cVar, spscLinkedArrayQueue);
                                        return;
                                    }
                                }
                                if (j6 != 0) {
                                    BackpressureHelper.produced(this.requested, j6);
                                }
                            } catch (Throwable th2) {
                                fail(th2, cVar, spscLinkedArrayQueue);
                                return;
                            }
                        } else if (num == RIGHT_VALUE) {
                            int i10 = this.rightIndex;
                            this.rightIndex = i10 + 1;
                            this.rights.put(Integer.valueOf(i10), poll);
                            try {
                                b bVar2 = (b) ObjectHelper.requireNonNull(this.rightEnd.apply(poll), "The rightEnd returned a null Publisher");
                                FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber2 = new FlowableGroupJoin.LeftRightEndSubscriber(this, false, i10);
                                this.disposables.add(leftRightEndSubscriber2);
                                bVar2.subscribe(leftRightEndSubscriber2);
                                if (this.error.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    cancelAll();
                                    errorAll(cVar);
                                    return;
                                }
                                long j7 = this.requested.get();
                                Iterator<TLeft> it2 = this.lefts.values().iterator();
                                long j10 = 0;
                                while (it2.hasNext()) {
                                    try {
                                        Object requireNonNull2 = ObjectHelper.requireNonNull(this.resultSelector.apply(it2.next(), poll), "The resultSelector returned a null value");
                                        if (j10 != j7) {
                                            cVar.onNext(requireNonNull2);
                                            j10++;
                                        } else {
                                            ExceptionHelper.addThrowable(this.error, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                            spscLinkedArrayQueue.clear();
                                            cancelAll();
                                            errorAll(cVar);
                                            return;
                                        }
                                    } catch (Throwable th3) {
                                        fail(th3, cVar, spscLinkedArrayQueue);
                                        return;
                                    }
                                }
                                if (j10 != 0) {
                                    BackpressureHelper.produced(this.requested, j10);
                                }
                            } catch (Throwable th4) {
                                fail(th4, cVar, spscLinkedArrayQueue);
                                return;
                            }
                        } else if (num == LEFT_CLOSE) {
                            FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber3 = (FlowableGroupJoin.LeftRightEndSubscriber) poll;
                            this.lefts.remove(Integer.valueOf(leftRightEndSubscriber3.index));
                            this.disposables.remove(leftRightEndSubscriber3);
                        } else if (num == RIGHT_CLOSE) {
                            FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber4 = (FlowableGroupJoin.LeftRightEndSubscriber) poll;
                            this.rights.remove(Integer.valueOf(leftRightEndSubscriber4.index));
                            this.disposables.remove(leftRightEndSubscriber4);
                        }
                        z11 = true;
                    }
                }
                spscLinkedArrayQueue.clear();
            }
        }

        public void errorAll(c cVar) {
            Throwable terminate = ExceptionHelper.terminate(this.error);
            this.lefts.clear();
            this.rights.clear();
            cVar.onError(terminate);
        }

        public void fail(Throwable th, c cVar, SimpleQueue<?> simpleQueue) {
            Exceptions.throwIfFatal(th);
            ExceptionHelper.addThrowable(this.error, th);
            simpleQueue.clear();
            cancelAll();
            errorAll(cVar);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerClose(boolean z2, FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber) {
            Integer num;
            synchronized (this) {
                try {
                    SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                    if (z2) {
                        num = LEFT_CLOSE;
                    } else {
                        num = RIGHT_CLOSE;
                    }
                    spscLinkedArrayQueue.offer(num, leftRightEndSubscriber);
                } catch (Throwable th) {
                    throw th;
                }
            }
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerCloseError(Throwable th) {
            if (ExceptionHelper.addThrowable(this.error, th)) {
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerComplete(FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber) {
            this.disposables.delete(leftRightSubscriber);
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerError(Throwable th) {
            if (ExceptionHelper.addThrowable(this.error, th)) {
                this.active.decrementAndGet();
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerValue(boolean z2, Object obj) {
            Integer num;
            synchronized (this) {
                try {
                    SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                    if (z2) {
                        num = LEFT_VALUE;
                    } else {
                        num = RIGHT_VALUE;
                    }
                    spscLinkedArrayQueue.offer(num, obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            drain();
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
            }
        }
    }

    public FlowableJoin(Flowable<TLeft> flowable, b bVar, Function<? super TLeft, ? extends b> function, Function<? super TRight, ? extends b> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
        super(flowable);
        this.other = bVar;
        this.leftEnd = function;
        this.rightEnd = function2;
        this.resultSelector = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        JoinSubscription joinSubscription = new JoinSubscription(cVar, this.leftEnd, this.rightEnd, this.resultSelector);
        cVar.onSubscribe(joinSubscription);
        FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber = new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, true);
        joinSubscription.disposables.add(leftRightSubscriber);
        FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber2 = new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, false);
        joinSubscription.disposables.add(leftRightSubscriber2);
        this.source.subscribe((FlowableSubscriber) leftRightSubscriber);
        this.other.subscribe(leftRightSubscriber2);
    }
}
