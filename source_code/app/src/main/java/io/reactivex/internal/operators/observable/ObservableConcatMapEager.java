package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.InnerQueuedObserver;
import io.reactivex.internal.observers.InnerQueuedObserverSupport;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class ObservableConcatMapEager<T, R> extends AbstractObservableWithUpstream<T, R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends ObservableSource<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;

    /* loaded from: classes2.dex */
    public static final class ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable, InnerQueuedObserverSupport<R> {
        private static final long serialVersionUID = 8080567949447303262L;
        int activeCount;
        volatile boolean cancelled;
        InnerQueuedObserver<R> current;
        volatile boolean done;
        final Observer<? super R> downstream;
        final ErrorMode errorMode;
        final Function<? super T, ? extends ObservableSource<? extends R>> mapper;
        final int maxConcurrency;
        final int prefetch;
        SimpleQueue<T> queue;
        int sourceMode;
        Disposable upstream;
        final AtomicThrowable error = new AtomicThrowable();
        final ArrayDeque<InnerQueuedObserver<R>> observers = new ArrayDeque<>();

        public ConcatMapEagerMainObserver(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i4, int i5, ErrorMode errorMode) {
            this.downstream = observer;
            this.mapper = function;
            this.maxConcurrency = i4;
            this.prefetch = i5;
            this.errorMode = errorMode;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            drainAndDispose();
        }

        public void disposeAll() {
            InnerQueuedObserver<R> innerQueuedObserver = this.current;
            if (innerQueuedObserver != null) {
                innerQueuedObserver.dispose();
            }
            while (true) {
                InnerQueuedObserver<R> poll = this.observers.poll();
                if (poll == null) {
                    return;
                } else {
                    poll.dispose();
                }
            }
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void drain() {
            R poll;
            boolean z2;
            boolean z10;
            if (getAndIncrement() == 0) {
                SimpleQueue<T> simpleQueue = this.queue;
                ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.observers;
                Observer<? super R> observer = this.downstream;
                ErrorMode errorMode = this.errorMode;
                int i4 = 1;
                while (true) {
                    int i5 = this.activeCount;
                    while (i5 != this.maxConcurrency) {
                        if (this.cancelled) {
                            simpleQueue.clear();
                            disposeAll();
                            return;
                        }
                        if (errorMode == ErrorMode.IMMEDIATE && this.error.get() != null) {
                            simpleQueue.clear();
                            disposeAll();
                            observer.onError(this.error.terminate());
                            return;
                        }
                        try {
                            T poll2 = simpleQueue.poll();
                            if (poll2 == null) {
                                break;
                            }
                            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.mapper.apply(poll2), "The mapper returned a null ObservableSource");
                            InnerQueuedObserver<R> innerQueuedObserver = new InnerQueuedObserver<>(this, this.prefetch);
                            arrayDeque.offer(innerQueuedObserver);
                            observableSource.subscribe(innerQueuedObserver);
                            i5++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.upstream.dispose();
                            simpleQueue.clear();
                            disposeAll();
                            this.error.addThrowable(th);
                            observer.onError(this.error.terminate());
                            return;
                        }
                    }
                    this.activeCount = i5;
                    if (this.cancelled) {
                        simpleQueue.clear();
                        disposeAll();
                        return;
                    }
                    if (errorMode == ErrorMode.IMMEDIATE && this.error.get() != null) {
                        simpleQueue.clear();
                        disposeAll();
                        observer.onError(this.error.terminate());
                        return;
                    }
                    InnerQueuedObserver<R> innerQueuedObserver2 = this.current;
                    if (innerQueuedObserver2 == null) {
                        if (errorMode == ErrorMode.BOUNDARY && this.error.get() != null) {
                            simpleQueue.clear();
                            disposeAll();
                            observer.onError(this.error.terminate());
                            return;
                        }
                        boolean z11 = this.done;
                        InnerQueuedObserver<R> poll3 = arrayDeque.poll();
                        if (poll3 == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z11 && z10) {
                            if (this.error.get() != null) {
                                simpleQueue.clear();
                                disposeAll();
                                observer.onError(this.error.terminate());
                                return;
                            }
                            observer.onComplete();
                            return;
                        }
                        if (!z10) {
                            this.current = poll3;
                        }
                        innerQueuedObserver2 = poll3;
                    }
                    if (innerQueuedObserver2 != null) {
                        SimpleQueue<R> queue = innerQueuedObserver2.queue();
                        while (!this.cancelled) {
                            boolean isDone = innerQueuedObserver2.isDone();
                            if (errorMode == ErrorMode.IMMEDIATE && this.error.get() != null) {
                                simpleQueue.clear();
                                disposeAll();
                                observer.onError(this.error.terminate());
                                return;
                            }
                            try {
                                poll = queue.poll();
                                if (poll == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.error.addThrowable(th2);
                                this.current = null;
                                this.activeCount--;
                            }
                            if (isDone && z2) {
                                this.current = null;
                                this.activeCount--;
                            } else if (!z2) {
                                observer.onNext(poll);
                            }
                        }
                        simpleQueue.clear();
                        disposeAll();
                        return;
                    }
                    i4 = addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                }
            }
        }

        public void drainAndDispose() {
            if (getAndIncrement() != 0) {
                return;
            }
            do {
                this.queue.clear();
                disposeAll();
            } while (decrementAndGet() != 0);
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void innerComplete(InnerQueuedObserver<R> innerQueuedObserver) {
            innerQueuedObserver.setDone();
            drain();
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void innerError(InnerQueuedObserver<R> innerQueuedObserver, Throwable th) {
            if (this.error.addThrowable(th)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    this.upstream.dispose();
                }
                innerQueuedObserver.setDone();
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void innerNext(InnerQueuedObserver<R> innerQueuedObserver, R r4) {
            innerQueuedObserver.queue().offer(r4);
            drain();
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
            if (this.error.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            if (this.sourceMode == 0) {
                this.queue.offer(t5);
            }
            drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueDisposable;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueDisposable;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapEager(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, ErrorMode errorMode, int i4, int i5) {
        super(observableSource);
        this.mapper = function;
        this.errorMode = errorMode;
        this.maxConcurrency = i4;
        this.prefetch = i5;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new ConcatMapEagerMainObserver(observer, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }
}
