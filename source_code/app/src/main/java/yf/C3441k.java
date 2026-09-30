package yf;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* renamed from: yf.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3441k extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;
    public final /* synthetic */ C1.t red;
    public InterfaceC3440j silver;
    public Iterator teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3441k(C1.t tVar, Nd.c cVar) {
        super(cVar);
        this.red = tVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.purple |= RecyclerView.UNDEFINED_DURATION;
        return this.red.collect(null, this);
    }
}
