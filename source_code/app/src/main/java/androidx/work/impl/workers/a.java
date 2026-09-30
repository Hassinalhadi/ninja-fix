package androidx.work.impl.workers;

import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class a extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ ConstraintTrackingWorker purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ConstraintTrackingWorker constraintTrackingWorker, Nd.c cVar) {
        super(2, cVar);
        this.purple = constraintTrackingWorker;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new a(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
        Object charlie = ConstraintTrackingWorker.charlie(this.purple, this);
        if (charlie == aVar) {
            return aVar;
        }
        return charlie;
    }
}
