package Ge;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends Lambda implements Xd.l {
    public static final b alpha = new Lambda(2);

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        a loadConstantFromProperty = (a) obj;
        o it = (o) obj2;
        Intrinsics.echo(loadConstantFromProperty, "$this$loadConstantFromProperty");
        Intrinsics.echo(it, "it");
        return loadConstantFromProperty.charlie.get(it);
    }
}
