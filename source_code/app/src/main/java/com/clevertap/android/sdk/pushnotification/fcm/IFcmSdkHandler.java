package com.clevertap.android.sdk.pushnotification.fcm;

import com.clevertap.android.sdk.pushnotification.PushType;

/* loaded from: classes3.dex */
public interface IFcmSdkHandler {
    PushType getPushType();

    boolean isAvailable();

    boolean isSupported();

    void requestToken();
}
