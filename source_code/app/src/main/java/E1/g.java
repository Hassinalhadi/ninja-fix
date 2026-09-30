package E1;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class g extends Pd.c {
    public i alpha;
    public c purple;
    public boolean red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ i teal;
    public int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, Pd.c cVar) {
        super(cVar);
        this.teal = iVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.silver = obj;
        this.white |= RecyclerView.UNDEFINED_DURATION;
        return this.teal.alpha(null, this);
    }
}
