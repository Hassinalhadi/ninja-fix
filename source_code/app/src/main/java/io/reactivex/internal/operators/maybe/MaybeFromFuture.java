package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class MaybeFromFuture<T> extends Maybe<T> {
    final Future<? extends T> future;
    final long timeout;
    final TimeUnit unit;

    public MaybeFromFuture(Future<? extends T> future, long j5, TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j5;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        T t5;
        Disposable empty = Disposables.empty();
        maybeObserver.onSubscribe(empty);
        if (!empty.isDisposed()) {
            try {
                long j5 = this.timeout;
                if (j5 <= 0) {
                    t5 = this.future.get();
                } else {
                    t5 = this.future.get(j5, this.unit);
                }
                if (!empty.isDisposed()) {
                    if (t5 == null) {
                        maybeObserver.onComplete();
                    } else {
                        maybeObserver.onSuccess(t5);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (th instanceof ExecutionException) {
                    th = th.getCause();
                }
                Exceptions.throwIfFatal(th);
                if (!empty.isDisposed()) {
                    maybeObserver.onError(th);
                }
            }
        }
    }
}
