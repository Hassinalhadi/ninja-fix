package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ObservableWindowTimed<T> extends AbstractObservableWithUpstream<T, Observable<T>> {
    final int bufferSize;
    final long maxSize;
    final boolean restartTimerOnMaxSize;
    final Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class WindowExactBoundedObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {
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
        Disposable upstream;
        UnicastSubject<T> window;
        final Scheduler.Worker worker;

        /* loaded from: classes2.dex */
        public static final class ConsumerIndexHolder implements Runnable {
            final long index;
            final WindowExactBoundedObserver<?> parent;

            public ConsumerIndexHolder(long j5, WindowExactBoundedObserver<?> windowExactBoundedObserver) {
                this.index = j5;
                this.parent = windowExactBoundedObserver;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowExactBoundedObserver<?> windowExactBoundedObserver = this.parent;
                if (!((QueueDrainObserver) windowExactBoundedObserver).cancelled) {
                    ((QueueDrainObserver) windowExactBoundedObserver).queue.offer(this);
                } else {
                    windowExactBoundedObserver.terminated = true;
                }
                if (windowExactBoundedObserver.enter()) {
                    windowExactBoundedObserver.drainLoop();
                }
            }
        }

        public WindowExactBoundedObserver(Observer<? super Observable<T>> observer, long j5, TimeUnit timeUnit, Scheduler scheduler, int i4, long j6, boolean z2) {
            super(observer, new MpscLinkedQueue());
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

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        public void disposeTimer() {
            DisposableHelper.dispose(this.timer);
            Scheduler.Worker worker = this.worker;
            if (worker != null) {
                worker.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        public void drainLoop() {
            boolean z2;
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            UnicastSubject<T> unicastSubject = this.window;
            int i4 = 1;
            while (!this.terminated) {
                boolean z10 = this.done;
                Object poll = mpscLinkedQueue.poll();
                if (poll == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z11 = poll instanceof ConsumerIndexHolder;
                if (z10 && (z2 || z11)) {
                    this.window = null;
                    mpscLinkedQueue.clear();
                    Throwable th = this.error;
                    if (th != null) {
                        unicastSubject.onError(th);
                    } else {
                        unicastSubject.onComplete();
                    }
                    disposeTimer();
                    return;
                }
                if (z2) {
                    i4 = leave(-i4);
                    if (i4 == 0) {
                        return;
                    }
                } else if (z11) {
                    ConsumerIndexHolder consumerIndexHolder = (ConsumerIndexHolder) poll;
                    if (!this.restartTimerOnMaxSize || this.producerIndex == consumerIndexHolder.index) {
                        unicastSubject.onComplete();
                        this.count = 0L;
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.bufferSize);
                        this.window = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(poll));
                    long j5 = this.count + 1;
                    if (j5 >= this.maxSize) {
                        this.producerIndex++;
                        this.count = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.bufferSize);
                        this.window = unicastSubject;
                        this.downstream.onNext(unicastSubject);
                        if (this.restartTimerOnMaxSize) {
                            Disposable disposable = this.timer.get();
                            disposable.dispose();
                            Scheduler.Worker worker = this.worker;
                            ConsumerIndexHolder consumerIndexHolder2 = new ConsumerIndexHolder(this.producerIndex, this);
                            long j6 = this.timespan;
                            Disposable schedulePeriodically = worker.schedulePeriodically(consumerIndexHolder2, j6, j6, this.unit);
                            if (!this.timer.compareAndSet(disposable, schedulePeriodically)) {
                                schedulePeriodically.dispose();
                            }
                        }
                    } else {
                        this.count = j5;
                    }
                }
            }
            this.upstream.dispose();
            mpscLinkedQueue.clear();
            disposeTimer();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            if (!this.terminated) {
                if (fastEnter()) {
                    UnicastSubject<T> unicastSubject = this.window;
                    unicastSubject.onNext(t5);
                    long j5 = this.count + 1;
                    if (j5 >= this.maxSize) {
                        this.producerIndex++;
                        this.count = 0L;
                        unicastSubject.onComplete();
                        UnicastSubject<T> create = UnicastSubject.create(this.bufferSize);
                        this.window = create;
                        this.downstream.onNext(create);
                        if (this.restartTimerOnMaxSize) {
                            this.timer.get().dispose();
                            Scheduler.Worker worker = this.worker;
                            ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                            long j6 = this.timespan;
                            DisposableHelper.replace(this.timer, worker.schedulePeriodically(consumerIndexHolder, j6, j6, this.unit));
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

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            Disposable schedulePeriodicallyDirect;
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                if (!this.cancelled) {
                    UnicastSubject<T> create = UnicastSubject.create(this.bufferSize);
                    this.window = create;
                    observer.onNext(create);
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
                    this.timer.replace(schedulePeriodicallyDirect);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowExactUnboundedObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Observer<T>, Disposable, Runnable {
        static final Object NEXT = new Object();
        final int bufferSize;
        final Scheduler scheduler;
        volatile boolean terminated;
        final SequentialDisposable timer;
        final long timespan;
        final TimeUnit unit;
        Disposable upstream;
        UnicastSubject<T> window;

        public WindowExactUnboundedObserver(Observer<? super Observable<T>> observer, long j5, TimeUnit timeUnit, Scheduler scheduler, int i4) {
            super(observer, new MpscLinkedQueue());
            this.timer = new SequentialDisposable();
            this.timespan = j5;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i4;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        
            r7.timer.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            r7.window = null;
            r0.clear();
            r0 = r7.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drainLoop() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            UnicastSubject<T> unicastSubject = this.window;
            int i4 = 1;
            while (true) {
                boolean z2 = this.terminated;
                boolean z10 = this.done;
                Object poll = mpscLinkedQueue.poll();
                if (!z10 || (poll != null && poll != NEXT)) {
                    if (poll == null) {
                        i4 = leave(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else if (poll == NEXT) {
                        unicastSubject.onComplete();
                        if (!z2) {
                            unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.bufferSize);
                            this.window = unicastSubject;
                            observer.onNext(unicastSubject);
                        } else {
                            this.upstream.dispose();
                        }
                    } else {
                        unicastSubject.onNext(NotificationLite.getValue(poll));
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
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

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.window = UnicastSubject.create(this.bufferSize);
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                observer.onNext(this.window);
                if (!this.cancelled) {
                    Scheduler scheduler = this.scheduler;
                    long j5 = this.timespan;
                    this.timer.replace(scheduler.schedulePeriodicallyDirect(this, j5, j5, this.unit));
                }
            }
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
    public static final class WindowSkipObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable, Runnable {
        final int bufferSize;
        volatile boolean terminated;
        final long timeskip;
        final long timespan;
        final TimeUnit unit;
        Disposable upstream;
        final List<UnicastSubject<T>> windows;
        final Scheduler.Worker worker;

        /* loaded from: classes2.dex */
        public final class CompletionTask implements Runnable {

            /* renamed from: w, reason: collision with root package name */
            private final UnicastSubject<T> f12846w;

            public CompletionTask(UnicastSubject<T> unicastSubject) {
                this.f12846w = unicastSubject;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowSkipObserver.this.complete(this.f12846w);
            }
        }

        /* loaded from: classes2.dex */
        public static final class SubjectWork<T> {
            final boolean open;

            /* renamed from: w, reason: collision with root package name */
            final UnicastSubject<T> f12847w;

            public SubjectWork(UnicastSubject<T> unicastSubject, boolean z2) {
                this.f12847w = unicastSubject;
                this.open = z2;
            }
        }

        public WindowSkipObserver(Observer<? super Observable<T>> observer, long j5, long j6, TimeUnit timeUnit, Scheduler.Worker worker, int i4) {
            super(observer, new MpscLinkedQueue());
            this.timespan = j5;
            this.timeskip = j6;
            this.unit = timeUnit;
            this.worker = worker;
            this.bufferSize = i4;
            this.windows = new LinkedList();
        }

        public void complete(UnicastSubject<T> unicastSubject) {
            this.queue.offer(new SubjectWork(unicastSubject, false));
            if (enter()) {
                drainLoop();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            boolean z2;
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            List<UnicastSubject<T>> list = this.windows;
            int i4 = 1;
            while (!this.terminated) {
                boolean z10 = this.done;
                Object poll = mpscLinkedQueue.poll();
                if (poll == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z11 = poll instanceof SubjectWork;
                if (z10 && (z2 || z11)) {
                    mpscLinkedQueue.clear();
                    Throwable th = this.error;
                    if (th != null) {
                        Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it2 = list.iterator();
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
                            UnicastSubject<T> create = UnicastSubject.create(this.bufferSize);
                            list.add(create);
                            observer.onNext(create);
                            this.worker.schedule(new CompletionTask(create), this.timespan, this.unit);
                        }
                    } else {
                        list.remove(subjectWork.f12847w);
                        subjectWork.f12847w.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.terminated = true;
                        }
                    }
                } else {
                    Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(poll);
                    }
                }
            }
            this.upstream.dispose();
            mpscLinkedQueue.clear();
            list.clear();
            this.worker.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            if (fastEnter()) {
                Iterator<UnicastSubject<T>> it = this.windows.iterator();
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

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    UnicastSubject<T> create = UnicastSubject.create(this.bufferSize);
                    this.windows.add(create);
                    this.downstream.onNext(create);
                    this.worker.schedule(new CompletionTask(create), this.timespan, this.unit);
                    Scheduler.Worker worker = this.worker;
                    long j5 = this.timeskip;
                    worker.schedulePeriodically(this, j5, j5, this.unit);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SubjectWork subjectWork = new SubjectWork(UnicastSubject.create(this.bufferSize), true);
            if (!this.cancelled) {
                this.queue.offer(subjectWork);
            }
            if (enter()) {
                drainLoop();
            }
        }
    }

    public ObservableWindowTimed(ObservableSource<T> observableSource, long j5, long j6, TimeUnit timeUnit, Scheduler scheduler, long j7, int i4, boolean z2) {
        super(observableSource);
        this.timespan = j5;
        this.timeskip = j6;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.maxSize = j7;
        this.bufferSize = i4;
        this.restartTimerOnMaxSize = z2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        long j5 = this.timespan;
        long j6 = this.timeskip;
        if (j5 == j6) {
            long j7 = this.maxSize;
            if (j7 == Long.MAX_VALUE) {
                this.source.subscribe(new WindowExactUnboundedObserver(serializedObserver, j5, this.unit, this.scheduler, this.bufferSize));
                return;
            } else {
                this.source.subscribe(new WindowExactBoundedObserver(serializedObserver, j5, this.unit, this.scheduler, this.bufferSize, j7, this.restartTimerOnMaxSize));
                return;
            }
        }
        this.source.subscribe(new WindowSkipObserver(serializedObserver, j5, j6, this.unit, this.scheduler.createWorker(), this.bufferSize));
    }
}
