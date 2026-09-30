package com.checkout.risk;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/checkout/risk/RiskSDKInternalConfig;", "", "deviceDataEndpoint", "", "getDeviceDataEndpoint", "()Ljava/lang/String;", "environment", "Lcom/checkout/risk/RiskEnvironment;", "getEnvironment", "()Lcom/checkout/risk/RiskEnvironment;", "fingerprintEndpoint", "getFingerprintEndpoint", "framesOptions", "Lcom/checkout/risk/FramesOptions;", "getFramesOptions", "()Lcom/checkout/risk/FramesOptions;", "integrationType", "Lcom/checkout/risk/RiskIntegrationType;", "getIntegrationType", "()Lcom/checkout/risk/RiskIntegrationType;", "merchantPublicKey", "getMerchantPublicKey", "sourceType", "Lcom/checkout/risk/SourceType;", "getSourceType", "()Lcom/checkout/risk/SourceType;", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RiskSDKInternalConfig {
    @NotNull
    String getDeviceDataEndpoint();

    @NotNull
    RiskEnvironment getEnvironment();

    @NotNull
    String getFingerprintEndpoint();

    @Nullable
    FramesOptions getFramesOptions();

    @NotNull
    RiskIntegrationType getIntegrationType();

    @NotNull
    String getMerchantPublicKey();

    @NotNull
    SourceType getSourceType();
}
