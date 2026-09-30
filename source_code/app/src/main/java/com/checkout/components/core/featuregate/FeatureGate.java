package com.checkout.components.core.featuregate;

import com.checkout.components.core.featuregate.feature.Experiment;
import com.checkout.components.core.featuregate.feature.Feature;
import com.checkout.components.core.featuregate.feature.SessionFeature;
import com.checkout.components.core.featuregate.feature.StagingFeature;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/checkout/components/core/featuregate/FeatureGate;", "", "sessionFeatures", "", "Lcom/checkout/components/core/featuregate/feature/SessionFeature;", "getSessionFeatures", "()Ljava/util/List;", "stagingFeatures", "Lcom/checkout/components/core/featuregate/feature/StagingFeature;", "getStagingFeatures", "experiments", "Lcom/checkout/components/core/featuregate/feature/Experiment;", "getExperiments", "isEnabled", "", "feature", "Lcom/checkout/components/core/featuregate/feature/Feature;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FeatureGate {
    @NotNull
    List<Experiment> getExperiments();

    @NotNull
    List<SessionFeature> getSessionFeatures();

    @NotNull
    List<StagingFeature> getStagingFeatures();

    boolean isEnabled(@NotNull Feature feature);
}
