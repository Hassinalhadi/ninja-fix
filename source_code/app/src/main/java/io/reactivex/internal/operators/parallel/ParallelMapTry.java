package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class ParallelMapTry<T, R> extends ParallelFlowable<R> {
    final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
    final Function<? super T, ? extends R> mapper;
    final ParallelFlowable<T> source;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelMapTry$1, reason: invalid class name */
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
    public static final class ParallelMapTryConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, d {
        boolean done;
        final ConditionalSubscriber<? super R> downstream;
        final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
        final Function<? super T, ? extends R> mapper;
        d upstream;

        public ParallelMapTryConditionalSubscriber(ConditionalSubscriber<? super R> conditionalSubscriber, Function<? super T, ? extends R> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.downstream = conditionalSubscriber;
            this.mapper = function;
            this.errorHandler = biFunction;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!tryOnNext(t5) && !this.done) {
                this.upstream.request(1L);
            }
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

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t5) {
            int i4;
            if (!this.done) {
                long j5 = 0;
                do {
                    try {
                        return this.downstream.tryOnNext(ObjectHelper.requireNonNull(this.mapper.apply(t5), "The mapper returned a null value"));
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        try {
                            j5++;
                            i4 = AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling[((ParallelFailureHandling) ObjectHelper.requireNonNull(this.errorHandler.apply(Long.valueOf(j5), th), "The errorHandler returned a null item")).ordinal()];
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            cancel();
                            onError(new CompositeException(th, th2));
                            return false;
                        }
                    }
                } while (i4 == 1);
                if (i4 != 2) {
                    if (i4 != 3) {
                        cancel();
                        onError(th);
                        return false;
                    }
                    cancel();
                    onComplete();
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ParallelMapTrySubscriber<T, R> implements ConditionalSubscriber<T>, d {
        boolean done;
        final c downstream;
        final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
        final Function<? super T, ? extends R> mapper;
        d upstream;

        public ParallelMapTrySubscriber(c cVar, Function<? super T, ? extends R> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.downstream = cVar;
            this.mapper = function;
            this.errorHandler = biFunction;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!tryOnNext(t5) && !this.done) {
                this.upstream.request(1L);
            }
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

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t5) {
            int i4;
            if (!this.done) {
                long j5 = 0;
                do {
                    try {
                        this.downstream.onNext(ObjectHelper.requireNonNull(this.mapper.apply(t5), "The mapper returned a null value"));
                        return true;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        try {
                            j5++;
                            i4 = AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling[((ParallelFailureHandling) ObjectHelper.requireNonNull(this.errorHandler.apply(Long.valueOf(j5), th), "The errorHandler returned a null item")).ordinal()];
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            cancel();
                            onError(new CompositeException(th, th2));
                            return false;
                        }
                    }
                } while (i4 == 1);
                if (i4 != 2) {
                    if (i4 != 3) {
                        cancel();
                        onError(th);
                        return false;
                    }
                    cancel();
                    onComplete();
                }
            }
            return false;
        }
    }

    public ParallelMapTry(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends R> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        this.source = parallelFlowable;
        this.mapper = function;
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
                cVarArr2[i4] = new ParallelMapTryConditionalSubscriber((ConditionalSubscriber) cVar, this.mapper, this.errorHandler);
            } else {
                cVarArr2[i4] = new ParallelMapTrySubscriber(cVar, this.mapper, this.errorHandler);
            }
        }
        this.source.subscribe(cVarArr2);
    }
}
