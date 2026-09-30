package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {
    final b other;
    final CompletableSource source;

    public CompletableAndThenPublisher(CompletableSource completableSource, b bVar) {
        this.source = completableSource;
        this.other = bVar;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe(new AndThenPublisherSubscriber(cVar, this.other));
    }

    /* loaded from: classes2.dex */
    public static final class AndThenPublisherSubscriber<R> extends AtomicReference<d> implements FlowableSubscriber<R>, CompletableObserver, d {
        private static final long serialVersionUID = -8948264376121066672L;
        final c downstream;
        b other;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        public AndThenPublisherSubscriber(c cVar, b bVar) {
            this.downstream = cVar;
            this.other = bVar;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            b bVar = this.other;
            if (bVar == null) {
                this.downstream.onComplete();
            } else {
                this.other = null;
                bVar.subscribe(this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(R r4) {
            this.downstream.onNext(r4);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            SubscriptionHelper.deferredRequest(this, this.requested, j5);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, dVar);
        }
    }
}
