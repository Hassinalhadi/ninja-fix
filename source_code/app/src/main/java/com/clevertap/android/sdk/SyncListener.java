package com.clevertap.android.sdk;

import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public interface SyncListener {
    void profileDataUpdated(JSONObject jSONObject);

    void profileDidInitialize(String str);
}
