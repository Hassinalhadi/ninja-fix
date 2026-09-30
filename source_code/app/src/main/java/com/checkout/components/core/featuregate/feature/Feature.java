package com.checkout.components.core.featuregate.feature;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\u0006\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/core/featuregate/feature/Feature;", "", Constants.KEY_KEY, "", "getKey", "()Ljava/lang/String;", "Lcom/checkout/components/core/featuregate/feature/Experiment;", "Lcom/checkout/components/core/featuregate/feature/SessionFeature;", "Lcom/checkout/components/core/featuregate/feature/StagingFeature;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Feature {
    @NotNull
    String getKey();
}
