package ye;

import bx.C0769g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.AbstractC2120h;
import pe.InterfaceC2328d;

/* loaded from: classes2.dex */
public final class ah extends Lambda implements Function1 {
    public static final ah alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        InterfaceC2328d it = (InterfaceC2328d) obj;
        Intrinsics.echo(it, "it");
        int i4 = AbstractC3427e.lima;
        se.ak akVar = (se.ak) it;
        if (AbstractC2120h.yankee(akVar) && Ue.e.bravo(akVar, new C0769g(26, akVar)) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
