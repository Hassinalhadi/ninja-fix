package y;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: y.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3373m extends Pd.c {
    public CharSequence alpha;
    public Object purple;
    public Ef.c red;
    public long silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ C3379s white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3373m(C3379s c3379s, Pd.c cVar) {
        super(cVar);
        this.white = c3379s;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.teal = obj;
        this.yellow |= RecyclerView.UNDEFINED_DURATION;
        return C3379s.alpha(this.white, null, 0L, null, this);
    }
}
