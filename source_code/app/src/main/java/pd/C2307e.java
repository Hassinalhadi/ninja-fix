package pd;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: pd.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2307e extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ com.google.android.play.core.integrity.c purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2307e(com.google.android.play.core.integrity.c cVar, Pd.c cVar2) {
        super(cVar2);
        this.purple = cVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.alpha(null, this);
    }
}
