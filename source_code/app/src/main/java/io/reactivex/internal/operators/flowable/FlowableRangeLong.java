package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import qg.c;

/* loaded from: classes2.dex */
public final class FlowableRangeLong extends Flowable<Long> {
    final long end;
    final long start;

    /* loaded from: classes2.dex */
    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Long> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final long end;
        long index;

        public BaseRangeSubscription(long j5, long j6) {
            this.index = j5;
            this.end = j6;
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
        public final Long poll() {
            long j5 = this.index;
            if (j5 == this.end) {
                return null;
            }
            this.index = 1 + j5;
            return Long.valueOf(j5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super Long> downstream;

        public RangeConditionalSubscription(ConditionalSubscriber<? super Long> conditionalSubscriber, long j5, long j6) {
            super(j5, j6);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        public void fastPath() {
            long j5 = this.end;
            ConditionalSubscriber<? super Long> conditionalSubscriber = this.downstream;
            for (long j6 = this.index; j6 != j5; j6++) {
                if (!this.cancelled) {
                    conditionalSubscriber.tryOnNext(Long.valueOf(j6));
                } else {
                    return;
                }
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            r12.index = r2;
            r13 = addAndGet(-r7);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void slowPath(long j5) {
            long j6 = this.end;
            long j7 = this.index;
            ConditionalSubscriber<? super Long> conditionalSubscriber = this.downstream;
            do {
                long j10 = 0;
                while (true) {
                    if (j10 != j5 && j7 != j6) {
                        if (!this.cancelled) {
                            if (conditionalSubscriber.tryOnNext(Long.valueOf(j7))) {
                                j10++;
                            }
                            j7++;
                        } else {
                            return;
                        }
                    } else if (j7 == j6) {
                        if (!this.cancelled) {
                            conditionalSubscriber.onComplete();
                            return;
                        }
                        return;
                    } else {
                        j5 = get();
                        if (j10 == j5) {
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

        public RangeSubscription(c cVar, long j5, long j6) {
            super(j5, j6);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        public void fastPath() {
            long j5 = this.end;
            c cVar = this.downstream;
            for (long j6 = this.index; j6 != j5; j6++) {
                if (!this.cancelled) {
                    cVar.onNext(Long.valueOf(j6));
                } else {
                    return;
                }
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            r11.index = r2;
            r12 = addAndGet(-r7);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void slowPath(long j5) {
            long j6 = this.end;
            long j7 = this.index;
            c cVar = this.downstream;
            do {
                long j10 = 0;
                while (true) {
                    if (j10 != j5 && j7 != j6) {
                        if (!this.cancelled) {
                            cVar.onNext(Long.valueOf(j7));
                            j10++;
                            j7++;
                        } else {
                            return;
                        }
                    } else if (j7 == j6) {
                        if (!this.cancelled) {
                            cVar.onComplete();
                            return;
                        }
                        return;
                    } else {
                        j5 = get();
                        if (j10 == j5) {
                            break;
                        }
                    }
                }
            } while (j5 != 0);
        }
    }

    public FlowableRangeLong(long j5, long j6) {
        this.start = j5;
        this.end = j5 + j6;
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
