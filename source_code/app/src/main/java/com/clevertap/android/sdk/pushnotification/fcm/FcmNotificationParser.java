package com.clevertap.android.sdk.pushnotification.fcm;

import android.os.Bundle;
import bv.e;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.interfaces.INotificationParser;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;

/* loaded from: classes3.dex */
class FcmNotificationParser implements INotificationParser<RemoteMessage> {
    @Override // com.clevertap.android.sdk.interfaces.INotificationParser
    public Bundle toBundle(RemoteMessage remoteMessage) {
        try {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : ((e) remoteMessage.o()).entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            Logger.d(PushConstants.LOG_TAG, "FCMFound Valid Notification Message ");
            return bundle;
        } catch (Throwable th) {
            th.printStackTrace();
            Logger.d(PushConstants.LOG_TAG, "FCMInvalid Notification Message ", th);
            return null;
        }
    }
}
