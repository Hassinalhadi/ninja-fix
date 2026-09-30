package yf;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class u extends Pd.c {
    public v alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ v red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Nd.c cVar) {
        super(cVar);
        this.red = vVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.emit(null, this);
    }
}
