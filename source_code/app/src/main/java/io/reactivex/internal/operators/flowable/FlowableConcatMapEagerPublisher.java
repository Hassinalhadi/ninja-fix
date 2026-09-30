package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.util.ErrorMode;
import qg.b;
import qg.c;

/* loaded from: classes2.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends b> mapper;
    final int maxConcurrency;
    final int prefetch;
    final b source;

    public FlowableConcatMapEagerPublisher(b bVar, Function<? super T, ? extends b> function, int i4, int i5, ErrorMode errorMode) {
        this.source = bVar;
        this.mapper = function;
        this.maxConcurrency = i4;
        this.prefetch = i5;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe(new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(cVar, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }
}
