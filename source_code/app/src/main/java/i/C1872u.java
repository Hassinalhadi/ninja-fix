package i;

import androidx.recyclerview.widget.RecyclerView;
import b.M;

/* renamed from: i.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1872u extends Pd.c {
    public M alpha;
    public Xd.l purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ C1874w silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1872u(C1874w c1874w, Pd.c cVar) {
        super(cVar);
        this.silver = c1874w;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.bravo(null, null, this);
    }
}
