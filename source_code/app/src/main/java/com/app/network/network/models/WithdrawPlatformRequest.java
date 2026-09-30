package com.app.network.network.models;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006'"}, d2 = {"Lcom/app/network/network/models/WithdrawPlatformRequest;", "", "amount", "", "walletId", "", "transactionType", "", "platformId", "accountId", "<init>", "(FILjava/lang/String;ILjava/lang/String;)V", "getAmount", "()F", "setAmount", "(F)V", "getWalletId", "()I", "setWalletId", "(I)V", "getTransactionType", "()Ljava/lang/String;", "setTransactionType", "(Ljava/lang/String;)V", "getPlatformId", "setPlatformId", "getAccountId", "setAccountId", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WithdrawPlatformRequest {

    @NotNull
    private String accountId;
    private float amount;
    private int platformId;

    @NotNull
    private String transactionType;
    private int walletId;

    public WithdrawPlatformRequest(float f5, int i4, @NotNull String transactionType, int i5, @NotNull String accountId) {
        Intrinsics.echo(transactionType, "transactionType");
        Intrinsics.echo(accountId, "accountId");
        this.amount = f5;
        this.walletId = i4;
        this.transactionType = transactionType;
        this.platformId = i5;
        this.accountId = accountId;
    }

    public static /* synthetic */ WithdrawPlatformRequest copy$default(WithdrawPlatformRequest withdrawPlatformRequest, float f5, int i4, String str, int i5, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f5 = withdrawPlatformRequest.amount;
        }
        if ((i10 & 2) != 0) {
            i4 = withdrawPlatformRequest.walletId;
        }
        if ((i10 & 4) != 0) {
            str = withdrawPlatformRequest.transactionType;
        }
        if ((i10 & 8) != 0) {
            i5 = withdrawPlatformRequest.platformId;
        }
        if ((i10 & 16) != 0) {
            str2 = withdrawPlatformRequest.accountId;
        }
        String str3 = str2;
        String str4 = str;
        return withdrawPlatformRequest.copy(f5, i4, str4, i5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final float getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWalletId() {
        return this.walletId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPlatformId() {
        return this.platformId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final WithdrawPlatformRequest copy(float amount, int walletId, @NotNull String transactionType, int platformId, @NotNull String accountId) {
        Intrinsics.echo(transactionType, "transactionType");
        Intrinsics.echo(accountId, "accountId");
        return new WithdrawPlatformRequest(amount, walletId, transactionType, platformId, accountId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawPlatformRequest)) {
            return false;
        }
        WithdrawPlatformRequest withdrawPlatformRequest = (WithdrawPlatformRequest) other;
        return Float.compare(this.amount, withdrawPlatformRequest.amount) == 0 && this.walletId == withdrawPlatformRequest.walletId && Intrinsics.areEqual(this.transactionType, withdrawPlatformRequest.transactionType) && this.platformId == withdrawPlatformRequest.platformId && Intrinsics.areEqual(this.accountId, withdrawPlatformRequest.accountId);
    }

    @NotNull
    public final String getAccountId() {
        return this.accountId;
    }

    public final float getAmount() {
        return this.amount;
    }

    public final int getPlatformId() {
        return this.platformId;
    }

    @NotNull
    public final String getTransactionType() {
        return this.transactionType;
    }

    public final int getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        return this.accountId.hashCode() + ((AbstractC2327c.sierra(((Float.floatToIntBits(this.amount) * 31) + this.walletId) * 31, 31, this.transactionType) + this.platformId) * 31);
    }

    public final void setAccountId(@NotNull String str) {
        Intrinsics.echo(str, "<set-?>");
        this.accountId = str;
    }

    public final void setAmount(float f5) {
        this.amount = f5;
    }

    public final void setPlatformId(int i4) {
        this.platformId = i4;
    }

    public final void setTransactionType(@NotNull String str) {
        Intrinsics.echo(str, "<set-?>");
        this.transactionType = str;
    }

    public final void setWalletId(int i4) {
        this.walletId = i4;
    }

    @NotNull
    public String toString() {
        float f5 = this.amount;
        int i4 = this.walletId;
        String str = this.transactionType;
        int i5 = this.platformId;
        String str2 = this.accountId;
        StringBuilder sb2 = new StringBuilder("WithdrawPlatformRequest(amount=");
        sb2.append(f5);
        sb2.append(", walletId=");
        sb2.append(i4);
        sb2.append(", transactionType=");
        sb2.append(str);
        sb2.append(", platformId=");
        sb2.append(i5);
        sb2.append(", accountId=");
        return P0.gold(sb2, str2, ")");
    }
}
