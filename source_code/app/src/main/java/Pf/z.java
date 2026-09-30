package Pf;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class z extends Pd.c {
    public kotlin.b alpha;
    public Fe.d purple;
    public LinkedHashMap red;
    public String silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ Fe.d white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Fe.d dVar, Pd.a aVar) {
        super(aVar);
        this.white = dVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.teal = obj;
        this.yellow |= RecyclerView.UNDEFINED_DURATION;
        return Fe.d.charlie(this.white, null, this);
    }
}
