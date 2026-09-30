package com.fingerprintjs.android.fpjs_pro;

import android.os.Process;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class g {
    public static int alpha;
    public static int bravo;

    public static int alpha() {
        int i4 = alpha;
        int i5 = i4 % 7214533;
        alpha = i4 + 1;
        if (i5 != 0) {
            return bravo;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        bravo = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
