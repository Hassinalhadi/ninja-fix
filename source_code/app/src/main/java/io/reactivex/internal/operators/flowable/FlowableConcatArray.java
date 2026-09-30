package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {
    final boolean delayError;
    final b[] sources;

    /* loaded from: classes2.dex */
    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final c downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final b[] sources;
        final AtomicInteger wip;

        public ConcatArraySubscriber(b[] bVarArr, boolean z2, c cVar) {
            super(false);
            this.downstream = cVar;
            this.sources = bVarArr;
            this.delayError = z2;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                b[] bVarArr = this.sources;
                int length = bVarArr.length;
                int i4 = this.index;
                while (i4 != length) {
                    b bVar = bVarArr[i4];
                    if (bVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (this.delayError) {
                            List list = this.errors;
                            if (list == null) {
                                list = new ArrayList((length - i4) + 1);
                                this.errors = list;
                            }
                            list.add(nullPointerException);
                            i4++;
                        } else {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                    } else {
                        long j5 = this.produced;
                        if (j5 != 0) {
                            this.produced = 0L;
                            produced(j5);
                        }
                        bVar.subscribe(this);
                        i4++;
                        this.index = i4;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list2 = this.errors;
                if (list2 != null) {
                    if (list2.size() == 1) {
                        this.downstream.onError(list2.get(0));
                        return;
                    } else {
                        this.downstream.onError(new CompositeException(list2));
                        return;
                    }
                }
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.delayError) {
                List list = this.errors;
                if (list == null) {
                    list = new ArrayList((this.sources.length - this.index) + 1);
                    this.errors = list;
                }
                list.add(th);
                onComplete();
                return;
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            this.produced++;
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            setSubscription(dVar);
        }
    }

    public FlowableConcatArray(b[] bVarArr, boolean z2) {
        this.sources = bVarArr;
        this.delayError = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.sources, this.delayError, cVar);
        cVar.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
