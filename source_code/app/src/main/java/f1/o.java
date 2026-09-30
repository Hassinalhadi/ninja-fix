package f1;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* loaded from: classes3.dex */
public abstract class o {
    public static void alpha(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void bravo(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void charlie(Notification.BigPictureStyle bigPictureStyle, boolean z2) {
        bigPictureStyle.showBigPictureWhenCollapsed(z2);
    }
}
