package com.checkout.components.address;

import A0.ab;
import A0.ad;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.view.InputContainerViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.aw;

/* loaded from: classes3.dex */
public abstract class M {
    public static final Unit a(int i4, InputComponentState inputComponentState, InputComponentViewStyle inputComponentViewStyle, Xd.l lVar, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        a(i4, inputComponentState, inputComponentViewStyle, lVar, interfaceC0581m, C0564b.cyan(i5 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(int i4, InputComponentState state, InputComponentViewStyle style, Xd.l onValueChange, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        C0585q c0585q;
        Intrinsics.echo(state, "state");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(onValueChange, "onValueChange");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(422195328);
        if ((i5 & 6) == 0) {
            i10 = (c0585q2.echo(i4) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            i10 |= (i5 & 64) == 0 ? c0585q2.golf(state) : c0585q2.india(state) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i10 |= (i5 & 512) == 0 ? c0585q2.golf(style) : c0585q2.india(style) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i5 & 3072) == 0) {
            i10 |= c0585q2.india(onValueChange) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        int i11 = i10;
        if (c0585q2.magenta(i11 & 1, (i11 & 1171) != 1170)) {
            InputFieldViewStyle inputFieldStyle = style.getInputFieldStyle();
            T.s modifier = style.getInputFieldStyle().getModifier();
            Object jade = c0585q2.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new hd.l(16);
                c0585q2.f(jade);
            }
            InputComponentViewStyle copy$default = InputComponentViewStyle.copy$default(style, InputFieldViewStyle.copy$default(inputFieldStyle, androidx.compose.ui.platform.a.alpha(A0.o.bravo(modifier, false, (Function1) jade), "address_number_only_zip_field_view"), false, false, null, null, null, new NumberOnlyZipVisualTransformation(), aw.alpha(style.getInputFieldStyle().getKeyboardOptions(), 3, 0, 123), null, false, 0, 0, null, null, null, 32574, null), null, null, 6, null);
            boolean z2 = ((i11 & 7168) == 2048) | ((i11 & 14) == 4);
            Object jade2 = c0585q2.jade();
            if (z2 || jade2 == asVar) {
                jade2 = new j4.a(onValueChange, i4, 0);
                c0585q2.f(jade2);
            }
            c0585q = c0585q2;
            InputContainerViewKt.InputComponentContainerView(copy$default, state, (Function1) jade2, null, null, c0585q, InputComponentViewStyle.$stable | (InputComponentState.$stable << 3) | (i11 & 112), 24);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new j4.b(i4, state, style, onValueChange, i5, 0);
        }
    }

    public static final Unit a(ad semantics) {
        Intrinsics.echo(semantics, "$this$semantics");
        ab.alpha(semantics);
        return Unit.INSTANCE;
    }

    public static final Unit a(Xd.l lVar, int i4, String it) {
        Intrinsics.echo(it, "it");
        lVar.invoke(Integer.valueOf(i4), it);
        return Unit.INSTANCE;
    }
}
