package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1188a2 {
    public static int charlie;
    public static int delta;
    public static int echo;
    public final String alpha;
    public final String bravo;

    public C1188a2(String str, String str2) {
        this.alpha = str;
        this.bravo = str2;
    }

    public static int alpha() {
        int i4 = delta;
        int i5 = i4 % 7930215;
        delta = i4 + 1;
        if (i5 != 0) {
            return echo;
        }
        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
        echo = elapsedRealtime;
        return elapsedRealtime;
    }
}
