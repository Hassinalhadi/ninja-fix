package com.google.maps.android;

import android.util.Log;

/* loaded from: classes2.dex */
public final class RendererLogger {
    private static boolean enabled;

    private RendererLogger() {
    }

    public static void d(String str, String str2) {
        if (enabled) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (enabled) {
            Log.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (enabled) {
            Log.i(str, str2);
        }
    }

    public static void setEnabled(boolean z2) {
        enabled = z2;
    }

    public static void w(String str, String str2) {
        if (enabled) {
            Log.w(str, str2);
        }
    }
}
