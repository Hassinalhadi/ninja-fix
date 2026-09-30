package io.ktor.utils.io;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class o extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ q purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Pd.c cVar) {
        super(cVar);
        this.purple = qVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.charlie(this);
    }
}
