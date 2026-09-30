package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableWindow<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int bufferSize;
    final long size;
    final long skip;

    /* loaded from: classes2.dex */
    public static final class WindowExactSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;
        final int bufferSize;
        final c downstream;
        long index;
        final AtomicBoolean once;
        final long size;
        d upstream;
        UnicastProcessor<T> window;

        public WindowExactSubscriber(c cVar, long j5, int i4) {
            super(1);
            this.downstream = cVar;
            this.size = j5;
            this.once = new AtomicBoolean();
            this.bufferSize = i4;
        }

        @Override // qg.d
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            long j5 = this.index;
            UnicastProcessor<T> unicastProcessor = this.window;
            if (j5 == 0) {
                getAndIncrement();
                unicastProcessor = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessor;
                this.downstream.onNext(unicastProcessor);
            }
            long j6 = j5 + 1;
            unicastProcessor.onNext(t5);
            if (j6 == this.size) {
                this.index = 0L;
                this.window = null;
                unicastProcessor.onComplete();
                return;
            }
            this.index = j6;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                this.upstream.request(BackpressureHelper.multiplyCap(this.size, j5));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowOverlapSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final c downstream;
        Throwable error;
        final AtomicBoolean firstRequest;
        long index;
        final AtomicBoolean once;
        long produced;
        final SpscLinkedArrayQueue<UnicastProcessor<T>> queue;
        final AtomicLong requested;
        final long size;
        final long skip;
        d upstream;
        final ArrayDeque<UnicastProcessor<T>> windows;
        final AtomicInteger wip;

        public WindowOverlapSubscriber(c cVar, long j5, long j6, int i4) {
            super(1);
            this.downstream = cVar;
            this.size = j5;
            this.skip = j6;
            this.queue = new SpscLinkedArrayQueue<>(i4);
            this.windows = new ArrayDeque<>();
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.requested = new AtomicLong();
            this.wip = new AtomicInteger();
            this.bufferSize = i4;
        }

        @Override // qg.d
        public void cancel() {
            this.cancelled = true;
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        public boolean checkTerminated(boolean z2, boolean z10, c cVar, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (z2) {
                Throwable th = this.error;
                if (th != null) {
                    spscLinkedArrayQueue.clear();
                    cVar.onError(th);
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

        public void drain() {
            boolean z2;
            if (this.wip.getAndIncrement() == 0) {
                c cVar = this.downstream;
                SpscLinkedArrayQueue<UnicastProcessor<T>> spscLinkedArrayQueue = this.queue;
                int i4 = 1;
                do {
                    long j5 = this.requested.get();
                    long j6 = 0;
                    while (j6 != j5) {
                        boolean z10 = this.done;
                        UnicastProcessor<T> poll = spscLinkedArrayQueue.poll();
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
                    if (j6 != j5 || !checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), cVar, spscLinkedArrayQueue)) {
                        if (j6 != 0 && j5 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j6);
                        }
                        i4 = this.wip.addAndGet(-i4);
                    } else {
                        return;
                    }
                } while (i4 != 0);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.windows.clear();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.windows.clear();
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            long j5 = this.index;
            if (j5 == 0 && !this.cancelled) {
                getAndIncrement();
                UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize, this);
                this.windows.offer(create);
                this.queue.offer(create);
                drain();
            }
            long j6 = j5 + 1;
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onNext(t5);
            }
            long j7 = this.produced + 1;
            if (j7 == this.size) {
                this.produced = j7 - this.skip;
                UnicastProcessor<T> poll = this.windows.poll();
                if (poll != null) {
                    poll.onComplete();
                }
            } else {
                this.produced = j7;
            }
            if (j6 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j6;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                if (!this.firstRequest.get() && this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.addCap(this.size, BackpressureHelper.multiplyCap(this.skip, j5 - 1)));
                } else {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j5));
                }
                drain();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowSkipSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;
        final int bufferSize;
        final c downstream;
        final AtomicBoolean firstRequest;
        long index;
        final AtomicBoolean once;
        final long size;
        final long skip;
        d upstream;
        UnicastProcessor<T> window;

        public WindowSkipSubscriber(c cVar, long j5, long j6, int i4) {
            super(1);
            this.downstream = cVar;
            this.size = j5;
            this.skip = j6;
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.bufferSize = i4;
        }

        @Override // qg.d
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            long j5 = this.index;
            UnicastProcessor<T> unicastProcessor = this.window;
            if (j5 == 0) {
                getAndIncrement();
                unicastProcessor = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessor;
                this.downstream.onNext(unicastProcessor);
            }
            long j6 = j5 + 1;
            if (unicastProcessor != null) {
                unicastProcessor.onNext(t5);
            }
            if (j6 == this.size) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            if (j6 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j6;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                if (!this.firstRequest.get() && this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(this.size, j5), BackpressureHelper.multiplyCap(this.skip - this.size, j5 - 1)));
                } else {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j5));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public FlowableWindow(Flowable<T> flowable, long j5, long j6, int i4) {
        super(flowable);
        this.size = j5;
        this.skip = j6;
        this.bufferSize = i4;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        long j5 = this.skip;
        long j6 = this.size;
        if (j5 == j6) {
            this.source.subscribe((FlowableSubscriber) new WindowExactSubscriber(cVar, this.size, this.bufferSize));
        } else if (j5 > j6) {
            this.source.subscribe((FlowableSubscriber) new WindowSkipSubscriber(cVar, this.size, this.skip, this.bufferSize));
        } else {
            this.source.subscribe((FlowableSubscriber) new WindowOverlapSubscriber(cVar, this.size, this.skip, this.bufferSize));
        }
    }
}
