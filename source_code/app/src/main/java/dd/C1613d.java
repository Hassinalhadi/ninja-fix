package dd;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: dd.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1613d extends Pd.c {
    public Ed.a alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C1614e red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1613d(C1614e c1614e, Pd.c cVar) {
        super(cVar);
        this.red = c1614e;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.alpha(null, this);
    }
}
