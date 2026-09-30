package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class ObservableTakeLastTimed<T> extends AbstractObservableWithUpstream<T, T> {
    final int bufferSize;
    final long count;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class TakeLastTimedObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
        final Observer<? super T> downstream;
        Throwable error;
        final SpscLinkedArrayQueue<Object> queue;
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;
        Disposable upstream;

        public TakeLastTimedObserver(Observer<? super T> observer, long j5, long j6, TimeUnit timeUnit, Scheduler scheduler, int i4, boolean z2) {
            this.downstream = observer;
            this.count = j5;
            this.time = j6;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.queue = new SpscLinkedArrayQueue<>(i4);
            this.delayError = z2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                if (compareAndSet(false, true)) {
                    this.queue.clear();
                }
            }
        }

        public void drain() {
            Throwable th;
            if (!compareAndSet(false, true)) {
                return;
            }
            Observer<? super T> observer = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z2 = this.delayError;
            long now = this.scheduler.now(this.unit) - this.time;
            while (!this.cancelled) {
                if (!z2 && (th = this.error) != null) {
                    spscLinkedArrayQueue.clear();
                    observer.onError(th);
                    return;
                }
                Object poll = spscLinkedArrayQueue.poll();
                if (poll == null) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        observer.onError(th2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                Object poll2 = spscLinkedArrayQueue.poll();
                if (((Long) poll).longValue() >= now) {
                    observer.onNext(poll2);
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            boolean z2;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            long now = this.scheduler.now(this.unit);
            long j5 = this.time;
            long j6 = this.count;
            if (j6 == Long.MAX_VALUE) {
                z2 = true;
            } else {
                z2 = false;
            }
            spscLinkedArrayQueue.offer(Long.valueOf(now), t5);
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.peek()).longValue() <= now - j5 || (!z2 && (spscLinkedArrayQueue.size() >> 1) > j6)) {
                    spscLinkedArrayQueue.poll();
                    spscLinkedArrayQueue.poll();
                } else {
                    return;
                }
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

    public ObservableTakeLastTimed(ObservableSource<T> observableSource, long j5, long j6, TimeUnit timeUnit, Scheduler scheduler, int i4, boolean z2) {
        super(observableSource);
        this.count = j5;
        this.time = j6;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i4;
        this.delayError = z2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new TakeLastTimedObserver(observer, this.count, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}
