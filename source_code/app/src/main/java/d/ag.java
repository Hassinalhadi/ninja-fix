package d;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class ag extends Pd.c {
    public C1557u alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ aj red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, Pd.c cVar) {
        super(cVar);
        this.red = ajVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return aj.g(this.red, null, this);
    }
}
