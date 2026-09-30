package gd;

import androidx.recyclerview.widget.RecyclerView;
import od.C2227d;

/* loaded from: classes2.dex */
public final class e extends Pd.c {
    public Nd.h alpha;
    public C2227d purple;
    public Bd.e red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ f teal;
    public int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Pd.c cVar) {
        super(cVar);
        this.teal = fVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.silver = obj;
        this.white |= RecyclerView.UNDEFINED_DURATION;
        return this.teal.foxtrot(null, null, null, null, this);
    }
}
