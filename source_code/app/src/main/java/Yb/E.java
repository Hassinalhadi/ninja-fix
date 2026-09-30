package Yb;

import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class E extends Pd.i implements Xd.l {
    public final /* synthetic */ H9.m alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(H9.m mVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = mVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new E(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        H9.m mVar = this.alpha;
        if (mVar instanceof H9.l) {
            return Boolean.valueOf(((File) ((H9.l) mVar).alpha).delete());
        }
        if (mVar instanceof H9.k) {
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
