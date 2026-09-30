package yf;

import a2.C0398w;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class x extends Pd.c {
    public C0398w alpha;
    public Object purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ C0398w silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0398w c0398w, Nd.c cVar) {
        super(cVar);
        this.silver = c0398w;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.emit(null, this);
    }
}
