package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {
    final boolean delayErrors;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final Flowable<T> source;

    /* loaded from: classes2.dex */
    public static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d {
        static final SwitchMapSingleObserver<Object> INNER_DISPOSED = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final c downstream;
        long emitted;
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        d upstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();

        /* loaded from: classes2.dex */
        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapSingleSubscriber<?, R> parent;

            public SwitchMapSingleObserver(SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber) {
                this.parent = switchMapSingleSubscriber;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.parent.innerError(this, th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r4) {
                this.item = r4;
                this.parent.drain();
            }
        }

        public SwitchMapSingleSubscriber(c cVar, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z2) {
            this.downstream = cVar;
            this.mapper = function;
            this.delayErrors = z2;
        }

        @Override // qg.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
        }

        public void disposeInner() {
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
            SwitchMapSingleObserver<Object> switchMapSingleObserver = INNER_DISPOSED;
            SwitchMapSingleObserver<Object> switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 != null && switchMapSingleObserver2 != switchMapSingleObserver) {
                switchMapSingleObserver2.dispose();
            }
        }

        public void drain() {
            boolean z2;
            if (getAndIncrement() == 0) {
                c cVar = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
                AtomicLong atomicLong = this.requested;
                long j5 = this.emitted;
                int i4 = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() != null && !this.delayErrors) {
                        cVar.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z10 = this.done;
                    SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                    if (switchMapSingleObserver == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z10 && z2) {
                        Throwable terminate = atomicThrowable.terminate();
                        if (terminate != null) {
                            cVar.onError(terminate);
                            return;
                        } else {
                            cVar.onComplete();
                            return;
                        }
                    }
                    if (!z2 && switchMapSingleObserver.item != null && j5 != atomicLong.get()) {
                        while (!atomicReference.compareAndSet(switchMapSingleObserver, null) && atomicReference.get() == switchMapSingleObserver) {
                        }
                        cVar.onNext(switchMapSingleObserver.item);
                        j5++;
                    } else {
                        this.emitted = j5;
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
        
            io.reactivex.plugins.RxJavaPlugins.onError(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void innerError(SwitchMapSingleObserver<R> switchMapSingleObserver, Throwable th) {
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
            while (true) {
                if (atomicReference.compareAndSet(switchMapSingleObserver, null)) {
                    if (this.errors.addThrowable(th)) {
                        if (!this.delayErrors) {
                            this.upstream.cancel();
                            disposeInner();
                        }
                        drain();
                        return;
                    }
                } else if (atomicReference.get() != switchMapSingleObserver) {
                    break;
                }
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
                if (!this.delayErrors) {
                    disposeInner();
                }
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            SwitchMapSingleObserver<R> switchMapSingleObserver = this.inner.get();
            if (switchMapSingleObserver != null) {
                switchMapSingleObserver.dispose();
            }
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.mapper.apply(t5), "The mapper returned a null SingleSource");
                SwitchMapSingleObserver<R> switchMapSingleObserver2 = new SwitchMapSingleObserver<>(this);
                while (true) {
                    SwitchMapSingleObserver<R> switchMapSingleObserver3 = this.inner.get();
                    if (switchMapSingleObserver3 == INNER_DISPOSED) {
                        return;
                    }
                    AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
                    while (!atomicReference.compareAndSet(switchMapSingleObserver3, switchMapSingleObserver2)) {
                        if (atomicReference.get() != switchMapSingleObserver3) {
                            break;
                        }
                    }
                    singleSource.subscribe(switchMapSingleObserver2);
                    return;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                this.inner.getAndSet(INNER_DISPOSED);
                onError(th);
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
            BackpressureHelper.add(this.requested, j5);
            drain();
        }
    }

    public FlowableSwitchMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z2) {
        this.source = flowable;
        this.mapper = function;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new SwitchMapSingleSubscriber(cVar, this.mapper, this.delayErrors));
    }
}
