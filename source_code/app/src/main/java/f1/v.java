package f1;

import android.app.Notification;
import android.content.Context;

/* loaded from: classes3.dex */
public abstract class v {
    public static Notification.Builder alpha(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static void bravo(Notification.Builder builder, int i4) {
        builder.setBadgeIconType(i4);
    }

    public static void charlie(Notification.Builder builder, boolean z2) {
        builder.setColorized(z2);
    }

    public static void delta(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void echo(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void foxtrot(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void golf(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }
}
