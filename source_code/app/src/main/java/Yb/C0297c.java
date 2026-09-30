package Yb;

import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: Yb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0297c extends Pd.i implements Xd.l {
    public final /* synthetic */ C0307h alpha;
    public final /* synthetic */ H9.m purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0297c(C0307h c0307h, H9.m mVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = c0307h;
        this.purple = mVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0297c(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0297c) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        File file;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.alpha.getClass();
        H9.m mVar = this.purple;
        if (mVar instanceof H9.l) {
            file = (File) ((H9.l) mVar).alpha;
        } else if (mVar instanceof H9.k) {
            file = null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (file == null) {
            return null;
        }
        return Boolean.valueOf(file.delete());
    }
}
