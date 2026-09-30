package Yb;

import com.app.network.network.models.OrderTask;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import s6.W4;

/* loaded from: classes2.dex */
public final class N extends Pd.i implements Xd.l {
    public final /* synthetic */ S alpha;
    public final /* synthetic */ H9.m purple;
    public final /* synthetic */ OrderTask red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(S s3, H9.m mVar, OrderTask orderTask, Nd.c cVar) {
        super(2, cVar);
        this.alpha = s3;
        this.purple = mVar;
        this.red = orderTask;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new N(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        S s3 = this.alpha;
        J2.c cVar = s3.alpha;
        if (!cVar.victor() && !cVar.uniform()) {
            ((C0333u0) cVar.purple).alpha.tango();
            H9.m mVar = this.purple;
            if (mVar instanceof H9.l) {
                cVar.xray((File) ((H9.l) mVar).alpha, this.red);
                s3.alpha();
            } else if (mVar instanceof H9.k) {
                C0333u0 c0333u0 = (C0333u0) cVar.purple;
                L9.d.pink(c0333u0.alpha, W4.alpha(c0333u0.alpha, ((H9.k) mVar).alpha));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
