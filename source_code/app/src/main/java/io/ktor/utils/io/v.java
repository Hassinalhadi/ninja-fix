package io.ktor.utils.io;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class v extends Pd.c {
    public Object alpha;
    public ag purple;
    public long red;
    public long silver;
    public /* synthetic */ Object teal;
    public int white;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.teal = obj;
        this.white |= RecyclerView.UNDEFINED_DURATION;
        return ak.delta(null, null, 0L, this);
    }
}
