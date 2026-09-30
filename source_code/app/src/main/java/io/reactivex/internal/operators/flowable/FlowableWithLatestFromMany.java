package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableWithLatestFromMany<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final Function<? super Object[], R> combiner;

    @Nullable
    final b[] otherArray;

    @Nullable
    final Iterable<? extends b> otherIterable;

    /* loaded from: classes2.dex */
    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // io.reactivex.functions.Function
        public R apply(T t5) throws Exception {
            return (R) ObjectHelper.requireNonNull(FlowableWithLatestFromMany.this.combiner.apply(new Object[]{t5}), "The combiner returned a null value");
        }
    }

    /* loaded from: classes2.dex */
    public static final class WithLatestFromSubscriber<T, R> extends AtomicInteger implements ConditionalSubscriber<T>, d {
        private static final long serialVersionUID = 1577321883966341961L;
        final Function<? super Object[], R> combiner;
        volatile boolean done;
        final c downstream;
        final AtomicThrowable error;
        final AtomicLong requested;
        final WithLatestInnerSubscriber[] subscribers;
        final AtomicReference<d> upstream;
        final AtomicReferenceArray<Object> values;

        public WithLatestFromSubscriber(c cVar, Function<? super Object[], R> function, int i4) {
            this.downstream = cVar;
            this.combiner = function;
            WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = new WithLatestInnerSubscriber[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                withLatestInnerSubscriberArr[i5] = new WithLatestInnerSubscriber(this, i5);
            }
            this.subscribers = withLatestInnerSubscriberArr;
            this.values = new AtomicReferenceArray<>(i4);
            this.upstream = new AtomicReference<>();
            this.requested = new AtomicLong();
            this.error = new AtomicThrowable();
        }

        @Override // qg.d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            for (WithLatestInnerSubscriber withLatestInnerSubscriber : this.subscribers) {
                withLatestInnerSubscriber.dispose();
            }
        }

        public void cancelAllBut(int i4) {
            WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = this.subscribers;
            for (int i5 = 0; i5 < withLatestInnerSubscriberArr.length; i5++) {
                if (i5 != i4) {
                    withLatestInnerSubscriberArr[i5].dispose();
                }
            }
        }

        public void innerComplete(int i4, boolean z2) {
            if (!z2) {
                this.done = true;
                SubscriptionHelper.cancel(this.upstream);
                cancelAllBut(i4);
                HalfSerializer.onComplete(this.downstream, this, this.error);
            }
        }

        public void innerError(int i4, Throwable th) {
            this.done = true;
            SubscriptionHelper.cancel(this.upstream);
            cancelAllBut(i4);
            HalfSerializer.onError(this.downstream, th, this, this.error);
        }

        public void innerNext(int i4, Object obj) {
            this.values.set(i4, obj);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                cancelAllBut(-1);
                HalfSerializer.onComplete(this.downstream, this, this.error);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            cancelAllBut(-1);
            HalfSerializer.onError(this.downstream, th, this, this.error);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!tryOnNext(t5) && !this.done) {
                this.upstream.get().request(1L);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        @Override // qg.d
        public void request(long j5) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j5);
        }

        public void subscribe(b[] bVarArr, int i4) {
            WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = this.subscribers;
            AtomicReference<d> atomicReference = this.upstream;
            for (int i5 = 0; i5 < i4 && atomicReference.get() != SubscriptionHelper.CANCELLED; i5++) {
                bVarArr[i5].subscribe(withLatestInnerSubscriberArr[i5]);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t5) {
            if (!this.done) {
                AtomicReferenceArray<Object> atomicReferenceArray = this.values;
                int length = atomicReferenceArray.length();
                Object[] objArr = new Object[length + 1];
                objArr[0] = t5;
                int i4 = 0;
                while (i4 < length) {
                    Object obj = atomicReferenceArray.get(i4);
                    if (obj != null) {
                        i4++;
                        objArr[i4] = obj;
                    }
                }
                try {
                    HalfSerializer.onNext(this.downstream, ObjectHelper.requireNonNull(this.combiner.apply(objArr), "The combiner returned a null value"), this, this.error);
                    return true;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return false;
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class WithLatestInnerSubscriber extends AtomicReference<d> implements FlowableSubscriber<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean hasValue;
        final int index;
        final WithLatestFromSubscriber<?, ?> parent;

        public WithLatestInnerSubscriber(WithLatestFromSubscriber<?, ?> withLatestFromSubscriber, int i4) {
            this.parent = withLatestFromSubscriber;
            this.index = i4;
        }

        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.parent.innerComplete(this.index, this.hasValue);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(Object obj) {
            if (!this.hasValue) {
                this.hasValue = true;
            }
            this.parent.innerNext(this.index, obj);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
        }
    }

    public FlowableWithLatestFromMany(@NonNull Flowable<T> flowable, @NonNull b[] bVarArr, Function<? super Object[], R> function) {
        super(flowable);
        this.otherArray = bVarArr;
        this.otherIterable = null;
        this.combiner = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        int length;
        b[] bVarArr = this.otherArray;
        if (bVarArr == null) {
            bVarArr = new b[8];
            try {
                length = 0;
                for (b bVar : this.otherIterable) {
                    if (length == bVarArr.length) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, (length >> 1) + length);
                    }
                    int i4 = length + 1;
                    bVarArr[length] = bVar;
                    length = i4;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, cVar);
                return;
            }
        } else {
            length = bVarArr.length;
        }
        if (length == 0) {
            new FlowableMap(this.source, new SingletonArrayFunc()).subscribeActual(cVar);
            return;
        }
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(cVar, this.combiner, length);
        cVar.onSubscribe(withLatestFromSubscriber);
        withLatestFromSubscriber.subscribe(bVarArr, length);
        this.source.subscribe((FlowableSubscriber) withLatestFromSubscriber);
    }

    public FlowableWithLatestFromMany(@NonNull Flowable<T> flowable, @NonNull Iterable<? extends b> iterable, @NonNull Function<? super Object[], R> function) {
        super(flowable);
        this.otherArray = null;
        this.otherIterable = iterable;
        this.combiner = function;
    }
}
