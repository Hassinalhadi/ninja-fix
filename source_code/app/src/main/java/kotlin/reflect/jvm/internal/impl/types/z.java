package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class z extends Lambda implements Function1 {
    public static final /* synthetic */ int alpha = 0;

    static {
        new Lambda(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.echo((C1791f) obj, "<anonymous parameter 0>");
        return null;
    }
}
