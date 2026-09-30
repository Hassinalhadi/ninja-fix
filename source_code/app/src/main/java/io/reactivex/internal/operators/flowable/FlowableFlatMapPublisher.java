package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import qg.b;
import qg.c;

/* loaded from: classes2.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends b> mapper;
    final int maxConcurrency;
    final b source;

    public FlowableFlatMapPublisher(b bVar, Function<? super T, ? extends b> function, boolean z2, int i4, int i5) {
        this.source = bVar;
        this.mapper = function;
        this.delayErrors = z2;
        this.maxConcurrency = i4;
        this.bufferSize = i5;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableFlatMap.subscribe(cVar, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
