package zf;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class q extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ r purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Nd.c cVar) {
        super(cVar);
        this.purple = rVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.emit(null, this);
    }
}
