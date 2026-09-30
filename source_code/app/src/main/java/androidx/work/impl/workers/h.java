package androidx.work.impl.workers;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class h extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.purple |= RecyclerView.UNDEFINED_DURATION;
        return j.alpha(null, null, this);
    }
}
