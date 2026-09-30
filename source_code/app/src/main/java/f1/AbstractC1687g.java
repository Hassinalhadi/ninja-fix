package f1;

import android.app.Notification;
import android.content.Context;

/* renamed from: f1.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1687g {
    public static String alpha(Context context) {
        return context.getOpPackageName();
    }

    public static void bravo(Notification.Builder builder, boolean z2) {
        builder.setAllowSystemGeneratedContextualActions(z2);
    }

    public static void charlie(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void delta(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
