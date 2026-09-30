package ye;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.AbstractC2120h;
import pe.InterfaceC2328d;
import s6.AbstractC2661g5;

/* loaded from: classes2.dex */
public final class ai extends Lambda implements Function1 {
    public static final ai alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        InterfaceC2328d bravo;
        String echo;
        InterfaceC2328d it = (InterfaceC2328d) obj;
        Intrinsics.echo(it, "it");
        if (AbstractC2120h.yankee(it)) {
            int i4 = h.lima;
            if (am.echo.contains(it.getName()) && (bravo = Ue.e.bravo(it, g.alpha)) != null && (echo = AbstractC2661g5.echo(bravo)) != null) {
                if (!am.bravo.contains(echo)) {
                }
                z2 = true;
                return Boolean.valueOf(z2);
            }
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
