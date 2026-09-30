package Ge;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class c extends Lambda implements Xd.l {
    public static final c alpha = new Lambda(2);

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        a loadConstantFromProperty = (a) obj;
        o it = (o) obj2;
        Intrinsics.echo(loadConstantFromProperty, "$this$loadConstantFromProperty");
        Intrinsics.echo(it, "it");
        return loadConstantFromProperty.bravo.get(it);
    }
}
