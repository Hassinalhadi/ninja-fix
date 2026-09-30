package C1;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class ab extends Pd.c {
    public ap alpha;
    public B purple;
    public boolean red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ ap teal;
    public int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ap apVar, Nd.c cVar) {
        super(cVar);
        this.teal = apVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.silver = obj;
        this.white |= RecyclerView.UNDEFINED_DURATION;
        return ap.foxtrot(this.teal, false, this);
    }
}
