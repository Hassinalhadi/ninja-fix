package d;

import androidx.recyclerview.widget.RecyclerView;
import f.C1665b;

/* loaded from: classes3.dex */
public final class af extends Pd.c {
    public C1556t alpha;
    public C1665b purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ aj silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, Pd.c cVar) {
        super(cVar);
        this.silver = ajVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return aj.f(this.silver, null, this);
    }
}
