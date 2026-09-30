package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.inapp.InAppNotificationInflater;
import kotlin.Metadata;
import kotlin.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class InAppController$prepareNotificationForDisplay$1 implements InAppNotificationInflater.InAppNotificationReadyListener, f {
    final /* synthetic */ InAppController $tmp0;

    public InAppController$prepareNotificationForDisplay$1(InAppController inAppController) {
        this.$tmp0 = inAppController;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InAppNotificationInflater.InAppNotificationReadyListener) && (obj instanceof f)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f
    public final e getFunctionDelegate() {
        return new h(1, 0, InAppController.class, this.$tmp0, "notificationReady", "notificationReady(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.clevertap.android.sdk.inapp.InAppNotificationInflater.InAppNotificationReadyListener
    public final void onNotificationReady(CTInAppNotification p02) {
        Intrinsics.echo(p02, "p0");
        this.$tmp0.notificationReady(p02);
    }
}
