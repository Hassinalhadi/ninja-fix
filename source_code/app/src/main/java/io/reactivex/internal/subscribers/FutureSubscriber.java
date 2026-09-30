package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import qg.d;

/* loaded from: classes2.dex */
public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, d {
    Throwable error;
    final AtomicReference<d> upstream;
    T value;

    public FutureSubscriber() {
        super(1);
        this.upstream = new AtomicReference<>();
    }

    @Override // qg.d
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.error;
            if (th == null) {
                return this.value;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        if (this.upstream.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onComplete() {
        if (this.value == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        while (true) {
            d dVar = this.upstream.get();
            if (dVar != this && dVar != SubscriptionHelper.CANCELLED) {
                AtomicReference<d> atomicReference = this.upstream;
                while (!atomicReference.compareAndSet(dVar, this)) {
                    if (atomicReference.get() != dVar) {
                        break;
                    }
                }
                countDown();
                return;
            }
            return;
        }
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onError(Throwable th) {
        while (true) {
            d dVar = this.upstream.get();
            if (dVar == this || dVar == SubscriptionHelper.CANCELLED) {
                break;
            }
            this.error = th;
            AtomicReference<d> atomicReference = this.upstream;
            while (!atomicReference.compareAndSet(dVar, this)) {
                if (atomicReference.get() != dVar) {
                    break;
                }
            }
            countDown();
            return;
        }
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onNext(T t5) {
        if (this.value != null) {
            this.upstream.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        } else {
            this.value = t5;
        }
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onSubscribe(d dVar) {
        SubscriptionHelper.setOnce(this.upstream, dVar, Long.MAX_VALUE);
    }

    @Override // qg.d
    public void request(long j5) {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        SubscriptionHelper subscriptionHelper;
        while (true) {
            d dVar = this.upstream.get();
            if (dVar == this || dVar == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
            AtomicReference<d> atomicReference = this.upstream;
            while (!atomicReference.compareAndSet(dVar, subscriptionHelper)) {
                if (atomicReference.get() != dVar) {
                    break;
                }
            }
            if (dVar != null) {
                dVar.cancel();
            }
            countDown();
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long j5, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j5, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j5, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.error;
            if (th == null) {
                return this.value;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
