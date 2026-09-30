package bj;

import bv.aw;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import r1.InterfaceC2482a;

/* loaded from: classes3.dex */
public final class d implements InterfaceC2482a {
    public final /* synthetic */ int alpha;
    public Object bravo;

    @Override // r1.InterfaceC2482a
    public final void accept(Object obj) {
        switch (this.alpha) {
            case 0:
                Intrinsics.charlie((InterfaceC2482a) this.bravo, "Listener is not set.");
                ((InterfaceC2482a) this.bravo).accept(obj);
                return;
            case 1:
                p1.f fVar = (p1.f) obj;
                if (fVar == null) {
                    fVar = new p1.f(-3);
                }
                ((com.google.android.play.core.integrity.k) this.bravo).golf(fVar);
                return;
            default:
                p1.f fVar2 = (p1.f) obj;
                synchronized (p1.g.charlie) {
                    try {
                        aw awVar = p1.g.delta;
                        ArrayList arrayList = (ArrayList) awVar.get((String) this.bravo);
                        if (arrayList != null) {
                            awVar.remove((String) this.bravo);
                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                ((InterfaceC2482a) arrayList.get(i4)).accept(fVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ d(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }
}
