package d;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class B extends Pd.c {
    public C1548o0 alpha;
    public kotlin.jvm.internal.r purple;
    public float red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ J teal;
    public int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(J j5, Pd.c cVar) {
        super(cVar);
        this.teal = j5;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.silver = obj;
        this.white |= RecyclerView.UNDEFINED_DURATION;
        return J.alpha(this.teal, null, null, 0.0f, 0.0f, this);
    }
}
