package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class MaybeConcatArray<T> extends Flowable<T> {
    final MaybeSource<? extends T>[] sources;

    /* loaded from: classes2.dex */
    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, d {
        private static final long serialVersionUID = 3520831347801429610L;
        final c downstream;
        int index;
        long produced;
        final MaybeSource<? extends T>[] sources;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable disposables = new SequentialDisposable();
        final AtomicReference<Object> current = new AtomicReference<>(NotificationLite.COMPLETE);

        public ConcatMaybeObserver(c cVar, MaybeSource<? extends T>[] maybeSourceArr) {
            this.downstream = cVar;
            this.sources = maybeSourceArr;
        }

        @Override // qg.d
        public void cancel() {
            this.disposables.dispose();
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                AtomicReference<Object> atomicReference = this.current;
                c cVar = this.downstream;
                SequentialDisposable sequentialDisposable = this.disposables;
                while (!sequentialDisposable.isDisposed()) {
                    Object obj = atomicReference.get();
                    if (obj != null) {
                        if (obj != NotificationLite.COMPLETE) {
                            long j5 = this.produced;
                            if (j5 != this.requested.get()) {
                                this.produced = j5 + 1;
                                atomicReference.lazySet(null);
                                cVar.onNext(obj);
                            }
                        } else {
                            atomicReference.lazySet(null);
                        }
                        if (!sequentialDisposable.isDisposed()) {
                            int i4 = this.index;
                            MaybeSource<? extends T>[] maybeSourceArr = this.sources;
                            if (i4 == maybeSourceArr.length) {
                                cVar.onComplete();
                                return;
                            } else {
                                this.index = i4 + 1;
                                maybeSourceArr[i4].subscribe(this);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.current.lazySet(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            this.disposables.replace(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t5) {
            this.current.lazySet(t5);
            drain();
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                drain();
            }
        }
    }

    public MaybeConcatArray(MaybeSource<? extends T>[] maybeSourceArr) {
        this.sources = maybeSourceArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(cVar, this.sources);
        cVar.onSubscribe(concatMaybeObserver);
        concatMaybeObserver.drain();
    }
}
