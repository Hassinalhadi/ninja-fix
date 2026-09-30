package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableDebounce<T, U> extends AbstractFlowableWithUpstream<T, T> {
    final Function<? super T, ? extends b> debounceSelector;

    /* loaded from: classes2.dex */
    public static final class DebounceSubscriber<T, U> extends AtomicLong implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 6725975399620862591L;
        final Function<? super T, ? extends b> debounceSelector;
        final AtomicReference<Disposable> debouncer = new AtomicReference<>();
        boolean done;
        final c downstream;
        volatile long index;
        d upstream;

        /* loaded from: classes2.dex */
        public static final class DebounceInnerSubscriber<T, U> extends DisposableSubscriber<U> {
            boolean done;
            final long index;
            final AtomicBoolean once = new AtomicBoolean();
            final DebounceSubscriber<T, U> parent;
            final T value;

            public DebounceInnerSubscriber(DebounceSubscriber<T, U> debounceSubscriber, long j5, T t5) {
                this.parent = debounceSubscriber;
                this.index = j5;
                this.value = t5;
            }

            public void emit() {
                if (this.once.compareAndSet(false, true)) {
                    this.parent.emit(this.index, this.value);
                }
            }

            @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
            public void onComplete() {
                if (this.done) {
                    return;
                }
                this.done = true;
                emit();
            }

            @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
            public void onError(Throwable th) {
                if (this.done) {
                    RxJavaPlugins.onError(th);
                } else {
                    this.done = true;
                    this.parent.onError(th);
                }
            }

            @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
            public void onNext(U u4) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cancel();
                emit();
            }
        }

        public DebounceSubscriber(c cVar, Function<? super T, ? extends b> function) {
            this.downstream = cVar;
            this.debounceSelector = function;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.cancel();
            DisposableHelper.dispose(this.debouncer);
        }

        public void emit(long j5, T t5) {
            if (j5 == this.index) {
                if (get() != 0) {
                    this.downstream.onNext(t5);
                    BackpressureHelper.produced(this, 1L);
                } else {
                    cancel();
                    this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                Disposable disposable = this.debouncer.get();
                if (!DisposableHelper.isDisposed(disposable)) {
                    DebounceInnerSubscriber debounceInnerSubscriber = (DebounceInnerSubscriber) disposable;
                    if (debounceInnerSubscriber != null) {
                        debounceInnerSubscriber.emit();
                    }
                    DisposableHelper.dispose(this.debouncer);
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.debouncer);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!this.done) {
                long j5 = this.index + 1;
                this.index = j5;
                Disposable disposable = this.debouncer.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                try {
                    b bVar = (b) ObjectHelper.requireNonNull(this.debounceSelector.apply(t5), "The publisher supplied is null");
                    DebounceInnerSubscriber debounceInnerSubscriber = new DebounceInnerSubscriber(this, j5, t5);
                    AtomicReference<Disposable> atomicReference = this.debouncer;
                    while (!atomicReference.compareAndSet(disposable, debounceInnerSubscriber)) {
                        if (atomicReference.get() != disposable) {
                            return;
                        }
                    }
                    bVar.subscribe(debounceInnerSubscriber);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    this.downstream.onError(th);
                }
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

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this, j5);
            }
        }
    }

    public FlowableDebounce(Flowable<T> flowable, Function<? super T, ? extends b> function) {
        super(flowable);
        this.debounceSelector = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new DebounceSubscriber(new SerializedSubscriber(cVar), this.debounceSelector));
    }
}
