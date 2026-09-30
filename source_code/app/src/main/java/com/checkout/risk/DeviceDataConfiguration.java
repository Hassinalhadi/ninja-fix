package com.checkout.risk;

import P8.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/checkout/risk/DeviceDataConfiguration;", "", "fingerprintIntegration", "Lcom/checkout/risk/FingerprintIntegration;", "(Lcom/checkout/risk/FingerprintIntegration;)V", "getFingerprintIntegration", "()Lcom/checkout/risk/FingerprintIntegration;", "component1", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeviceDataConfiguration {

    @c("fingerprint_integration")
    @NotNull
    private final FingerprintIntegration fingerprintIntegration;

    public DeviceDataConfiguration(@NotNull FingerprintIntegration fingerprintIntegration) {
        Intrinsics.echo(fingerprintIntegration, "fingerprintIntegration");
        this.fingerprintIntegration = fingerprintIntegration;
    }

    public static /* synthetic */ DeviceDataConfiguration copy$default(DeviceDataConfiguration deviceDataConfiguration, FingerprintIntegration fingerprintIntegration, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fingerprintIntegration = deviceDataConfiguration.fingerprintIntegration;
        }
        return deviceDataConfiguration.copy(fingerprintIntegration);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FingerprintIntegration getFingerprintIntegration() {
        return this.fingerprintIntegration;
    }

    @NotNull
    public final DeviceDataConfiguration copy(@NotNull FingerprintIntegration fingerprintIntegration) {
        Intrinsics.echo(fingerprintIntegration, "fingerprintIntegration");
        return new DeviceDataConfiguration(fingerprintIntegration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeviceDataConfiguration) && Intrinsics.areEqual(this.fingerprintIntegration, ((DeviceDataConfiguration) other).fingerprintIntegration);
    }

    @NotNull
    public final FingerprintIntegration getFingerprintIntegration() {
        return this.fingerprintIntegration;
    }

    public int hashCode() {
        return this.fingerprintIntegration.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceDataConfiguration(fingerprintIntegration=" + this.fingerprintIntegration + ')';
    }
}
