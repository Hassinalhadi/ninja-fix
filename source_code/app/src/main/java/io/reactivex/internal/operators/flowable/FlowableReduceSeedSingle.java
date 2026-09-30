package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import qg.b;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableReduceSeedSingle<T, R> extends Single<R> {
    final BiFunction<R, ? super T, R> reducer;
    final R seed;
    final b source;

    /* loaded from: classes2.dex */
    public static final class ReduceSeedObserver<T, R> implements FlowableSubscriber<T>, Disposable {
        final SingleObserver<? super R> downstream;
        final BiFunction<R, ? super T, R> reducer;
        d upstream;
        R value;

        public ReduceSeedObserver(SingleObserver<? super R> singleObserver, BiFunction<R, ? super T, R> biFunction, R r4) {
            this.downstream = singleObserver;
            this.value = r4;
            this.reducer = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.upstream == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            R r4 = this.value;
            if (r4 != null) {
                this.value = null;
                this.upstream = SubscriptionHelper.CANCELLED;
                this.downstream.onSuccess(r4);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.value != null) {
                this.value = null;
                this.upstream = SubscriptionHelper.CANCELLED;
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            R r4 = this.value;
            if (r4 != null) {
                try {
                    this.value = (R) ObjectHelper.requireNonNull(this.reducer.apply(r4, t5), "The reducer returned a null value");
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
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableReduceSeedSingle(b bVar, R r4, BiFunction<R, ? super T, R> biFunction) {
        this.source = bVar;
        this.seed = r4;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.source.subscribe(new ReduceSeedObserver(singleObserver, this.reducer, this.seed));
    }
}
