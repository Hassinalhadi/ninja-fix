package com.checkout.risk;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0013\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lcom/checkout/risk/RiskSDKInternalConfigImpl;", "Lcom/checkout/risk/RiskSDKInternalConfig;", com.clevertap.android.sdk.Constants.KEY_CONFIG, "Lcom/checkout/risk/RiskConfig;", "(Lcom/checkout/risk/RiskConfig;)V", "getConfig", "()Lcom/checkout/risk/RiskConfig;", "deviceDataEndpoint", "", "getDeviceDataEndpoint", "()Ljava/lang/String;", "environment", "Lcom/checkout/risk/RiskEnvironment;", "getEnvironment", "()Lcom/checkout/risk/RiskEnvironment;", "fingerprintEndpoint", "getFingerprintEndpoint", "framesMode", "", "framesOptions", "Lcom/checkout/risk/FramesOptions;", "getFramesOptions", "()Lcom/checkout/risk/FramesOptions;", "integrationType", "Lcom/checkout/risk/RiskIntegrationType;", "getIntegrationType", "()Lcom/checkout/risk/RiskIntegrationType;", "merchantPublicKey", "getMerchantPublicKey", "setMerchantPublicKey", "(Ljava/lang/String;)V", "sourceType", "Lcom/checkout/risk/SourceType;", "getSourceType", "()Lcom/checkout/risk/SourceType;", "component1", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "other", "", "hashCode", "", "toString", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RiskSDKInternalConfigImpl implements RiskSDKInternalConfig {

    @NotNull
    private final RiskConfig config;

    @NotNull
    private final String deviceDataEndpoint;

    @NotNull
    private final RiskEnvironment environment;

    @NotNull
    private final String fingerprintEndpoint;
    private final boolean framesMode;

    @Nullable
    private final FramesOptions framesOptions;

    @NotNull
    private final RiskIntegrationType integrationType;

    @NotNull
    private String merchantPublicKey;

    @NotNull
    private final SourceType sourceType;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RiskEnvironment.values().length];
            try {
                iArr[RiskEnvironment.QA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RiskEnvironment.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RiskEnvironment.PRODUCTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RiskSDKInternalConfigImpl(@NotNull RiskConfig config) {
        boolean z2;
        RiskIntegrationType riskIntegrationType;
        SourceType sourceType;
        Intrinsics.echo(config, "config");
        this.config = config;
        if (config.getFramesOptions() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.framesMode = z2;
        this.framesOptions = config.getFramesOptions();
        this.merchantPublicKey = config.getPublicKey();
        this.environment = config.getEnvironment();
        if (z2) {
            riskIntegrationType = RiskIntegrationType.FRAMES;
        } else {
            riskIntegrationType = RiskIntegrationType.STANDALONE;
        }
        this.integrationType = riskIntegrationType;
        if (z2) {
            sourceType = SourceType.CARD_TOKEN;
        } else {
            sourceType = SourceType.RISK_SDK;
        }
        this.sourceType = sourceType;
        int i4 = WhenMappings.$EnumSwitchMapping$0[getEnvironment().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    this.deviceDataEndpoint = "https://risk.checkout.com";
                    this.fingerprintEndpoint = "https://fpjs.checkout.com";
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            this.deviceDataEndpoint = "https://risk.sandbox.checkout.com";
            this.fingerprintEndpoint = "https://fpjs.sandbox.checkout.com";
            return;
        }
        this.deviceDataEndpoint = "https://prism-qa.ckotech.co";
        this.fingerprintEndpoint = "https://fpjs.cko-qa.ckotech.co";
    }

    public static /* synthetic */ RiskSDKInternalConfigImpl copy$default(RiskSDKInternalConfigImpl riskSDKInternalConfigImpl, RiskConfig riskConfig, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            riskConfig = riskSDKInternalConfigImpl.config;
        }
        return riskSDKInternalConfigImpl.copy(riskConfig);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RiskConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final RiskSDKInternalConfigImpl copy(@NotNull RiskConfig config) {
        Intrinsics.echo(config, "config");
        return new RiskSDKInternalConfigImpl(config);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RiskSDKInternalConfigImpl) && Intrinsics.areEqual(this.config, ((RiskSDKInternalConfigImpl) other).config);
    }

    @NotNull
    public final RiskConfig getConfig() {
        return this.config;
    }

    @Override // com.checkout.risk.RiskSDKInternalConfig
    @NotNull
    public String getDeviceDataEndpoint() {
        return this.deviceDataEndpoint;
    }

    @Override // com.checkout.risk.RiskSDKInternalConfig
    @NotNull
    public RiskEnvironment getEnvironment() {
        return this.environment;
    }

    @Override // com.checkout.risk.RiskSDKInternalConfig
    @NotNull
    public String getFingerprintEndpoint() {
        return this.fingerprintEndpoint;
    }

    @Override // com.checkout.risk.RiskSDKInternalConfig
    @Nullable
    public FramesOptions getFramesOptions() {
        return this.framesOptions;
    }

    @Override // com.checkout.risk.RiskSDKInternalConfig
    @NotNull
    public RiskIntegrationType getIntegrationType() {
        return this.integrationType;
    }

    @Override // com.checkout.risk.RiskSDKInternalConfig
    @NotNull
    public String getMerchantPublicKey() {
        return this.merchantPublicKey;
    }

    @Override // com.checkout.risk.RiskSDKInternalConfig
    @NotNull
    public SourceType getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    public void setMerchantPublicKey(@NotNull String str) {
        Intrinsics.echo(str, "<set-?>");
        this.merchantPublicKey = str;
    }

    @NotNull
    public String toString() {
        return "RiskSDKInternalConfigImpl(config=" + this.config + ')';
    }
}
