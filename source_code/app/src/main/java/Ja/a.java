package Ja;

import Pd.c;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Result;

/* loaded from: classes2.dex */
public final class a extends c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ b purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.purple = bVar;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        Object alpha = this.purple.alpha(this);
        if (alpha == Od.a.alpha) {
            return alpha;
        }
        return new Result(alpha);
    }
}
