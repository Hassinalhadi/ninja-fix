package C1;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class au extends Pd.c {
    public com.google.firebase.messaging.o alpha;
    public Ef.a purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ com.google.firebase.messaging.o silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(com.google.firebase.messaging.o oVar, Pd.c cVar) {
        super(cVar);
        this.silver = oVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return this.silver.sierra(this);
    }
}
