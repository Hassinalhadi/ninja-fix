package ye;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2328d;
import s6.AbstractC2661g5;

/* loaded from: classes2.dex */
public final class f extends Lambda implements Function1 {
    public static final f alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2328d it = (InterfaceC2328d) obj;
        Intrinsics.echo(it, "it");
        int i4 = h.lima;
        return Boolean.valueOf(CollectionsKt.bronze(am.foxtrot, AbstractC2661g5.echo(it)));
    }
}
