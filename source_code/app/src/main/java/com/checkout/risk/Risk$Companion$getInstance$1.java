package com.checkout.risk;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.risk.Risk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.checkout.risk.Risk$Companion", f = "Risk.kt", l = {23}, m = "getInstance")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Risk$Companion$getInstance$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Risk.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Risk$Companion$getInstance$1(Risk.Companion companion, Nd.c<? super Risk$Companion$getInstance$1> cVar) {
        super(cVar);
        this.this$0 = companion;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.getInstance(null, null, this);
    }
}
