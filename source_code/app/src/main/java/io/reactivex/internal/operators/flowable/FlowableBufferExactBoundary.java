package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.concurrent.Callable;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableBufferExactBoundary<T, U extends Collection<? super T>, B> extends AbstractFlowableWithUpstream<T, U> {
    final b boundary;
    final Callable<U> bufferSupplier;

    /* loaded from: classes2.dex */
    public static final class BufferBoundarySubscriber<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {
        final BufferExactBoundarySubscriber<T, U, B> parent;

        public BufferBoundarySubscriber(BufferExactBoundarySubscriber<T, U, B> bufferExactBoundarySubscriber) {
            this.parent = bufferExactBoundarySubscriber;
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.parent.onComplete();
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.parent.onError(th);
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(B b2) {
            this.parent.next();
        }
    }

    /* loaded from: classes2.dex */
    public static final class BufferExactBoundarySubscriber<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements FlowableSubscriber<T>, d, Disposable {
        final b boundary;
        U buffer;
        final Callable<U> bufferSupplier;
        Disposable other;
        d upstream;

        public BufferExactBoundarySubscriber(c cVar, Callable<U> callable, b bVar) {
            super(cVar, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.boundary = bVar;
        }

        @Override // qg.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.other.dispose();
                this.upstream.cancel();
                if (enter()) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void next() {
            try {
                U u4 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        U u10 = this.buffer;
                        if (u10 == null) {
                            return;
                        }
                        this.buffer = u4;
                        fastPathEmitMax(u10, false, this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                this.downstream.onError(th2);
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
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(this);
                    this.other = bufferBoundarySubscriber;
                    this.downstream.onSubscribe(this);
                    if (!this.cancelled) {
                        dVar.request(Long.MAX_VALUE);
                        this.boundary.subscribe(bufferBoundarySubscriber);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.cancelled = true;
                    dVar.cancel();
                    EmptySubscription.error(th, this.downstream);
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

    public FlowableBufferExactBoundary(Flowable<T> flowable, b bVar, Callable<U> callable) {
        super(flowable);
        this.boundary = bVar;
        this.bufferSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new BufferExactBoundarySubscriber(new SerializedSubscriber(cVar), this.bufferSupplier, this.boundary));
    }
}
