package com.fingerprintjs.android.fpjs_pro;

/* loaded from: classes3.dex */
public final class t extends Error {
    public static int echo;
    public static int foxtrot;

    public static int bravo() {
        int i4 = echo;
        int i5 = i4 % 9683574;
        echo = i4 + 1;
        if (i5 != 0) {
            return foxtrot;
        }
        int maxMemory = (int) Runtime.getRuntime().maxMemory();
        foxtrot = maxMemory;
        return maxMemory;
    }
}
