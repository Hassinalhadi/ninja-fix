package com.clevertap.android.sdk.inapp.evaluation;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"optTriggerOperator", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "Lorg/json/JSONObject;", Constants.KEY_KEY, "", "clevertap-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TriggerAdapterKt {
    @NotNull
    public static final TriggerOperator optTriggerOperator(@Nullable JSONObject jSONObject, @NotNull String key) {
        int operatorValue;
        Intrinsics.echo(key, "key");
        if (jSONObject != null) {
            operatorValue = jSONObject.optInt(key, TriggerOperator.Equals.getOperatorValue());
        } else {
            operatorValue = TriggerOperator.Equals.getOperatorValue();
        }
        return TriggerOperator.INSTANCE.fromOperatorValue(operatorValue);
    }
}
