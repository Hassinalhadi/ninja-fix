package com.clevertap.android.sdk.pushnotification;

/* loaded from: classes3.dex */
public interface CTPushProvider {
    PushType getPushType();

    boolean isAvailable();

    boolean isSupported();

    int minSDKSupportVersionCode();

    void requestToken();
}
