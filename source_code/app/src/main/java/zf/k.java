package zf;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class k extends Pd.c {
    public l alpha;
    public Object purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ l silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Nd.c cVar) {
        super(cVar);
        this.silver = lVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.emit(null, this);
    }
}
