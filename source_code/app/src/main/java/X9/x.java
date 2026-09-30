package X9;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class x extends Pd.c {
    public Context alpha;
    public String purple;
    public z red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ z teal;
    public int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Pd.c cVar) {
        super(cVar);
        this.teal = zVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.silver = obj;
        this.white |= RecyclerView.UNDEFINED_DURATION;
        return this.teal.golf(null, null, this);
    }
}
