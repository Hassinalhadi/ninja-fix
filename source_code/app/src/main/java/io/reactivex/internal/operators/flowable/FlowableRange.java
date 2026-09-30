package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import qg.c;

/* loaded from: classes2.dex */
public final class FlowableRange extends Flowable<Integer> {
    final int end;
    final int start;

    /* loaded from: classes2.dex */
    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        public BaseRangeSubscription(int i4, int i5) {
            this.index = i4;
            this.end = i5;
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.index = this.end;
        }

        public abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            if (this.index == this.end) {
                return true;
            }
            return false;
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

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final Integer poll() {
            int i4 = this.index;
            if (i4 == this.end) {
                return null;
            }
            this.index = i4 + 1;
            return Integer.valueOf(i4);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super Integer> downstream;

        public RangeConditionalSubscription(ConditionalSubscriber<? super Integer> conditionalSubscriber, int i4, int i5) {
            super(i4, i5);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void fastPath() {
            int i4 = this.end;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            for (int i5 = this.index; i5 != i4; i5++) {
                if (!this.cancelled) {
                    conditionalSubscriber.tryOnNext(Integer.valueOf(i5));
                } else {
                    return;
                }
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        
            r9.index = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void slowPath(long j5) {
            int i4 = this.end;
            int i5 = this.index;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            do {
                long j6 = 0;
                while (true) {
                    if (j6 != j5 && i5 != i4) {
                        if (!this.cancelled) {
                            if (conditionalSubscriber.tryOnNext(Integer.valueOf(i5))) {
                                j6++;
                            }
                            i5++;
                        } else {
                            return;
                        }
                    } else if (i5 == i4) {
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
    public static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final c downstream;

        public RangeSubscription(c cVar, int i4, int i5) {
            super(i4, i5);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void fastPath() {
            int i4 = this.end;
            c cVar = this.downstream;
            for (int i5 = this.index; i5 != i4; i5++) {
                if (!this.cancelled) {
                    cVar.onNext(Integer.valueOf(i5));
                } else {
                    return;
                }
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        
            r9.index = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void slowPath(long j5) {
            int i4 = this.end;
            int i5 = this.index;
            c cVar = this.downstream;
            do {
                long j6 = 0;
                while (true) {
                    if (j6 != j5 && i5 != i4) {
                        if (!this.cancelled) {
                            cVar.onNext(Integer.valueOf(i5));
                            j6++;
                            i5++;
                        } else {
                            return;
                        }
                    } else if (i5 == i4) {
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

    public FlowableRange(int i4, int i5) {
        this.start = i4;
        this.end = i4 + i5;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            cVar.onSubscribe(new RangeConditionalSubscription((ConditionalSubscriber) cVar, this.start, this.end));
        } else {
            cVar.onSubscribe(new RangeSubscription(cVar, this.start, this.end));
        }
    }
}
