package s6;

import a0.C0366t;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import me.C2116d;
import pe.InterfaceC2330f;

/* loaded from: classes2.dex */
public abstract class C6 {
    public static final boolean alpha(InterfaceC2330f interfaceC2330f) {
        Ne.b bVar;
        LinkedHashSet linkedHashSet = C2116d.alpha;
        if (Qe.e.lima(interfaceC2330f)) {
            LinkedHashSet linkedHashSet2 = C2116d.alpha;
            Ne.b foxtrot = Ue.e.foxtrot(interfaceC2330f);
            if (foxtrot != null) {
                bVar = foxtrot.foxtrot();
            } else {
                bVar = null;
            }
            if (CollectionsKt.bronze(linkedHashSet2, bVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final long bravo(float f5, long j5) {
        if (!Float.isNaN(f5) && f5 < 1.0f) {
            return C0366t.bravo(C0366t.delta(j5) * f5, j5);
        }
        return j5;
    }
}
