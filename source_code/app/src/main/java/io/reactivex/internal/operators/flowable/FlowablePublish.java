package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, FlowablePublishClassic<T> {
    static final long CANCELLED = Long.MIN_VALUE;
    final int bufferSize;
    final AtomicReference<PublishSubscriber<T>> current;
    final b onSubscribe;
    final Flowable<T> source;

    /* loaded from: classes2.dex */
    public static final class FlowablePublisher<T> implements b {
        private final int bufferSize;
        private final AtomicReference<PublishSubscriber<T>> curr;

        public FlowablePublisher(AtomicReference<PublishSubscriber<T>> atomicReference, int i4) {
            this.curr = atomicReference;
            this.bufferSize = i4;
        }

        @Override // qg.b
        public void subscribe(c cVar) {
            PublishSubscriber<T> publishSubscriber;
            InnerSubscriber<T> innerSubscriber = new InnerSubscriber<>(cVar);
            cVar.onSubscribe(innerSubscriber);
            while (true) {
                publishSubscriber = this.curr.get();
                if (publishSubscriber == null || publishSubscriber.isDisposed()) {
                    PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.curr, this.bufferSize);
                    AtomicReference<PublishSubscriber<T>> atomicReference = this.curr;
                    while (!atomicReference.compareAndSet(publishSubscriber, publishSubscriber2)) {
                        if (atomicReference.get() != publishSubscriber) {
                            break;
                        }
                    }
                    publishSubscriber = publishSubscriber2;
                }
                if (publishSubscriber.add(innerSubscriber)) {
                    break;
                }
            }
            if (innerSubscriber.get() == FlowablePublish.CANCELLED) {
                publishSubscriber.remove(innerSubscriber);
            } else {
                innerSubscriber.parent = publishSubscriber;
            }
            publishSubscriber.dispatch();
        }
    }

    /* loaded from: classes2.dex */
    public static final class InnerSubscriber<T> extends AtomicLong implements d {
        private static final long serialVersionUID = -4453897557930727610L;
        final c child;
        long emitted;
        volatile PublishSubscriber<T> parent;

        public InnerSubscriber(c cVar) {
            this.child = cVar;
        }

        @Override // qg.d
        public void cancel() {
            PublishSubscriber<T> publishSubscriber;
            if (get() != FlowablePublish.CANCELLED && getAndSet(FlowablePublish.CANCELLED) != FlowablePublish.CANCELLED && (publishSubscriber = this.parent) != null) {
                publishSubscriber.remove(this);
                publishSubscriber.dispatch();
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.addCancel(this, j5);
                PublishSubscriber<T> publishSubscriber = this.parent;
                if (publishSubscriber != null) {
                    publishSubscriber.dispatch();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class PublishSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        static final InnerSubscriber[] EMPTY = new InnerSubscriber[0];
        static final InnerSubscriber[] TERMINATED = new InnerSubscriber[0];
        private static final long serialVersionUID = -202316842419149694L;
        final int bufferSize;
        final AtomicReference<PublishSubscriber<T>> current;
        volatile SimpleQueue<T> queue;
        int sourceMode;
        volatile Object terminalEvent;
        final AtomicReference<d> upstream = new AtomicReference<>();
        final AtomicReference<InnerSubscriber<T>[]> subscribers = new AtomicReference<>(EMPTY);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        public PublishSubscriber(AtomicReference<PublishSubscriber<T>> atomicReference, int i4) {
            this.current = atomicReference;
            this.bufferSize = i4;
        }

        public boolean add(InnerSubscriber<T> innerSubscriber) {
            while (true) {
                InnerSubscriber<T>[] innerSubscriberArr = this.subscribers.get();
                if (innerSubscriberArr == TERMINATED) {
                    return false;
                }
                int length = innerSubscriberArr.length;
                InnerSubscriber<T>[] innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
                AtomicReference<InnerSubscriber<T>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(innerSubscriberArr, innerSubscriberArr2)) {
                    if (atomicReference.get() != innerSubscriberArr) {
                        break;
                    }
                }
                return true;
            }
        }

        public boolean checkTerminated(Object obj, boolean z2) {
            int i4 = 0;
            if (obj != null) {
                if (NotificationLite.isComplete(obj)) {
                    if (z2) {
                        AtomicReference<PublishSubscriber<T>> atomicReference = this.current;
                        while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
                        }
                        InnerSubscriber<T>[] andSet = this.subscribers.getAndSet(TERMINATED);
                        int length = andSet.length;
                        while (i4 < length) {
                            andSet[i4].child.onComplete();
                            i4++;
                        }
                        return true;
                    }
                } else {
                    Throwable error = NotificationLite.getError(obj);
                    AtomicReference<PublishSubscriber<T>> atomicReference2 = this.current;
                    while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                    }
                    InnerSubscriber<T>[] andSet2 = this.subscribers.getAndSet(TERMINATED);
                    if (andSet2.length != 0) {
                        int length2 = andSet2.length;
                        while (i4 < length2) {
                            andSet2[i4].child.onError(error);
                            i4++;
                        }
                    } else {
                        RxJavaPlugins.onError(error);
                    }
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x0125, code lost:
        
            if (r11 == 0) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x012a, code lost:
        
            if (r26.sourceMode == 1) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x012c, code lost:
        
            r26.upstream.get().request(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0138, code lost:
        
            r4 = r0;
            r3 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0156, code lost:
        
            if (r8 == false) goto L88;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void dispatch() {
            boolean z2;
            boolean z10;
            T t5;
            boolean z11;
            InnerSubscriber<T>[] innerSubscriberArr;
            long j5;
            T t10;
            boolean z12;
            InnerSubscriber<T>[] innerSubscriberArr2;
            if (getAndIncrement() == 0) {
                AtomicReference<InnerSubscriber<T>[]> atomicReference = this.subscribers;
                boolean z13 = true;
                InnerSubscriber<T>[] innerSubscriberArr3 = atomicReference.get();
                int i4 = 1;
                while (true) {
                    Object obj = this.terminalEvent;
                    SimpleQueue<T> simpleQueue = this.queue;
                    if (simpleQueue != null && !simpleQueue.isEmpty()) {
                        z2 = false;
                    } else {
                        z2 = z13;
                    }
                    if (!checkTerminated(obj, z2)) {
                        if (!z2) {
                            int length = innerSubscriberArr3.length;
                            int i5 = 0;
                            long j6 = Long.MAX_VALUE;
                            for (InnerSubscriber<T> innerSubscriber : innerSubscriberArr3) {
                                long j7 = innerSubscriber.get();
                                if (j7 != FlowablePublish.CANCELLED) {
                                    j6 = Math.min(j6, j7 - innerSubscriber.emitted);
                                } else {
                                    i5++;
                                }
                            }
                            long j10 = 1;
                            if (length == i5) {
                                Object obj2 = this.terminalEvent;
                                try {
                                    t5 = simpleQueue.poll();
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    this.upstream.get().cancel();
                                    obj2 = NotificationLite.error(th);
                                    this.terminalEvent = obj2;
                                    t5 = null;
                                }
                                if (t5 == null) {
                                    z11 = z13;
                                } else {
                                    z11 = false;
                                }
                                if (!checkTerminated(obj2, z11)) {
                                    if (this.sourceMode != z13) {
                                        this.upstream.get().request(1L);
                                    }
                                    z10 = z13;
                                    innerSubscriberArr = innerSubscriberArr3;
                                } else {
                                    return;
                                }
                            } else {
                                int i10 = 0;
                                while (true) {
                                    j5 = i10;
                                    if (j5 >= j6) {
                                        break;
                                    }
                                    Object obj3 = this.terminalEvent;
                                    try {
                                        t10 = simpleQueue.poll();
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        this.upstream.get().cancel();
                                        obj3 = NotificationLite.error(th2);
                                        this.terminalEvent = obj3;
                                        t10 = null;
                                    }
                                    if (t10 == null) {
                                        z12 = z13;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!checkTerminated(obj3, z12)) {
                                        if (z12) {
                                            z2 = z12;
                                            break;
                                        }
                                        Object value = NotificationLite.getValue(t10);
                                        int length2 = innerSubscriberArr3.length;
                                        int i11 = 0;
                                        boolean z14 = false;
                                        while (i11 < length2) {
                                            long j11 = j10;
                                            InnerSubscriber<T> innerSubscriber2 = innerSubscriberArr3[i11];
                                            long j12 = innerSubscriber2.get();
                                            if (j12 != FlowablePublish.CANCELLED) {
                                                innerSubscriberArr2 = innerSubscriberArr3;
                                                if (j12 != Long.MAX_VALUE) {
                                                    innerSubscriber2.emitted += j11;
                                                }
                                                innerSubscriber2.child.onNext(value);
                                            } else {
                                                innerSubscriberArr2 = innerSubscriberArr3;
                                                z14 = true;
                                            }
                                            i11++;
                                            innerSubscriberArr3 = innerSubscriberArr2;
                                            j10 = j11;
                                        }
                                        InnerSubscriber<T>[] innerSubscriberArr4 = innerSubscriberArr3;
                                        long j13 = j10;
                                        i10++;
                                        InnerSubscriber<T>[] innerSubscriberArr5 = atomicReference.get();
                                        if (z14 || innerSubscriberArr5 != innerSubscriberArr4) {
                                            break;
                                        }
                                        innerSubscriberArr3 = innerSubscriberArr4;
                                        z2 = z12;
                                        j10 = j13;
                                        z13 = true;
                                    } else {
                                        return;
                                    }
                                }
                                innerSubscriberArr = innerSubscriberArr3;
                                if (i10 != 0) {
                                    z10 = true;
                                    if (this.sourceMode != 1) {
                                        this.upstream.get().request(j5);
                                    }
                                } else {
                                    z10 = true;
                                }
                                if (j6 != 0) {
                                }
                            }
                            innerSubscriberArr3 = innerSubscriberArr;
                            z13 = z10;
                        } else {
                            z10 = z13;
                        }
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                        innerSubscriberArr3 = atomicReference.get();
                        z13 = z10;
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            InnerSubscriber<T>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<T>[] innerSubscriberArr2 = TERMINATED;
            if (innerSubscriberArr != innerSubscriberArr2 && this.subscribers.getAndSet(innerSubscriberArr2) != innerSubscriberArr2) {
                AtomicReference<PublishSubscriber<T>> atomicReference = this.current;
                while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
                }
                SubscriptionHelper.cancel(this.upstream);
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
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.complete();
                dispatch();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.error(th);
                dispatch();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.sourceMode == 0 && !this.queue.offer(t5)) {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            } else {
                dispatch();
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
                        this.terminalEvent = NotificationLite.complete();
                        dispatch();
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

        public void remove(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber<T>[] innerSubscriberArr;
            while (true) {
                InnerSubscriber<T>[] innerSubscriberArr2 = this.subscribers.get();
                int length = innerSubscriberArr2.length;
                if (length != 0) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            if (innerSubscriberArr2[i4].equals(innerSubscriber)) {
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
                        innerSubscriberArr = EMPTY;
                    } else {
                        InnerSubscriber<T>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                        System.arraycopy(innerSubscriberArr2, 0, innerSubscriberArr3, 0, i4);
                        System.arraycopy(innerSubscriberArr2, i4 + 1, innerSubscriberArr3, i4, (length - i4) - 1);
                        innerSubscriberArr = innerSubscriberArr3;
                    }
                    AtomicReference<InnerSubscriber<T>[]> atomicReference = this.subscribers;
                    while (!atomicReference.compareAndSet(innerSubscriberArr2, innerSubscriberArr)) {
                        if (atomicReference.get() != innerSubscriberArr2) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    private FlowablePublish(b bVar, Flowable<T> flowable, AtomicReference<PublishSubscriber<T>> atomicReference, int i4) {
        this.onSubscribe = bVar;
        this.source = flowable;
        this.current = atomicReference;
        this.bufferSize = i4;
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, int i4) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowablePublish(new FlowablePublisher(atomicReference, i4), flowable, atomicReference, i4));
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        PublishSubscriber<T> publishSubscriber;
        loop0: while (true) {
            publishSubscriber = this.current.get();
            if (publishSubscriber != null && !publishSubscriber.isDisposed()) {
                break;
            }
            PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.current, this.bufferSize);
            AtomicReference<PublishSubscriber<T>> atomicReference = this.current;
            while (!atomicReference.compareAndSet(publishSubscriber, publishSubscriber2)) {
                if (atomicReference.get() != publishSubscriber) {
                    break;
                }
            }
            publishSubscriber = publishSubscriber2;
            break loop0;
        }
        boolean z2 = false;
        if (!publishSubscriber.shouldConnect.get() && publishSubscriber.shouldConnect.compareAndSet(false, true)) {
            z2 = true;
        }
        try {
            consumer.accept(publishSubscriber);
            if (z2) {
                this.source.subscribe((FlowableSubscriber) publishSubscriber);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowablePublishClassic
    public int publishBufferSize() {
        return this.bufferSize;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowablePublishClassic
    public b publishSource() {
        return this.source;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public b source() {
        return this.source;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.onSubscribe.subscribe(cVar);
    }
}
