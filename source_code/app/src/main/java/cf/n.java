package cf;

import A2.aj;
import B9.K;
import Ie.ag;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o2.C2194d;
import pe.InterfaceC2335k;
import q2.C2406a;

/* loaded from: classes2.dex */
public final class n extends Lambda implements Function0 {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Serializable silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, boolean z2, ag agVar) {
        super(0);
        this.red = qVar;
        this.purple = z2;
        this.silver = agVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        switch (this.alpha) {
            case 0:
                q qVar = (q) this.red;
                aj alpha = qVar.alpha((InterfaceC2335k) qVar.alpha.charlie);
                if (alpha != null) {
                    D5.s sVar = qVar.alpha;
                    boolean z2 = this.purple;
                    ag agVar = (ag) this.silver;
                    if (z2) {
                        list = CollectionsKt.z(((InterfaceC0845a) ((K) sVar.alpha).echo).lima(alpha, agVar));
                    } else {
                        list = CollectionsKt.z(((InterfaceC0845a) ((K) sVar.alpha).echo).foxtrot(alpha, agVar));
                    }
                } else {
                    list = null;
                }
                if (list == null) {
                    return CollectionsKt.emptyList();
                }
                return list;
            default:
                if (this.purple) {
                    C2194d c2194d = (C2194d) this.red;
                    String str = (String) this.silver;
                    C2406a c2406a = c2194d.alpha;
                    synchronized (c2406a.charlie) {
                    }
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z2, C2194d c2194d, String str) {
        super(0);
        this.purple = z2;
        this.red = c2194d;
        this.silver = str;
    }
}
