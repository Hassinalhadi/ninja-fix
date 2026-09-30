package Pe;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class y extends Lambda implements Function1 {
    public static final y alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kotlin.reflect.jvm.internal.impl.types.y it = (kotlin.reflect.jvm.internal.impl.types.y) obj;
        Intrinsics.echo(it, "it");
        return it;
    }
}
