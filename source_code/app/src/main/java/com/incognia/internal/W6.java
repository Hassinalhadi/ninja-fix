package com.incognia.internal;

import android.os.Build;
import android.os.SystemClock;
import java.time.Clock;

/* loaded from: classes2.dex */
public final class W6 {
    public static Long b() {
        Clock currentNetworkTimeClock;
        long millis;
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                currentNetworkTimeClock = SystemClock.currentNetworkTimeClock();
                millis = currentNetworkTimeClock.millis();
                return Long.valueOf(millis);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
