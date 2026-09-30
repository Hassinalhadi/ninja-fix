package com.checkout.components.ui.view.field;

import A0.ab;
import A0.h;
import A0.o;
import T.s;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.ui.platform.a;
import ao.ad;
import com.checkout.components.ui.country.c;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.view.InputContainerViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import j4.d;
import kd.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/ui/model/state/InputComponentState;", "state", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "style", "Lkotlin/Function0;", "", "goToPickerScreen", "", "testTag", "PickerFieldView", "(Lcom/checkout/components/ui/model/state/InputComponentState;Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/m;I)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickerFieldViewKt {
    public static final void PickerFieldView(@NotNull InputComponentState state, @NotNull InputComponentViewStyle style, @NotNull Function0<Unit> goToPickerScreen, @NotNull String testTag, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        int i10;
        int i11;
        int i12;
        int i13;
        Intrinsics.echo(state, "state");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(goToPickerScreen, "goToPickerScreen");
        Intrinsics.echo(testTag, "testTag");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1182666536);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(state)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(style)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i5 |= i12;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.india(goToPickerScreen)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i5 |= i11;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.golf(testTag)) {
                i10 = 2048;
            } else {
                i10 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i10;
        }
        int i14 = i5;
        boolean z10 = true;
        if ((i14 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i14 & 1, z2)) {
            InputFieldViewStyle inputFieldStyle = style.getInputFieldStyle();
            s charlie = V.charlie(style.getInputFieldStyle().getModifier(), 1.0f);
            Object jade = c0585q2.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new l(7);
                c0585q2.f(jade);
            }
            s alpha = a.alpha(o.bravo(charlie, false, (Function1) jade), testTag);
            Object jade2 = c0585q2.jade();
            if (jade2 == asVar) {
                jade2 = ad.xray(c0585q2);
            }
            InterfaceC1673j interfaceC1673j = (InterfaceC1673j) jade2;
            h hVar = new h(0);
            if ((i14 & 896) != 256) {
                z10 = false;
            }
            Object jade3 = c0585q2.jade();
            if (z10 || jade3 == asVar) {
                jade3 = new c(goToPickerScreen, 9);
                c0585q2.f(jade3);
            }
            InputComponentViewStyle copy$default = InputComponentViewStyle.copy$default(style, InputFieldViewStyle.copy$default(inputFieldStyle, androidx.compose.foundation.a.charlie(alpha, interfaceC1673j, null, false, hVar, (Function0) jade3, 12), false, false, null, null, null, null, null, null, false, 0, 0, null, null, null, 32764, null), null, null, 6, null);
            Object jade4 = c0585q2.jade();
            if (jade4 == asVar) {
                jade4 = new l(8);
                c0585q2.f(jade4);
            }
            c0585q = c0585q2;
            InputContainerViewKt.InputComponentContainerView(copy$default, state, (Function1) jade4, null, null, c0585q, ((i14 << 3) & 112) | 384, 24);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new d(state, style, goToPickerScreen, testTag, i4, 1);
        }
    }

    public static final Unit PickerFieldView$lambda$1$lambda$0(A0.ad semantics) {
        Intrinsics.echo(semantics, "$this$semantics");
        ab.alpha(semantics);
        return Unit.INSTANCE;
    }

    public static final Unit PickerFieldView$lambda$4$lambda$3(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit PickerFieldView$lambda$6$lambda$5(String it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    public static final Unit PickerFieldView$lambda$7(InputComponentState inputComponentState, InputComponentViewStyle inputComponentViewStyle, Function0 function0, String str, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        PickerFieldView(inputComponentState, inputComponentViewStyle, function0, str, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
