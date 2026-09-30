package io.reactivex.processors;

import com.airbnb.lottie.compose.LottieConstants;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class ReplayProcessor<T> extends FlowableProcessor<T> {
    final ReplayBuffer<T> buffer;
    boolean done;
    final AtomicReference<ReplaySubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
    private static final Object[] EMPTY_ARRAY = new Object[0];
    static final ReplaySubscription[] EMPTY = new ReplaySubscription[0];
    static final ReplaySubscription[] TERMINATED = new ReplaySubscription[0];

    /* loaded from: classes2.dex */
    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        public Node(T t5) {
            this.value = t5;
        }
    }

    /* loaded from: classes2.dex */
    public interface ReplayBuffer<T> {
        void complete();

        void error(Throwable th);

        Throwable getError();

        @Nullable
        T getValue();

        T[] getValues(T[] tArr);

        boolean isDone();

        void next(T t5);

        void replay(ReplaySubscription<T> replaySubscription);

        int size();

        void trimHead();
    }

    /* loaded from: classes2.dex */
    public static final class ReplaySubscription<T> extends AtomicInteger implements d {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final c downstream;
        long emitted;
        Object index;
        final AtomicLong requested = new AtomicLong();
        final ReplayProcessor<T> state;

        public ReplaySubscription(c cVar, ReplayProcessor<T> replayProcessor) {
            this.downstream = cVar;
            this.state = replayProcessor;
        }

        @Override // qg.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.remove(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                this.state.buffer.replay(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class SizeAndTimeBoundReplayBuffer<T> implements ReplayBuffer<T> {
        volatile boolean done;
        Throwable error;
        volatile TimedNode<T> head;
        final long maxAge;
        final int maxSize;
        final Scheduler scheduler;
        int size;
        TimedNode<T> tail;
        final TimeUnit unit;

        public SizeAndTimeBoundReplayBuffer(int i4, long j5, TimeUnit timeUnit, Scheduler scheduler) {
            this.maxSize = ObjectHelper.verifyPositive(i4, "maxSize");
            this.maxAge = ObjectHelper.verifyPositive(j5, "maxAge");
            this.unit = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
            this.scheduler = (Scheduler) ObjectHelper.requireNonNull(scheduler, "scheduler is null");
            TimedNode<T> timedNode = new TimedNode<>(null, 0L);
            this.tail = timedNode;
            this.head = timedNode;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
            trimFinal();
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(Throwable th) {
            trimFinal();
            this.error = th;
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public Throwable getError() {
            return this.error;
        }

        public TimedNode<T> getHead() {
            TimedNode<T> timedNode;
            TimedNode<T> timedNode2 = this.head;
            long now = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.time > now) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        @Nullable
        public T getValue() {
            TimedNode<T> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    break;
                }
                timedNode = timedNode2;
            }
            if (timedNode.time < this.scheduler.now(this.unit) - this.maxAge) {
                return null;
            }
            return timedNode.value;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] tArr) {
            TimedNode<T> head = getHead();
            int size = size(head);
            if (size == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i4 = 0; i4 != size; i4++) {
                head = head.get();
                tArr[i4] = head.value;
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
            return this.done;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T t5) {
            TimedNode<T> timedNode = new TimedNode<>(t5, this.scheduler.now(this.unit));
            TimedNode<T> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.set(timedNode);
            trim();
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(ReplaySubscription<T> replaySubscription) {
            boolean z2;
            if (replaySubscription.getAndIncrement() == 0) {
                c cVar = replaySubscription.downstream;
                TimedNode<T> timedNode = (TimedNode) replaySubscription.index;
                if (timedNode == null) {
                    timedNode = getHead();
                }
                long j5 = replaySubscription.emitted;
                int i4 = 1;
                do {
                    long j6 = replaySubscription.requested.get();
                    while (j5 != j6) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        boolean z10 = this.done;
                        TimedNode<T> timedNode2 = timedNode.get();
                        if (timedNode2 == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z10 && z2) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th = this.error;
                            if (th == null) {
                                cVar.onComplete();
                                return;
                            } else {
                                cVar.onError(th);
                                return;
                            }
                        }
                        if (z2) {
                            break;
                        }
                        cVar.onNext(timedNode2.value);
                        j5++;
                        timedNode = timedNode2;
                    }
                    if (j5 == j6) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        if (this.done && timedNode.get() == null) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th2 = this.error;
                            if (th2 == null) {
                                cVar.onComplete();
                                return;
                            } else {
                                cVar.onError(th2);
                                return;
                            }
                        }
                    }
                    replaySubscription.index = timedNode;
                    replaySubscription.emitted = j5;
                    i4 = replaySubscription.addAndGet(-i4);
                } while (i4 != 0);
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
            return size(getHead());
        }

        public void trim() {
            int i4 = this.size;
            if (i4 > this.maxSize) {
                this.size = i4 - 1;
                this.head = this.head.get();
            }
            long now = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<T> timedNode = this.head;
            while (this.size > 1) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    this.head = timedNode;
                    return;
                } else if (timedNode2.time > now) {
                    this.head = timedNode;
                    return;
                } else {
                    this.size--;
                    timedNode = timedNode2;
                }
            }
            this.head = timedNode;
        }

        public void trimFinal() {
            long now = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<T> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    if (timedNode.value != null) {
                        this.head = new TimedNode<>(null, 0L);
                        return;
                    } else {
                        this.head = timedNode;
                        return;
                    }
                }
                if (timedNode2.time > now) {
                    if (timedNode.value != null) {
                        TimedNode<T> timedNode3 = new TimedNode<>(null, 0L);
                        timedNode3.lazySet(timedNode.get());
                        this.head = timedNode3;
                        return;
                    }
                    this.head = timedNode;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
            if (this.head.value != null) {
                TimedNode<T> timedNode = new TimedNode<>(null, 0L);
                timedNode.lazySet(this.head.get());
                this.head = timedNode;
            }
        }

        public int size(TimedNode<T> timedNode) {
            int i4 = 0;
            while (i4 != Integer.MAX_VALUE && (timedNode = timedNode.get()) != null) {
                i4++;
            }
            return i4;
        }
    }

    /* loaded from: classes2.dex */
    public static final class SizeBoundReplayBuffer<T> implements ReplayBuffer<T> {
        volatile boolean done;
        Throwable error;
        volatile Node<T> head;
        final int maxSize;
        int size;
        Node<T> tail;

        public SizeBoundReplayBuffer(int i4) {
            this.maxSize = ObjectHelper.verifyPositive(i4, "maxSize");
            Node<T> node = new Node<>(null);
            this.tail = node;
            this.head = node;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
            trimHead();
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(Throwable th) {
            this.error = th;
            trimHead();
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public Throwable getError() {
            return this.error;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T getValue() {
            Node<T> node = this.head;
            while (true) {
                Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.value;
                }
                node = node2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] tArr) {
            Node<T> node = this.head;
            Node<T> node2 = node;
            int i4 = 0;
            while (true) {
                node2 = node2.get();
                if (node2 == null) {
                    break;
                }
                i4++;
            }
            if (tArr.length < i4) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i4));
            }
            for (int i5 = 0; i5 < i4; i5++) {
                node = node.get();
                tArr[i5] = node.value;
            }
            if (tArr.length > i4) {
                tArr[i4] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
            return this.done;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T t5) {
            Node<T> node = new Node<>(t5);
            Node<T> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            trim();
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(ReplaySubscription<T> replaySubscription) {
            boolean z2;
            if (replaySubscription.getAndIncrement() == 0) {
                c cVar = replaySubscription.downstream;
                Node<T> node = (Node) replaySubscription.index;
                if (node == null) {
                    node = this.head;
                }
                long j5 = replaySubscription.emitted;
                int i4 = 1;
                do {
                    long j6 = replaySubscription.requested.get();
                    while (j5 != j6) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        boolean z10 = this.done;
                        Node<T> node2 = node.get();
                        if (node2 == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z10 && z2) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th = this.error;
                            if (th == null) {
                                cVar.onComplete();
                                return;
                            } else {
                                cVar.onError(th);
                                return;
                            }
                        }
                        if (z2) {
                            break;
                        }
                        cVar.onNext(node2.value);
                        j5++;
                        node = node2;
                    }
                    if (j5 == j6) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        if (this.done && node.get() == null) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th2 = this.error;
                            if (th2 == null) {
                                cVar.onComplete();
                                return;
                            } else {
                                cVar.onError(th2);
                                return;
                            }
                        }
                    }
                    replaySubscription.index = node;
                    replaySubscription.emitted = j5;
                    i4 = replaySubscription.addAndGet(-i4);
                } while (i4 != 0);
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
            Node<T> node = this.head;
            int i4 = 0;
            while (i4 != Integer.MAX_VALUE && (node = node.get()) != null) {
                i4++;
            }
            return i4;
        }

        public void trim() {
            int i4 = this.size;
            if (i4 > this.maxSize) {
                this.size = i4 - 1;
                this.head = this.head.get();
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
            if (this.head.value != null) {
                Node<T> node = new Node<>(null);
                node.lazySet(this.head.get());
                this.head = node;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        public TimedNode(T t5, long j5) {
            this.value = t5;
            this.time = j5;
        }
    }

    /* loaded from: classes2.dex */
    public static final class UnboundedReplayBuffer<T> implements ReplayBuffer<T> {
        final List<T> buffer;
        volatile boolean done;
        Throwable error;
        volatile int size;

        public UnboundedReplayBuffer(int i4) {
            this.buffer = new ArrayList(ObjectHelper.verifyPositive(i4, "capacityHint"));
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(Throwable th) {
            this.error = th;
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public Throwable getError() {
            return this.error;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        @Nullable
        public T getValue() {
            int i4 = this.size;
            if (i4 == 0) {
                return null;
            }
            return this.buffer.get(i4 - 1);
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] tArr) {
            int i4 = this.size;
            if (i4 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<T> list = this.buffer;
            if (tArr.length < i4) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i4));
            }
            for (int i5 = 0; i5 < i4; i5++) {
                tArr[i5] = list.get(i5);
            }
            if (tArr.length > i4) {
                tArr[i4] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
            return this.done;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T t5) {
            this.buffer.add(t5);
            this.size++;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(ReplaySubscription<T> replaySubscription) {
            int i4;
            if (replaySubscription.getAndIncrement() == 0) {
                List<T> list = this.buffer;
                c cVar = replaySubscription.downstream;
                Integer num = (Integer) replaySubscription.index;
                if (num != null) {
                    i4 = num.intValue();
                } else {
                    i4 = 0;
                    replaySubscription.index = 0;
                }
                long j5 = replaySubscription.emitted;
                int i5 = 1;
                do {
                    long j6 = replaySubscription.requested.get();
                    while (j5 != j6) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        boolean z2 = this.done;
                        int i10 = this.size;
                        if (z2 && i4 == i10) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th = this.error;
                            if (th == null) {
                                cVar.onComplete();
                                return;
                            } else {
                                cVar.onError(th);
                                return;
                            }
                        }
                        if (i4 == i10) {
                            break;
                        }
                        cVar.onNext(list.get(i4));
                        i4++;
                        j5++;
                    }
                    if (j5 == j6) {
                        if (replaySubscription.cancelled) {
                            replaySubscription.index = null;
                            return;
                        }
                        boolean z10 = this.done;
                        int i11 = this.size;
                        if (z10 && i4 == i11) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th2 = this.error;
                            if (th2 == null) {
                                cVar.onComplete();
                                return;
                            } else {
                                cVar.onError(th2);
                                return;
                            }
                        }
                    }
                    replaySubscription.index = Integer.valueOf(i4);
                    replaySubscription.emitted = j5;
                    i5 = replaySubscription.addAndGet(-i5);
                } while (i5 != 0);
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
            return this.size;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
        }
    }

    public ReplayProcessor(ReplayBuffer<T> replayBuffer) {
        this.buffer = replayBuffer;
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create() {
        return new ReplayProcessor<>(new UnboundedReplayBuffer(16));
    }

    public static <T> ReplayProcessor<T> createUnbounded() {
        return new ReplayProcessor<>(new SizeBoundReplayBuffer(LottieConstants.IterateForever));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithSize(int i4) {
        return new ReplayProcessor<>(new SizeBoundReplayBuffer(i4));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTime(long j5, TimeUnit timeUnit, Scheduler scheduler) {
        return new ReplayProcessor<>(new SizeAndTimeBoundReplayBuffer(LottieConstants.IterateForever, j5, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTimeAndSize(long j5, TimeUnit timeUnit, Scheduler scheduler, int i4) {
        return new ReplayProcessor<>(new SizeAndTimeBoundReplayBuffer(i4, j5, timeUnit, scheduler));
    }

    public boolean add(ReplaySubscription<T> replaySubscription) {
        while (true) {
            ReplaySubscription<T>[] replaySubscriptionArr = this.subscribers.get();
            if (replaySubscriptionArr == TERMINATED) {
                return false;
            }
            int length = replaySubscriptionArr.length;
            ReplaySubscription<T>[] replaySubscriptionArr2 = new ReplaySubscription[length + 1];
            System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = replaySubscription;
            AtomicReference<ReplaySubscription<T>[]> atomicReference = this.subscribers;
            while (!atomicReference.compareAndSet(replaySubscriptionArr, replaySubscriptionArr2)) {
                if (atomicReference.get() != replaySubscriptionArr) {
                    break;
                }
            }
            return true;
        }
    }

    public void cleanupBuffer() {
        this.buffer.trimHead();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        ReplayBuffer<T> replayBuffer = this.buffer;
        if (replayBuffer.isDone()) {
            return replayBuffer.getError();
        }
        return null;
    }

    public T getValue() {
        return this.buffer.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = EMPTY_ARRAY;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        ReplayBuffer<T> replayBuffer = this.buffer;
        if (replayBuffer.isDone() && replayBuffer.getError() == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        if (this.subscribers.get().length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        ReplayBuffer<T> replayBuffer = this.buffer;
        if (replayBuffer.isDone() && replayBuffer.getError() != null) {
            return true;
        }
        return false;
    }

    public boolean hasValue() {
        if (this.buffer.size() != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onComplete() {
        if (!this.done) {
            this.done = true;
            ReplayBuffer<T> replayBuffer = this.buffer;
            replayBuffer.complete();
            for (ReplaySubscription<T> replaySubscription : this.subscribers.getAndSet(TERMINATED)) {
                replayBuffer.replay(replaySubscription);
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.done = true;
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.error(th);
        for (ReplaySubscription<T> replaySubscription : this.subscribers.getAndSet(TERMINATED)) {
            replayBuffer.replay(replaySubscription);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, qg.c
    public void onNext(T t5) {
        ObjectHelper.requireNonNull(t5, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.done) {
            ReplayBuffer<T> replayBuffer = this.buffer;
            replayBuffer.next(t5);
            for (ReplaySubscription<T> replaySubscription : this.subscribers.get()) {
                replayBuffer.replay(replaySubscription);
            }
        }
    }

    @Override // qg.c
    public void onSubscribe(d dVar) {
        if (this.done) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    public void remove(ReplaySubscription<T> replaySubscription) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        while (true) {
            ReplaySubscription<T>[] replaySubscriptionArr2 = this.subscribers.get();
            if (replaySubscriptionArr2 != TERMINATED && replaySubscriptionArr2 != EMPTY) {
                int length = replaySubscriptionArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        if (replaySubscriptionArr2[i4] == replaySubscription) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 >= 0) {
                    if (length == 1) {
                        replaySubscriptionArr = EMPTY;
                    } else {
                        ReplaySubscription<T>[] replaySubscriptionArr3 = new ReplaySubscription[length - 1];
                        System.arraycopy(replaySubscriptionArr2, 0, replaySubscriptionArr3, 0, i4);
                        System.arraycopy(replaySubscriptionArr2, i4 + 1, replaySubscriptionArr3, i4, (length - i4) - 1);
                        replaySubscriptionArr = replaySubscriptionArr3;
                    }
                    AtomicReference<ReplaySubscription<T>[]> atomicReference = this.subscribers;
                    while (!atomicReference.compareAndSet(replaySubscriptionArr2, replaySubscriptionArr)) {
                        if (atomicReference.get() != replaySubscriptionArr2) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
    }

    public int size() {
        return this.buffer.size();
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        ReplaySubscription<T> replaySubscription = new ReplaySubscription<>(cVar, this);
        cVar.onSubscribe(replaySubscription);
        if (add(replaySubscription) && replaySubscription.cancelled) {
            remove(replaySubscription);
        } else {
            this.buffer.replay(replaySubscription);
        }
    }

    public int subscriberCount() {
        return this.subscribers.get().length;
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create(int i4) {
        return new ReplayProcessor<>(new UnboundedReplayBuffer(i4));
    }

    public T[] getValues(T[] tArr) {
        return this.buffer.getValues(tArr);
    }
}
