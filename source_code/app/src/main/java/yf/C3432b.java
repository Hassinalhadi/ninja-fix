package yf;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: yf.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3432b extends Pd.c {
    public xf.r alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C3433c red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3432b(C3433c c3433c, Pd.c cVar) {
        super(cVar);
        this.red = c3433c;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.delta(null, this);
    }
}
