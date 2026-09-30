package yf;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class J extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;

    /* JADX WARN: Type inference failed for: r0v0, types: [yf.J, Pd.i, Nd.c] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ?? iVar = new Pd.i(2, cVar);
        iVar.alpha = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((EnumC3430C) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (((EnumC3430C) this.alpha) != EnumC3430C.alpha) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
