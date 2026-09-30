package com.checkout.components.card;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import com.checkout.components.card.CardComponentViewRenderer;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.di.injector.CardInjector;
import com.checkout.components.card.model.CardComponentConfig;
import com.checkout.components.card.ui.CardPaymentViewKt;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.card.utils.extensions.CommonExtensionsKt;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.interfaces.model.CardholderNamePosition;
import com.checkout.components.interfaces.model.DisplayCvvConfiguration;
import com.checkout.components.interfaces.ui.ViewRenderer;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.clevertap.android.sdk.Constants;
import ge.InterfaceC1775g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028AX\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048AX\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/checkout/components/card/CardComponentViewRenderer;", "Lcom/checkout/components/interfaces/ui/ViewRenderer;", "Lcom/checkout/components/card/model/CardComponentConfig;", Constants.KEY_CONFIG, "Lcom/checkout/components/card/CardComponent;", "cardComponent", "Lcom/checkout/components/card/di/base/Injector;", "injector", "<init>", "(Lcom/checkout/components/card/model/CardComponentConfig;Lcom/checkout/components/card/CardComponent;Lcom/checkout/components/card/di/base/Injector;)V", "", "RenderCard", "(Landroidx/compose/runtime/m;I)V", "", "isCvvShown", "(Landroidx/compose/runtime/m;I)Z", "Render", "RenderAddCardView", "a", "Lcom/checkout/components/card/model/CardComponentConfig;", "getConfig$card_standardRelease", "()Lcom/checkout/components/card/model/CardComponentConfig;", "b", "Lcom/checkout/components/card/CardComponent;", "getCardComponent$card_standardRelease", "()Lcom/checkout/components/card/CardComponent;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardComponentViewRenderer implements ViewRenderer {
    public static final int $stable = 8;

    /* renamed from: a, reason: from kotlin metadata */
    private final CardComponentConfig com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String;

    /* renamed from: b, reason: from kotlin metadata */
    private final CardComponent cardComponent;

    /* renamed from: c */
    private final Injector f3939c;

    public CardComponentViewRenderer(@NotNull CardComponentConfig config, @NotNull CardComponent cardComponent, @NotNull Injector injector) {
        Intrinsics.echo(config, "config");
        Intrinsics.echo(cardComponent, "cardComponent");
        Intrinsics.echo(injector, "injector");
        this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String = config;
        this.cardComponent = cardComponent;
        this.f3939c = injector;
    }

    public static final Unit Render$lambda$1(CardComponentViewRenderer cardComponentViewRenderer, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            cardComponentViewRenderer.RenderCard(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit Render$lambda$2(CardComponentViewRenderer cardComponentViewRenderer, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            cardComponentViewRenderer.RenderAddCardView(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    private final void RenderCard(InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        CardholderNamePosition cardholderNamePosition;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-942438441);
        if ((i4 & 6) == 0) {
            if (c0585q.india(this)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        boolean z10 = true;
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            Injector injector = this.f3939c;
            boolean showPayButton$card_standardRelease = this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getShowPayButton$card_standardRelease();
            if (this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getAddressConfiguration$card_standardRelease() == null) {
                z10 = false;
            }
            String paymentSessionId$card_standardRelease = this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getPaymentSessionId$card_standardRelease();
            CardConfiguration cardConfiguration$card_standardRelease = this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getCardConfiguration$card_standardRelease();
            if (cardConfiguration$card_standardRelease == null || (cardholderNamePosition = cardConfiguration$card_standardRelease.getDisplayCardholderName()) == null) {
                cardholderNamePosition = CardholderNamePosition.TOP;
            }
            CardPaymentViewKt.CardPaymentView(injector, showPayButton$card_standardRelease, z10, true, paymentSessionId$card_standardRelease, cardholderNamePosition, isCvvShown(c0585q, i5 & 14), this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getLayoutDirection$card_standardRelease(), c0585q, 3072);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new k4.e(this, i4, 1);
        }
    }

    public static final Unit a(CardComponentViewRenderer cardComponentViewRenderer, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        cardComponentViewRenderer.Render(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit b(CardComponentViewRenderer cardComponentViewRenderer, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        cardComponentViewRenderer.RenderAddCardView(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit c(CardComponentViewRenderer cardComponentViewRenderer, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        cardComponentViewRenderer.RenderCard(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private final boolean isCvvShown(InterfaceC0581m interfaceC0581m, int i4) {
        DisplayCvvConfiguration displayCvvConfiguration;
        Injector injector = this.f3939c;
        Intrinsics.charlie(injector, "null cannot be cast to non-null type com.checkout.components.card.di.injector.CardInjector");
        PaymentStateManager paymentStateManager = ((CardInjector) injector).paymentStateManager();
        CardConfiguration cardConfiguration$card_standardRelease = this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getCardConfiguration$card_standardRelease();
        if (cardConfiguration$card_standardRelease != null) {
            displayCvvConfiguration = cardConfiguration$card_standardRelease.getDisplayCvvConfiguration();
        } else {
            displayCvvConfiguration = null;
        }
        return CommonExtensionsKt.isCvvFieldDisplayed(displayCvvConfiguration, ((Boolean) C0564b.mike(paymentStateManager.getIsCvvRequiredScheme(), interfaceC0581m, 0).getValue()).booleanValue());
    }

    @Override // com.checkout.components.interfaces.ui.ViewRenderer
    public void Render(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        Function1<PaymentMethodComponent, Unit> onReady;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1305796359);
        if ((i4 & 6) == 0) {
            if (c0585q.india(this)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            if (this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getShouldInvokeOnReady$card_standardRelease() && (onReady = this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getComponentCallback$card_standardRelease().getOnReady()) != null) {
                onReady.invoke(this.cardComponent);
            }
            CheckoutRememberMe rememberMe$card_standardRelease = this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getRememberMe$card_standardRelease();
            Unit unit = null;
            if (rememberMe$card_standardRelease == null || !this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getRenderRememberMe$card_standardRelease()) {
                rememberMe$card_standardRelease = null;
            }
            if (rememberMe$card_standardRelease == null) {
                c0585q.purple(1460775347);
                c0585q.quebec(false);
            } else {
                c0585q.purple(739858446);
                final int i11 = 0;
                P.d echo = P.e.echo(-942309191, new Xd.l(this) { // from class: k4.d
                    public final /* synthetic */ CardComponentViewRenderer purple;

                    {
                        this.purple = this;
                    }

                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Render$lambda$1;
                        Unit Render$lambda$2;
                        int i12 = i11;
                        InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i12) {
                            case 0:
                                Render$lambda$1 = CardComponentViewRenderer.Render$lambda$1(this.purple, interfaceC0581m2, intValue);
                                return Render$lambda$1;
                            default:
                                Render$lambda$2 = CardComponentViewRenderer.Render$lambda$2(this.purple, interfaceC0581m2, intValue);
                                return Render$lambda$2;
                        }
                    }
                }, c0585q);
                final int i12 = 1;
                P.d echo2 = P.e.echo(-687919784, new Xd.l(this) { // from class: k4.d
                    public final /* synthetic */ CardComponentViewRenderer purple;

                    {
                        this.purple = this;
                    }

                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Render$lambda$1;
                        Unit Render$lambda$2;
                        int i122 = i12;
                        InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i122) {
                            case 0:
                                Render$lambda$1 = CardComponentViewRenderer.Render$lambda$1(this.purple, interfaceC0581m2, intValue);
                                return Render$lambda$1;
                            default:
                                Render$lambda$2 = CardComponentViewRenderer.Render$lambda$2(this.purple, interfaceC0581m2, intValue);
                                return Render$lambda$2;
                        }
                    }
                }, c0585q);
                boolean india = c0585q.india(this);
                Object jade = c0585q.jade();
                as asVar = C0580l.alpha;
                if (india || jade == asVar) {
                    jade = new C0899o(this, null);
                    c0585q.f(jade);
                }
                Xd.n nVar = (Xd.n) jade;
                boolean india2 = c0585q.india(this);
                Object jade2 = c0585q.jade();
                if (india2 || jade2 == asVar) {
                    jade2 = new C0900p(this, null);
                    c0585q.f(jade2);
                }
                Xd.l lVar = (Xd.l) jade2;
                CardComponent cardComponent = this.cardComponent;
                boolean india3 = c0585q.india(cardComponent);
                Object jade3 = c0585q.jade();
                if (india3 || jade3 == asVar) {
                    jade3 = new C0901q(cardComponent);
                    c0585q.f(jade3);
                }
                Function0<Boolean> function0 = (Function0) ((InterfaceC1775g) jade3);
                CardComponent cardComponent2 = this.cardComponent;
                boolean india4 = c0585q.india(cardComponent2);
                Object jade4 = c0585q.jade();
                if (india4 || jade4 == asVar) {
                    jade4 = new C0902r(cardComponent2);
                    c0585q.f(jade4);
                }
                rememberMe$card_standardRelease.RememberMeView(null, echo, echo2, nVar, lVar, function0, (Function0) ((InterfaceC1775g) jade4), c0585q, (CheckoutRememberMe.$stable << 21) | 432, 1);
                c0585q.quebec(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                c0585q.purple(739880627);
                RenderCard(c0585q, i5 & 14);
                c0585q.quebec(false);
            } else {
                c0585q.purple(739856757);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new k4.e(this, i4, 0);
        }
    }

    public final void RenderAddCardView(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        CardholderNamePosition cardholderNamePosition;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1155241127);
        if ((i4 & 6) == 0) {
            if (c0585q.india(this)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            Injector injector = this.f3939c;
            String paymentSessionId$card_standardRelease = this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getPaymentSessionId$card_standardRelease();
            CardConfiguration cardConfiguration$card_standardRelease = this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getCardConfiguration$card_standardRelease();
            if (cardConfiguration$card_standardRelease == null || (cardholderNamePosition = cardConfiguration$card_standardRelease.getDisplayCardholderName()) == null) {
                cardholderNamePosition = CardholderNamePosition.TOP;
            }
            CardPaymentViewKt.CardPaymentView(injector, false, false, false, paymentSessionId$card_standardRelease, cardholderNamePosition, true, this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getLayoutDirection$card_standardRelease(), c0585q, 1576368);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new k4.e(this, i4, 2);
        }
    }

    @NotNull
    /* renamed from: getCardComponent$card_standardRelease, reason: from getter */
    public final CardComponent getCardComponent() {
        return this.cardComponent;
    }

    @NotNull
    /* renamed from: getConfig$card_standardRelease, reason: from getter */
    public final CardComponentConfig getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String() {
        return this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String;
    }
}
