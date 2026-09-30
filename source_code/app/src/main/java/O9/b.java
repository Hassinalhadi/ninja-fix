package O9;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class b extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ e purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Pd.c cVar) {
        super(cVar);
        this.purple = eVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.bravo(0L, this);
    }
}
