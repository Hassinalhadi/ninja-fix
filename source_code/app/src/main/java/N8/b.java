package N8;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class b extends Pd.c {
    public Object alpha;
    public Ef.a purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ e silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Pd.c cVar) {
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
