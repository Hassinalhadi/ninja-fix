package com.fingerprintjs.android.fpjs_pro_internal;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1258s1 {
    public static int alpha = 0;
    public static int bravo = 1;
    public static int charlie;
    public static int delta;

    public static int alpha() {
        int i4 = charlie;
        int i5 = i4 % 5185439;
        charlie = i4 + 1;
        if (i5 != 0) {
            return delta;
        }
        int maxMemory = (int) Runtime.getRuntime().maxMemory();
        delta = maxMemory;
        return maxMemory;
    }
}
