package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableAmb<T> extends Flowable<T> {
    final b[] sources;
    final Iterable<? extends b> sourcesIterable;

    /* loaded from: classes2.dex */
    public static final class AmbCoordinator<T> implements d {
        final c downstream;
        final AmbInnerSubscriber<T>[] subscribers;
        final AtomicInteger winner = new AtomicInteger();

        public AmbCoordinator(c cVar, int i4) {
            this.downstream = cVar;
            this.subscribers = new AmbInnerSubscriber[i4];
        }

        @Override // qg.d
        public void cancel() {
            if (this.winner.get() != -1) {
                this.winner.lazySet(-1);
                for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                    ambInnerSubscriber.cancel();
                }
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                int i4 = this.winner.get();
                if (i4 > 0) {
                    this.subscribers[i4 - 1].request(j5);
                    return;
                }
                if (i4 == 0) {
                    for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                        ambInnerSubscriber.request(j5);
                    }
                }
            }
        }

        public void subscribe(b[] bVarArr) {
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = i4 + 1;
                ambInnerSubscriberArr[i4] = new AmbInnerSubscriber<>(this, i5, this.downstream);
                i4 = i5;
            }
            this.winner.lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i10 = 0; i10 < length && this.winner.get() == 0; i10++) {
                bVarArr[i10].subscribe(ambInnerSubscriberArr[i10]);
            }
        }

        public boolean win(int i4) {
            int i5 = 0;
            if (this.winner.get() != 0 || !this.winner.compareAndSet(0, i4)) {
                return false;
            }
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            while (i5 < length) {
                int i10 = i5 + 1;
                if (i10 != i4) {
                    ambInnerSubscriberArr[i5].cancel();
                }
                i5 = i10;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class AmbInnerSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -1185974347409665484L;
        final c downstream;
        final int index;
        final AtomicLong missedRequested = new AtomicLong();
        final AmbCoordinator<T> parent;
        boolean won;

        public AmbInnerSubscriber(AmbCoordinator<T> ambCoordinator, int i4, c cVar) {
            this.parent = ambCoordinator;
            this.index = i4;
            this.downstream = cVar;
        }

        @Override // qg.d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            } else {
                get().cancel();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                get().cancel();
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.won) {
                this.downstream.onNext(t5);
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onNext(t5);
            } else {
                get().cancel();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this, this.missedRequested, dVar);
        }

        @Override // qg.d
        public void request(long j5) {
            SubscriptionHelper.deferredRequest(this, this.missedRequested, j5);
        }
    }

    public FlowableAmb(b[] bVarArr, Iterable<? extends b> iterable) {
        this.sources = bVarArr;
        this.sourcesIterable = iterable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        int length;
        b[] bVarArr = this.sources;
        if (bVarArr == null) {
            bVarArr = new b[8];
            try {
                length = 0;
                for (b bVar : this.sourcesIterable) {
                    if (bVar == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), cVar);
                        return;
                    }
                    if (length == bVarArr.length) {
                        b[] bVarArr2 = new b[(length >> 2) + length];
                        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                        bVarArr = bVarArr2;
                    }
                    int i4 = length + 1;
                    bVarArr[length] = bVar;
                    length = i4;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, cVar);
                return;
            }
        } else {
            length = bVarArr.length;
        }
        if (length == 0) {
            EmptySubscription.complete(cVar);
        } else if (length == 1) {
            bVarArr[0].subscribe(cVar);
        } else {
            new AmbCoordinator(cVar, length).subscribe(bVarArr);
        }
    }
}
