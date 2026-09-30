package yf;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class ay extends Pd.c {
    public az alpha;
    public InterfaceC3440j purple;
    public C3429B red;
    public vf.I silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ az white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(az azVar, Nd.c cVar) {
        super(cVar);
        this.white = azVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.teal = obj;
        this.yellow |= RecyclerView.UNDEFINED_DURATION;
        az.juliet(this.white, null, this);
        return Od.a.alpha;
    }
}
