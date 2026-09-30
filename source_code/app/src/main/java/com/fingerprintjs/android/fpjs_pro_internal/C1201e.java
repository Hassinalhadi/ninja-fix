package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1201e {
    public static int alpha = 0;
    public static int bravo = 0;
    public static int charlie = 0;
    public static int delta = 1;

    public static int component5() {
        int i4 = alpha;
        int i5 = i4 % 8716838;
        alpha = i4 + 1;
        if (i5 != 0) {
            return bravo;
        }
        int myTid = Process.myTid();
        bravo = myTid;
        return myTid;
    }
}
