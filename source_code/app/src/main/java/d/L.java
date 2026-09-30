package d;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class L extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ N purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N n5, Pd.c cVar) {
        super(cVar);
        this.purple = n5;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.foxtrot(this);
    }
}
