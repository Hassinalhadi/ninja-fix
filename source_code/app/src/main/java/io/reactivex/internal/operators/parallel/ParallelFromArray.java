package io.reactivex.internal.operators.parallel;

import io.reactivex.parallel.ParallelFlowable;
import qg.b;
import qg.c;

/* loaded from: classes2.dex */
public final class ParallelFromArray<T> extends ParallelFlowable<T> {
    final b[] sources;

    public ParallelFromArray(b[] bVarArr) {
        this.sources = bVarArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.sources.length;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                this.sources[i4].subscribe(cVarArr[i4]);
            }
        }
    }
}
