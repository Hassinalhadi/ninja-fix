package yf;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class w extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;
    public final /* synthetic */ J8.ah red;
    public J8.ah silver;
    public InterfaceC3440j teal;
    public Throwable white;
    public long yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(J8.ah ahVar, Nd.c cVar) {
        super(cVar);
        this.red = ahVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.purple |= RecyclerView.UNDEFINED_DURATION;
        return this.red.collect(null, this);
    }
}
