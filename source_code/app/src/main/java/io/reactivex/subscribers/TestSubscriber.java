package io.reactivex.subscribers;

import av.q;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, d, Disposable {
    private volatile boolean cancelled;
    private final c downstream;
    private final AtomicLong missedRequested;
    private QueueSubscription<T> qs;
    private final AtomicReference<d> upstream;

    /* loaded from: classes2.dex */
    public enum EmptySubscriber implements FlowableSubscriber<Object> {
        INSTANCE;

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
        }
    }

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    public static String fusionModeToString(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return q.delta(i4, "Unknown(", ")");
                }
                return "ASYNC";
            }
            return "SYNC";
        }
        return "NONE";
    }

    public final TestSubscriber<T> assertFuseable() {
        if (this.qs != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    public final TestSubscriber<T> assertFusionMode(int i4) {
        int i5 = this.establishedFusionMode;
        if (i5 != i4) {
            if (this.qs != null) {
                throw new AssertionError("Fusion mode different. Expected: " + fusionModeToString(i4) + ", actual: " + fusionModeToString(i5));
            }
            throw fail("Upstream is not fuseable");
        }
        return this;
    }

    public final TestSubscriber<T> assertNotFuseable() {
        if (this.qs == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    public final TestSubscriber<T> assertOf(Consumer<? super TestSubscriber<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // qg.d
    public final void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            SubscriptionHelper.cancel(this.upstream);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        cancel();
    }

    public final boolean hasSubscription() {
        if (this.upstream.get() != null) {
            return true;
        }
        return false;
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.cancelled;
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onComplete() {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.completions++;
            this.downstream.onComplete();
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onError(Throwable th) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.errors.add(th);
            if (th == null) {
                this.errors.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.downstream.onError(th);
            this.done.countDown();
        } catch (Throwable th2) {
            this.done.countDown();
            throw th2;
        }
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onNext(T t5) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = Thread.currentThread();
        if (this.establishedFusionMode != 2) {
            this.values.add(t5);
            if (t5 == null) {
                this.errors.add(new NullPointerException("onNext received a null value"));
            }
            this.downstream.onNext(t5);
            return;
        }
        while (true) {
            try {
                T poll = this.qs.poll();
                if (poll != null) {
                    this.values.add(poll);
                } else {
                    return;
                }
            } catch (Throwable th) {
                this.errors.add(th);
                this.qs.cancel();
                return;
            }
        }
    }

    public void onStart() {
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onSubscribe(d dVar) {
        this.lastThread = Thread.currentThread();
        if (dVar == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        AtomicReference<d> atomicReference = this.upstream;
        while (!atomicReference.compareAndSet(null, dVar)) {
            if (atomicReference.get() != null) {
                dVar.cancel();
                if (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                    this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + dVar));
                    return;
                }
                return;
            }
        }
        int i4 = this.initialFusionMode;
        if (i4 != 0 && (dVar instanceof QueueSubscription)) {
            QueueSubscription<T> queueSubscription = (QueueSubscription) dVar;
            this.qs = queueSubscription;
            int requestFusion = queueSubscription.requestFusion(i4);
            this.establishedFusionMode = requestFusion;
            if (requestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = Thread.currentThread();
                while (true) {
                    try {
                        T poll = this.qs.poll();
                        if (poll != null) {
                            this.values.add(poll);
                        } else {
                            this.completions++;
                            return;
                        }
                    } catch (Throwable th) {
                        this.errors.add(th);
                        return;
                    }
                }
            }
        }
        this.downstream.onSubscribe(dVar);
        long andSet = this.missedRequested.getAndSet(0L);
        if (andSet != 0) {
            dVar.request(andSet);
        }
        onStart();
    }

    @Override // qg.d
    public final void request(long j5) {
        SubscriptionHelper.deferredRequest(this.upstream, this.missedRequested, j5);
    }

    public final TestSubscriber<T> requestMore(long j5) {
        request(j5);
        return this;
    }

    public final TestSubscriber<T> setInitialFusionMode(int i4) {
        this.initialFusionMode = i4;
        return this;
    }

    public TestSubscriber(long j5) {
        this(EmptySubscriber.INSTANCE, j5);
    }

    public static <T> TestSubscriber<T> create(long j5) {
        return new TestSubscriber<>(j5);
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertNotSubscribed() {
        if (this.upstream.get() == null) {
            if (this.errors.isEmpty()) {
                return this;
            }
            throw fail("Not subscribed but errors found");
        }
        throw fail("Subscribed!");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertSubscribed() {
        if (this.upstream.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    public TestSubscriber(c cVar) {
        this(cVar, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create(c cVar) {
        return new TestSubscriber<>(cVar);
    }

    public TestSubscriber(c cVar, long j5) {
        if (j5 >= 0) {
            this.downstream = cVar;
            this.upstream = new AtomicReference<>();
            this.missedRequested = new AtomicLong(j5);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }
}
