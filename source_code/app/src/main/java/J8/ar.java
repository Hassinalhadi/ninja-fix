package J8;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class ar extends Pd.c {
    public as alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ as red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Pd.c cVar) {
        super(cVar);
        this.red = asVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return as.alpha(this.red, this);
    }
}
