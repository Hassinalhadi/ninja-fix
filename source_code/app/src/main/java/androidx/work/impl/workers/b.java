package androidx.work.impl.workers;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class b extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ ConstraintTrackingWorker purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ConstraintTrackingWorker constraintTrackingWorker, Pd.c cVar) {
        super(cVar);
        this.purple = constraintTrackingWorker;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return ConstraintTrackingWorker.bravo(this.purple, null, null, null, this);
    }
}
