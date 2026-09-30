package ye;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2328d;
import t6.E3;

/* loaded from: classes2.dex */
public final class j extends Lambda implements Function1 {
    public static final j alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2328d it = (InterfaceC2328d) obj;
        Intrinsics.echo(it, "it");
        return Boolean.valueOf(E3.alpha(it));
    }
}
