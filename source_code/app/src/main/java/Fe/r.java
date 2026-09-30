package Fe;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.B;

/* loaded from: classes2.dex */
public final class r extends Lambda implements Function1 {
    public static final r alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        B it = (B) obj;
        Intrinsics.echo(it, "it");
        return Boolean.valueOf(it instanceof De.f);
    }
}
