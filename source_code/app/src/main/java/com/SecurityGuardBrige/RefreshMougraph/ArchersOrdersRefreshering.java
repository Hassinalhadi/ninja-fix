package com.SecurityGuardBrige.RefreshMougraph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class ArchersOrdersRefreshering {
    public static Handler handler;
    public static boolean isRunning;
    public static long lastToastAt;
    public static Runnable refreshRunnable;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(58, ArchersOrdersRefreshering.class);
        Hidden0.special_clinit_58_00(ArchersOrdersRefreshering.class);
    }

    public static native void bind(Activity activity, Dialog dialog, SharedPreferences sharedPreferences);

    public static native int clampInterval(int i4);

    public static native SwipeRefreshLayout findSwipe(View view);

    public static native void maybeShowMinuteToast(Context context, int i4);

    public static native void showLoadingIfAny(Activity activity);

    public static native void start(Activity activity);

    public static native void stop();
}
