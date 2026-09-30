package com.app.network.network.models.agreement;

import com.app.network.network.models.AppAgreementSignatureOwnerTypeEnum;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/app/network/network/models/agreement/SignAppAgreementRequest;", "", "ownerType", "Lcom/app/network/network/models/AppAgreementSignatureOwnerTypeEnum;", "ownerId", "", "<init>", "(Lcom/app/network/network/models/AppAgreementSignatureOwnerTypeEnum;Ljava/lang/Long;)V", "getOwnerType", "()Lcom/app/network/network/models/AppAgreementSignatureOwnerTypeEnum;", "getOwnerId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", Constants.COPY_TYPE, "(Lcom/app/network/network/models/AppAgreementSignatureOwnerTypeEnum;Ljava/lang/Long;)Lcom/app/network/network/models/agreement/SignAppAgreementRequest;", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SignAppAgreementRequest {

    @Nullable
    private final Long ownerId;

    @Nullable
    private final AppAgreementSignatureOwnerTypeEnum ownerType;

    public SignAppAgreementRequest(@Nullable AppAgreementSignatureOwnerTypeEnum appAgreementSignatureOwnerTypeEnum, @Nullable Long l10) {
        this.ownerType = appAgreementSignatureOwnerTypeEnum;
        this.ownerId = l10;
    }

    public static /* synthetic */ SignAppAgreementRequest copy$default(SignAppAgreementRequest signAppAgreementRequest, AppAgreementSignatureOwnerTypeEnum appAgreementSignatureOwnerTypeEnum, Long l10, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            appAgreementSignatureOwnerTypeEnum = signAppAgreementRequest.ownerType;
        }
        if ((i4 & 2) != 0) {
            l10 = signAppAgreementRequest.ownerId;
        }
        return signAppAgreementRequest.copy(appAgreementSignatureOwnerTypeEnum, l10);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final AppAgreementSignatureOwnerTypeEnum getOwnerType() {
        return this.ownerType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Long getOwnerId() {
        return this.ownerId;
    }

    @NotNull
    public final SignAppAgreementRequest copy(@Nullable AppAgreementSignatureOwnerTypeEnum ownerType, @Nullable Long ownerId) {
        return new SignAppAgreementRequest(ownerType, ownerId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignAppAgreementRequest)) {
            return false;
        }
        SignAppAgreementRequest signAppAgreementRequest = (SignAppAgreementRequest) other;
        return this.ownerType == signAppAgreementRequest.ownerType && Intrinsics.areEqual(this.ownerId, signAppAgreementRequest.ownerId);
    }

    @Nullable
    public final Long getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final AppAgreementSignatureOwnerTypeEnum getOwnerType() {
        return this.ownerType;
    }

    public int hashCode() {
        AppAgreementSignatureOwnerTypeEnum appAgreementSignatureOwnerTypeEnum = this.ownerType;
        int hashCode = (appAgreementSignatureOwnerTypeEnum == null ? 0 : appAgreementSignatureOwnerTypeEnum.hashCode()) * 31;
        Long l10 = this.ownerId;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SignAppAgreementRequest(ownerType=" + this.ownerType + ", ownerId=" + this.ownerId + ")";
    }
}
