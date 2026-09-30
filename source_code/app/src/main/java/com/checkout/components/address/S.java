package com.checkout.components.address;

import A0.ab;
import F.I1;
import F.K1;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import com.checkout.address.model.State;
import com.checkout.components.address.S;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import h.AbstractC1797a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes3.dex */
public abstract class S {
    public static final Unit a(State state, boolean z2, Function0 function0, TextLabelViewStyle textLabelViewStyle, TextLabelViewStyle textLabelViewStyle2, long j5, long j6, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(state, z2, function0, textLabelViewStyle, textLabelViewStyle2, j5, j6, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(final State state, final boolean z2, final Function0 onClick, final TextLabelViewStyle nameStyle, final TextLabelViewStyle codeStyle, final long j5, long j6, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        long j7;
        C0585q c0585q;
        Intrinsics.echo(state, "state");
        Intrinsics.echo(onClick, "onClick");
        Intrinsics.echo(nameStyle, "nameStyle");
        Intrinsics.echo(codeStyle, "codeStyle");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-888752125);
        if ((i4 & 6) == 0) {
            i5 = ((i4 & 8) == 0 ? c0585q2.golf(state) : c0585q2.india(state) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q2.hotel(z2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q2.india(onClick) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= (i4 & 4096) == 0 ? c0585q2.golf(nameStyle) : c0585q2.india(nameStyle) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i5 |= (32768 & i4) == 0 ? c0585q2.golf(codeStyle) : c0585q2.india(codeStyle) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= c0585q2.foxtrot(j5) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= c0585q2.foxtrot(j6) ? 1048576 : 524288;
        }
        if (c0585q2.magenta(i5 & 1, (599187 & i5) != 599186)) {
            Object jade = c0585q2.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(state.getCode());
                c0585q2.f(jade);
            }
            ax axVar = (ax) jade;
            Object jade2 = c0585q2.jade();
            if (jade2 == asVar) {
                jade2 = C0564b.zulu(state.getDisplayName());
                c0585q2.f(jade2);
            }
            ax axVar2 = (ax) jade2;
            T.p pVar = T.p.alpha;
            boolean z10 = (i5 & 896) == 256;
            Object jade3 = c0585q2.jade();
            if (z10 || jade3 == asVar) {
                jade3 = new com.checkout.components.ui.country.c(onClick, 6);
                c0585q2.f(jade3);
            }
            T.s charlie = androidx.compose.foundation.layout.V.charlie(androidx.compose.foundation.a.echo(15, pVar, null, (Function0) jade3, false), 1.0f);
            Object jade4 = c0585q2.jade();
            if (jade4 == asVar) {
                jade4 = new hd.l(17);
                c0585q2.f(jade4);
            }
            T.s alpha = androidx.compose.ui.platform.a.alpha(A0.o.bravo(charlie, false, (Function1) jade4), (String) axVar2.getValue());
            ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j10 = c0585q2.magenta;
            int i10 = (int) (j10 ^ (j10 >>> 32));
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie2 = T.a.charlie(alpha, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q2, delta);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q2, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i10))) {
                ad.blue(i10, c0585q2, i10, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie2);
            T.s sierra = AbstractC0538d.sierra(pVar, 16);
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(12), T.d.f2061d, c0585q2, 54);
            int i11 = i5;
            long j11 = c0585q2.magenta;
            int i12 = (int) (j11 ^ (j11 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q2.mike();
            T.s charlie3 = T.a.charlie(sierra, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha2);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q2, i12, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie3);
            TextLabelState textLabelState = new TextLabelState(axVar, null, null, 6, null);
            int i13 = TextLabelViewStyle.$stable;
            int i14 = TextLabelState.$stable << 3;
            TextLabelViewKt.TextLabelView(codeStyle, textLabelState, c0585q2, ((i11 >> 12) & 14) | i13 | i14);
            TextLabelState textLabelState2 = new TextLabelState(axVar2, null, null, 6, null);
            T.s modifier = nameStyle.getModifier();
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            c0585q = c0585q2;
            j7 = j6;
            TextLabelViewKt.TextLabelView(TextLabelViewStyle.m180copyQstMH_w$default(nameStyle, modifier.then(new LayoutWeightElement(1.0f, true)), 0, false, 0, null, null, false, 126, null), textLabelState2, c0585q, i13 | i14);
            I1.alpha(z2, null, null, false, K1.papa(j5, j7, c0585q), c0585q2, ((i11 >> 3) & 14) | 48, 44);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            j7 = j6;
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            final long j12 = j7;
            uniform.delta = new Xd.l() { // from class: j4.c
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    int intValue = ((Integer) obj2).intValue();
                    return S.a(State.this, z2, onClick, nameStyle, codeStyle, j5, j12, i4, (InterfaceC0581m) obj, intValue);
                }
            };
        }
    }

    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit a(A0.ad semantics) {
        Intrinsics.echo(semantics, "$this$semantics");
        ab.alpha(semantics);
        return Unit.INSTANCE;
    }
}
