package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes2.dex */
public final class ObservableObserveOn<T> extends AbstractObservableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Scheduler scheduler;

    /* loaded from: classes2.dex */
    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final Observer<? super T> downstream;
        Throwable error;
        boolean outputFused;
        SimpleQueue<T> queue;
        int sourceMode;
        Disposable upstream;
        final Scheduler.Worker worker;

        public ObserveOnObserver(Observer<? super T> observer, Scheduler.Worker worker, boolean z2, int i4) {
            this.downstream = observer;
            this.worker = worker;
            this.delayError = z2;
            this.bufferSize = i4;
        }

        public boolean checkTerminated(boolean z2, boolean z10, Observer<? super T> observer) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            }
            if (z2) {
                Throwable th = this.error;
                if (this.delayError) {
                    if (z10) {
                        this.disposed = true;
                        if (th != null) {
                            observer.onError(th);
                        } else {
                            observer.onComplete();
                        }
                        this.worker.dispose();
                        return true;
                    }
                    return false;
                }
                if (th != null) {
                    this.disposed = true;
                    this.queue.clear();
                    observer.onError(th);
                    this.worker.dispose();
                    return true;
                }
                if (z10) {
                    this.disposed = true;
                    observer.onComplete();
                    this.worker.dispose();
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.upstream.dispose();
                this.worker.dispose();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public void drainFused() {
            int i4 = 1;
            while (!this.disposed) {
                boolean z2 = this.done;
                Throwable th = this.error;
                if (!this.delayError && z2 && th != null) {
                    this.disposed = true;
                    this.downstream.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                this.downstream.onNext(null);
                if (z2) {
                    this.disposed = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        this.downstream.onError(th2);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        
            if (r3 != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drainNormal() {
            boolean z2;
            SimpleQueue<T> simpleQueue = this.queue;
            Observer<? super T> observer = this.downstream;
            int i4 = 1;
            while (!checkTerminated(this.done, simpleQueue.isEmpty(), observer)) {
                while (true) {
                    boolean z10 = this.done;
                    try {
                        T poll = simpleQueue.poll();
                        if (poll == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!checkTerminated(z10, z2, observer)) {
                            if (z2) {
                                break;
                            } else {
                                observer.onNext(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.disposed = true;
                        this.upstream.dispose();
                        simpleQueue.clear();
                        observer.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 2) {
                this.queue.offer(t5);
            }
            schedule();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueDisposable;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        schedule();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueDisposable;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i4) {
            if ((i4 & 2) != 0) {
                this.outputFused = true;
                return 2;
            }
            return 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        public void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.schedule(this);
            }
        }
    }

    public ObservableObserveOn(ObservableSource<T> observableSource, Scheduler scheduler, boolean z2, int i4) {
        super(observableSource);
        this.scheduler = scheduler;
        this.delayError = z2;
        this.bufferSize = i4;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        Scheduler scheduler = this.scheduler;
        if (scheduler instanceof TrampolineScheduler) {
            this.source.subscribe(observer);
        } else {
            this.source.subscribe(new ObserveOnObserver(observer, scheduler.createWorker(), this.delayError, this.bufferSize));
        }
    }
}
