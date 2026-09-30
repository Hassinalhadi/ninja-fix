package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableWindowTimed<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int bufferSize;
    final long maxSize;
    final boolean restartTimerOnMaxSize;
    final Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class WindowExactBoundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements d {
        final int bufferSize;
        long count;
        final long maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        final Scheduler scheduler;
        volatile boolean terminated;
        final SequentialDisposable timer;
        final long timespan;
        final TimeUnit unit;
        d upstream;
        UnicastProcessor<T> window;
        final Scheduler.Worker worker;

        /* loaded from: classes2.dex */
        public static final class ConsumerIndexHolder implements Runnable {
            final long index;
            final WindowExactBoundedSubscriber<?> parent;

            public ConsumerIndexHolder(long j5, WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber) {
                this.index = j5;
                this.parent = windowExactBoundedSubscriber;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber = this.parent;
                if (!((QueueDrainSubscriber) windowExactBoundedSubscriber).cancelled) {
                    ((QueueDrainSubscriber) windowExactBoundedSubscriber).queue.offer(this);
                } else {
                    windowExactBoundedSubscriber.terminated = true;
                }
                if (windowExactBoundedSubscriber.enter()) {
                    windowExactBoundedSubscriber.drainLoop();
                }
            }
        }

        public WindowExactBoundedSubscriber(c cVar, long j5, TimeUnit timeUnit, Scheduler scheduler, int i4, long j6, boolean z2) {
            super(cVar, new MpscLinkedQueue());
            this.timer = new SequentialDisposable();
            this.timespan = j5;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i4;
            this.maxSize = j6;
            this.restartTimerOnMaxSize = z2;
            if (z2) {
                this.worker = scheduler.createWorker();
            } else {
                this.worker = null;
            }
        }

        @Override // qg.d
        public void cancel() {
            this.cancelled = true;
        }

        public void disposeTimer() {
            this.timer.dispose();
            Scheduler.Worker worker = this.worker;
            if (worker != null) {
                worker.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            boolean z2;
            SimpleQueue simpleQueue = this.queue;
            c cVar = this.downstream;
            UnicastProcessor<T> unicastProcessor = this.window;
            int i4 = 1;
            while (!this.terminated) {
                boolean z10 = this.done;
                Object poll = simpleQueue.poll();
                if (poll == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z11 = poll instanceof ConsumerIndexHolder;
                if (z10 && (z2 || z11)) {
                    this.window = null;
                    simpleQueue.clear();
                    Throwable th = this.error;
                    if (th != null) {
                        unicastProcessor.onError(th);
                    } else {
                        unicastProcessor.onComplete();
                    }
                    disposeTimer();
                    return;
                }
                if (z2) {
                    i4 = leave(-i4);
                    if (i4 == 0) {
                        return;
                    }
                } else {
                    int i5 = i4;
                    if (z11) {
                        ConsumerIndexHolder consumerIndexHolder = (ConsumerIndexHolder) poll;
                        if (!this.restartTimerOnMaxSize || this.producerIndex == consumerIndexHolder.index) {
                            unicastProcessor.onComplete();
                            this.count = 0L;
                            unicastProcessor = (UnicastProcessor<T>) UnicastProcessor.create(this.bufferSize);
                            this.window = unicastProcessor;
                            long requested = requested();
                            if (requested != 0) {
                                cVar.onNext(unicastProcessor);
                                if (requested != Long.MAX_VALUE) {
                                    produced(1L);
                                }
                            } else {
                                this.window = null;
                                this.queue.clear();
                                this.upstream.cancel();
                                cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                disposeTimer();
                                return;
                            }
                        }
                    } else {
                        unicastProcessor.onNext(NotificationLite.getValue(poll));
                        long j5 = this.count + 1;
                        if (j5 >= this.maxSize) {
                            this.producerIndex++;
                            this.count = 0L;
                            unicastProcessor.onComplete();
                            long requested2 = requested();
                            if (requested2 != 0) {
                                unicastProcessor = (UnicastProcessor<T>) UnicastProcessor.create(this.bufferSize);
                                this.window = unicastProcessor;
                                this.downstream.onNext(unicastProcessor);
                                if (requested2 != Long.MAX_VALUE) {
                                    produced(1L);
                                }
                                if (this.restartTimerOnMaxSize) {
                                    this.timer.get().dispose();
                                    Scheduler.Worker worker = this.worker;
                                    ConsumerIndexHolder consumerIndexHolder2 = new ConsumerIndexHolder(this.producerIndex, this);
                                    long j6 = this.timespan;
                                    this.timer.replace(worker.schedulePeriodically(consumerIndexHolder2, j6, j6, this.unit));
                                }
                            } else {
                                this.window = null;
                                this.upstream.cancel();
                                this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                                disposeTimer();
                                return;
                            }
                        } else {
                            this.count = j5;
                        }
                    }
                    i4 = i5;
                }
            }
            this.upstream.cancel();
            simpleQueue.clear();
            disposeTimer();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!this.terminated) {
                if (fastEnter()) {
                    UnicastProcessor<T> unicastProcessor = this.window;
                    unicastProcessor.onNext(t5);
                    long j5 = this.count + 1;
                    if (j5 >= this.maxSize) {
                        this.producerIndex++;
                        this.count = 0L;
                        unicastProcessor.onComplete();
                        long requested = requested();
                        if (requested != 0) {
                            UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                            this.window = create;
                            this.downstream.onNext(create);
                            if (requested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            if (this.restartTimerOnMaxSize) {
                                this.timer.get().dispose();
                                Scheduler.Worker worker = this.worker;
                                ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                                long j6 = this.timespan;
                                this.timer.replace(worker.schedulePeriodically(consumerIndexHolder, j6, j6, this.unit));
                            }
                        } else {
                            this.window = null;
                            this.upstream.cancel();
                            this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                            disposeTimer();
                            return;
                        }
                    } else {
                        this.count = j5;
                    }
                    if (leave(-1) == 0) {
                        return;
                    }
                } else {
                    this.queue.offer(NotificationLite.next(t5));
                    if (!enter()) {
                        return;
                    }
                }
                drainLoop();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            Disposable schedulePeriodicallyDirect;
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                c cVar = this.downstream;
                cVar.onSubscribe(this);
                if (!this.cancelled) {
                    UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                    this.window = create;
                    long requested = requested();
                    if (requested != 0) {
                        cVar.onNext(create);
                        if (requested != Long.MAX_VALUE) {
                            produced(1L);
                        }
                        ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                        if (this.restartTimerOnMaxSize) {
                            Scheduler.Worker worker = this.worker;
                            long j5 = this.timespan;
                            schedulePeriodicallyDirect = worker.schedulePeriodically(consumerIndexHolder, j5, j5, this.unit);
                        } else {
                            Scheduler scheduler = this.scheduler;
                            long j6 = this.timespan;
                            schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(consumerIndexHolder, j6, j6, this.unit);
                        }
                        if (this.timer.replace(schedulePeriodicallyDirect)) {
                            dVar.request(Long.MAX_VALUE);
                            return;
                        }
                        return;
                    }
                    this.cancelled = true;
                    dVar.cancel();
                    cVar.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
                }
            }
        }

        @Override // qg.d
        public void request(long j5) {
            requested(j5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowExactUnboundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements FlowableSubscriber<T>, d, Runnable {
        static final Object NEXT = new Object();
        final int bufferSize;
        final Scheduler scheduler;
        volatile boolean terminated;
        final SequentialDisposable timer;
        final long timespan;
        final TimeUnit unit;
        d upstream;
        UnicastProcessor<T> window;

        public WindowExactUnboundedSubscriber(c cVar, long j5, TimeUnit timeUnit, Scheduler scheduler, int i4) {
            super(cVar, new MpscLinkedQueue());
            this.timer = new SequentialDisposable();
            this.timespan = j5;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i4;
        }

        @Override // qg.d
        public void cancel() {
            this.cancelled = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r10.timer.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r10.window = null;
            r0.clear();
            r0 = r10.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drainLoop() {
            SimpleQueue simpleQueue = this.queue;
            c cVar = this.downstream;
            UnicastProcessor<T> unicastProcessor = this.window;
            int i4 = 1;
            while (true) {
                boolean z2 = this.terminated;
                boolean z10 = this.done;
                Object poll = simpleQueue.poll();
                if (!z10 || (poll != null && poll != NEXT)) {
                    if (poll == null) {
                        i4 = leave(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else if (poll == NEXT) {
                        unicastProcessor.onComplete();
                        if (!z2) {
                            unicastProcessor = (UnicastProcessor<T>) UnicastProcessor.create(this.bufferSize);
                            this.window = unicastProcessor;
                            long requested = requested();
                            if (requested != 0) {
                                cVar.onNext(unicastProcessor);
                                if (requested != Long.MAX_VALUE) {
                                    produced(1L);
                                }
                            } else {
                                this.window = null;
                                this.queue.clear();
                                this.upstream.cancel();
                                cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                this.timer.dispose();
                                return;
                            }
                        } else {
                            this.upstream.cancel();
                        }
                    } else {
                        unicastProcessor.onNext(NotificationLite.getValue(poll));
                    }
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!this.terminated) {
                if (fastEnter()) {
                    this.window.onNext(t5);
                    if (leave(-1) == 0) {
                        return;
                    }
                } else {
                    this.queue.offer(NotificationLite.next(t5));
                    if (!enter()) {
                        return;
                    }
                }
                drainLoop();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.window = UnicastProcessor.create(this.bufferSize);
                c cVar = this.downstream;
                cVar.onSubscribe(this);
                long requested = requested();
                if (requested != 0) {
                    cVar.onNext(this.window);
                    if (requested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (!this.cancelled) {
                        SequentialDisposable sequentialDisposable = this.timer;
                        Scheduler scheduler = this.scheduler;
                        long j5 = this.timespan;
                        if (sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j5, j5, this.unit))) {
                            dVar.request(Long.MAX_VALUE);
                        }
                    }
                } else {
                    this.cancelled = true;
                    dVar.cancel();
                    cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                }
            }
        }

        @Override // qg.d
        public void request(long j5) {
            requested(j5);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.terminated = true;
            }
            this.queue.offer(NEXT);
            if (enter()) {
                drainLoop();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowSkipSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements d, Runnable {
        final int bufferSize;
        volatile boolean terminated;
        final long timeskip;
        final long timespan;
        final TimeUnit unit;
        d upstream;
        final List<UnicastProcessor<T>> windows;
        final Scheduler.Worker worker;

        /* loaded from: classes2.dex */
        public final class Completion implements Runnable {
            private final UnicastProcessor<T> processor;

            public Completion(UnicastProcessor<T> unicastProcessor) {
                this.processor = unicastProcessor;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowSkipSubscriber.this.complete(this.processor);
            }
        }

        /* loaded from: classes2.dex */
        public static final class SubjectWork<T> {
            final boolean open;

            /* renamed from: w, reason: collision with root package name */
            final UnicastProcessor<T> f12828w;

            public SubjectWork(UnicastProcessor<T> unicastProcessor, boolean z2) {
                this.f12828w = unicastProcessor;
                this.open = z2;
            }
        }

        public WindowSkipSubscriber(c cVar, long j5, long j6, TimeUnit timeUnit, Scheduler.Worker worker, int i4) {
            super(cVar, new MpscLinkedQueue());
            this.timespan = j5;
            this.timeskip = j6;
            this.unit = timeUnit;
            this.worker = worker;
            this.bufferSize = i4;
            this.windows = new LinkedList();
        }

        @Override // qg.d
        public void cancel() {
            this.cancelled = true;
        }

        public void complete(UnicastProcessor<T> unicastProcessor) {
            this.queue.offer(new SubjectWork(unicastProcessor, false));
            if (enter()) {
                drainLoop();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            boolean z2;
            SimpleQueue simpleQueue = this.queue;
            c cVar = this.downstream;
            List<UnicastProcessor<T>> list = this.windows;
            int i4 = 1;
            while (!this.terminated) {
                boolean z10 = this.done;
                Object poll = simpleQueue.poll();
                if (poll == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z11 = poll instanceof SubjectWork;
                if (z10 && (z2 || z11)) {
                    simpleQueue.clear();
                    Throwable th = this.error;
                    if (th != null) {
                        Iterator<UnicastProcessor<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    this.worker.dispose();
                    return;
                }
                if (z2) {
                    i4 = leave(-i4);
                    if (i4 == 0) {
                        return;
                    }
                } else if (z11) {
                    SubjectWork subjectWork = (SubjectWork) poll;
                    if (subjectWork.open) {
                        if (!this.cancelled) {
                            long requested = requested();
                            if (requested != 0) {
                                UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                                list.add(create);
                                cVar.onNext(create);
                                if (requested != Long.MAX_VALUE) {
                                    produced(1L);
                                }
                                this.worker.schedule(new Completion(create), this.timespan, this.unit);
                            } else {
                                cVar.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                            }
                        }
                    } else {
                        list.remove(subjectWork.f12828w);
                        subjectWork.f12828w.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.terminated = true;
                        }
                    }
                } else {
                    Iterator<UnicastProcessor<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(poll);
                    }
                }
            }
            this.upstream.cancel();
            simpleQueue.clear();
            list.clear();
            this.worker.dispose();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (fastEnter()) {
                Iterator<UnicastProcessor<T>> it = this.windows.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t5);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(t5);
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    long requested = requested();
                    if (requested != 0) {
                        UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                        this.windows.add(create);
                        this.downstream.onNext(create);
                        if (requested != Long.MAX_VALUE) {
                            produced(1L);
                        }
                        this.worker.schedule(new Completion(create), this.timespan, this.unit);
                        Scheduler.Worker worker = this.worker;
                        long j5 = this.timeskip;
                        worker.schedulePeriodically(this, j5, j5, this.unit);
                        dVar.request(Long.MAX_VALUE);
                        return;
                    }
                    dVar.cancel();
                    this.downstream.onError(new MissingBackpressureException("Could not emit the first window due to lack of requests"));
                }
            }
        }

        @Override // qg.d
        public void request(long j5) {
            requested(j5);
        }

        @Override // java.lang.Runnable
        public void run() {
            SubjectWork subjectWork = new SubjectWork(UnicastProcessor.create(this.bufferSize), true);
            if (!this.cancelled) {
                this.queue.offer(subjectWork);
            }
            if (enter()) {
                drainLoop();
            }
        }
    }

    public FlowableWindowTimed(Flowable<T> flowable, long j5, long j6, TimeUnit timeUnit, Scheduler scheduler, long j7, int i4, boolean z2) {
        super(flowable);
        this.timespan = j5;
        this.timeskip = j6;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.maxSize = j7;
        this.bufferSize = i4;
        this.restartTimerOnMaxSize = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(cVar);
        long j5 = this.timespan;
        long j6 = this.timeskip;
        if (j5 == j6) {
            long j7 = this.maxSize;
            if (j7 == Long.MAX_VALUE) {
                this.source.subscribe((FlowableSubscriber) new WindowExactUnboundedSubscriber(serializedSubscriber, j5, this.unit, this.scheduler, this.bufferSize));
                return;
            } else {
                this.source.subscribe((FlowableSubscriber) new WindowExactBoundedSubscriber(serializedSubscriber, j5, this.unit, this.scheduler, this.bufferSize, j7, this.restartTimerOnMaxSize));
                return;
            }
        }
        this.source.subscribe((FlowableSubscriber) new WindowSkipSubscriber(serializedSubscriber, j5, j6, this.unit, this.scheduler.createWorker(), this.bufferSize));
    }
}
