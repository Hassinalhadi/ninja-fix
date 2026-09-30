package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class PublishProcessor<T> extends FlowableProcessor<T> {
    Throwable error;
    final AtomicReference<PublishSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
    static final PublishSubscription[] TERMINATED = new PublishSubscription[0];
    static final PublishSubscription[] EMPTY = new PublishSubscription[0];

    /* loaded from: classes2.dex */
    public static final class PublishSubscription<T> extends AtomicLong implements d {
        private static final long serialVersionUID = 3562861878281475070L;
        final c downstream;
        final PublishProcessor<T> parent;

        public PublishSubscription(c cVar, PublishProcessor<T> publishProcessor) {
            this.downstream = cVar;
            this.parent = publishProcessor;
        }

        @Override // qg.d
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        public boolean isCancelled() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        public boolean isFull() {
            if (get() == 0) {
                return true;
            }
            return false;
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        public void onNext(T t5) {
            long j5 = get();
            if (j5 == Long.MIN_VALUE) {
                return;
            }
            if (j5 != 0) {
                this.downstream.onNext(t5);
                BackpressureHelper.producedCancel(this, 1L);
            } else {
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.addCancel(this, j5);
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> PublishProcessor<T> create() {
        return new PublishProcessor<>();
    }

    public boolean add(PublishSubscription<T> publishSubscription) {
        while (true) {
            PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
            if (publishSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = publishSubscriptionArr.length;
            PublishSubscription<T>[] publishSubscriptionArr2 = new PublishSubscription[length + 1];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
            AtomicReference<PublishSubscription<T>[]> atomicReference = this.subscribers;
            while (!atomicReference.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2)) {
                if (atomicReference.get() != publishSubscriptionArr) {
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

    public boolean offer(T t5) {
        if (t5 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
        for (PublishSubscription<T> publishSubscription : publishSubscriptionArr) {
            if (publishSubscription.isFull()) {
                return false;
            }
        }
        for (PublishSubscription<T> publishSubscription2 : publishSubscriptionArr) {
            publishSubscription2.onNext(t5);
        }
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onComplete() {
        PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = TERMINATED;
        if (publishSubscriptionArr != publishSubscriptionArr2) {
            for (PublishSubscription<T> publishSubscription : this.subscribers.getAndSet(publishSubscriptionArr2)) {
                publishSubscription.onComplete();
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishSubscription<T>[] publishSubscriptionArr = this.subscribers.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = TERMINATED;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        for (PublishSubscription<T> publishSubscription : this.subscribers.getAndSet(publishSubscriptionArr2)) {
            publishSubscription.onError(th);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onNext(T t5) {
        ObjectHelper.requireNonNull(t5, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishSubscription<T> publishSubscription : this.subscribers.get()) {
            publishSubscription.onNext(t5);
        }
    }

    @Override // qg.c
    public void onSubscribe(d dVar) {
        if (this.subscribers.get() == TERMINATED) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    public void remove(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        while (true) {
            PublishSubscription<T>[] publishSubscriptionArr2 = this.subscribers.get();
            if (publishSubscriptionArr2 != TERMINATED && publishSubscriptionArr2 != EMPTY) {
                int length = publishSubscriptionArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        if (publishSubscriptionArr2[i4] == publishSubscription) {
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
                        publishSubscriptionArr = EMPTY;
                    } else {
                        PublishSubscription<T>[] publishSubscriptionArr3 = new PublishSubscription[length - 1];
                        System.arraycopy(publishSubscriptionArr2, 0, publishSubscriptionArr3, 0, i4);
                        System.arraycopy(publishSubscriptionArr2, i4 + 1, publishSubscriptionArr3, i4, (length - i4) - 1);
                        publishSubscriptionArr = publishSubscriptionArr3;
                    }
                    AtomicReference<PublishSubscription<T>[]> atomicReference = this.subscribers;
                    while (!atomicReference.compareAndSet(publishSubscriptionArr2, publishSubscriptionArr)) {
                        if (atomicReference.get() != publishSubscriptionArr2) {
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

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        PublishSubscription<T> publishSubscription = new PublishSubscription<>(cVar, this);
        cVar.onSubscribe(publishSubscription);
        if (add(publishSubscription)) {
            if (publishSubscription.isCancelled()) {
                remove(publishSubscription);
            }
        } else {
            Throwable th = this.error;
            if (th != null) {
                cVar.onError(th);
            } else {
                cVar.onComplete();
            }
        }
    }
}
