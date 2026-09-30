package Ge;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class p extends Lambda implements Function1 {
    public static final p alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.echo(it, "it");
        if (it.length() > 1) {
            return AbstractC2327c.victor(';', "L", it);
        }
        return it;
    }
}
