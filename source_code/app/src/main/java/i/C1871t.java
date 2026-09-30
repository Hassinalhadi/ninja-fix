package i;

import d.InterfaceC1532g0;
import kotlin.jvm.functions.Function1;

/* renamed from: i.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1871t implements T.q {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ InterfaceC1532g0 purple;

    public /* synthetic */ C1871t(InterfaceC1532g0 interfaceC1532g0, int i4) {
        this.alpha = i4;
        this.purple = interfaceC1532g0;
    }

    @Override // T.s
    public final /* synthetic */ boolean all(Function1 function1) {
        int i4 = this.alpha;
        return Q0.c.alpha(this, function1);
    }

    @Override // T.s
    public final Object foldIn(Object obj, Xd.l lVar) {
        switch (this.alpha) {
            case 0:
                return lVar.invoke(obj, this);
            default:
                return lVar.invoke(obj, this);
        }
    }

    @Override // T.s
    public final /* synthetic */ T.s then(T.s sVar) {
        int i4 = this.alpha;
        return Q0.c.charlie(this, sVar);
    }
}
