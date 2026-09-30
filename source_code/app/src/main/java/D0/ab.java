package D0;

import a0.C0366t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ab implements Function1 {
    public static final ab alpha = new Object();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
            return new C0366t(C0366t.kilo);
        }
        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Int");
        return new C0366t(a0.ao.charlie(((Integer) obj).intValue()));
    }
}
