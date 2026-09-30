package O2;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class d extends Pd.c {
    public Object alpha;
    public Ef.i purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ e silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Pd.c cVar) {
        super(cVar);
        this.silver = eVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.alpha(this);
    }
}
