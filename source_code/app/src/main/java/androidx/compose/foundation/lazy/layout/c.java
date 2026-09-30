package androidx.compose.foundation.lazy.layout;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class c extends Pd.c {
    public Ref.ObjectRef alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ d red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Pd.c cVar) {
        super(cVar);
        this.red = dVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.delta(this);
    }
}
