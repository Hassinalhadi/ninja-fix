package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/app/network/network/models/SignedAppAgreement;", "Lcom/app/network/network/models/Language;", Constants.KEY_TYPE, "Lcom/app/network/network/models/AppAgreementTypeEnum;", Constants.KEY_CONTENT, "", "signedAt", "Ljava/util/Date;", "ownerType", "Lcom/app/network/network/models/AppAgreementSignatureOwnerTypeEnum;", "<init>", "(Lcom/app/network/network/models/AppAgreementTypeEnum;Ljava/lang/String;Ljava/util/Date;Lcom/app/network/network/models/AppAgreementSignatureOwnerTypeEnum;)V", "getType", "()Lcom/app/network/network/models/AppAgreementTypeEnum;", "getContent", "()Ljava/lang/String;", "getSignedAt", "()Ljava/util/Date;", "setSignedAt", "(Ljava/util/Date;)V", "getOwnerType", "()Lcom/app/network/network/models/AppAgreementSignatureOwnerTypeEnum;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SignedAppAgreement extends Language {

    @Nullable
    private final String content;

    @Nullable
    private final AppAgreementSignatureOwnerTypeEnum ownerType;

    @Nullable
    private Date signedAt;

    @Nullable
    private final AppAgreementTypeEnum type;

    public /* synthetic */ SignedAppAgreement(AppAgreementTypeEnum appAgreementTypeEnum, String str, Date date, AppAgreementSignatureOwnerTypeEnum appAgreementSignatureOwnerTypeEnum, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(appAgreementTypeEnum, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : date, appAgreementSignatureOwnerTypeEnum);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final AppAgreementSignatureOwnerTypeEnum getOwnerType() {
        return this.ownerType;
    }

    @Nullable
    public final Date getSignedAt() {
        return this.signedAt;
    }

    @Nullable
    public final AppAgreementTypeEnum getType() {
        return this.type;
    }

    public final void setSignedAt(@Nullable Date date) {
        this.signedAt = date;
    }

    public SignedAppAgreement(@Nullable AppAgreementTypeEnum appAgreementTypeEnum, @Nullable String str, @Nullable Date date, @Nullable AppAgreementSignatureOwnerTypeEnum appAgreementSignatureOwnerTypeEnum) {
        super(null, 1, null);
        this.type = appAgreementTypeEnum;
        this.content = str;
        this.signedAt = date;
        this.ownerType = appAgreementSignatureOwnerTypeEnum;
    }
}
