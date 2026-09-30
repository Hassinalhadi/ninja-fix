package com.clevertap.android.sdk.pushnotification.fcm;

import B7.g;
import G6.e;
import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.ManifestInfo;
import com.clevertap.android.sdk.pushnotification.CTPushProviderListener;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import com.clevertap.android.sdk.pushnotification.PushType;
import com.clevertap.android.sdk.utils.PackageUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes3.dex */
public class FcmSdkHandlerImpl implements IFcmSdkHandler {
    private final CleverTapInstanceConfig config;
    private final Context context;
    private final CTPushProviderListener listener;
    private ManifestInfo manifestInfo;

    public FcmSdkHandlerImpl(CTPushProviderListener cTPushProviderListener, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.listener = cTPushProviderListener;
        this.manifestInfo = ManifestInfo.getInstance(context);
    }

    @Override // com.clevertap.android.sdk.pushnotification.fcm.IFcmSdkHandler
    public PushType getPushType() {
        return PushConstants.FCM;
    }

    public String getSenderId() {
        g charlie = g.charlie();
        charlie.alpha();
        return charlie.charlie.echo;
    }

    @Override // com.clevertap.android.sdk.pushnotification.fcm.IFcmSdkHandler
    public boolean isAvailable() {
        try {
            if (!PackageUtils.isGooglePlayServicesAvailable(this.context)) {
                this.config.log(PushConstants.LOG_TAG, "FCMGoogle Play services is currently unavailable.");
                return false;
            }
            if (TextUtils.isEmpty(getSenderId())) {
                this.config.log(PushConstants.LOG_TAG, "FCMThe FCM sender ID is not set. Unable to register for FCM.");
                return false;
            }
            return true;
        } catch (Throwable th) {
            this.config.log(PushConstants.LOG_TAG, "FCMUnable to register with FCM.", th);
            return false;
        }
    }

    @Override // com.clevertap.android.sdk.pushnotification.fcm.IFcmSdkHandler
    public boolean isSupported() {
        return PackageUtils.isGooglePlayStoreAvailable(this.context);
    }

    @Override // com.clevertap.android.sdk.pushnotification.fcm.IFcmSdkHandler
    public void requestToken() {
        try {
            this.config.log(PushConstants.LOG_TAG, "FCMRequesting FCM token using googleservices.json");
            FirebaseMessaging.charlie().echo().bravo(new e() { // from class: com.clevertap.android.sdk.pushnotification.fcm.FcmSdkHandlerImpl.1
                @Override // G6.e
                public void onComplete(Task task) {
                    String str = null;
                    if (!task.juliet()) {
                        FcmSdkHandlerImpl.this.config.log(PushConstants.LOG_TAG, "FCMFCM token using googleservices.json failed", task.golf());
                        FcmSdkHandlerImpl.this.listener.onNewToken(null, FcmSdkHandlerImpl.this.getPushType());
                        return;
                    }
                    if (task.hotel() != null) {
                        str = (String) task.hotel();
                    }
                    FcmSdkHandlerImpl.this.config.log(PushConstants.LOG_TAG, "FCMFCM token using googleservices.json - " + str);
                    FcmSdkHandlerImpl.this.listener.onNewToken(str, FcmSdkHandlerImpl.this.getPushType());
                }
            });
        } catch (Throwable th) {
            this.config.log(PushConstants.LOG_TAG, "FCMError requesting FCM token", th);
            this.listener.onNewToken(null, getPushType());
        }
    }

    public void setManifestInfo(ManifestInfo manifestInfo) {
        this.manifestInfo = manifestInfo;
    }
}
