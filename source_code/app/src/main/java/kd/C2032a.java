package kd;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: kd.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2032a extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ d purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2032a(d dVar, Pd.c cVar) {
        super(cVar);
        this.purple = dVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.bravo(this);
    }
}
