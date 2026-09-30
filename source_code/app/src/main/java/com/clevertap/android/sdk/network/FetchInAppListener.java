package com.clevertap.android.sdk.network;

import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.BaseCallbackManager;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.callbacks.FetchInAppsCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/clevertap/android/sdk/network/FetchInAppListener;", "Lcom/clevertap/android/sdk/network/BatchListener;", "callbackManager", "Lcom/clevertap/android/sdk/BaseCallbackManager;", "<init>", "(Lcom/clevertap/android/sdk/BaseCallbackManager;)V", "onBatchSent", "", "batch", "Lorg/json/JSONArray;", RedirectionConstants.REDIRECT_SUCCESS_VALUE, "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class FetchInAppListener implements BatchListener {

    @NotNull
    private final BaseCallbackManager callbackManager;

    public FetchInAppListener(@NotNull BaseCallbackManager callbackManager) {
        Intrinsics.echo(callbackManager, "callbackManager");
        this.callbackManager = callbackManager;
    }

    @Override // com.clevertap.android.sdk.network.BatchListener
    public void onBatchSent(@NotNull JSONArray batch, boolean success) {
        Intrinsics.echo(batch, "batch");
        if (batch.length() == 0) {
            FetchInAppsCallback fetchInAppsCallback = this.callbackManager.getFetchInAppsCallback();
            if (fetchInAppsCallback != null) {
                fetchInAppsCallback.onInAppsFetched(success);
                return;
            }
            return;
        }
        int length = batch.length();
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject optJSONObject = batch.optJSONObject(i4);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(Constants.KEY_EVT_DATA);
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            if (Intrinsics.areEqual(optJSONObject.optString(Constants.KEY_EVT_NAME), Constants.WZRK_FETCH) && optJSONObject2.optInt("t") == 5) {
                FetchInAppsCallback fetchInAppsCallback2 = this.callbackManager.getFetchInAppsCallback();
                if (fetchInAppsCallback2 != null) {
                    fetchInAppsCallback2.onInAppsFetched(success);
                    return;
                }
                return;
            }
        }
    }
}
