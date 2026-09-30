package T;

import kotlin.jvm.functions.Function1;
import t0.C2932p;

/* loaded from: classes3.dex */
public final class n implements q {
    public final Xd.m alpha;

    public n(C2932p c2932p, Xd.m mVar) {
        this.alpha = mVar;
    }

    @Override // T.s
    public final /* synthetic */ boolean all(Function1 function1) {
        return Q0.c.alpha(this, function1);
    }

    @Override // T.s
    public final Object foldIn(Object obj, Xd.l lVar) {
        return lVar.invoke(obj, this);
    }

    @Override // T.s
    public final /* synthetic */ s then(s sVar) {
        return Q0.c.charlie(this, sVar);
    }
}
