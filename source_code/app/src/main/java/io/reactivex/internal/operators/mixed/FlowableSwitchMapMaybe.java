package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
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
public final class FlowableSwitchMapMaybe<T, R> extends Flowable<R> {
    final boolean delayErrors;
    final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
    final Flowable<T> source;

    /* loaded from: classes2.dex */
    public static final class SwitchMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d {
        static final SwitchMapMaybeObserver<Object> INNER_DISPOSED = new SwitchMapMaybeObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final c downstream;
        long emitted;
        final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        d upstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<SwitchMapMaybeObserver<R>> inner = new AtomicReference<>();

        /* loaded from: classes2.dex */
        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapMaybeSubscriber<?, R> parent;

            public SwitchMapMaybeObserver(SwitchMapMaybeSubscriber<?, R> switchMapMaybeSubscriber) {
                this.parent = switchMapMaybeSubscriber;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                this.parent.innerError(this, th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r4) {
                this.item = r4;
                this.parent.drain();
            }
        }

        public SwitchMapMaybeSubscriber(c cVar, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2) {
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
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver = INNER_DISPOSED;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver2 = (SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 != null && switchMapMaybeObserver2 != switchMapMaybeObserver) {
                switchMapMaybeObserver2.dispose();
            }
        }

        public void drain() {
            boolean z2;
            if (getAndIncrement() == 0) {
                c cVar = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
                AtomicLong atomicLong = this.requested;
                long j5 = this.emitted;
                int i4 = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() != null && !this.delayErrors) {
                        cVar.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z10 = this.done;
                    SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
                    if (switchMapMaybeObserver == null) {
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
                    if (!z2 && switchMapMaybeObserver.item != null && j5 != atomicLong.get()) {
                        while (!atomicReference.compareAndSet(switchMapMaybeObserver, null) && atomicReference.get() == switchMapMaybeObserver) {
                        }
                        cVar.onNext(switchMapMaybeObserver.item);
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

        public void innerComplete(SwitchMapMaybeObserver<R> switchMapMaybeObserver) {
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            while (!atomicReference.compareAndSet(switchMapMaybeObserver, null)) {
                if (atomicReference.get() != switchMapMaybeObserver) {
                    return;
                }
            }
            drain();
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
        public void innerError(SwitchMapMaybeObserver<R> switchMapMaybeObserver, Throwable th) {
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            while (true) {
                if (atomicReference.compareAndSet(switchMapMaybeObserver, null)) {
                    if (this.errors.addThrowable(th)) {
                        if (!this.delayErrors) {
                            this.upstream.cancel();
                            disposeInner();
                        }
                        drain();
                        return;
                    }
                } else if (atomicReference.get() != switchMapMaybeObserver) {
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
            SwitchMapMaybeObserver<R> switchMapMaybeObserver = this.inner.get();
            if (switchMapMaybeObserver != null) {
                switchMapMaybeObserver.dispose();
            }
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.mapper.apply(t5), "The mapper returned a null MaybeSource");
                SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = new SwitchMapMaybeObserver<>(this);
                while (true) {
                    SwitchMapMaybeObserver<R> switchMapMaybeObserver3 = this.inner.get();
                    if (switchMapMaybeObserver3 == INNER_DISPOSED) {
                        return;
                    }
                    AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
                    while (!atomicReference.compareAndSet(switchMapMaybeObserver3, switchMapMaybeObserver2)) {
                        if (atomicReference.get() != switchMapMaybeObserver3) {
                            break;
                        }
                    }
                    maybeSource.subscribe(switchMapMaybeObserver2);
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

    public FlowableSwitchMapMaybe(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2) {
        this.source = flowable;
        this.mapper = function;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new SwitchMapMaybeSubscriber(cVar, this.mapper, this.delayErrors));
    }
}
