package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class ParallelRunOn<T> extends ParallelFlowable<T> {
    final int prefetch;
    final Scheduler scheduler;
    final ParallelFlowable<? extends T> source;

    /* loaded from: classes2.dex */
    public static abstract class BaseRunOnSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        Throwable error;
        final int limit;
        final int prefetch;
        final SpscArrayQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        d upstream;
        final Scheduler.Worker worker;

        public BaseRunOnSubscriber(int i4, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            this.prefetch = i4;
            this.queue = spscArrayQueue;
            this.limit = i4 - (i4 >> 2);
            this.worker = worker;
        }

        @Override // qg.d
        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                this.worker.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public final void onNext(T t5) {
            if (this.done) {
                return;
            }
            if (!this.queue.offer(t5)) {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?!"));
            } else {
                schedule();
            }
        }

        @Override // qg.d
        public final void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                schedule();
            }
        }

        public final void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.schedule(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class MultiWorkerCallback implements SchedulerMultiWorkerSupport.WorkerCallback {
        final c[] parents;
        final c[] subscribers;

        public MultiWorkerCallback(c[] cVarArr, c[] cVarArr2) {
            this.subscribers = cVarArr;
            this.parents = cVarArr2;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback
        public void onWorker(int i4, Scheduler.Worker worker) {
            ParallelRunOn.this.createSubscriber(i4, this.subscribers, this.parents, worker);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RunOnConditionalSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final ConditionalSubscriber<? super T> downstream;

        public RunOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, int i4, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i4, spscArrayQueue, worker);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z2;
            Throwable th;
            int i4 = this.consumed;
            SpscArrayQueue<T> spscArrayQueue = this.queue;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            int i5 = this.limit;
            int i10 = 1;
            while (true) {
                long j5 = this.requested.get();
                long j6 = 0;
                while (j6 != j5) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z10 = this.done;
                    if (z10 && (th = this.error) != null) {
                        spscArrayQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.worker.dispose();
                        return;
                    }
                    T poll = spscArrayQueue.poll();
                    if (poll == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z10 && z2) {
                        conditionalSubscriber.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(poll)) {
                            j6++;
                        }
                        i4++;
                        if (i4 == i5) {
                            this.upstream.request(i4);
                            i4 = 0;
                        }
                    }
                }
                if (j6 == j5) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            conditionalSubscriber.onError(th2);
                            this.worker.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            conditionalSubscriber.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (j6 != 0 && j5 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j6);
                }
                int i11 = get();
                if (i11 == i10) {
                    this.consumed = i4;
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    i10 = i11;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class RunOnSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final c downstream;

        public RunOnSubscriber(c cVar, int i4, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i4, spscArrayQueue, worker);
            this.downstream = cVar;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z2;
            Throwable th;
            int i4 = this.consumed;
            SpscArrayQueue<T> spscArrayQueue = this.queue;
            c cVar = this.downstream;
            int i5 = this.limit;
            int i10 = 1;
            while (true) {
                long j5 = this.requested.get();
                long j6 = 0;
                while (j6 != j5) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z10 = this.done;
                    if (z10 && (th = this.error) != null) {
                        spscArrayQueue.clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                    T poll = spscArrayQueue.poll();
                    if (poll == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z10 && z2) {
                        cVar.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        cVar.onNext(poll);
                        j6++;
                        i4++;
                        if (i4 == i5) {
                            this.upstream.request(i4);
                            i4 = 0;
                        }
                    }
                }
                if (j6 == j5) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            cVar.onError(th2);
                            this.worker.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            cVar.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (j6 != 0 && j5 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j6);
                }
                int i11 = get();
                if (i11 == i10) {
                    this.consumed = i4;
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    i10 = i11;
                }
            }
        }
    }

    public ParallelRunOn(ParallelFlowable<? extends T> parallelFlowable, Scheduler scheduler, int i4) {
        this.source = parallelFlowable;
        this.scheduler = scheduler;
        this.prefetch = i4;
    }

    public void createSubscriber(int i4, c[] cVarArr, c[] cVarArr2, Scheduler.Worker worker) {
        c cVar = cVarArr[i4];
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
        if (cVar instanceof ConditionalSubscriber) {
            cVarArr2[i4] = new RunOnConditionalSubscriber((ConditionalSubscriber) cVar, this.prefetch, spscArrayQueue, worker);
        } else {
            cVarArr2[i4] = new RunOnSubscriber(cVar, this.prefetch, spscArrayQueue, worker);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c[] cVarArr) {
        if (!validate(cVarArr)) {
            return;
        }
        int length = cVarArr.length;
        c[] cVarArr2 = new c[length];
        Object obj = this.scheduler;
        if (obj instanceof SchedulerMultiWorkerSupport) {
            ((SchedulerMultiWorkerSupport) obj).createWorkers(length, new MultiWorkerCallback(cVarArr, cVarArr2));
        } else {
            for (int i4 = 0; i4 < length; i4++) {
                createSubscriber(i4, cVarArr, cVarArr2, this.scheduler.createWorker());
            }
        }
        this.source.subscribe(cVarArr2);
    }
}
