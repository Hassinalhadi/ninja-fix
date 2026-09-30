package com.checkout.components.ui.view;

import Ac.h;
import Cb.i;
import D0.an;
import Ec.af;
import F.AbstractC0127k2;
import F.O;
import F.Q;
import P.e;
import T.a;
import T.d;
import T.p;
import T.s;
import a0.ao;
import android.annotation.SuppressLint;
import androidx.compose.animation.b;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import bx.aa;
import com.checkout.components.kmp.rememberme.view.otp.c;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.google.mlkit.vision.barcode.common.Barcode;
import hd.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aW\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "style", "Lcom/checkout/components/ui/model/state/InputComponentState;", "state", "Lkotlin/Function1;", "", "", "onValueChange", "", "onFocusChanged", "testTag", "InputComponentContainerView", "(Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;Lcom/checkout/components/ui/model/state/InputComponentState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/m;II)V", "InputComponentContainerPreview", "(Landroidx/compose/runtime/m;I)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputContainerViewKt {
    @SuppressLint({"UnrememberedMutableState"})
    private static final void InputComponentContainerPreview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2065374598);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            ax zulu = C0564b.zulu("");
            TextLabelState textLabelState = new TextLabelState(C0564b.zulu("Error message"), null, C0564b.zulu(Boolean.TRUE), 2, null);
            p pVar = p.alpha;
            s charlie = V.charlie(pVar, 1.0f);
            ComposableSingletons$InputContainerViewKt composableSingletons$InputContainerViewKt = ComposableSingletons$InputContainerViewKt.INSTANCE;
            AbstractC0127k2.alpha(V.charlie(AbstractC0538d.sierra(pVar, 20), 1.0f), null, ((O) c0585q.kilo(Q.alpha)).november, 0L, 0.0f, 0.0f, null, e.echo(1280122965, new h(new InputFieldViewStyle(charlie, false, false, null, composableSingletons$InputContainerViewKt.m193getLambda$345239535$ui_standardRelease(), composableSingletons$InputContainerViewKt.getLambda$1584991314$ui_standardRelease(), null, null, null, false, 0, 0, null, null, null, 32718, null), new TextLabelViewStyle(null, 0, false, 0, null, new an(ao.delta(4289538110L), AbstractC2636d7.charlie(8), null, null, null, 0L, 0, 0L, 0, 16777212), true, 31, null), zulu, textLabelState, 10), c0585q), c0585q, 12582918, 122);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 11);
        }
    }

    public static final Unit InputComponentContainerPreview$lambda$8(InputFieldViewStyle inputFieldViewStyle, TextLabelViewStyle textLabelViewStyle, ax axVar, TextLabelState textLabelState, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            InputComponentViewStyle inputComponentViewStyle = new InputComponentViewStyle(inputFieldViewStyle, textLabelViewStyle, null, 4, null);
            InputComponentState inputComponentState = new InputComponentState(new InputFieldState(axVar, null, null, null, null, 30, null), textLabelState);
            boolean golf = c0585q.golf(axVar);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (golf || jade == asVar) {
                jade = new i(axVar, 25);
                c0585q.f(jade);
            }
            Function1 function1 = (Function1) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new l(25);
                c0585q.f(jade2);
            }
            InputComponentContainerView(inputComponentViewStyle, inputComponentState, function1, (Function1) jade2, null, c0585q, 27648, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit InputComponentContainerPreview$lambda$8$lambda$5$lambda$4(ax axVar, String it) {
        Intrinsics.echo(it, "it");
        axVar.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit InputComponentContainerPreview$lambda$8$lambda$7$lambda$6(boolean z2) {
        return Unit.INSTANCE;
    }

    public static final Unit InputComponentContainerPreview$lambda$9(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        InputComponentContainerPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputComponentContainerView(@NotNull InputComponentViewStyle style, @NotNull InputComponentState state, @NotNull Function1<? super String, Unit> onValueChange, @Nullable Function1<? super Boolean, Unit> function1, @Nullable String str, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        Function1<? super Boolean, Unit> function12;
        int i11;
        int i12;
        String str2;
        int i13;
        boolean z2;
        Function1<? super Boolean, Unit> function13;
        String str3;
        androidx.compose.runtime.Q uniform;
        char c3;
        Function1<? super Boolean, Unit> function14;
        String str4;
        int i14;
        int i15;
        int i16;
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        Intrinsics.echo(onValueChange, "onValueChange");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(654589717);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(style)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(state)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(onValueChange)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        int i17 = i5 & 8;
        if (i17 != 0) {
            i10 |= 3072;
        } else if ((i4 & 3072) == 0) {
            function12 = function1;
            if (c0585q.india(function12)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i11;
            i12 = i5 & 16;
            if (i12 == 0) {
                i10 |= 24576;
            } else if ((i4 & 24576) == 0) {
                str2 = str;
                if (c0585q.golf(str2)) {
                    i13 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i13 = 8192;
                }
                i10 |= i13;
                if ((i10 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c0585q.magenta(i10 & 1, z2)) {
                    if (i17 != 0) {
                        c3 = ' ';
                        function14 = null;
                    } else {
                        c3 = ' ';
                        function14 = function12;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    s romeo = V.romeo(style.getContainerModifier());
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, d.f2062f, c0585q, 0);
                    long j5 = c0585q.magenta;
                    int i18 = (int) (j5 ^ (j5 >>> c3));
                    I mike = c0585q.mike();
                    s charlie = a.charlie(romeo, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, alpha);
                    C0564b.blue(C2551k.echo, c0585q, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i18))) {
                        ad.blue(i18, c0585q, i18, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie);
                    InputFieldViewKt.InputFieldView(style.getInputFieldStyle(), state.getInputFieldState(), onValueChange, function14, str4, c0585q, 65408 & i10, 0);
                    b.charlie(((Boolean) state.getErrorState().isVisible().getValue()).booleanValue(), null, null, null, null, e.echo(882274211, new af(10, style, state), c0585q), c0585q, 1572870, 30);
                    c0585q = c0585q;
                    c0585q.quebec(true);
                    str3 = str4;
                    function13 = function14;
                } else {
                    c0585q.ochre();
                    function13 = function12;
                    str3 = str2;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new W4.a(style, state, onValueChange, function13, str3, i4, i5, 3);
                    return;
                }
                return;
            }
            str2 = str;
            if ((i10 & 9363) != 9362) {
            }
            if (c0585q.magenta(i10 & 1, z2)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        function12 = function1;
        i12 = i5 & 16;
        if (i12 == 0) {
        }
        str2 = str;
        if ((i10 & 9363) != 9362) {
        }
        if (c0585q.magenta(i10 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final Unit InputComponentContainerView$lambda$2$lambda$1$lambda$0(InputComponentViewStyle inputComponentViewStyle, InputComponentState inputComponentState, aa AnimatedVisibility, InterfaceC0581m interfaceC0581m, int i4) {
        long delta;
        Intrinsics.echo(AnimatedVisibility, "$this$AnimatedVisibility");
        an style = inputComponentViewStyle.getErrorMessageStyle().getStyle();
        if (style != null) {
            delta = style.bravo();
        } else {
            delta = ao.delta(4289538110L);
        }
        InputFieldErrorMessageViewKt.m194InputFieldErrorMessageView3JVO9M(delta, inputComponentViewStyle.getErrorMessageStyle(), inputComponentState.getErrorState(), interfaceC0581m, 0);
        return Unit.INSTANCE;
    }

    public static final Unit InputComponentContainerView$lambda$3(InputComponentViewStyle inputComponentViewStyle, InputComponentState inputComponentState, Function1 function1, Function1 function12, String str, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        InputComponentContainerView(inputComponentViewStyle, inputComponentState, function1, function12, str, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }
}
