package com.checkout.risk;

import P8.c;
import androidx.appcompat.widget.P0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/checkout/risk/FingerprintIntegration;", "", "enabled", "", "publicKey", "", "(ZLjava/lang/String;)V", "getEnabled", "()Z", "getPublicKey", "()Ljava/lang/String;", "component1", "component2", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FingerprintIntegration {

    @c("enabled")
    private final boolean enabled;

    @c("public_key")
    @Nullable
    private final String publicKey;

    public FingerprintIntegration(boolean z2, @Nullable String str) {
        this.enabled = z2;
        this.publicKey = str;
    }

    public static /* synthetic */ FingerprintIntegration copy$default(FingerprintIntegration fingerprintIntegration, boolean z2, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = fingerprintIntegration.enabled;
        }
        if ((i4 & 2) != 0) {
            str = fingerprintIntegration.publicKey;
        }
        return fingerprintIntegration.copy(z2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    public final FingerprintIntegration copy(boolean enabled, @Nullable String publicKey) {
        return new FingerprintIntegration(enabled, publicKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FingerprintIntegration)) {
            return false;
        }
        FingerprintIntegration fingerprintIntegration = (FingerprintIntegration) other;
        return this.enabled == fingerprintIntegration.enabled && Intrinsics.areEqual(this.publicKey, fingerprintIntegration.publicKey);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z2 = this.enabled;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        String str = this.publicKey;
        return i4 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FingerprintIntegration(enabled=");
        sb2.append(this.enabled);
        sb2.append(", publicKey=");
        return P0.fuchsia(sb2, this.publicKey, ')');
    }
}
