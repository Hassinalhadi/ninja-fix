package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class ObservableRepeat<T> extends AbstractObservableWithUpstream<T, T> {
    final long count;

    /* loaded from: classes2.dex */
    public static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final Observer<? super T> downstream;
        long remaining;

        /* renamed from: sd, reason: collision with root package name */
        final SequentialDisposable f12840sd;
        final ObservableSource<? extends T> source;

        public RepeatObserver(Observer<? super T> observer, long j5, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.downstream = observer;
            this.f12840sd = sequentialDisposable;
            this.source = observableSource;
            this.remaining = j5;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            long j5 = this.remaining;
            if (j5 != Long.MAX_VALUE) {
                this.remaining = j5 - 1;
            }
            if (j5 != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
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
            this.f12840sd.replace(disposable);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i4 = 1;
                while (!this.f12840sd.isDisposed()) {
                    this.source.subscribe(this);
                    i4 = addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                }
            }
        }
    }

    public ObservableRepeat(Observable<T> observable, long j5) {
        super(observable);
        this.count = j5;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        long j5 = this.count;
        long j6 = Long.MAX_VALUE;
        if (j5 != Long.MAX_VALUE) {
            j6 = j5 - 1;
        }
        new RepeatObserver(observer, j6, sequentialDisposable, this.source).subscribeNext();
    }
}
