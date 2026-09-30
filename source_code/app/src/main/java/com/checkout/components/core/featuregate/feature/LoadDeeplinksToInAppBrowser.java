package com.checkout.components.core.featuregate.feature;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/checkout/components/core/featuregate/feature/LoadDeeplinksToInAppBrowser;", "Lcom/checkout/components/core/featuregate/feature/Experiment;", "", Constants.KEY_KEY, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "variation", "getVariation", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoadDeeplinksToInAppBrowser implements Experiment {
    public static final int $stable = 0;

    @NotNull
    public static final LoadDeeplinksToInAppBrowser INSTANCE = new LoadDeeplinksToInAppBrowser();

    private LoadDeeplinksToInAppBrowser() {
    }

    @Override // com.checkout.components.core.featuregate.feature.Feature
    @NotNull
    public final String getKey() {
        return "exp_load_deeplinks_to_in_app_browser";
    }

    @Override // com.checkout.components.core.featuregate.feature.Experiment
    @NotNull
    public final String getVariation() {
        return "treatment_1";
    }
}
