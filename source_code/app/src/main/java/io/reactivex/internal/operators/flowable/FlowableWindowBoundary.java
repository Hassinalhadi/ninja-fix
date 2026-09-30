package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableWindowBoundary<T, B> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int capacityHint;
    final b other;

    /* loaded from: classes2.dex */
    public static final class WindowBoundaryInnerSubscriber<T, B> extends DisposableSubscriber<B> {
        boolean done;
        final WindowBoundaryMainSubscriber<T, B> parent;

        public WindowBoundaryInnerSubscriber(WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
            this.parent = windowBoundaryMainSubscriber;
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.innerComplete();
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.parent.innerError(th);
            }
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(B b2) {
            if (this.done) {
                return;
            }
            this.parent.innerNext();
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int capacityHint;
        volatile boolean done;
        final c downstream;
        long emitted;
        UnicastProcessor<T> window;
        final WindowBoundaryInnerSubscriber<T, B> boundarySubscriber = new WindowBoundaryInnerSubscriber<>(this);
        final AtomicReference<d> upstream = new AtomicReference<>();
        final AtomicInteger windows = new AtomicInteger(1);
        final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicBoolean stopWindows = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();

        public WindowBoundaryMainSubscriber(c cVar, int i4) {
            this.downstream = cVar;
            this.capacityHint = i4;
        }

        @Override // qg.d
        public void cancel() {
            if (this.stopWindows.compareAndSet(false, true)) {
                this.boundarySubscriber.dispose();
                if (this.windows.decrementAndGet() == 0) {
                    SubscriptionHelper.cancel(this.upstream);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void drain() {
            boolean z2;
            if (getAndIncrement() == 0) {
                c cVar = this.downstream;
                MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
                AtomicThrowable atomicThrowable = this.errors;
                long j5 = this.emitted;
                int i4 = 1;
                while (this.windows.get() != 0) {
                    UnicastProcessor<T> unicastProcessor = this.window;
                    boolean z10 = this.done;
                    if (z10 && atomicThrowable.get() != null) {
                        mpscLinkedQueue.clear();
                        Throwable terminate = atomicThrowable.terminate();
                        if (unicastProcessor != 0) {
                            this.window = null;
                            unicastProcessor.onError(terminate);
                        }
                        cVar.onError(terminate);
                        return;
                    }
                    Object poll = mpscLinkedQueue.poll();
                    if (poll == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z10 && z2) {
                        Throwable terminate2 = atomicThrowable.terminate();
                        if (terminate2 == null) {
                            if (unicastProcessor != 0) {
                                this.window = null;
                                unicastProcessor.onComplete();
                            }
                            cVar.onComplete();
                            return;
                        }
                        if (unicastProcessor != 0) {
                            this.window = null;
                            unicastProcessor.onError(terminate2);
                        }
                        cVar.onError(terminate2);
                        return;
                    }
                    if (z2) {
                        this.emitted = j5;
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else if (poll != NEXT_WINDOW) {
                        unicastProcessor.onNext(poll);
                    } else {
                        if (unicastProcessor != 0) {
                            this.window = null;
                            unicastProcessor.onComplete();
                        }
                        if (!this.stopWindows.get()) {
                            UnicastProcessor<T> create = UnicastProcessor.create(this.capacityHint, this);
                            this.window = create;
                            this.windows.getAndIncrement();
                            if (j5 != this.requested.get()) {
                                j5++;
                                cVar.onNext(create);
                            } else {
                                SubscriptionHelper.cancel(this.upstream);
                                this.boundarySubscriber.dispose();
                                atomicThrowable.addThrowable(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                                this.done = true;
                            }
                        }
                    }
                }
                mpscLinkedQueue.clear();
                this.window = null;
            }
        }

        public void innerComplete() {
            SubscriptionHelper.cancel(this.upstream);
            this.done = true;
            drain();
        }

        public void innerError(Throwable th) {
            SubscriptionHelper.cancel(this.upstream);
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        public void innerNext() {
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.boundarySubscriber.dispose();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.boundarySubscriber.dispose();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            this.queue.offer(t5);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this.upstream, dVar, Long.MAX_VALUE);
        }

        @Override // qg.d
        public void request(long j5) {
            BackpressureHelper.add(this.requested, j5);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                SubscriptionHelper.cancel(this.upstream);
            }
        }
    }

    public FlowableWindowBoundary(Flowable<T> flowable, b bVar, int i4) {
        super(flowable);
        this.other = bVar;
        this.capacityHint = i4;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = new WindowBoundaryMainSubscriber(cVar, this.capacityHint);
        cVar.onSubscribe(windowBoundaryMainSubscriber);
        windowBoundaryMainSubscriber.innerNext();
        this.other.subscribe(windowBoundaryMainSubscriber.boundarySubscriber);
        this.source.subscribe((FlowableSubscriber) windowBoundaryMainSubscriber);
    }
}
