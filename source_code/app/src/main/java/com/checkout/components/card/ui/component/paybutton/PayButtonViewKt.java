package com.checkout.components.card.ui.component.paybutton;

import Ac.l;
import Ec.b;
import F.AbstractC0127k2;
import F.O;
import P.e;
import T.d;
import T.p;
import T.s;
import T1.c;
import U1.a;
import Y.i;
import Y.n;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.ax;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.d0;
import ao.ad;
import com.checkout.components.card.P;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewModel;
import com.checkout.components.interfaces.model.PaymentState;
import com.checkout.components.ui.mapper.ButtonStyleToInternalStateMapper;
import com.checkout.components.ui.mapper.ButtonStyleToInternalViewStyleMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.style.DefaultButtonStyle;
import com.checkout.components.ui.view.InternalButtonViewKt;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import ge.InterfaceC1775g;
import k5.C2011d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.F7;
import sb.C2844c;
import t0.AbstractC2901T;
import yf.AbstractC3428A;
import yf.L;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aI\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0001¢\u0006\u0004\b\u0005\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\f\u0010\u0015\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lcom/checkout/components/card/di/base/Injector;", "injector", "", Constants.KEY_KEY, "", "PayButtonComponent", "(Lcom/checkout/components/card/di/base/Injector;Ljava/lang/String;Landroidx/compose/runtime/m;I)V", "Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "style", "Lcom/checkout/components/ui/model/state/InternalButtonState;", "state", "Lkotlin/Function0;", "onClick", "Lyf/L;", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentStateFlow", "", "isReadyForTokenizationStateFlow", "(Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;Lcom/checkout/components/ui/model/state/InternalButtonState;Lkotlin/jvm/functions/Function0;Lyf/L;Lyf/L;Landroidx/compose/runtime/m;I)V", "PayButtonComponentPreview", "(Landroidx/compose/runtime/m;I)V", "paymentState", "isReadyForTokenization", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayButtonViewKt {
    public static final void PayButtonComponent(@NotNull Injector injector, @NotNull String key, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        c cVar;
        Intrinsics.echo(injector, "injector");
        Intrinsics.echo(key, "key");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-292176043);
        if ((i4 & 6) == 0) {
            i5 = ((i4 & 8) == 0 ? c0585q.golf(injector) : c0585q.india(injector) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q.golf(key) ? 32 : 16;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 19) != 18)) {
            PayButtonViewModel.PayButtonFactory payButtonFactory = new PayButtonViewModel.PayButtonFactory(injector);
            String concat = "PayButtonViewModel-".concat(key);
            d0 alpha = a.alpha(c0585q);
            if (alpha != null) {
                if (alpha instanceof InterfaceC0651v) {
                    cVar = ((InterfaceC0651v) alpha).getDefaultViewModelCreationExtras();
                } else {
                    cVar = T1.a.bravo;
                }
                PayButtonViewModel payButtonViewModel = (PayButtonViewModel) F7.bravo(u.alpha.bravo(PayButtonViewModel.class), alpha, concat, payButtonFactory, cVar, c0585q);
                InternalButtonViewStyle buttonStyle = payButtonViewModel.getButtonStyle();
                InternalButtonState buttonState = payButtonViewModel.getButtonState();
                boolean india = c0585q.india(payButtonViewModel);
                Object jade = c0585q.jade();
                if (india || jade == C0580l.alpha) {
                    jade = new P(payButtonViewModel);
                    c0585q.f(jade);
                }
                PayButtonComponent(buttonStyle, buttonState, (Function0) ((InterfaceC1775g) jade), payButtonViewModel.getPaymentState$card_standardRelease(), payButtonViewModel.getIsReadyForTokenization(), c0585q, InternalButtonViewStyle.$stable | (InternalButtonState.$stable << 3));
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new com.checkout.components.card.ui.component.cardnumber.a(injector, key, i4, 7);
        }
    }

    public static final void PayButtonComponentPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(232789718);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0127k2.alpha(V.charlie(p.alpha, 1.0f), null, ((O) c0585q.kilo(F.Q.alpha)).november, 0L, 0.0f, 0.0f, null, e.echo(-1853554959, new C2011d(DefaultButtonStyle.solid$default(DefaultButtonStyle.INSTANCE, "Pay", null, 4278190080L, 4278255360L, null, null, null, null, null, null, 1010, null), 1), c0585q), c0585q, 12582918, 122);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new com.checkout.components.kmp.rememberme.view.otp.c(i4, 21);
        }
    }

    public static final Unit PayButtonComponentPreview$lambda$10(ButtonStyle buttonStyle, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            InternalButtonViewStyle map = ButtonStyleToInternalViewStyleMapper.INSTANCE.getDEFAULT().map(buttonStyle);
            InternalButtonState map2 = new ButtonStyleToInternalStateMapper(new TextLabelStyleToStateMapper()).map(buttonStyle);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new C2844c(16);
                c0585q.f(jade);
            }
            PayButtonComponent(map, map2, (Function0) jade, AbstractC3428A.charlie(PaymentState.Default.INSTANCE), AbstractC3428A.charlie(Boolean.FALSE), c0585q, InternalButtonViewStyle.$stable | 384 | (InternalButtonState.$stable << 3));
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(Injector injector, String str, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        PayButtonComponent(injector, str, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(InternalButtonViewStyle internalButtonViewStyle, InternalButtonState internalButtonState, Function0 function0, L l10, L l11, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        PayButtonComponent(internalButtonViewStyle, internalButtonState, function0, l10, l11, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        PayButtonComponentPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Unit a(i iVar, Function0 function0, D0 d02) {
        if (((Boolean) d02.getValue()).booleanValue()) {
            ((n) iVar).bravo(8, false, true);
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void PayButtonComponent(@NotNull InternalButtonViewStyle style, @NotNull InternalButtonState state, @NotNull Function0<Unit> onClick, @NotNull L paymentStateFlow, @NotNull L isReadyForTokenizationStateFlow, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        Intrinsics.echo(onClick, "onClick");
        Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
        Intrinsics.echo(isReadyForTokenizationStateFlow, "isReadyForTokenizationStateFlow");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1830620071);
        if ((i4 & 6) == 0) {
            i5 = ((i4 & 8) == 0 ? c0585q.golf(style) : c0585q.india(style) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= (i4 & 64) == 0 ? c0585q.golf(state) : c0585q.india(state) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q.india(onClick) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0585q.india(paymentStateFlow) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0585q.india(isReadyForTokenizationStateFlow) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 9363) != 9362)) {
            ax mike = C0564b.mike(paymentStateFlow, c0585q, (i5 >> 9) & 14);
            i iVar = (i) c0585q.kilo(AbstractC2901T.india);
            ax mike2 = C0564b.mike(isReadyForTokenizationStateFlow, c0585q, (i5 >> 12) & 14);
            s charlie = V.charlie(p.alpha, 1.0f);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            I mike3 = c0585q.mike();
            s charlie2 = T.a.charlie(charlie, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha);
            C0564b.blue(C2551k.echo, c0585q, mike3);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                ad.blue(i10, c0585q, i10, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            PaymentState paymentState = (PaymentState) mike.getValue();
            boolean golf = c0585q.golf(mike2) | c0585q.india(iVar) | ((i5 & 896) == 256);
            Object jade = c0585q.jade();
            if (golf || jade == C0580l.alpha) {
                jade = new l(iVar, onClick, mike2, 21);
                c0585q.f(jade);
            }
            InternalButtonViewKt.InternalButtonView(style, state, paymentState, (Function0) jade, "pay_button", c0585q, (i5 & 112) | InternalButtonViewStyle.$stable | 24576 | (i5 & 14) | (InternalButtonState.$stable << 3) | (PaymentState.$stable << 6), 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new b(style, state, onClick, paymentStateFlow, isReadyForTokenizationStateFlow, i4, 8);
        }
    }
}
