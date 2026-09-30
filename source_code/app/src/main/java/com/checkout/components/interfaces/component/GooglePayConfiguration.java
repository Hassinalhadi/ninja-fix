package com.checkout.components.interfaces.component;

import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.model.CardSchemeName;
import com.checkout.components.interfaces.model.CardTypeName;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0014¨\u0006-"}, d2 = {"Lcom/checkout/components/interfaces/component/GooglePayConfiguration;", "Lcom/checkout/components/interfaces/component/AcceptedCardSchemes;", "Lcom/checkout/components/interfaces/component/AcceptedCardTypes;", "", "Lcom/checkout/components/interfaces/model/CardSchemeName$GooglePay;", "acceptedCardSchemes", "Lcom/checkout/components/interfaces/model/CardTypeName$GooglePay;", "acceptedCardTypes", "Lcom/checkout/components/interfaces/component/GooglePayButtonTheme;", "buttonTheme", "Lcom/checkout/components/interfaces/component/GooglePayButtonType;", "buttonType", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/checkout/components/interfaces/component/GooglePayButtonTheme;Lcom/checkout/components/interfaces/component/GooglePayButtonType;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Lcom/checkout/components/interfaces/component/GooglePayButtonTheme;", "component4", "()Lcom/checkout/components/interfaces/component/GooglePayButtonType;", Constants.COPY_TYPE, "(Ljava/util/List;Ljava/util/List;Lcom/checkout/components/interfaces/component/GooglePayButtonTheme;Lcom/checkout/components/interfaces/component/GooglePayButtonType;)Lcom/checkout/components/interfaces/component/GooglePayConfiguration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAcceptedCardSchemes", "b", "getAcceptedCardTypes", "c", "Lcom/checkout/components/interfaces/component/GooglePayButtonTheme;", "getButtonTheme", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/component/GooglePayButtonType;", "getButtonType", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class GooglePayConfiguration implements AcceptedCardSchemes, AcceptedCardTypes {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List acceptedCardSchemes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List acceptedCardTypes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final GooglePayButtonTheme buttonTheme;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final GooglePayButtonType buttonType;

    public GooglePayConfiguration() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GooglePayConfiguration copy$default(GooglePayConfiguration googlePayConfiguration, List list, List list2, GooglePayButtonTheme googlePayButtonTheme, GooglePayButtonType googlePayButtonType, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = googlePayConfiguration.acceptedCardSchemes;
        }
        if ((i4 & 2) != 0) {
            list2 = googlePayConfiguration.acceptedCardTypes;
        }
        if ((i4 & 4) != 0) {
            googlePayButtonTheme = googlePayConfiguration.buttonTheme;
        }
        if ((i4 & 8) != 0) {
            googlePayButtonType = googlePayConfiguration.buttonType;
        }
        return googlePayConfiguration.copy(list, list2, googlePayButtonTheme, googlePayButtonType);
    }

    @Nullable
    public final List<CardSchemeName.GooglePay> component1() {
        return this.acceptedCardSchemes;
    }

    @Nullable
    public final List<CardTypeName.GooglePay> component2() {
        return this.acceptedCardTypes;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final GooglePayButtonTheme getButtonTheme() {
        return this.buttonTheme;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final GooglePayButtonType getButtonType() {
        return this.buttonType;
    }

    @NotNull
    public final GooglePayConfiguration copy(@Nullable List<? extends CardSchemeName.GooglePay> acceptedCardSchemes, @Nullable List<? extends CardTypeName.GooglePay> acceptedCardTypes, @NotNull GooglePayButtonTheme buttonTheme, @NotNull GooglePayButtonType buttonType) {
        Intrinsics.echo(buttonTheme, "buttonTheme");
        Intrinsics.echo(buttonType, "buttonType");
        return new GooglePayConfiguration(acceptedCardSchemes, acceptedCardTypes, buttonTheme, buttonType);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayConfiguration)) {
            return false;
        }
        GooglePayConfiguration googlePayConfiguration = (GooglePayConfiguration) other;
        return Intrinsics.areEqual(this.acceptedCardSchemes, googlePayConfiguration.acceptedCardSchemes) && Intrinsics.areEqual(this.acceptedCardTypes, googlePayConfiguration.acceptedCardTypes) && this.buttonTheme == googlePayConfiguration.buttonTheme && this.buttonType == googlePayConfiguration.buttonType;
    }

    @Override // com.checkout.components.interfaces.component.AcceptedCardSchemes
    @Nullable
    public final List<CardSchemeName.GooglePay> getAcceptedCardSchemes() {
        return this.acceptedCardSchemes;
    }

    @Override // com.checkout.components.interfaces.component.AcceptedCardTypes
    @Nullable
    public final List<CardTypeName.GooglePay> getAcceptedCardTypes() {
        return this.acceptedCardTypes;
    }

    @NotNull
    public final GooglePayButtonTheme getButtonTheme() {
        return this.buttonTheme;
    }

    @NotNull
    public final GooglePayButtonType getButtonType() {
        return this.buttonType;
    }

    public final int hashCode() {
        List list = this.acceptedCardSchemes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.acceptedCardTypes;
        return this.buttonType.hashCode() + ((this.buttonTheme.hashCode() + ((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "GooglePayConfiguration(acceptedCardSchemes=" + this.acceptedCardSchemes + ", acceptedCardTypes=" + this.acceptedCardTypes + ", buttonTheme=" + this.buttonTheme + ", buttonType=" + this.buttonType + ")";
    }

    public GooglePayConfiguration(@Nullable List<? extends CardSchemeName.GooglePay> list, @Nullable List<? extends CardTypeName.GooglePay> list2, @NotNull GooglePayButtonTheme buttonTheme, @NotNull GooglePayButtonType buttonType) {
        Intrinsics.echo(buttonTheme, "buttonTheme");
        Intrinsics.echo(buttonType, "buttonType");
        this.acceptedCardSchemes = list;
        this.acceptedCardTypes = list2;
        this.buttonTheme = buttonTheme;
        this.buttonType = buttonType;
    }

    public /* synthetic */ GooglePayConfiguration(List list, List list2, GooglePayButtonTheme googlePayButtonTheme, GooglePayButtonType googlePayButtonType, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : list, (i4 & 2) != 0 ? null : list2, (i4 & 4) != 0 ? GooglePayButtonTheme.DARK : googlePayButtonTheme, (i4 & 8) != 0 ? GooglePayButtonType.BUY : googlePayButtonType);
    }
}
