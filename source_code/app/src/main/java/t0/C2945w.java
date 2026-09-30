package t0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2945w extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ C2946x purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2945w(C2946x c2946x, Pd.c cVar) {
        super(cVar);
        this.purple = c2946x;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        this.purple.coral(null, this);
        return Od.a.alpha;
    }
}
