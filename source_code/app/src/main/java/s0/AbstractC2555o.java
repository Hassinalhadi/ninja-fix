package s0;

import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import t0.C2946x;

/* renamed from: s0.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2555o {
    public static final void alpha(J.e eVar, T.r rVar) {
        J.e zulu = golf(rVar).zulu();
        int i4 = zulu.red - 1;
        Object[] objArr = zulu.alpha;
        if (i4 < objArr.length) {
            while (i4 >= 0) {
                eVar.bravo((T.r) ((al) objArr[i4]).f13305x.delta);
                i4--;
            }
        }
    }

    public static final T.r bravo(J.e eVar) {
        int i4;
        if (eVar != null && (i4 = eVar.red) != 0) {
            return (T.r) eVar.mike(i4 - 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ab charlie(T.r rVar) {
        if ((rVar.getKindSet$ui_release() & 2) != 0) {
            if (rVar instanceof ab) {
                return (ab) rVar;
            }
            if (rVar instanceof AbstractC2556p) {
                T.r rVar2 = ((AbstractC2556p) rVar).purple;
                while (rVar2 != 0) {
                    if (rVar2 instanceof ab) {
                        return (ab) rVar2;
                    }
                    if ((rVar2 instanceof AbstractC2556p) && (rVar2.getKindSet$ui_release() & 2) != 0) {
                        rVar2 = ((AbstractC2556p) rVar2).purple;
                    } else {
                        rVar2 = rVar2.getChild$ui_release();
                    }
                }
            }
        }
        return null;
    }

    public static final void delta(InterfaceC2554n interfaceC2554n) {
        U.c cVar;
        al golf = golf(interfaceC2554n);
        if (!golf.f13293l) {
            C2946x c2946x = (C2946x) ao.alpha(golf);
            if (C2946x.echo() && (cVar = c2946x.f13921y) != null) {
                cVar.delta.alpha.november(golf.purple, new U.b(cVar, golf));
            }
        }
    }

    public static final L echo(InterfaceC2554n interfaceC2554n, int i4) {
        L coordinator$ui_release = interfaceC2554n.getNode().getCoordinator$ui_release();
        Intrinsics.checkNotNull(coordinator$ui_release);
        if (coordinator$ui_release.A() == interfaceC2554n && M.hotel(i4)) {
            L l10 = coordinator$ui_release.f13252j;
            Intrinsics.checkNotNull(l10);
            return l10;
        }
        return coordinator$ui_release;
    }

    public static final L foxtrot(InterfaceC2554n interfaceC2554n) {
        if (!interfaceC2554n.getNode().isAttached()) {
            AbstractC2264a.bravo("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        L echo = echo(interfaceC2554n, 2);
        echo.getClass();
        if (!echo.india()) {
            AbstractC2264a.bravo("LayoutCoordinates is not attached.");
        }
        return echo;
    }

    public static final al golf(InterfaceC2554n interfaceC2554n) {
        L coordinator$ui_release = interfaceC2554n.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.f13251i;
        }
        throw Q0.c.xray("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final W hotel(InterfaceC2554n interfaceC2554n) {
        C2946x c2946x = golf(interfaceC2554n).f13287f;
        if (c2946x != null) {
            return c2946x;
        }
        throw Q0.c.xray("This node does not have an owner.");
    }
}
