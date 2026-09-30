package yd;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: yd.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3422f extends Pd.c {
    public /* synthetic */ Object alpha;
    public int purple;
    public final /* synthetic */ g red;
    public Object silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3422f(g gVar, Nd.c cVar) {
        super(cVar);
        this.red = gVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.purple |= RecyclerView.UNDEFINED_DURATION;
        return this.red.emit(null, this);
    }
}
