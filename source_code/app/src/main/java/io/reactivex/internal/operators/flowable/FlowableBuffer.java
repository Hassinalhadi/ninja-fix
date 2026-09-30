package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, C> {
    final Callable<C> bufferSupplier;
    final int size;
    final int skip;

    /* loaded from: classes2.dex */
    public static final class PublisherBufferExactSubscriber<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, d {
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final c downstream;
        int index;
        final int size;
        d upstream;

        public PublisherBufferExactSubscriber(c cVar, int i4, Callable<C> callable) {
            this.downstream = cVar;
            this.size = i4;
            this.bufferSupplier = callable;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c3 = this.buffer;
            if (c3 != null && !c3.isEmpty()) {
                this.downstream.onNext(c3);
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            C c3 = this.buffer;
            if (c3 == null) {
                try {
                    c3 = (C) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                    this.buffer = c3;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            c3.add(t5);
            int i4 = this.index + 1;
            if (i4 == this.size) {
                this.index = 0;
                this.buffer = null;
                this.downstream.onNext(c3);
                return;
            }
            this.index = i4;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                this.upstream.request(BackpressureHelper.multiplyCap(j5, this.size));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, d, BooleanSupplier {
        private static final long serialVersionUID = -7370244972039324525L;
        final Callable<C> bufferSupplier;
        volatile boolean cancelled;
        boolean done;
        final c downstream;
        int index;
        long produced;
        final int size;
        final int skip;
        d upstream;
        final AtomicBoolean once = new AtomicBoolean();
        final ArrayDeque<C> buffers = new ArrayDeque<>();

        public PublisherBufferOverlappingSubscriber(c cVar, int i4, int i5, Callable<C> callable) {
            this.downstream = cVar;
            this.size = i4;
            this.skip = i5;
            this.bufferSupplier = callable;
        }

        @Override // qg.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        @Override // io.reactivex.functions.BooleanSupplier
        public boolean getAsBoolean() {
            return this.cancelled;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            long j5 = this.produced;
            if (j5 != 0) {
                BackpressureHelper.produced(this, j5);
            }
            QueueDrainHelper.postComplete(this.downstream, this.buffers, this, this);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.buffers;
            int i4 = this.index;
            int i5 = i4 + 1;
            if (i4 == 0) {
                try {
                    arrayDeque.offer((Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer"));
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            Collection collection = (Collection) arrayDeque.peek();
            if (collection != null && collection.size() + 1 == this.size) {
                arrayDeque.poll();
                collection.add(t5);
                this.produced++;
                this.downstream.onNext(collection);
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(t5);
            }
            if (i5 == this.skip) {
                i5 = 0;
            }
            this.index = i5;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5) && !QueueDrainHelper.postCompleteRequest(j5, this.downstream, this.buffers, this, this)) {
                if (!this.once.get() && this.once.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.addCap(this.size, BackpressureHelper.multiplyCap(this.skip, j5 - 1)));
                } else {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j5));
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -5616169793639412593L;
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final c downstream;
        int index;
        final int size;
        final int skip;
        d upstream;

        public PublisherBufferSkipSubscriber(c cVar, int i4, int i5, Callable<C> callable) {
            this.downstream = cVar;
            this.size = i4;
            this.skip = i5;
            this.bufferSupplier = callable;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c3 = this.buffer;
            this.buffer = null;
            if (c3 != null) {
                this.downstream.onNext(c3);
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.buffer = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            C c3 = this.buffer;
            int i4 = this.index;
            int i5 = i4 + 1;
            if (i4 == 0) {
                try {
                    c3 = (C) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                    this.buffer = c3;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (c3 != null) {
                c3.add(t5);
                if (c3.size() == this.size) {
                    this.buffer = null;
                    this.downstream.onNext(c3);
                }
            }
            if (i5 == this.skip) {
                i5 = 0;
            }
            this.index = i5;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(j5, this.size), BackpressureHelper.multiplyCap(this.skip - this.size, j5 - 1)));
                    return;
                }
                this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j5));
            }
        }
    }

    public FlowableBuffer(Flowable<T> flowable, int i4, int i5, Callable<C> callable) {
        super(flowable);
        this.size = i4;
        this.skip = i5;
        this.bufferSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        int i4 = this.size;
        int i5 = this.skip;
        if (i4 == i5) {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferExactSubscriber(cVar, i4, this.bufferSupplier));
        } else if (i5 > i4) {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferSkipSubscriber(cVar, this.size, this.skip, this.bufferSupplier));
        } else {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferOverlappingSubscriber(cVar, this.size, this.skip, this.bufferSupplier));
        }
    }
}
