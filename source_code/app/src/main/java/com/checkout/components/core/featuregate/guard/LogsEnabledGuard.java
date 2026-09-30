package com.checkout.components.core.featuregate.guard;

import com.checkout.components.core.featuregate.FeatureGate;
import com.checkout.components.core.featuregate.feature.ForceLogsEnabled;
import com.checkout.components.core.featuregate.feature.LogsEnabled;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/checkout/components/core/featuregate/guard/LogsEnabledGuard;", "", "", "logsEnabledFromSession", "forceLogsEnabledFromSession", "<init>", "(ZZ)V", "isEnabled", "()Z", "Companion", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogsEnabledGuard {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4801a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4802b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/core/featuregate/guard/LogsEnabledGuard$Companion;", "", "Lcom/checkout/components/core/featuregate/FeatureGate;", "featureGate", "Lcom/checkout/components/core/featuregate/guard/LogsEnabledGuard;", "fromFeatureGate", "(Lcom/checkout/components/core/featuregate/FeatureGate;)Lcom/checkout/components/core/featuregate/guard/LogsEnabledGuard;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final LogsEnabledGuard fromFeatureGate(@NotNull FeatureGate featureGate) {
            Intrinsics.echo(featureGate, "featureGate");
            return new LogsEnabledGuard(featureGate.isEnabled(LogsEnabled.INSTANCE), featureGate.isEnabled(ForceLogsEnabled.INSTANCE));
        }
    }

    public LogsEnabledGuard(boolean z2, boolean z10) {
        this.f4801a = z2;
        this.f4802b = z10;
    }

    public final boolean isEnabled() {
        if (!this.f4801a && !this.f4802b) {
            return false;
        }
        return true;
    }
}
