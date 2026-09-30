package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0003H&J\u001a\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0003H&J6\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\u0014"}, d2 = {"Lcom/clevertap/android/sdk/inapp/InAppListener;", "", "inAppNotificationDidClick", "Landroid/os/Bundle;", "inAppNotification", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "button", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "activityContext", "Landroid/content/Context;", "inAppNotificationDidDismiss", "", "formData", "inAppNotificationDidShow", "inAppNotificationActionTriggered", Constants.KEY_ACTION, "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "callToAction", "", "additionalData", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InAppListener {
    @Nullable
    Bundle inAppNotificationActionTriggered(@NotNull CTInAppNotification inAppNotification, @NotNull CTInAppAction action, @NotNull String callToAction, @Nullable Bundle additionalData, @Nullable Context activityContext);

    @Nullable
    Bundle inAppNotificationDidClick(@NotNull CTInAppNotification inAppNotification, @NotNull CTInAppNotificationButton button, @Nullable Context activityContext);

    void inAppNotificationDidDismiss(@NotNull CTInAppNotification inAppNotification, @Nullable Bundle formData);

    void inAppNotificationDidShow(@NotNull CTInAppNotification inAppNotification, @Nullable Bundle formData);
}
