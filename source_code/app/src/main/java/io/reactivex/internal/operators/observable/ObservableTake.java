package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes2.dex */
public final class ObservableTake<T> extends AbstractObservableWithUpstream<T, T> {
    final long limit;

    /* loaded from: classes2.dex */
    public static final class TakeObserver<T> implements Observer<T>, Disposable {
        boolean done;
        final Observer<? super T> downstream;
        long remaining;
        Disposable upstream;

        public TakeObserver(Observer<? super T> observer, long j5) {
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
            if (!this.done) {
                this.done = true;
                this.upstream.dispose();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.upstream.dispose();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            boolean z2;
            if (!this.done) {
                long j5 = this.remaining;
                long j6 = j5 - 1;
                this.remaining = j6;
                if (j5 > 0) {
                    if (j6 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.downstream.onNext(t5);
                    if (z2) {
                        onComplete();
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (this.remaining == 0) {
                    this.done = true;
                    disposable.dispose();
                    EmptyDisposable.complete(this.downstream);
                    return;
                }
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableTake(ObservableSource<T> observableSource, long j5) {
        super(observableSource);
        this.limit = j5;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new TakeObserver(observer, this.limit));
    }
}
