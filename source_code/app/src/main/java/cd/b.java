package cd;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class b extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ c purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Pd.c cVar2) {
        super(cVar2);
        this.purple = cVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.echo(null, this);
    }
}
