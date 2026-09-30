package com.fingerprintjs.android.fpjs_pro_internal;

/* loaded from: classes3.dex */
public final class N {
    public static int charlie = 0;
    public static int delta = 1;
    public static int echo;
    public static int foxtrot;
    public final String alpha;
    public final long bravo;

    public N(String str, long j5) {
        this.alpha = str;
        this.bravo = j5;
    }

    public static int alpha() {
        int i4 = echo;
        int i5 = i4 % 6644965;
        echo = i4 + 1;
        if (i5 != 0) {
            return foxtrot;
        }
        int tango = ao.ad.tango(295219395);
        foxtrot = tango;
        return tango;
    }
}
