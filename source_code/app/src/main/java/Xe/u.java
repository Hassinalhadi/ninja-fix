package Xe;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2326b;

/* loaded from: classes2.dex */
public final class u extends Lambda implements Function1 {
    public static final u alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2326b selectMostSpecificInEachOverridableGroup = (InterfaceC2326b) obj;
        Intrinsics.echo(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }
}
