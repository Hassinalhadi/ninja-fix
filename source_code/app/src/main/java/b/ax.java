package b;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class ax extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ A purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(A a6, Pd.c cVar) {
        super(cVar);
        this.purple = a6;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return A.c(this.purple, this);
    }
}
