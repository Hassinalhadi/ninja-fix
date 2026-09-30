package d;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: d.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1536i0 extends Pd.c {
    public kotlin.jvm.internal.t alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C1548o0 red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536i0(C1548o0 c1548o0, Pd.c cVar) {
        super(cVar);
        this.red = c1548o0;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.alpha(0L, this);
    }
}
