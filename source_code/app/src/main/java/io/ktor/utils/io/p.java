package io.ktor.utils.io;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class p extends Pd.c {
    public boolean alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ q red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Pd.c cVar) {
        super(cVar);
        this.red = qVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.delta(false, this);
    }
}
