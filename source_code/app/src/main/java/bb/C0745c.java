package bb;

import A2.p;
import androidx.camera.core.C0501h;
import androidx.camera.core.C0502i;
import bc.f;
import bj.h;
import bj.k;
import java.util.Map;
import r1.InterfaceC2482a;
import t6.AbstractC3066u3;
import t6.j4;
import w.o;

/* renamed from: bb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0745c implements InterfaceC2482a {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ C0745c(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // r1.InterfaceC2482a
    public final void accept(Object obj) {
        switch (this.alpha) {
            case 0:
                ((o) this.bravo).getClass();
                j4.alpha();
                return;
            case 1:
                C0502i c0502i = (C0502i) obj;
                for (Map.Entry entry : ((Map) this.bravo).entrySet()) {
                    int i4 = c0502i.bravo - ((bl.b) entry.getKey()).foxtrot;
                    if (((bl.b) entry.getKey()).golf) {
                        i4 = -i4;
                    }
                    int foxtrot = f.foxtrot(i4);
                    k kVar = (k) entry.getValue();
                    kVar.getClass();
                    j4.delta(new h(kVar, foxtrot, -1));
                }
                return;
            case 2:
                AbstractC3066u3.bravo("SurfaceViewImpl", "Safe to release surface.");
                p pVar = (p) this.bravo;
                if (pVar != null) {
                    pVar.bravo();
                    return;
                }
                return;
            default:
                ((V0.h) this.bravo).bravo((C0501h) obj);
                return;
        }
    }
}
