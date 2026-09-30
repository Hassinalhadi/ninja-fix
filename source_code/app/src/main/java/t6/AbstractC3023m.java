package t6;

import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import s6.O5;

/* renamed from: t6.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3023m {
    public static final /* synthetic */ int alpha = 0;

    public static final boolean alpha(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        pe.aq aqVar;
        boolean alpha2;
        InterfaceC2332h kilo = yVar.green().kilo();
        if (kilo == null || !Qe.g.bravo(kilo) || Intrinsics.areEqual(Ue.e.golf((InterfaceC2330f) kilo), me.n.golf)) {
            InterfaceC2332h kilo2 = yVar.green().kilo();
            if (kilo2 instanceof pe.aq) {
                aqVar = (pe.aq) kilo2;
            } else {
                aqVar = null;
            }
            if (aqVar == null) {
                alpha2 = false;
            } else {
                alpha2 = alpha(O5.foxtrot(aqVar));
            }
            if (!alpha2) {
                return false;
            }
            return true;
        }
        return true;
    }
}
