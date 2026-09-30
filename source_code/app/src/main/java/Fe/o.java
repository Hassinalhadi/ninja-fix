package Fe;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.B;
import oe.C2233d;
import pe.InterfaceC2332h;

/* loaded from: classes2.dex */
public final class o extends Lambda implements Function1 {
    public static final o alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        InterfaceC2332h kilo = ((B) obj).green().kilo();
        if (kilo == null) {
            return Boolean.FALSE;
        }
        Ne.f name = kilo.getName();
        Ne.c cVar = C2233d.foxtrot;
        if (Intrinsics.areEqual(name, cVar.foxtrot()) && Intrinsics.areEqual(Ue.e.charlie(kilo), cVar)) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
