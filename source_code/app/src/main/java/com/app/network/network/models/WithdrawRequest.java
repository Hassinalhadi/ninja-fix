package com.app.network.network.models;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/app/network/network/models/WithdrawRequest;", "", "amount", "", "walletId", "", "transactionType", "", "<init>", "(FILjava/lang/String;)V", "getAmount", "()F", "setAmount", "(F)V", "getWalletId", "()I", "setWalletId", "(I)V", "getTransactionType", "()Ljava/lang/String;", "setTransactionType", "(Ljava/lang/String;)V", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WithdrawRequest {
    private float amount;

    @NotNull
    private String transactionType;
    private int walletId;

    public WithdrawRequest(float f5, int i4, @NotNull String transactionType) {
        Intrinsics.echo(transactionType, "transactionType");
        this.amount = f5;
        this.walletId = i4;
        this.transactionType = transactionType;
    }

    public static /* synthetic */ WithdrawRequest copy$default(WithdrawRequest withdrawRequest, float f5, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = withdrawRequest.amount;
        }
        if ((i5 & 2) != 0) {
            i4 = withdrawRequest.walletId;
        }
        if ((i5 & 4) != 0) {
            str = withdrawRequest.transactionType;
        }
        return withdrawRequest.copy(f5, i4, str);
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

    @NotNull
    public final WithdrawRequest copy(float amount, int walletId, @NotNull String transactionType) {
        Intrinsics.echo(transactionType, "transactionType");
        return new WithdrawRequest(amount, walletId, transactionType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawRequest)) {
            return false;
        }
        WithdrawRequest withdrawRequest = (WithdrawRequest) other;
        return Float.compare(this.amount, withdrawRequest.amount) == 0 && this.walletId == withdrawRequest.walletId && Intrinsics.areEqual(this.transactionType, withdrawRequest.transactionType);
    }

    public final float getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getTransactionType() {
        return this.transactionType;
    }

    public final int getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        return this.transactionType.hashCode() + (((Float.floatToIntBits(this.amount) * 31) + this.walletId) * 31);
    }

    public final void setAmount(float f5) {
        this.amount = f5;
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
        StringBuilder sb2 = new StringBuilder("WithdrawRequest(amount=");
        sb2.append(f5);
        sb2.append(", walletId=");
        sb2.append(i4);
        sb2.append(", transactionType=");
        return P0.gold(sb2, str, ")");
    }
}
