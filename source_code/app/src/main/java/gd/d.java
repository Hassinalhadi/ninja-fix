package gd;

import androidx.recyclerview.widget.RecyclerView;
import od.C2227d;

/* loaded from: classes2.dex */
public final class d extends Pd.c {
    public C2227d alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ f red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Pd.c cVar) {
        super(cVar);
        this.red = fVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.echo(null, this);
    }
}
