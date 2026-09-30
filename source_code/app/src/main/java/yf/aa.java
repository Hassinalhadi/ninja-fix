package yf;

import a2.C0398w;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class aa extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ C0398w purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(C0398w c0398w, Nd.c cVar) {
        super(cVar);
        this.purple = c0398w;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return this.purple.emit(null, this);
    }
}
