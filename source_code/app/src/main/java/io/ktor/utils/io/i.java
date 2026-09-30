package io.ktor.utils.io;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class i extends Pd.c {
    public m alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ m red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Pd.c cVar) {
        super(cVar);
        this.red = mVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.charlie(this);
    }
}
