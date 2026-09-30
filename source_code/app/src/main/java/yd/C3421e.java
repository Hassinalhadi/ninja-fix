package yd;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: yd.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3421e extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ j purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3421e(j jVar, Pd.c cVar) {
        super(cVar);
        this.purple = jVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.bravo(null, null, null, this);
    }
}
