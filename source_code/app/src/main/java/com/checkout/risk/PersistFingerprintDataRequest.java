package com.checkout.risk;

import P8.c;
import androidx.appcompat.widget.P0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/checkout/risk/PersistFingerprintDataRequest;", "", "fpRequestId", "", "integrationType", "cardToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardToken", "()Ljava/lang/String;", "getFpRequestId", "getIntegrationType", "component1", "component2", "component3", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PersistFingerprintDataRequest {

    @c("card_token")
    @Nullable
    private final String cardToken;

    @c("fp_request_id")
    @NotNull
    private final String fpRequestId;

    @c("integration_type")
    @NotNull
    private final String integrationType;

    public PersistFingerprintDataRequest(@NotNull String fpRequestId, @NotNull String integrationType, @Nullable String str) {
        Intrinsics.echo(fpRequestId, "fpRequestId");
        Intrinsics.echo(integrationType, "integrationType");
        this.fpRequestId = fpRequestId;
        this.integrationType = integrationType;
        this.cardToken = str;
    }

    public static /* synthetic */ PersistFingerprintDataRequest copy$default(PersistFingerprintDataRequest persistFingerprintDataRequest, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = persistFingerprintDataRequest.fpRequestId;
        }
        if ((i4 & 2) != 0) {
            str2 = persistFingerprintDataRequest.integrationType;
        }
        if ((i4 & 4) != 0) {
            str3 = persistFingerprintDataRequest.cardToken;
        }
        return persistFingerprintDataRequest.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFpRequestId() {
        return this.fpRequestId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getIntegrationType() {
        return this.integrationType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCardToken() {
        return this.cardToken;
    }

    @NotNull
    public final PersistFingerprintDataRequest copy(@NotNull String fpRequestId, @NotNull String integrationType, @Nullable String cardToken) {
        Intrinsics.echo(fpRequestId, "fpRequestId");
        Intrinsics.echo(integrationType, "integrationType");
        return new PersistFingerprintDataRequest(fpRequestId, integrationType, cardToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersistFingerprintDataRequest)) {
            return false;
        }
        PersistFingerprintDataRequest persistFingerprintDataRequest = (PersistFingerprintDataRequest) other;
        return Intrinsics.areEqual(this.fpRequestId, persistFingerprintDataRequest.fpRequestId) && Intrinsics.areEqual(this.integrationType, persistFingerprintDataRequest.integrationType) && Intrinsics.areEqual(this.cardToken, persistFingerprintDataRequest.cardToken);
    }

    @Nullable
    public final String getCardToken() {
        return this.cardToken;
    }

    @NotNull
    public final String getFpRequestId() {
        return this.fpRequestId;
    }

    @NotNull
    public final String getIntegrationType() {
        return this.integrationType;
    }

    public int hashCode() {
        int hashCode;
        int sierra = AbstractC2327c.sierra(this.fpRequestId.hashCode() * 31, 31, this.integrationType);
        String str = this.cardToken;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return sierra + hashCode;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PersistFingerprintDataRequest(fpRequestId=");
        sb2.append(this.fpRequestId);
        sb2.append(", integrationType=");
        sb2.append(this.integrationType);
        sb2.append(", cardToken=");
        return P0.fuchsia(sb2, this.cardToken, ')');
    }
}
