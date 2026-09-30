package C1;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class ax extends Pd.c {
    public Object alpha;
    public Ef.c purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ A silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(A a6, Pd.c cVar) {
        super(cVar);
        this.silver = a6;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.bravo(null, this);
    }
}
