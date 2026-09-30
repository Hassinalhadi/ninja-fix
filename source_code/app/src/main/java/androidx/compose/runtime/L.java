package androidx.compose.runtime;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class L extends Pd.c {
    public Function0 alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ M red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M m4, Pd.c cVar) {
        super(cVar);
        this.red = m4;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        this.red.alpha(null, this);
        return Od.a.alpha;
    }
}
