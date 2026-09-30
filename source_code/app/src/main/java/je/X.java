package je;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2328d;
import pe.InterfaceC2345u;
import se.AbstractC2863m;
import se.C2871u;

/* loaded from: classes2.dex */
public abstract class X {
    public static final Pe.t alpha = Pe.o.alpha;

    public static void alpha(StringBuilder sb2, InterfaceC2328d interfaceC2328d) {
        boolean z2;
        C2871u golf = a0.golf(interfaceC2328d);
        C2871u g2 = interfaceC2328d.g();
        if (golf != null) {
            sb2.append(delta(golf.getType()));
            sb2.append(".");
        }
        if (golf != null && g2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            sb2.append("(");
        }
        if (g2 != null) {
            sb2.append(delta(g2.getType()));
            sb2.append(".");
        }
        if (z2) {
            sb2.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String bravo(InterfaceC2345u descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        alpha(sb2, descriptor);
        Ne.f name = ((AbstractC2863m) descriptor).getName();
        Intrinsics.delta(name, "descriptor.name");
        sb2.append(alpha.indigo(name, true));
        List peach = descriptor.peach();
        Intrinsics.delta(peach, "descriptor.valueParameters");
        CollectionsKt.magenta(peach, sb2, ", ", "(", ")", C1963b.f12910f, 48);
        sb2.append(": ");
        kotlin.reflect.jvm.internal.impl.types.y returnType = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        sb2.append(delta(returnType));
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static String charlie(pe.al descriptor) {
        String str;
        Intrinsics.echo(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        if (descriptor.e()) {
            str = "var ";
        } else {
            str = "val ";
        }
        sb2.append(str);
        alpha(sb2, descriptor);
        Ne.f name = descriptor.getName();
        Intrinsics.delta(name, "descriptor.name");
        sb2.append(alpha.indigo(name, true));
        sb2.append(": ");
        kotlin.reflect.jvm.internal.impl.types.y type = descriptor.getType();
        Intrinsics.delta(type, "descriptor.type");
        sb2.append(delta(type));
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static String delta(kotlin.reflect.jvm.internal.impl.types.y type) {
        Intrinsics.echo(type, "type");
        return alpha.orange(type);
    }
}
