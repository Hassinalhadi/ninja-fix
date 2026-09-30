package com.checkout.components.wallet.ui;

import Ec.aa;
import Ec.ar;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.ui.ViewRenderer;
import com.checkout.components.wallet.GooglePayMediator;
import com.checkout.components.wallet.WalletComponent;
import com.checkout.components.wallet.common.ButtonOptionsMapperKt;
import com.checkout.components.wallet.ui.model.WalletComponentConfig;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/checkout/components/wallet/ui/WalletComponentViewRenderer;", "Lcom/checkout/components/interfaces/ui/ViewRenderer;", "Lcom/checkout/components/wallet/ui/model/WalletComponentConfig;", Constants.KEY_CONFIG, "Lcom/checkout/components/wallet/GooglePayMediator;", "mediator", "Lkotlin/Function0;", "", "onClick", "onRenderError", "Lcom/checkout/components/wallet/WalletComponent;", "walletComponent", "<init>", "(Lcom/checkout/components/wallet/ui/model/WalletComponentConfig;Lcom/checkout/components/wallet/GooglePayMediator;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/checkout/components/wallet/WalletComponent;)V", "Render", "(Landroidx/compose/runtime/m;I)V", "availableMediatorOrNull$wallet_standardRelease", "()Lcom/checkout/components/wallet/GooglePayMediator;", "availableMediatorOrNull", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WalletComponentViewRenderer implements ViewRenderer {
    public static final int $stable = 8;

    /* renamed from: a */
    private final WalletComponentConfig f6523a;

    /* renamed from: b */
    private final GooglePayMediator f6524b;

    /* renamed from: c */
    private final Function0 f6525c;

    /* renamed from: d */
    private final Function0 f6526d;
    private final WalletComponent e;

    public WalletComponentViewRenderer(WalletComponentConfig config, GooglePayMediator googlePayMediator, Function0<Unit> onClick, Function0<Unit> onRenderError, WalletComponent walletComponent) {
        Intrinsics.echo(config, "config");
        Intrinsics.echo(onClick, "onClick");
        Intrinsics.echo(onRenderError, "onRenderError");
        Intrinsics.echo(walletComponent, "walletComponent");
        this.f6523a = config;
        this.f6524b = googlePayMediator;
        this.f6525c = onClick;
        this.f6526d = onRenderError;
        this.e = walletComponent;
    }

    public static final Unit a(WalletComponentViewRenderer walletComponentViewRenderer, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        walletComponentViewRenderer.Render(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    @Override // com.checkout.components.interfaces.ui.ViewRenderer
    public final void Render(InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        Unit unit;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1950431738);
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
            GooglePayMediator availableMediatorOrNull$wallet_standardRelease = availableMediatorOrNull$wallet_standardRelease();
            if (availableMediatorOrNull$wallet_standardRelease == null) {
                c0585q.purple(-1300565309);
                c0585q.quebec(false);
                unit = null;
            } else {
                c0585q.purple(-1300565308);
                a(availableMediatorOrNull$wallet_standardRelease, c0585q, (i5 << 3) & 112);
                c0585q.quebec(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                this.f6526d.invoke();
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ar(this, i4, 11);
        }
    }

    public final GooglePayMediator availableMediatorOrNull$wallet_standardRelease() {
        GooglePayMediator googlePayMediator = this.f6524b;
        if (googlePayMediator != null && googlePayMediator.isGooglePayReady$wallet_standardRelease().getValue() != null) {
            return googlePayMediator;
        }
        return null;
    }

    public static final Unit a(WalletComponentViewRenderer walletComponentViewRenderer, GooglePayMediator googlePayMediator, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        walletComponentViewRenderer.a(googlePayMediator, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private final void a(GooglePayMediator googlePayMediator, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Function1<PaymentMethodComponent, Unit> onReady;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1521517280);
        if ((i4 & 6) == 0) {
            i5 = (c0585q.india(googlePayMediator) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q.india(this) ? 32 : 16;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 19) != 18)) {
            if (this.f6523a.getShouldInvokeOnReady$wallet_standardRelease() && (onReady = this.f6523a.getComponentCallback().getOnReady()) != null) {
                onReady.invoke(this.e);
            }
            PayButtonViewKt.m196PayButtonViewFU0evQE((String) googlePayMediator.getAllowedPaymentMethods$wallet_standardRelease().getValue(), this.f6523a.getPaymentStateFlow(), this.f6523a.m200getErrorTextColor0d7_KjU(), this.f6525c, ButtonOptionsMapperKt.toButtonTheme(this.f6523a.getButtonTheme$wallet_standardRelease()), ButtonOptionsMapperKt.toButtonType(this.f6523a.getButtonType$wallet_standardRelease()), c0585q, 0, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(i4, 25, this, googlePayMediator);
        }
    }
}
