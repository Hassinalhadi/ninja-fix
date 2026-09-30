package J8;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class z extends Pd.c {
    public Object alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ aa red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(aa aaVar, Pd.c cVar) {
        super(cVar);
        this.red = aaVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.alpha(null, this);
    }
}
