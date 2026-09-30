package com.checkout.components.address;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.view.field.PickerFieldViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class W {
    public static final Unit a(InputComponentState inputComponentState, InputComponentViewStyle inputComponentViewStyle, Function0 function0, String str, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(inputComponentState, inputComponentViewStyle, function0, str, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(InputComponentState state, InputComponentViewStyle style, Function0 goToPickerScreen, String defaultText, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(state, "state");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(goToPickerScreen, "goToPickerScreen");
        Intrinsics.echo(defaultText, "defaultText");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-160693908);
        if ((i4 & 6) == 0) {
            i5 = ((i4 & 8) == 0 ? c0585q.golf(state) : c0585q.india(state) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= (i4 & 64) == 0 ? c0585q.golf(style) : c0585q.india(style) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q.india(goToPickerScreen) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0585q.golf(defaultText) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 1171) != 1170)) {
            boolean z2 = ((CharSequence) state.getInputFieldState().getText().getValue()).length() == 0;
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = C0564b.zulu(defaultText);
                c0585q.f(jade);
            }
            ax axVar = (ax) jade;
            InputComponentState inputComponentState = !z2 ? state : null;
            if (inputComponentState == null) {
                inputComponentState = InputComponentState.copy$default(state, InputFieldState.copy$default(state.getInputFieldState(), axVar, null, null, null, null, 30, null), null, 2, null);
            }
            PickerFieldViewKt.PickerFieldView(inputComponentState, style, goToPickerScreen, "state_selector", c0585q, InputComponentState.$stable | 3072 | (InputComponentViewStyle.$stable << 3) | (i5 & 112) | (i5 & 896));
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new j4.d(state, style, goToPickerScreen, defaultText, i4, 0);
        }
    }
}
