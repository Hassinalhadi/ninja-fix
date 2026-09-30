package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import qg.c;

/* loaded from: classes2.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {
    final Future<? extends T> future;
    final long timeout;
    final TimeUnit unit;

    public FlowableFromFuture(Future<? extends T> future, long j5, TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j5;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        T t5;
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(cVar);
        cVar.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.unit;
            if (timeUnit != null) {
                t5 = this.future.get(this.timeout, timeUnit);
            } else {
                t5 = this.future.get();
            }
            if (t5 == null) {
                cVar.onError(new NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.complete(t5);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            if (!deferredScalarSubscription.isCancelled()) {
                cVar.onError(th);
            }
        }
    }
}
