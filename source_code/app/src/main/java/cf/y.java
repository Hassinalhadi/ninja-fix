package cf;

import Ie.aq;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class y extends Lambda implements Function1 {
    public static final y alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        aq it = (aq) obj;
        Intrinsics.echo(it, "it");
        return Integer.valueOf(it.silver.size());
    }
}
