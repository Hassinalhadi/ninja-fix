package com.checkout.components.wallet.data.dto;

import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJD\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000f¨\u0006%"}, d2 = {"Lcom/checkout/components/wallet/data/dto/PaymentMethodCardParameters;", "", "", "", "allowedAuthMethods", "allowedCardNetworks", "", "allowPrepaidCards", "allowCreditCards", "<init>", "(Ljava/util/List;Ljava/util/List;ZZ)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Z", "component4", Constants.COPY_TYPE, "(Ljava/util/List;Ljava/util/List;ZZ)Lcom/checkout/components/wallet/data/dto/PaymentMethodCardParameters;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAllowedAuthMethods", "b", "getAllowedCardNetworks", "c", "Z", "getAllowPrepaidCards", Constants.INAPP_DATA_TAG, "getAllowCreditCards", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethodCardParameters {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List allowedAuthMethods;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List allowedCardNetworks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean allowPrepaidCards;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean allowCreditCards;

    public PaymentMethodCardParameters(List<String> allowedAuthMethods, List<String> allowedCardNetworks, boolean z2, boolean z10) {
        Intrinsics.echo(allowedAuthMethods, "allowedAuthMethods");
        Intrinsics.echo(allowedCardNetworks, "allowedCardNetworks");
        this.allowedAuthMethods = allowedAuthMethods;
        this.allowedCardNetworks = allowedCardNetworks;
        this.allowPrepaidCards = z2;
        this.allowCreditCards = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodCardParameters copy$default(PaymentMethodCardParameters paymentMethodCardParameters, List list, List list2, boolean z2, boolean z10, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = paymentMethodCardParameters.allowedAuthMethods;
        }
        if ((i4 & 2) != 0) {
            list2 = paymentMethodCardParameters.allowedCardNetworks;
        }
        if ((i4 & 4) != 0) {
            z2 = paymentMethodCardParameters.allowPrepaidCards;
        }
        if ((i4 & 8) != 0) {
            z10 = paymentMethodCardParameters.allowCreditCards;
        }
        return paymentMethodCardParameters.copy(list, list2, z2, z10);
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

    public final PaymentMethodCardParameters copy(List<String> allowedAuthMethods, List<String> allowedCardNetworks, boolean allowPrepaidCards, boolean allowCreditCards) {
        Intrinsics.echo(allowedAuthMethods, "allowedAuthMethods");
        Intrinsics.echo(allowedCardNetworks, "allowedCardNetworks");
        return new PaymentMethodCardParameters(allowedAuthMethods, allowedCardNetworks, allowPrepaidCards, allowCreditCards);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodCardParameters)) {
            return false;
        }
        PaymentMethodCardParameters paymentMethodCardParameters = (PaymentMethodCardParameters) other;
        return Intrinsics.areEqual(this.allowedAuthMethods, paymentMethodCardParameters.allowedAuthMethods) && Intrinsics.areEqual(this.allowedCardNetworks, paymentMethodCardParameters.allowedCardNetworks) && this.allowPrepaidCards == paymentMethodCardParameters.allowPrepaidCards && this.allowCreditCards == paymentMethodCardParameters.allowCreditCards;
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

    public final int hashCode() {
        int i4;
        int golf = j.golf(this.allowedAuthMethods.hashCode() * 31, 31, this.allowedCardNetworks);
        int i5 = 1237;
        if (this.allowPrepaidCards) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = (i4 + golf) * 31;
        if (this.allowCreditCards) {
            i5 = 1231;
        }
        return i5 + i10;
    }

    public final String toString() {
        return "PaymentMethodCardParameters(allowedAuthMethods=" + this.allowedAuthMethods + ", allowedCardNetworks=" + this.allowedCardNetworks + ", allowPrepaidCards=" + this.allowPrepaidCards + ", allowCreditCards=" + this.allowCreditCards + ")";
    }
}
