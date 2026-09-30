package d;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class L0 extends Pd.c {
    public Ref.ObjectRef alpha;
    public /* synthetic */ Object purple;
    public int red;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return O0.golf(null, null, this);
    }
}
