package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0013\u0010&\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0015\u0010(\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b)\u0010\rR\u0015\u0010*\u001a\u0004\u0018\u00010+¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0019\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001e\u00104\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b5\u0010\r\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/app/network/network/models/WithdrawTransaction;", "Ljava/io/Serializable;", "<init>", "()V", "transactionTypeDisplayName", "", "getTransactionTypeDisplayName", "()Ljava/lang/String;", "transactionType", "getTransactionType", "walletId", "", "getWalletId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "status", "Lcom/app/network/network/models/WithdrawStatus;", "getStatus", "()Lcom/app/network/network/models/WithdrawStatus;", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "amount", "", "getAmount", "()Ljava/lang/Float;", "Ljava/lang/Float;", "statusDisplayName", "getStatusDisplayName", "statusColor", "getStatusColor", "currency", "Lcom/app/network/network/models/Currency;", "getCurrency", "()Lcom/app/network/network/models/Currency;", "refusalReasonMessage", "getRefusalReasonMessage", "refusalReason", "getRefusalReason", Constants.KEY_ID, "getId", "canCancel", "", "getCanCancel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "history", "", "Lcom/app/network/network/models/WithdrawHistory;", "getHistory", "()Ljava/util/List;", "platformId", "getPlatformId", "setPlatformId", "(Ljava/lang/Integer;)V", "platformName", "getPlatformName", "setPlatformName", "(Ljava/lang/String;)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WithdrawTransaction implements Serializable {

    @Nullable
    private final Float amount;

    @Nullable
    private final Boolean canCancel;

    @Nullable
    private final Date createdAt;

    @Nullable
    private final Currency currency;

    @Nullable
    private final List<WithdrawHistory> history;

    @Nullable
    private final Integer id;

    @Nullable
    private Integer platformId;

    @Nullable
    private String platformName;

    @Nullable
    private final String refusalReason;

    @Nullable
    private final String refusalReasonMessage;

    @Nullable
    private final WithdrawStatus status;

    @Nullable
    private final String statusColor;

    @Nullable
    private final String statusDisplayName;

    @Nullable
    private final String transactionType;

    @Nullable
    private final String transactionTypeDisplayName;

    @Nullable
    private final Integer walletId;

    @Nullable
    public final Float getAmount() {
        return this.amount;
    }

    @Nullable
    public final Boolean getCanCancel() {
        return this.canCancel;
    }

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Currency getCurrency() {
        return this.currency;
    }

    @Nullable
    public final List<WithdrawHistory> getHistory() {
        return this.history;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Integer getPlatformId() {
        return this.platformId;
    }

    @Nullable
    public final String getPlatformName() {
        return this.platformName;
    }

    @Nullable
    public final String getRefusalReason() {
        return this.refusalReason;
    }

    @Nullable
    public final String getRefusalReasonMessage() {
        return this.refusalReasonMessage;
    }

    @Nullable
    public final WithdrawStatus getStatus() {
        return this.status;
    }

    @Nullable
    public final String getStatusColor() {
        return this.statusColor;
    }

    @Nullable
    public final String getStatusDisplayName() {
        return this.statusDisplayName;
    }

    @Nullable
    public final String getTransactionType() {
        return this.transactionType;
    }

    @Nullable
    public final String getTransactionTypeDisplayName() {
        return this.transactionTypeDisplayName;
    }

    @Nullable
    public final Integer getWalletId() {
        return this.walletId;
    }

    public final void setPlatformId(@Nullable Integer num) {
        this.platformId = num;
    }

    public final void setPlatformName(@Nullable String str) {
        this.platformName = str;
    }
}
