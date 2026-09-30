package E1;

import Tf.ak;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class b extends Pd.c {
    public Object alpha;
    public ak purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ c silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Pd.c cVar2) {
        super(cVar2);
        this.silver = cVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return c.alpha(this.silver, this);
    }
}
