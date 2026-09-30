package com.checkout.components.card.ui;

import P.e;
import Q0.n;
import T.a;
import T.d;
import T.k;
import T.p;
import T.s;
import Xd.l;
import androidx.appcompat.widget.P0;
import androidx.compose.animation.c;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import com.checkout.components.card.di.base.InjectionClient;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.ui.CardPaymentViewKt;
import com.checkout.components.card.ui.component.address.AddressViewKt;
import com.checkout.components.card.ui.component.cardholdername.CardHolderNameViewKt;
import com.checkout.components.card.ui.component.cardnumber.CardNumberViewKt;
import com.checkout.components.card.ui.component.cvv.CVVViewKt;
import com.checkout.components.card.ui.component.errorlabel.ErrorLabelViewKt;
import com.checkout.components.card.ui.component.expirydate.ExpiryDateViewKt;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewKt;
import com.checkout.components.card.ui.component.savecard.SaveCardContainerViewKt;
import com.checkout.components.interfaces.model.CardholderNamePosition;
import com.checkout.components.ui.utils.FlowAnimations;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t0.AbstractC2901T;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aO\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/card/di/base/Injector;", "injector", "", "showPayButton", "showAddressComponent", "showRememberMeSaveCardDetailsView", "", "paymentSessionId", "Lcom/checkout/components/interfaces/model/CardholderNamePosition;", "cardholderNamePosition", "isCvvShown", "LQ0/n;", "layoutDirection", "", "CardPaymentView", "(Lcom/checkout/components/card/di/base/Injector;ZZZLjava/lang/String;Lcom/checkout/components/interfaces/model/CardholderNamePosition;ZLQ0/n;Landroidx/compose/runtime/m;I)V", "CardPaymentViewPreview", "(Landroidx/compose/runtime/m;I)V", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardPaymentViewKt {
    public static final void CardPaymentView(@NotNull final Injector injector, final boolean z2, final boolean z10, final boolean z11, @NotNull final String paymentSessionId, @NotNull final CardholderNamePosition cardholderNamePosition, final boolean z12, @NotNull final n layoutDirection, @Nullable InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z13;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean india;
        int i17;
        Intrinsics.echo(injector, "injector");
        Intrinsics.echo(paymentSessionId, "paymentSessionId");
        Intrinsics.echo(cardholderNamePosition, "cardholderNamePosition");
        Intrinsics.echo(layoutDirection, "layoutDirection");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(76519945);
        if ((i4 & 6) == 0) {
            if ((i4 & 8) == 0) {
                india = c0585q.golf(injector);
            } else {
                india = c0585q.india(injector);
            }
            if (india) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i5 = i17 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.hotel(z2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i5 |= i16;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.hotel(z10)) {
                i15 = Barcode.FORMAT_QR_CODE;
            } else {
                i15 = 128;
            }
            i5 |= i15;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.hotel(z11)) {
                i14 = 2048;
            } else {
                i14 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i14;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.golf(paymentSessionId)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = 8192;
            }
            i5 |= i13;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.echo(cardholderNamePosition.ordinal())) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i5 |= i12;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q.hotel(z12)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i5 |= i11;
        }
        if ((12582912 & i4) == 0) {
            if (c0585q.echo(layoutDirection.ordinal())) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i5 |= i10;
        }
        if ((4793491 & i5) != 4793490) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0585q.magenta(i5 & 1, z13)) {
            C0564b.alpha(AbstractC2901T.november.alpha(layoutDirection), e.echo(-1234051383, new l() { // from class: s4.a
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    Unit CardPaymentView$lambda$4;
                    int intValue = ((Integer) obj2).intValue();
                    CardholderNamePosition cardholderNamePosition2 = CardholderNamePosition.this;
                    Injector injector2 = injector;
                    String str = paymentSessionId;
                    boolean z14 = z2;
                    boolean z15 = z12;
                    CardPaymentView$lambda$4 = CardPaymentViewKt.CardPaymentView$lambda$4(cardholderNamePosition2, injector2, str, z10, z11, z14, z15, (InterfaceC0581m) obj, intValue);
                    return CardPaymentView$lambda$4;
                }
            }, c0585q), c0585q, 56);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new l() { // from class: s4.b
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    Unit a6;
                    int intValue = ((Integer) obj2).intValue();
                    Injector injector2 = Injector.this;
                    String str = paymentSessionId;
                    CardholderNamePosition cardholderNamePosition2 = cardholderNamePosition;
                    n nVar = layoutDirection;
                    int i18 = i4;
                    a6 = CardPaymentViewKt.a(injector2, z2, z10, z11, str, cardholderNamePosition2, z12, nVar, i18, (InterfaceC0581m) obj, intValue);
                    return a6;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0083, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.jade(), java.lang.Integer.valueOf(r10)) == false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit CardPaymentView$lambda$4(CardholderNamePosition cardholderNamePosition, Injector injector, String str, boolean z2, boolean z10, boolean z11, boolean z12, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z13;
        float f5;
        boolean z14;
        if ((i4 & 3) != 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z13)) {
            C0537c c0537c = AbstractC0542h.alpha;
            C0540f india = AbstractC0542h.india(10, d.f2061d);
            p pVar = p.alpha;
            s charlie = V.charlie(c.alpha(pVar, FlowAnimations.INSTANCE.getDefaultContentSizeSpec(), 2), 1.0f);
            C0554u alpha = AbstractC0553t.alpha(india, d.f2062f, c0585q, 6);
            long j5 = c0585q.magenta;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = a.charlie(charlie, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (!c0585q.lime) {
                f5 = 1.0f;
            } else {
                f5 = 1.0f;
            }
            ad.blue(i5, c0585q, i5, c2549i3);
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            if (cardholderNamePosition == CardholderNamePosition.TOP) {
                c0585q.purple(1469744735);
                CardHolderNameViewKt.CardHolderNameComponent(injector, str, c0585q, 0);
            } else {
                c0585q.purple(1467154499);
            }
            c0585q.quebec(false);
            CardNumberViewKt.CardNumberComponent(injector, str, c0585q, 0);
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, d.f2060c, c0585q, 0);
            long j6 = c0585q.magenta;
            int i10 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            s charlie3 = a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                ad.blue(i10, c0585q, i10, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            s maroon = P0.maroon(f5);
            k kVar = d.alpha;
            ap delta = AbstractC0547m.delta(kVar, false);
            long j7 = c0585q.magenta;
            int i11 = (int) (j7 ^ (j7 >>> 32));
            I mike3 = c0585q.mike();
            s charlie4 = a.charlie(maroon, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ad.blue(i11, c0585q, i11, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            ?? r4 = 0;
            ExpiryDateViewKt.ExpiryDateComponent(injector, str, c0585q, 0);
            c0585q.quebec(true);
            if (z12) {
                c0585q.purple(-538016886);
                s maroon2 = P0.maroon(f5);
                ap delta2 = AbstractC0547m.delta(kVar, false);
                long j10 = c0585q.magenta;
                int i12 = (int) (j10 ^ (j10 >>> 32));
                I mike4 = c0585q.mike();
                s charlie5 = a.charlie(maroon2, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i, c0585q, delta2);
                C0564b.blue(c2549i2, c0585q, mike4);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                    ad.blue(i12, c0585q, i12, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q, charlie5);
                r4 = 0;
                CVVViewKt.CVVComponent(injector, str, c0585q, 0);
                z14 = true;
                c0585q.quebec(true);
            } else {
                z14 = true;
                c0585q.purple(-540993537);
            }
            c0585q.quebec(r4);
            c0585q.quebec(z14);
            if (cardholderNamePosition == CardholderNamePosition.BOTTOM) {
                c0585q.purple(1470373663);
                CardHolderNameViewKt.CardHolderNameComponent(injector, str, c0585q, r4);
            } else {
                c0585q.purple(1467154499);
            }
            c0585q.quebec(r4);
            if (z2) {
                c0585q.purple(1470512171);
                AddressViewKt.AddressView(injector, str, c0585q, r4);
            } else {
                c0585q.purple(1467154499);
            }
            c0585q.quebec(r4);
            if (z10) {
                c0585q.purple(1470652353);
                SaveCardContainerViewKt.SaveCardContainerView(injector, str, c0585q, r4);
            } else {
                c0585q.purple(1467154499);
            }
            c0585q.quebec(r4);
            if (z11) {
                c0585q.purple(1470782212);
                PayButtonViewKt.PayButtonComponent(injector, str, c0585q, r4);
            } else {
                c0585q.purple(1467154499);
            }
            c0585q.quebec(r4);
            ErrorLabelViewKt.ErrorLabelView(injector, str, c0585q, r4);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final void CardPaymentViewPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(818183139);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            CardPaymentView(new Injector() { // from class: com.checkout.components.card.ui.CardPaymentViewKt$CardPaymentViewPreview$1
                @Override // com.checkout.components.card.di.base.Injector
                public final void inject(InjectionClient client) {
                    Intrinsics.echo(client, "client");
                }
            }, true, true, true, "", CardholderNamePosition.TOP, true, n.alpha, c0585q, 14380464);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new com.checkout.components.kmp.rememberme.view.otp.c(i4, 17);
        }
    }

    public static final Unit a(Injector injector, boolean z2, boolean z10, boolean z11, String str, CardholderNamePosition cardholderNamePosition, boolean z12, n nVar, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        CardPaymentView(injector, z2, z10, z11, str, cardholderNamePosition, z12, nVar, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        CardPaymentViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
