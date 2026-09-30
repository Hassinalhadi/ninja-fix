package d;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class H extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ J purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(J j5, Pd.c cVar) {
        super(cVar);
        this.purple = j5;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.foxtrot(null, null, this);
    }
}
