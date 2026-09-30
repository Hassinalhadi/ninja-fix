package io.reactivex.internal.operators.mixed;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ObservableSwitchMapMaybe<T, R> extends Observable<R> {
    final boolean delayErrors;
    final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
    final Observable<T> source;

    /* loaded from: classes2.dex */
    public static final class SwitchMapMaybeMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        static final SwitchMapMaybeObserver<Object> INNER_DISPOSED = new SwitchMapMaybeObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Observer<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapMaybeObserver<R>> inner = new AtomicReference<>();
        final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        Disposable upstream;

        /* loaded from: classes2.dex */
        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapMaybeMainObserver<?, R> parent;

            public SwitchMapMaybeObserver(SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver) {
                this.parent = switchMapMaybeMainObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                this.parent.innerError(this, th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r4) {
                this.item = r4;
                this.parent.drain();
            }
        }

        public SwitchMapMaybeMainObserver(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            disposeInner();
        }

        public void disposeInner() {
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver = INNER_DISPOSED;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver2 = (SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 != null && switchMapMaybeObserver2 != switchMapMaybeObserver) {
                switchMapMaybeObserver2.dispose();
            }
        }

        public void drain() {
            boolean z2;
            if (getAndIncrement() == 0) {
                Observer<? super R> observer = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
                int i4 = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() != null && !this.delayErrors) {
                        observer.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z10 = this.done;
                    SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
                    if (switchMapMaybeObserver == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z10 && z2) {
                        Throwable terminate = atomicThrowable.terminate();
                        if (terminate != null) {
                            observer.onError(terminate);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                    if (!z2 && switchMapMaybeObserver.item != null) {
                        while (!atomicReference.compareAndSet(switchMapMaybeObserver, null) && atomicReference.get() == switchMapMaybeObserver) {
                        }
                        observer.onNext(switchMapMaybeObserver.item);
                    } else {
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    }
                }
            }
        }

        public void innerComplete(SwitchMapMaybeObserver<R> switchMapMaybeObserver) {
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            while (!atomicReference.compareAndSet(switchMapMaybeObserver, null)) {
                if (atomicReference.get() != switchMapMaybeObserver) {
                    return;
                }
            }
            drain();
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
        
            io.reactivex.plugins.RxJavaPlugins.onError(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void innerError(SwitchMapMaybeObserver<R> switchMapMaybeObserver, Throwable th) {
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            while (true) {
                if (atomicReference.compareAndSet(switchMapMaybeObserver, null)) {
                    if (this.errors.addThrowable(th)) {
                        if (!this.delayErrors) {
                            this.upstream.dispose();
                            disposeInner();
                        }
                        drain();
                        return;
                    }
                } else if (atomicReference.get() != switchMapMaybeObserver) {
                    break;
                }
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
            if (this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    disposeInner();
                }
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            SwitchMapMaybeObserver<R> switchMapMaybeObserver = this.inner.get();
            if (switchMapMaybeObserver != null) {
                switchMapMaybeObserver.dispose();
            }
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.mapper.apply(t5), "The mapper returned a null MaybeSource");
                SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = new SwitchMapMaybeObserver<>(this);
                while (true) {
                    SwitchMapMaybeObserver<R> switchMapMaybeObserver3 = this.inner.get();
                    if (switchMapMaybeObserver3 == INNER_DISPOSED) {
                        return;
                    }
                    AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
                    while (!atomicReference.compareAndSet(switchMapMaybeObserver3, switchMapMaybeObserver2)) {
                        if (atomicReference.get() != switchMapMaybeObserver3) {
                            break;
                        }
                    }
                    maybeSource.subscribe(switchMapMaybeObserver2);
                    return;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.dispose();
                this.inner.getAndSet(INNER_DISPOSED);
                onError(th);
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

    public ObservableSwitchMapMaybe(Observable<T> observable, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2) {
        this.source = observable;
        this.mapper = function;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        if (!ScalarXMapZHelper.tryAsMaybe(this.source, this.mapper, observer)) {
            this.source.subscribe(new SwitchMapMaybeMainObserver(observer, this.mapper, this.delayErrors));
        }
    }
}
