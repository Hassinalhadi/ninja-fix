package com.checkout.components.card.operations.tokenisation.network.model;

import Q0.c;
import av.q;
import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJt\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0013R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0016R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010.\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u0010\u0013R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b<\u00101\u001a\u0004\b;\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u001dR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bC\u00101\u001a\u0004\bB\u0010\u001f¨\u0006D"}, d2 = {"Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;", "", "", Constants.KEY_TYPE, CTVariableUtils.NUMBER, "", "expiryMonth", "expiryYear", "name", com.checkout.components.rememberme.utils.Constants.CVV_TYPE, "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "billingAddress", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "phone", "Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;", "consumerWallet", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "()Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "component8", "()Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "component9", "()Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;)Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "getNumber", "c", "I", "getExpiryMonth", "getExpiryMonth$annotations", "()V", Constants.INAPP_DATA_TAG, "getExpiryYear", "getExpiryYear$annotations", "e", "getName", "f", "getCvv", "g", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "getBillingAddress", "getBillingAddress$annotations", "h", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "getPhone", "i", "Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;", "getConsumerWallet", "getConsumerWallet$annotations", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TokenRequest {
    public static final int $stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String number;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int expiryMonth;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int expiryYear;

    /* renamed from: e, reason: from kotlin metadata */
    private final String name;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String cvv;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final BillingAddressNetworkEntity billingAddress;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final PhoneNetworkEntity phone;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final ConsumerWallet consumerWallet;

    static {
        int i4 = BillingAddressNetworkEntity.$stable;
        int i5 = PhoneNetworkEntity.$stable;
        $stable = i4 | i5 | i4 | i5;
    }

    public TokenRequest(@NotNull String type, @NotNull String number, @Json(name = "expiry_month") int i4, @Json(name = "expiry_year") int i5, @Nullable String str, @Nullable String str2, @Json(name = "billing_address") @Nullable BillingAddressNetworkEntity billingAddressNetworkEntity, @Nullable PhoneNetworkEntity phoneNetworkEntity, @Json(name = "consumer_wallet") @Nullable ConsumerWallet consumerWallet) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(number, "number");
        this.type = type;
        this.number = number;
        this.expiryMonth = i4;
        this.expiryYear = i5;
        this.name = str;
        this.cvv = str2;
        this.billingAddress = billingAddressNetworkEntity;
        this.phone = phoneNetworkEntity;
        this.consumerWallet = consumerWallet;
    }

    public static /* synthetic */ TokenRequest copy$default(TokenRequest tokenRequest, String str, String str2, int i4, int i5, String str3, String str4, BillingAddressNetworkEntity billingAddressNetworkEntity, PhoneNetworkEntity phoneNetworkEntity, ConsumerWallet consumerWallet, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenRequest.type;
        }
        if ((i10 & 2) != 0) {
            str2 = tokenRequest.number;
        }
        if ((i10 & 4) != 0) {
            i4 = tokenRequest.expiryMonth;
        }
        if ((i10 & 8) != 0) {
            i5 = tokenRequest.expiryYear;
        }
        if ((i10 & 16) != 0) {
            str3 = tokenRequest.name;
        }
        if ((i10 & 32) != 0) {
            str4 = tokenRequest.cvv;
        }
        if ((i10 & 64) != 0) {
            billingAddressNetworkEntity = tokenRequest.billingAddress;
        }
        if ((i10 & 128) != 0) {
            phoneNetworkEntity = tokenRequest.phone;
        }
        if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
            consumerWallet = tokenRequest.consumerWallet;
        }
        PhoneNetworkEntity phoneNetworkEntity2 = phoneNetworkEntity;
        ConsumerWallet consumerWallet2 = consumerWallet;
        String str5 = str4;
        BillingAddressNetworkEntity billingAddressNetworkEntity2 = billingAddressNetworkEntity;
        String str6 = str3;
        int i11 = i4;
        return tokenRequest.copy(str, str2, i11, i5, str6, str5, billingAddressNetworkEntity2, phoneNetworkEntity2, consumerWallet2);
    }

    @Json(name = "billing_address")
    public static /* synthetic */ void getBillingAddress$annotations() {
    }

    @Json(name = "consumer_wallet")
    public static /* synthetic */ void getConsumerWallet$annotations() {
    }

    @Json(name = "expiry_month")
    public static /* synthetic */ void getExpiryMonth$annotations() {
    }

    @Json(name = "expiry_year")
    public static /* synthetic */ void getExpiryYear$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component3, reason: from getter */
    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    /* renamed from: component4, reason: from getter */
    public final int getExpiryYear() {
        return this.expiryYear;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final BillingAddressNetworkEntity getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final ConsumerWallet getConsumerWallet() {
        return this.consumerWallet;
    }

    @NotNull
    public final TokenRequest copy(@NotNull String type, @NotNull String number, @Json(name = "expiry_month") int expiryMonth, @Json(name = "expiry_year") int expiryYear, @Nullable String name, @Nullable String cvv, @Json(name = "billing_address") @Nullable BillingAddressNetworkEntity billingAddress, @Nullable PhoneNetworkEntity phone, @Json(name = "consumer_wallet") @Nullable ConsumerWallet consumerWallet) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(number, "number");
        return new TokenRequest(type, number, expiryMonth, expiryYear, name, cvv, billingAddress, phone, consumerWallet);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenRequest)) {
            return false;
        }
        TokenRequest tokenRequest = (TokenRequest) other;
        return Intrinsics.areEqual(this.type, tokenRequest.type) && Intrinsics.areEqual(this.number, tokenRequest.number) && this.expiryMonth == tokenRequest.expiryMonth && this.expiryYear == tokenRequest.expiryYear && Intrinsics.areEqual(this.name, tokenRequest.name) && Intrinsics.areEqual(this.cvv, tokenRequest.cvv) && Intrinsics.areEqual(this.billingAddress, tokenRequest.billingAddress) && Intrinsics.areEqual(this.phone, tokenRequest.phone) && Intrinsics.areEqual(this.consumerWallet, tokenRequest.consumerWallet);
    }

    @Nullable
    public final BillingAddressNetworkEntity getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    public final ConsumerWallet getConsumerWallet() {
        return this.consumerWallet;
    }

    @Nullable
    public final String getCvv() {
        return this.cvv;
    }

    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    public final int getExpiryYear() {
        return this.expiryYear;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    @Nullable
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int sierra = (this.expiryYear + ((this.expiryMonth + AbstractC2327c.sierra(this.type.hashCode() * 31, 31, this.number)) * 31)) * 31;
        String str = this.name;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (sierra + hashCode) * 31;
        String str2 = this.cvv;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.billingAddress;
        if (billingAddressNetworkEntity == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = billingAddressNetworkEntity.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        if (phoneNetworkEntity == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = phoneNetworkEntity.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        ConsumerWallet consumerWallet = this.consumerWallet;
        if (consumerWallet != null) {
            i4 = consumerWallet.hashCode();
        }
        return i12 + i4;
    }

    @NotNull
    public final String toString() {
        String str = this.type;
        String str2 = this.number;
        int i4 = this.expiryMonth;
        int i5 = this.expiryYear;
        String str3 = this.name;
        String str4 = this.cvv;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.billingAddress;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        ConsumerWallet consumerWallet = this.consumerWallet;
        StringBuilder india = q.india("TokenRequest(type=", str, ", number=", str2, ", expiryMonth=");
        india.append(i4);
        india.append(", expiryYear=");
        india.append(i5);
        india.append(", name=");
        c.azure(india, str3, ", cvv=", str4, ", billingAddress=");
        india.append(billingAddressNetworkEntity);
        india.append(", phone=");
        india.append(phoneNetworkEntity);
        india.append(", consumerWallet=");
        india.append(consumerWallet);
        india.append(")");
        return india.toString();
    }

    public /* synthetic */ TokenRequest(String str, String str2, int i4, int i5, String str3, String str4, BillingAddressNetworkEntity billingAddressNetworkEntity, PhoneNetworkEntity phoneNetworkEntity, ConsumerWallet consumerWallet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i4, i5, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : billingAddressNetworkEntity, (i10 & 128) != 0 ? null : phoneNetworkEntity, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : consumerWallet);
    }
}
