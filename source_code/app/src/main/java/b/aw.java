package b;

import androidx.recyclerview.widget.RecyclerView;
import f.C1670g;

/* loaded from: classes3.dex */
public final class aw extends Pd.c {
    public C1670g alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ A red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(A a6, Pd.c cVar) {
        super(cVar);
        this.red = a6;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return A.b(this.red, this);
    }
}
