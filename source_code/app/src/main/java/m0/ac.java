package m0;

import androidx.recyclerview.widget.RecyclerView;
import vf.Y;

/* loaded from: classes3.dex */
public final class ac extends Pd.c {
    public Y alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ af red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(af afVar, Pd.c cVar) {
        super(cVar);
        this.red = afVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.india(0L, null, this);
    }
}
