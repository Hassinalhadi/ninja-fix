package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableFlattenIterable<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final Function<? super T, ? extends Iterable<? extends R>> mapper;
    final int prefetch;

    /* loaded from: classes2.dex */
    public static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        volatile boolean cancelled;
        int consumed;
        Iterator<? extends R> current;
        volatile boolean done;
        final c downstream;
        int fusionMode;
        final int limit;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        final int prefetch;
        SimpleQueue<T> queue;
        d upstream;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public FlattenIterableSubscriber(c cVar, Function<? super T, ? extends Iterable<? extends R>> function, int i4) {
            this.downstream = cVar;
            this.mapper = function;
            this.prefetch = i4;
            this.limit = i4 - (i4 >> 2);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public boolean checkTerminated(boolean z2, boolean z10, c cVar, SimpleQueue<?> simpleQueue) {
            if (this.cancelled) {
                this.current = null;
                simpleQueue.clear();
                return true;
            }
            if (z2) {
                if (this.error.get() != null) {
                    Throwable terminate = ExceptionHelper.terminate(this.error);
                    this.current = null;
                    simpleQueue.clear();
                    cVar.onError(terminate);
                    return true;
                }
                if (z10) {
                    cVar.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.current = null;
            this.queue.clear();
        }

        public void consumedOne(boolean z2) {
            if (z2) {
                int i4 = this.consumed + 1;
                if (i4 == this.limit) {
                    this.consumed = 0;
                    this.upstream.request(i4);
                } else {
                    this.consumed = i4;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
        
            if (r6 == null) goto L69;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drain() {
            boolean z2;
            boolean z10;
            boolean z11;
            if (getAndIncrement() == 0) {
                c cVar = this.downstream;
                SimpleQueue<T> simpleQueue = this.queue;
                boolean z12 = true;
                if (this.fusionMode != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Iterator<? extends R> it = this.current;
                int i4 = 1;
                while (true) {
                    if (it == null) {
                        boolean z13 = this.done;
                        try {
                            T poll = simpleQueue.poll();
                            if (poll == null) {
                                z11 = z12;
                            } else {
                                z11 = false;
                            }
                            if (!checkTerminated(z13, z11, cVar, simpleQueue)) {
                                if (poll != null) {
                                    try {
                                        it = this.mapper.apply(poll).iterator();
                                        if (!it.hasNext()) {
                                            consumedOne(z2);
                                            it = null;
                                        } else {
                                            this.current = it;
                                        }
                                    } catch (Throwable th) {
                                        Exceptions.throwIfFatal(th);
                                        this.upstream.cancel();
                                        ExceptionHelper.addThrowable(this.error, th);
                                        cVar.onError(ExceptionHelper.terminate(this.error));
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.upstream.cancel();
                            ExceptionHelper.addThrowable(this.error, th2);
                            Throwable terminate = ExceptionHelper.terminate(this.error);
                            this.current = null;
                            simpleQueue.clear();
                            cVar.onError(terminate);
                            return;
                        }
                    }
                    if (it != null) {
                        long j5 = this.requested.get();
                        long j6 = 0;
                        while (true) {
                            if (j6 == j5) {
                                break;
                            }
                            if (!checkTerminated(this.done, false, cVar, simpleQueue)) {
                                try {
                                    cVar.onNext(ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                                    if (!checkTerminated(this.done, false, cVar, simpleQueue)) {
                                        j6++;
                                        try {
                                            if (!it.hasNext()) {
                                                consumedOne(z2);
                                                this.current = null;
                                                it = null;
                                                break;
                                            }
                                        } catch (Throwable th3) {
                                            Exceptions.throwIfFatal(th3);
                                            this.current = null;
                                            this.upstream.cancel();
                                            ExceptionHelper.addThrowable(this.error, th3);
                                            cVar.onError(ExceptionHelper.terminate(this.error));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th4) {
                                    Exceptions.throwIfFatal(th4);
                                    this.current = null;
                                    this.upstream.cancel();
                                    ExceptionHelper.addThrowable(this.error, th4);
                                    cVar.onError(ExceptionHelper.terminate(this.error));
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (j6 == j5) {
                            boolean z14 = this.done;
                            if (simpleQueue.isEmpty() && it == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (checkTerminated(z14, z10, cVar, simpleQueue)) {
                                return;
                            }
                        }
                        if (j6 != 0 && j5 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j6);
                        }
                    }
                    i4 = addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                    z12 = true;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            if (this.current == null && this.queue.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (!this.done && ExceptionHelper.addThrowable(this.error, th)) {
                this.done = true;
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            if (this.fusionMode == 0 && !this.queue.offer(t5)) {
                onError(new MissingBackpressureException("Queue is full?!"));
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        dVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Iterator<? extends R> it = this.current;
            while (true) {
                if (it == null) {
                    T poll = this.queue.poll();
                    if (poll == null) {
                        return null;
                    }
                    it = this.mapper.apply(poll).iterator();
                    if (!it.hasNext()) {
                        it = null;
                    } else {
                        this.current = it;
                        break;
                    }
                } else {
                    break;
                }
            }
            R r4 = (R) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.current = null;
            }
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
            if ((i4 & 1) != 0 && this.fusionMode == 1) {
                return 1;
            }
            return 0;
        }
    }

    public FlowableFlattenIterable(Flowable<T> flowable, Function<? super T, ? extends Iterable<? extends R>> function, int i4) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        Flowable<T> flowable = this.source;
        if (flowable instanceof Callable) {
            try {
                Object call = ((Callable) flowable).call();
                if (call == null) {
                    EmptySubscription.complete(cVar);
                    return;
                }
                try {
                    FlowableFromIterable.subscribe(cVar, this.mapper.apply(call).iterator());
                    return;
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
        flowable.subscribe((FlowableSubscriber) new FlattenIterableSubscriber(cVar, this.mapper, this.prefetch));
    }
}
