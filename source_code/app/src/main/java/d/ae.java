package d;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class ae extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ aj purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(aj ajVar, Pd.c cVar) {
        super(cVar);
        this.purple = ajVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return aj.e(this.purple, this);
    }
}
