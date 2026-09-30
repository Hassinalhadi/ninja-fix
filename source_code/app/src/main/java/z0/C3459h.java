package z0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: z0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3459h extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ E0.h purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3459h(E0.h hVar, Pd.c cVar) {
        super(cVar);
        this.purple = hVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.bravo(0.0f, this);
    }
}
