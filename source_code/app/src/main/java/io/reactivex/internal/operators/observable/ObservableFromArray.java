package io.reactivex.internal.operators.observable;

import av.q;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* loaded from: classes2.dex */
public final class ObservableFromArray<T> extends Observable<T> {
    final T[] array;

    /* loaded from: classes2.dex */
    public static final class FromArrayDisposable<T> extends BasicQueueDisposable<T> {
        final T[] array;
        volatile boolean disposed;
        final Observer<? super T> downstream;
        boolean fusionMode;
        int index;

        public FromArrayDisposable(Observer<? super T> observer, T[] tArr) {
            this.downstream = observer;
            this.array = tArr;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.index = this.array.length;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            if (this.index == this.array.length) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            int i4 = this.index;
            T[] tArr = this.array;
            if (i4 != tArr.length) {
                this.index = i4 + 1;
                return (T) ObjectHelper.requireNonNull(tArr[i4], "The array element is null");
            }
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i4) {
            if ((i4 & 1) != 0) {
                this.fusionMode = true;
                return 1;
            }
            return 0;
        }

        public void run() {
            T[] tArr = this.array;
            int length = tArr.length;
            for (int i4 = 0; i4 < length && !isDisposed(); i4++) {
                T t5 = tArr[i4];
                if (t5 == null) {
                    this.downstream.onError(new NullPointerException(q.delta(i4, "The element at index ", " is null")));
                    return;
                }
                this.downstream.onNext(t5);
            }
            if (!isDisposed()) {
                this.downstream.onComplete();
            }
        }
    }

    public ObservableFromArray(T[] tArr) {
        this.array = tArr;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        FromArrayDisposable fromArrayDisposable = new FromArrayDisposable(observer, this.array);
        observer.onSubscribe(fromArrayDisposable);
        if (fromArrayDisposable.fusionMode) {
            return;
        }
        fromArrayDisposable.run();
    }
}
