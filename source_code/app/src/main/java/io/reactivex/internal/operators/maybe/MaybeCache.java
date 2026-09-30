package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class MaybeCache<T> extends Maybe<T> implements MaybeObserver<T> {
    static final CacheDisposable[] EMPTY = new CacheDisposable[0];
    static final CacheDisposable[] TERMINATED = new CacheDisposable[0];
    Throwable error;
    final AtomicReference<CacheDisposable<T>[]> observers = new AtomicReference<>(EMPTY);
    final AtomicReference<MaybeSource<T>> source;
    T value;

    /* loaded from: classes2.dex */
    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements Disposable {
        private static final long serialVersionUID = -5791853038359966195L;
        final MaybeObserver<? super T> downstream;

        public CacheDisposable(MaybeObserver<? super T> maybeObserver, MaybeCache<T> maybeCache) {
            super(maybeCache);
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            MaybeCache<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.remove(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }
    }

    public MaybeCache(MaybeSource<T> maybeSource) {
        this.source = new AtomicReference<>(maybeSource);
    }

    public boolean add(CacheDisposable<T> cacheDisposable) {
        while (true) {
            CacheDisposable<T>[] cacheDisposableArr = this.observers.get();
            if (cacheDisposableArr == TERMINATED) {
                return false;
            }
            int length = cacheDisposableArr.length;
            CacheDisposable<T>[] cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
            AtomicReference<CacheDisposable<T>[]> atomicReference = this.observers;
            while (!atomicReference.compareAndSet(cacheDisposableArr, cacheDisposableArr2)) {
                if (atomicReference.get() != cacheDisposableArr) {
                    break;
                }
            }
            return true;
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        for (CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(Throwable th) {
        this.error = th;
        for (CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onSubscribe(Disposable disposable) {
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t5) {
        this.value = t5;
        for (CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onSuccess(t5);
            }
        }
    }

    public void remove(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        while (true) {
            CacheDisposable<T>[] cacheDisposableArr2 = this.observers.get();
            int length = cacheDisposableArr2.length;
            if (length != 0) {
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        if (cacheDisposableArr2[i4] == cacheDisposable) {
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
                    cacheDisposableArr = EMPTY;
                } else {
                    CacheDisposable<T>[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                    System.arraycopy(cacheDisposableArr2, 0, cacheDisposableArr3, 0, i4);
                    System.arraycopy(cacheDisposableArr2, i4 + 1, cacheDisposableArr3, i4, (length - i4) - 1);
                    cacheDisposableArr = cacheDisposableArr3;
                }
                AtomicReference<CacheDisposable<T>[]> atomicReference = this.observers;
                while (!atomicReference.compareAndSet(cacheDisposableArr2, cacheDisposableArr)) {
                    if (atomicReference.get() != cacheDisposableArr2) {
                        break;
                    }
                }
                return;
            }
            return;
        }
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(maybeObserver, this);
        maybeObserver.onSubscribe(cacheDisposable);
        if (add(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                remove(cacheDisposable);
                return;
            }
            MaybeSource<T> andSet = this.source.getAndSet(null);
            if (andSet != null) {
                andSet.subscribe(this);
                return;
            }
            return;
        }
        if (!cacheDisposable.isDisposed()) {
            Throwable th = this.error;
            if (th != null) {
                maybeObserver.onError(th);
                return;
            }
            T t5 = this.value;
            if (t5 != null) {
                maybeObserver.onSuccess(t5);
            } else {
                maybeObserver.onComplete();
            }
        }
    }
}
