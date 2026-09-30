package td;

import androidx.recyclerview.widget.RecyclerView;
import io.ktor.utils.io.ag;
import io.ktor.utils.io.t;

/* loaded from: classes2.dex */
public final class k extends Pd.c {
    public Object alpha;
    public t purple;
    public ag red;
    public long silver;
    public /* synthetic */ Object teal;
    public int white;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.teal = obj;
        this.white |= RecyclerView.UNDEFINED_DURATION;
        return n.alpha(null, null, null, null, 0L, this);
    }
}
