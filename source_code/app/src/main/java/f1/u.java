package f1;

import android.app.Notification;
import android.app.NotificationManager;

/* loaded from: classes3.dex */
public abstract class u {
    public static boolean alpha(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static void bravo(Notification.Action.Builder builder, boolean z2) {
        builder.setAllowGeneratedReplies(z2);
    }

    public static void charlie(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
