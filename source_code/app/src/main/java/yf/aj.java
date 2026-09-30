package yf;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class aj extends Pd.c {
    public ag alpha;
    public /* synthetic */ Object purple;
    public int red;
    public final /* synthetic */ ag silver;
    public Object teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ag agVar, Nd.c cVar) {
        super(cVar);
        this.silver = agVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.emit(null, this);
    }
}
