package ye;

import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ax;
import pe.InterfaceC2326b;
import pe.InterfaceC2330f;
import pf.AbstractC2360j;
import pf.C2355e;
import pf.C2357g;
import pf.C2364n;
import pf.InterfaceC2358h;
import se.C2871u;

/* loaded from: classes2.dex */
public final class n implements Qe.f {
    @Override // Qe.f
    public final int alpha(InterfaceC2326b superDescriptor, InterfaceC2326b subDescriptor, InterfaceC2330f interfaceC2330f) {
        int i4;
        kotlin.reflect.jvm.internal.impl.types.y yVar;
        Intrinsics.echo(superDescriptor, "superDescriptor");
        Intrinsics.echo(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof Ae.f) {
            Ae.f fVar = (Ae.f) subDescriptor;
            if (fVar.getTypeParameters().isEmpty()) {
                Qe.j india = Qe.k.india(superDescriptor, subDescriptor);
                if (india != null) {
                    i4 = india.charlie();
                } else {
                    i4 = 0;
                }
                if (i4 == 0) {
                    List peach = fVar.peach();
                    Intrinsics.delta(peach, "subDescriptor.valueParameters");
                    C2364n oscar = AbstractC2360j.oscar(CollectionsKt.beige(peach), m.alpha);
                    kotlin.reflect.jvm.internal.impl.types.y yVar2 = fVar.yellow;
                    Intrinsics.checkNotNull(yVar2);
                    C2357g kilo = AbstractC2360j.kilo(ArraysKt.tango(new InterfaceC2358h[]{oscar, new Pf.u(1, yVar2)}));
                    C2871u c2871u = fVar.f13777b;
                    if (c2871u != null) {
                        yVar = c2871u.getType();
                    } else {
                        yVar = null;
                    }
                    List elements = CollectionsKt.orange(yVar);
                    Intrinsics.echo(elements, "elements");
                    C2355e c2355e = new C2355e(AbstractC2360j.kilo(ArraysKt.tango(new InterfaceC2358h[]{kilo, CollectionsKt.beige(elements)})));
                    while (c2355e.hasNext()) {
                        kotlin.reflect.jvm.internal.impl.types.y yVar3 = (kotlin.reflect.jvm.internal.impl.types.y) c2355e.next();
                        if (!yVar3.cyan().isEmpty() && !(yVar3.ochre() instanceof De.f)) {
                            return 4;
                        }
                    }
                    InterfaceC2326b interfaceC2326b = (InterfaceC2326b) superDescriptor.delta(new ax(new De.d()));
                    if (interfaceC2326b != null) {
                        if (interfaceC2326b instanceof se.ak) {
                            se.ak akVar = (se.ak) interfaceC2326b;
                            if (!akVar.getTypeParameters().isEmpty()) {
                                interfaceC2326b = akVar.w().quebec(CollectionsKt.emptyList()).build();
                                Intrinsics.checkNotNull(interfaceC2326b);
                            }
                        }
                        int charlie = Qe.k.charlie.november(interfaceC2326b, subDescriptor, false).charlie();
                        com.google.android.material.datepicker.j.sierra(charlie, "DEFAULT.isOverridableByW…Descriptor, false).result");
                        if (l.$EnumSwitchMapping$0[av.q.mike(charlie)] == 1) {
                            return 1;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 4;
        }
        return 4;
    }

    @Override // Qe.f
    public final int bravo() {
        return 2;
    }
}
