package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableTimeout<T, U, V> extends AbstractFlowableWithUpstream<T, T> {
    final b firstTimeoutIndicator;
    final Function<? super T, ? extends b> itemTimeoutIndicator;
    final b other;

    /* loaded from: classes2.dex */
    public static final class TimeoutConsumer extends AtomicReference<d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final TimeoutSelectorSupport parent;

        public TimeoutConsumer(long j5, TimeoutSelectorSupport timeoutSelectorSupport) {
            this.idx = j5;
            this.parent = timeoutSelectorSupport;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (obj != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (obj != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.onTimeoutError(this.idx, th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(Object obj) {
            d dVar = (d) get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (dVar != subscriptionHelper) {
                dVar.cancel();
                lazySet(subscriptionHelper);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final c downstream;
        b fallback;
        final AtomicLong index;
        final Function<? super T, ? extends b> itemTimeoutIndicator;
        final SequentialDisposable task;
        final AtomicReference<d> upstream;

        public TimeoutFallbackSubscriber(c cVar, Function<? super T, ? extends b> function, b bVar) {
            super(true);
            this.downstream = cVar;
            this.itemTimeoutIndicator = function;
            this.task = new SequentialDisposable();
            this.upstream = new AtomicReference<>();
            this.fallback = bVar;
            this.index = new AtomicLong();
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, qg.d
        public void cancel() {
            super.cancel();
            this.task.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.task.dispose();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.task.dispose();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            long j5 = this.index.get();
            if (j5 != Long.MAX_VALUE) {
                long j6 = j5 + 1;
                if (this.index.compareAndSet(j5, j6)) {
                    Disposable disposable = this.task.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.consumed++;
                    this.downstream.onNext(t5);
                    try {
                        b bVar = (b) ObjectHelper.requireNonNull(this.itemTimeoutIndicator.apply(t5), "The itemTimeoutIndicator returned a null Publisher.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j6, this);
                        if (this.task.replace(timeoutConsumer)) {
                            bVar.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.upstream.get().cancel();
                        this.index.getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                setSubscription(dVar);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j5) {
            if (this.index.compareAndSet(j5, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                b bVar = this.fallback;
                this.fallback = null;
                long j6 = this.consumed;
                if (j6 != 0) {
                    produced(j6);
                }
                bVar.subscribe(new FlowableTimeoutTimed.FallbackSubscriber(this.downstream, this));
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long j5, Throwable th) {
            if (this.index.compareAndSet(j5, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        public void startFirstTimeout(b bVar) {
            if (bVar != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    bVar.subscribe(timeoutConsumer);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface TimeoutSelectorSupport extends FlowableTimeoutTimed.TimeoutSupport {
        void onTimeoutError(long j5, Throwable th);
    }

    /* loaded from: classes2.dex */
    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, d, TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final c downstream;
        final Function<? super T, ? extends b> itemTimeoutIndicator;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public TimeoutSubscriber(c cVar, Function<? super T, ? extends b> function) {
            this.downstream = cVar;
            this.itemTimeoutIndicator = function;
        }

        @Override // qg.d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.task.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            long j5 = get();
            if (j5 != Long.MAX_VALUE) {
                long j6 = 1 + j5;
                if (compareAndSet(j5, j6)) {
                    Disposable disposable = this.task.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.downstream.onNext(t5);
                    try {
                        b bVar = (b) ObjectHelper.requireNonNull(this.itemTimeoutIndicator.apply(t5), "The itemTimeoutIndicator returned a null Publisher.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j6, this);
                        if (this.task.replace(timeoutConsumer)) {
                            bVar.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.upstream.get().cancel();
                        getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j5) {
            if (compareAndSet(j5, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long j5, Throwable th) {
            if (compareAndSet(j5, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j5);
        }

        public void startFirstTimeout(b bVar) {
            if (bVar != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    bVar.subscribe(timeoutConsumer);
                }
            }
        }
    }

    public FlowableTimeout(Flowable<T> flowable, b bVar, Function<? super T, ? extends b> function, b bVar2) {
        super(flowable);
        this.firstTimeoutIndicator = bVar;
        this.itemTimeoutIndicator = function;
        this.other = bVar2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        if (this.other == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(cVar, this.itemTimeoutIndicator);
            cVar.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.startFirstTimeout(this.firstTimeoutIndicator);
            this.source.subscribe((FlowableSubscriber) timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(cVar, this.itemTimeoutIndicator, this.other);
        cVar.onSubscribe(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.startFirstTimeout(this.firstTimeoutIndicator);
        this.source.subscribe((FlowableSubscriber) timeoutFallbackSubscriber);
    }
}
