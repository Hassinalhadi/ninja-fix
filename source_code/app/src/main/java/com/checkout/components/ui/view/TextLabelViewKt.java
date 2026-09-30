package com.checkout.components.ui.view;

import D0.ak;
import D0.an;
import Ec.aa;
import F.G2;
import T.a;
import T.d;
import T.p;
import T.s;
import a0.C0366t;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.S;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import com.checkout.components.kmp.rememberme.view.otp.c;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import h.AbstractC1797a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "style", "Lcom/checkout/components/ui/model/state/TextLabelState;", "state", "", "TextLabelView", "(Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/state/TextLabelState;Landroidx/compose/runtime/m;I)V", "TextLabelPreview", "(Landroidx/compose/runtime/m;I)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextLabelViewKt {
    @SuppressLint({"UnrememberedMutableState"})
    private static final void TextLabelPreview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1588299571);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            TextLabelView(new TextLabelViewStyle(null, 0, false, 0, null, new an(C0366t.charlie, 0L, null, null, null, 0L, 0, 0L, 0, 16777214), false, 95, null), new TextLabelState(C0564b.zulu("Test label text"), null, null, 6, null), c0585q, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 15);
        }
    }

    public static final Unit TextLabelPreview$lambda$3(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        TextLabelPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void TextLabelView(@NotNull TextLabelViewStyle style, @NotNull TextLabelState state, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        s sVar;
        int i10;
        int i11;
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1285703365);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(style)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(state)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i5 & 1, z2)) {
            s modifier = style.getModifier();
            S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, d.f2061d, c0585q2, 48);
            long j5 = c0585q2.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q2.mike();
            s charlie = a.charlie(modifier, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, alpha);
            C0564b.blue(C2551k.echo, c0585q2, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q2, i12, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie);
            c0585q2.purple(-9206589);
            String str = (String) state.getText().getValue();
            if (style.getTextMaxWidth()) {
                if (1.0f <= 0.0d) {
                    AbstractC1797a.alpha("invalid weight; must be greater than zero");
                }
                sVar = new LayoutWeightElement(1.0f, true);
            } else {
                sVar = p.alpha;
            }
            s sVar2 = sVar;
            int m183getOverflowgIe3tQ8 = style.m183getOverflowgIe3tQ8();
            boolean softWrap = style.getSoftWrap();
            int maxLines = style.getMaxLines();
            Function1<ak, Unit> onTextLayout = style.getOnTextLayout();
            an style2 = style.getStyle();
            if (style2 == null) {
                c0585q2.purple(-52801727);
                style2 = (an) c0585q2.kilo(G2.alpha);
            } else {
                c0585q2.purple(-52802626);
            }
            c0585q2.quebec(false);
            G2.bravo(str, sVar2, 0L, 0L, null, null, 0L, null, 0L, m183getOverflowgIe3tQ8, softWrap, maxLines, 0, onTextLayout, style2, c0585q2, 0, 0, 18428);
            c0585q = c0585q2;
            c0585q.quebec(false);
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(i4, 22, style, state);
        }
    }

    public static final Unit TextLabelView$lambda$2(TextLabelViewStyle textLabelViewStyle, TextLabelState textLabelState, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        TextLabelView(textLabelViewStyle, textLabelState, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
