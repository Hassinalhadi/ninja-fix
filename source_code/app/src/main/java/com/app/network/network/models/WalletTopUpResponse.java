package com.app.network.network.models;

import A0.z;
import Q0.c;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/app/network/network/models/WalletTopUpResponse;", "", Constants.KEY_ID, "", "status", "", "externalId", "createdAt", "paymentSession", "Lcom/app/network/network/models/PaymentSession;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/network/network/models/PaymentSession;)V", "getId", "()I", "getStatus", "()Ljava/lang/String;", "getExternalId", "getCreatedAt", "getPaymentSession", "()Lcom/app/network/network/models/PaymentSession;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WalletTopUpResponse {

    @NotNull
    private final String createdAt;

    @NotNull
    private final String externalId;
    private final int id;

    @NotNull
    private final PaymentSession paymentSession;

    @NotNull
    private final String status;

    public WalletTopUpResponse(int i4, @NotNull String status, @NotNull String externalId, @NotNull String createdAt, @NotNull PaymentSession paymentSession) {
        Intrinsics.echo(status, "status");
        Intrinsics.echo(externalId, "externalId");
        Intrinsics.echo(createdAt, "createdAt");
        Intrinsics.echo(paymentSession, "paymentSession");
        this.id = i4;
        this.status = status;
        this.externalId = externalId;
        this.createdAt = createdAt;
        this.paymentSession = paymentSession;
    }

    public static /* synthetic */ WalletTopUpResponse copy$default(WalletTopUpResponse walletTopUpResponse, int i4, String str, String str2, String str3, PaymentSession paymentSession, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = walletTopUpResponse.id;
        }
        if ((i5 & 2) != 0) {
            str = walletTopUpResponse.status;
        }
        if ((i5 & 4) != 0) {
            str2 = walletTopUpResponse.externalId;
        }
        if ((i5 & 8) != 0) {
            str3 = walletTopUpResponse.createdAt;
        }
        if ((i5 & 16) != 0) {
            paymentSession = walletTopUpResponse.paymentSession;
        }
        PaymentSession paymentSession2 = paymentSession;
        String str4 = str2;
        return walletTopUpResponse.copy(i4, str, str4, str3, paymentSession2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final PaymentSession getPaymentSession() {
        return this.paymentSession;
    }

    @NotNull
    public final WalletTopUpResponse copy(int id2, @NotNull String status, @NotNull String externalId, @NotNull String createdAt, @NotNull PaymentSession paymentSession) {
        Intrinsics.echo(status, "status");
        Intrinsics.echo(externalId, "externalId");
        Intrinsics.echo(createdAt, "createdAt");
        Intrinsics.echo(paymentSession, "paymentSession");
        return new WalletTopUpResponse(id2, status, externalId, createdAt, paymentSession);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletTopUpResponse)) {
            return false;
        }
        WalletTopUpResponse walletTopUpResponse = (WalletTopUpResponse) other;
        return this.id == walletTopUpResponse.id && Intrinsics.areEqual(this.status, walletTopUpResponse.status) && Intrinsics.areEqual(this.externalId, walletTopUpResponse.externalId) && Intrinsics.areEqual(this.createdAt, walletTopUpResponse.createdAt) && Intrinsics.areEqual(this.paymentSession, walletTopUpResponse.paymentSession);
    }

    @NotNull
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getExternalId() {
        return this.externalId;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final PaymentSession getPaymentSession() {
        return this.paymentSession;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.paymentSession.hashCode() + AbstractC2327c.sierra(AbstractC2327c.sierra(AbstractC2327c.sierra(this.id * 31, 31, this.status), 31, this.externalId), 31, this.createdAt);
    }

    @NotNull
    public String toString() {
        int i4 = this.id;
        String str = this.status;
        String str2 = this.externalId;
        String str3 = this.createdAt;
        PaymentSession paymentSession = this.paymentSession;
        StringBuilder lima = z.lima("WalletTopUpResponse(id=", ", status=", str, ", externalId=", i4);
        c.azure(lima, str2, ", createdAt=", str3, ", paymentSession=");
        lima.append(paymentSession);
        lima.append(")");
        return lima.toString();
    }
}
