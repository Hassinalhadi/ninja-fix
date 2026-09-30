package com.app.network.network.models.agreement;

import com.app.network.network.models.AppAgreementTypeEnum;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/app/network/network/models/agreement/AppAgreement;", "", "<init>", "()V", Constants.KEY_ID, "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", Constants.KEY_TYPE, "Lcom/app/network/network/models/AppAgreementTypeEnum;", "getType", "()Lcom/app/network/network/models/AppAgreementTypeEnum;", Constants.KEY_CONTENT, "", "getContent", "()Ljava/lang/String;", "readingTimeInSeconds", "", "getReadingTimeInSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppAgreement {

    @Nullable
    private final String content;

    @Nullable
    private Long id;

    @Nullable
    private final Integer readingTimeInSeconds;

    @Nullable
    private final AppAgreementTypeEnum type;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final Integer getReadingTimeInSeconds() {
        return this.readingTimeInSeconds;
    }

    @Nullable
    public final AppAgreementTypeEnum getType() {
        return this.type;
    }

    public final void setId(@Nullable Long l10) {
        this.id = l10;
    }
}
