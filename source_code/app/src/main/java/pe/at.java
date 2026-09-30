package pe;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class at extends Lambda implements Function1 {
    public static final at alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2335k it = (InterfaceC2335k) obj;
        Intrinsics.echo(it, "it");
        List typeParameters = ((InterfaceC2326b) it).getTypeParameters();
        Intrinsics.delta(typeParameters, "it as CallableDescriptor).typeParameters");
        return CollectionsKt.beige(typeParameters);
    }
}
