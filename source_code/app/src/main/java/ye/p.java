package ye;

import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2326b;
import pe.InterfaceC2330f;
import s6.F0;

/* loaded from: classes2.dex */
public final class p implements Qe.f {
    @Override // Qe.f
    public final int alpha(InterfaceC2326b superDescriptor, InterfaceC2326b subDescriptor, InterfaceC2330f interfaceC2330f) {
        Intrinsics.echo(superDescriptor, "superDescriptor");
        Intrinsics.echo(subDescriptor, "subDescriptor");
        if ((subDescriptor instanceof pe.al) && (superDescriptor instanceof pe.al)) {
            pe.al alVar = (pe.al) subDescriptor;
            pe.al alVar2 = (pe.al) superDescriptor;
            if (Intrinsics.areEqual(alVar.getName(), alVar2.getName())) {
                if (F0.bravo(alVar) && F0.bravo(alVar2)) {
                    return 1;
                }
                if (F0.bravo(alVar) || F0.bravo(alVar2)) {
                    return 3;
                }
                return 4;
            }
            return 4;
        }
        return 4;
    }

    @Override // Qe.f
    public final int bravo() {
        return 3;
    }
}
