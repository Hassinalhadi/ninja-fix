package com.SecurityGuardBrige.SmoothFluttersMograph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.content.Context;
import cb.C0838c;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public final class StandaloneDelivery2 {
    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(112, StandaloneDelivery2.class);
        Hidden0.special_clinit_112_00(StandaloneDelivery2.class);
    }

    public static native C0838c buildData(Context context, Order order, OrderTask orderTask, C0838c c0838c);

    private static native OrderTask findPickupTask(Order order);

    public static native boolean isEnabled(Context context, OrderTask orderTask);

    public static native void openNavigation(Context context, OrderTask orderTask);

    public static native void openWhatsApp(Context context, OrderTask orderTask);
}
