package com.clevertap.android.sdk.pushnotification;

import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class NotificationInfo {
    public final boolean fromCleverTap;
    public final boolean shouldRender;

    public NotificationInfo(boolean z2, boolean z10) {
        this.fromCleverTap = z2;
        this.shouldRender = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationInfo{fromCleverTap=");
        sb2.append(this.fromCleverTap);
        sb2.append(", shouldRender=");
        return P0.gray(sb2, this.shouldRender, '}');
    }
}
