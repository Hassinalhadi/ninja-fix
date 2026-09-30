package com.clevertap.android.sdk;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface GeofenceCallback {
    void handleGeoFences(JSONObject jSONObject);

    void triggerLocation();
}
