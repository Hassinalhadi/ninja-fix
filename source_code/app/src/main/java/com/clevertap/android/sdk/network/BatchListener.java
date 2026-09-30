package com.clevertap.android.sdk.network;

import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/network/BatchListener;", "", "onBatchSent", "", "batch", "Lorg/json/JSONArray;", RedirectionConstants.REDIRECT_SUCCESS_VALUE, "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BatchListener {
    void onBatchSent(@NotNull JSONArray batch, boolean success);
}
