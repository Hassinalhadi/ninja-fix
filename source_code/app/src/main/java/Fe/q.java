package Fe;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2328d;

/* loaded from: classes2.dex */
public final class q extends Lambda implements Function1 {
    public static final q alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2328d it = (InterfaceC2328d) obj;
        Intrinsics.echo(it, "it");
        y returnType = it.getReturnType();
        Intrinsics.checkNotNull(returnType);
        return returnType;
    }
}
