package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class QueueDrainHelper {
    static final long COMPLETED_MASK = Long.MIN_VALUE;
    static final long REQUESTED_MASK = Long.MAX_VALUE;

    private QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean checkTerminated(boolean z2, boolean z10, c cVar, boolean z11, SimpleQueue<?> simpleQueue, QueueDrain<T, U> queueDrain) {
        if (queueDrain.cancelled()) {
            simpleQueue.clear();
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z11) {
            if (!z10) {
                return false;
            }
            Throwable error = queueDrain.error();
            if (error != null) {
                cVar.onError(error);
            } else {
                cVar.onComplete();
            }
            return true;
        }
        Throwable error2 = queueDrain.error();
        if (error2 != null) {
            simpleQueue.clear();
            cVar.onError(error2);
            return true;
        }
        if (!z10) {
            return false;
        }
        cVar.onComplete();
        return true;
    }

    public static <T> SimpleQueue<T> createQueue(int i4) {
        if (i4 < 0) {
            return new SpscLinkedArrayQueue(-i4);
        }
        return new SpscArrayQueue(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r1 = r8.leave(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T, U> void drainLoop(SimplePlainQueue<T> simplePlainQueue, Observer<? super U> observer, boolean z2, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        boolean z10;
        int i4 = 1;
        while (true) {
            SimplePlainQueue<T> simplePlainQueue2 = simplePlainQueue;
            Observer<? super U> observer2 = observer;
            boolean z11 = z2;
            Disposable disposable2 = disposable;
            ObservableQueueDrain<T, U> observableQueueDrain2 = observableQueueDrain;
            if (checkTerminated(observableQueueDrain.done(), simplePlainQueue.isEmpty(), observer2, z11, simplePlainQueue2, disposable2, observableQueueDrain2)) {
                return;
            }
            while (true) {
                boolean done = observableQueueDrain2.done();
                T poll = simplePlainQueue2.poll();
                if (poll == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z10;
                if (!checkTerminated(done, z10, observer2, z11, simplePlainQueue2, disposable2, observableQueueDrain2)) {
                    if (z12) {
                        break;
                    } else {
                        observableQueueDrain2.accept(observer2, poll);
                    }
                } else {
                    return;
                }
            }
            observer = observer2;
            z2 = z11;
            simplePlainQueue = simplePlainQueue2;
            disposable = disposable2;
            observableQueueDrain = observableQueueDrain2;
        }
    }

    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> simplePlainQueue, c cVar, boolean z2, Disposable disposable, QueueDrain<T, U> queueDrain) {
        boolean z10;
        int i4 = 1;
        while (true) {
            boolean done = queueDrain.done();
            T poll = simplePlainQueue.poll();
            if (poll == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            SimplePlainQueue<T> simplePlainQueue2 = simplePlainQueue;
            c cVar2 = cVar;
            boolean z11 = z2;
            QueueDrain<T, U> queueDrain2 = queueDrain;
            if (checkTerminated(done, z10, cVar2, z11, simplePlainQueue2, queueDrain2)) {
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            }
            if (z10) {
                i4 = queueDrain2.leave(-i4);
                if (i4 == 0) {
                    return;
                }
            } else {
                long requested = queueDrain2.requested();
                if (requested != 0) {
                    if (queueDrain2.accept(cVar2, poll) && requested != REQUESTED_MASK) {
                        queueDrain2.produced(1L);
                    }
                } else {
                    simplePlainQueue2.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    cVar2.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
            }
            cVar = cVar2;
            z2 = z11;
            simplePlainQueue = simplePlainQueue2;
            queueDrain = queueDrain2;
        }
    }

    public static boolean isCancelled(BooleanSupplier booleanSupplier) {
        try {
            return booleanSupplier.getAsBoolean();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            return true;
        }
    }

    public static <T> void postComplete(c cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j5;
        long j6;
        if (queue.isEmpty()) {
            cVar.onComplete();
            return;
        }
        if (postCompleteDrain(atomicLong.get(), cVar, queue, atomicLong, booleanSupplier)) {
            return;
        }
        do {
            j5 = atomicLong.get();
            if ((j5 & COMPLETED_MASK) == 0) {
                j6 = j5 | COMPLETED_MASK;
            } else {
                return;
            }
        } while (!atomicLong.compareAndSet(j5, j6));
        if (j5 != 0) {
            postCompleteDrain(j6, cVar, queue, atomicLong, booleanSupplier);
        }
    }

    public static <T> boolean postCompleteDrain(long j5, c cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j6 = j5 & COMPLETED_MASK;
        while (true) {
            if (j6 != j5) {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                T poll = queue.poll();
                if (poll == null) {
                    cVar.onComplete();
                    return true;
                }
                cVar.onNext(poll);
                j6++;
            } else {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    cVar.onComplete();
                    return true;
                }
                j5 = atomicLong.get();
                if (j5 == j6) {
                    long addAndGet = atomicLong.addAndGet(-(j6 & REQUESTED_MASK));
                    if ((REQUESTED_MASK & addAndGet) == 0) {
                        return false;
                    }
                    j6 = addAndGet & COMPLETED_MASK;
                    j5 = addAndGet;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean postCompleteRequest(long j5, c cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j6;
        long j7;
        do {
            j6 = atomicLong.get();
            j7 = REQUESTED_MASK & j6;
        } while (!atomicLong.compareAndSet(j6, BackpressureHelper.addCap(j7, j5) | (j6 & COMPLETED_MASK)));
        if (j6 == COMPLETED_MASK) {
            postCompleteDrain(j5 | COMPLETED_MASK, cVar, queue, atomicLong, booleanSupplier);
            return true;
        }
        return false;
    }

    public static void request(d dVar, int i4) {
        long j5;
        if (i4 < 0) {
            j5 = REQUESTED_MASK;
        } else {
            j5 = i4;
        }
        dVar.request(j5);
    }

    public static <T, U> boolean checkTerminated(boolean z2, boolean z10, Observer<?> observer, boolean z11, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z11) {
            if (!z10) {
                return false;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            Throwable error = observableQueueDrain.error();
            if (error != null) {
                observer.onError(error);
            } else {
                observer.onComplete();
            }
            return true;
        }
        Throwable error2 = observableQueueDrain.error();
        if (error2 != null) {
            simpleQueue.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(error2);
            return true;
        }
        if (!z10) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }
}
