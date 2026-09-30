package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.operators.flowable.FlowableSequenceEqual;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import qg.b;

/* loaded from: classes2.dex */
public final class FlowableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {
    final BiPredicate<? super T, ? super T> comparer;
    final b first;
    final int prefetch;
    final b second;

    /* loaded from: classes2.dex */
    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable, FlowableSequenceEqual.EqualCoordinatorHelper {
        private static final long serialVersionUID = -6178010334400373240L;
        final BiPredicate<? super T, ? super T> comparer;
        final SingleObserver<? super Boolean> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final FlowableSequenceEqual.EqualSubscriber<T> first;
        final FlowableSequenceEqual.EqualSubscriber<T> second;
        T v1;

        /* renamed from: v2, reason: collision with root package name */
        T f12823v2;

        public EqualCoordinator(SingleObserver<? super Boolean> singleObserver, int i4, BiPredicate<? super T, ? super T> biPredicate) {
            this.downstream = singleObserver;
            this.comparer = biPredicate;
            this.first = new FlowableSequenceEqual.EqualSubscriber<>(this, i4);
            this.second = new FlowableSequenceEqual.EqualSubscriber<>(this, i4);
        }

        public void cancelAndClear() {
            this.first.cancel();
            this.first.clear();
            this.second.cancel();
            this.second.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.first.cancel();
            this.second.cancel();
            if (getAndIncrement() == 0) {
                this.first.clear();
                this.second.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void drain() {
            boolean z2;
            if (getAndIncrement() == 0) {
                int i4 = 1;
                do {
                    SimpleQueue<T> simpleQueue = this.first.queue;
                    SimpleQueue<T> simpleQueue2 = this.second.queue;
                    if (simpleQueue != null && simpleQueue2 != null) {
                        while (!isDisposed()) {
                            if (this.error.get() != null) {
                                cancelAndClear();
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                            boolean z10 = this.first.done;
                            T t5 = this.v1;
                            if (t5 == null) {
                                try {
                                    t5 = simpleQueue.poll();
                                    this.v1 = t5;
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    cancelAndClear();
                                    this.error.addThrowable(th);
                                    this.downstream.onError(this.error.terminate());
                                    return;
                                }
                            }
                            boolean z11 = false;
                            if (t5 == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            boolean z12 = this.second.done;
                            T t10 = this.f12823v2;
                            if (t10 == null) {
                                try {
                                    t10 = simpleQueue2.poll();
                                    this.f12823v2 = t10;
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    cancelAndClear();
                                    this.error.addThrowable(th2);
                                    this.downstream.onError(this.error.terminate());
                                    return;
                                }
                            }
                            if (t10 == null) {
                                z11 = true;
                            }
                            if (z10 && z12 && z2 && z11) {
                                this.downstream.onSuccess(Boolean.TRUE);
                                return;
                            }
                            if (z10 && z12 && z2 != z11) {
                                cancelAndClear();
                                this.downstream.onSuccess(Boolean.FALSE);
                                return;
                            }
                            if (!z2 && !z11) {
                                try {
                                    if (!this.comparer.test(t5, t10)) {
                                        cancelAndClear();
                                        this.downstream.onSuccess(Boolean.FALSE);
                                        return;
                                    } else {
                                        this.v1 = null;
                                        this.f12823v2 = null;
                                        this.first.request();
                                        this.second.request();
                                    }
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    cancelAndClear();
                                    this.error.addThrowable(th3);
                                    this.downstream.onError(this.error.terminate());
                                    return;
                                }
                            }
                        }
                        this.first.clear();
                        this.second.clear();
                        return;
                    }
                    if (isDisposed()) {
                        this.first.clear();
                        this.second.clear();
                        return;
                    } else if (this.error.get() != null) {
                        cancelAndClear();
                        this.downstream.onError(this.error.terminate());
                        return;
                    }
                    i4 = addAndGet(-i4);
                } while (i4 != 0);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void innerError(Throwable th) {
            if (this.error.addThrowable(th)) {
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.first.get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        public void subscribe(b bVar, b bVar2) {
            bVar.subscribe(this.first);
            bVar2.subscribe(this.second);
        }
    }

    public FlowableSequenceEqualSingle(b bVar, b bVar2, BiPredicate<? super T, ? super T> biPredicate, int i4) {
        this.first = bVar;
        this.second = bVar2;
        this.comparer = biPredicate;
        this.prefetch = i4;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<Boolean> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSequenceEqual(this.first, this.second, this.comparer, this.prefetch));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(singleObserver, this.prefetch, this.comparer);
        singleObserver.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe(this.first, this.second);
    }
}
