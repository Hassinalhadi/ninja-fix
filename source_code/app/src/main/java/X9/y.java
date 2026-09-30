package X9;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class y extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ z purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Pd.c cVar) {
        super(cVar);
        this.purple = zVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.hotel(null, null, this);
    }
}
