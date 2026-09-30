package com.clevertap.android.sdk.pushnotification;

import android.content.Context;
import android.os.Bundle;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.interfaces.ActionButtonClickHandler;
import com.clevertap.android.sdk.interfaces.NotificationHandler;

/* loaded from: classes3.dex */
public class PushNotificationHandler implements ActionButtonClickHandler {

    /* loaded from: classes3.dex */
    public static class SingletonNotificationHandler {
        private static final PushNotificationHandler INSTANCE = new PushNotificationHandler();

        private SingletonNotificationHandler() {
        }
    }

    public static NotificationHandler getPushNotificationHandler() {
        return SingletonNotificationHandler.INSTANCE;
    }

    public static boolean isForPushTemplates(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("pt_id");
        if (ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO.equals(string) || string == null || string.isEmpty()) {
            return false;
        }
        return true;
    }

    private boolean isForSignedCall(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "signedcall".equals(bundle.getString("source"));
    }

    @Override // com.clevertap.android.sdk.interfaces.ActionButtonClickHandler
    public boolean onActionButtonClick(Context context, Bundle bundle, int i4) {
        return false;
    }

    @Override // com.clevertap.android.sdk.interfaces.NotificationHandler
    public synchronized boolean onMessageReceived(Context context, Bundle bundle, String str) {
        try {
            bundle.putLong(Constants.OMR_INVOKE_TIME_IN_MILLIS, System.currentTimeMillis());
            CleverTapAPI globalInstance = CleverTapAPI.getGlobalInstance(context, PushNotificationUtil.getAccountIdFromNotificationBundle(bundle));
            if (CleverTapAPI.getNotificationInfo(bundle).fromCleverTap) {
                if (globalInstance != null) {
                    globalInstance.getCoreState().getConfig().log(PushConstants.LOG_TAG, str + "received notification from CleverTap: " + bundle.toString());
                    if (isForPushTemplates(bundle) && CleverTapAPI.getNotificationHandler() != null) {
                        CleverTapAPI.getNotificationHandler().onMessageReceived(context, bundle, str);
                    } else if (isForSignedCall(bundle) && CleverTapAPI.getSignedCallNotificationHandler() != null) {
                        CleverTapAPI.getSignedCallNotificationHandler().onMessageReceived(context, bundle, str);
                    } else {
                        globalInstance.renderPushNotificationOnCallerThread(new CoreNotificationRenderer(), context, bundle);
                    }
                } else {
                    Logger.d(PushConstants.LOG_TAG, str + "received notification from CleverTap: " + bundle.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(" not renderning since cleverTapAPI is null");
                    Logger.d(PushConstants.LOG_TAG, sb2.toString());
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.clevertap.android.sdk.interfaces.NotificationHandler
    public boolean onNewToken(Context context, String str, PushType pushType) {
        CleverTapAPI.tokenRefresh(context, str, pushType);
        return true;
    }

    private PushNotificationHandler() {
    }
}
