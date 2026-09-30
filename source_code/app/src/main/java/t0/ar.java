package t0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class ar extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ au purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(au auVar, Pd.c cVar) {
        super(cVar);
        this.purple = auVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        this.purple.alpha(null, this);
        return Od.a.alpha;
    }
}
