package xf;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class c extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ e purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Pd.c cVar) {
        super(cVar);
        this.purple = eVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        Object beige = e.beige(this.purple, this);
        if (beige == Od.a.alpha) {
            return beige;
        }
        return new l(beige);
    }
}
