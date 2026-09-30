package androidx.compose.material3.internal;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class f extends Pd.c {
    public g alpha;
    public Object purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ g silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Nd.c cVar) {
        super(cVar);
        this.silver = gVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.emit(null, this);
    }
}
