package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class bx {
    public static int bravo;
    public static int charlie;
    public final byte[] alpha;

    public bx(byte[] bArr) {
        this.alpha = bArr;
    }

    public static int alpha() {
        int i4 = bravo;
        int i5 = i4 % 8378452;
        bravo = i4 + 1;
        if (i5 != 0) {
            return charlie;
        }
        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
        charlie = elapsedRealtime;
        return elapsedRealtime;
    }

    @Nullable
    public final byte[] component5() {
        return this.alpha;
    }
}
