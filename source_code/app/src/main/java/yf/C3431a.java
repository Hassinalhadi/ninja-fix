package yf;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: yf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3431a extends Pd.c {
    public zf.y alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C1.t red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3431a(C1.t tVar, Nd.c cVar) {
        super(cVar);
        this.red = tVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.collect(null, this);
    }
}
