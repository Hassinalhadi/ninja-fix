package androidx.camera.camera2.internal.compat;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel charlie(int i4, CharSequence charSequence, String str) {
        return new NotificationChannel(str, charSequence, i4);
    }

    public static /* synthetic */ NotificationChannel foxtrot(String str) {
        return new NotificationChannel(Constants.FCM_FALLBACK_NOTIFICATION_CHANNEL_ID, str, 3);
    }

    public static /* synthetic */ NotificationChannelGroup golf(CharSequence charSequence, String str) {
        return new NotificationChannelGroup(str, charSequence);
    }

    public static /* synthetic */ void lima() {
    }
}
