package hd;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class aj extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ ak purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ak akVar, Pd.c cVar) {
        super(cVar);
        this.purple = akVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.alpha(null, this);
    }
}
