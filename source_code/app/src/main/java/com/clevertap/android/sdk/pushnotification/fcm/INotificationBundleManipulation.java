package com.clevertap.android.sdk.pushnotification.fcm;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/pushnotification/fcm/INotificationBundleManipulation;", "T", "", "addPriority", Constants.KEY_MESSAGE, "(Ljava/lang/Object;)Lcom/clevertap/android/sdk/pushnotification/fcm/INotificationBundleManipulation;", "build", "Landroid/os/Bundle;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface INotificationBundleManipulation<T> {
    @NotNull
    INotificationBundleManipulation<T> addPriority(T message);

    @NotNull
    Bundle build();
}
