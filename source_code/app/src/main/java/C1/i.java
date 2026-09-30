package C1;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class i extends Pd.c {
    public com.google.firebase.messaging.o alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ com.google.firebase.messaging.o red;
    public int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.google.firebase.messaging.o oVar, Pd.c cVar) {
        super(cVar);
        this.red = oVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.purple = obj;
        this.silver |= RecyclerView.UNDEFINED_DURATION;
        return this.red.juliet(this);
    }
}
