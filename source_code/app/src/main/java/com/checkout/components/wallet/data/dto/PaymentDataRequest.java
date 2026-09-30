package com.checkout.components.wallet.data.dto;

import av.q;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JH\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0016¨\u0006/"}, d2 = {"Lcom/checkout/components/wallet/data/dto/PaymentDataRequest;", "", "", "apiVersion", "apiVersionMinor", "", "Lcom/checkout/components/wallet/data/dto/CardPaymentMethod;", "allowedPaymentMethods", "Lcom/checkout/components/wallet/data/dto/TransactionInfo;", "transactionInfo", "Lcom/checkout/components/wallet/data/dto/MerchantInfo;", "merchantInfo", "<init>", "(IILjava/util/List;Lcom/checkout/components/wallet/data/dto/TransactionInfo;Lcom/checkout/components/wallet/data/dto/MerchantInfo;)V", "component1", "()I", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/checkout/components/wallet/data/dto/TransactionInfo;", "component5", "()Lcom/checkout/components/wallet/data/dto/MerchantInfo;", Constants.COPY_TYPE, "(IILjava/util/List;Lcom/checkout/components/wallet/data/dto/TransactionInfo;Lcom/checkout/components/wallet/data/dto/MerchantInfo;)Lcom/checkout/components/wallet/data/dto/PaymentDataRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getApiVersion", "b", "getApiVersionMinor", "c", "Ljava/util/List;", "getAllowedPaymentMethods", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/wallet/data/dto/TransactionInfo;", "getTransactionInfo", "e", "Lcom/checkout/components/wallet/data/dto/MerchantInfo;", "getMerchantInfo", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentDataRequest {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int apiVersion;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int apiVersionMinor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List allowedPaymentMethods;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final TransactionInfo transactionInfo;

    /* renamed from: e, reason: from kotlin metadata */
    private final MerchantInfo merchantInfo;

    public PaymentDataRequest(int i4, int i5, List<CardPaymentMethod> allowedPaymentMethods, TransactionInfo transactionInfo, MerchantInfo merchantInfo) {
        Intrinsics.echo(allowedPaymentMethods, "allowedPaymentMethods");
        Intrinsics.echo(transactionInfo, "transactionInfo");
        Intrinsics.echo(merchantInfo, "merchantInfo");
        this.apiVersion = i4;
        this.apiVersionMinor = i5;
        this.allowedPaymentMethods = allowedPaymentMethods;
        this.transactionInfo = transactionInfo;
        this.merchantInfo = merchantInfo;
    }

    public static /* synthetic */ PaymentDataRequest copy$default(PaymentDataRequest paymentDataRequest, int i4, int i5, List list, TransactionInfo transactionInfo, MerchantInfo merchantInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = paymentDataRequest.apiVersion;
        }
        if ((i10 & 2) != 0) {
            i5 = paymentDataRequest.apiVersionMinor;
        }
        if ((i10 & 4) != 0) {
            list = paymentDataRequest.allowedPaymentMethods;
        }
        if ((i10 & 8) != 0) {
            transactionInfo = paymentDataRequest.transactionInfo;
        }
        if ((i10 & 16) != 0) {
            merchantInfo = paymentDataRequest.merchantInfo;
        }
        MerchantInfo merchantInfo2 = merchantInfo;
        List list2 = list;
        return paymentDataRequest.copy(i4, i5, list2, transactionInfo, merchantInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getApiVersion() {
        return this.apiVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final int getApiVersionMinor() {
        return this.apiVersionMinor;
    }

    public final List<CardPaymentMethod> component3() {
        return this.allowedPaymentMethods;
    }

    /* renamed from: component4, reason: from getter */
    public final TransactionInfo getTransactionInfo() {
        return this.transactionInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    public final PaymentDataRequest copy(int apiVersion, int apiVersionMinor, List<CardPaymentMethod> allowedPaymentMethods, TransactionInfo transactionInfo, MerchantInfo merchantInfo) {
        Intrinsics.echo(allowedPaymentMethods, "allowedPaymentMethods");
        Intrinsics.echo(transactionInfo, "transactionInfo");
        Intrinsics.echo(merchantInfo, "merchantInfo");
        return new PaymentDataRequest(apiVersion, apiVersionMinor, allowedPaymentMethods, transactionInfo, merchantInfo);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentDataRequest)) {
            return false;
        }
        PaymentDataRequest paymentDataRequest = (PaymentDataRequest) other;
        return this.apiVersion == paymentDataRequest.apiVersion && this.apiVersionMinor == paymentDataRequest.apiVersionMinor && Intrinsics.areEqual(this.allowedPaymentMethods, paymentDataRequest.allowedPaymentMethods) && Intrinsics.areEqual(this.transactionInfo, paymentDataRequest.transactionInfo) && Intrinsics.areEqual(this.merchantInfo, paymentDataRequest.merchantInfo);
    }

    public final List<CardPaymentMethod> getAllowedPaymentMethods() {
        return this.allowedPaymentMethods;
    }

    public final int getApiVersion() {
        return this.apiVersion;
    }

    public final int getApiVersionMinor() {
        return this.apiVersionMinor;
    }

    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    public final TransactionInfo getTransactionInfo() {
        return this.transactionInfo;
    }

    public final int hashCode() {
        return this.merchantInfo.hashCode() + ((this.transactionInfo.hashCode() + j.golf((this.apiVersionMinor + (this.apiVersion * 31)) * 31, 31, this.allowedPaymentMethods)) * 31);
    }

    public final String toString() {
        int i4 = this.apiVersion;
        int i5 = this.apiVersionMinor;
        List list = this.allowedPaymentMethods;
        TransactionInfo transactionInfo = this.transactionInfo;
        MerchantInfo merchantInfo = this.merchantInfo;
        StringBuilder hotel = q.hotel(i4, i5, "PaymentDataRequest(apiVersion=", ", apiVersionMinor=", ", allowedPaymentMethods=");
        hotel.append(list);
        hotel.append(", transactionInfo=");
        hotel.append(transactionInfo);
        hotel.append(", merchantInfo=");
        hotel.append(merchantInfo);
        hotel.append(")");
        return hotel.toString();
    }
}
