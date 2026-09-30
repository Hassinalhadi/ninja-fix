package com.checkout.components.address;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import com.checkout.address.model.State;
import com.checkout.address.model.StatePickerViewState;
import com.checkout.address.ui.state.StatePickerViewModel;
import com.checkout.components.ui.model.InputFieldViewItem;
import com.checkout.components.ui.model.PickerViewState;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.picker.PickerBottomSheetScreenKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import d.C1534h0;
import ge.InterfaceC1775g;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class U {
    public static final Unit a(StatePickerViewModel statePickerViewModel, Y1.r rVar, State state, Function1 function1, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(statePickerViewModel, rVar, state, function1, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(StatePickerViewModel viewModel, Y1.r navController, State state, Function1 onStateSelected, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        C0585q c0585q;
        Intrinsics.echo(viewModel, "viewModel");
        Intrinsics.echo(navController, "navController");
        Intrinsics.echo(onStateSelected, "onStateSelected");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(456146830);
        if ((i4 & 6) == 0) {
            i5 = (c0585q2.india(viewModel) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q2.india(navController) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= (i4 & 512) == 0 ? c0585q2.golf(state) : c0585q2.india(state) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0585q2.india(onStateSelected) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        int i10 = i5;
        if (c0585q2.magenta(i10 & 1, (i10 & 1171) != 1170)) {
            ax mike = C0564b.mike(viewModel.getFilteredItems(), c0585q2, 0);
            boolean india = c0585q2.india(viewModel);
            Object jade = c0585q2.jade();
            if (india || jade == C0580l.alpha) {
                jade = new T(viewModel);
                c0585q2.f(jade);
            }
            c0585q = c0585q2;
            PickerBottomSheetScreenKt.m184PickerBottomSheetScreencf5BqRc((Function0) ((InterfaceC1775g) jade), navController, viewModel.getContainerColor(), "address_state_picker", P.e.echo(1894767059, new Ac.d(viewModel, state, onStateSelected, mike, 7), c0585q2), c0585q, (i10 & 112) | 27648);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Gb.j(viewModel, navController, state, onStateSelected, i4, 9);
        }
    }

    public static final Unit a(Function1 function1, Function0 function0, State it) {
        Intrinsics.echo(it, "it");
        function1.invoke(it);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit a(StatePickerViewModel statePickerViewModel, String it) {
        Intrinsics.echo(it, "it");
        statePickerViewModel.onQueryChanged(it);
        return Unit.INSTANCE;
    }

    public static final Unit a(StatePickerViewModel statePickerViewModel, State state, Function1 function1, D0 d02, Function0 dismissBottomSheet, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(dismissBottomSheet, "dismissBottomSheet");
        if ((i4 & 6) == 0) {
            i5 = i4 | (((C0585q) interfaceC0581m).india(dismissBottomSheet) ? 4 : 2);
        } else {
            i5 = i4;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i5 & 1, (i5 & 19) != 18)) {
            List list = (List) d02.getValue();
            StatePickerViewState state2 = statePickerViewModel.getState();
            boolean india = c0585q.india(statePickerViewModel);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (india || jade == asVar) {
                jade = new C1534h0(18, statePickerViewModel);
                c0585q.f(jade);
            }
            Function1 function12 = (Function1) jade;
            int i10 = i5 & 14;
            boolean golf = c0585q.golf(function1) | (i10 == 4);
            Object jade2 = c0585q.jade();
            if (golf || jade2 == asVar) {
                jade2 = new com.checkout.components.ui.country.b(1, dismissBottomSheet, function1);
                c0585q.f(jade2);
            }
            Function1 function13 = (Function1) jade2;
            boolean z2 = i10 == 4;
            Object jade3 = c0585q.jade();
            if (z2 || jade3 == asVar) {
                jade3 = new com.checkout.components.ui.country.c(dismissBottomSheet, 7);
                c0585q.f(jade3);
            }
            Function0 function0 = (Function0) jade3;
            int i11 = TextLabelViewStyle.$stable;
            int i12 = InputFieldViewItem.$stable | i11;
            int i13 = TextLabelViewItem.$stable;
            V.a(state, list, function12, function13, function0, state2, c0585q, ((i11 | ((((i12 | i13) | i13) | i13) | TopAppBarViewStyle.$stable)) | PickerViewState.$stable) << 15);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
