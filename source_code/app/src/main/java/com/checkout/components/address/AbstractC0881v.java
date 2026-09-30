package com.checkout.components.address;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.view.InputContainerViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.address.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0881v {
    public static final Unit a(int i4, InputComponentState inputComponentState, InputComponentViewStyle inputComponentViewStyle, Xd.l lVar, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        a(i4, inputComponentState, inputComponentViewStyle, lVar, interfaceC0581m, C0564b.cyan(i5 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(int i4, InputComponentState state, InputComponentViewStyle style, Xd.l onValueChange, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        Intrinsics.echo(state, "state");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(onValueChange, "onValueChange");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1077915852);
        if ((i5 & 6) == 0) {
            i10 = (c0585q.echo(i4) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            i10 |= (i5 & 64) == 0 ? c0585q.golf(state) : c0585q.india(state) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i10 |= (i5 & 512) == 0 ? c0585q.golf(style) : c0585q.india(style) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i5 & 3072) == 0) {
            i10 |= c0585q.india(onValueChange) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if (c0585q.magenta(i10 & 1, (i10 & 1171) != 1170)) {
            boolean z2 = ((i10 & 7168) == 2048) | ((i10 & 14) == 4);
            Object jade = c0585q.jade();
            if (z2 || jade == C0580l.alpha) {
                jade = new j4.a(onValueChange, i4, 1);
                c0585q.f(jade);
            }
            InputContainerViewKt.InputComponentContainerView(style, state, (Function1) jade, null, null, c0585q, InputComponentViewStyle.$stable | ((i10 >> 6) & 14) | (InputComponentState.$stable << 3) | (i10 & 112), 24);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new j4.b(i4, state, style, onValueChange, i5, 1);
        }
    }

    public static final Unit a(Xd.l lVar, int i4, String it) {
        Intrinsics.echo(it, "it");
        lVar.invoke(Integer.valueOf(i4), it);
        return Unit.INSTANCE;
    }
}
