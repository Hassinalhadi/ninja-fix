package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableCache<T> extends AbstractFlowableWithUpstream<T, T> implements FlowableSubscriber<T> {
    static final CacheSubscription[] EMPTY = new CacheSubscription[0];
    static final CacheSubscription[] TERMINATED = new CacheSubscription[0];
    final int capacityHint;
    volatile boolean done;
    Throwable error;
    final Node<T> head;
    final AtomicBoolean once;
    volatile long size;
    final AtomicReference<CacheSubscription<T>[]> subscribers;
    Node<T> tail;
    int tailOffset;

    /* loaded from: classes2.dex */
    public static final class CacheSubscription<T> extends AtomicInteger implements d {
        private static final long serialVersionUID = 6770240836423125754L;
        final c downstream;
        long index;
        Node<T> node;
        int offset;
        final FlowableCache<T> parent;
        final AtomicLong requested = new AtomicLong();

        public CacheSubscription(c cVar, FlowableCache<T> flowableCache) {
            this.downstream = cVar;
            this.parent = flowableCache;
            this.node = flowableCache.head;
        }

        @Override // qg.d
        public void cancel() {
            if (this.requested.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.addCancel(this.requested, j5);
                this.parent.replay(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Node<T> {
        volatile Node<T> next;
        final T[] values;

        public Node(int i4) {
            this.values = (T[]) new Object[i4];
        }
    }

    public FlowableCache(Flowable<T> flowable, int i4) {
        super(flowable);
        this.capacityHint = i4;
        this.once = new AtomicBoolean();
        Node<T> node = new Node<>(i4);
        this.head = node;
        this.tail = node;
        this.subscribers = new AtomicReference<>(EMPTY);
    }

    public void add(CacheSubscription<T> cacheSubscription) {
        while (true) {
            CacheSubscription<T>[] cacheSubscriptionArr = this.subscribers.get();
            if (cacheSubscriptionArr == TERMINATED) {
                return;
            }
            int length = cacheSubscriptionArr.length;
            CacheSubscription<T>[] cacheSubscriptionArr2 = new CacheSubscription[length + 1];
            System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr2, 0, length);
            cacheSubscriptionArr2[length] = cacheSubscription;
            AtomicReference<CacheSubscription<T>[]> atomicReference = this.subscribers;
            while (!atomicReference.compareAndSet(cacheSubscriptionArr, cacheSubscriptionArr2)) {
                if (atomicReference.get() != cacheSubscriptionArr) {
                    break;
                }
            }
            return;
        }
    }

    public long cachedEventCount() {
        return this.size;
    }

    public boolean hasSubscribers() {
        if (this.subscribers.get().length != 0) {
            return true;
        }
        return false;
    }

    public boolean isConnected() {
        return this.once.get();
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onComplete() {
        this.done = true;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.getAndSet(TERMINATED)) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.getAndSet(TERMINATED)) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onNext(T t5) {
        int i4 = this.tailOffset;
        if (i4 == this.capacityHint) {
            Node<T> node = new Node<>(i4);
            node.values[0] = t5;
            this.tailOffset = 1;
            this.tail.next = node;
            this.tail = node;
        } else {
            this.tail.values[i4] = t5;
            this.tailOffset = i4 + 1;
        }
        this.size++;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.get()) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onSubscribe(d dVar) {
        dVar.request(Long.MAX_VALUE);
    }

    public void remove(CacheSubscription<T> cacheSubscription) {
        CacheSubscription<T>[] cacheSubscriptionArr;
        while (true) {
            CacheSubscription<T>[] cacheSubscriptionArr2 = this.subscribers.get();
            int length = cacheSubscriptionArr2.length;
            if (length != 0) {
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        if (cacheSubscriptionArr2[i4] == cacheSubscription) {
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
                    cacheSubscriptionArr = EMPTY;
                } else {
                    CacheSubscription<T>[] cacheSubscriptionArr3 = new CacheSubscription[length - 1];
                    System.arraycopy(cacheSubscriptionArr2, 0, cacheSubscriptionArr3, 0, i4);
                    System.arraycopy(cacheSubscriptionArr2, i4 + 1, cacheSubscriptionArr3, i4, (length - i4) - 1);
                    cacheSubscriptionArr = cacheSubscriptionArr3;
                }
                AtomicReference<CacheSubscription<T>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(cacheSubscriptionArr2, cacheSubscriptionArr)) {
                    if (atomicReference.get() != cacheSubscriptionArr2) {
                        break;
                    }
                }
                return;
            }
            return;
        }
    }

    public void replay(CacheSubscription<T> cacheSubscription) {
        boolean z2;
        if (cacheSubscription.getAndIncrement() == 0) {
            long j5 = cacheSubscription.index;
            int i4 = cacheSubscription.offset;
            Node<T> node = cacheSubscription.node;
            AtomicLong atomicLong = cacheSubscription.requested;
            c cVar = cacheSubscription.downstream;
            int i5 = this.capacityHint;
            int i10 = 1;
            while (true) {
                boolean z10 = this.done;
                if (this.size == j5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z10 && z2) {
                    cacheSubscription.node = null;
                    Throwable th = this.error;
                    if (th != null) {
                        cVar.onError(th);
                        return;
                    } else {
                        cVar.onComplete();
                        return;
                    }
                }
                if (!z2) {
                    long j6 = atomicLong.get();
                    if (j6 == Long.MIN_VALUE) {
                        cacheSubscription.node = null;
                        return;
                    } else if (j6 != j5) {
                        if (i4 == i5) {
                            node = node.next;
                            i4 = 0;
                        }
                        cVar.onNext(node.values[i4]);
                        i4++;
                        j5++;
                    }
                }
                cacheSubscription.index = j5;
                cacheSubscription.offset = i4;
                cacheSubscription.node = node;
                i10 = cacheSubscription.addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        CacheSubscription<T> cacheSubscription = new CacheSubscription<>(cVar, this);
        cVar.onSubscribe(cacheSubscription);
        add(cacheSubscription);
        if (!this.once.get() && this.once.compareAndSet(false, true)) {
            this.source.subscribe((FlowableSubscriber) this);
        } else {
            replay(cacheSubscription);
        }
    }
}
