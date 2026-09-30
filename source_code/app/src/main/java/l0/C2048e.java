package l0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2048e extends Pd.c {
    public long alpha;
    public long purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ C2050g silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2048e(C2050g c2050g, Pd.c cVar) {
        super(cVar);
        this.silver = c2050g;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.oscar(0L, 0L, this);
    }
}
