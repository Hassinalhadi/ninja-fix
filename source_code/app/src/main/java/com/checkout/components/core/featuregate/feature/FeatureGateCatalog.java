package com.checkout.components.core.featuregate.feature;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/core/featuregate/feature/FeatureGateCatalog;", "", "", "Lcom/checkout/components/core/featuregate/feature/SessionFeature;", "a", "Ljava/util/List;", "getSessionFeatures", "()Ljava/util/List;", "sessionFeatures", "Lcom/checkout/components/core/featuregate/feature/StagingFeature;", "b", "getStagingFeatures", "stagingFeatures", "Lcom/checkout/components/core/featuregate/feature/Experiment;", "c", "getExperiments", "experiments", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureGateCatalog {

    @NotNull
    public static final FeatureGateCatalog INSTANCE = new FeatureGateCatalog();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final List sessionFeatures = CollectionsKt.listOf(LogsEnabled.INSTANCE, ForceLogsEnabled.INSTANCE, AnalyticsDisabledSessionFeature.INSTANCE, DisableForwardingEmailsSessionFeature.INSTANCE, EnableJaywanSchemeSessionFeature.INSTANCE);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List stagingFeatures = CollectionsKt.listOf(EnableCustomTabs.INSTANCE, AnalyticsDisabledStagingFeature.INSTANCE, DisableForwardingEmailsStagingFeature.INSTANCE, EnableJaywanSchemeStagingFeature.INSTANCE);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final List experiments = ab.juliet(LoadDeeplinksToInAppBrowser.INSTANCE);
    public static final int $stable = 8;

    private FeatureGateCatalog() {
    }

    @NotNull
    public final List<Experiment> getExperiments() {
        return experiments;
    }

    @NotNull
    public final List<SessionFeature> getSessionFeatures() {
        return sessionFeatures;
    }

    @NotNull
    public final List<StagingFeature> getStagingFeatures() {
        return stagingFeatures;
    }
}
