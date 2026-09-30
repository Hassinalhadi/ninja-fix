package B2;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class al extends Pd.c {
    public ao alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ao red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(ao aoVar, Pd.c cVar) {
        super(cVar);
        this.red = aoVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return ao.alpha(this.red, this);
    }
}
