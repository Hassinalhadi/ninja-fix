package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableBufferBoundarySupplier<T, U extends Collection<? super T>, B> extends AbstractFlowableWithUpstream<T, U> {
    final Callable<? extends b> boundarySupplier;
    final Callable<U> bufferSupplier;

    /* loaded from: classes2.dex */
    public static final class BufferBoundarySubscriber<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {
        boolean once;
        final BufferBoundarySupplierSubscriber<T, U, B> parent;

        public BufferBoundarySubscriber(BufferBoundarySupplierSubscriber<T, U, B> bufferBoundarySupplierSubscriber) {
            this.parent = bufferBoundarySupplierSubscriber;
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.once) {
                return;
            }
            this.once = true;
            this.parent.next();
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.once) {
                RxJavaPlugins.onError(th);
            } else {
                this.once = true;
                this.parent.onError(th);
            }
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(B b2) {
            if (this.once) {
                return;
            }
            this.once = true;
            cancel();
            this.parent.next();
        }
    }

    /* loaded from: classes2.dex */
    public static final class BufferBoundarySupplierSubscriber<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements FlowableSubscriber<T>, d, Disposable {
        final Callable<? extends b> boundarySupplier;
        U buffer;
        final Callable<U> bufferSupplier;
        final AtomicReference<Disposable> other;
        d upstream;

        public BufferBoundarySupplierSubscriber(c cVar, Callable<U> callable, Callable<? extends b> callable2) {
            super(cVar, new MpscLinkedQueue());
            this.other = new AtomicReference<>();
            this.bufferSupplier = callable;
            this.boundarySupplier = callable2;
        }

        @Override // qg.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                disposeOther();
                if (enter()) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            disposeOther();
        }

        public void disposeOther() {
            DisposableHelper.dispose(this.other);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.other.get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        public void next() {
            try {
                U u4 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                try {
                    b bVar = (b) ObjectHelper.requireNonNull(this.boundarySupplier.call(), "The boundary publisher supplied is null");
                    BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(this);
                    if (DisposableHelper.replace(this.other, bufferBoundarySubscriber)) {
                        synchronized (this) {
                            try {
                                U u10 = this.buffer;
                                if (u10 == null) {
                                    return;
                                }
                                this.buffer = u4;
                                bVar.subscribe(bufferBoundarySubscriber);
                                fastPathEmitMax(u10, false, this);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    this.upstream.cancel();
                    this.downstream.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                cancel();
                this.downstream.onError(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            synchronized (this) {
                try {
                    U u4 = this.buffer;
                    if (u4 == null) {
                        return;
                    }
                    this.buffer = null;
                    this.queue.offer(u4);
                    this.done = true;
                    if (enter()) {
                        QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            cancel();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            synchronized (this) {
                try {
                    U u4 = this.buffer;
                    if (u4 == null) {
                        return;
                    }
                    u4.add(t5);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                c cVar = this.downstream;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    try {
                        b bVar = (b) ObjectHelper.requireNonNull(this.boundarySupplier.call(), "The boundary publisher supplied is null");
                        BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(this);
                        this.other.set(bufferBoundarySubscriber);
                        cVar.onSubscribe(this);
                        if (!this.cancelled) {
                            dVar.request(Long.MAX_VALUE);
                            bVar.subscribe(bufferBoundarySubscriber);
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        dVar.cancel();
                        EmptySubscription.error(th, cVar);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    dVar.cancel();
                    EmptySubscription.error(th2, cVar);
                }
            }
        }

        @Override // qg.d
        public void request(long j5) {
            requested(j5);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public boolean accept(c cVar, U u4) {
            this.downstream.onNext(u4);
            return true;
        }
    }

    public FlowableBufferBoundarySupplier(Flowable<T> flowable, Callable<? extends b> callable, Callable<U> callable2) {
        super(flowable);
        this.boundarySupplier = callable;
        this.bufferSupplier = callable2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new BufferBoundarySupplierSubscriber(new SerializedSubscriber(cVar), this.bufferSupplier, this.boundarySupplier));
    }
}
