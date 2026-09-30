package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.GroupedFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.EmptyComponent;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableGroupBy<T, K, V> extends AbstractFlowableWithUpstream<T, GroupedFlowable<K, V>> {
    final int bufferSize;
    final boolean delayError;
    final Function<? super T, ? extends K> keySelector;
    final Function<? super Consumer<Object>, ? extends Map<K, Object>> mapFactory;
    final Function<? super T, ? extends V> valueSelector;

    /* loaded from: classes2.dex */
    public static final class EvictionAction<K, V> implements Consumer<GroupedUnicast<K, V>> {
        final Queue<GroupedUnicast<K, V>> evictedGroups;

        public EvictionAction(Queue<GroupedUnicast<K, V>> queue) {
            this.evictedGroups = queue;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(GroupedUnicast<K, V> groupedUnicast) {
            this.evictedGroups.offer(groupedUnicast);
        }
    }

    /* loaded from: classes2.dex */
    public static final class GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<GroupedFlowable<K, V>> implements FlowableSubscriber<T> {
        static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final boolean delayError;
        boolean done;
        final c downstream;
        Throwable error;
        final Queue<GroupedUnicast<K, V>> evictedGroups;
        volatile boolean finished;
        final Map<Object, GroupedUnicast<K, V>> groups;
        final Function<? super T, ? extends K> keySelector;
        boolean outputFused;
        final SpscLinkedArrayQueue<GroupedFlowable<K, V>> queue;
        d upstream;
        final Function<? super T, ? extends V> valueSelector;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger groupCount = new AtomicInteger(1);

        public GroupBySubscriber(c cVar, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i4, boolean z2, Map<Object, GroupedUnicast<K, V>> map, Queue<GroupedUnicast<K, V>> queue) {
            this.downstream = cVar;
            this.keySelector = function;
            this.valueSelector = function2;
            this.bufferSize = i4;
            this.delayError = z2;
            this.groups = map;
            this.evictedGroups = queue;
            this.queue = new SpscLinkedArrayQueue<>(i4);
        }

        private void completeEvictions() {
            if (this.evictedGroups != null) {
                int i4 = 0;
                while (true) {
                    GroupedUnicast<K, V> poll = this.evictedGroups.poll();
                    if (poll == null) {
                        break;
                    }
                    poll.onComplete();
                    i4++;
                }
                if (i4 != 0) {
                    this.groupCount.addAndGet(-i4);
                }
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                completeEvictions();
                if (this.groupCount.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        public boolean checkTerminated(boolean z2, boolean z10, c cVar, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled.get()) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (this.delayError) {
                if (z2 && z10) {
                    Throwable th = this.error;
                    if (th != null) {
                        cVar.onError(th);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
                return false;
            }
            if (z2) {
                Throwable th2 = this.error;
                if (th2 != null) {
                    spscLinkedArrayQueue.clear();
                    cVar.onError(th2);
                    return true;
                }
                if (z10) {
                    cVar.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        public void drainFused() {
            Throwable th;
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            c cVar = this.downstream;
            int i4 = 1;
            while (!this.cancelled.get()) {
                boolean z2 = this.finished;
                if (z2 && !this.delayError && (th = this.error) != null) {
                    spscLinkedArrayQueue.clear();
                    cVar.onError(th);
                    return;
                }
                cVar.onNext(null);
                if (z2) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                        return;
                    } else {
                        cVar.onComplete();
                        return;
                    }
                }
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
            }
        }

        public void drainNormal() {
            boolean z2;
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            c cVar = this.downstream;
            int i4 = 1;
            do {
                long j5 = this.requested.get();
                long j6 = 0;
                while (j6 != j5) {
                    boolean z10 = this.finished;
                    GroupedFlowable<K, V> poll = spscLinkedArrayQueue.poll();
                    if (poll == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!checkTerminated(z10, z2, cVar, spscLinkedArrayQueue)) {
                        if (z2) {
                            break;
                        }
                        cVar.onNext(poll);
                        j6++;
                    } else {
                        return;
                    }
                }
                if (j6 != j5 || !checkTerminated(this.finished, spscLinkedArrayQueue.isEmpty(), cVar, spscLinkedArrayQueue)) {
                    if (j6 != 0) {
                        if (j5 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j6);
                        }
                        this.upstream.request(j6);
                    }
                    i4 = addAndGet(-i4);
                } else {
                    return;
                }
            } while (i4 != 0);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (!this.done) {
                Iterator<GroupedUnicast<K, V>> it = this.groups.values().iterator();
                while (it.hasNext()) {
                    it.next().onComplete();
                }
                this.groups.clear();
                Queue<GroupedUnicast<K, V>> queue = this.evictedGroups;
                if (queue != null) {
                    queue.clear();
                }
                this.done = true;
                this.finished = true;
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            Iterator<GroupedUnicast<K, V>> it = this.groups.values().iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.groups.clear();
            Queue<GroupedUnicast<K, V>> queue = this.evictedGroups;
            if (queue != null) {
                queue.clear();
            }
            this.error = th;
            this.finished = true;
            drain();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            Object obj;
            boolean z2;
            GroupedUnicast groupedUnicast;
            if (!this.done) {
                SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
                try {
                    K apply = this.keySelector.apply(t5);
                    if (apply != null) {
                        obj = apply;
                    } else {
                        obj = NULL_KEY;
                    }
                    GroupedUnicast<K, V> groupedUnicast2 = this.groups.get(obj);
                    if (groupedUnicast2 == null) {
                        if (!this.cancelled.get()) {
                            GroupedUnicast createWith = GroupedUnicast.createWith(apply, this.bufferSize, this, this.delayError);
                            this.groups.put(obj, createWith);
                            this.groupCount.getAndIncrement();
                            z2 = true;
                            groupedUnicast = createWith;
                        } else {
                            return;
                        }
                    } else {
                        z2 = false;
                        groupedUnicast = groupedUnicast2;
                    }
                    try {
                        groupedUnicast.onNext(ObjectHelper.requireNonNull(this.valueSelector.apply(t5), "The valueSelector returned null"));
                        completeEvictions();
                        if (z2) {
                            spscLinkedArrayQueue.offer(groupedUnicast);
                            drain();
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.upstream.cancel();
                        onError(th);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(this.bufferSize);
            }
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

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public GroupedFlowable<K, V> poll() {
            return this.queue.poll();
        }

        public void cancel(K k6) {
            if (k6 == null) {
                k6 = (K) NULL_KEY;
            }
            this.groups.remove(k6);
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
                if (this.outputFused || getAndIncrement() != 0) {
                    return;
                }
                this.queue.clear();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class GroupedUnicast<K, T> extends GroupedFlowable<K, T> {
        final State<T, K> state;

        public GroupedUnicast(K k6, State<T, K> state) {
            super(k6);
            this.state = state;
        }

        public static <T, K> GroupedUnicast<K, T> createWith(K k6, int i4, GroupBySubscriber<?, K, T> groupBySubscriber, boolean z2) {
            return new GroupedUnicast<>(k6, new State(i4, groupBySubscriber, k6, z2));
        }

        public void onComplete() {
            this.state.onComplete();
        }

        public void onError(Throwable th) {
            this.state.onError(th);
        }

        public void onNext(T t5) {
            this.state.onNext(t5);
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(c cVar) {
            this.state.subscribe(cVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class State<T, K> extends BasicIntQueueSubscription<T> implements b {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        boolean outputFused;
        final GroupBySubscriber<?, K, T> parent;
        int produced;
        final SpscLinkedArrayQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicReference<c> actual = new AtomicReference<>();
        final AtomicBoolean once = new AtomicBoolean();

        public State(int i4, GroupBySubscriber<?, K, T> groupBySubscriber, K k6, boolean z2) {
            this.queue = new SpscLinkedArrayQueue<>(i4);
            this.parent = groupBySubscriber;
            this.key = k6;
            this.delayError = z2;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                this.parent.cancel(this.key);
                drain();
            }
        }

        public boolean checkTerminated(boolean z2, boolean z10, c cVar, boolean z11, long j5) {
            if (this.cancelled.get()) {
                while (this.queue.poll() != null) {
                    j5++;
                }
                if (j5 != 0) {
                    this.parent.upstream.request(j5);
                }
                return true;
            }
            if (z2) {
                if (z11) {
                    if (z10) {
                        Throwable th = this.error;
                        if (th != null) {
                            cVar.onError(th);
                        } else {
                            cVar.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.error;
                if (th2 != null) {
                    this.queue.clear();
                    cVar.onError(th2);
                    return true;
                }
                if (z10) {
                    cVar.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            while (spscLinkedArrayQueue.poll() != null) {
                this.produced++;
            }
            tryReplenish();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        public void drainFused() {
            Throwable th;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            c cVar = this.actual.get();
            int i4 = 1;
            while (true) {
                if (cVar != null) {
                    if (!this.cancelled.get()) {
                        boolean z2 = this.done;
                        if (z2 && !this.delayError && (th = this.error) != null) {
                            spscLinkedArrayQueue.clear();
                            cVar.onError(th);
                            return;
                        }
                        cVar.onNext(null);
                        if (z2) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                cVar.onError(th2);
                                return;
                            } else {
                                cVar.onComplete();
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
                if (cVar == null) {
                    cVar = this.actual.get();
                }
            }
        }

        public void drainNormal() {
            boolean z2;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            boolean z10 = this.delayError;
            c cVar = this.actual.get();
            int i4 = 1;
            while (true) {
                if (cVar != null) {
                    long j5 = this.requested.get();
                    long j6 = 0;
                    while (j6 != j5) {
                        boolean z11 = this.done;
                        T poll = spscLinkedArrayQueue.poll();
                        if (poll == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!checkTerminated(z11, z2, cVar, z10, j6)) {
                            if (z2) {
                                break;
                            }
                            cVar.onNext(poll);
                            j6++;
                        } else {
                            return;
                        }
                    }
                    if (j6 != j5 || !checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), cVar, z10, j6)) {
                        if (j6 != 0) {
                            if (j5 != Long.MAX_VALUE) {
                                this.requested.addAndGet(-j6);
                            }
                            this.parent.upstream.request(j6);
                        }
                    } else {
                        return;
                    }
                }
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
                if (cVar == null) {
                    cVar = this.actual.get();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            if (this.queue.isEmpty()) {
                tryReplenish();
                return true;
            }
            return false;
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onNext(T t5) {
            this.queue.offer(t5);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            T poll = this.queue.poll();
            if (poll != null) {
                this.produced++;
                return poll;
            }
            tryReplenish();
            return null;
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

        @Override // qg.b
        public void subscribe(c cVar) {
            if (this.once.compareAndSet(false, true)) {
                cVar.onSubscribe(this);
                this.actual.lazySet(cVar);
                drain();
                return;
            }
            EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), cVar);
        }

        public void tryReplenish() {
            int i4 = this.produced;
            if (i4 != 0) {
                this.produced = 0;
                this.parent.upstream.request(i4);
            }
        }
    }

    public FlowableGroupBy(Flowable<T> flowable, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i4, boolean z2, Function<? super Consumer<Object>, ? extends Map<K, Object>> function3) {
        super(flowable);
        this.keySelector = function;
        this.valueSelector = function2;
        this.bufferSize = i4;
        this.delayError = z2;
        this.mapFactory = function3;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map<K, Object> apply;
        try {
            if (this.mapFactory == null) {
                apply = new ConcurrentHashMap<>();
                concurrentLinkedQueue = null;
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                apply = this.mapFactory.apply(new EvictionAction(concurrentLinkedQueue));
            }
            this.source.subscribe((FlowableSubscriber) new GroupBySubscriber(cVar, this.keySelector, this.valueSelector, this.bufferSize, this.delayError, apply, concurrentLinkedQueue));
        } catch (Exception e) {
            Exceptions.throwIfFatal(e);
            cVar.onSubscribe(EmptyComponent.INSTANCE);
            cVar.onError(e);
        }
    }
}
