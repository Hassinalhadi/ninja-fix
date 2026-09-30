package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class BlockingMultiObserver<T> extends CountDownLatch implements SingleObserver<T>, CompletableObserver, MaybeObserver<T> {
    volatile boolean cancelled;
    Throwable error;
    Disposable upstream;
    T value;

    public BlockingMultiObserver() {
        super(1);
    }

    public boolean blockingAwait(long j5, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                if (!await(j5, timeUnit)) {
                    dispose();
                    return false;
                }
            } catch (InterruptedException e) {
                dispose();
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            return true;
        }
        throw ExceptionHelper.wrapOrThrow(th);
    }

    public T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw ExceptionHelper.wrapOrThrow(th);
    }

    public Throwable blockingGetError() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                dispose();
                return e;
            }
        }
        return this.error;
    }

    public void dispose() {
        this.cancelled = true;
        Disposable disposable = this.upstream;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        this.error = th;
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        this.upstream = disposable;
        if (this.cancelled) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t5) {
        this.value = t5;
        countDown();
    }

    public Throwable blockingGetError(long j5, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                if (!await(j5, timeUnit)) {
                    dispose();
                    throw ExceptionHelper.wrapOrThrow(new TimeoutException(ExceptionHelper.timeoutMessage(j5, timeUnit)));
                }
            } catch (InterruptedException e) {
                dispose();
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }
        return this.error;
    }

    public T blockingGet(T t5) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            T t10 = this.value;
            return t10 != null ? t10 : t5;
        }
        throw ExceptionHelper.wrapOrThrow(th);
    }
}
