package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.parallel.ParallelFlowable;
import qg.b;
import qg.c;

/* loaded from: classes2.dex */
public final class ParallelConcatMap<T, R> extends ParallelFlowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends b> mapper;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelConcatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends b> function, int i4, ErrorMode errorMode) {
        this.source = parallelFlowable;
        this.mapper = (Function) ObjectHelper.requireNonNull(function, "mapper");
        this.prefetch = i4;
        this.errorMode = (ErrorMode) ObjectHelper.requireNonNull(errorMode, "errorMode");
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
            cVarArr2[i4] = FlowableConcatMap.subscribe(cVarArr[i4], this.mapper, this.prefetch, this.errorMode);
        }
        this.source.subscribe(cVarArr2);
    }
}
