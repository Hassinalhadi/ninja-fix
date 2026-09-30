package xd;

import androidx.recyclerview.widget.RecyclerView;
import yf.InterfaceC3440j;

/* renamed from: xd.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3332e extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;
    public InterfaceC3440j red;
    public final /* synthetic */ C3333f silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3332e(C3333f c3333f, Nd.c cVar) {
        super(cVar);
        this.silver = c3333f;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.purple |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.emit(null, this);
    }
}
