package androidx.work.impl.workers;

import A2.y;
import F2.n;
import J2.p;
import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class f extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ ConstraintTrackingWorker purple;
    public final /* synthetic */ y red;
    public final /* synthetic */ n silver;
    public final /* synthetic */ p teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ConstraintTrackingWorker constraintTrackingWorker, y yVar, n nVar, p pVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = constraintTrackingWorker;
        this.red = yVar;
        this.silver = nVar;
        this.teal = pVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        this.alpha = 1;
        Object bravo = ConstraintTrackingWorker.bravo(this.purple, this.red, this.silver, this.teal, this);
        if (bravo == aVar) {
            return aVar;
        }
        return bravo;
    }
}
