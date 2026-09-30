package androidx.lifecycle;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0638h extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ C0639i purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0638h(C0639i c0639i, Pd.c cVar) {
        super(cVar);
        this.purple = c0639i;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.charlie(this);
    }
}
