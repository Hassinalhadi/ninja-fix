package yf;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class ac extends Pd.c {
    public ad alpha;
    public /* synthetic */ Object purple;
    public int red;
    public final /* synthetic */ ad silver;
    public Object teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(ad adVar, Nd.c cVar) {
        super(cVar);
        this.silver = adVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.emit(null, this);
    }
}
