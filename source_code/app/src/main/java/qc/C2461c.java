package qc;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: qc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2461c extends Pd.c {
    public C2462d alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C2462d red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2461c(C2462d c2462d, Pd.c cVar) {
        super(cVar);
        this.red = c2462d;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.charlie(0L, this);
    }
}
