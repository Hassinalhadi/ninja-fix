package com.checkout.components.rememberme.model;

import androidx.appcompat.widget.P0;
import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JN\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0012R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0014R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b.\u0010+\u001a\u0004\b\t\u0010\u0016R \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010-\u0012\u0004\b0\u0010+\u001a\u0004\b\n\u0010\u0016R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u0010+\u001a\u0004\b3\u0010\u0019¨\u00065"}, d2 = {"Lcom/checkout/components/rememberme/model/PaymentMethod;", "", "", Constants.KEY_ID, "", Constants.KEY_TYPE, "Lcom/checkout/components/rememberme/model/CardDetails;", "cardDetails", "", "isDefaultPaymentMethod", "isVerifiedPaymentMethod", "Lcom/checkout/components/rememberme/model/BillingAddress;", "billingAddress", "<init>", "(Ljava/lang/String;ILcom/checkout/components/rememberme/model/CardDetails;ZZLcom/checkout/components/rememberme/model/BillingAddress;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/checkout/components/rememberme/model/CardDetails;", "component4", "()Z", "component5", "component6", "()Lcom/checkout/components/rememberme/model/BillingAddress;", Constants.COPY_TYPE, "(Ljava/lang/String;ILcom/checkout/components/rememberme/model/CardDetails;ZZLcom/checkout/components/rememberme/model/BillingAddress;)Lcom/checkout/components/rememberme/model/PaymentMethod;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "I", "getType", "c", "Lcom/checkout/components/rememberme/model/CardDetails;", "getCardDetails", "getCardDetails$annotations", "()V", Constants.INAPP_DATA_TAG, "Z", "isDefaultPaymentMethod$annotations", "e", "isVerifiedPaymentMethod$annotations", "f", "Lcom/checkout/components/rememberme/model/BillingAddress;", "getBillingAddress", "getBillingAddress$annotations", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethod {
    public static final int $stable = BillingAddressNetworkEntity.$stable | PhoneNetworkEntity.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CardDetails cardDetails;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultPaymentMethod;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean isVerifiedPaymentMethod;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final BillingAddress billingAddress;

    public PaymentMethod(@NotNull String id2, int i4, @Json(name = "card_details") @NotNull CardDetails cardDetails, @Json(name = "is_default_payment_method") boolean z2, @Json(name = "is_verified_payment_method") boolean z10, @Json(name = "billing_address") @Nullable BillingAddress billingAddress) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(cardDetails, "cardDetails");
        this.id = id2;
        this.type = i4;
        this.cardDetails = cardDetails;
        this.isDefaultPaymentMethod = z2;
        this.isVerifiedPaymentMethod = z10;
        this.billingAddress = billingAddress;
    }

    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, int i4, CardDetails cardDetails, boolean z2, boolean z10, BillingAddress billingAddress, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = paymentMethod.id;
        }
        if ((i5 & 2) != 0) {
            i4 = paymentMethod.type;
        }
        if ((i5 & 4) != 0) {
            cardDetails = paymentMethod.cardDetails;
        }
        if ((i5 & 8) != 0) {
            z2 = paymentMethod.isDefaultPaymentMethod;
        }
        if ((i5 & 16) != 0) {
            z10 = paymentMethod.isVerifiedPaymentMethod;
        }
        if ((i5 & 32) != 0) {
            billingAddress = paymentMethod.billingAddress;
        }
        boolean z11 = z10;
        BillingAddress billingAddress2 = billingAddress;
        return paymentMethod.copy(str, i4, cardDetails, z2, z11, billingAddress2);
    }

    @Json(name = "billing_address")
    public static /* synthetic */ void getBillingAddress$annotations() {
    }

    @Json(name = "card_details")
    public static /* synthetic */ void getCardDetails$annotations() {
    }

    @Json(name = "is_default_payment_method")
    public static /* synthetic */ void isDefaultPaymentMethod$annotations() {
    }

    @Json(name = "is_verified_payment_method")
    public static /* synthetic */ void isVerifiedPaymentMethod$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CardDetails getCardDetails() {
        return this.cardDetails;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDefaultPaymentMethod() {
        return this.isDefaultPaymentMethod;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsVerifiedPaymentMethod() {
        return this.isVerifiedPaymentMethod;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    @NotNull
    public final PaymentMethod copy(@NotNull String id2, int type, @Json(name = "card_details") @NotNull CardDetails cardDetails, @Json(name = "is_default_payment_method") boolean isDefaultPaymentMethod, @Json(name = "is_verified_payment_method") boolean isVerifiedPaymentMethod, @Json(name = "billing_address") @Nullable BillingAddress billingAddress) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(cardDetails, "cardDetails");
        return new PaymentMethod(id2, type, cardDetails, isDefaultPaymentMethod, isVerifiedPaymentMethod, billingAddress);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) other;
        return Intrinsics.areEqual(this.id, paymentMethod.id) && this.type == paymentMethod.type && Intrinsics.areEqual(this.cardDetails, paymentMethod.cardDetails) && this.isDefaultPaymentMethod == paymentMethod.isDefaultPaymentMethod && this.isVerifiedPaymentMethod == paymentMethod.isVerifiedPaymentMethod && Intrinsics.areEqual(this.billingAddress, paymentMethod.billingAddress);
    }

    @Nullable
    public final BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    @NotNull
    public final CardDetails getCardDetails() {
        return this.cardDetails;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        int hashCode2 = (this.cardDetails.hashCode() + ((this.type + (this.id.hashCode() * 31)) * 31)) * 31;
        int i5 = 1237;
        if (this.isDefaultPaymentMethod) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = (i4 + hashCode2) * 31;
        if (this.isVerifiedPaymentMethod) {
            i5 = 1231;
        }
        int i11 = (i5 + i10) * 31;
        BillingAddress billingAddress = this.billingAddress;
        if (billingAddress == null) {
            hashCode = 0;
        } else {
            hashCode = billingAddress.hashCode();
        }
        return i11 + hashCode;
    }

    public final boolean isDefaultPaymentMethod() {
        return this.isDefaultPaymentMethod;
    }

    public final boolean isVerifiedPaymentMethod() {
        return this.isVerifiedPaymentMethod;
    }

    @NotNull
    public final String toString() {
        String str = this.id;
        int i4 = this.type;
        CardDetails cardDetails = this.cardDetails;
        boolean z2 = this.isDefaultPaymentMethod;
        boolean z10 = this.isVerifiedPaymentMethod;
        BillingAddress billingAddress = this.billingAddress;
        StringBuilder green = P0.green("PaymentMethod(id=", str, ", type=", ", cardDetails=", i4);
        green.append(cardDetails);
        green.append(", isDefaultPaymentMethod=");
        green.append(z2);
        green.append(", isVerifiedPaymentMethod=");
        green.append(z10);
        green.append(", billingAddress=");
        green.append(billingAddress);
        green.append(")");
        return green.toString();
    }
}
