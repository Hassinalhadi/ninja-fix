package R2;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class j extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ l purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Pd.c cVar) {
        super(cVar);
        this.purple = lVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.bravo(null, this);
    }
}
