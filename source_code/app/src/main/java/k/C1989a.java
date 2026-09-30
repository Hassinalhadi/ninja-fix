package k;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1989a extends Pd.c {
    public Z.c alpha;
    public Object[] purple;
    public int red;
    public int silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ C1990b white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1989a(C1990b c1990b, Pd.c cVar) {
        super(cVar);
        this.white = c1990b;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.teal = obj;
        this.yellow |= RecyclerView.UNDEFINED_DURATION;
        return this.white.alpha(null, this);
    }
}
