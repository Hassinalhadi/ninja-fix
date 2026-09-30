package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import qg.b;
import qg.c;

/* loaded from: classes2.dex */
public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends b> mapper;
    final int prefetch;
    final b source;

    public FlowableConcatMapPublisher(b bVar, Function<? super T, ? extends b> function, int i4, ErrorMode errorMode) {
        this.source = bVar;
        this.mapper = function;
        this.prefetch = i4;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableConcatMap.subscribe(cVar, this.mapper, this.prefetch, this.errorMode));
    }
}
