package androidx.work.impl.workers;

import C1.s;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class g extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;
    public final /* synthetic */ s red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s sVar, Nd.c cVar) {
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
