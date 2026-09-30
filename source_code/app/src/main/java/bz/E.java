package bz;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class E extends Pd.c {
    public Object alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ F red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f5, Pd.c cVar) {
        super(cVar);
        this.red = f5;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return F.a0(this.red, this);
    }
}
