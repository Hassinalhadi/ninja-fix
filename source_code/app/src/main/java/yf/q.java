package yf;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class q extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;
    public final /* synthetic */ J8.ah red;
    public J8.ah silver;
    public InterfaceC3440j teal;
    public zf.y white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(J8.ah ahVar, Nd.c cVar) {
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
