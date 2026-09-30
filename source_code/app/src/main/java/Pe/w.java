package Pe;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import se.aq;

/* loaded from: classes2.dex */
public final class w extends Lambda implements Function1 {
    public static final w alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        aq it = (aq) obj;
        Intrinsics.echo(it, "it");
        return "...";
    }
}
