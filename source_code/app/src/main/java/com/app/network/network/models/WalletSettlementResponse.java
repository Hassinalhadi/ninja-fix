package com.app.network.network.models;

import P8.c;
import androidx.annotation.Keep;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/app/network/network/models/WalletSettlementResponse;", "", Constants.KEY_ID, "", "amount", "", "walletTopup", "Lcom/app/network/network/models/WalletTopUpResponse;", "<init>", "(JDLcom/app/network/network/models/WalletTopUpResponse;)V", "getId", "()J", "getAmount", "()D", "getWalletTopup", "()Lcom/app/network/network/models/WalletTopUpResponse;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WalletSettlementResponse {

    @c("amount")
    private final double amount;

    @c(Constants.KEY_ID)
    private final long id;

    @c("walletTopup")
    @NotNull
    private final WalletTopUpResponse walletTopup;

    public WalletSettlementResponse(long j5, double d4, @NotNull WalletTopUpResponse walletTopup) {
        Intrinsics.echo(walletTopup, "walletTopup");
        this.id = j5;
        this.amount = d4;
        this.walletTopup = walletTopup;
    }

    public static /* synthetic */ WalletSettlementResponse copy$default(WalletSettlementResponse walletSettlementResponse, long j5, double d4, WalletTopUpResponse walletTopUpResponse, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = walletSettlementResponse.id;
        }
        long j6 = j5;
        if ((i4 & 2) != 0) {
            d4 = walletSettlementResponse.amount;
        }
        double d9 = d4;
        if ((i4 & 4) != 0) {
            walletTopUpResponse = walletSettlementResponse.walletTopup;
        }
        return walletSettlementResponse.copy(j6, d9, walletTopUpResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final WalletTopUpResponse getWalletTopup() {
        return this.walletTopup;
    }

    @NotNull
    public final WalletSettlementResponse copy(long id2, double amount, @NotNull WalletTopUpResponse walletTopup) {
        Intrinsics.echo(walletTopup, "walletTopup");
        return new WalletSettlementResponse(id2, amount, walletTopup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletSettlementResponse)) {
            return false;
        }
        WalletSettlementResponse walletSettlementResponse = (WalletSettlementResponse) other;
        return this.id == walletSettlementResponse.id && Double.compare(this.amount, walletSettlementResponse.amount) == 0 && Intrinsics.areEqual(this.walletTopup, walletSettlementResponse.walletTopup);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final WalletTopUpResponse getWalletTopup() {
        return this.walletTopup;
    }

    public int hashCode() {
        long j5 = this.id;
        long doubleToLongBits = Double.doubleToLongBits(this.amount);
        return this.walletTopup.hashCode() + (((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) ((doubleToLongBits >>> 32) ^ doubleToLongBits))) * 31);
    }

    @NotNull
    public String toString() {
        long j5 = this.id;
        double d4 = this.amount;
        WalletTopUpResponse walletTopUpResponse = this.walletTopup;
        StringBuilder uniform = Q0.c.uniform("WalletSettlementResponse(id=", j5, ", amount=");
        uniform.append(d4);
        uniform.append(", walletTopup=");
        uniform.append(walletTopUpResponse);
        uniform.append(")");
        return uniform.toString();
    }
}
