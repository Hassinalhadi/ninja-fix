package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableWindowBoundarySelector<T, B, V> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int bufferSize;
    final Function<? super B, ? extends b> close;
    final b open;

    /* loaded from: classes2.dex */
    public static final class OperatorWindowBoundaryCloseSubscriber<T, V> extends DisposableSubscriber<V> {
        boolean done;
        final WindowBoundaryMainSubscriber<T, ?, V> parent;

        /* renamed from: w, reason: collision with root package name */
        final UnicastProcessor<T> f12826w;

        public OperatorWindowBoundaryCloseSubscriber(WindowBoundaryMainSubscriber<T, ?, V> windowBoundaryMainSubscriber, UnicastProcessor<T> unicastProcessor) {
            this.parent = windowBoundaryMainSubscriber;
            this.f12826w = unicastProcessor;
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.close(this);
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.parent.error(th);
            }
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(V v4) {
            cancel();
            onComplete();
        }
    }

    /* loaded from: classes2.dex */
    public static final class OperatorWindowBoundaryOpenSubscriber<T, B> extends DisposableSubscriber<B> {
        final WindowBoundaryMainSubscriber<T, B, ?> parent;

        public OperatorWindowBoundaryOpenSubscriber(WindowBoundaryMainSubscriber<T, B, ?> windowBoundaryMainSubscriber) {
            this.parent = windowBoundaryMainSubscriber;
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.parent.onComplete();
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.parent.error(th);
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(B b2) {
            this.parent.open(b2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowBoundaryMainSubscriber<T, B, V> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements d {
        final AtomicReference<Disposable> boundary;
        final int bufferSize;
        final Function<? super B, ? extends b> close;
        final b open;
        final CompositeDisposable resources;
        final AtomicBoolean stopWindows;
        d upstream;
        final AtomicLong windows;
        final List<UnicastProcessor<T>> ws;

        public WindowBoundaryMainSubscriber(c cVar, b bVar, Function<? super B, ? extends b> function, int i4) {
            super(cVar, new MpscLinkedQueue());
            this.boundary = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.windows = atomicLong;
            this.stopWindows = new AtomicBoolean();
            this.open = bVar;
            this.close = function;
            this.bufferSize = i4;
            this.resources = new CompositeDisposable();
            this.ws = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public boolean accept(c cVar, Object obj) {
            return false;
        }

        @Override // qg.d
        public void cancel() {
            if (this.stopWindows.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.boundary);
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        public void close(OperatorWindowBoundaryCloseSubscriber<T, V> operatorWindowBoundaryCloseSubscriber) {
            this.resources.delete(operatorWindowBoundaryCloseSubscriber);
            this.queue.offer(new WindowOperation(operatorWindowBoundaryCloseSubscriber.f12826w, null));
            if (enter()) {
                drainLoop();
            }
        }

        public void dispose() {
            this.resources.dispose();
            DisposableHelper.dispose(this.boundary);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            boolean z2;
            SimpleQueue simpleQueue = this.queue;
            c cVar = this.downstream;
            List<UnicastProcessor<T>> list = this.ws;
            int i4 = 1;
            while (true) {
                boolean z10 = this.done;
                Object poll = simpleQueue.poll();
                if (poll == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z10 && z2) {
                    dispose();
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
                    return;
                }
                if (z2) {
                    i4 = leave(-i4);
                    if (i4 == 0) {
                        return;
                    }
                } else if (poll instanceof WindowOperation) {
                    WindowOperation windowOperation = (WindowOperation) poll;
                    UnicastProcessor<T> unicastProcessor = windowOperation.f12827w;
                    if (unicastProcessor != null) {
                        if (list.remove(unicastProcessor)) {
                            windowOperation.f12827w.onComplete();
                            if (this.windows.decrementAndGet() == 0) {
                                dispose();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.stopWindows.get()) {
                        UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                        long requested = requested();
                        if (requested != 0) {
                            list.add(create);
                            cVar.onNext(create);
                            if (requested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            try {
                                b bVar = (b) ObjectHelper.requireNonNull(this.close.apply(windowOperation.open), "The publisher supplied is null");
                                OperatorWindowBoundaryCloseSubscriber operatorWindowBoundaryCloseSubscriber = new OperatorWindowBoundaryCloseSubscriber(this, create);
                                if (this.resources.add(operatorWindowBoundaryCloseSubscriber)) {
                                    this.windows.getAndIncrement();
                                    bVar.subscribe(operatorWindowBoundaryCloseSubscriber);
                                }
                            } catch (Throwable th2) {
                                cancel();
                                cVar.onError(th2);
                            }
                        } else {
                            cancel();
                            cVar.onError(new MissingBackpressureException("Could not deliver new window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<UnicastProcessor<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(NotificationLite.getValue(poll));
                    }
                }
            }
        }

        public void error(Throwable th) {
            this.upstream.cancel();
            this.resources.dispose();
            DisposableHelper.dispose(this.boundary);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!this.done) {
                if (fastEnter()) {
                    Iterator<UnicastProcessor<T>> it = this.ws.iterator();
                    while (it.hasNext()) {
                        it.next().onNext(t5);
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
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (!this.stopWindows.get()) {
                    OperatorWindowBoundaryOpenSubscriber operatorWindowBoundaryOpenSubscriber = new OperatorWindowBoundaryOpenSubscriber(this);
                    AtomicReference<Disposable> atomicReference = this.boundary;
                    while (!atomicReference.compareAndSet(null, operatorWindowBoundaryOpenSubscriber)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    dVar.request(Long.MAX_VALUE);
                    this.open.subscribe(operatorWindowBoundaryOpenSubscriber);
                }
            }
        }

        public void open(B b2) {
            this.queue.offer(new WindowOperation(null, b2));
            if (enter()) {
                drainLoop();
            }
        }

        @Override // qg.d
        public void request(long j5) {
            requested(j5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowOperation<T, B> {
        final B open;

        /* renamed from: w, reason: collision with root package name */
        final UnicastProcessor<T> f12827w;

        public WindowOperation(UnicastProcessor<T> unicastProcessor, B b2) {
            this.f12827w = unicastProcessor;
            this.open = b2;
        }
    }

    public FlowableWindowBoundarySelector(Flowable<T> flowable, b bVar, Function<? super B, ? extends b> function, int i4) {
        super(flowable);
        this.open = bVar;
        this.close = function;
        this.bufferSize = i4;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new WindowBoundaryMainSubscriber(new SerializedSubscriber(cVar), this.open, this.close, this.bufferSize));
    }
}
