package C1;

import androidx.recyclerview.widget.RecyclerView;
import vf.C3213q;

/* loaded from: classes3.dex */
public final class x extends Pd.c {
    public Object alpha;
    public ap purple;
    public C3213q red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ ap teal;
    public int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ap apVar, Pd.c cVar) {
        super(cVar);
        this.teal = apVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.silver = obj;
        this.white |= RecyclerView.UNDEFINED_DURATION;
        return ap.delta(this.teal, null, this);
    }
}
