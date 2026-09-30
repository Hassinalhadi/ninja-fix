package com.SecurityGuardBrige.SmoothBlocade;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.content.Context;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public final class Smooth$Blocade {
    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(93, Smooth$Blocade.class);
        Hidden0.special_clinit_93_00(Smooth$Blocade.class);
    }

    private Smooth$Blocade() {
    }

    private static native void block(Context context);

    private static native boolean containsIgnoreCase(String str, String str2);

    private static native boolean containsInFile(String str, String str2);

    public static native void enforce(Context context);

    private static native boolean exists(String str);

    private static native String getProp(String str);

    private static native boolean hasBootloaderUnlock();

    private static native boolean hasDangerousProps();

    private static native boolean hasDebugger();

    private static native boolean hasDexEntry(String str);

    private static native boolean hasEldState();

    private static native boolean hasEmulator();

    private static native boolean hasLocalTamper(Context context);

    private static native boolean hasPackage(Context context, String str);

    private static native boolean hasRootFiles();

    private static native boolean hasRootPackages(Context context);

    private static native boolean hasStrongRootProps();

    private static native boolean hasSuCommand();

    private static native boolean hasSuspiciousMaps();

    private static native boolean hasSuspiciousMounts();

    private static native boolean hasTestKeys();

    private static native boolean hasTracerPid();

    public static native boolean isRooted(Context context);

    private static native boolean propContains(String str, String str2);

    private static native boolean propEquals(String str, String str2);
}
