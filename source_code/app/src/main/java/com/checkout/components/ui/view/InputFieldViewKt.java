package com.checkout.components.ui.view;

import A0.ab;
import A0.ad;
import A0.o;
import Cb.ac;
import Cb.i;
import Cb.t;
import D0.an;
import F.AbstractC0127k2;
import F.AbstractC0174x1;
import F.C0143o2;
import F.C0150q1;
import F.C0162t2;
import F.G2;
import F.O;
import F.Q;
import F.Z1;
import I0.aj;
import N2.ae;
import P.e;
import T.p;
import T.s;
import Y.v;
import Y.x;
import Yb.C0312j0;
import a0.C0366t;
import a0.ao;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.ui.focus.a;
import com.checkout.components.kmp.rememberme.view.otp.c;
import com.checkout.components.ui.model.InputFieldColors;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.utils.extensions.ModifierExtensionsKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import hd.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n.av;
import n.aw;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aW\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "style", "Lcom/checkout/components/ui/model/state/InputFieldState;", "state", "Lkotlin/Function1;", "", "", "onValueChange", "", "onFocusChanged", "testTag", "InputFieldView", "(Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;Lcom/checkout/components/ui/model/state/InputFieldState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/m;II)V", "", "maxLength", "Lkotlin/Function0;", "currentValue", "withMaxLength", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function1;", "Lcom/checkout/components/ui/model/InputFieldColors;", "colors", "La0/t;", "provideCursorColor", "(Lcom/checkout/components/ui/model/InputFieldColors;Landroidx/compose/runtime/m;I)J", "LF/o2;", "provideInputFieldColors", "(Lcom/checkout/components/ui/model/InputFieldColors;Landroidx/compose/runtime/m;I)LF/o2;", "InputFieldPreview", "(Landroidx/compose/runtime/m;I)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputFieldViewKt {
    @SuppressLint({"UnrememberedMutableState"})
    public static final void InputFieldPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-657434657);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0127k2.alpha(V.charlie(AbstractC0538d.sierra(p.alpha, 20), 1.0f), null, ((O) c0585q.kilo(Q.alpha)).november, 0L, 0.0f, 0.0f, null, e.echo(-719610716, new t(C0564b.zulu(""), 4), c0585q), c0585q, 12582918, 122);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 12);
        }
    }

    public static final Unit InputFieldPreview$lambda$13(ax axVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            s charlie = V.charlie(p.alpha, 1.0f);
            ComposableSingletons$InputFieldViewKt composableSingletons$InputFieldViewKt = ComposableSingletons$InputFieldViewKt.INSTANCE;
            InputFieldViewStyle inputFieldViewStyle = new InputFieldViewStyle(charlie, false, false, null, composableSingletons$InputFieldViewKt.getLambda$1395455012$ui_standardRelease(), composableSingletons$InputFieldViewKt.getLambda$691592037$ui_standardRelease(), null, null, null, false, 0, 0, null, null, null, 32718, null);
            InputFieldState inputFieldState = new InputFieldState(axVar, null, null, null, null, 30, null);
            boolean golf = c0585q.golf(axVar);
            Object jade = c0585q.jade();
            if (golf || jade == C0580l.alpha) {
                jade = new i(axVar, 26);
                c0585q.f(jade);
            }
            InputFieldView(inputFieldViewStyle, inputFieldState, (Function1) jade, null, null, c0585q, 0, 24);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit InputFieldPreview$lambda$13$lambda$12$lambda$11(ax axVar, String it) {
        Intrinsics.echo(it, "it");
        axVar.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit InputFieldPreview$lambda$14(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        InputFieldPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputFieldView(@NotNull InputFieldViewStyle style, @NotNull InputFieldState state, @NotNull Function1<? super String, Unit> onValueChange, @Nullable Function1<? super Boolean, Unit> function1, @Nullable String str, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        Function1<? super Boolean, Unit> function12;
        int i11;
        int i12;
        String str2;
        int i13;
        boolean z2;
        C0585q c0585q;
        Function1<? super Boolean, Unit> function13;
        String str3;
        androidx.compose.runtime.Q uniform;
        Function1<? super Boolean, Unit> function14;
        String str4;
        boolean z10;
        int i14;
        int i15;
        int i16;
        boolean z11 = true;
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        Intrinsics.echo(onValueChange, "onValueChange");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1853141448);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(style)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(state)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.india(onValueChange)) {
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
            if (c0585q2.india(function12)) {
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
                if (c0585q2.golf(str2)) {
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
                if (c0585q2.magenta(i10 & 1, z2)) {
                    if (i17 != 0) {
                        function14 = null;
                    } else {
                        function14 = function12;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    s clearFocusOnKeyboardDismiss = ModifierExtensionsKt.clearFocusOnKeyboardDismiss(style.getModifier());
                    if ((i10 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Object jade = c0585q2.jade();
                    as asVar = C0580l.alpha;
                    if (z10 || jade == asVar) {
                        jade = new ae(9, function14);
                        c0585q2.f(jade);
                    }
                    s alpha = V.alpha(a.bravo(clearFocusOnKeyboardDismiss, (Function1) jade), C0162t2.charlie, C0162t2.bravo);
                    Object jade2 = c0585q2.jade();
                    if (jade2 == asVar) {
                        jade2 = new l(26);
                        c0585q2.f(jade2);
                    }
                    s optionalTestTag = ModifierExtensionsKt.optionalTestTag(o.bravo(alpha, false, (Function1) jade2), str4);
                    an textStyle = style.getTextStyle();
                    if (textStyle == null) {
                        c0585q2.purple(599855841);
                        textStyle = (an) c0585q2.kilo(G2.alpha);
                    } else {
                        c0585q2.purple(599854787);
                    }
                    c0585q2.quebec(false);
                    C0143o2 provideInputFieldColors = provideInputFieldColors(style.getColors(), c0585q2, 0);
                    long bravo = textStyle.bravo();
                    if (bravo == 16) {
                        bravo = C0366t.bravo;
                    }
                    an delta = textStyle.delta(new an(bravo, 0L, null, null, null, 0L, 0, 0L, 0, 16777214));
                    String str5 = (String) state.getText().getValue();
                    Integer num = (Integer) state.getMaxLength().getValue();
                    if ((i10 & 112) != 32) {
                        z11 = false;
                    }
                    Object jade3 = c0585q2.jade();
                    if (z11 || jade3 == asVar) {
                        jade3 = new C0312j0(29, state);
                        c0585q2.f(jade3);
                    }
                    Function1<String, Unit> withMaxLength = withMaxLength(onValueChange, num, (Function0) jade3);
                    Xd.l label = style.getLabel();
                    Xd.l placeholder = style.getPlaceholder();
                    aj visualTransformation = style.getVisualTransformation();
                    Xd.l leadingIcon = state.getLeadingIcon();
                    Xd.l trailingIcon = state.getTrailingIcon();
                    boolean singleLine = style.getSingleLine();
                    boolean enabled = style.getEnabled();
                    boolean booleanValue = ((Boolean) state.isError().getValue()).booleanValue();
                    int maxLines = style.getMaxLines();
                    int minLines = style.getMinLines();
                    av keyboardActions = style.getKeyboardActions();
                    aw keyboardOptions = style.getKeyboardOptions();
                    a0.as borderShape = style.getBorderShape();
                    if (borderShape == null) {
                        c0585q2.purple(599886335);
                        C0150q1 c0150q1 = C0150q1.alpha;
                        borderShape = Z1.alpha(c0585q2, 3);
                    } else {
                        c0585q2.purple(599885064);
                    }
                    c0585q2.quebec(false);
                    c0585q = c0585q2;
                    AbstractC0174x1.alpha(str5, withMaxLength, optionalTestTag, enabled, delta, label, placeholder, leadingIcon, trailingIcon, null, booleanValue, visualTransformation, keyboardOptions, keyboardActions, singleLine, maxLines, minLines, borderShape, provideInputFieldColors, c0585q, 0, 0, 1055760);
                    str3 = str4;
                    function13 = function14;
                } else {
                    c0585q = c0585q2;
                    c0585q.ochre();
                    function13 = function12;
                    str3 = str2;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new W4.a(style, state, onValueChange, function13, str3, i4, i5, 4);
                    return;
                }
                return;
            }
            str2 = str;
            if ((i10 & 9363) != 9362) {
            }
            if (c0585q2.magenta(i10 & 1, z2)) {
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
        if (c0585q2.magenta(i10 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final Unit InputFieldView$lambda$8$lambda$2$lambda$1(Function1 function1, v it) {
        Intrinsics.echo(it, "it");
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(((x) it).bravo()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit InputFieldView$lambda$8$lambda$4$lambda$3(ad semantics) {
        Intrinsics.echo(semantics, "$this$semantics");
        ab.alpha(semantics);
        return Unit.INSTANCE;
    }

    public static final String InputFieldView$lambda$8$lambda$7$lambda$6(InputFieldState inputFieldState) {
        return (String) inputFieldState.getText().getValue();
    }

    public static final Unit InputFieldView$lambda$9(InputFieldViewStyle inputFieldViewStyle, InputFieldState inputFieldState, Function1 function1, Function1 function12, String str, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        InputFieldView(inputFieldViewStyle, inputFieldState, function1, function12, str, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    private static final long provideCursorColor(InputFieldColors inputFieldColors, InterfaceC0581m interfaceC0581m, int i4) {
        C0366t c0366t;
        C0366t c0366t2;
        if (inputFieldColors == null || (c0366t = inputFieldColors.m156getCursorHandleColorQN2ZGVo()) == null) {
            c0366t = null;
            if (inputFieldColors != null) {
                c0366t2 = inputFieldColors.m155getCursorColorQN2ZGVo();
            } else {
                c0366t2 = null;
            }
            if (c0366t2 != null) {
                c0366t = c0366t2;
            } else {
                if (inputFieldColors != null) {
                    c0366t = inputFieldColors.m162getFocusedIndicatorColorQN2ZGVo();
                }
                if (c0366t == null) {
                    int i5 = C0366t.lima;
                    return C0366t.bravo;
                }
            }
        }
        return c0366t.alpha;
    }

    private static final C0143o2 provideInputFieldColors(InputFieldColors inputFieldColors, InterfaceC0581m interfaceC0581m, int i4) {
        long j5;
        long delta;
        long delta2;
        long delta3;
        long delta4;
        long delta5;
        long delta6;
        long delta7;
        long delta8;
        long j6;
        C0366t c0366t;
        long delta9;
        C0366t m160getErrorCursorColorQN2ZGVo;
        C0366t m161getErrorIndicatorColorQN2ZGVo;
        C0366t m158getDisabledIndicatorColorQN2ZGVo;
        C0366t m166getUnfocusedIndicatorColorQN2ZGVo;
        C0366t m162getFocusedIndicatorColorQN2ZGVo;
        C0366t m167getUnfocusedLabelColorQN2ZGVo;
        C0366t m159getDisabledLabelColorQN2ZGVo;
        C0366t m163getFocusedLabelColorQN2ZGVo;
        C0366t m164getPlaceholderColorQN2ZGVo;
        C0366t m165getTextColorQN2ZGVo;
        if (inputFieldColors != null && (m165getTextColorQN2ZGVo = inputFieldColors.m165getTextColorQN2ZGVo()) != null) {
            j5 = m165getTextColorQN2ZGVo.alpha;
        } else {
            j5 = C0366t.bravo;
        }
        long j7 = j5;
        if (inputFieldColors != null && (m164getPlaceholderColorQN2ZGVo = inputFieldColors.m164getPlaceholderColorQN2ZGVo()) != null) {
            delta = m164getPlaceholderColorQN2ZGVo.alpha;
        } else {
            delta = ao.delta(4289769648L);
        }
        long j10 = delta;
        if (inputFieldColors != null && (m163getFocusedLabelColorQN2ZGVo = inputFieldColors.m163getFocusedLabelColorQN2ZGVo()) != null) {
            delta2 = m163getFocusedLabelColorQN2ZGVo.alpha;
        } else {
            delta2 = ao.delta(4279790335L);
        }
        long j11 = delta2;
        if (inputFieldColors != null && (m159getDisabledLabelColorQN2ZGVo = inputFieldColors.m159getDisabledLabelColorQN2ZGVo()) != null) {
            delta3 = m159getDisabledLabelColorQN2ZGVo.alpha;
        } else {
            delta3 = ao.delta(4289769648L);
        }
        long j12 = delta3;
        if (inputFieldColors != null && (m167getUnfocusedLabelColorQN2ZGVo = inputFieldColors.m167getUnfocusedLabelColorQN2ZGVo()) != null) {
            delta4 = m167getUnfocusedLabelColorQN2ZGVo.alpha;
        } else {
            delta4 = ao.delta(4289769648L);
        }
        long j13 = delta4;
        if (inputFieldColors != null && (m162getFocusedIndicatorColorQN2ZGVo = inputFieldColors.m162getFocusedIndicatorColorQN2ZGVo()) != null) {
            delta5 = m162getFocusedIndicatorColorQN2ZGVo.alpha;
        } else {
            delta5 = ao.delta(4279790335L);
        }
        long j14 = delta5;
        if (inputFieldColors != null && (m166getUnfocusedIndicatorColorQN2ZGVo = inputFieldColors.m166getUnfocusedIndicatorColorQN2ZGVo()) != null) {
            delta6 = m166getUnfocusedIndicatorColorQN2ZGVo.alpha;
        } else {
            delta6 = ao.delta(4287927444L);
        }
        long j15 = delta6;
        if (inputFieldColors != null && (m158getDisabledIndicatorColorQN2ZGVo = inputFieldColors.m158getDisabledIndicatorColorQN2ZGVo()) != null) {
            delta7 = m158getDisabledIndicatorColorQN2ZGVo.alpha;
        } else {
            delta7 = ao.delta(4289769648L);
        }
        long j16 = delta7;
        if (inputFieldColors != null && (m161getErrorIndicatorColorQN2ZGVo = inputFieldColors.m161getErrorIndicatorColorQN2ZGVo()) != null) {
            delta8 = m161getErrorIndicatorColorQN2ZGVo.alpha;
        } else {
            delta8 = ao.delta(4289538110L);
        }
        long j17 = delta8;
        if (inputFieldColors != null) {
            j6 = inputFieldColors.m154getContainerColor0d7_KjU();
        } else {
            j6 = C0366t.juliet;
        }
        long j18 = j6;
        long provideCursorColor = provideCursorColor(inputFieldColors, interfaceC0581m, i4 & 14);
        if (inputFieldColors != null && (m160getErrorCursorColorQN2ZGVo = inputFieldColors.m160getErrorCursorColorQN2ZGVo()) != null) {
            delta9 = m160getErrorCursorColorQN2ZGVo.alpha;
        } else {
            if (inputFieldColors != null) {
                c0366t = inputFieldColors.m161getErrorIndicatorColorQN2ZGVo();
            } else {
                c0366t = null;
            }
            if (c0366t != null) {
                delta9 = c0366t.alpha;
            } else {
                delta9 = ao.delta(4289538110L);
            }
        }
        long j19 = delta9;
        C0150q1 c0150q1 = C0150q1.alpha;
        return C0150q1.charlie(j7, j7, j18, j18, j18, j18, provideCursorColor, j19, j14, j15, j16, j17, j11, j13, j12, j17, j10, j10, interfaceC0581m, 1618969612);
    }

    private static final Function1<String, Unit> withMaxLength(Function1<? super String, Unit> function1, Integer num, Function0<String> function0) {
        return new ac(num, function0, function1, 19);
    }

    public static final Unit withMaxLength$lambda$10(Integer num, Function0 function0, Function1 function1, String input) {
        Intrinsics.echo(input, "input");
        if (num != null) {
            input = StringsKt.yellow(num.intValue(), input);
        }
        if (!Intrinsics.areEqual(input, function0.invoke())) {
            function1.invoke(input);
        }
        return Unit.INSTANCE;
    }
}
