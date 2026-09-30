package androidx.compose.material3.internal;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class d extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.purple |= RecyclerView.UNDEFINED_DURATION;
        return i.bravo(null, null, this);
    }
}
