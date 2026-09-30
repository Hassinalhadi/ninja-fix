package vg;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class v extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.purple |= RecyclerView.UNDEFINED_DURATION;
        A.romeo(this, null);
        return Od.a.alpha;
    }
}
