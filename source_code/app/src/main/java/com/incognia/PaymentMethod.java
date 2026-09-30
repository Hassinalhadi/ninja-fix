package com.incognia;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/incognia/PaymentMethod;", "", Constants.KEY_TYPE, "", "identifier", "brand", "creditCardInfo", "Lcom/incognia/CardInfo;", "debitCardInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/incognia/CardInfo;Lcom/incognia/CardInfo;)V", "getBrand", "()Ljava/lang/String;", "getCreditCardInfo", "()Lcom/incognia/CardInfo;", "getDebitCardInfo", "getIdentifier", "getType", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Builder", "Companion", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PaymentMethod {
    public static final String AMERICAN_EXPRESS_BRAND = "amex";
    public static final String APPLE_PAY_TYPE = "apple_pay";
    public static final String ARGENCARD_BRAND = "argencard";
    public static final String CABAL_BRAND = "cabal";
    public static final String CREDIT_CARD_TYPE = "credit_card";
    public static final String DEBIT_CARD_TYPE = "debit_card";
    public static final String GOOGLE_PAY_TYPE = "google_pay";
    public static final String MASTERCARD_BRAND = "mastercard";
    public static final String MEAL_VOUCHER_TYPE = "meal_voucher";
    public static final String NU_PAY_TYPE = "nu_pay";
    public static final String PIX_TYPE = "pix";
    public static final String TARJETA_NARANJA_BRAND = "tarjeta_naranja";
    public static final String VISA_BRAND = "visa";
    private final String brand;
    private final CardInfo creditCardInfo;
    private final CardInfo debitCardInfo;
    private final String identifier;
    private final String type;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/incognia/PaymentMethod$Builder;", "", "()V", "brand", "", "creditCardInfo", "Lcom/incognia/CardInfo;", "debitCardInfo", "identifier", Constants.KEY_TYPE, "build", "Lcom/incognia/PaymentMethod;", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {
        private String brand;
        private CardInfo creditCardInfo;
        private CardInfo debitCardInfo;
        private String identifier;
        private String type;

        public final Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public final PaymentMethod build() {
            String str = this.type;
            if (str == null) {
                str = null;
            }
            return new PaymentMethod(str, this.identifier, this.brand, this.creditCardInfo, this.debitCardInfo);
        }

        public final Builder creditCardInfo(CardInfo creditCardInfo) {
            this.creditCardInfo = creditCardInfo;
            return this;
        }

        public final Builder debitCardInfo(CardInfo debitCardInfo) {
            this.debitCardInfo = debitCardInfo;
            return this;
        }

        public final Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        public final Builder type(String type) {
            this.type = type;
            return this;
        }
    }

    public PaymentMethod(String str, String str2, String str3, CardInfo cardInfo, CardInfo cardInfo2) {
        this.type = str;
        this.identifier = str2;
        this.brand = str3;
        this.creditCardInfo = cardInfo;
        this.debitCardInfo = cardInfo2;
    }

    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, String str3, CardInfo cardInfo, CardInfo cardInfo2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = paymentMethod.type;
        }
        if ((i4 & 2) != 0) {
            str2 = paymentMethod.identifier;
        }
        if ((i4 & 4) != 0) {
            str3 = paymentMethod.brand;
        }
        if ((i4 & 8) != 0) {
            cardInfo = paymentMethod.creditCardInfo;
        }
        if ((i4 & 16) != 0) {
            cardInfo2 = paymentMethod.debitCardInfo;
        }
        CardInfo cardInfo3 = cardInfo2;
        String str4 = str3;
        return paymentMethod.copy(str, str2, str4, cardInfo, cardInfo3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* renamed from: component4, reason: from getter */
    public final CardInfo getCreditCardInfo() {
        return this.creditCardInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final CardInfo getDebitCardInfo() {
        return this.debitCardInfo;
    }

    public final PaymentMethod copy(String type, String identifier, String brand, CardInfo creditCardInfo, CardInfo debitCardInfo) {
        return new PaymentMethod(type, identifier, brand, creditCardInfo, debitCardInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) other;
        return Intrinsics.areEqual(this.type, paymentMethod.type) && Intrinsics.areEqual(this.identifier, paymentMethod.identifier) && Intrinsics.areEqual(this.brand, paymentMethod.brand) && Intrinsics.areEqual(this.creditCardInfo, paymentMethod.creditCardInfo) && Intrinsics.areEqual(this.debitCardInfo, paymentMethod.debitCardInfo);
    }

    public final String getBrand() {
        return this.brand;
    }

    public final CardInfo getCreditCardInfo() {
        return this.creditCardInfo;
    }

    public final CardInfo getDebitCardInfo() {
        return this.debitCardInfo;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.identifier;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.brand;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CardInfo cardInfo = this.creditCardInfo;
        int hashCode4 = (hashCode3 + (cardInfo == null ? 0 : cardInfo.hashCode())) * 31;
        CardInfo cardInfo2 = this.debitCardInfo;
        return hashCode4 + (cardInfo2 != null ? cardInfo2.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethod(type=" + this.type + ", identifier=" + this.identifier + ", brand=" + this.brand + ", creditCardInfo=" + this.creditCardInfo + ", debitCardInfo=" + this.debitCardInfo + ')';
    }

    public /* synthetic */ PaymentMethod(String str, String str2, String str3, CardInfo cardInfo, CardInfo cardInfo2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : cardInfo, (i4 & 16) != 0 ? null : cardInfo2);
    }
}
