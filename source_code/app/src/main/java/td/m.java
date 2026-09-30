package td;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class m extends Pd.c {
    public Hf.a alpha;
    public /* synthetic */ Object purple;
    public int red;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return n.delta(null, null, this);
    }
}
