package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import qg.c;

/* loaded from: classes2.dex */
public final class FlowableDoAfterNext<T> extends AbstractFlowableWithUpstream<T, T> {
    final Consumer<? super T> onAfterNext;

    /* loaded from: classes2.dex */
    public static final class DoAfterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        final Consumer<? super T> onAfterNext;

        public DoAfterConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer) {
            super(conditionalSubscriber);
            this.onAfterNext = consumer;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            this.downstream.onNext(t5);
            if (this.sourceMode == 0) {
                try {
                    this.onAfterNext.accept(t5);
                } catch (Throwable th) {
                    fail(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll = this.qs.poll();
            if (poll != null) {
                this.onAfterNext.accept(poll);
            }
            return poll;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i4) {
            return transitiveBoundaryFusion(i4);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t5) {
            boolean tryOnNext = this.downstream.tryOnNext(t5);
            try {
                this.onAfterNext.accept(t5);
                return tryOnNext;
            } catch (Throwable th) {
                fail(th);
                return tryOnNext;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class DoAfterSubscriber<T> extends BasicFuseableSubscriber<T, T> {
        final Consumer<? super T> onAfterNext;

        public DoAfterSubscriber(c cVar, Consumer<? super T> consumer) {
            super(cVar);
            this.onAfterNext = consumer;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!this.done) {
                this.downstream.onNext(t5);
                if (this.sourceMode == 0) {
                    try {
                        this.onAfterNext.accept(t5);
                    } catch (Throwable th) {
                        fail(th);
                    }
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll = this.qs.poll();
            if (poll != null) {
                this.onAfterNext.accept(poll);
            }
            return poll;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i4) {
            return transitiveBoundaryFusion(i4);
        }
    }

    public FlowableDoAfterNext(Flowable<T> flowable, Consumer<? super T> consumer) {
        super(flowable);
        this.onAfterNext = consumer;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber) new DoAfterConditionalSubscriber((ConditionalSubscriber) cVar, this.onAfterNext));
        } else {
            this.source.subscribe((FlowableSubscriber) new DoAfterSubscriber(cVar, this.onAfterNext));
        }
    }
}
