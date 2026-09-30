package Dd;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l implements Nd.c, Pd.d {
    public int alpha = RecyclerView.UNDEFINED_DURATION;
    public final /* synthetic */ m purple;

    public l(m mVar) {
        this.purple = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [Nd.c[]] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // Pd.d
    public final Pd.d getCallerFrame() {
        k kVar = k.alpha;
        int i4 = this.alpha;
        m mVar = this.purple;
        if (i4 == Integer.MIN_VALUE) {
            this.alpha = mVar.white;
        }
        int i5 = this.alpha;
        if (i5 < 0) {
            this.alpha = RecyclerView.UNDEFINED_DURATION;
            kVar = null;
        } else {
            try {
                ?? r22 = mVar.teal[i5];
                if (r22 != 0) {
                    this.alpha = i5 - 1;
                    kVar = r22;
                }
            } catch (Throwable unused) {
            }
        }
        if (!(kVar instanceof Pd.d)) {
            return null;
        }
        return kVar;
    }

    @Override // Nd.c
    public final Nd.h getContext() {
        m mVar = this.purple;
        Nd.c[] cVarArr = mVar.teal;
        int i4 = mVar.white;
        Nd.c cVar = cVarArr[i4];
        if (cVar != this && cVar != null) {
            return cVar.getContext();
        }
        int i5 = i4 - 1;
        while (i5 >= 0) {
            int i10 = i5 - 1;
            Nd.c cVar2 = mVar.teal[i5];
            if (cVar2 != this && cVar2 != null) {
                return cVar2.getContext();
            }
            i5 = i10;
        }
        throw new IllegalStateException("Not started");
    }

    @Override // Nd.c
    public final void resumeWith(Object obj) {
        Result.Companion companion = Result.INSTANCE;
        boolean z2 = obj instanceof kotlin.k;
        m mVar = this.purple;
        if (z2) {
            Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
            Intrinsics.checkNotNull(m207exceptionOrNullimpl);
            mVar.golf(Result.m206constructorimpl(ResultKt.createFailure(m207exceptionOrNullimpl)));
            return;
        }
        mVar.foxtrot(false);
    }
}
