package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class ObservableElementAt<T> extends AbstractObservableWithUpstream<T, T> {
    final T defaultValue;
    final boolean errorOnFewer;
    final long index;

    /* loaded from: classes2.dex */
    public static final class ElementAtObserver<T> implements Observer<T>, Disposable {
        long count;
        final T defaultValue;
        boolean done;
        final Observer<? super T> downstream;
        final boolean errorOnFewer;
        final long index;
        Disposable upstream;

        public ElementAtObserver(Observer<? super T> observer, long j5, T t5, boolean z2) {
            this.downstream = observer;
            this.index = j5;
            this.defaultValue = t5;
            this.errorOnFewer = z2;
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
                T t5 = this.defaultValue;
                if (t5 == null && this.errorOnFewer) {
                    this.downstream.onError(new NoSuchElementException());
                    return;
                }
                if (t5 != null) {
                    this.downstream.onNext(t5);
                }
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            long j5 = this.count;
            if (j5 == this.index) {
                this.done = true;
                this.upstream.dispose();
                this.downstream.onNext(t5);
                this.downstream.onComplete();
                return;
            }
            this.count = j5 + 1;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableElementAt(ObservableSource<T> observableSource, long j5, T t5, boolean z2) {
        super(observableSource);
        this.index = j5;
        this.defaultValue = t5;
        this.errorOnFewer = z2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new ElementAtObserver(observer, this.index, this.defaultValue, this.errorOnFewer));
    }
}
