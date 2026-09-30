package com.checkout.components.interfaces.model.paymentsession;

import av.q;
import com.checkout.components.interfaces.b;
import com.clevertap.android.sdk.leanplum.Constants;
import com.google.android.material.datepicker.j;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\nR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\nR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0019\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b!\u0010\nR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0019\u0012\u0004\b%\u0010\u001c\u001a\u0004\b$\u0010\n¨\u0006&"}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/TransactionInfo;", "", "", "totalPriceStatus", "totalPrice", "countryCode", Constants.CURRENCY_CODE_PARAM, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/paymentsession/TransactionInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTotalPriceStatus", "getTotalPriceStatus$annotations", "()V", "b", "getTotalPrice", "getTotalPrice$annotations", "c", "getCountryCode", "getCountryCode$annotations", com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "getCurrencyCode", "getCurrencyCode$annotations", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionInfo {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String totalPriceStatus;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String totalPrice;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String countryCode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String currencyCode;

    public TransactionInfo(@Json(name = "total_price_status") @NotNull String totalPriceStatus, @Json(name = "total_price") @NotNull String totalPrice, @Json(name = "country_code") @NotNull String countryCode, @Json(name = "currency_code") @NotNull String currencyCode) {
        Intrinsics.echo(totalPriceStatus, "totalPriceStatus");
        Intrinsics.echo(totalPrice, "totalPrice");
        Intrinsics.echo(countryCode, "countryCode");
        Intrinsics.echo(currencyCode, "currencyCode");
        this.totalPriceStatus = totalPriceStatus;
        this.totalPrice = totalPrice;
        this.countryCode = countryCode;
        this.currencyCode = currencyCode;
    }

    public static /* synthetic */ TransactionInfo copy$default(TransactionInfo transactionInfo, String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = transactionInfo.totalPriceStatus;
        }
        if ((i4 & 2) != 0) {
            str2 = transactionInfo.totalPrice;
        }
        if ((i4 & 4) != 0) {
            str3 = transactionInfo.countryCode;
        }
        if ((i4 & 8) != 0) {
            str4 = transactionInfo.currencyCode;
        }
        return transactionInfo.copy(str, str2, str3, str4);
    }

    @Json(name = "country_code")
    public static /* synthetic */ void getCountryCode$annotations() {
    }

    @Json(name = "currency_code")
    public static /* synthetic */ void getCurrencyCode$annotations() {
    }

    @Json(name = "total_price")
    public static /* synthetic */ void getTotalPrice$annotations() {
    }

    @Json(name = "total_price_status")
    public static /* synthetic */ void getTotalPriceStatus$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTotalPriceStatus() {
        return this.totalPriceStatus;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final TransactionInfo copy(@Json(name = "total_price_status") @NotNull String totalPriceStatus, @Json(name = "total_price") @NotNull String totalPrice, @Json(name = "country_code") @NotNull String countryCode, @Json(name = "currency_code") @NotNull String currencyCode) {
        Intrinsics.echo(totalPriceStatus, "totalPriceStatus");
        Intrinsics.echo(totalPrice, "totalPrice");
        Intrinsics.echo(countryCode, "countryCode");
        Intrinsics.echo(currencyCode, "currencyCode");
        return new TransactionInfo(totalPriceStatus, totalPrice, countryCode, currencyCode);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionInfo)) {
            return false;
        }
        TransactionInfo transactionInfo = (TransactionInfo) other;
        return Intrinsics.areEqual(this.totalPriceStatus, transactionInfo.totalPriceStatus) && Intrinsics.areEqual(this.totalPrice, transactionInfo.totalPrice) && Intrinsics.areEqual(this.countryCode, transactionInfo.countryCode) && Intrinsics.areEqual(this.currencyCode, transactionInfo.currencyCode);
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    public final String getTotalPriceStatus() {
        return this.totalPriceStatus;
    }

    public final int hashCode() {
        return this.currencyCode.hashCode() + b.a(this.countryCode, b.a(this.totalPrice, this.totalPriceStatus.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        String str = this.totalPriceStatus;
        String str2 = this.totalPrice;
        return j.lima(q.india("TransactionInfo(totalPriceStatus=", str, ", totalPrice=", str2, ", countryCode="), this.countryCode, ", currencyCode=", this.currencyCode, ")");
    }
}
