package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes2.dex */
public abstract class BasicFuseableObserver<T, R> implements Observer<T>, QueueDisposable<R> {
    protected boolean done;
    protected final Observer<? super R> downstream;

    /* renamed from: qd, reason: collision with root package name */
    protected QueueDisposable<T> f12796qd;
    protected int sourceMode;
    protected Disposable upstream;

    public BasicFuseableObserver(Observer<? super R> observer) {
        this.downstream = observer;
    }

    public void afterDownstream() {
    }

    public boolean beforeDownstream() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        this.f12796qd.clear();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.upstream.dispose();
    }

    public final void fail(Throwable th) {
        Exceptions.throwIfFatal(th);
        this.upstream.dispose();
        onError(th);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f12796qd.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r4) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
        } else {
            this.done = true;
            this.downstream.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            if (disposable instanceof QueueDisposable) {
                this.f12796qd = (QueueDisposable) disposable;
            }
            if (beforeDownstream()) {
                this.downstream.onSubscribe(this);
                afterDownstream();
            }
        }
    }

    public final int transitiveBoundaryFusion(int i4) {
        QueueDisposable<T> queueDisposable = this.f12796qd;
        if (queueDisposable != null && (i4 & 4) == 0) {
            int requestFusion = queueDisposable.requestFusion(i4);
            if (requestFusion != 0) {
                this.sourceMode = requestFusion;
            }
            return requestFusion;
        }
        return 0;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r4, R r5) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
