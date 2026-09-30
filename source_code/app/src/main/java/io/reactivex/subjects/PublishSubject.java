package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class PublishSubject<T> extends Subject<T> {
    Throwable error;
    final AtomicReference<PublishDisposable<T>[]> subscribers = new AtomicReference<>(EMPTY);
    static final PublishDisposable[] TERMINATED = new PublishDisposable[0];
    static final PublishDisposable[] EMPTY = new PublishDisposable[0];

    /* loaded from: classes2.dex */
    public static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 3562861878281475070L;
        final Observer<? super T> downstream;
        final PublishSubject<T> parent;

        public PublishDisposable(Observer<? super T> observer, PublishSubject<T> publishSubject) {
            this.downstream = observer;
            this.parent = publishSubject;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.remove(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }

        public void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        public void onNext(T t5) {
            if (!get()) {
                this.downstream.onNext(t5);
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> PublishSubject<T> create() {
        return new PublishSubject<>();
    }

    public boolean add(PublishDisposable<T> publishDisposable) {
        while (true) {
            PublishDisposable<T>[] publishDisposableArr = this.subscribers.get();
            if (publishDisposableArr == TERMINATED) {
                return false;
            }
            int length = publishDisposableArr.length;
            PublishDisposable<T>[] publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
            AtomicReference<PublishDisposable<T>[]> atomicReference = this.subscribers;
            while (!atomicReference.compareAndSet(publishDisposableArr, publishDisposableArr2)) {
                if (atomicReference.get() != publishDisposableArr) {
                    break;
                }
            }
            return true;
        }
    }

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        if (this.subscribers.get() == TERMINATED) {
            return this.error;
        }
        return null;
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

    @Override // io.reactivex.Observer
    public void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.subscribers.get();
        PublishDisposable<T>[] publishDisposableArr2 = TERMINATED;
        if (publishDisposableArr != publishDisposableArr2) {
            for (PublishDisposable<T> publishDisposable : this.subscribers.getAndSet(publishDisposableArr2)) {
                publishDisposable.onComplete();
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishDisposable<T>[] publishDisposableArr = this.subscribers.get();
        PublishDisposable<T>[] publishDisposableArr2 = TERMINATED;
        if (publishDisposableArr == publishDisposableArr2) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        for (PublishDisposable<T> publishDisposable : this.subscribers.getAndSet(publishDisposableArr2)) {
            publishDisposable.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t5) {
        ObjectHelper.requireNonNull(t5, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable<T> publishDisposable : this.subscribers.get()) {
            publishDisposable.onNext(t5);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.subscribers.get() == TERMINATED) {
            disposable.dispose();
        }
    }

    public void remove(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        while (true) {
            PublishDisposable<T>[] publishDisposableArr2 = this.subscribers.get();
            if (publishDisposableArr2 != TERMINATED && publishDisposableArr2 != EMPTY) {
                int length = publishDisposableArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        if (publishDisposableArr2[i4] == publishDisposable) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 >= 0) {
                    if (length == 1) {
                        publishDisposableArr = EMPTY;
                    } else {
                        PublishDisposable<T>[] publishDisposableArr3 = new PublishDisposable[length - 1];
                        System.arraycopy(publishDisposableArr2, 0, publishDisposableArr3, 0, i4);
                        System.arraycopy(publishDisposableArr2, i4 + 1, publishDisposableArr3, i4, (length - i4) - 1);
                        publishDisposableArr = publishDisposableArr3;
                    }
                    AtomicReference<PublishDisposable<T>[]> atomicReference = this.subscribers;
                    while (!atomicReference.compareAndSet(publishDisposableArr2, publishDisposableArr)) {
                        if (atomicReference.get() != publishDisposableArr2) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(observer, this);
        observer.onSubscribe(publishDisposable);
        if (add(publishDisposable)) {
            if (publishDisposable.isDisposed()) {
                remove(publishDisposable);
            }
        } else {
            Throwable th = this.error;
            if (th != null) {
                observer.onError(th);
            } else {
                observer.onComplete();
            }
        }
    }
}
