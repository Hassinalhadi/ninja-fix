package com.checkout.components.ui.picker;

import Bb.e;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.view.InputFieldViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\t\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "", "", "onValueChange", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "style", "Lcom/checkout/components/ui/model/state/InputFieldState;", "state", "testTag", "PickerSearchView", "(Lkotlin/jvm/functions/Function1;Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;Lcom/checkout/components/ui/model/state/InputFieldState;Ljava/lang/String;Landroidx/compose/runtime/m;II)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickerSearchViewKt {
    public static final void PickerSearchView(@NotNull Function1<? super String, Unit> onValueChange, @NotNull InputFieldViewStyle style, @NotNull InputFieldState state, @Nullable String str, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        InputFieldState inputFieldState;
        InputFieldViewStyle inputFieldViewStyle;
        Function1<? super String, Unit> function1;
        String str2;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(onValueChange, "onValueChange");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2062441264);
        if ((i4 & 6) == 0) {
            if (c0585q.india(onValueChange)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(style)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(state)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        int i15 = i5 & 8;
        if (i15 != 0) {
            i10 |= 3072;
        } else if ((i4 & 3072) == 0) {
            if (c0585q.golf(str)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (i15 != 0) {
                str = null;
            }
            String str3 = str;
            inputFieldState = state;
            InputFieldViewKt.InputFieldView(style, inputFieldState, onValueChange, null, str3, c0585q, ((i10 >> 3) & 126) | ((i10 << 6) & 896) | ((i10 << 3) & 57344), 8);
            inputFieldViewStyle = style;
            function1 = onValueChange;
            str2 = str3;
        } else {
            inputFieldState = state;
            inputFieldViewStyle = style;
            function1 = onValueChange;
            c0585q.ochre();
            str2 = str;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new e(function1, inputFieldViewStyle, inputFieldState, str2, i4, i5);
        }
    }

    public static final Unit PickerSearchView$lambda$0(Function1 function1, InputFieldViewStyle inputFieldViewStyle, InputFieldState inputFieldState, String str, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        PickerSearchView(function1, inputFieldViewStyle, inputFieldState, str, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }
}
