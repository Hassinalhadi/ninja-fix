package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/app/network/network/models/FintechResponse;", "", "<init>", "()V", Constants.KEY_ID, "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "accountType", "", "getAccountType", "()Ljava/lang/String;", "setAccountType", "(Ljava/lang/String;)V", "accountId", "getAccountId", "setAccountId", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechResponse {

    @Nullable
    private String accountId;

    @Nullable
    private String accountType;

    @Nullable
    private Long id;

    @Nullable
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    public final void setAccountId(@Nullable String str) {
        this.accountId = str;
    }

    public final void setAccountType(@Nullable String str) {
        this.accountType = str;
    }

    public final void setId(@Nullable Long l10) {
        this.id = l10;
    }
}
