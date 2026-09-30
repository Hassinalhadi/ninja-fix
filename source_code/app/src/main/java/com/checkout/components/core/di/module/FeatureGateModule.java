package com.checkout.components.core.di.module;

import com.checkout.components.core.featuregate.FeatureGateImpl;
import com.checkout.components.core.featuregate.SessionFlagWriter;
import com.checkout.components.core.featuregate.guard.AnalyticsDisabledGuard;
import com.checkout.components.core.featuregate.guard.CustomTabsEnabledGuard;
import com.checkout.components.core.featuregate.guard.ForwardingEmailsDisabledGuard;
import com.checkout.components.core.featuregate.guard.JaywanSchemeEnabledGuard;
import com.checkout.components.core.featuregate.guard.LogsEnabledGuard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/core/di/module/FeatureGateModule;", "", "<init>", "()V", "provideSessionFlagWriter", "Lcom/checkout/components/core/featuregate/SessionFlagWriter;", "gate", "Lcom/checkout/components/core/featuregate/FeatureGateImpl;", "provideLogsEnabledGuard", "Lcom/checkout/components/core/featuregate/guard/LogsEnabledGuard;", "provideCustomTabsEnabledGuard", "Lcom/checkout/components/core/featuregate/guard/CustomTabsEnabledGuard;", "provideAnalyticsDisabledGuard", "Lcom/checkout/components/core/featuregate/guard/AnalyticsDisabledGuard;", "provideForwardingEmailsDisabledGuard", "Lcom/checkout/components/core/featuregate/guard/ForwardingEmailsDisabledGuard;", "provideJaywanSchemeEnabledGuard", "Lcom/checkout/components/core/featuregate/guard/JaywanSchemeEnabledGuard;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureGateModule {
    public static final int $stable = 0;

    @NotNull
    public final AnalyticsDisabledGuard provideAnalyticsDisabledGuard(@NotNull FeatureGateImpl gate) {
        Intrinsics.echo(gate, "gate");
        return AnalyticsDisabledGuard.INSTANCE.fromFeatureGate(gate);
    }

    @NotNull
    public final CustomTabsEnabledGuard provideCustomTabsEnabledGuard(@NotNull FeatureGateImpl gate) {
        Intrinsics.echo(gate, "gate");
        return CustomTabsEnabledGuard.INSTANCE.fromFeatureGate(gate);
    }

    @NotNull
    public final ForwardingEmailsDisabledGuard provideForwardingEmailsDisabledGuard(@NotNull FeatureGateImpl gate) {
        Intrinsics.echo(gate, "gate");
        return ForwardingEmailsDisabledGuard.INSTANCE.fromFeatureGate(gate);
    }

    @NotNull
    public final JaywanSchemeEnabledGuard provideJaywanSchemeEnabledGuard(@NotNull FeatureGateImpl gate) {
        Intrinsics.echo(gate, "gate");
        return JaywanSchemeEnabledGuard.INSTANCE.fromFeatureGate(gate);
    }

    @NotNull
    public final LogsEnabledGuard provideLogsEnabledGuard(@NotNull FeatureGateImpl gate) {
        Intrinsics.echo(gate, "gate");
        return LogsEnabledGuard.INSTANCE.fromFeatureGate(gate);
    }

    @NotNull
    public final SessionFlagWriter provideSessionFlagWriter(@NotNull FeatureGateImpl gate) {
        Intrinsics.echo(gate, "gate");
        return gate;
    }
}
