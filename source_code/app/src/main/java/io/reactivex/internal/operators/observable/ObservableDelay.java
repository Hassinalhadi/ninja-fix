package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ObservableDelay<T> extends AbstractObservableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class DelayObserver<T> implements Observer<T>, Disposable {
        final long delay;
        final boolean delayError;
        final Observer<? super T> downstream;
        final TimeUnit unit;
        Disposable upstream;

        /* renamed from: w, reason: collision with root package name */
        final Scheduler.Worker f12834w;

        /* loaded from: classes2.dex */
        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelayObserver.this.downstream.onComplete();
                } finally {
                    DelayObserver.this.f12834w.dispose();
                }
            }
        }

        /* loaded from: classes2.dex */
        public final class OnError implements Runnable {
            private final Throwable throwable;

            public OnError(Throwable th) {
                this.throwable = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelayObserver.this.downstream.onError(this.throwable);
                } finally {
                    DelayObserver.this.f12834w.dispose();
                }
            }
        }

        /* loaded from: classes2.dex */
        public final class OnNext implements Runnable {

            /* renamed from: t, reason: collision with root package name */
            private final T f12835t;

            public OnNext(T t5) {
                this.f12835t = t5;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelayObserver.this.downstream.onNext(this.f12835t);
            }
        }

        public DelayObserver(Observer<? super T> observer, long j5, TimeUnit timeUnit, Scheduler.Worker worker, boolean z2) {
            this.downstream = observer;
            this.delay = j5;
            this.unit = timeUnit;
            this.f12834w = worker;
            this.delayError = z2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.f12834w.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f12834w.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f12834w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            long j5;
            Scheduler.Worker worker = this.f12834w;
            OnError onError = new OnError(th);
            if (this.delayError) {
                j5 = this.delay;
            } else {
                j5 = 0;
            }
            worker.schedule(onError, j5, this.unit);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            this.f12834w.schedule(new OnNext(t5), this.delay, this.unit);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableDelay(ObservableSource<T> observableSource, long j5, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        super(observableSource);
        this.delay = j5;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        Observer<? super T> serializedObserver;
        if (this.delayError) {
            serializedObserver = observer;
        } else {
            serializedObserver = new SerializedObserver(observer);
        }
        this.source.subscribe(new DelayObserver(serializedObserver, this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }
}
