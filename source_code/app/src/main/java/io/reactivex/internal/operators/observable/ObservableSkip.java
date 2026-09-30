package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes2.dex */
public final class ObservableSkip<T> extends AbstractObservableWithUpstream<T, T> {

    /* renamed from: n, reason: collision with root package name */
    final long f12843n;

    /* loaded from: classes2.dex */
    public static final class SkipObserver<T> implements Observer<T>, Disposable {
        final Observer<? super T> downstream;
        long remaining;
        Disposable upstream;

        public SkipObserver(Observer<? super T> observer, long j5) {
            this.downstream = observer;
            this.remaining = j5;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
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
            long j5 = this.remaining;
            if (j5 != 0) {
                this.remaining = j5 - 1;
            } else {
                this.downstream.onNext(t5);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableSkip(ObservableSource<T> observableSource, long j5) {
        super(observableSource);
        this.f12843n = j5;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new SkipObserver(observer, this.f12843n));
    }
}
