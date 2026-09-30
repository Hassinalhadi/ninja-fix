package Dd;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class a extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ b purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Nd.c cVar) {
        super(cVar);
        this.purple = bVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.foxtrot(this);
    }
}
