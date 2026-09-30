package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import qg.b;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableLastSingle<T> extends Single<T> {
    final T defaultItem;
    final b source;

    /* loaded from: classes2.dex */
    public static final class LastSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        final T defaultItem;
        final SingleObserver<? super T> downstream;
        T item;
        d upstream;

        public LastSubscriber(SingleObserver<? super T> singleObserver, T t5) {
            this.downstream = singleObserver;
            this.defaultItem = t5;
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
            this.upstream = SubscriptionHelper.CANCELLED;
            T t5 = this.item;
            if (t5 != null) {
                this.item = null;
                this.downstream.onSuccess(t5);
                return;
            }
            T t10 = this.defaultItem;
            if (t10 != null) {
                this.downstream.onSuccess(t10);
            } else {
                this.downstream.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.upstream = SubscriptionHelper.CANCELLED;
            this.item = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            this.item = t5;
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

    public FlowableLastSingle(b bVar, T t5) {
        this.source = bVar;
        this.defaultItem = t5;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new LastSubscriber(singleObserver, this.defaultItem));
    }
}
