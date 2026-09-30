package l0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2045b extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ C2047d purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2045b(C2047d c2047d, Pd.c cVar) {
        super(cVar);
        this.purple = c2047d;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.alpha(0L, 0L, this);
    }
}
