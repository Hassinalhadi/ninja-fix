package com.checkout.components.wallet.data.dto;

import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JX\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0016¨\u00060"}, d2 = {"Lcom/checkout/components/wallet/data/dto/CardParameters;", "", "", "", "allowedAuthMethods", "allowedCardNetworks", "", "allowPrepaidCards", "allowCreditCards", "billingAddressRequired", "Lcom/checkout/components/wallet/data/dto/BillingAddressParameters;", "billingAddressParameters", "<init>", "(Ljava/util/List;Ljava/util/List;ZZZLcom/checkout/components/wallet/data/dto/BillingAddressParameters;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Z", "component4", "component5", "component6", "()Lcom/checkout/components/wallet/data/dto/BillingAddressParameters;", Constants.COPY_TYPE, "(Ljava/util/List;Ljava/util/List;ZZZLcom/checkout/components/wallet/data/dto/BillingAddressParameters;)Lcom/checkout/components/wallet/data/dto/CardParameters;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAllowedAuthMethods", "b", "getAllowedCardNetworks", "c", "Z", "getAllowPrepaidCards", Constants.INAPP_DATA_TAG, "getAllowCreditCards", "e", "getBillingAddressRequired", "f", "Lcom/checkout/components/wallet/data/dto/BillingAddressParameters;", "getBillingAddressParameters", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardParameters {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List allowedAuthMethods;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List allowedCardNetworks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean allowPrepaidCards;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean allowCreditCards;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean billingAddressRequired;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final BillingAddressParameters billingAddressParameters;

    public CardParameters(List<String> allowedAuthMethods, List<String> allowedCardNetworks, boolean z2, boolean z10, boolean z11, BillingAddressParameters billingAddressParameters) {
        Intrinsics.echo(allowedAuthMethods, "allowedAuthMethods");
        Intrinsics.echo(allowedCardNetworks, "allowedCardNetworks");
        Intrinsics.echo(billingAddressParameters, "billingAddressParameters");
        this.allowedAuthMethods = allowedAuthMethods;
        this.allowedCardNetworks = allowedCardNetworks;
        this.allowPrepaidCards = z2;
        this.allowCreditCards = z10;
        this.billingAddressRequired = z11;
        this.billingAddressParameters = billingAddressParameters;
    }

    public static /* synthetic */ CardParameters copy$default(CardParameters cardParameters, List list, List list2, boolean z2, boolean z10, boolean z11, BillingAddressParameters billingAddressParameters, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = cardParameters.allowedAuthMethods;
        }
        if ((i4 & 2) != 0) {
            list2 = cardParameters.allowedCardNetworks;
        }
        if ((i4 & 4) != 0) {
            z2 = cardParameters.allowPrepaidCards;
        }
        if ((i4 & 8) != 0) {
            z10 = cardParameters.allowCreditCards;
        }
        if ((i4 & 16) != 0) {
            z11 = cardParameters.billingAddressRequired;
        }
        if ((i4 & 32) != 0) {
            billingAddressParameters = cardParameters.billingAddressParameters;
        }
        boolean z12 = z11;
        BillingAddressParameters billingAddressParameters2 = billingAddressParameters;
        return cardParameters.copy(list, list2, z2, z10, z12, billingAddressParameters2);
    }

    public final List<String> component1() {
        return this.allowedAuthMethods;
    }

    public final List<String> component2() {
        return this.allowedCardNetworks;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAllowPrepaidCards() {
        return this.allowPrepaidCards;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAllowCreditCards() {
        return this.allowCreditCards;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getBillingAddressRequired() {
        return this.billingAddressRequired;
    }

    /* renamed from: component6, reason: from getter */
    public final BillingAddressParameters getBillingAddressParameters() {
        return this.billingAddressParameters;
    }

    public final CardParameters copy(List<String> allowedAuthMethods, List<String> allowedCardNetworks, boolean allowPrepaidCards, boolean allowCreditCards, boolean billingAddressRequired, BillingAddressParameters billingAddressParameters) {
        Intrinsics.echo(allowedAuthMethods, "allowedAuthMethods");
        Intrinsics.echo(allowedCardNetworks, "allowedCardNetworks");
        Intrinsics.echo(billingAddressParameters, "billingAddressParameters");
        return new CardParameters(allowedAuthMethods, allowedCardNetworks, allowPrepaidCards, allowCreditCards, billingAddressRequired, billingAddressParameters);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardParameters)) {
            return false;
        }
        CardParameters cardParameters = (CardParameters) other;
        return Intrinsics.areEqual(this.allowedAuthMethods, cardParameters.allowedAuthMethods) && Intrinsics.areEqual(this.allowedCardNetworks, cardParameters.allowedCardNetworks) && this.allowPrepaidCards == cardParameters.allowPrepaidCards && this.allowCreditCards == cardParameters.allowCreditCards && this.billingAddressRequired == cardParameters.billingAddressRequired && Intrinsics.areEqual(this.billingAddressParameters, cardParameters.billingAddressParameters);
    }

    public final boolean getAllowCreditCards() {
        return this.allowCreditCards;
    }

    public final boolean getAllowPrepaidCards() {
        return this.allowPrepaidCards;
    }

    public final List<String> getAllowedAuthMethods() {
        return this.allowedAuthMethods;
    }

    public final List<String> getAllowedCardNetworks() {
        return this.allowedCardNetworks;
    }

    public final BillingAddressParameters getBillingAddressParameters() {
        return this.billingAddressParameters;
    }

    public final boolean getBillingAddressRequired() {
        return this.billingAddressRequired;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int golf = j.golf(this.allowedAuthMethods.hashCode() * 31, 31, this.allowedCardNetworks);
        int i10 = 1237;
        if (this.allowPrepaidCards) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = (i4 + golf) * 31;
        if (this.allowCreditCards) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i12 = (i5 + i11) * 31;
        if (this.billingAddressRequired) {
            i10 = 1231;
        }
        return this.billingAddressParameters.hashCode() + ((i10 + i12) * 31);
    }

    public final String toString() {
        return "CardParameters(allowedAuthMethods=" + this.allowedAuthMethods + ", allowedCardNetworks=" + this.allowedCardNetworks + ", allowPrepaidCards=" + this.allowPrepaidCards + ", allowCreditCards=" + this.allowCreditCards + ", billingAddressRequired=" + this.billingAddressRequired + ", billingAddressParameters=" + this.billingAddressParameters + ")";
    }
}
