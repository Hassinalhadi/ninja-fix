package com.clevertap.android.sdk.pushnotification;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import f1.s;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public interface INotificationRenderer {
    String getActionButtonIconKey();

    Object getCollapseKey(Bundle bundle);

    String getMessage(Bundle bundle);

    String getTitle(Bundle bundle, Context context);

    s renderNotification(Bundle bundle, Context context, s sVar, CleverTapInstanceConfig cleverTapInstanceConfig, int i4);

    s setActionButtons(Context context, Bundle bundle, int i4, s sVar, JSONArray jSONArray);

    void setSmallIcon(int i4, Context context);
}
