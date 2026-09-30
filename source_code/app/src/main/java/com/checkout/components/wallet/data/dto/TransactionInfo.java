package com.checkout.components.wallet.data.dto;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.leanplum.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lcom/checkout/components/wallet/data/dto/TransactionInfo;", "", "", "totalPrice", "Lcom/checkout/components/wallet/data/dto/TotalPriceStatus;", "totalPriceStatus", Constants.CURRENCY_CODE_PARAM, "<init>", "(Ljava/lang/String;Lcom/checkout/components/wallet/data/dto/TotalPriceStatus;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/wallet/data/dto/TotalPriceStatus;", "component3", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/checkout/components/wallet/data/dto/TotalPriceStatus;Ljava/lang/String;)Lcom/checkout/components/wallet/data/dto/TransactionInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTotalPrice", "b", "Lcom/checkout/components/wallet/data/dto/TotalPriceStatus;", "getTotalPriceStatus", "c", "getCurrencyCode", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionInfo {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String totalPrice;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TotalPriceStatus totalPriceStatus;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String currencyCode;

    public TransactionInfo(String totalPrice, TotalPriceStatus totalPriceStatus, String currencyCode) {
        Intrinsics.echo(totalPrice, "totalPrice");
        Intrinsics.echo(totalPriceStatus, "totalPriceStatus");
        Intrinsics.echo(currencyCode, "currencyCode");
        this.totalPrice = totalPrice;
        this.totalPriceStatus = totalPriceStatus;
        this.currencyCode = currencyCode;
    }

    public static /* synthetic */ TransactionInfo copy$default(TransactionInfo transactionInfo, String str, TotalPriceStatus totalPriceStatus, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = transactionInfo.totalPrice;
        }
        if ((i4 & 2) != 0) {
            totalPriceStatus = transactionInfo.totalPriceStatus;
        }
        if ((i4 & 4) != 0) {
            str2 = transactionInfo.currencyCode;
        }
        return transactionInfo.copy(str, totalPriceStatus, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final TotalPriceStatus getTotalPriceStatus() {
        return this.totalPriceStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final TransactionInfo copy(String totalPrice, TotalPriceStatus totalPriceStatus, String currencyCode) {
        Intrinsics.echo(totalPrice, "totalPrice");
        Intrinsics.echo(totalPriceStatus, "totalPriceStatus");
        Intrinsics.echo(currencyCode, "currencyCode");
        return new TransactionInfo(totalPrice, totalPriceStatus, currencyCode);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionInfo)) {
            return false;
        }
        TransactionInfo transactionInfo = (TransactionInfo) other;
        return Intrinsics.areEqual(this.totalPrice, transactionInfo.totalPrice) && this.totalPriceStatus == transactionInfo.totalPriceStatus && Intrinsics.areEqual(this.currencyCode, transactionInfo.currencyCode);
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getTotalPrice() {
        return this.totalPrice;
    }

    public final TotalPriceStatus getTotalPriceStatus() {
        return this.totalPriceStatus;
    }

    public final int hashCode() {
        return this.currencyCode.hashCode() + ((this.totalPriceStatus.hashCode() + (this.totalPrice.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str = this.totalPrice;
        TotalPriceStatus totalPriceStatus = this.totalPriceStatus;
        String str2 = this.currencyCode;
        StringBuilder sb2 = new StringBuilder("TransactionInfo(totalPrice=");
        sb2.append(str);
        sb2.append(", totalPriceStatus=");
        sb2.append(totalPriceStatus);
        sb2.append(", currencyCode=");
        return P0.gold(sb2, str2, ")");
    }
}
