package com.checkout.components.interfaces.component;

import androidx.appcompat.widget.P0;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.model.CardSchemeName;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.model.CardholderNamePosition;
import com.checkout.components.interfaces.model.DisplayCvvConfiguration;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012BI\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0015R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018¨\u00063"}, d2 = {"Lcom/checkout/components/interfaces/component/CardConfiguration;", "Lcom/checkout/components/interfaces/component/AcceptedCardSchemes;", "Lcom/checkout/components/interfaces/component/AcceptedCardTypes;", "Lcom/checkout/components/interfaces/model/CardholderNamePosition;", "displayCardholderName", "Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;", "displayCvvConfiguration", "", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "acceptedCardSchemes", "Lcom/checkout/components/interfaces/model/CardTypeName;", "acceptedCardTypes", "", "cardholderNameMaxLength", "<init>", "(Lcom/checkout/components/interfaces/model/CardholderNamePosition;Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;Ljava/util/List;Ljava/util/List;I)V", "component1", "()Lcom/checkout/components/interfaces/model/CardholderNamePosition;", "component2", "()Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;", "component3", "()Ljava/util/List;", "component4", "component5", "()I", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/model/CardholderNamePosition;Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;Ljava/util/List;Ljava/util/List;I)Lcom/checkout/components/interfaces/component/CardConfiguration;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/CardholderNamePosition;", "getDisplayCardholderName", "b", "Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;", "getDisplayCvvConfiguration", "c", "Ljava/util/List;", "getAcceptedCardSchemes", Constants.INAPP_DATA_TAG, "getAcceptedCardTypes", "e", "I", "getCardholderNameMaxLength", "Companion", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class CardConfiguration implements AcceptedCardSchemes, AcceptedCardTypes {
    public static final int $stable = 8;
    public static final int MAX_CARDHOLDER_NAME_LENGTH = 255;
    public static final int MIN_CARDHOLDER_NAME_LENGTH = 1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CardholderNamePosition displayCardholderName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final DisplayCvvConfiguration displayCvvConfiguration;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List acceptedCardSchemes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List acceptedCardTypes;

    /* renamed from: e, reason: from kotlin metadata */
    private final int cardholderNameMaxLength;

    public CardConfiguration() {
        this(null, null, null, null, 0, 31, null);
    }

    public static /* synthetic */ CardConfiguration copy$default(CardConfiguration cardConfiguration, CardholderNamePosition cardholderNamePosition, DisplayCvvConfiguration displayCvvConfiguration, List list, List list2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            cardholderNamePosition = cardConfiguration.displayCardholderName;
        }
        if ((i5 & 2) != 0) {
            displayCvvConfiguration = cardConfiguration.displayCvvConfiguration;
        }
        if ((i5 & 4) != 0) {
            list = cardConfiguration.acceptedCardSchemes;
        }
        if ((i5 & 8) != 0) {
            list2 = cardConfiguration.acceptedCardTypes;
        }
        if ((i5 & 16) != 0) {
            i4 = cardConfiguration.cardholderNameMaxLength;
        }
        int i10 = i4;
        List list3 = list;
        return cardConfiguration.copy(cardholderNamePosition, displayCvvConfiguration, list3, list2, i10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CardholderNamePosition getDisplayCardholderName() {
        return this.displayCardholderName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DisplayCvvConfiguration getDisplayCvvConfiguration() {
        return this.displayCvvConfiguration;
    }

    @Nullable
    public final List<CardSchemeName> component3() {
        return this.acceptedCardSchemes;
    }

    @Nullable
    public final List<CardTypeName> component4() {
        return this.acceptedCardTypes;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCardholderNameMaxLength() {
        return this.cardholderNameMaxLength;
    }

    @NotNull
    public final CardConfiguration copy(@NotNull CardholderNamePosition displayCardholderName, @NotNull DisplayCvvConfiguration displayCvvConfiguration, @Nullable List<? extends CardSchemeName> acceptedCardSchemes, @Nullable List<? extends CardTypeName> acceptedCardTypes, int cardholderNameMaxLength) {
        Intrinsics.echo(displayCardholderName, "displayCardholderName");
        Intrinsics.echo(displayCvvConfiguration, "displayCvvConfiguration");
        return new CardConfiguration(displayCardholderName, displayCvvConfiguration, acceptedCardSchemes, acceptedCardTypes, cardholderNameMaxLength);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardConfiguration)) {
            return false;
        }
        CardConfiguration cardConfiguration = (CardConfiguration) other;
        return this.displayCardholderName == cardConfiguration.displayCardholderName && this.displayCvvConfiguration == cardConfiguration.displayCvvConfiguration && Intrinsics.areEqual(this.acceptedCardSchemes, cardConfiguration.acceptedCardSchemes) && Intrinsics.areEqual(this.acceptedCardTypes, cardConfiguration.acceptedCardTypes) && this.cardholderNameMaxLength == cardConfiguration.cardholderNameMaxLength;
    }

    @Override // com.checkout.components.interfaces.component.AcceptedCardSchemes
    @Nullable
    public final List<CardSchemeName> getAcceptedCardSchemes() {
        return this.acceptedCardSchemes;
    }

    @Override // com.checkout.components.interfaces.component.AcceptedCardTypes
    @Nullable
    public final List<CardTypeName> getAcceptedCardTypes() {
        return this.acceptedCardTypes;
    }

    public final int getCardholderNameMaxLength() {
        return this.cardholderNameMaxLength;
    }

    @NotNull
    public final CardholderNamePosition getDisplayCardholderName() {
        return this.displayCardholderName;
    }

    @NotNull
    public final DisplayCvvConfiguration getDisplayCvvConfiguration() {
        return this.displayCvvConfiguration;
    }

    public final int hashCode() {
        int hashCode = (this.displayCvvConfiguration.hashCode() + (this.displayCardholderName.hashCode() * 31)) * 31;
        List list = this.acceptedCardSchemes;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.acceptedCardTypes;
        return this.cardholderNameMaxLength + ((hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        CardholderNamePosition cardholderNamePosition = this.displayCardholderName;
        DisplayCvvConfiguration displayCvvConfiguration = this.displayCvvConfiguration;
        List list = this.acceptedCardSchemes;
        List list2 = this.acceptedCardTypes;
        int i4 = this.cardholderNameMaxLength;
        StringBuilder sb2 = new StringBuilder("CardConfiguration(displayCardholderName=");
        sb2.append(cardholderNamePosition);
        sb2.append(", displayCvvConfiguration=");
        sb2.append(displayCvvConfiguration);
        sb2.append(", acceptedCardSchemes=");
        sb2.append(list);
        sb2.append(", acceptedCardTypes=");
        sb2.append(list2);
        sb2.append(", cardholderNameMaxLength=");
        return P0.cyan(sb2, i4, ")");
    }

    public CardConfiguration(@NotNull CardholderNamePosition displayCardholderName, @NotNull DisplayCvvConfiguration displayCvvConfiguration, @Nullable List<? extends CardSchemeName> list, @Nullable List<? extends CardTypeName> list2, int i4) {
        Intrinsics.echo(displayCardholderName, "displayCardholderName");
        Intrinsics.echo(displayCvvConfiguration, "displayCvvConfiguration");
        this.displayCardholderName = displayCardholderName;
        this.displayCvvConfiguration = displayCvvConfiguration;
        this.acceptedCardSchemes = list;
        this.acceptedCardTypes = list2;
        this.cardholderNameMaxLength = i4;
    }

    public /* synthetic */ CardConfiguration(CardholderNamePosition cardholderNamePosition, DisplayCvvConfiguration displayCvvConfiguration, List list, List list2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? CardholderNamePosition.TOP : cardholderNamePosition, (i5 & 2) != 0 ? DisplayCvvConfiguration.SHOW : displayCvvConfiguration, (i5 & 4) != 0 ? null : list, (i5 & 8) != 0 ? null : list2, (i5 & 16) != 0 ? 255 : i4);
    }
}
