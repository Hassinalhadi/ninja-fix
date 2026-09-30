package androidx.compose.runtime;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class C extends Pd.c {
    public Function1 alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ D red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d4, Nd.c cVar) {
        super(cVar);
        this.red = d4;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.blue(null, this);
    }
}
