package C1;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.Iterator;

/* renamed from: C1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0082d extends Pd.c {
    public Serializable alpha;
    public Iterator purple;
    public /* synthetic */ Object red;
    public int silver;

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return g.alpha(null, null, this);
    }
}
