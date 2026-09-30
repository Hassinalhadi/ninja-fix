package C1;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class an extends Pd.c {
    public kotlin.jvm.internal.s alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ap red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(ap apVar, Pd.c cVar) {
        super(cVar);
        this.red = apVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.kilo(null, false, this);
    }
}
