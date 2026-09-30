package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableGenerate<T, S> extends Flowable<T> {
    final Consumer<? super S> disposeState;
    final BiFunction<S, Emitter<T>, S> generator;
    final Callable<S> stateSupplier;

    /* loaded from: classes2.dex */
    public static final class GeneratorSubscription<T, S> extends AtomicLong implements Emitter<T>, d {
        private static final long serialVersionUID = 7565982551505011832L;
        volatile boolean cancelled;
        final Consumer<? super S> disposeState;
        final c downstream;
        final BiFunction<S, ? super Emitter<T>, S> generator;
        boolean hasNext;
        S state;
        boolean terminate;

        public GeneratorSubscription(c cVar, BiFunction<S, ? super Emitter<T>, S> biFunction, Consumer<? super S> consumer, S s3) {
            this.downstream = cVar;
            this.generator = biFunction;
            this.disposeState = consumer;
            this.state = s3;
        }

        private void dispose(S s3) {
            try {
                this.disposeState.accept(s3);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
        }

        @Override // qg.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                if (BackpressureHelper.add(this, 1L) == 0) {
                    S s3 = this.state;
                    this.state = null;
                    dispose(s3);
                }
            }
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (!this.terminate) {
                this.terminate = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.Emitter
        public void onError(Throwable th) {
            if (this.terminate) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.terminate = true;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t5) {
            if (!this.terminate) {
                if (this.hasNext) {
                    onError(new IllegalStateException("onNext already called in this generate turn"));
                } else if (t5 == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.hasNext = true;
                    this.downstream.onNext(t5);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        
            r9.state = r0;
            r10 = addAndGet(-r4);
         */
        @Override // qg.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5) && BackpressureHelper.add(this, j5) == 0) {
                S s3 = this.state;
                BiFunction<S, ? super Emitter<T>, S> biFunction = this.generator;
                do {
                    long j6 = 0;
                    while (true) {
                        if (j6 != j5) {
                            if (this.cancelled) {
                                this.state = null;
                                dispose(s3);
                                return;
                            }
                            this.hasNext = false;
                            try {
                                s3 = biFunction.apply(s3, this);
                                if (this.terminate) {
                                    this.cancelled = true;
                                    this.state = null;
                                    dispose(s3);
                                    return;
                                }
                                j6++;
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.cancelled = true;
                                this.state = null;
                                onError(th);
                                dispose(s3);
                                return;
                            }
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
    }

    public FlowableGenerate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        this.stateSupplier = callable;
        this.generator = biFunction;
        this.disposeState = consumer;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        try {
            cVar.onSubscribe(new GeneratorSubscription(cVar, this.generator, this.disposeState, this.stateSupplier.call()));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
