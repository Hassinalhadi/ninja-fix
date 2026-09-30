package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableFromObservable<T> extends Flowable<T> {
    private final Observable<T> upstream;

    /* loaded from: classes2.dex */
    public static final class SubscriberObserver<T> implements Observer<T>, d {
        final c downstream;
        Disposable upstream;

        public SubscriberObserver(c cVar) {
            this.downstream = cVar;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }

        @Override // qg.d
        public void request(long j5) {
        }
    }

    public FlowableFromObservable(Observable<T> observable) {
        this.upstream = observable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.upstream.subscribe(new SubscriberObserver(cVar));
    }
}
