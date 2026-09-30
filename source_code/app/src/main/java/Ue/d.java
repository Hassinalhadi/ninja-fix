package Ue;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2335k;

/* loaded from: classes2.dex */
public final class d extends Lambda implements Function1 {
    public static final d alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2335k it = (InterfaceC2335k) obj;
        Intrinsics.echo(it, "it");
        return it.lima();
    }
}
