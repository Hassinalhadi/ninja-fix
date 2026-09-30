package ye;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2328d;
import pe.InterfaceC2345u;
import s6.AbstractC2661g5;

/* loaded from: classes2.dex */
public final class g extends Lambda implements Function1 {
    public static final g alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        InterfaceC2328d it = (InterfaceC2328d) obj;
        Intrinsics.echo(it, "it");
        if (it instanceof InterfaceC2345u) {
            int i4 = h.lima;
            if (CollectionsKt.bronze(am.foxtrot, AbstractC2661g5.echo(it))) {
                z2 = true;
                return Boolean.valueOf(z2);
            }
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
