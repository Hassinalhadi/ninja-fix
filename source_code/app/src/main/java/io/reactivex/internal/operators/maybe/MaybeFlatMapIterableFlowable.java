package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import qg.c;

/* loaded from: classes2.dex */
public final class MaybeFlatMapIterableFlowable<T, R> extends Flowable<R> {
    final Function<? super T, ? extends Iterable<? extends R>> mapper;
    final MaybeSource<T> source;

    /* loaded from: classes2.dex */
    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements MaybeObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        volatile boolean cancelled;
        final c downstream;
        volatile Iterator<? extends R> it;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        boolean outputFused;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        public FlatMapIterableObserver(c cVar, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.downstream = cVar;
            this.mapper = function;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.it = null;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                c cVar = this.downstream;
                Iterator<? extends R> it = this.it;
                if (this.outputFused && it != null) {
                    cVar.onNext(null);
                    cVar.onComplete();
                    return;
                }
                int i4 = 1;
                while (true) {
                    if (it != null) {
                        long j5 = this.requested.get();
                        if (j5 == Long.MAX_VALUE) {
                            fastPath(cVar, it);
                            return;
                        }
                        long j6 = 0;
                        while (j6 != j5) {
                            if (!this.cancelled) {
                                try {
                                    cVar.onNext(ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                                    if (!this.cancelled) {
                                        j6++;
                                        try {
                                            if (!it.hasNext()) {
                                                cVar.onComplete();
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            cVar.onError(th);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    cVar.onError(th2);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (j6 != 0) {
                            BackpressureHelper.produced(this.requested, j6);
                        }
                    }
                    i4 = addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                    if (it == null) {
                        it = this.it;
                    }
                }
            }
        }

        public void fastPath(c cVar, Iterator<? extends R> it) {
            while (!this.cancelled) {
                try {
                    cVar.onNext(it.next());
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            cVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        cVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cVar.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            if (this.it == null) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t5) {
            try {
                Iterator<? extends R> it = this.mapper.apply(t5).iterator();
                if (!it.hasNext()) {
                    this.downstream.onComplete();
                } else {
                    this.it = it;
                    drain();
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Iterator<? extends R> it = this.it;
            if (it == null) {
                return null;
            }
            R r4 = (R) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.it = null;
            }
            return r4;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i4) {
            if ((i4 & 2) != 0) {
                this.outputFused = true;
                return 2;
            }
            return 0;
        }
    }

    public MaybeFlatMapIterableFlowable(MaybeSource<T> maybeSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.source = maybeSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe(new FlatMapIterableObserver(cVar, this.mapper));
    }
}
