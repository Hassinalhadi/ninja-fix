package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class ParallelFilter<T> extends ParallelFlowable<T> {
    final Predicate<? super T> predicate;
    final ParallelFlowable<T> source;

    /* loaded from: classes2.dex */
    public static abstract class BaseFilterSubscriber<T> implements ConditionalSubscriber<T>, d {
        boolean done;
        final Predicate<? super T> predicate;
        d upstream;

        public BaseFilterSubscriber(Predicate<? super T> predicate) {
            this.predicate = predicate;
        }

        @Override // qg.d
        public final void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public abstract /* synthetic */ void onComplete();

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public abstract /* synthetic */ void onError(Throwable th);

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public final void onNext(T t5) {
            if (!tryOnNext(t5) && !this.done) {
                this.upstream.request(1L);
            }
        }

        @Override // qg.d
        public final void request(long j5) {
            this.upstream.request(j5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ParallelFilterConditionalSubscriber<T> extends BaseFilterSubscriber<T> {
        final ConditionalSubscriber<? super T> downstream;

        public ParallelFilterConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate) {
            super(predicate);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilter.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilter.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t5) {
            if (!this.done) {
                try {
                    if (this.predicate.test(t5)) {
                        return this.downstream.tryOnNext(t5);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ParallelFilterSubscriber<T> extends BaseFilterSubscriber<T> {
        final c downstream;

        public ParallelFilterSubscriber(c cVar, Predicate<? super T> predicate) {
            super(predicate);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilter.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilter.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t5) {
            if (!this.done) {
                try {
                    if (this.predicate.test(t5)) {
                        this.downstream.onNext(t5);
                        return true;
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                }
            }
            return false;
        }
    }

    public ParallelFilter(ParallelFlowable<T> parallelFlowable, Predicate<? super T> predicate) {
        this.source = parallelFlowable;
        this.predicate = predicate;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c[] cVarArr) {
        if (!validate(cVarArr)) {
            return;
        }
        int length = cVarArr.length;
        c[] cVarArr2 = new c[length];
        for (int i4 = 0; i4 < length; i4++) {
            c cVar = cVarArr[i4];
            if (cVar instanceof ConditionalSubscriber) {
                cVarArr2[i4] = new ParallelFilterConditionalSubscriber((ConditionalSubscriber) cVar, this.predicate);
            } else {
                cVarArr2[i4] = new ParallelFilterSubscriber(cVar, this.predicate);
            }
        }
        this.source.subscribe(cVarArr2);
    }
}
