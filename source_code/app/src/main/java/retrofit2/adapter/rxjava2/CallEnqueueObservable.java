package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import vg.aq;
import vg.d;
import vg.g;

/* loaded from: classes2.dex */
final class CallEnqueueObservable<T> extends Observable<aq<T>> {
    private final d<T> originalCall;

    /* loaded from: classes2.dex */
    public static final class CallCallback<T> implements Disposable, g {
        private final d<?> call;
        private volatile boolean disposed;
        private final Observer<? super aq<T>> observer;
        boolean terminated = false;

        public CallCallback(d<?> dVar, Observer<? super aq<T>> observer) {
            this.call = dVar;
            this.observer = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // vg.g
        public void onFailure(d<T> dVar, Throwable th) {
            if (!dVar.isCanceled()) {
                try {
                    this.observer.onError(th);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(new CompositeException(th, th2));
                }
            }
        }

        @Override // vg.g
        public void onResponse(d<T> dVar, aq<T> aqVar) {
            if (!this.disposed) {
                try {
                    this.observer.onNext(aqVar);
                    if (!this.disposed) {
                        this.terminated = true;
                        this.observer.onComplete();
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    if (this.terminated) {
                        RxJavaPlugins.onError(th);
                        return;
                    }
                    if (!this.disposed) {
                        try {
                            this.observer.onError(th);
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            RxJavaPlugins.onError(new CompositeException(th, th2));
                        }
                    }
                }
            }
        }
    }

    public CallEnqueueObservable(d<T> dVar) {
        this.originalCall = dVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super aq<T>> observer) {
        d clone = this.originalCall.clone();
        CallCallback callCallback = new CallCallback(clone, observer);
        observer.onSubscribe(callCallback);
        if (!callCallback.isDisposed()) {
            clone.o(callCallback);
        }
    }
}
