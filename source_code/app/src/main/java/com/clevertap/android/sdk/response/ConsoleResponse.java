package com.clevertap.android.sdk.response;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ConsoleResponse extends CleverTapResponseDecorator {
    private final CleverTapInstanceConfig config;
    private final Logger logger;

    public ConsoleResponse(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.config = cleverTapInstanceConfig;
        this.logger = cleverTapInstanceConfig.getLogger();
    }

    @Override // com.clevertap.android.sdk.response.CleverTapResponseDecorator, com.clevertap.android.sdk.response.CleverTapResponse
    public void processResponse(JSONObject jSONObject, String str, Context context) {
        int i4;
        try {
            if (jSONObject.has("console")) {
                JSONArray jSONArray = (JSONArray) jSONObject.get("console");
                if (jSONArray.length() > 0) {
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        this.logger.debug(this.config.getAccountId(), jSONArray.get(i5).toString());
                    }
                }
            }
        } catch (Throwable unused) {
        }
        try {
            if (jSONObject.has("dbg_lvl") && (i4 = jSONObject.getInt("dbg_lvl")) >= 0) {
                CleverTapAPI.setDebugLevel(i4);
                this.logger.verbose(this.config.getAccountId(), "Set debug level to " + i4 + " for this session (set by upstream)");
            }
        } catch (Throwable unused2) {
        }
    }
}
