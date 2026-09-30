package z0;

import Q0.l;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3454c extends Pd.c {
    public Object alpha;
    public l purple;
    public int red;
    public int silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ ScrollCaptureCallbackC3457f white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3454c(ScrollCaptureCallbackC3457f scrollCaptureCallbackC3457f, Pd.c cVar) {
        super(cVar);
        this.white = scrollCaptureCallbackC3457f;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.teal = obj;
        this.yellow |= RecyclerView.UNDEFINED_DURATION;
        return ScrollCaptureCallbackC3457f.alpha(this.white, null, null, this);
    }
}
