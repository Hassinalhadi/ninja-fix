package bz;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class ay extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ F purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(F f5, Pd.c cVar) {
        super(cVar);
        this.purple = f5;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return F.Y(this.purple, this);
    }
}
