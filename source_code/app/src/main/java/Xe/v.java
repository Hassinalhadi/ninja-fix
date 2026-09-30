package Xe;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import se.ak;

/* loaded from: classes2.dex */
public final class v extends Lambda implements Function1 {
    public static final v alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ak selectMostSpecificInEachOverridableGroup = (ak) obj;
        Intrinsics.echo(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }
}
