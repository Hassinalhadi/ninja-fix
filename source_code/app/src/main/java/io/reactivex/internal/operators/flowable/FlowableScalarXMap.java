package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import qg.b;
import qg.c;

/* loaded from: classes2.dex */
public final class FlowableScalarXMap {

    /* loaded from: classes2.dex */
    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        final Function<? super T, ? extends b> mapper;
        final T value;

        public ScalarXMapFlowable(T t5, Function<? super T, ? extends b> function) {
            this.value = t5;
            this.mapper = function;
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(c cVar) {
            try {
                b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(this.value), "The mapper returned a null Publisher");
                if (bVar instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar).call();
                        if (call == null) {
                            EmptySubscription.complete(cVar);
                            return;
                        } else {
                            cVar.onSubscribe(new ScalarSubscription(cVar, call));
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        EmptySubscription.error(th, cVar);
                        return;
                    }
                }
                bVar.subscribe(cVar);
            } catch (Throwable th2) {
                EmptySubscription.error(th2, cVar);
            }
        }
    }

    private FlowableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flowable<U> scalarXMap(T t5, Function<? super T, ? extends b> function) {
        return RxJavaPlugins.onAssembly(new ScalarXMapFlowable(t5, function));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(b bVar, c cVar, Function<? super T, ? extends b> function) {
        if (bVar instanceof Callable) {
            try {
                A0.b bVar2 = (Object) ((Callable) bVar).call();
                if (bVar2 == null) {
                    EmptySubscription.complete(cVar);
                    return true;
                }
                try {
                    b bVar3 = (b) ObjectHelper.requireNonNull(function.apply(bVar2), "The mapper returned a null Publisher");
                    if (bVar3 instanceof Callable) {
                        try {
                            Object call = ((Callable) bVar3).call();
                            if (call == null) {
                                EmptySubscription.complete(cVar);
                                return true;
                            }
                            cVar.onSubscribe(new ScalarSubscription(cVar, call));
                            return true;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            EmptySubscription.error(th, cVar);
                            return true;
                        }
                    }
                    bVar3.subscribe(cVar);
                    return true;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(th2, cVar);
                    return true;
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, cVar);
                return true;
            }
        }
        return false;
    }
}
