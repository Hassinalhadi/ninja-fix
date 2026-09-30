package com.SecurityGuardBrige.ShiftArchersMougraph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import java.util.List;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class ArchersAutoClickerSmooth {
    private static boolean done;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(63, ArchersAutoClickerSmooth.class);
        Hidden0.special_clinit_63_00(ArchersAutoClickerSmooth.class);
    }

    public static native void reset();

    private static native void toast(Activity activity, String str);

    public static native void tryAutoClick(Activity activity, List list);
}
