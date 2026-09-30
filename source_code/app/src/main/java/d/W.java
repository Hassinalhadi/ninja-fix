package d;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class W extends Pd.c {
    public long alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ X red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x4, Pd.c cVar) {
        super(cVar);
        this.red = x4;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.oscar(0L, 0L, this);
    }
}
