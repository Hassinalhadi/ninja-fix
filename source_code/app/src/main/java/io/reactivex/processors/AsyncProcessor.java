package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class AsyncProcessor<T> extends FlowableProcessor<T> {
    static final AsyncSubscription[] EMPTY = new AsyncSubscription[0];
    static final AsyncSubscription[] TERMINATED = new AsyncSubscription[0];
    Throwable error;
    final AtomicReference<AsyncSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
    T value;

    /* loaded from: classes2.dex */
    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncProcessor<T> parent;

        public AsyncSubscription(c cVar, AsyncProcessor<T> asyncProcessor) {
            super(cVar);
            this.parent = asyncProcessor;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void cancel() {
            if (tryCancel()) {
                this.parent.remove(this);
            }
        }

        public void onComplete() {
            if (!isCancelled()) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (isCancelled()) {
                RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> AsyncProcessor<T> create() {
        return new AsyncProcessor<>();
    }

    public boolean add(AsyncSubscription<T> asyncSubscription) {
        while (true) {
            AsyncSubscription<T>[] asyncSubscriptionArr = this.subscribers.get();
            if (asyncSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = asyncSubscriptionArr.length;
            AsyncSubscription<T>[] asyncSubscriptionArr2 = new AsyncSubscription[length + 1];
            System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr2, 0, length);
            asyncSubscriptionArr2[length] = asyncSubscription;
            AtomicReference<AsyncSubscription<T>[]> atomicReference = this.subscribers;
            while (!atomicReference.compareAndSet(asyncSubscriptionArr, asyncSubscriptionArr2)) {
                if (atomicReference.get() != asyncSubscriptionArr) {
                    break;
                }
            }
            return true;
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
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

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        if (this.subscribers.get() == TERMINATED && this.error == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        if (this.subscribers.get().length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
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

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onComplete() {
        AsyncSubscription<T>[] asyncSubscriptionArr = this.subscribers.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = TERMINATED;
        if (asyncSubscriptionArr != asyncSubscriptionArr2) {
            T t5 = this.value;
            AsyncSubscription<T>[] andSet = this.subscribers.getAndSet(asyncSubscriptionArr2);
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

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AsyncSubscription<T>[] asyncSubscriptionArr = this.subscribers.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = TERMINATED;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.value = null;
        this.error = th;
        for (AsyncSubscription<T> asyncSubscription : this.subscribers.getAndSet(asyncSubscriptionArr2)) {
            asyncSubscription.onError(th);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onNext(T t5) {
        ObjectHelper.requireNonNull(t5, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.subscribers.get() == TERMINATED) {
            return;
        }
        this.value = t5;
    }

    @Override // qg.c
    public void onSubscribe(d dVar) {
        if (this.subscribers.get() == TERMINATED) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    public void remove(AsyncSubscription<T> asyncSubscription) {
        AsyncSubscription<T>[] asyncSubscriptionArr;
        while (true) {
            AsyncSubscription<T>[] asyncSubscriptionArr2 = this.subscribers.get();
            int length = asyncSubscriptionArr2.length;
            if (length != 0) {
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        if (asyncSubscriptionArr2[i4] == asyncSubscription) {
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
                    asyncSubscriptionArr = EMPTY;
                } else {
                    AsyncSubscription<T>[] asyncSubscriptionArr3 = new AsyncSubscription[length - 1];
                    System.arraycopy(asyncSubscriptionArr2, 0, asyncSubscriptionArr3, 0, i4);
                    System.arraycopy(asyncSubscriptionArr2, i4 + 1, asyncSubscriptionArr3, i4, (length - i4) - 1);
                    asyncSubscriptionArr = asyncSubscriptionArr3;
                }
                AtomicReference<AsyncSubscription<T>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(asyncSubscriptionArr2, asyncSubscriptionArr)) {
                    if (atomicReference.get() != asyncSubscriptionArr2) {
                        break;
                    }
                }
                return;
            }
            return;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        AsyncSubscription<T> asyncSubscription = new AsyncSubscription<>(cVar, this);
        cVar.onSubscribe(asyncSubscription);
        if (add(asyncSubscription)) {
            if (asyncSubscription.isCancelled()) {
                remove(asyncSubscription);
                return;
            }
            return;
        }
        Throwable th = this.error;
        if (th != null) {
            cVar.onError(th);
            return;
        }
        T t5 = this.value;
        if (t5 != null) {
            asyncSubscription.complete(t5);
        } else {
            asyncSubscription.onComplete();
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
