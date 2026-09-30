package yf;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class M extends Pd.c {
    public N alpha;
    public InterfaceC3440j purple;
    public O red;

    /* renamed from: s, reason: collision with root package name */
    public int f14160s;
    public vf.I silver;
    public Object teal;
    public /* synthetic */ Object white;
    public final /* synthetic */ N yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n5, Nd.c cVar) {
        super(cVar);
        this.yellow = n5;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.white = obj;
        this.f14160s |= RecyclerView.UNDEFINED_DURATION;
        this.yellow.collect(null, this);
        return Od.a.alpha;
    }
}
