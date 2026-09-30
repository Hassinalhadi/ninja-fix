package s6;

import ge.InterfaceC1772d;
import ge.InterfaceC1773e;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;

/* renamed from: s6.r5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2759r5 {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC1772d alpha(InterfaceC1773e interfaceC1773e) {
        InterfaceC2330f interfaceC2330f;
        if (interfaceC1773e instanceof InterfaceC1772d) {
            return (InterfaceC1772d) interfaceC1773e;
        }
        if (interfaceC1773e instanceof ge.x) {
            List upperBounds = ((ge.x) interfaceC1773e).getUpperBounds();
            Iterator it = upperBounds.iterator();
            while (true) {
                interfaceC2330f = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ge.w wVar = (ge.w) next;
                Intrinsics.charlie(wVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                InterfaceC2332h kilo = ((je.N) wVar).alpha.green().kilo();
                if (kilo instanceof InterfaceC2330f) {
                    interfaceC2330f = (InterfaceC2330f) kilo;
                }
                if (interfaceC2330f != null && interfaceC2330f.c() != 2 && interfaceC2330f.c() != 5) {
                    interfaceC2330f = next;
                    break;
                }
            }
            ge.w wVar2 = (ge.w) interfaceC2330f;
            if (wVar2 == null) {
                wVar2 = (ge.w) CollectionsKt.green(upperBounds);
            }
            if (wVar2 != null) {
                return bravo(wVar2);
            }
            return kotlin.jvm.internal.u.alpha.bravo(Object.class);
        }
        throw new je.Q("Cannot calculate JVM erasure for type: " + interfaceC1773e);
    }

    public static final InterfaceC1772d bravo(ge.w wVar) {
        InterfaceC1773e foxtrot = wVar.foxtrot();
        if (foxtrot != null) {
            return alpha(foxtrot);
        }
        throw new je.Q("Cannot calculate JVM erasure for type: " + wVar);
    }
}
