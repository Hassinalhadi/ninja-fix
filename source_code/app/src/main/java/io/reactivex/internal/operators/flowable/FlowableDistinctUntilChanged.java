package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import qg.c;

/* loaded from: classes2.dex */
public final class FlowableDistinctUntilChanged<T, K> extends AbstractFlowableWithUpstream<T, T> {
    final BiPredicate<? super K, ? super K> comparer;
    final Function<? super T, K> keySelector;

    /* loaded from: classes2.dex */
    public static final class DistinctUntilChangedConditionalSubscriber<T, K> extends BasicFuseableConditionalSubscriber<T, T> {
        final BiPredicate<? super K, ? super K> comparer;
        boolean hasValue;
        final Function<? super T, K> keySelector;
        K last;

        public DistinctUntilChangedConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(conditionalSubscriber);
            this.keySelector = function;
            this.comparer = biPredicate;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!tryOnNext(t5)) {
                this.upstream.request(1L);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            while (true) {
                T poll = this.qs.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.keySelector.apply(poll);
                if (!this.hasValue) {
                    this.hasValue = true;
                    this.last = apply;
                    return poll;
                }
                if (!this.comparer.test(this.last, apply)) {
                    this.last = apply;
                    return poll;
                }
                this.last = apply;
                if (this.sourceMode != 1) {
                    this.upstream.request(1L);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i4) {
            return transitiveBoundaryFusion(i4);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t5) {
            if (!this.done) {
                if (this.sourceMode != 0) {
                    return this.downstream.tryOnNext(t5);
                }
                try {
                    K apply = this.keySelector.apply(t5);
                    if (this.hasValue) {
                        boolean test = this.comparer.test(this.last, apply);
                        this.last = apply;
                        if (test) {
                            return false;
                        }
                    } else {
                        this.hasValue = true;
                        this.last = apply;
                    }
                    this.downstream.onNext(t5);
                    return true;
                } catch (Throwable th) {
                    fail(th);
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class DistinctUntilChangedSubscriber<T, K> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {
        final BiPredicate<? super K, ? super K> comparer;
        boolean hasValue;
        final Function<? super T, K> keySelector;
        K last;

        public DistinctUntilChangedSubscriber(c cVar, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(cVar);
            this.keySelector = function;
            this.comparer = biPredicate;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!tryOnNext(t5)) {
                this.upstream.request(1L);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            while (true) {
                T poll = this.qs.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.keySelector.apply(poll);
                if (!this.hasValue) {
                    this.hasValue = true;
                    this.last = apply;
                    return poll;
                }
                if (!this.comparer.test(this.last, apply)) {
                    this.last = apply;
                    return poll;
                }
                this.last = apply;
                if (this.sourceMode != 1) {
                    this.upstream.request(1L);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i4) {
            return transitiveBoundaryFusion(i4);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t5) {
            if (!this.done) {
                if (this.sourceMode != 0) {
                    this.downstream.onNext(t5);
                    return true;
                }
                try {
                    K apply = this.keySelector.apply(t5);
                    if (this.hasValue) {
                        boolean test = this.comparer.test(this.last, apply);
                        this.last = apply;
                        if (test) {
                            return false;
                        }
                    } else {
                        this.hasValue = true;
                        this.last = apply;
                    }
                    this.downstream.onNext(t5);
                    return true;
                } catch (Throwable th) {
                    fail(th);
                    return true;
                }
            }
            return false;
        }
    }

    public FlowableDistinctUntilChanged(Flowable<T> flowable, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(flowable);
        this.keySelector = function;
        this.comparer = biPredicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber) new DistinctUntilChangedConditionalSubscriber((ConditionalSubscriber) cVar, this.keySelector, this.comparer));
        } else {
            this.source.subscribe((FlowableSubscriber) new DistinctUntilChangedSubscriber(cVar, this.keySelector, this.comparer));
        }
    }
}
