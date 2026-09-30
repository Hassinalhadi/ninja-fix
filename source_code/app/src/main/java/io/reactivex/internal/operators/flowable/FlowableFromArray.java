package io.reactivex.internal.operators.flowable;

import av.q;
import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import qg.c;

/* loaded from: classes2.dex */
public final class FlowableFromArray<T> extends Flowable<T> {
    final T[] array;

    /* loaded from: classes2.dex */
    public static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super T> downstream;

        public ArrayConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, T[] tArr) {
            super(tArr);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            for (int i4 = this.index; i4 != length; i4++) {
                if (!this.cancelled) {
                    T t5 = tArr[i4];
                    if (t5 == null) {
                        conditionalSubscriber.onError(new NullPointerException(q.delta(i4, "The element at index ", " is null")));
                        return;
                    }
                    conditionalSubscriber.tryOnNext(t5);
                } else {
                    return;
                }
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        
            r10.index = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void slowPath(long j5) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i4 = this.index;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            do {
                long j6 = 0;
                while (true) {
                    if (j6 != j5 && i4 != length) {
                        if (!this.cancelled) {
                            T t5 = tArr[i4];
                            if (t5 == null) {
                                conditionalSubscriber.onError(new NullPointerException(q.delta(i4, "The element at index ", " is null")));
                                return;
                            } else {
                                if (conditionalSubscriber.tryOnNext(t5)) {
                                    j6++;
                                }
                                i4++;
                            }
                        } else {
                            return;
                        }
                    } else if (i4 == length) {
                        if (!this.cancelled) {
                            conditionalSubscriber.onComplete();
                            return;
                        }
                        return;
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
    public static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final c downstream;

        public ArraySubscription(c cVar, T[] tArr) {
            super(tArr);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            c cVar = this.downstream;
            for (int i4 = this.index; i4 != length; i4++) {
                if (!this.cancelled) {
                    T t5 = tArr[i4];
                    if (t5 == null) {
                        cVar.onError(new NullPointerException(q.delta(i4, "The element at index ", " is null")));
                        return;
                    }
                    cVar.onNext(t5);
                } else {
                    return;
                }
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        
            r10.index = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void slowPath(long j5) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i4 = this.index;
            c cVar = this.downstream;
            do {
                long j6 = 0;
                while (true) {
                    if (j6 != j5 && i4 != length) {
                        if (!this.cancelled) {
                            T t5 = tArr[i4];
                            if (t5 == null) {
                                cVar.onError(new NullPointerException(q.delta(i4, "The element at index ", " is null")));
                                return;
                            } else {
                                cVar.onNext(t5);
                                j6++;
                                i4++;
                            }
                        } else {
                            return;
                        }
                    } else if (i4 == length) {
                        if (!this.cancelled) {
                            cVar.onComplete();
                            return;
                        }
                        return;
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
    public static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        public BaseArraySubscription(T[] tArr) {
            this.array = tArr;
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.index = this.array.length;
        }

        public abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            if (this.index == this.array.length) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            int i4 = this.index;
            T[] tArr = this.array;
            if (i4 == tArr.length) {
                return null;
            }
            this.index = i4 + 1;
            return (T) ObjectHelper.requireNonNull(tArr[i4], "array element is null");
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

    public FlowableFromArray(T[] tArr) {
        this.array = tArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            cVar.onSubscribe(new ArrayConditionalSubscription((ConditionalSubscriber) cVar, this.array));
        } else {
            cVar.onSubscribe(new ArraySubscription(cVar, this.array));
        }
    }
}
