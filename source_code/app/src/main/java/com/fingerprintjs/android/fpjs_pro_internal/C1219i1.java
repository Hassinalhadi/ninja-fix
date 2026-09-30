package com.fingerprintjs.android.fpjs_pro_internal;

import android.util.Log;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import java.util.Iterator;
import kotlin.text.StringsKt;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.i1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1219i1 implements InterfaceC1276x {
    public final void alpha(SafeWithTimeoutProContext safeWithTimeoutProContext, String str) {
        Iterator it = StringsKt.navy(ao.ad.amber(safeWithTimeoutProContext.getClass().getCanonicalName(), ": ", str), new char[]{'\n'}).iterator();
        while (it.hasNext()) {
            Log.e("FingerprintJS", (String) it.next());
        }
    }
}
