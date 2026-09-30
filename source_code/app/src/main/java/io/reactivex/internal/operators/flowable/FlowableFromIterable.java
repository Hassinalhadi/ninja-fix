package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import qg.c;

/* loaded from: classes2.dex */
public final class FlowableFromIterable<T> extends Flowable<T> {
    final Iterable<? extends T> source;

    /* loaded from: classes2.dex */
    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        Iterator<? extends T> it;
        boolean once;

        public BaseRangeSubscription(Iterator<? extends T> it) {
            this.it = it;
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.it = null;
        }

        public abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.it;
            if (it != null && it.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            Iterator<? extends T> it = this.it;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) ObjectHelper.requireNonNull(this.it.next(), "Iterator.next() returned a null value");
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public final void request(long j5) {
            if (SubscriptionHelper.validate(j5) && BackpressureHelper.add(this, j5) == 0) {
                if (j5 == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j5);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i4) {
            return i4 & 1;
        }

        public abstract void slowPath(long j5);
    }

    /* loaded from: classes2.dex */
    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final ConditionalSubscriber<? super T> downstream;

        public IteratorConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, Iterator<? extends T> it) {
            super(it);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void fastPath() {
            Iterator<? extends T> it = this.it;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (!this.cancelled) {
                        if (next == null) {
                            conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        conditionalSubscriber.tryOnNext(next);
                        if (!this.cancelled) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.cancelled) {
                                        conditionalSubscriber.onComplete();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                conditionalSubscriber.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    conditionalSubscriber.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void slowPath(long j5) {
            Iterator<? extends T> it = this.it;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            do {
                long j6 = 0;
                while (true) {
                    if (j6 != j5) {
                        if (!this.cancelled) {
                            try {
                                T next = it.next();
                                if (!this.cancelled) {
                                    if (next == null) {
                                        conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                                        return;
                                    }
                                    boolean tryOnNext = conditionalSubscriber.tryOnNext(next);
                                    if (!this.cancelled) {
                                        try {
                                            if (!it.hasNext()) {
                                                if (!this.cancelled) {
                                                    conditionalSubscriber.onComplete();
                                                    return;
                                                }
                                                return;
                                            } else if (tryOnNext) {
                                                j6++;
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            conditionalSubscriber.onError(th);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                conditionalSubscriber.onError(th2);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        j5 = get();
                        if (j6 == j5) {
                            break;
                        }
                    }
                }
            } while (j5 != 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final c downstream;

        public IteratorSubscription(c cVar, Iterator<? extends T> it) {
            super(it);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void fastPath() {
            Iterator<? extends T> it = this.it;
            c cVar = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (!this.cancelled) {
                        if (next == null) {
                            cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        cVar.onNext(next);
                        if (!this.cancelled) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.cancelled) {
                                        cVar.onComplete();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                cVar.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cVar.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void slowPath(long j5) {
            Iterator<? extends T> it = this.it;
            c cVar = this.downstream;
            do {
                long j6 = 0;
                while (true) {
                    if (j6 != j5) {
                        if (!this.cancelled) {
                            try {
                                T next = it.next();
                                if (!this.cancelled) {
                                    if (next == null) {
                                        cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                        return;
                                    }
                                    cVar.onNext(next);
                                    if (!this.cancelled) {
                                        try {
                                            if (!it.hasNext()) {
                                                if (!this.cancelled) {
                                                    cVar.onComplete();
                                                    return;
                                                }
                                                return;
                                            }
                                            j6++;
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            cVar.onError(th);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                cVar.onError(th2);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        j5 = get();
                        if (j6 == j5) {
                            break;
                        }
                    }
                }
            } while (j5 != 0);
        }
    }

    public FlowableFromIterable(Iterable<? extends T> iterable) {
        this.source = iterable;
    }

    public static <T> void subscribe(c cVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.complete(cVar);
            } else if (cVar instanceof ConditionalSubscriber) {
                cVar.onSubscribe(new IteratorConditionalSubscription((ConditionalSubscriber) cVar, it));
            } else {
                cVar.onSubscribe(new IteratorSubscription(cVar, it));
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        try {
            subscribe(cVar, this.source.iterator());
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
