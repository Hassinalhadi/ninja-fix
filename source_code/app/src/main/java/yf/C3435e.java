package yf;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: yf.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3435e extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ C3436f purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3435e(C3436f c3436f, Nd.c cVar) {
        super(cVar);
        this.purple = c3436f;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.emit(null, this);
    }
}
