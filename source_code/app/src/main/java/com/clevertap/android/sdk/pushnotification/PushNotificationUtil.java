package com.clevertap.android.sdk.pushnotification;

import android.os.Bundle;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class PushNotificationUtil {
    private PushNotificationUtil() {
    }

    public static String buildPushNotificationRenderedListenerKey(String str, String str2) {
        return ad.amber(str, "_", str2);
    }

    public static String getAccountIdFromNotificationBundle(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        return bundle.getString(Constants.WZRK_ACCT_ID_KEY, "");
    }

    public static ArrayList<PushType> getDefaultPushTypes() {
        ArrayList<PushType> arrayList = new ArrayList<>();
        arrayList.add(PushConstants.FCM);
        return arrayList;
    }

    public static String getPushIdFromNotificationBundle(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        return bundle.getString(Constants.WZRK_PUSH_ID, "");
    }
}
