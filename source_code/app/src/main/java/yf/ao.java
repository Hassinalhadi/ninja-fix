package yf;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class ao extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;
    public final /* synthetic */ C1.s red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(C1.s sVar, Nd.c cVar) {
        super(cVar);
        this.red = sVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.purple |= RecyclerView.UNDEFINED_DURATION;
        return this.red.emit(null, this);
    }
}
