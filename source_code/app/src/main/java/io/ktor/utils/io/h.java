package io.ktor.utils.io;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class h extends Pd.c {
    public int alpha;
    public m purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ m silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Pd.c cVar) {
        super(cVar);
        this.silver = mVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.foxtrot(0, this);
    }
}
