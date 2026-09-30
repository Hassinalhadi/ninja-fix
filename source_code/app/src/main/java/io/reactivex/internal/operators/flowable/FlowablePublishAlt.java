package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowablePublishAlt<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, ResettableConnectable {
    final int bufferSize;
    final AtomicReference<PublishConnection<T>> current = new AtomicReference<>();
    final b source;

    /* loaded from: classes2.dex */
    public static final class InnerSubscription<T> extends AtomicLong implements d {
        private static final long serialVersionUID = 2845000326761540265L;
        final c downstream;
        long emitted;
        final PublishConnection<T> parent;

        public InnerSubscription(c cVar, PublishConnection<T> publishConnection) {
            this.downstream = cVar;
            this.parent = publishConnection;
        }

        @Override // qg.d
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.drain();
            }
        }

        public boolean isCancelled() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        @Override // qg.d
        public void request(long j5) {
            BackpressureHelper.addCancel(this, j5);
            this.parent.drain();
        }
    }

    /* loaded from: classes2.dex */
    public static final class PublishConnection<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        static final InnerSubscription[] EMPTY = new InnerSubscription[0];
        static final InnerSubscription[] TERMINATED = new InnerSubscription[0];
        private static final long serialVersionUID = -1672047311619175801L;
        final int bufferSize;
        int consumed;
        final AtomicReference<PublishConnection<T>> current;
        volatile boolean done;
        Throwable error;
        volatile SimpleQueue<T> queue;
        int sourceMode;
        final AtomicReference<d> upstream = new AtomicReference<>();
        final AtomicBoolean connect = new AtomicBoolean();
        final AtomicReference<InnerSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);

        public PublishConnection(AtomicReference<PublishConnection<T>> atomicReference, int i4) {
            this.current = atomicReference;
            this.bufferSize = i4;
        }

        public boolean add(InnerSubscription<T> innerSubscription) {
            while (true) {
                InnerSubscription<T>[] innerSubscriptionArr = this.subscribers.get();
                if (innerSubscriptionArr == TERMINATED) {
                    return false;
                }
                int length = innerSubscriptionArr.length;
                InnerSubscription<T>[] innerSubscriptionArr2 = new InnerSubscription[length + 1];
                System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
                AtomicReference<InnerSubscription<T>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2)) {
                    if (atomicReference.get() != innerSubscriptionArr) {
                        break;
                    }
                }
                return true;
            }
        }

        public boolean checkTerminated(boolean z2, boolean z10) {
            if (!z2 || !z10) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                signalError(th);
                return true;
            }
            for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (!innerSubscription.isCancelled()) {
                    innerSubscription.downstream.onComplete();
                }
            }
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.subscribers.getAndSet(TERMINATED);
            AtomicReference<PublishConnection<T>> atomicReference = this.current;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            SubscriptionHelper.cancel(this.upstream);
        }

        public void drain() {
            boolean z2;
            boolean z10;
            if (getAndIncrement() == 0) {
                SimpleQueue<T> simpleQueue = this.queue;
                int i4 = this.consumed;
                int i5 = this.bufferSize;
                int i10 = i5 - (i5 >> 2);
                if (this.sourceMode != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                SimpleQueue<T> simpleQueue2 = simpleQueue;
                int i11 = i4;
                int i12 = 1;
                while (true) {
                    if (simpleQueue2 != null) {
                        InnerSubscription<T>[] innerSubscriptionArr = this.subscribers.get();
                        long j5 = Long.MAX_VALUE;
                        boolean z11 = false;
                        for (InnerSubscription<T> innerSubscription : innerSubscriptionArr) {
                            long j6 = innerSubscription.get();
                            if (j6 != Long.MIN_VALUE) {
                                j5 = Math.min(j6 - innerSubscription.emitted, j5);
                                z11 = true;
                            }
                        }
                        if (!z11) {
                            j5 = 0;
                        }
                        for (long j7 = 0; j5 != j7; j7 = 0) {
                            boolean z12 = this.done;
                            try {
                                T poll = simpleQueue2.poll();
                                if (poll == null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!checkTerminated(z12, z10)) {
                                    if (z10) {
                                        break;
                                    }
                                    for (InnerSubscription<T> innerSubscription2 : innerSubscriptionArr) {
                                        if (!innerSubscription2.isCancelled()) {
                                            innerSubscription2.downstream.onNext(poll);
                                            innerSubscription2.emitted++;
                                        }
                                    }
                                    if (z2 && (i11 = i11 + 1) == i10) {
                                        this.upstream.get().request(i10);
                                        i11 = 0;
                                    }
                                    j5--;
                                    if (innerSubscriptionArr != this.subscribers.get()) {
                                        break;
                                    }
                                } else {
                                    return;
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.upstream.get().cancel();
                                simpleQueue2.clear();
                                this.done = true;
                                signalError(th);
                                return;
                            }
                        }
                        if (checkTerminated(this.done, simpleQueue2.isEmpty())) {
                            return;
                        }
                    }
                    this.consumed = i11;
                    i12 = addAndGet(-i12);
                    if (i12 == 0) {
                        return;
                    }
                    if (simpleQueue2 == null) {
                        simpleQueue2 = this.queue;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.subscribers.get() == TERMINATED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.sourceMode == 0 && !this.queue.offer(t5)) {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        dVar.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                dVar.request(this.bufferSize);
            }
        }

        public void remove(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            while (true) {
                InnerSubscription<T>[] innerSubscriptionArr2 = this.subscribers.get();
                int length = innerSubscriptionArr2.length;
                if (length != 0) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            if (innerSubscriptionArr2[i4] == innerSubscription) {
                                break;
                            } else {
                                i4++;
                            }
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    if (i4 < 0) {
                        return;
                    }
                    if (length == 1) {
                        innerSubscriptionArr = EMPTY;
                    } else {
                        InnerSubscription<T>[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                        System.arraycopy(innerSubscriptionArr2, 0, innerSubscriptionArr3, 0, i4);
                        System.arraycopy(innerSubscriptionArr2, i4 + 1, innerSubscriptionArr3, i4, (length - i4) - 1);
                        innerSubscriptionArr = innerSubscriptionArr3;
                    }
                    AtomicReference<InnerSubscription<T>[]> atomicReference = this.subscribers;
                    while (!atomicReference.compareAndSet(innerSubscriptionArr2, innerSubscriptionArr)) {
                        if (atomicReference.get() != innerSubscriptionArr2) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
        }

        public void signalError(Throwable th) {
            for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (!innerSubscription.isCancelled()) {
                    innerSubscription.downstream.onError(th);
                }
            }
        }
    }

    public FlowablePublishAlt(b bVar, int i4) {
        this.source = bVar;
        this.bufferSize = i4;
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        PublishConnection<T> publishConnection;
        loop0: while (true) {
            publishConnection = this.current.get();
            if (publishConnection != null && !publishConnection.isDisposed()) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.current, this.bufferSize);
            AtomicReference<PublishConnection<T>> atomicReference = this.current;
            while (!atomicReference.compareAndSet(publishConnection, publishConnection2)) {
                if (atomicReference.get() != publishConnection) {
                    break;
                }
            }
            publishConnection = publishConnection2;
            break loop0;
        }
        boolean z2 = false;
        if (!publishConnection.connect.get() && publishConnection.connect.compareAndSet(false, true)) {
            z2 = true;
        }
        try {
            consumer.accept(publishConnection);
            if (z2) {
                this.source.subscribe(publishConnection);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    public int publishBufferSize() {
        return this.bufferSize;
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable) {
        AtomicReference<PublishConnection<T>> atomicReference = this.current;
        PublishConnection<T> publishConnection = (PublishConnection) disposable;
        while (!atomicReference.compareAndSet(publishConnection, null) && atomicReference.get() == publishConnection) {
        }
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public b source() {
        return this.source;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        PublishConnection<T> publishConnection;
        loop0: while (true) {
            publishConnection = this.current.get();
            if (publishConnection != null) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.current, this.bufferSize);
            AtomicReference<PublishConnection<T>> atomicReference = this.current;
            while (!atomicReference.compareAndSet(publishConnection, publishConnection2)) {
                if (atomicReference.get() != publishConnection) {
                    break;
                }
            }
            publishConnection = publishConnection2;
            break loop0;
        }
        InnerSubscription<T> innerSubscription = new InnerSubscription<>(cVar, publishConnection);
        cVar.onSubscribe(innerSubscription);
        if (publishConnection.add(innerSubscription)) {
            if (innerSubscription.isCancelled()) {
                publishConnection.remove(innerSubscription);
                return;
            } else {
                publishConnection.drain();
                return;
            }
        }
        Throwable th = publishConnection.error;
        if (th != null) {
            cVar.onError(th);
        } else {
            cVar.onComplete();
        }
    }
}
