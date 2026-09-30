package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableConcatWithCompletable<T> extends AbstractFlowableWithUpstream<T, T> {
    final CompletableSource other;

    public FlowableConcatWithCompletable(Flowable<T> flowable, CompletableSource completableSource) {
        super(flowable);
        this.other = completableSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new ConcatWithSubscriber(cVar, this.other));
    }

    /* loaded from: classes2.dex */
    public static final class ConcatWithSubscriber<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, CompletableObserver, d {
        private static final long serialVersionUID = -7346385463600070225L;
        final c downstream;
        boolean inCompletable;
        CompletableSource other;
        d upstream;

        public ConcatWithSubscriber(c cVar, CompletableSource completableSource) {
            this.downstream = cVar;
            this.other = completableSource;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.cancel();
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.inCompletable) {
                this.downstream.onComplete();
                return;
            }
            this.inCompletable = true;
            this.upstream = SubscriptionHelper.CANCELLED;
            CompletableSource completableSource = this.other;
            this.other = null;
            completableSource.subscribe(this);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            this.upstream.request(j5);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }
}
