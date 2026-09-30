package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableMap;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableCombineLatest<T, R> extends Flowable<R> {

    @Nullable
    final b[] array;
    final int bufferSize;
    final Function<? super Object[], ? extends R> combiner;
    final boolean delayErrors;

    @Nullable
    final Iterable<? extends b> iterable;

    /* loaded from: classes2.dex */
    public static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final c downstream;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested;
        final CombineLatestInnerSubscriber<T>[] subscribers;

        public CombineLatestCoordinator(c cVar, Function<? super Object[], ? extends R> function, int i4, int i5, boolean z2) {
            this.downstream = cVar;
            this.combiner = function;
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i4];
            for (int i10 = 0; i10 < i4; i10++) {
                combineLatestInnerSubscriberArr[i10] = new CombineLatestInnerSubscriber<>(this, i10, i5);
            }
            this.subscribers = combineLatestInnerSubscriberArr;
            this.latest = new Object[i4];
            this.queue = new SpscLinkedArrayQueue<>(i5);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
            this.delayErrors = z2;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void cancel() {
            this.cancelled = true;
            cancelAll();
        }

        public void cancelAll() {
            for (CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.subscribers) {
                combineLatestInnerSubscriber.cancel();
            }
        }

        public boolean checkTerminated(boolean z2, boolean z10, c cVar, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (z2) {
                if (this.delayErrors) {
                    if (z10) {
                        cancelAll();
                        Throwable terminate = ExceptionHelper.terminate(this.error);
                        if (terminate != null && terminate != ExceptionHelper.TERMINATED) {
                            cVar.onError(terminate);
                        } else {
                            cVar.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable terminate2 = ExceptionHelper.terminate(this.error);
                if (terminate2 != null && terminate2 != ExceptionHelper.TERMINATED) {
                    cancelAll();
                    spscLinkedArrayQueue.clear();
                    cVar.onError(terminate2);
                    return true;
                }
                if (z10) {
                    cancelAll();
                    cVar.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainOutput();
            } else {
                drainAsync();
            }
        }

        public void drainAsync() {
            boolean z2;
            c cVar = this.downstream;
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.queue;
            int i4 = 1;
            do {
                long j5 = this.requested.get();
                long j6 = 0;
                while (j6 != j5) {
                    boolean z10 = this.done;
                    Object poll = spscLinkedArrayQueue.poll();
                    if (poll == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!checkTerminated(z10, z2, cVar, spscLinkedArrayQueue)) {
                        if (z2) {
                            break;
                        }
                        try {
                            cVar.onNext(ObjectHelper.requireNonNull(this.combiner.apply((Object[]) spscLinkedArrayQueue.poll()), "The combiner returned a null value"));
                            ((CombineLatestInnerSubscriber) poll).requestOne();
                            j6++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            cancelAll();
                            ExceptionHelper.addThrowable(this.error, th);
                            cVar.onError(ExceptionHelper.terminate(this.error));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (j6 != j5 || !checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), cVar, spscLinkedArrayQueue)) {
                    if (j6 != 0 && j5 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j6);
                    }
                    i4 = addAndGet(-i4);
                } else {
                    return;
                }
            } while (i4 != 0);
        }

        public void drainOutput() {
            c cVar = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            int i4 = 1;
            while (!this.cancelled) {
                Throwable th = this.error.get();
                if (th != null) {
                    spscLinkedArrayQueue.clear();
                    cVar.onError(th);
                    return;
                }
                boolean z2 = this.done;
                boolean isEmpty = spscLinkedArrayQueue.isEmpty();
                if (!isEmpty) {
                    cVar.onNext(null);
                }
                if (z2 && isEmpty) {
                    cVar.onComplete();
                    return;
                } else {
                    i4 = addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void innerComplete(int i4) {
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    if (objArr[i4] != null) {
                        int i5 = this.completedSources + 1;
                        if (i5 == objArr.length) {
                            this.done = true;
                        } else {
                            this.completedSources = i5;
                            return;
                        }
                    } else {
                        this.done = true;
                    }
                    drain();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void innerError(int i4, Throwable th) {
            if (ExceptionHelper.addThrowable(this.error, th)) {
                if (!this.delayErrors) {
                    cancelAll();
                    this.done = true;
                    drain();
                    return;
                }
                innerComplete(i4);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public void innerValue(int i4, T t5) {
            boolean z2;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    int i5 = this.nonEmptySources;
                    if (objArr[i4] == null) {
                        i5++;
                        this.nonEmptySources = i5;
                    }
                    objArr[i4] = t5;
                    if (objArr.length == i5) {
                        this.queue.offer(this.subscribers[i4], objArr.clone());
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                this.subscribers[i4].requestOne();
            } else {
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Object poll = this.queue.poll();
            if (poll == null) {
                return null;
            }
            R r4 = (R) ObjectHelper.requireNonNull(this.combiner.apply((Object[]) this.queue.poll()), "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) poll).requestOne();
            return r4;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i4) {
            boolean z2 = false;
            if ((i4 & 4) != 0) {
                return 0;
            }
            int i5 = i4 & 2;
            if (i5 != 0) {
                z2 = true;
            }
            this.outputFused = z2;
            return i5;
        }

        public void subscribe(b[] bVarArr, int i4) {
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.subscribers;
            for (int i5 = 0; i5 < i4 && !this.done && !this.cancelled; i5++) {
                bVarArr[i5].subscribe(combineLatestInnerSubscriberArr[i5]);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final CombineLatestCoordinator<T, ?> parent;
        final int prefetch;
        int produced;

        public CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i4, int i5) {
            this.parent = combineLatestCoordinator;
            this.index = i4;
            this.prefetch = i5;
            this.limit = i5 - (i5 >> 2);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            this.parent.innerValue(this.index, t5);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, this.prefetch);
        }

        public void requestOne() {
            int i4 = this.produced + 1;
            if (i4 == this.limit) {
                this.produced = 0;
                get().request(i4);
            } else {
                this.produced = i4;
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // io.reactivex.functions.Function
        public R apply(T t5) throws Exception {
            return FlowableCombineLatest.this.combiner.apply(new Object[]{t5});
        }
    }

    public FlowableCombineLatest(@NonNull b[] bVarArr, @NonNull Function<? super Object[], ? extends R> function, int i4, boolean z2) {
        this.array = bVarArr;
        this.iterable = null;
        this.combiner = function;
        this.bufferSize = i4;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        int length;
        b[] bVarArr = this.array;
        if (bVarArr == null) {
            bVarArr = new b[8];
            try {
                Iterator it = (Iterator) ObjectHelper.requireNonNull(this.iterable.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            b bVar = (b) ObjectHelper.requireNonNull(it.next(), "The publisher returned by the iterator is null");
                            if (length == bVarArr.length) {
                                b[] bVarArr2 = new b[(length >> 2) + length];
                                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                                bVarArr = bVarArr2;
                            }
                            bVarArr[length] = bVar;
                            length++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            EmptySubscription.error(th, cVar);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        EmptySubscription.error(th2, cVar);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, cVar);
                return;
            }
        } else {
            length = bVarArr.length;
        }
        int i4 = length;
        if (i4 == 0) {
            EmptySubscription.complete(cVar);
        } else {
            if (i4 == 1) {
                bVarArr[0].subscribe(new FlowableMap.MapSubscriber(cVar, new SingletonArrayFunc()));
                return;
            }
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(cVar, this.combiner, i4, this.bufferSize, this.delayErrors);
            cVar.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.subscribe(bVarArr, i4);
        }
    }

    public FlowableCombineLatest(@NonNull Iterable<? extends b> iterable, @NonNull Function<? super Object[], ? extends R> function, int i4, boolean z2) {
        this.array = null;
        this.iterable = iterable;
        this.combiner = function;
        this.bufferSize = i4;
        this.delayErrors = z2;
    }
}
