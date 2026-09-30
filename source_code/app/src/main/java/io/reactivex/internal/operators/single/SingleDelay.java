package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class SingleDelay<T> extends Single<T> {
    final boolean delayError;
    final Scheduler scheduler;
    final SingleSource<? extends T> source;
    final long time;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public final class Delay implements SingleObserver<T> {
        final SingleObserver<? super T> downstream;

        /* renamed from: sd, reason: collision with root package name */
        private final SequentialDisposable f12850sd;

        /* loaded from: classes2.dex */
        public final class OnError implements Runnable {
            private final Throwable e;

            public OnError(Throwable th) {
                this.e = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                Delay.this.downstream.onError(this.e);
            }
        }

        /* loaded from: classes2.dex */
        public final class OnSuccess implements Runnable {
            private final T value;

            public OnSuccess(T t5) {
                this.value = t5;
            }

            @Override // java.lang.Runnable
            public void run() {
                Delay.this.downstream.onSuccess(this.value);
            }
        }

        public Delay(SequentialDisposable sequentialDisposable, SingleObserver<? super T> singleObserver) {
            this.f12850sd = sequentialDisposable;
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            long j5;
            SequentialDisposable sequentialDisposable = this.f12850sd;
            Scheduler scheduler = SingleDelay.this.scheduler;
            OnError onError = new OnError(th);
            SingleDelay singleDelay = SingleDelay.this;
            if (singleDelay.delayError) {
                j5 = singleDelay.time;
            } else {
                j5 = 0;
            }
            sequentialDisposable.replace(scheduler.scheduleDirect(onError, j5, singleDelay.unit));
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f12850sd.replace(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t5) {
            SequentialDisposable sequentialDisposable = this.f12850sd;
            Scheduler scheduler = SingleDelay.this.scheduler;
            OnSuccess onSuccess = new OnSuccess(t5);
            SingleDelay singleDelay = SingleDelay.this;
            sequentialDisposable.replace(scheduler.scheduleDirect(onSuccess, singleDelay.time, singleDelay.unit));
        }
    }

    public SingleDelay(SingleSource<? extends T> singleSource, long j5, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        this.source = singleSource;
        this.time = j5;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z2;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.source.subscribe(new Delay(sequentialDisposable, singleObserver));
    }
}
