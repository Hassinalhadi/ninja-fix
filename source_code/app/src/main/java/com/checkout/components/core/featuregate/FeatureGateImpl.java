package com.checkout.components.core.featuregate;

import com.checkout.components.core.featuregate.feature.Experiment;
import com.checkout.components.core.featuregate.feature.Feature;
import com.checkout.components.core.featuregate.feature.FeatureGateCatalog;
import com.checkout.components.core.featuregate.feature.SessionFeature;
import com.checkout.components.core.featuregate.feature.StagingFeature;
import com.checkout.components.core.staging.StagingKeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00190\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/core/featuregate/FeatureGateImpl;", "Lcom/checkout/components/core/featuregate/FeatureGate;", "Lcom/checkout/components/core/featuregate/SessionFlagWriter;", "<init>", "()V", "Lcom/checkout/components/core/featuregate/feature/Feature;", "feature", "", "isEnabled", "(Lcom/checkout/components/core/featuregate/feature/Feature;)Z", "", "", "featureFlags", "", "experiments", "", "applySessionData", "(Ljava/util/List;Ljava/util/Map;)V", "Lcom/checkout/components/core/featuregate/feature/SessionFeature;", "getSessionFeatures", "()Ljava/util/List;", "sessionFeatures", "Lcom/checkout/components/core/featuregate/feature/StagingFeature;", "getStagingFeatures", "stagingFeatures", "Lcom/checkout/components/core/featuregate/feature/Experiment;", "getExperiments", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureGateImpl implements FeatureGate, SessionFlagWriter {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private volatile List f4792a = CollectionsKt.emptyList();

    /* renamed from: b, reason: collision with root package name */
    private volatile List f4793b = CollectionsKt.emptyList();

    @Override // com.checkout.components.core.featuregate.SessionFlagWriter
    public final void applySessionData(@Nullable List<String> featureFlags, @Nullable Map<String, String> experiments) {
        Set set;
        if (featureFlags != null) {
            set = CollectionsKt.D(featureFlags);
        } else {
            set = null;
        }
        if (set == null) {
            set = u.alpha;
        }
        if (experiments == null) {
            experiments = t.alpha;
        }
        List<SessionFeature> sessionFeatures = FeatureGateCatalog.INSTANCE.getSessionFeatures();
        ArrayList arrayList = new ArrayList();
        for (Object obj : sessionFeatures) {
            if (set.contains(((SessionFeature) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        this.f4792a = arrayList;
        List<Experiment> experiments2 = FeatureGateCatalog.INSTANCE.getExperiments();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : experiments2) {
            if (Intrinsics.areEqual(experiments.get(((Experiment) obj2).getKey()), "treatment_1")) {
                arrayList2.add(obj2);
            }
        }
        this.f4793b = arrayList2;
    }

    @Override // com.checkout.components.core.featuregate.FeatureGate
    @NotNull
    public final List<Experiment> getExperiments() {
        return CollectionsKt.z(this.f4793b);
    }

    @Override // com.checkout.components.core.featuregate.FeatureGate
    @NotNull
    public final List<SessionFeature> getSessionFeatures() {
        return CollectionsKt.z(this.f4792a);
    }

    @Override // com.checkout.components.core.featuregate.FeatureGate
    @NotNull
    public final List<StagingFeature> getStagingFeatures() {
        StagingKeyStore.INSTANCE.getClass();
        Set D10 = CollectionsKt.D(CollectionsKt.emptyList());
        List<StagingFeature> stagingFeatures = FeatureGateCatalog.INSTANCE.getStagingFeatures();
        ArrayList arrayList = new ArrayList();
        for (Object obj : stagingFeatures) {
            if (D10.contains(((StagingFeature) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.checkout.components.core.featuregate.FeatureGate
    public final boolean isEnabled(@NotNull Feature feature) {
        Intrinsics.echo(feature, "feature");
        if (feature instanceof SessionFeature) {
            return this.f4792a.contains(feature);
        }
        if (feature instanceof StagingFeature) {
            if (FeatureGateCatalog.INSTANCE.getStagingFeatures().contains(feature)) {
                StagingKeyStore.INSTANCE.getClass();
                if (CollectionsKt.emptyList().contains(feature.getKey())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (feature instanceof Experiment) {
            return this.f4793b.contains(feature);
        }
        throw new NoWhenBranchMatchedException();
    }
}
