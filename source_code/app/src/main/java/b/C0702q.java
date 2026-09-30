package b;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0702q extends Pd.c {
    public long alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C0704t red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0702q(C0704t c0704t, Pd.c cVar) {
        super(cVar);
        this.red = c0704t;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.bravo(0L, null, this);
    }
}
