package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;
import qg.b;
import qg.c;

/* loaded from: classes2.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {
    final boolean delayError;
    final Function<? super T, ? extends b> mapper;
    final int maxConcurrency;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends b> function, boolean z2, int i4, int i5) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.delayError = z2;
        this.maxConcurrency = i4;
        this.prefetch = i5;
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
            cVarArr2[i4] = FlowableFlatMap.subscribe(cVarArr[i4], this.mapper, this.delayError, this.maxConcurrency, this.prefetch);
        }
        this.source.subscribe(cVarArr2);
    }
}
