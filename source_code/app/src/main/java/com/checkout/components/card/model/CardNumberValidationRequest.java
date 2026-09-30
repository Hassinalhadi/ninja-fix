package com.checkout.components.card.model;

import com.checkout.components.ui.model.CardScheme;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0005\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lcom/checkout/components/card/model/CardNumberValidationRequest;", "", "", "cardNumber", "", "isValidatePartialCardNumber", "Lcom/checkout/components/ui/model/CardScheme;", "metadataScheme", "metadataSchemeLocal", "<init>", "(Ljava/lang/String;ZLcom/checkout/components/ui/model/CardScheme;Lcom/checkout/components/ui/model/CardScheme;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/checkout/components/ui/model/CardScheme;", "component4", Constants.COPY_TYPE, "(Ljava/lang/String;ZLcom/checkout/components/ui/model/CardScheme;Lcom/checkout/components/ui/model/CardScheme;)Lcom/checkout/components/card/model/CardNumberValidationRequest;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCardNumber", "b", "Z", "c", "Lcom/checkout/components/ui/model/CardScheme;", "getMetadataScheme", Constants.INAPP_DATA_TAG, "getMetadataSchemeLocal", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardNumberValidationRequest {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String cardNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isValidatePartialCardNumber;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CardScheme metadataScheme;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CardScheme metadataSchemeLocal;

    public CardNumberValidationRequest(@NotNull String cardNumber, boolean z2, @Nullable CardScheme cardScheme, @Nullable CardScheme cardScheme2) {
        Intrinsics.echo(cardNumber, "cardNumber");
        this.cardNumber = cardNumber;
        this.isValidatePartialCardNumber = z2;
        this.metadataScheme = cardScheme;
        this.metadataSchemeLocal = cardScheme2;
    }

    public static CardNumberValidationRequest copy$default(CardNumberValidationRequest cardNumberValidationRequest, String cardNumber, boolean z2, CardScheme cardScheme, CardScheme cardScheme2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cardNumber = cardNumberValidationRequest.cardNumber;
        }
        if ((i4 & 2) != 0) {
            z2 = cardNumberValidationRequest.isValidatePartialCardNumber;
        }
        if ((i4 & 4) != 0) {
            cardScheme = cardNumberValidationRequest.metadataScheme;
        }
        if ((i4 & 8) != 0) {
            cardScheme2 = cardNumberValidationRequest.metadataSchemeLocal;
        }
        cardNumberValidationRequest.getClass();
        Intrinsics.echo(cardNumber, "cardNumber");
        return new CardNumberValidationRequest(cardNumber, z2, cardScheme, cardScheme2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsValidatePartialCardNumber() {
        return this.isValidatePartialCardNumber;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final CardScheme getMetadataScheme() {
        return this.metadataScheme;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final CardScheme getMetadataSchemeLocal() {
        return this.metadataSchemeLocal;
    }

    @NotNull
    public final CardNumberValidationRequest copy(@NotNull String cardNumber, boolean isValidatePartialCardNumber, @Nullable CardScheme metadataScheme, @Nullable CardScheme metadataSchemeLocal) {
        Intrinsics.echo(cardNumber, "cardNumber");
        return new CardNumberValidationRequest(cardNumber, isValidatePartialCardNumber, metadataScheme, metadataSchemeLocal);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardNumberValidationRequest)) {
            return false;
        }
        CardNumberValidationRequest cardNumberValidationRequest = (CardNumberValidationRequest) other;
        return Intrinsics.areEqual(this.cardNumber, cardNumberValidationRequest.cardNumber) && this.isValidatePartialCardNumber == cardNumberValidationRequest.isValidatePartialCardNumber && this.metadataScheme == cardNumberValidationRequest.metadataScheme && this.metadataSchemeLocal == cardNumberValidationRequest.metadataSchemeLocal;
    }

    @NotNull
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @Nullable
    public final CardScheme getMetadataScheme() {
        return this.metadataScheme;
    }

    @Nullable
    public final CardScheme getMetadataSchemeLocal() {
        return this.metadataSchemeLocal;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        int hashCode2 = this.cardNumber.hashCode() * 31;
        if (this.isValidatePartialCardNumber) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i5 = (i4 + hashCode2) * 31;
        CardScheme cardScheme = this.metadataScheme;
        int i10 = 0;
        if (cardScheme == null) {
            hashCode = 0;
        } else {
            hashCode = cardScheme.hashCode();
        }
        int i11 = (i5 + hashCode) * 31;
        CardScheme cardScheme2 = this.metadataSchemeLocal;
        if (cardScheme2 != null) {
            i10 = cardScheme2.hashCode();
        }
        return i11 + i10;
    }

    public final boolean isValidatePartialCardNumber() {
        return this.isValidatePartialCardNumber;
    }

    @NotNull
    public final String toString() {
        return "CardNumberValidationRequest(cardNumber=" + this.cardNumber + ", isValidatePartialCardNumber=" + this.isValidatePartialCardNumber + ", metadataScheme=" + this.metadataScheme + ", metadataSchemeLocal=" + this.metadataSchemeLocal + ")";
    }

    public /* synthetic */ CardNumberValidationRequest(String str, boolean z2, CardScheme cardScheme, CardScheme cardScheme2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? false : z2, cardScheme, cardScheme2);
    }
}
