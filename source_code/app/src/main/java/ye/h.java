package ye;

import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2345u;
import se.AbstractC2863m;

/* loaded from: classes2.dex */
public final class h extends am {
    public static final /* synthetic */ int lima = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC2345u alpha(InterfaceC2345u functionDescriptor) {
        Intrinsics.echo(functionDescriptor, "functionDescriptor");
        Ne.f name = ((AbstractC2863m) functionDescriptor).getName();
        Intrinsics.delta(name, "functionDescriptor.name");
        if (!bravo(name)) {
            return null;
        }
        return (InterfaceC2345u) Ue.e.bravo(functionDescriptor, f.alpha);
    }

    public static boolean bravo(Ne.f fVar) {
        Intrinsics.echo(fVar, "<this>");
        return am.echo.contains(fVar);
    }
}
