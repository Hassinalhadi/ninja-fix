package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class ParallelFilterTry<T> extends ParallelFlowable<T> {
    final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
    final Predicate<? super T> predicate;
    final ParallelFlowable<T> source;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilterTry$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$parallel$ParallelFailureHandling;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            $SwitchMap$io$reactivex$parallel$ParallelFailureHandling = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$parallel$ParallelFailureHandling[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$reactivex$parallel$ParallelFailureHandling[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class BaseFilterSubscriber<T> implements ConditionalSubscriber<T>, d {
        boolean done;
        final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
        final Predicate<? super T> predicate;
        d upstream;

        public BaseFilterSubscriber(Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.predicate = predicate;
            this.errorHandler = biFunction;
        }

        @Override // qg.d
        public final void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public abstract /* synthetic */ void onComplete();

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public abstract /* synthetic */ void onError(Throwable th);

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public final void onNext(T t5) {
            if (!tryOnNext(t5) && !this.done) {
                this.upstream.request(1L);
            }
        }

        @Override // qg.d
        public final void request(long j5) {
            this.upstream.request(j5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ParallelFilterConditionalSubscriber<T> extends BaseFilterSubscriber<T> {
        final ConditionalSubscriber<? super T> downstream;

        public ParallelFilterConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t5) {
            int i4;
            int i5 = 2;
            if (!this.done) {
                long j5 = 0;
                do {
                    try {
                        if (this.predicate.test(t5) && this.downstream.tryOnNext(t5)) {
                            return true;
                        }
                        return false;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        try {
                            j5++;
                            i4 = AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling[((ParallelFailureHandling) ObjectHelper.requireNonNull(this.errorHandler.apply(Long.valueOf(j5), th), "The errorHandler returned a null item")).ordinal()];
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            cancel();
                            Throwable[] thArr = new Throwable[i5];
                            thArr[0] = th;
                            thArr[1] = th2;
                            onError(new CompositeException(thArr));
                        }
                    }
                } while (i4 == 1);
                if (i4 != i5) {
                    if (i4 != 3) {
                        cancel();
                        onError(th);
                        return false;
                    }
                    cancel();
                    onComplete();
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ParallelFilterSubscriber<T> extends BaseFilterSubscriber<T> {
        final c downstream;

        public ParallelFilterSubscriber(c cVar, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t5) {
            int i4;
            int i5 = 2;
            if (!this.done) {
                long j5 = 0;
                do {
                    try {
                        if (!this.predicate.test(t5)) {
                            return false;
                        }
                        this.downstream.onNext(t5);
                        return true;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        try {
                            j5++;
                            i4 = AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling[((ParallelFailureHandling) ObjectHelper.requireNonNull(this.errorHandler.apply(Long.valueOf(j5), th), "The errorHandler returned a null item")).ordinal()];
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            cancel();
                            Throwable[] thArr = new Throwable[i5];
                            thArr[0] = th;
                            thArr[1] = th2;
                            onError(new CompositeException(thArr));
                        }
                    }
                } while (i4 == 1);
                if (i4 != i5) {
                    if (i4 != 3) {
                        cancel();
                        onError(th);
                        return false;
                    }
                    cancel();
                    onComplete();
                }
                return false;
            }
            return false;
        }
    }

    public ParallelFilterTry(ParallelFlowable<T> parallelFlowable, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        this.source = parallelFlowable;
        this.predicate = predicate;
        this.errorHandler = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c[] cVarArr) {
        if (!validate(cVarArr)) {
            return;
        }
        int length = cVarArr.length;
        c[] cVarArr2 = new c[length];
        for (int i4 = 0; i4 < length; i4++) {
            c cVar = cVarArr[i4];
            if (cVar instanceof ConditionalSubscriber) {
                cVarArr2[i4] = new ParallelFilterConditionalSubscriber((ConditionalSubscriber) cVar, this.predicate, this.errorHandler);
            } else {
                cVarArr2[i4] = new ParallelFilterSubscriber(cVar, this.predicate, this.errorHandler);
            }
        }
        this.source.subscribe(cVarArr2);
    }
}
