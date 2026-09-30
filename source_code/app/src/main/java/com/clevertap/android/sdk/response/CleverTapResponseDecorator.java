package com.clevertap.android.sdk.response;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes3.dex */
abstract class CleverTapResponseDecorator extends CleverTapResponse {
    @Override // com.clevertap.android.sdk.response.CleverTapResponse
    public abstract void processResponse(JSONObject jSONObject, String str, Context context);
}
