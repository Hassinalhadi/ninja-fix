package y;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: y.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3343C extends Pd.c {
    public C3344D alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C3344D red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3343C(C3344D c3344d, Pd.c cVar) {
        super(cVar);
        this.red = c3344d;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.tango(this);
    }
}
