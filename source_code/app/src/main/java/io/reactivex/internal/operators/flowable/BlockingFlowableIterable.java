package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import qg.d;

/* loaded from: classes2.dex */
public final class BlockingFlowableIterable<T> implements Iterable<T> {
    final int bufferSize;
    final Flowable<T> source;

    /* loaded from: classes2.dex */
    public static final class BlockingFlowableIterator<T> extends AtomicReference<d> implements FlowableSubscriber<T>, Iterator<T>, Runnable, Disposable {
        private static final long serialVersionUID = 6695226475494099826L;
        final long batchSize;
        final Condition condition;
        volatile boolean done;
        volatile Throwable error;
        final long limit;
        final Lock lock;
        long produced;
        final SpscArrayQueue<T> queue;

        public BlockingFlowableIterator(int i4) {
            this.queue = new SpscArrayQueue<>(i4);
            this.batchSize = i4;
            this.limit = i4 - (i4 >> 2);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
            signalConsumer();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!isDisposed()) {
                boolean z2 = this.done;
                boolean isEmpty = this.queue.isEmpty();
                if (z2) {
                    Throwable th = this.error;
                    if (th == null) {
                        if (isEmpty) {
                            return false;
                        }
                    } else {
                        throw ExceptionHelper.wrapOrThrow(th);
                    }
                }
                if (isEmpty) {
                    BlockingHelper.verifyNonBlocking();
                    this.lock.lock();
                    while (!this.done && this.queue.isEmpty() && !isDisposed()) {
                        try {
                            try {
                                this.condition.await();
                            } catch (InterruptedException e) {
                                run();
                                throw ExceptionHelper.wrapOrThrow(e);
                            }
                        } finally {
                            this.lock.unlock();
                        }
                    }
                } else {
                    return true;
                }
            }
            Throwable th2 = this.error;
            if (th2 == null) {
                return false;
            }
            throw ExceptionHelper.wrapOrThrow(th2);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T poll = this.queue.poll();
                long j5 = this.produced + 1;
                if (j5 == this.limit) {
                    this.produced = 0L;
                    get().request(j5);
                    return poll;
                }
                this.produced = j5;
                return poll;
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.done = true;
            signalConsumer();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            signalConsumer();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!this.queue.offer(t5)) {
                SubscriptionHelper.cancel(this);
                onError(new MissingBackpressureException("Queue full?!"));
            } else {
                signalConsumer();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, this.batchSize);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.lang.Runnable
        public void run() {
            SubscriptionHelper.cancel(this);
            signalConsumer();
        }

        public void signalConsumer() {
            this.lock.lock();
            try {
                this.condition.signalAll();
            } finally {
                this.lock.unlock();
            }
        }
    }

    public BlockingFlowableIterable(Flowable<T> flowable, int i4) {
        this.source = flowable;
        this.bufferSize = i4;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        BlockingFlowableIterator blockingFlowableIterator = new BlockingFlowableIterator(this.bufferSize);
        this.source.subscribe((FlowableSubscriber) blockingFlowableIterator);
        return blockingFlowableIterator;
    }
}
