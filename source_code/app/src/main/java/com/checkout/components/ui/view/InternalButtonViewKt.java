package com.checkout.components.ui.view;

import A0.ab;
import A0.ad;
import A0.o;
import D0.an;
import F.AbstractC0127k2;
import F.K1;
import F.O;
import F.Q;
import F.ak;
import F.al;
import P.e;
import T.p;
import T.s;
import a0.C0360n;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.a;
import com.checkout.components.interfaces.model.PaymentState;
import com.checkout.components.interfaces.uicustomisation.font.FontStyle;
import com.checkout.components.kmp.rememberme.view.otp.c;
import com.checkout.components.ui.R;
import com.checkout.components.ui.mapper.ButtonStyleToInternalStateMapper;
import com.checkout.components.ui.mapper.ButtonStyleToInternalViewStyleMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.model.Padding;
import com.checkout.components.ui.model.Shape;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.base.TextStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.google.mlkit.vision.barcode.common.Barcode;
import h5.C1809a;
import hd.l;
import k5.C2011d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t6.AbstractC3076w3;
import t6.W3;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r*\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "style", "Lcom/checkout/components/ui/model/state/InternalButtonState;", "state", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentState", "Lkotlin/Function0;", "", "onClick", "", "testTag", "InternalButtonView", "(Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;Lcom/checkout/components/ui/model/state/InternalButtonState;Lcom/checkout/components/interfaces/model/PaymentState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/m;II)V", "Lkotlin/Pair;", "", "", "getTrailingIconIdAndShouldRotate", "(Lcom/checkout/components/interfaces/model/PaymentState;)Lkotlin/Pair;", "isPaymentCompleted", "LF/ak;", "provideColors", "(Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;ZLandroidx/compose/runtime/m;I)LF/ak;", "ButtonPreview", "(Landroidx/compose/runtime/m;I)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InternalButtonViewKt {
    private static final void ButtonPreview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1957542046);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0127k2.alpha(V.charlie(AbstractC0538d.sierra(p.alpha, 20), 1.0f), null, ((O) c0585q.kilo(Q.alpha)).november, 0L, 0.0f, 0.0f, null, e.echo(-2019718105, new C2011d(new ButtonStyle(4278935536L, 4291611852L, 0L, 4294967295L, 4278190080L, Shape.RoundCorner, null, TextLabelStyle.copy$default(new TextLabelStyle(null, null, null, false, 15, null), "Save", null, new TextStyle(15, null, FontStyle.Italic, null, 0L, null, 0, null, null, null, 1018, null), false, 10, null), new ContainerStyle(0L, null, null, new Padding(16, 0, 0, 0, 14, null), 7, null), 68, null), 0), c0585q), c0585q, 12582918, 122);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 13);
        }
    }

    public static final Unit ButtonPreview$lambda$10(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        ButtonPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit ButtonPreview$lambda$9(ButtonStyle buttonStyle, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            InternalButtonViewStyle map = ButtonStyleToInternalViewStyleMapper.INSTANCE.getDEFAULT().map(buttonStyle);
            InternalButtonState map2 = new ButtonStyleToInternalStateMapper(new TextLabelStyleToStateMapper()).map(buttonStyle);
            PaymentState.Completed completed = PaymentState.Completed.INSTANCE;
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new C1809a(10);
                c0585q.f(jade);
            }
            InternalButtonView(map, map2, completed, (Function0) jade, null, c0585q, (PaymentState.Completed.$stable << 6) | 3072, 16);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalButtonView(@NotNull InternalButtonViewStyle style, @NotNull InternalButtonState state, @Nullable PaymentState paymentState, @NotNull Function0<Unit> onClick, @Nullable String str, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        boolean india;
        int i11;
        String str2;
        int i12;
        boolean z2;
        String str3;
        androidx.compose.runtime.Q uniform;
        String str4;
        int i13;
        int i14;
        int i15;
        PaymentState paymentState2 = paymentState;
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1915369001);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(style)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(state)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        }
        int i16 = i5 & 4;
        if (i16 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            if ((i4 & 512) == 0) {
                india = c0585q.golf(paymentState2);
            } else {
                india = c0585q.india(paymentState2);
            }
            if (india) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(onClick)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i13;
        }
        int i17 = i5 & 16;
        if (i17 != 0) {
            i10 |= 24576;
        } else if ((i4 & 24576) == 0) {
            str2 = str;
            if (c0585q.golf(str2)) {
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
            if ((i10 & 9363) == 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i10 & 1, z2)) {
                s sVar = null;
                if (i16 != 0) {
                    paymentState2 = null;
                }
                if (i17 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                boolean booleanValue = ((Boolean) state.isEnabled().getValue()).booleanValue();
                ak provideColors = provideColors(style, Intrinsics.areEqual(paymentState2, PaymentState.Completed.INSTANCE), c0585q, i10 & 14);
                c0585q.purple(-1871340727);
                s golf = V.golf(style.getModifier(), 44, 0.0f, 2);
                if (str4 == null) {
                    c0585q.purple(143425127);
                    c0585q.quebec(false);
                } else {
                    c0585q.purple(143425128);
                    Object jade = c0585q.jade();
                    if (jade == C0580l.alpha) {
                        jade = new l(27);
                        c0585q.f(jade);
                    }
                    sVar = a.alpha(o.bravo(golf, false, (Function1) jade), str4);
                    c0585q.quebec(false);
                }
                if (sVar != null) {
                    golf = sVar;
                }
                c0585q.quebec(false);
                K1.bravo(onClick, golf, booleanValue, style.getShape(), provideColors, null, null, null, e.echo(1745213497, new Vc.o(style, state, paymentState2, 5), c0585q), c0585q, ((i10 >> 9) & 14) | 805306368, 480);
                str3 = str4;
            } else {
                c0585q.ochre();
                str3 = str2;
            }
            PaymentState paymentState3 = paymentState2;
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new W4.a(style, state, paymentState3, onClick, str3, i4, i5, 5);
                return;
            }
            return;
        }
        str2 = str;
        if ((i10 & 9363) == 9362) {
        }
        if (!c0585q.magenta(i10 & 1, z2)) {
        }
        PaymentState paymentState32 = paymentState2;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Unit InternalButtonView$lambda$3$lambda$2$lambda$1$lambda$0(ad semantics) {
        Intrinsics.echo(semantics, "$this$semantics");
        ab.alpha(semantics);
        return Unit.INSTANCE;
    }

    public static final Unit InternalButtonView$lambda$5(InternalButtonViewStyle internalButtonViewStyle, InternalButtonState internalButtonState, PaymentState paymentState, T Button, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Pair<Integer, Boolean> pair;
        long j5;
        Intrinsics.echo(Button, "$this$Button");
        if ((i4 & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            TextLabelViewKt.TextLabelView(internalButtonViewStyle.getTextStyle(), internalButtonState.getTextState(), c0585q, 0);
            if (paymentState != null) {
                pair = getTrailingIconIdAndShouldRotate(paymentState);
            } else {
                pair = null;
            }
            if (pair == null) {
                c0585q.purple(1076352274);
                c0585q.quebec(false);
            } else {
                c0585q.purple(1076352275);
                int intValue = ((Number) pair.first).intValue();
                boolean booleanValue = ((Boolean) pair.second).booleanValue();
                an style = internalButtonViewStyle.getTextStyle().getStyle();
                if (style != null) {
                    j5 = style.bravo();
                } else {
                    j5 = C0366t.echo;
                }
                if (booleanValue) {
                    c0585q.purple(-1291270160);
                    RotateIconViewKt.m195RotateIconViewRPmYEkk(intValue, j5, c0585q, 0);
                    c0585q.quebec(false);
                } else {
                    c0585q.purple(-1291180632);
                    W3.alpha(AbstractC3076w3.charlie(intValue, c0585q, 0), "", AbstractC0538d.whiskey(p.alpha, 8, 0.0f, 0.0f, 0.0f, 14), null, null, 0.0f, new C0360n(j5, 5), c0585q, 432, 56);
                    c0585q.quebec(false);
                }
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit InternalButtonView$lambda$6(InternalButtonViewStyle internalButtonViewStyle, InternalButtonState internalButtonState, PaymentState paymentState, Function0 function0, String str, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        InternalButtonView(internalButtonViewStyle, internalButtonState, paymentState, function0, str, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    private static final Pair<Integer, Boolean> getTrailingIconIdAndShouldRotate(PaymentState paymentState) {
        if (Intrinsics.areEqual(paymentState, PaymentState.InProgress.INSTANCE)) {
            return new Pair<>(Integer.valueOf(R.drawable.cko_ic_spinner), Boolean.TRUE);
        }
        if (Intrinsics.areEqual(paymentState, PaymentState.Completed.INSTANCE)) {
            return new Pair<>(Integer.valueOf(R.drawable.cko_ic_check), Boolean.FALSE);
        }
        return null;
    }

    private static final ak provideColors(InternalButtonViewStyle internalButtonViewStyle, boolean z2, InterfaceC0581m interfaceC0581m, int i4) {
        long m175getContainerColor0d7_KjU;
        M m4 = al.alpha;
        if (z2) {
            m175getContainerColor0d7_KjU = internalButtonViewStyle.m179getSuccessContainerColor0d7_KjU();
        } else {
            m175getContainerColor0d7_KjU = internalButtonViewStyle.m175getContainerColor0d7_KjU();
        }
        return al.alpha(m175getContainerColor0d7_KjU, internalButtonViewStyle.m176getContentColor0d7_KjU(), internalButtonViewStyle.m177getDisabledContainerColor0d7_KjU(), internalButtonViewStyle.m178getDisabledContentColor0d7_KjU(), interfaceC0581m, 0);
    }
}
