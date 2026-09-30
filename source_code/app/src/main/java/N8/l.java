package N8;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class l extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ n purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Pd.c cVar) {
        super(cVar);
        this.purple = nVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.charlie(null, null, this);
    }
}
