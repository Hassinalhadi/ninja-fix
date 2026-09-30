package ye;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import pe.InterfaceC2326b;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2345u;
import s6.AbstractC2661g5;
import se.AbstractC2863m;
import t6.I3;
import t6.K3;

/* loaded from: classes2.dex */
public final class t implements Qe.f {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (ye.am.juliet.contains(r1) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Qe.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int alpha(InterfaceC2326b superDescriptor, InterfaceC2326b subDescriptor, InterfaceC2330f interfaceC2330f) {
        InterfaceC2345u interfaceC2345u;
        Intrinsics.echo(superDescriptor, "superDescriptor");
        Intrinsics.echo(subDescriptor, "subDescriptor");
        if ((superDescriptor instanceof InterfaceC2328d) && (subDescriptor instanceof InterfaceC2345u) && !AbstractC2120h.yankee(subDescriptor)) {
            int i4 = h.lima;
            InterfaceC2345u interfaceC2345u2 = (InterfaceC2345u) subDescriptor;
            AbstractC2863m abstractC2863m = (AbstractC2863m) interfaceC2345u2;
            Ne.f name = abstractC2863m.getName();
            Intrinsics.delta(name, "subDescriptor.name");
            if (!h.bravo(name)) {
                ArrayList arrayList = am.alpha;
                Ne.f name2 = abstractC2863m.getName();
                Intrinsics.delta(name2, "subDescriptor.name");
            }
            InterfaceC2328d delta = K3.delta((InterfaceC2328d) superDescriptor);
            boolean z2 = superDescriptor instanceof InterfaceC2345u;
            if (z2) {
                interfaceC2345u = (InterfaceC2345u) superDescriptor;
            } else {
                interfaceC2345u = null;
            }
            if ((interfaceC2345u != null && interfaceC2345u2.q() == interfaceC2345u.q()) || (delta != null && interfaceC2345u2.q())) {
                if ((interfaceC2330f instanceof Ae.c) && interfaceC2345u2.yellow() == null && delta != null && !K3.echo(interfaceC2330f, delta)) {
                    if ((delta instanceof InterfaceC2345u) && z2 && h.alpha((InterfaceC2345u) delta) != null) {
                        String delta2 = AbstractC2661g5.delta(interfaceC2345u2, 2);
                        InterfaceC2345u alpha = ((InterfaceC2345u) superDescriptor).alpha();
                        Intrinsics.delta(alpha, "superDescriptor.original");
                        if (!Intrinsics.areEqual(delta2, AbstractC2661g5.delta(alpha, 2))) {
                            return 3;
                        }
                    } else {
                        return 3;
                    }
                }
            } else {
                return 3;
            }
        }
        if (I3.alpha(superDescriptor, subDescriptor)) {
            return 3;
        }
        return 4;
    }

    @Override // Qe.f
    public final int bravo() {
        return 1;
    }
}
