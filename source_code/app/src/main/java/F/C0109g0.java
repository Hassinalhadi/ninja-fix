package F;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: F.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0109g0 extends Pd.c {
    public C0113h0 alpha;
    public long purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ C0113h0 silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0109g0(C0113h0 c0113h0, Pd.c cVar) {
        super(cVar);
        this.silver = c0113h0;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.oscar(0L, 0L, this);
    }
}
