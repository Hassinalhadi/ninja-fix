package com.checkout.components.core.featuregate.guard;

import com.checkout.components.core.featuregate.FeatureGate;
import com.checkout.components.core.featuregate.feature.AnalyticsDisabledSessionFeature;
import com.checkout.components.core.featuregate.feature.AnalyticsDisabledStagingFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/checkout/components/core/featuregate/guard/AnalyticsDisabledGuard;", "", "", "disabled", "<init>", "(Z)V", "isDisabled", "()Z", "Companion", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnalyticsDisabledGuard {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4797a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/core/featuregate/guard/AnalyticsDisabledGuard$Companion;", "", "Lcom/checkout/components/core/featuregate/FeatureGate;", "featureGate", "Lcom/checkout/components/core/featuregate/guard/AnalyticsDisabledGuard;", "fromFeatureGate", "(Lcom/checkout/components/core/featuregate/FeatureGate;)Lcom/checkout/components/core/featuregate/guard/AnalyticsDisabledGuard;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final AnalyticsDisabledGuard fromFeatureGate(@NotNull FeatureGate featureGate) {
            boolean z2;
            Intrinsics.echo(featureGate, "featureGate");
            if (!featureGate.isEnabled(AnalyticsDisabledSessionFeature.INSTANCE) && !featureGate.isEnabled(AnalyticsDisabledStagingFeature.INSTANCE)) {
                z2 = false;
            } else {
                z2 = true;
            }
            return new AnalyticsDisabledGuard(z2);
        }
    }

    public AnalyticsDisabledGuard(boolean z2) {
        this.f4797a = z2;
    }

    /* renamed from: isDisabled, reason: from getter */
    public final boolean getF4797a() {
        return this.f4797a;
    }
}
