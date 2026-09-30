package io.ktor.utils.io;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class x extends Pd.c {
    public t alpha;
    public int purple;
    public /* synthetic */ Object red;
    public int silver;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return ak.hotel(null, 0, this);
    }
}
