package yf;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: yf.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3445o extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;
    public final /* synthetic */ C3446p red;
    public Object silver;
    public InterfaceC3440j teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3445o(C3446p c3446p, Nd.c cVar) {
        super(cVar);
        this.red = c3446p;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.purple |= RecyclerView.UNDEFINED_DURATION;
        return this.red.collect(null, this);
    }
}
