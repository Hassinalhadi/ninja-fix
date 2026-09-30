package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p {
    public static final long delta = TimeUnit.DAYS.toMillis(7);
    public final String alpha;
    public final String bravo;
    public final long charlie;

    public p(String str, long j5, String str2) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = j5;
    }

    public static String alpha(String str, long j5, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j5);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static p bravo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new p(jSONObject.getString("token"), jSONObject.getLong("timestamp"), jSONObject.getString("appVersion"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }
        return new p(str, 0L, null);
    }
}
