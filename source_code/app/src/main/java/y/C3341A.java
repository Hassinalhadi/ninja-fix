package y;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: y.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3341A extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ C3344D purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3341A(C3344D c3344d, Pd.c cVar) {
        super(cVar);
        this.purple = c3344d;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return C3344D.bravo(this.purple, this);
    }
}
