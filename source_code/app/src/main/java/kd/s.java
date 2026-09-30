package kd;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class s extends Pd.c {
    public vd.e alpha;
    public io.ktor.utils.io.t purple;
    public /* synthetic */ Object red;
    public int silver;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return aa.delta(null, null, null, null, null, this);
    }
}
