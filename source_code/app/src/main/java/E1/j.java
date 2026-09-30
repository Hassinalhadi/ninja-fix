package E1;

import Tf.aj;
import Tf.r;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class j extends Pd.c {
    public r alpha;
    public r purple;
    public aj red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ k teal;
    public int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Pd.c cVar) {
        super(cVar);
        this.teal = kVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.silver = obj;
        this.white |= RecyclerView.UNDEFINED_DURATION;
        return this.teal.bravo(null, this);
    }
}
