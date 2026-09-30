package G;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class q extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ t purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, Pd.c cVar) {
        super(cVar);
        this.purple = tVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.navy(0L, this);
    }
}
