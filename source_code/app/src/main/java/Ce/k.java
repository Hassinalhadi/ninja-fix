package Ce;

import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class k extends Lambda implements Function1 {
    public static final k alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ve.y it = (ve.y) obj;
        Intrinsics.echo(it, "it");
        return Boolean.valueOf(!Modifier.isStatic(it.bravo().getModifiers()));
    }
}
