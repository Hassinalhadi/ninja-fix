package com.checkout.components.rememberme;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.interfaces.model.PaymentState;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.view.InternalButtonViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class F1 {
    public static final Unit a(InternalButtonViewStyle internalButtonViewStyle, InternalButtonState internalButtonState, Function0 function0, yf.L l10, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(internalButtonViewStyle, internalButtonState, function0, l10, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(InternalButtonViewStyle style, InternalButtonState state, Function0 onClick, yf.L paymentStateFlow, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        Intrinsics.echo(onClick, "onClick");
        Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1638735174);
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
        if (c0585q.magenta(i5 & 1, (i5 & 1171) != 1170)) {
            InternalButtonViewKt.InternalButtonView(style, state, (PaymentState) C0564b.mike(paymentStateFlow, c0585q, (i5 >> 9) & 14).getValue(), onClick, "rm_wallet_pay_button", c0585q, InternalButtonViewStyle.$stable | 24576 | (i5 & 14) | (InternalButtonState.$stable << 3) | (i5 & 112) | (PaymentState.$stable << 6) | ((i5 << 3) & 7168), 0);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Gb.j(style, state, onClick, paymentStateFlow, i4, 3);
        }
    }
}
