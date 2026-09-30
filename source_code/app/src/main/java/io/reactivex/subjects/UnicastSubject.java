package io.reactivex.subjects;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class UnicastSubject<T> extends Subject<T> {
    final boolean delayError;
    volatile boolean disposed;
    volatile boolean done;
    final AtomicReference<Observer<? super T>> downstream;
    boolean enableOperatorFusion;
    Throwable error;
    final AtomicReference<Runnable> onTerminate;
    final AtomicBoolean once;
    final SpscLinkedArrayQueue<T> queue;
    final BasicIntQueueDisposable<T> wip;

    /* loaded from: classes2.dex */
    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        public UnicastQueueDisposable() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastSubject.this.queue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!UnicastSubject.this.disposed) {
                UnicastSubject.this.disposed = true;
                UnicastSubject.this.doTerminate();
                UnicastSubject.this.downstream.lazySet(null);
                if (UnicastSubject.this.wip.getAndIncrement() == 0) {
                    UnicastSubject.this.downstream.lazySet(null);
                    UnicastSubject unicastSubject = UnicastSubject.this;
                    if (!unicastSubject.enableOperatorFusion) {
                        unicastSubject.queue.clear();
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return UnicastSubject.this.disposed;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastSubject.this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return UnicastSubject.this.queue.poll();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i4) {
            if ((i4 & 2) != 0) {
                UnicastSubject.this.enableOperatorFusion = true;
                return 2;
            }
            return 0;
        }
    }

    public UnicastSubject(int i4, boolean z2) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i4, "capacityHint"));
        this.onTerminate = new AtomicReference<>();
        this.delayError = z2;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueDisposable();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create() {
        return new UnicastSubject<>(Observable.bufferSize(), true);
    }

    public void doTerminate() {
        Runnable runnable = this.onTerminate.get();
        if (runnable != null) {
            AtomicReference<Runnable> atomicReference = this.onTerminate;
            while (!atomicReference.compareAndSet(runnable, null)) {
                if (atomicReference.get() != runnable) {
                    return;
                }
            }
            runnable.run();
        }
    }

    public void drain() {
        if (this.wip.getAndIncrement() == 0) {
            Observer<? super T> observer = this.downstream.get();
            int i4 = 1;
            while (observer == null) {
                i4 = this.wip.addAndGet(-i4);
                if (i4 == 0) {
                    return;
                } else {
                    observer = this.downstream.get();
                }
            }
            if (this.enableOperatorFusion) {
                drainFused(observer);
            } else {
                drainNormal(observer);
            }
        }
    }

    public void drainFused(Observer<? super T> observer) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z2 = this.delayError;
        int i4 = 1;
        while (!this.disposed) {
            boolean z10 = this.done;
            if (z2 || !z10 || !failedFast(spscLinkedArrayQueue, observer)) {
                observer.onNext(null);
                if (z10) {
                    errorOrComplete(observer);
                    return;
                } else {
                    i4 = this.wip.addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.downstream.lazySet(null);
    }

    public void drainNormal(Observer<? super T> observer) {
        boolean z2;
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z10 = this.delayError;
        boolean z11 = true;
        int i4 = 1;
        while (!this.disposed) {
            boolean z12 = this.done;
            T poll = this.queue.poll();
            if (poll == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z12) {
                if (!z10 && z11) {
                    if (!failedFast(spscLinkedArrayQueue, observer)) {
                        z11 = false;
                    } else {
                        return;
                    }
                }
                if (z2) {
                    errorOrComplete(observer);
                    return;
                }
            }
            if (z2) {
                i4 = this.wip.addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
            } else {
                observer.onNext(poll);
            }
        }
        this.downstream.lazySet(null);
        spscLinkedArrayQueue.clear();
    }

    public void errorOrComplete(Observer<? super T> observer) {
        this.downstream.lazySet(null);
        Throwable th = this.error;
        if (th != null) {
            observer.onError(th);
        } else {
            observer.onComplete();
        }
    }

    public boolean failedFast(SimpleQueue<T> simpleQueue, Observer<? super T> observer) {
        Throwable th = this.error;
        if (th != null) {
            this.downstream.lazySet(null);
            simpleQueue.clear();
            observer.onError(th);
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        if (this.done && this.error == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        if (this.downstream.get() != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        if (this.done && this.error != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (!this.done && !this.disposed) {
            this.done = true;
            doTerminate();
            drain();
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.done && !this.disposed) {
            this.error = th;
            this.done = true;
            doTerminate();
            drain();
            return;
        }
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t5) {
        ObjectHelper.requireNonNull(t5, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.done && !this.disposed) {
            this.queue.offer(t5);
            drain();
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (!this.done && !this.disposed) {
            return;
        }
        disposable.dispose();
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        if (!this.once.get() && this.once.compareAndSet(false, true)) {
            observer.onSubscribe(this.wip);
            this.downstream.lazySet(observer);
            if (this.disposed) {
                this.downstream.lazySet(null);
                return;
            } else {
                drain();
                return;
            }
        }
        EmptyDisposable.error(new IllegalStateException("Only a single observer allowed."), observer);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i4) {
        return new UnicastSubject<>(i4, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i4, Runnable runnable) {
        return new UnicastSubject<>(i4, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i4, Runnable runnable, boolean z2) {
        return new UnicastSubject<>(i4, runnable, z2);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(boolean z2) {
        return new UnicastSubject<>(Observable.bufferSize(), z2);
    }

    public UnicastSubject(int i4, Runnable runnable) {
        this(i4, runnable, true);
    }

    public UnicastSubject(int i4, Runnable runnable, boolean z2) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i4, "capacityHint"));
        this.onTerminate = new AtomicReference<>(ObjectHelper.requireNonNull(runnable, "onTerminate"));
        this.delayError = z2;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueDisposable();
    }
}
