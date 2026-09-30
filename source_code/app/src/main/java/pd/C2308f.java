package pd;

import androidx.recyclerview.widget.RecyclerView;
import vf.ab;

/* renamed from: pd.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2308f extends Pd.c {
    public ab alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ com.google.android.play.core.integrity.c red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2308f(com.google.android.play.core.integrity.c cVar, Nd.c cVar2) {
        super(cVar2);
        this.red = cVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.delta(this);
    }
}
