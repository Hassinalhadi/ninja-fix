package J8;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class ag extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;
    public final /* synthetic */ E.e red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(E.e eVar, Nd.c cVar) {
        super(cVar);
        this.red = eVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.purple |= RecyclerView.UNDEFINED_DURATION;
        return this.red.emit(null, this);
    }
}
