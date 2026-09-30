package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class ObservableSkipLastTimed<T> extends AbstractObservableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class SkipLastTimedObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final Observer<? super T> downstream;
        Throwable error;
        final SpscLinkedArrayQueue<Object> queue;
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;
        Disposable upstream;

        public SkipLastTimedObserver(Observer<? super T> observer, long j5, TimeUnit timeUnit, Scheduler scheduler, int i4, boolean z2) {
            this.downstream = observer;
            this.time = j5;
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
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public void drain() {
            boolean z2;
            if (getAndIncrement() == 0) {
                Observer<? super T> observer = this.downstream;
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                boolean z10 = this.delayError;
                TimeUnit timeUnit = this.unit;
                Scheduler scheduler = this.scheduler;
                long j5 = this.time;
                int i4 = 1;
                while (!this.cancelled) {
                    boolean z11 = this.done;
                    Long l10 = (Long) spscLinkedArrayQueue.peek();
                    if (l10 == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long now = scheduler.now(timeUnit);
                    if (!z2 && l10.longValue() > now - j5) {
                        z2 = true;
                    }
                    if (z11) {
                        if (z10) {
                            if (z2) {
                                Throwable th = this.error;
                                if (th != null) {
                                    observer.onError(th);
                                    return;
                                } else {
                                    observer.onComplete();
                                    return;
                                }
                            }
                        } else {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                this.queue.clear();
                                observer.onError(th2);
                                return;
                            } else if (z2) {
                                observer.onComplete();
                                return;
                            }
                        }
                    }
                    if (z2) {
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else {
                        spscLinkedArrayQueue.poll();
                        observer.onNext(spscLinkedArrayQueue.poll());
                    }
                }
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            this.queue.offer(Long.valueOf(this.scheduler.now(this.unit)), t5);
            drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableSkipLastTimed(ObservableSource<T> observableSource, long j5, TimeUnit timeUnit, Scheduler scheduler, int i4, boolean z2) {
        super(observableSource);
        this.time = j5;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i4;
        this.delayError = z2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new SkipLastTimedObserver(observer, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}
