package zd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class o {
    public static final /* synthetic */ int alpha = 0;

    static {
        m mVar = m.alpha;
        Intrinsics.areEqual(mVar, mVar);
        Intrinsics.areEqual(mVar, n.alpha);
        String property = System.getProperty("io.ktor.development");
        if (property != null) {
            Boolean.parseBoolean(property);
        }
    }
}
