package G;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class n extends Pd.c {
    public t alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ t red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, Pd.c cVar) {
        super(cVar);
        this.red = tVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.f(this);
    }
}
