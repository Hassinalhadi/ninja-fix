package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableMergeWithCompletable<T> extends AbstractFlowableWithUpstream<T, T> {
    final CompletableSource other;

    /* loaded from: classes2.dex */
    public static final class MergeWithSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -4592979584110982903L;
        final c downstream;
        volatile boolean mainDone;
        volatile boolean otherDone;
        final AtomicReference<d> mainSubscription = new AtomicReference<>();
        final OtherObserver otherObserver = new OtherObserver(this);
        final AtomicThrowable error = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();

        /* loaded from: classes2.dex */
        public static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -2935427570954647017L;
            final MergeWithSubscriber<?> parent;

            public OtherObserver(MergeWithSubscriber<?> mergeWithSubscriber) {
                this.parent = mergeWithSubscriber;
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.otherComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public MergeWithSubscriber(c cVar) {
            this.downstream = cVar;
        }

        @Override // qg.d
        public void cancel() {
            SubscriptionHelper.cancel(this.mainSubscription);
            DisposableHelper.dispose(this.otherObserver);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.mainDone = true;
            if (this.otherDone) {
                HalfSerializer.onComplete(this.downstream, this, this.error);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.otherObserver);
            HalfSerializer.onError(this.downstream, th, this, this.error);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            HalfSerializer.onNext(this.downstream, t5, this, this.error);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.mainSubscription, this.requested, dVar);
        }

        public void otherComplete() {
            this.otherDone = true;
            if (this.mainDone) {
                HalfSerializer.onComplete(this.downstream, this, this.error);
            }
        }

        public void otherError(Throwable th) {
            SubscriptionHelper.cancel(this.mainSubscription);
            HalfSerializer.onError(this.downstream, th, this, this.error);
        }

        @Override // qg.d
        public void request(long j5) {
            SubscriptionHelper.deferredRequest(this.mainSubscription, this.requested, j5);
        }
    }

    public FlowableMergeWithCompletable(Flowable<T> flowable, CompletableSource completableSource) {
        super(flowable);
        this.other = completableSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        MergeWithSubscriber mergeWithSubscriber = new MergeWithSubscriber(cVar);
        cVar.onSubscribe(mergeWithSubscriber);
        this.source.subscribe((FlowableSubscriber) mergeWithSubscriber);
        this.other.subscribe(mergeWithSubscriber.otherObserver);
    }
}
