package a3;

import androidx.lifecycle.ac;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class b extends Pd.c {
    public ac alpha;
    public Ref.ObjectRef purple;
    public /* synthetic */ Object red;
    public int silver;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return d.alpha(null, this);
    }
}
