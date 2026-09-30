package t0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class ab extends Pd.c {
    public bv.ab alpha;
    public xf.b purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ ad silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ad adVar, Pd.c cVar) {
        super(cVar);
        this.silver = adVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.lima(this);
    }
}
