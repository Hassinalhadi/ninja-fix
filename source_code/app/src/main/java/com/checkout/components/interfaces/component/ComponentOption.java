package com.checkout.components.interfaces.component;

import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u001f¨\u0006@"}, d2 = {"Lcom/checkout/components/interfaces/component/ComponentOption;", "", "", "showPayButton", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "callback", "Lcom/checkout/components/interfaces/component/PaymentButtonAction;", "paymentButtonAction", "Lcom/checkout/components/interfaces/component/GooglePayConfiguration;", "googlePayConfiguration", "Lcom/checkout/components/interfaces/component/AddressConfiguration;", "addressConfiguration", "Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", "rememberMeConfiguration", "Lcom/checkout/components/interfaces/component/CardConfiguration;", "cardConfiguration", "<init>", "(Ljava/lang/Boolean;Lcom/checkout/components/interfaces/component/ComponentCallback;Lcom/checkout/components/interfaces/component/PaymentButtonAction;Lcom/checkout/components/interfaces/component/GooglePayConfiguration;Lcom/checkout/components/interfaces/component/AddressConfiguration;Lcom/checkout/components/interfaces/component/RememberMeConfiguration;Lcom/checkout/components/interfaces/component/CardConfiguration;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/checkout/components/interfaces/component/ComponentCallback;", "component3", "()Lcom/checkout/components/interfaces/component/PaymentButtonAction;", "component4", "()Lcom/checkout/components/interfaces/component/GooglePayConfiguration;", "component5", "()Lcom/checkout/components/interfaces/component/AddressConfiguration;", "component6", "()Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", "component7", "()Lcom/checkout/components/interfaces/component/CardConfiguration;", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Lcom/checkout/components/interfaces/component/ComponentCallback;Lcom/checkout/components/interfaces/component/PaymentButtonAction;Lcom/checkout/components/interfaces/component/GooglePayConfiguration;Lcom/checkout/components/interfaces/component/AddressConfiguration;Lcom/checkout/components/interfaces/component/RememberMeConfiguration;Lcom/checkout/components/interfaces/component/CardConfiguration;)Lcom/checkout/components/interfaces/component/ComponentOption;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getShowPayButton", "b", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "getCallback", "c", "Lcom/checkout/components/interfaces/component/PaymentButtonAction;", "getPaymentButtonAction", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/component/GooglePayConfiguration;", "getGooglePayConfiguration", "e", "Lcom/checkout/components/interfaces/component/AddressConfiguration;", "getAddressConfiguration", "f", "Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", "getRememberMeConfiguration", "g", "Lcom/checkout/components/interfaces/component/CardConfiguration;", "getCardConfiguration", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class ComponentOption {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Boolean showPayButton;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ComponentCallback callback;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PaymentButtonAction paymentButtonAction;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final GooglePayConfiguration googlePayConfiguration;

    /* renamed from: e, reason: from kotlin metadata */
    private final AddressConfiguration addressConfiguration;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final RememberMeConfiguration rememberMeConfiguration;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CardConfiguration cardConfiguration;

    public ComponentOption() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static ComponentOption copy$default(ComponentOption componentOption, Boolean bool, ComponentCallback componentCallback, PaymentButtonAction paymentButtonAction, GooglePayConfiguration googlePayConfiguration, AddressConfiguration addressConfiguration, RememberMeConfiguration rememberMeConfiguration, CardConfiguration cardConfiguration, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bool = componentOption.showPayButton;
        }
        if ((i4 & 2) != 0) {
            componentCallback = componentOption.callback;
        }
        if ((i4 & 4) != 0) {
            paymentButtonAction = componentOption.paymentButtonAction;
        }
        if ((i4 & 8) != 0) {
            googlePayConfiguration = componentOption.googlePayConfiguration;
        }
        if ((i4 & 16) != 0) {
            addressConfiguration = componentOption.addressConfiguration;
        }
        if ((i4 & 32) != 0) {
            rememberMeConfiguration = componentOption.rememberMeConfiguration;
        }
        if ((i4 & 64) != 0) {
            cardConfiguration = componentOption.cardConfiguration;
        }
        CardConfiguration cardConfiguration2 = cardConfiguration;
        componentOption.getClass();
        Intrinsics.echo(paymentButtonAction, "paymentButtonAction");
        RememberMeConfiguration rememberMeConfiguration2 = rememberMeConfiguration;
        AddressConfiguration addressConfiguration2 = addressConfiguration;
        PaymentButtonAction paymentButtonAction2 = paymentButtonAction;
        return new ComponentOption(bool, componentCallback, paymentButtonAction2, googlePayConfiguration, addressConfiguration2, rememberMeConfiguration2, cardConfiguration2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getShowPayButton() {
        return this.showPayButton;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ComponentCallback getCallback() {
        return this.callback;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PaymentButtonAction getPaymentButtonAction() {
        return this.paymentButtonAction;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final GooglePayConfiguration getGooglePayConfiguration() {
        return this.googlePayConfiguration;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final AddressConfiguration getAddressConfiguration() {
        return this.addressConfiguration;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final RememberMeConfiguration getRememberMeConfiguration() {
        return this.rememberMeConfiguration;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final CardConfiguration getCardConfiguration() {
        return this.cardConfiguration;
    }

    @NotNull
    public final ComponentOption copy(@Nullable Boolean showPayButton, @Nullable ComponentCallback callback, @NotNull PaymentButtonAction paymentButtonAction, @Nullable GooglePayConfiguration googlePayConfiguration, @Nullable AddressConfiguration addressConfiguration, @Nullable RememberMeConfiguration rememberMeConfiguration, @Nullable CardConfiguration cardConfiguration) {
        Intrinsics.echo(paymentButtonAction, "paymentButtonAction");
        return new ComponentOption(showPayButton, callback, paymentButtonAction, googlePayConfiguration, addressConfiguration, rememberMeConfiguration, cardConfiguration);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComponentOption)) {
            return false;
        }
        ComponentOption componentOption = (ComponentOption) other;
        return Intrinsics.areEqual(this.showPayButton, componentOption.showPayButton) && Intrinsics.areEqual(this.callback, componentOption.callback) && this.paymentButtonAction == componentOption.paymentButtonAction && Intrinsics.areEqual(this.googlePayConfiguration, componentOption.googlePayConfiguration) && Intrinsics.areEqual(this.addressConfiguration, componentOption.addressConfiguration) && Intrinsics.areEqual(this.rememberMeConfiguration, componentOption.rememberMeConfiguration) && Intrinsics.areEqual(this.cardConfiguration, componentOption.cardConfiguration);
    }

    @Nullable
    public final AddressConfiguration getAddressConfiguration() {
        return this.addressConfiguration;
    }

    @Nullable
    public final ComponentCallback getCallback() {
        return this.callback;
    }

    @Nullable
    public final CardConfiguration getCardConfiguration() {
        return this.cardConfiguration;
    }

    @Nullable
    public final GooglePayConfiguration getGooglePayConfiguration() {
        return this.googlePayConfiguration;
    }

    @NotNull
    public final PaymentButtonAction getPaymentButtonAction() {
        return this.paymentButtonAction;
    }

    @Nullable
    public final RememberMeConfiguration getRememberMeConfiguration() {
        return this.rememberMeConfiguration;
    }

    @Nullable
    public final Boolean getShowPayButton() {
        return this.showPayButton;
    }

    public final int hashCode() {
        Boolean bool = this.showPayButton;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ComponentCallback componentCallback = this.callback;
        int hashCode2 = (this.paymentButtonAction.hashCode() + ((hashCode + (componentCallback == null ? 0 : componentCallback.hashCode())) * 31)) * 31;
        GooglePayConfiguration googlePayConfiguration = this.googlePayConfiguration;
        int hashCode3 = (hashCode2 + (googlePayConfiguration == null ? 0 : googlePayConfiguration.hashCode())) * 31;
        AddressConfiguration addressConfiguration = this.addressConfiguration;
        int hashCode4 = (hashCode3 + (addressConfiguration == null ? 0 : addressConfiguration.hashCode())) * 31;
        RememberMeConfiguration rememberMeConfiguration = this.rememberMeConfiguration;
        int hashCode5 = (hashCode4 + (rememberMeConfiguration == null ? 0 : rememberMeConfiguration.hashCode())) * 31;
        CardConfiguration cardConfiguration = this.cardConfiguration;
        return hashCode5 + (cardConfiguration != null ? cardConfiguration.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ComponentOption(showPayButton=" + this.showPayButton + ", callback=" + this.callback + ", paymentButtonAction=" + this.paymentButtonAction + ", googlePayConfiguration=" + this.googlePayConfiguration + ", addressConfiguration=" + this.addressConfiguration + ", rememberMeConfiguration=" + this.rememberMeConfiguration + ", cardConfiguration=" + this.cardConfiguration + ")";
    }

    public ComponentOption(@Nullable Boolean bool, @Nullable ComponentCallback componentCallback, @NotNull PaymentButtonAction paymentButtonAction, @Nullable GooglePayConfiguration googlePayConfiguration, @Nullable AddressConfiguration addressConfiguration, @Nullable RememberMeConfiguration rememberMeConfiguration, @Nullable CardConfiguration cardConfiguration) {
        Intrinsics.echo(paymentButtonAction, "paymentButtonAction");
        this.showPayButton = bool;
        this.callback = componentCallback;
        this.paymentButtonAction = paymentButtonAction;
        this.googlePayConfiguration = googlePayConfiguration;
        this.addressConfiguration = addressConfiguration;
        this.rememberMeConfiguration = rememberMeConfiguration;
        this.cardConfiguration = cardConfiguration;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ComponentOption(java.lang.Boolean r2, com.checkout.components.interfaces.component.ComponentCallback r3, com.checkout.components.interfaces.component.PaymentButtonAction r4, com.checkout.components.interfaces.component.GooglePayConfiguration r5, com.checkout.components.interfaces.component.AddressConfiguration r6, com.checkout.components.interfaces.component.RememberMeConfiguration r7, com.checkout.components.interfaces.component.CardConfiguration r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
        L6:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lc
            r3 = r0
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L12
            com.checkout.components.interfaces.component.PaymentButtonAction r4 = com.checkout.components.interfaces.component.PaymentButtonAction.PAYMENT
        L12:
            r10 = r9 & 8
            if (r10 == 0) goto L17
            r5 = r0
        L17:
            r10 = r9 & 16
            if (r10 == 0) goto L1c
            r6 = r0
        L1c:
            r10 = r9 & 32
            if (r10 == 0) goto L21
            r7 = r0
        L21:
            r9 = r9 & 64
            if (r9 == 0) goto L2e
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L36
        L2e:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L36:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.checkout.components.interfaces.component.ComponentOption.<init>(java.lang.Boolean, com.checkout.components.interfaces.component.ComponentCallback, com.checkout.components.interfaces.component.PaymentButtonAction, com.checkout.components.interfaces.component.GooglePayConfiguration, com.checkout.components.interfaces.component.AddressConfiguration, com.checkout.components.interfaces.component.RememberMeConfiguration, com.checkout.components.interfaces.component.CardConfiguration, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
