package F2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class l extends Lambda implements Function1 {
    public static final l alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        G2.e it = (G2.e) obj;
        Intrinsics.echo(it, "it");
        return it.getClass().getSimpleName();
    }
}
