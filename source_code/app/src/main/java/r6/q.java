package r6;

import android.content.Context;
import i6.C1894c;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q {
    public static final l bravo = l.alpha(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String alpha;

    public q(Context context, com.google.mlkit.common.sdkinternal.m mVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        com.google.mlkit.common.sdkinternal.c.alpha(context);
        synchronized (u.class) {
            if (u.purple == null) {
                u.purple = new u(0);
            }
        }
        this.alpha = "common";
        com.google.mlkit.common.sdkinternal.g alpha = com.google.mlkit.common.sdkinternal.g.alpha();
        C3.b bVar = new C3.b(5, this);
        alpha.getClass();
        com.google.mlkit.common.sdkinternal.g.bravo(bVar);
        com.google.mlkit.common.sdkinternal.g alpha2 = com.google.mlkit.common.sdkinternal.g.alpha();
        Objects.requireNonNull(mVar);
        p pVar = new p(mVar, 0);
        alpha2.getClass();
        com.google.mlkit.common.sdkinternal.g.bravo(pVar);
        l lVar = bravo;
        if (lVar.containsKey("common")) {
            C1894c.delta(context, (String) lVar.get("common"), false);
        }
    }
}
