package Hd;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class c extends Pd.c {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ e red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Pd.c cVar) {
        super(cVar);
        this.red = eVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.foxtrot(0, this);
    }
}
