package com.checkout.risk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/checkout/risk/RiskConfig;", "", "publicKey", "", "environment", "Lcom/checkout/risk/RiskEnvironment;", "framesOptions", "Lcom/checkout/risk/FramesOptions;", "(Ljava/lang/String;Lcom/checkout/risk/RiskEnvironment;Lcom/checkout/risk/FramesOptions;)V", "getEnvironment", "()Lcom/checkout/risk/RiskEnvironment;", "getFramesOptions", "()Lcom/checkout/risk/FramesOptions;", "getPublicKey", "()Ljava/lang/String;", "component1", "component2", "component3", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RiskConfig {

    @NotNull
    private final RiskEnvironment environment;

    @Nullable
    private final FramesOptions framesOptions;

    @NotNull
    private final String publicKey;

    public RiskConfig(@NotNull String publicKey, @NotNull RiskEnvironment environment, @Nullable FramesOptions framesOptions) {
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(environment, "environment");
        this.publicKey = publicKey;
        this.environment = environment;
        this.framesOptions = framesOptions;
    }

    public static /* synthetic */ RiskConfig copy$default(RiskConfig riskConfig, String str, RiskEnvironment riskEnvironment, FramesOptions framesOptions, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = riskConfig.publicKey;
        }
        if ((i4 & 2) != 0) {
            riskEnvironment = riskConfig.environment;
        }
        if ((i4 & 4) != 0) {
            framesOptions = riskConfig.framesOptions;
        }
        return riskConfig.copy(str, riskEnvironment, framesOptions);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RiskEnvironment getEnvironment() {
        return this.environment;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final FramesOptions getFramesOptions() {
        return this.framesOptions;
    }

    @NotNull
    public final RiskConfig copy(@NotNull String publicKey, @NotNull RiskEnvironment environment, @Nullable FramesOptions framesOptions) {
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(environment, "environment");
        return new RiskConfig(publicKey, environment, framesOptions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiskConfig)) {
            return false;
        }
        RiskConfig riskConfig = (RiskConfig) other;
        return Intrinsics.areEqual(this.publicKey, riskConfig.publicKey) && this.environment == riskConfig.environment && Intrinsics.areEqual(this.framesOptions, riskConfig.framesOptions);
    }

    @NotNull
    public final RiskEnvironment getEnvironment() {
        return this.environment;
    }

    @Nullable
    public final FramesOptions getFramesOptions() {
        return this.framesOptions;
    }

    @NotNull
    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        int hashCode = (this.environment.hashCode() + (this.publicKey.hashCode() * 31)) * 31;
        FramesOptions framesOptions = this.framesOptions;
        return hashCode + (framesOptions == null ? 0 : framesOptions.hashCode());
    }

    @NotNull
    public String toString() {
        return "RiskConfig(publicKey=" + this.publicKey + ", environment=" + this.environment + ", framesOptions=" + this.framesOptions + ')';
    }

    public /* synthetic */ RiskConfig(String str, RiskEnvironment riskEnvironment, FramesOptions framesOptions, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, riskEnvironment, (i4 & 4) != 0 ? null : framesOptions);
    }
}
