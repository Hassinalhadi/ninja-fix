package com.checkout.components.address;

import androidx.appcompat.widget.P0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.address.model.State;
import com.checkout.address.model.StatePickerViewState;
import com.checkout.components.ui.model.InputFieldViewItem;
import com.checkout.components.ui.model.PickerViewState;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.picker.PickerContentViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public abstract class V {
    public static final Unit a(State state, List list, Function1 function1, Function1 function12, Function0 function0, StatePickerViewState statePickerViewState, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(state, list, function1, function12, function0, statePickerViewState, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(State state, List filteredStates, Function1 onQueryChanged, Function1 onStateSelected, Function0 onDismiss, StatePickerViewState viewState, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(filteredStates, "filteredStates");
        Intrinsics.echo(onQueryChanged, "onQueryChanged");
        Intrinsics.echo(onStateSelected, "onStateSelected");
        Intrinsics.echo(onDismiss, "onDismiss");
        Intrinsics.echo(viewState, "viewState");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1685882740);
        if ((i4 & 6) == 0) {
            i5 = ((i4 & 8) == 0 ? c0585q.golf(state) : c0585q.india(state) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q.india(filteredStates) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q.india(onQueryChanged) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0585q.india(onStateSelected) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0585q.india(onDismiss) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= (262144 & i4) == 0 ? c0585q.golf(viewState) : c0585q.india(viewState) ? 131072 : 65536;
        }
        if (c0585q.magenta(i5 & 1, (74899 & i5) != 74898)) {
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new hd.l(18);
                c0585q.f(jade);
            }
            int i10 = TextLabelViewStyle.$stable;
            int i11 = InputFieldViewItem.$stable | i10;
            int i12 = TextLabelViewItem.$stable;
            PickerContentViewKt.PickerContentView(state, filteredStates, onQueryChanged, onDismiss, (Function1) jade, viewState, P.e.echo(325306770, new Vc.o(state, onStateSelected, viewState, 4), c0585q), c0585q, (i5 & 458752) | (i5 & 14) | 1597440 | (i5 & 112) | (i5 & 896) | ((i5 >> 3) & 7168) | (((i10 | ((((i11 | i12) | i12) | i12) | TopAppBarViewStyle.$stable)) | PickerViewState.$stable) << 15));
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.e(state, filteredStates, onQueryChanged, onStateSelected, onDismiss, viewState, i4);
        }
    }

    public static final String a(State it) {
        Intrinsics.echo(it, "it");
        return P0.crimson(it.getCode(), it.getDisplayName());
    }

    public static final Unit a(State state, Function1 function1, StatePickerViewState statePickerViewState, State state2, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(state2, "state");
        if ((i4 & 6) == 0) {
            i5 = i4 | ((i4 & 8) == 0 ? ((C0585q) interfaceC0581m).golf(state2) : ((C0585q) interfaceC0581m).india(state2) ? 4 : 2);
        } else {
            i5 = i4;
        }
        boolean z2 = true;
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i5 & 1, (i5 & 19) != 18)) {
            boolean areEqual = Intrinsics.areEqual(state, state2);
            boolean golf = c0585q.golf(function1);
            int i10 = i5 & 14;
            if (i10 != 4 && ((i5 & 8) == 0 || !c0585q.india(state2))) {
                z2 = false;
            }
            boolean z10 = golf | z2;
            Object jade = c0585q.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new Yb.F(18, function1, state2);
                c0585q.f(jade);
            }
            Function0 function0 = (Function0) jade;
            TextLabelViewStyle itemName = statePickerViewState.getItemName();
            TextLabelViewStyle code = statePickerViewState.getCode();
            long mo64getSelectedRadioButtonColor0d7_KjU = statePickerViewState.mo64getSelectedRadioButtonColor0d7_KjU();
            long mo65getUnSelectedRadioButtonColor0d7_KjU = statePickerViewState.mo65getUnSelectedRadioButtonColor0d7_KjU();
            int i11 = TextLabelViewStyle.$stable;
            S.a(state2, areEqual, function0, itemName, code, mo64getSelectedRadioButtonColor0d7_KjU, mo65getUnSelectedRadioButtonColor0d7_KjU, c0585q, (i11 << 12) | (i11 << 9) | i10);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(Function1 function1, State state) {
        function1.invoke(state);
        return Unit.INSTANCE;
    }
}
