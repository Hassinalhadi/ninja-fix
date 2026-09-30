package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ObservableZip<T, R> extends Observable<R> {
    final int bufferSize;
    final boolean delayError;
    final ObservableSource<? extends T>[] sources;
    final Iterable<? extends ObservableSource<? extends T>> sourcesIterable;
    final Function<? super Object[], ? extends R> zipper;

    /* loaded from: classes2.dex */
    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError;
        final Observer<? super R> downstream;
        final ZipObserver<T, R>[] observers;
        final T[] row;
        final Function<? super Object[], ? extends R> zipper;

        public ZipCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i4, boolean z2) {
            this.downstream = observer;
            this.zipper = function;
            this.observers = new ZipObserver[i4];
            this.row = (T[]) new Object[i4];
            this.delayError = z2;
        }

        public void cancel() {
            clear();
            cancelSources();
        }

        public void cancelSources() {
            for (ZipObserver<T, R> zipObserver : this.observers) {
                zipObserver.dispose();
            }
        }

        public boolean checkTerminated(boolean z2, boolean z10, Observer<? super R> observer, boolean z11, ZipObserver<?, ?> zipObserver) {
            if (this.cancelled) {
                cancel();
                return true;
            }
            if (z2) {
                if (z11) {
                    if (z10) {
                        Throwable th = zipObserver.error;
                        this.cancelled = true;
                        cancel();
                        if (th != null) {
                            observer.onError(th);
                        } else {
                            observer.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = zipObserver.error;
                if (th2 != null) {
                    this.cancelled = true;
                    cancel();
                    observer.onError(th2);
                    return true;
                }
                if (z10) {
                    this.cancelled = true;
                    cancel();
                    observer.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        public void clear() {
            for (ZipObserver<T, R> zipObserver : this.observers) {
                zipObserver.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelSources();
                if (getAndIncrement() == 0) {
                    clear();
                }
            }
        }

        public void drain() {
            Throwable th;
            boolean z2;
            if (getAndIncrement() == 0) {
                ZipObserver<T, R>[] zipObserverArr = this.observers;
                Observer<? super R> observer = this.downstream;
                T[] tArr = this.row;
                boolean z10 = this.delayError;
                int i4 = 1;
                while (true) {
                    int i5 = 0;
                    int i10 = 0;
                    for (ZipObserver<T, R> zipObserver : zipObserverArr) {
                        if (tArr[i10] == null) {
                            boolean z11 = zipObserver.done;
                            T poll = zipObserver.queue.poll();
                            if (poll == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!checkTerminated(z11, z2, observer, z10, zipObserver)) {
                                if (!z2) {
                                    tArr[i10] = poll;
                                } else {
                                    i5++;
                                }
                            } else {
                                return;
                            }
                        } else if (zipObserver.done && !z10 && (th = zipObserver.error) != null) {
                            this.cancelled = true;
                            cancel();
                            observer.onError(th);
                            return;
                        }
                        i10++;
                    }
                    if (i5 != 0) {
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else {
                        try {
                            observer.onNext((Object) ObjectHelper.requireNonNull(this.zipper.apply(tArr.clone()), "The zipper returned a null value"));
                            Arrays.fill(tArr, (Object) null);
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            cancel();
                            observer.onError(th2);
                            return;
                        }
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void subscribe(ObservableSource<? extends T>[] observableSourceArr, int i4) {
            ZipObserver<T, R>[] zipObserverArr = this.observers;
            int length = zipObserverArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                zipObserverArr[i5] = new ZipObserver<>(this, i4);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i10 = 0; i10 < length && !this.cancelled; i10++) {
                observableSourceArr[i10].subscribe(zipObserverArr[i10]);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class ZipObserver<T, R> implements Observer<T> {
        volatile boolean done;
        Throwable error;
        final ZipCoordinator<T, R> parent;
        final SpscLinkedArrayQueue<T> queue;
        final AtomicReference<Disposable> upstream = new AtomicReference<>();

        public ZipObserver(ZipCoordinator<T, R> zipCoordinator, int i4) {
            this.parent = zipCoordinator;
            this.queue = new SpscLinkedArrayQueue<>(i4);
        }

        public void dispose() {
            DisposableHelper.dispose(this.upstream);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            this.queue.offer(t5);
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }
    }

    public ObservableZip(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i4, boolean z2) {
        this.sources = observableSourceArr;
        this.sourcesIterable = iterable;
        this.zipper = function;
        this.bufferSize = i4;
        this.delayError = z2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.sources;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            length = 0;
            for (ObservableSource<? extends T> observableSource : this.sourcesIterable) {
                if (length == observableSourceArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                    observableSourceArr = observableSourceArr2;
                }
                observableSourceArr[length] = observableSource;
                length++;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(observer);
        } else {
            new ZipCoordinator(observer, this.zipper, length, this.delayError).subscribe(observableSourceArr, this.bufferSize);
        }
    }
}
