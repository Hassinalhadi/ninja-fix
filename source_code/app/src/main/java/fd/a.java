package fd;

import androidx.recyclerview.widget.RecyclerView;
import od.C2227d;
import s6.H4;

/* loaded from: classes2.dex */
public final class a extends Pd.c {
    public d alpha;
    public C2227d purple;
    public /* synthetic */ Object red;
    public int silver;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return H4.alpha(null, null, this);
    }
}
