package l0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2049f extends Pd.c {
    public long alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C2050g red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2049f(C2050g c2050g, Pd.c cVar) {
        super(cVar);
        this.red = c2050g;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.navy(0L, this);
    }
}
