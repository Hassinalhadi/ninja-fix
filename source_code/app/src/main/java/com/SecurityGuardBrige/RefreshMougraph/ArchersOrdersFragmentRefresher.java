package com.SecurityGuardBrige.RefreshMougraph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.os.Handler;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class ArchersOrdersFragmentRefresher {
    public static Handler handler;
    public static boolean isRunning;
    public static Runnable refreshRunnable;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(56, ArchersOrdersFragmentRefresher.class);
        Hidden0.special_clinit_56_00(ArchersOrdersFragmentRefresher.class);
    }

    public static native void start(OrdersFragmentV2 ordersFragmentV2);

    public static native void stop();
}
