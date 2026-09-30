package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    /* loaded from: classes2.dex */
    public static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        volatile boolean done;
        final c downstream;
        Throwable error;
        d upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<T> current = new AtomicReference<>();

        public BackpressureLatestSubscriber(c cVar) {
            this.downstream = cVar;
        }

        @Override // qg.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.current.lazySet(null);
                }
            }
        }

        public boolean checkTerminated(boolean z2, boolean z10, c cVar, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z2) {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet(null);
                    cVar.onError(th);
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

        public void drain() {
            boolean z2;
            boolean z10;
            if (getAndIncrement() == 0) {
                c cVar = this.downstream;
                AtomicLong atomicLong = this.requested;
                AtomicReference<T> atomicReference = this.current;
                int i4 = 1;
                do {
                    long j5 = 0;
                    while (true) {
                        z2 = false;
                        if (j5 == atomicLong.get()) {
                            break;
                        }
                        boolean z11 = this.done;
                        T andSet = atomicReference.getAndSet(null);
                        if (andSet == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!checkTerminated(z11, z10, cVar, atomicReference)) {
                            if (z10) {
                                break;
                            }
                            cVar.onNext(andSet);
                            j5++;
                        } else {
                            return;
                        }
                    }
                    if (j5 == atomicLong.get()) {
                        boolean z12 = this.done;
                        if (atomicReference.get() == null) {
                            z2 = true;
                        }
                        if (checkTerminated(z12, z2, cVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j5 != 0) {
                        BackpressureHelper.produced(atomicLong, j5);
                    }
                    i4 = addAndGet(-i4);
                } while (i4 != 0);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            this.current.lazySet(t5);
            drain();
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
                BackpressureHelper.add(this.requested, j5);
                drain();
            }
        }
    }

    public FlowableOnBackpressureLatest(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new BackpressureLatestSubscriber(cVar));
    }
}
