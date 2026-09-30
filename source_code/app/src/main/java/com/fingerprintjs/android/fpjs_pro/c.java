package com.fingerprintjs.android.fpjs_pro;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class c extends Error {
    public static int echo;
    public static int foxtrot;

    public static int bravo() {
        int i4 = echo;
        int i5 = i4 % 8910333;
        echo = i4 + 1;
        if (i5 != 0) {
            return foxtrot;
        }
        int uptimeMillis = (int) SystemClock.uptimeMillis();
        foxtrot = uptimeMillis;
        return uptimeMillis;
    }
}
