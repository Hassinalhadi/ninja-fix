package com.checkout.components.wallet.ui;

import F.G2;
import T.d;
import T.p;
import T.s;
import Z8.a;
import Z8.b;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.ax;
import ao.ad;
import com.checkout.components.interfaces.model.PaymentState;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.O2;
import yf.L;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aO\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"", "allowedPaymentMethods", "Lyf/L;", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentStateFlow", "La0/t;", "errorTextColor", "Lkotlin/Function0;", "", "onClick", "LZ8/a;", "buttonTheme", "LZ8/b;", "buttonType", "PayButtonView-FU0evQE", "(Ljava/lang/String;Lyf/L;JLkotlin/jvm/functions/Function0;LZ8/a;LZ8/b;Landroidx/compose/runtime/m;II)V", "PayButtonView", "state", "wallet_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayButtonViewKt {
    /* renamed from: PayButtonView-FU0evQE */
    public static final void m196PayButtonViewFU0evQE(String allowedPaymentMethods, L paymentStateFlow, long j5, Function0<Unit> onClick, a aVar, b bVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int ordinal;
        int i11;
        int i12;
        boolean z2;
        a aVar2;
        C0585q c0585q;
        b bVar2;
        a aVar3;
        b bVar3;
        PaymentState.Declined declined;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        Intrinsics.echo(allowedPaymentMethods, "allowedPaymentMethods");
        Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-966448268);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(allowedPaymentMethods)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(paymentStateFlow)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.foxtrot(j5)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.india(onClick)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i13;
        }
        int i17 = i5 & 16;
        int i18 = -1;
        if (i17 != 0) {
            i10 |= 24576;
        } else if ((i4 & 24576) == 0) {
            if (aVar == null) {
                ordinal = -1;
            } else {
                ordinal = aVar.ordinal();
            }
            if (c0585q2.echo(ordinal)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i10 |= i11;
        }
        int i19 = i5 & 32;
        if (i19 != 0) {
            i10 |= 196608;
        } else if ((196608 & i4) == 0) {
            if (bVar != null) {
                i18 = bVar.ordinal();
            }
            if (c0585q2.echo(i18)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i10 |= i12;
        }
        int i20 = i10;
        if ((74899 & i20) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i20 & 1, z2)) {
            if (i17 != 0) {
                aVar3 = a.Dark;
            } else {
                aVar3 = aVar;
            }
            if (i19 != 0) {
                bVar3 = b.Buy;
            } else {
                bVar3 = bVar;
            }
            int i21 = i20 >> 3;
            ax mike = C0564b.mike(paymentStateFlow, c0585q2, i21 & 14);
            p pVar = p.alpha;
            s charlie = V.charlie(pVar, 1.0f);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, d.f2062f, c0585q2, 0);
            long j6 = c0585q2.magenta;
            int i22 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q2.mike();
            s charlie2 = T.a.charlie(charlie, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, alpha);
            C0564b.blue(C2551k.echo, c0585q2, mike2);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i22))) {
                ad.blue(i22, c0585q2, i22, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie2);
            a aVar4 = aVar3;
            O2.alpha(onClick, allowedPaymentMethods, V.golf(V.charlie(pVar, 1.0f), 44, 0.0f, 2), aVar4, bVar3, 0.0f, false, c0585q2, ((i20 >> 9) & 14) | 384 | ((i20 << 3) & 112) | (i21 & 7168) | (57344 & i21));
            PaymentState paymentState = (PaymentState) mike.getValue();
            String str = null;
            if (paymentState instanceof PaymentState.Declined) {
                declined = (PaymentState.Declined) paymentState;
            } else {
                declined = null;
            }
            if (declined != null) {
                str = declined.getReason();
            }
            if (str == null) {
                c0585q2.purple(-1816541993);
                c0585q2.quebec(false);
                z10 = true;
            } else {
                c0585q2.purple(-1816541992);
                z10 = true;
                G2.bravo(str, AbstractC0538d.whiskey(pVar, 0.0f, 12, 0.0f, 0.0f, 13), j5, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, (i20 & 896) | 48, 0, 131064);
                c0585q2.quebec(false);
            }
            c0585q2.quebec(z10);
            aVar2 = aVar4;
            c0585q = c0585q2;
            bVar2 = bVar3;
        } else {
            c0585q2.ochre();
            aVar2 = aVar;
            c0585q = c0585q2;
            bVar2 = bVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new X4.a(allowedPaymentMethods, paymentStateFlow, j5, onClick, aVar2, bVar2, i4, i5);
        }
    }

    public static final Unit a(String str, L l10, long j5, Function0 function0, a aVar, b bVar, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        m196PayButtonViewFU0evQE(str, l10, j5, function0, aVar, bVar, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }
}
