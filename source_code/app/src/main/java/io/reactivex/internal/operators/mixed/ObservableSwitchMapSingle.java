package io.reactivex.internal.operators.mixed;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
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
public final class ObservableSwitchMapSingle<T, R> extends Observable<R> {
    final boolean delayErrors;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final Observable<T> source;

    /* loaded from: classes2.dex */
    public static final class SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        static final SwitchMapSingleObserver<Object> INNER_DISPOSED = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Observer<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        Disposable upstream;

        /* loaded from: classes2.dex */
        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapSingleMainObserver<?, R> parent;

            public SwitchMapSingleObserver(SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver) {
                this.parent = switchMapSingleMainObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.parent.innerError(this, th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r4) {
                this.item = r4;
                this.parent.drain();
            }
        }

        public SwitchMapSingleMainObserver(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z2) {
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
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
            SwitchMapSingleObserver<Object> switchMapSingleObserver = INNER_DISPOSED;
            SwitchMapSingleObserver<Object> switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 != null && switchMapSingleObserver2 != switchMapSingleObserver) {
                switchMapSingleObserver2.dispose();
            }
        }

        public void drain() {
            boolean z2;
            if (getAndIncrement() == 0) {
                Observer<? super R> observer = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
                int i4 = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() != null && !this.delayErrors) {
                        observer.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z10 = this.done;
                    SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                    if (switchMapSingleObserver == null) {
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
                    if (!z2 && switchMapSingleObserver.item != null) {
                        while (!atomicReference.compareAndSet(switchMapSingleObserver, null) && atomicReference.get() == switchMapSingleObserver) {
                        }
                        observer.onNext(switchMapSingleObserver.item);
                    } else {
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    }
                }
            }
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
        public void innerError(SwitchMapSingleObserver<R> switchMapSingleObserver, Throwable th) {
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
            while (true) {
                if (atomicReference.compareAndSet(switchMapSingleObserver, null)) {
                    if (this.errors.addThrowable(th)) {
                        if (!this.delayErrors) {
                            this.upstream.dispose();
                            disposeInner();
                        }
                        drain();
                        return;
                    }
                } else if (atomicReference.get() != switchMapSingleObserver) {
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
            SwitchMapSingleObserver<R> switchMapSingleObserver = this.inner.get();
            if (switchMapSingleObserver != null) {
                switchMapSingleObserver.dispose();
            }
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.mapper.apply(t5), "The mapper returned a null SingleSource");
                SwitchMapSingleObserver<R> switchMapSingleObserver2 = new SwitchMapSingleObserver<>(this);
                while (true) {
                    SwitchMapSingleObserver<R> switchMapSingleObserver3 = this.inner.get();
                    if (switchMapSingleObserver3 == INNER_DISPOSED) {
                        return;
                    }
                    AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
                    while (!atomicReference.compareAndSet(switchMapSingleObserver3, switchMapSingleObserver2)) {
                        if (atomicReference.get() != switchMapSingleObserver3) {
                            break;
                        }
                    }
                    singleSource.subscribe(switchMapSingleObserver2);
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

    public ObservableSwitchMapSingle(Observable<T> observable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z2) {
        this.source = observable;
        this.mapper = function;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        if (!ScalarXMapZHelper.tryAsSingle(this.source, this.mapper, observer)) {
            this.source.subscribe(new SwitchMapSingleMainObserver(observer, this.mapper, this.delayErrors));
        }
    }
}
