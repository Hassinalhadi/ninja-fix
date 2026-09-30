package com.checkout.risk;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.checkout.risk.RiskInternal", f = "Risk.kt", l = {122, 138}, m = "publishData")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RiskInternal$publishData$1 extends c {
    double D$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RiskInternal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiskInternal$publishData$1(RiskInternal riskInternal, Nd.c<? super RiskInternal$publishData$1> cVar) {
        super(cVar);
        this.this$0 = riskInternal;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.publishData(null, this);
    }
}
