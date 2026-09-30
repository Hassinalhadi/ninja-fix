package Se;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.y;

/* loaded from: classes2.dex */
public final class l extends Lambda implements Function1 {
    public static final l alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y it = (y) obj;
        Intrinsics.echo(it, "it");
        return it.toString();
    }
}
