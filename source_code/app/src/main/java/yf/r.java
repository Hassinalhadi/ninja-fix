package yf;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class r extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;
    public final /* synthetic */ s red;
    public s silver;
    public InterfaceC3440j teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Nd.c cVar) {
        super(cVar);
        this.red = sVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.purple |= RecyclerView.UNDEFINED_DURATION;
        return this.red.collect(null, this);
    }
}
