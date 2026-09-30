package G;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class r extends Pd.c {
    public t alpha;
    public float purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ t silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, Pd.c cVar) {
        super(cVar);
        this.silver = tVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.i(0.0f, this);
    }
}
