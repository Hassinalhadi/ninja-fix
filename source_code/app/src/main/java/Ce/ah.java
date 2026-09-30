package Ce;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class ah extends Lambda implements Function1 {
    public static final ah alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Xe.n it = (Xe.n) obj;
        Intrinsics.echo(it, "it");
        return it.echo();
    }
}
