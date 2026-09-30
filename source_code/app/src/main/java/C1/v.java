package C1;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class v extends Pd.c {
    public ap alpha;
    public Ef.c purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ ap silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ap apVar, Pd.c cVar) {
        super(cVar);
        this.silver = apVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return ap.charlie(this.silver, this);
    }
}
