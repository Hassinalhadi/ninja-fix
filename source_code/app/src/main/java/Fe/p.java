package Fe;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2328d;
import se.C2871u;

/* loaded from: classes2.dex */
public final class p extends Lambda implements Function1 {
    public static final p alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2328d it = (InterfaceC2328d) obj;
        Intrinsics.echo(it, "it");
        C2871u g2 = it.g();
        Intrinsics.checkNotNull(g2);
        return g2.getType();
    }
}
