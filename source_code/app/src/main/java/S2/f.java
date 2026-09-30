package S2;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class f extends Pd.c {
    public i alpha;
    public l purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ i silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Pd.c cVar) {
        super(cVar);
        this.silver = iVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.delta(null, this);
    }
}
