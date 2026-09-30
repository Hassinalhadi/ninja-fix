package Jc;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class l extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;
    public final /* synthetic */ m red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Nd.c cVar) {
        super(cVar);
        this.red = mVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.purple |= RecyclerView.UNDEFINED_DURATION;
        return this.red.emit(null, this);
    }
}
