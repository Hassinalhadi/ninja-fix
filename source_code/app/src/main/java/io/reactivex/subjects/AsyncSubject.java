package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class AsyncSubject<T> extends Subject<T> {
    static final AsyncDisposable[] EMPTY = new AsyncDisposable[0];
    static final AsyncDisposable[] TERMINATED = new AsyncDisposable[0];
    Throwable error;
    final AtomicReference<AsyncDisposable<T>[]> subscribers = new AtomicReference<>(EMPTY);
    T value;

    /* loaded from: classes2.dex */
    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncSubject<T> parent;

        public AsyncDisposable(Observer<? super T> observer, AsyncSubject<T> asyncSubject) {
            super(observer);
            this.parent = asyncSubject;
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public void dispose() {
            if (tryDispose()) {
                this.parent.remove(this);
            }
        }

        public void onComplete() {
            if (!isDisposed()) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (isDisposed()) {
                RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> AsyncSubject<T> create() {
        return new AsyncSubject<>();
    }

    public boolean add(AsyncDisposable<T> asyncDisposable) {
        while (true) {
            AsyncDisposable<T>[] asyncDisposableArr = this.subscribers.get();
            if (asyncDisposableArr == TERMINATED) {
                return false;
            }
            int length = asyncDisposableArr.length;
            AsyncDisposable<T>[] asyncDisposableArr2 = new AsyncDisposable[length + 1];
            System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr2, 0, length);
            asyncDisposableArr2[length] = asyncDisposable;
            AtomicReference<AsyncDisposable<T>[]> atomicReference = this.subscribers;
            while (!atomicReference.compareAndSet(asyncDisposableArr, asyncDisposableArr2)) {
                if (atomicReference.get() != asyncDisposableArr) {
                    break;
                }
            }
            return true;
        }
    }

    @Override // io.reactivex.subjects.Subject
    public Throwable getThrowable() {
        if (this.subscribers.get() == TERMINATED) {
            return this.error;
        }
        return null;
    }

    @Nullable
    public T getValue() {
        if (this.subscribers.get() == TERMINATED) {
            return this.value;
        }
        return null;
    }

    @Deprecated
    public Object[] getValues() {
        T value = getValue();
        return value != null ? new Object[]{value} : new Object[0];
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        if (this.subscribers.get() == TERMINATED && this.error == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        if (this.subscribers.get().length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        if (this.subscribers.get() == TERMINATED && this.error != null) {
            return true;
        }
        return false;
    }

    public boolean hasValue() {
        if (this.subscribers.get() == TERMINATED && this.value != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        AsyncDisposable<T>[] asyncDisposableArr = this.subscribers.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = TERMINATED;
        if (asyncDisposableArr != asyncDisposableArr2) {
            T t5 = this.value;
            AsyncDisposable<T>[] andSet = this.subscribers.getAndSet(asyncDisposableArr2);
            int i4 = 0;
            if (t5 == null) {
                int length = andSet.length;
                while (i4 < length) {
                    andSet[i4].onComplete();
                    i4++;
                }
                return;
            }
            int length2 = andSet.length;
            while (i4 < length2) {
                andSet[i4].complete(t5);
                i4++;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AsyncDisposable<T>[] asyncDisposableArr = this.subscribers.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = TERMINATED;
        if (asyncDisposableArr == asyncDisposableArr2) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.value = null;
        this.error = th;
        for (AsyncDisposable<T> asyncDisposable : this.subscribers.getAndSet(asyncDisposableArr2)) {
            asyncDisposable.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t5) {
        ObjectHelper.requireNonNull(t5, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.subscribers.get() == TERMINATED) {
            return;
        }
        this.value = t5;
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.subscribers.get() == TERMINATED) {
            disposable.dispose();
        }
    }

    public void remove(AsyncDisposable<T> asyncDisposable) {
        AsyncDisposable<T>[] asyncDisposableArr;
        while (true) {
            AsyncDisposable<T>[] asyncDisposableArr2 = this.subscribers.get();
            int length = asyncDisposableArr2.length;
            if (length != 0) {
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        if (asyncDisposableArr2[i4] == asyncDisposable) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 < 0) {
                    return;
                }
                if (length == 1) {
                    asyncDisposableArr = EMPTY;
                } else {
                    AsyncDisposable<T>[] asyncDisposableArr3 = new AsyncDisposable[length - 1];
                    System.arraycopy(asyncDisposableArr2, 0, asyncDisposableArr3, 0, i4);
                    System.arraycopy(asyncDisposableArr2, i4 + 1, asyncDisposableArr3, i4, (length - i4) - 1);
                    asyncDisposableArr = asyncDisposableArr3;
                }
                AtomicReference<AsyncDisposable<T>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(asyncDisposableArr2, asyncDisposableArr)) {
                    if (atomicReference.get() != asyncDisposableArr2) {
                        break;
                    }
                }
                return;
            }
            return;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        AsyncDisposable<T> asyncDisposable = new AsyncDisposable<>(observer, this);
        observer.onSubscribe(asyncDisposable);
        if (add(asyncDisposable)) {
            if (asyncDisposable.isDisposed()) {
                remove(asyncDisposable);
                return;
            }
            return;
        }
        Throwable th = this.error;
        if (th != null) {
            observer.onError(th);
            return;
        }
        T t5 = this.value;
        if (t5 != null) {
            asyncDisposable.complete(t5);
        } else {
            asyncDisposable.onComplete();
        }
    }

    @Deprecated
    public T[] getValues(T[] tArr) {
        T value = getValue();
        if (value == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 1);
        }
        tArr[0] = value;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }
}
