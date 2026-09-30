package kd;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class c extends Pd.c {
    public String alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ d red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Pd.c cVar) {
        super(cVar);
        this.red = dVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.echo(null, this);
    }
}
