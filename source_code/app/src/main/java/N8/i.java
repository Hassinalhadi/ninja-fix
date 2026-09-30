package N8;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class i extends Pd.c {
    public j alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ j red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Pd.c cVar) {
        super(cVar);
        this.red = jVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.bravo(this);
    }
}
