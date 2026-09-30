package B2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ab extends Lambda implements Function1 {
    public static final ab alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        J2.p spec = (J2.p) obj;
        Intrinsics.echo(spec, "spec");
        if (spec.delta()) {
            return "Periodic";
        }
        return "OneTime";
    }
}
