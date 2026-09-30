package Yb;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aa extends Pd.i implements Xd.l {
    public final /* synthetic */ File alpha;
    public final /* synthetic */ File purple;
    public final /* synthetic */ H9.m red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(File file, File file2, H9.m mVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = file;
        this.purple = file2;
        this.red = mVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new aa(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aa) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        Object obj2 = ((H9.l) this.red).alpha;
        File file = this.alpha;
        if (Intrinsics.areEqual(file, obj2)) {
            file = null;
        }
        if (file != null) {
            file.delete();
        }
        File file2 = this.purple;
        if (file2 != null) {
            file2.delete();
        }
        return Unit.INSTANCE;
    }
}
