package com.checkout.components.card.model;

import Q0.n;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.ui.data.SupportedTypesRepository;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010#\u001a\u00020\tHÀ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÀ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÀ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010.\u001a\u00020\u0010HÀ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u00101\u001a\u00020\u0012HÀ\u0003¢\u0006\u0004\b/\u00100Jz\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b4\u0010\"J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010?\u001a\u0004\bB\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010%R\u001a\u0010\r\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\bM\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010*R\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010-R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u00100¨\u0006W"}, d2 = {"Lcom/checkout/components/card/model/CardComponentConfig;", "", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "componentCallback", "", "shouldInvokeOnReady", "showPayButton", "Lcom/checkout/components/interfaces/component/AddressConfiguration;", "addressConfiguration", "", "paymentSessionId", "Lcom/checkout/components/rememberme/CheckoutRememberMe;", "rememberMe", "renderRememberMe", "Lcom/checkout/components/interfaces/component/CardConfiguration;", "cardConfiguration", "Lcom/checkout/components/ui/data/SupportedTypesRepository;", "supportedTypesRepository", "LQ0/n;", "layoutDirection", "<init>", "(Lcom/checkout/components/interfaces/component/ComponentCallback;ZZLcom/checkout/components/interfaces/component/AddressConfiguration;Ljava/lang/String;Lcom/checkout/components/rememberme/CheckoutRememberMe;ZLcom/checkout/components/interfaces/component/CardConfiguration;Lcom/checkout/components/ui/data/SupportedTypesRepository;LQ0/n;)V", "component1$card_standardRelease", "()Lcom/checkout/components/interfaces/component/ComponentCallback;", "component1", "component2$card_standardRelease", "()Z", "component2", "component3$card_standardRelease", "component3", "component4$card_standardRelease", "()Lcom/checkout/components/interfaces/component/AddressConfiguration;", "component4", "component5$card_standardRelease", "()Ljava/lang/String;", "component5", "component6$card_standardRelease", "()Lcom/checkout/components/rememberme/CheckoutRememberMe;", "component6", "component7$card_standardRelease", "component7", "component8$card_standardRelease", "()Lcom/checkout/components/interfaces/component/CardConfiguration;", "component8", "component9$card_standardRelease", "()Lcom/checkout/components/ui/data/SupportedTypesRepository;", "component9", "component10$card_standardRelease", "()LQ0/n;", "component10", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/component/ComponentCallback;ZZLcom/checkout/components/interfaces/component/AddressConfiguration;Ljava/lang/String;Lcom/checkout/components/rememberme/CheckoutRememberMe;ZLcom/checkout/components/interfaces/component/CardConfiguration;Lcom/checkout/components/ui/data/SupportedTypesRepository;LQ0/n;)Lcom/checkout/components/card/model/CardComponentConfig;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "getComponentCallback$card_standardRelease", "b", "Z", "getShouldInvokeOnReady$card_standardRelease", "c", "getShowPayButton$card_standardRelease", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/component/AddressConfiguration;", "getAddressConfiguration$card_standardRelease", "e", "Ljava/lang/String;", "getPaymentSessionId$card_standardRelease", "f", "Lcom/checkout/components/rememberme/CheckoutRememberMe;", "getRememberMe$card_standardRelease", "g", "getRenderRememberMe$card_standardRelease", "h", "Lcom/checkout/components/interfaces/component/CardConfiguration;", "getCardConfiguration$card_standardRelease", "i", "Lcom/checkout/components/ui/data/SupportedTypesRepository;", "getSupportedTypesRepository$card_standardRelease", "j", "LQ0/n;", "getLayoutDirection$card_standardRelease", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardComponentConfig {
    public static final int $stable = (((SupportedTypesRepository.$stable | CardConfiguration.$stable) | CheckoutRememberMe.$stable) | AddressConfiguration.$stable) | ComponentCallback.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ComponentCallback componentCallback;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldInvokeOnReady;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean showPayButton;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AddressConfiguration addressConfiguration;

    /* renamed from: e, reason: from kotlin metadata */
    private final String paymentSessionId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CheckoutRememberMe rememberMe;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean renderRememberMe;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CardConfiguration cardConfiguration;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final SupportedTypesRepository supportedTypesRepository;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final n layoutDirection;

    public CardComponentConfig(@NotNull ComponentCallback componentCallback, boolean z2, boolean z10, @Nullable AddressConfiguration addressConfiguration, @NotNull String paymentSessionId, @Nullable CheckoutRememberMe checkoutRememberMe, boolean z11, @Nullable CardConfiguration cardConfiguration, @NotNull SupportedTypesRepository supportedTypesRepository, @NotNull n layoutDirection) {
        Intrinsics.echo(componentCallback, "componentCallback");
        Intrinsics.echo(paymentSessionId, "paymentSessionId");
        Intrinsics.echo(supportedTypesRepository, "supportedTypesRepository");
        Intrinsics.echo(layoutDirection, "layoutDirection");
        this.componentCallback = componentCallback;
        this.shouldInvokeOnReady = z2;
        this.showPayButton = z10;
        this.addressConfiguration = addressConfiguration;
        this.paymentSessionId = paymentSessionId;
        this.rememberMe = checkoutRememberMe;
        this.renderRememberMe = z11;
        this.cardConfiguration = cardConfiguration;
        this.supportedTypesRepository = supportedTypesRepository;
        this.layoutDirection = layoutDirection;
    }

    public static /* synthetic */ CardComponentConfig copy$default(CardComponentConfig cardComponentConfig, ComponentCallback componentCallback, boolean z2, boolean z10, AddressConfiguration addressConfiguration, String str, CheckoutRememberMe checkoutRememberMe, boolean z11, CardConfiguration cardConfiguration, SupportedTypesRepository supportedTypesRepository, n nVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            componentCallback = cardComponentConfig.componentCallback;
        }
        if ((i4 & 2) != 0) {
            z2 = cardComponentConfig.shouldInvokeOnReady;
        }
        if ((i4 & 4) != 0) {
            z10 = cardComponentConfig.showPayButton;
        }
        if ((i4 & 8) != 0) {
            addressConfiguration = cardComponentConfig.addressConfiguration;
        }
        if ((i4 & 16) != 0) {
            str = cardComponentConfig.paymentSessionId;
        }
        if ((i4 & 32) != 0) {
            checkoutRememberMe = cardComponentConfig.rememberMe;
        }
        if ((i4 & 64) != 0) {
            z11 = cardComponentConfig.renderRememberMe;
        }
        if ((i4 & 128) != 0) {
            cardConfiguration = cardComponentConfig.cardConfiguration;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            supportedTypesRepository = cardComponentConfig.supportedTypesRepository;
        }
        if ((i4 & 512) != 0) {
            nVar = cardComponentConfig.layoutDirection;
        }
        SupportedTypesRepository supportedTypesRepository2 = supportedTypesRepository;
        n nVar2 = nVar;
        boolean z12 = z11;
        CardConfiguration cardConfiguration2 = cardConfiguration;
        String str2 = str;
        CheckoutRememberMe checkoutRememberMe2 = checkoutRememberMe;
        return cardComponentConfig.copy(componentCallback, z2, z10, addressConfiguration, str2, checkoutRememberMe2, z12, cardConfiguration2, supportedTypesRepository2, nVar2);
    }

    @NotNull
    /* renamed from: component1$card_standardRelease, reason: from getter */
    public final ComponentCallback getComponentCallback() {
        return this.componentCallback;
    }

    @NotNull
    /* renamed from: component10$card_standardRelease, reason: from getter */
    public final n getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: component2$card_standardRelease, reason: from getter */
    public final boolean getShouldInvokeOnReady() {
        return this.shouldInvokeOnReady;
    }

    /* renamed from: component3$card_standardRelease, reason: from getter */
    public final boolean getShowPayButton() {
        return this.showPayButton;
    }

    @Nullable
    /* renamed from: component4$card_standardRelease, reason: from getter */
    public final AddressConfiguration getAddressConfiguration() {
        return this.addressConfiguration;
    }

    @NotNull
    /* renamed from: component5$card_standardRelease, reason: from getter */
    public final String getPaymentSessionId() {
        return this.paymentSessionId;
    }

    @Nullable
    /* renamed from: component6$card_standardRelease, reason: from getter */
    public final CheckoutRememberMe getRememberMe() {
        return this.rememberMe;
    }

    /* renamed from: component7$card_standardRelease, reason: from getter */
    public final boolean getRenderRememberMe() {
        return this.renderRememberMe;
    }

    @Nullable
    /* renamed from: component8$card_standardRelease, reason: from getter */
    public final CardConfiguration getCardConfiguration() {
        return this.cardConfiguration;
    }

    @NotNull
    /* renamed from: component9$card_standardRelease, reason: from getter */
    public final SupportedTypesRepository getSupportedTypesRepository() {
        return this.supportedTypesRepository;
    }

    @NotNull
    public final CardComponentConfig copy(@NotNull ComponentCallback componentCallback, boolean shouldInvokeOnReady, boolean showPayButton, @Nullable AddressConfiguration addressConfiguration, @NotNull String paymentSessionId, @Nullable CheckoutRememberMe rememberMe, boolean renderRememberMe, @Nullable CardConfiguration cardConfiguration, @NotNull SupportedTypesRepository supportedTypesRepository, @NotNull n layoutDirection) {
        Intrinsics.echo(componentCallback, "componentCallback");
        Intrinsics.echo(paymentSessionId, "paymentSessionId");
        Intrinsics.echo(supportedTypesRepository, "supportedTypesRepository");
        Intrinsics.echo(layoutDirection, "layoutDirection");
        return new CardComponentConfig(componentCallback, shouldInvokeOnReady, showPayButton, addressConfiguration, paymentSessionId, rememberMe, renderRememberMe, cardConfiguration, supportedTypesRepository, layoutDirection);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardComponentConfig)) {
            return false;
        }
        CardComponentConfig cardComponentConfig = (CardComponentConfig) other;
        return Intrinsics.areEqual(this.componentCallback, cardComponentConfig.componentCallback) && this.shouldInvokeOnReady == cardComponentConfig.shouldInvokeOnReady && this.showPayButton == cardComponentConfig.showPayButton && Intrinsics.areEqual(this.addressConfiguration, cardComponentConfig.addressConfiguration) && Intrinsics.areEqual(this.paymentSessionId, cardComponentConfig.paymentSessionId) && Intrinsics.areEqual(this.rememberMe, cardComponentConfig.rememberMe) && this.renderRememberMe == cardComponentConfig.renderRememberMe && Intrinsics.areEqual(this.cardConfiguration, cardComponentConfig.cardConfiguration) && Intrinsics.areEqual(this.supportedTypesRepository, cardComponentConfig.supportedTypesRepository) && this.layoutDirection == cardComponentConfig.layoutDirection;
    }

    @Nullable
    public final AddressConfiguration getAddressConfiguration$card_standardRelease() {
        return this.addressConfiguration;
    }

    @Nullable
    public final CardConfiguration getCardConfiguration$card_standardRelease() {
        return this.cardConfiguration;
    }

    @NotNull
    public final ComponentCallback getComponentCallback$card_standardRelease() {
        return this.componentCallback;
    }

    @NotNull
    public final n getLayoutDirection$card_standardRelease() {
        return this.layoutDirection;
    }

    @NotNull
    public final String getPaymentSessionId$card_standardRelease() {
        return this.paymentSessionId;
    }

    @Nullable
    public final CheckoutRememberMe getRememberMe$card_standardRelease() {
        return this.rememberMe;
    }

    public final boolean getRenderRememberMe$card_standardRelease() {
        return this.renderRememberMe;
    }

    public final boolean getShouldInvokeOnReady$card_standardRelease() {
        return this.shouldInvokeOnReady;
    }

    public final boolean getShowPayButton$card_standardRelease() {
        return this.showPayButton;
    }

    @NotNull
    public final SupportedTypesRepository getSupportedTypesRepository$card_standardRelease() {
        return this.supportedTypesRepository;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int hashCode;
        int hashCode2;
        int hashCode3 = this.componentCallback.hashCode() * 31;
        int i10 = 1237;
        if (this.shouldInvokeOnReady) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = (i4 + hashCode3) * 31;
        if (this.showPayButton) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i12 = (i5 + i11) * 31;
        AddressConfiguration addressConfiguration = this.addressConfiguration;
        int i13 = 0;
        if (addressConfiguration == null) {
            hashCode = 0;
        } else {
            hashCode = addressConfiguration.hashCode();
        }
        int sierra = AbstractC2327c.sierra((i12 + hashCode) * 31, 31, this.paymentSessionId);
        CheckoutRememberMe checkoutRememberMe = this.rememberMe;
        if (checkoutRememberMe == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = checkoutRememberMe.hashCode();
        }
        int i14 = (sierra + hashCode2) * 31;
        if (this.renderRememberMe) {
            i10 = 1231;
        }
        int i15 = (i10 + i14) * 31;
        CardConfiguration cardConfiguration = this.cardConfiguration;
        if (cardConfiguration != null) {
            i13 = cardConfiguration.hashCode();
        }
        return this.layoutDirection.hashCode() + ((this.supportedTypesRepository.hashCode() + ((i15 + i13) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "CardComponentConfig(componentCallback=" + this.componentCallback + ", shouldInvokeOnReady=" + this.shouldInvokeOnReady + ", showPayButton=" + this.showPayButton + ", addressConfiguration=" + this.addressConfiguration + ", paymentSessionId=" + this.paymentSessionId + ", rememberMe=" + this.rememberMe + ", renderRememberMe=" + this.renderRememberMe + ", cardConfiguration=" + this.cardConfiguration + ", supportedTypesRepository=" + this.supportedTypesRepository + ", layoutDirection=" + this.layoutDirection + ")";
    }
}
