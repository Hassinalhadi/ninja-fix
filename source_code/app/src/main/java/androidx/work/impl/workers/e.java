package androidx.work.impl.workers;

import A2.y;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class e extends Pd.c {
    public ConstraintTrackingWorker alpha;
    public y purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ ConstraintTrackingWorker silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ConstraintTrackingWorker constraintTrackingWorker, Pd.c cVar) {
        super(cVar);
        this.silver = constraintTrackingWorker;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.red = obj;
        this.teal |= RecyclerView.UNDEFINED_DURATION;
        return ConstraintTrackingWorker.charlie(this.silver, this);
    }
}
