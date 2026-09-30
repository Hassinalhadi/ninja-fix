package E1;

import Tf.ah;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class h extends Pd.c {
    public i alpha;
    public Object purple;
    public ah red;
    public Object silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ i white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Pd.c cVar) {
        super(cVar);
        this.white = iVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.teal = obj;
        this.yellow |= RecyclerView.UNDEFINED_DURATION;
        return this.white.bravo(null, this);
    }
}
