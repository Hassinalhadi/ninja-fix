package com.clevertap.android.sdk;

import android.os.Bundle;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/AnalyticsManagerBundler;", "", "<init>", "()V", "wzrkBundleToJson", "Lorg/json/JSONObject;", "root", "Landroid/os/Bundle;", "notificationViewedJson", "notificationClickedJson", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnalyticsManagerBundler {

    @NotNull
    public static final AnalyticsManagerBundler INSTANCE = new AnalyticsManagerBundler();

    private AnalyticsManagerBundler() {
    }

    @NotNull
    public static final JSONObject notificationClickedJson(@NotNull Bundle root) {
        Intrinsics.echo(root, "root");
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject wzrkBundleToJson = wzrkBundleToJson(root);
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_CLICKED_EVENT_NAME);
            jSONObject.put(Constants.KEY_EVT_DATA, wzrkBundleToJson);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @NotNull
    public static final JSONObject notificationViewedJson(@NotNull Bundle root) {
        Intrinsics.echo(root, "root");
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject wzrkBundleToJson = wzrkBundleToJson(root);
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_VIEWED_EVENT_NAME);
            jSONObject.put(Constants.KEY_EVT_DATA, wzrkBundleToJson);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @NotNull
    public static final JSONObject wzrkBundleToJson(@NotNull Bundle root) throws JSONException {
        Intrinsics.echo(root, "root");
        JSONObject jSONObject = new JSONObject();
        for (String str : root.keySet()) {
            Object obj = root.get(str);
            if (obj instanceof Bundle) {
                JSONObject wzrkBundleToJson = wzrkBundleToJson((Bundle) obj);
                Iterator<String> keys = wzrkBundleToJson.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, wzrkBundleToJson.get(next));
                }
            } else {
                Intrinsics.checkNotNull(str);
                if (kotlin.text.r.quebec(str, Constants.WZRK_PREFIX, false)) {
                    jSONObject.put(str, root.get(str));
                }
            }
        }
        return jSONObject;
    }
}
