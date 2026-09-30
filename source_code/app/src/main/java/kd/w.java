package kd;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class w extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.purple |= RecyclerView.UNDEFINED_DURATION;
        return aa.hotel(null, null, null, null, null, this);
    }
}
