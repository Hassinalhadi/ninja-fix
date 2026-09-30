package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.d;

/* loaded from: classes2.dex */
public final class AsyncSubscription extends AtomicLong implements d, Disposable {
    private static final long serialVersionUID = 7028635084060361255L;
    final AtomicReference<d> actual;
    final AtomicReference<Disposable> resource;

    public AsyncSubscription() {
        this.resource = new AtomicReference<>();
        this.actual = new AtomicReference<>();
    }

    @Override // qg.d
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.actual);
        DisposableHelper.dispose(this.resource);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (this.actual.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    public boolean replaceResource(Disposable disposable) {
        return DisposableHelper.replace(this.resource, disposable);
    }

    @Override // qg.d
    public void request(long j5) {
        SubscriptionHelper.deferredRequest(this.actual, this, j5);
    }

    public boolean setResource(Disposable disposable) {
        return DisposableHelper.set(this.resource, disposable);
    }

    public void setSubscription(d dVar) {
        SubscriptionHelper.deferredSetOnce(this.actual, this, dVar);
    }

    public AsyncSubscription(Disposable disposable) {
        this();
        this.resource.lazySet(disposable);
    }
}
