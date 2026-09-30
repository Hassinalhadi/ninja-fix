package R2;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class k extends Pd.c {
    public l alpha;
    public P2.h purple;
    public Object red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ l teal;
    public int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Pd.c cVar) {
        super(cVar);
        this.teal = lVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.silver = obj;
        this.white |= RecyclerView.UNDEFINED_DURATION;
        return this.teal.alpha(this);
    }
}
