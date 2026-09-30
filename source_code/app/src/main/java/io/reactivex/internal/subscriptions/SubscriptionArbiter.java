package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.d;

/* loaded from: classes2.dex */
public class SubscriptionArbiter extends AtomicInteger implements d {
    private static final long serialVersionUID = -2189523197179400958L;
    d actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<d> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public SubscriptionArbiter(boolean z2) {
        this.cancelOnReplace = z2;
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            drain();
        }
    }

    public final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    public final void drainLoop() {
        int i4 = 1;
        long j5 = 0;
        d dVar = null;
        do {
            d dVar2 = this.missedSubscription.get();
            if (dVar2 != null) {
                dVar2 = this.missedSubscription.getAndSet(null);
            }
            long j6 = this.missedRequested.get();
            if (j6 != 0) {
                j6 = this.missedRequested.getAndSet(0L);
            }
            long j7 = this.missedProduced.get();
            if (j7 != 0) {
                j7 = this.missedProduced.getAndSet(0L);
            }
            d dVar3 = this.actual;
            if (this.cancelled) {
                if (dVar3 != null) {
                    dVar3.cancel();
                    this.actual = null;
                }
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else {
                long j10 = this.requested;
                if (j10 != Long.MAX_VALUE) {
                    j10 = BackpressureHelper.addCap(j10, j6);
                    if (j10 != Long.MAX_VALUE) {
                        j10 -= j7;
                        if (j10 < 0) {
                            SubscriptionHelper.reportMoreProduced(j10);
                            j10 = 0;
                        }
                    }
                    this.requested = j10;
                }
                if (dVar2 != null) {
                    if (dVar3 != null && this.cancelOnReplace) {
                        dVar3.cancel();
                    }
                    this.actual = dVar2;
                    if (j10 != 0) {
                        j5 = BackpressureHelper.addCap(j5, j10);
                        dVar = dVar2;
                    }
                } else if (dVar3 != null && j6 != 0) {
                    j5 = BackpressureHelper.addCap(j5, j6);
                    dVar = dVar3;
                }
            }
            i4 = addAndGet(-i4);
        } while (i4 != 0);
        if (j5 != 0) {
            dVar.request(j5);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j5) {
        if (!this.unbounded) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j6 = this.requested;
                if (j6 != Long.MAX_VALUE) {
                    long j7 = j6 - j5;
                    if (j7 < 0) {
                        SubscriptionHelper.reportMoreProduced(j7);
                        j7 = 0;
                    }
                    this.requested = j7;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
                drainLoop();
                return;
            }
            BackpressureHelper.add(this.missedProduced, j5);
            drain();
        }
    }

    @Override // qg.d
    public final void request(long j5) {
        if (SubscriptionHelper.validate(j5) && !this.unbounded) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j6 = this.requested;
                if (j6 != Long.MAX_VALUE) {
                    long addCap = BackpressureHelper.addCap(j6, j5);
                    this.requested = addCap;
                    if (addCap == Long.MAX_VALUE) {
                        this.unbounded = true;
                    }
                }
                d dVar = this.actual;
                if (decrementAndGet() != 0) {
                    drainLoop();
                }
                if (dVar != null) {
                    dVar.request(j5);
                    return;
                }
                return;
            }
            BackpressureHelper.add(this.missedRequested, j5);
            drain();
        }
    }

    public final void setSubscription(d dVar) {
        if (this.cancelled) {
            dVar.cancel();
            return;
        }
        ObjectHelper.requireNonNull(dVar, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            d dVar2 = this.actual;
            if (dVar2 != null && this.cancelOnReplace) {
                dVar2.cancel();
            }
            this.actual = dVar;
            long j5 = this.requested;
            if (decrementAndGet() != 0) {
                drainLoop();
            }
            if (j5 != 0) {
                dVar.request(j5);
                return;
            }
            return;
        }
        d andSet = this.missedSubscription.getAndSet(dVar);
        if (andSet != null && this.cancelOnReplace) {
            andSet.cancel();
        }
        drain();
    }
}
