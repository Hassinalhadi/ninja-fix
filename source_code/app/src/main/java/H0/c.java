package H0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes3.dex */
public final class c extends Pd.c {
    public List alpha;
    public i purple;
    public int red;
    public int silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ d white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Pd.c cVar) {
        super(cVar);
        this.white = dVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.teal = obj;
        this.yellow |= RecyclerView.UNDEFINED_DURATION;
        return this.white.alpha(this);
    }
}
