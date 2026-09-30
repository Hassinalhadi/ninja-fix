package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableOnBackpressureBuffer<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Action onOverflow;
    final boolean unbounded;

    /* loaded from: classes2.dex */
    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final c downstream;
        Throwable error;
        final Action onOverflow;
        boolean outputFused;
        final SimplePlainQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        d upstream;

        public BackpressureBufferSubscriber(c cVar, int i4, boolean z2, boolean z10, Action action) {
            SimplePlainQueue<T> spscArrayQueue;
            this.downstream = cVar;
            this.onOverflow = action;
            this.delayError = z10;
            if (z2) {
                spscArrayQueue = new SpscLinkedArrayQueue<>(i4);
            } else {
                spscArrayQueue = new SpscArrayQueue<>(i4);
            }
            this.queue = spscArrayQueue;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public boolean checkTerminated(boolean z2, boolean z10, c cVar) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (z2) {
                if (this.delayError) {
                    if (z10) {
                        Throwable th = this.error;
                        if (th != null) {
                            cVar.onError(th);
                        } else {
                            cVar.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.error;
                if (th2 != null) {
                    this.queue.clear();
                    cVar.onError(th2);
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
            this.queue.clear();
        }

        public void drain() {
            boolean z2;
            if (getAndIncrement() == 0) {
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                c cVar = this.downstream;
                int i4 = 1;
                while (!checkTerminated(this.done, simplePlainQueue.isEmpty(), cVar)) {
                    long j5 = this.requested.get();
                    long j6 = 0;
                    while (j6 != j5) {
                        boolean z10 = this.done;
                        T poll = simplePlainQueue.poll();
                        if (poll == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!checkTerminated(z10, z2, cVar)) {
                            if (z2) {
                                break;
                            }
                            cVar.onNext(poll);
                            j6++;
                        } else {
                            return;
                        }
                    }
                    if (j6 != j5 || !checkTerminated(this.done, simplePlainQueue.isEmpty(), cVar)) {
                        if (j6 != 0 && j5 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j6);
                        }
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!this.queue.offer(t5)) {
                this.upstream.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.onOverflow.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
                return;
            }
            if (this.outputFused) {
                this.downstream.onNext(null);
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void request(long j5) {
            if (!this.outputFused && SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i4) {
            if ((i4 & 2) != 0) {
                this.outputFused = true;
                return 2;
            }
            return 0;
        }
    }

    public FlowableOnBackpressureBuffer(Flowable<T> flowable, int i4, boolean z2, boolean z10, Action action) {
        super(flowable);
        this.bufferSize = i4;
        this.unbounded = z2;
        this.delayError = z10;
        this.onOverflow = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new BackpressureBufferSubscriber(cVar, this.bufferSize, this.unbounded, this.delayError, this.onOverflow));
    }
}
