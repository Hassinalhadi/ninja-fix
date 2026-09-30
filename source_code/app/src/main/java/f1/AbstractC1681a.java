package f1;

import android.app.Activity;
import android.app.Notification;
import android.view.View;
import delivery.samurai.android.R;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1681a {
    public static View alpha(Activity activity) {
        return activity.requireViewById(R.id.nav_host_fragment);
    }

    public static void bravo(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }
}
