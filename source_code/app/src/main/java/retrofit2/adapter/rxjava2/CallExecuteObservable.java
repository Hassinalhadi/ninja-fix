package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import vg.aq;
import vg.d;

/* loaded from: classes2.dex */
final class CallExecuteObservable<T> extends Observable<aq<T>> {
    private final d<T> originalCall;

    /* loaded from: classes2.dex */
    public static final class CallDisposable implements Disposable {
        private final d<?> call;
        private volatile boolean disposed;

        public CallDisposable(d<?> dVar) {
            this.call = dVar;
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
    }

    public CallExecuteObservable(d<T> dVar) {
        this.originalCall = dVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super aq<T>> observer) {
        boolean z2;
        d clone = this.originalCall.clone();
        CallDisposable callDisposable = new CallDisposable(clone);
        observer.onSubscribe(callDisposable);
        if (!callDisposable.isDisposed()) {
            try {
                aq execute = clone.execute();
                if (!callDisposable.isDisposed()) {
                    observer.onNext(execute);
                }
                if (!callDisposable.isDisposed()) {
                    try {
                        observer.onComplete();
                    } catch (Throwable th) {
                        th = th;
                        z2 = true;
                        Exceptions.throwIfFatal(th);
                        if (z2) {
                            RxJavaPlugins.onError(th);
                            return;
                        }
                        if (!callDisposable.isDisposed()) {
                            try {
                                observer.onError(th);
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                RxJavaPlugins.onError(new CompositeException(th, th2));
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z2 = false;
            }
        }
    }
}
