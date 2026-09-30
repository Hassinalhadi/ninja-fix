package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableConcatMapEager<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends b> mapper;
    final int maxConcurrency;
    final int prefetch;

    /* loaded from: classes2.dex */
    public static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d, InnerQueuedSubscriberSupport<R> {
        private static final long serialVersionUID = -4255299542215038287L;
        volatile boolean cancelled;
        volatile InnerQueuedSubscriber<R> current;
        volatile boolean done;
        final c downstream;
        final ErrorMode errorMode;
        final Function<? super T, ? extends b> mapper;
        final int maxConcurrency;
        final int prefetch;
        final SpscLinkedArrayQueue<InnerQueuedSubscriber<R>> subscribers;
        d upstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();

        public ConcatMapEagerDelayErrorSubscriber(c cVar, Function<? super T, ? extends b> function, int i4, int i5, ErrorMode errorMode) {
            this.downstream = cVar;
            this.mapper = function;
            this.maxConcurrency = i4;
            this.prefetch = i5;
            this.errorMode = errorMode;
            this.subscribers = new SpscLinkedArrayQueue<>(Math.min(i5, i4));
        }

        @Override // qg.d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            drainAndCancel();
        }

        public void cancelAll() {
            InnerQueuedSubscriber<R> innerQueuedSubscriber = this.current;
            this.current = null;
            if (innerQueuedSubscriber != null) {
                innerQueuedSubscriber.cancel();
            }
            while (true) {
                InnerQueuedSubscriber<R> poll = this.subscribers.poll();
                if (poll != null) {
                    poll.cancel();
                } else {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
        
            if (r12 != r6) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
        
            if (r19.cancelled == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00dc, code lost:
        
            if (r3 != io.reactivex.internal.util.ErrorMode.IMMEDIATE) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
        
            if (r19.errors.get() == null) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00e8, code lost:
        
            r19.current = null;
            r8.cancel();
            cancelAll();
            r2.onError(r19.errors.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f9, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
        
            r14 = r8.isDone();
            r11 = r11.isEmpty();
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0102, code lost:
        
            if (r14 == false) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0104, code lost:
        
            if (r11 == false) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0106, code lost:
        
            r19.current = null;
            r19.upstream.request(1);
            r8 = null;
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00d6, code lost:
        
            cancelAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00d9, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x00cf, code lost:
        
            r0 = false;
         */
        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drain() {
            InnerQueuedSubscriber<R> innerQueuedSubscriber;
            long j5;
            long j6;
            boolean z2;
            SimpleQueue<R> queue;
            boolean z10;
            if (getAndIncrement() == 0) {
                InnerQueuedSubscriber<R> innerQueuedSubscriber2 = this.current;
                c cVar = this.downstream;
                ErrorMode errorMode = this.errorMode;
                int i4 = 1;
                while (true) {
                    long j7 = this.requested.get();
                    if (innerQueuedSubscriber2 == null) {
                        if (errorMode != ErrorMode.END && this.errors.get() != null) {
                            cancelAll();
                            cVar.onError(this.errors.terminate());
                            return;
                        }
                        boolean z11 = this.done;
                        innerQueuedSubscriber = this.subscribers.poll();
                        if (z11 && innerQueuedSubscriber == null) {
                            Throwable terminate = this.errors.terminate();
                            if (terminate != null) {
                                cVar.onError(terminate);
                                return;
                            } else {
                                cVar.onComplete();
                                return;
                            }
                        }
                        if (innerQueuedSubscriber != null) {
                            this.current = innerQueuedSubscriber;
                        }
                    } else {
                        innerQueuedSubscriber = innerQueuedSubscriber2;
                    }
                    if (innerQueuedSubscriber != null && (queue = innerQueuedSubscriber.queue()) != null) {
                        j6 = 0;
                        while (true) {
                            if (j6 != j7) {
                                if (this.cancelled) {
                                    cancelAll();
                                    return;
                                }
                                if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                                    this.current = null;
                                    innerQueuedSubscriber.cancel();
                                    cancelAll();
                                    cVar.onError(this.errors.terminate());
                                    return;
                                }
                                boolean isDone = innerQueuedSubscriber.isDone();
                                j5 = 0;
                                try {
                                    R poll = queue.poll();
                                    if (poll == null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (isDone && z10) {
                                        this.current = null;
                                        this.upstream.request(1L);
                                        innerQueuedSubscriber = null;
                                        z2 = true;
                                        break;
                                    }
                                    if (z10) {
                                        break;
                                    }
                                    cVar.onNext(poll);
                                    j6++;
                                    innerQueuedSubscriber.requestOne();
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    this.current = null;
                                    innerQueuedSubscriber.cancel();
                                    cancelAll();
                                    cVar.onError(th);
                                    return;
                                }
                            } else {
                                j5 = 0;
                                break;
                            }
                        }
                    } else {
                        j5 = 0;
                        j6 = 0;
                        z2 = false;
                    }
                    if (j6 != j5 && j7 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j6);
                    }
                    if (z2 || (i4 = addAndGet(-i4)) != 0) {
                        innerQueuedSubscriber2 = innerQueuedSubscriber;
                    } else {
                        return;
                    }
                }
            }
        }

        public void drainAndCancel() {
            if (getAndIncrement() != 0) {
                return;
            }
            do {
                cancelAll();
            } while (decrementAndGet() != 0);
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerComplete(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.setDone();
            drain();
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerError(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th) {
            if (this.errors.addThrowable(th)) {
                innerQueuedSubscriber.setDone();
                if (this.errorMode != ErrorMode.END) {
                    this.upstream.cancel();
                }
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerNext(InnerQueuedSubscriber<R> innerQueuedSubscriber, R r4) {
            if (innerQueuedSubscriber.queue().offer(r4)) {
                drain();
            } else {
                innerQueuedSubscriber.cancel();
                innerError(innerQueuedSubscriber, new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            try {
                b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(t5), "The mapper returned a null Publisher");
                InnerQueuedSubscriber<R> innerQueuedSubscriber = new InnerQueuedSubscriber<>(this, this.prefetch);
                if (!this.cancelled) {
                    this.subscribers.offer(innerQueuedSubscriber);
                    bVar.subscribe(innerQueuedSubscriber);
                    if (this.cancelled) {
                        innerQueuedSubscriber.cancel();
                        drainAndCancel();
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            long j5;
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                int i4 = this.maxConcurrency;
                if (i4 == Integer.MAX_VALUE) {
                    j5 = Long.MAX_VALUE;
                } else {
                    j5 = i4;
                }
                dVar.request(j5);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                drain();
            }
        }
    }

    public FlowableConcatMapEager(Flowable<T> flowable, Function<? super T, ? extends b> function, int i4, int i5, ErrorMode errorMode) {
        super(flowable);
        this.mapper = function;
        this.maxConcurrency = i4;
        this.prefetch = i5;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new ConcatMapEagerDelayErrorSubscriber(cVar, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }
}
