package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ObservableCache<T> extends AbstractObservableWithUpstream<T, T> implements Observer<T> {
    static final CacheDisposable[] EMPTY = new CacheDisposable[0];
    static final CacheDisposable[] TERMINATED = new CacheDisposable[0];
    final int capacityHint;
    volatile boolean done;
    Throwable error;
    final Node<T> head;
    final AtomicReference<CacheDisposable<T>[]> observers;
    final AtomicBoolean once;
    volatile long size;
    Node<T> tail;
    int tailOffset;

    /* loaded from: classes2.dex */
    public static final class CacheDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final Observer<? super T> downstream;
        long index;
        Node<T> node;
        int offset;
        final ObservableCache<T> parent;

        public CacheDisposable(Observer<? super T> observer, ObservableCache<T> observableCache) {
            this.downstream = observer;
            this.parent = observableCache;
            this.node = observableCache.head;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.parent.remove(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Node<T> {
        volatile Node<T> next;
        final T[] values;

        public Node(int i4) {
            this.values = (T[]) new Object[i4];
        }
    }

    public ObservableCache(Observable<T> observable, int i4) {
        super(observable);
        this.capacityHint = i4;
        this.once = new AtomicBoolean();
        Node<T> node = new Node<>(i4);
        this.head = node;
        this.tail = node;
        this.observers = new AtomicReference<>(EMPTY);
    }

    public void add(CacheDisposable<T> cacheDisposable) {
        while (true) {
            CacheDisposable<T>[] cacheDisposableArr = this.observers.get();
            if (cacheDisposableArr == TERMINATED) {
                return;
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
            return;
        }
    }

    public long cachedEventCount() {
        return this.size;
    }

    public boolean hasObservers() {
        if (this.observers.get().length != 0) {
            return true;
        }
        return false;
    }

    public boolean isConnected() {
        return this.once.get();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        this.done = true;
        for (CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            replay(cacheDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        for (CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            replay(cacheDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t5) {
        int i4 = this.tailOffset;
        if (i4 == this.capacityHint) {
            Node<T> node = new Node<>(i4);
            node.values[0] = t5;
            this.tailOffset = 1;
            this.tail.next = node;
            this.tail = node;
        } else {
            this.tail.values[i4] = t5;
            this.tailOffset = i4 + 1;
        }
        this.size++;
        for (CacheDisposable<T> cacheDisposable : this.observers.get()) {
            replay(cacheDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
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

    public void replay(CacheDisposable<T> cacheDisposable) {
        boolean z2;
        if (cacheDisposable.getAndIncrement() == 0) {
            long j5 = cacheDisposable.index;
            int i4 = cacheDisposable.offset;
            Node<T> node = cacheDisposable.node;
            Observer<? super T> observer = cacheDisposable.downstream;
            int i5 = this.capacityHint;
            int i10 = 1;
            while (!cacheDisposable.disposed) {
                boolean z10 = this.done;
                if (this.size == j5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z10 && z2) {
                    cacheDisposable.node = null;
                    Throwable th = this.error;
                    if (th != null) {
                        observer.onError(th);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (!z2) {
                    if (i4 == i5) {
                        node = node.next;
                        i4 = 0;
                    }
                    observer.onNext(node.values[i4]);
                    i4++;
                    j5++;
                } else {
                    cacheDisposable.index = j5;
                    cacheDisposable.offset = i4;
                    cacheDisposable.node = node;
                    i10 = cacheDisposable.addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                }
            }
            cacheDisposable.node = null;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(observer, this);
        observer.onSubscribe(cacheDisposable);
        add(cacheDisposable);
        if (!this.once.get() && this.once.compareAndSet(false, true)) {
            this.source.subscribe(this);
        } else {
            replay(cacheDisposable);
        }
    }
}
