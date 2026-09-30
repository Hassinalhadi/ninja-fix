package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class MaybeFlatMapPublisher<T, R> extends Flowable<R> {
    final Function<? super T, ? extends b> mapper;
    final MaybeSource<T> source;

    public MaybeFlatMapPublisher(MaybeSource<T> maybeSource, Function<? super T, ? extends b> function) {
        this.source = maybeSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe(new FlatMapPublisherSubscriber(cVar, this.mapper));
    }

    /* loaded from: classes2.dex */
    public static final class FlatMapPublisherSubscriber<T, R> extends AtomicReference<d> implements FlowableSubscriber<R>, MaybeObserver<T>, d {
        private static final long serialVersionUID = -8948264376121066672L;
        final c downstream;
        final Function<? super T, ? extends b> mapper;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        public FlatMapPublisherSubscriber(c cVar, Function<? super T, ? extends b> function) {
            this.downstream = cVar;
            this.mapper = function;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(R r4) {
            this.downstream.onNext(r4);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t5) {
            try {
                ((b) ObjectHelper.requireNonNull(this.mapper.apply(t5), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
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
