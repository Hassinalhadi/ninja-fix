package com.incognia.internal;

import android.app.ActivityManager;

/* loaded from: classes2.dex */
public final class Kn5 {
    public static hCR b(ActivityManager.MemoryInfo memoryInfo) {
        Long l10;
        long j5;
        if (CnH.b(CnH.f8484b, 34, 0, 2)) {
            j5 = memoryInfo.advertisedMem;
            l10 = Long.valueOf(j5);
        } else {
            l10 = null;
        }
        return new hCR(Long.valueOf(memoryInfo.totalMem), l10);
    }
}
