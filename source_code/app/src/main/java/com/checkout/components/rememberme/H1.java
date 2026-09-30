package com.checkout.components.rememberme;

import A0.ab;
import A0.ad;
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
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.view.StyledImageViewKt;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import h.AbstractC1797a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes3.dex */
public abstract class H1 {
    public static final Unit a(TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, ImageStyle imageStyle, Function0 function0, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(textLabelViewItem, textLabelViewItem2, imageStyle, function0, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit b(ax axVar) {
        axVar.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void a(TextLabelViewItem logoutTextItem, TextLabelViewItem emailItem, ImageStyle overflowImageStyle, Function0 onLogoutClick, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        ax axVar;
        Intrinsics.echo(logoutTextItem, "logoutTextItem");
        Intrinsics.echo(emailItem, "emailItem");
        Intrinsics.echo(overflowImageStyle, "overflowImageStyle");
        Intrinsics.echo(onLogoutClick, "onLogoutClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1829380887);
        if ((i4 & 6) == 0) {
            i5 = ((i4 & 8) == 0 ? c0585q.golf(logoutTextItem) : c0585q.india(logoutTextItem) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= (i4 & 64) == 0 ? c0585q.golf(emailItem) : c0585q.india(emailItem) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= (i4 & 512) == 0 ? c0585q.golf(overflowImageStyle) : c0585q.india(overflowImageStyle) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0585q.india(onLogoutClick) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 1171) != 1170)) {
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(Boolean.FALSE);
                c0585q.f(jade);
            }
            ax axVar2 = (ax) jade;
            T.p pVar = T.p.alpha;
            T.s tango = AbstractC0538d.tango(pVar, 24, 12);
            T.k kVar = T.d.alpha;
            ap delta = AbstractC0547m.delta(kVar, false);
            long j5 = c0585q.magenta;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(tango, c0585q);
            C2551k c2551k = InterfaceC2552l.maroon;
            c2551k.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            Xd.l a6 = AbstractC0987v.a(c2551k, c0585q, delta, c0585q, mike);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                AbstractC0990w.a(i10, c0585q, i10, a6);
            }
            C2549i c2549i = C2551k.delta;
            C0564b.blue(c2549i, c0585q, charlie);
            androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.bravo, T.d.f2061d, c0585q, 54);
            long j6 = c0585q.magenta;
            int i11 = (int) (j6 ^ (j6 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            Xd.l a8 = AbstractC0987v.a(c2551k, c0585q, alpha, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                AbstractC0990w.a(i11, c0585q, i11, a8);
            }
            C0564b.blue(c2549i, c0585q, charlie2);
            TextLabelViewStyle style = emailItem.getStyle();
            T.s modifier = emailItem.getStyle().getModifier();
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            TextLabelViewKt.TextLabelView(TextLabelViewStyle.m180copyQstMH_w$default(style, modifier.then(new LayoutWeightElement(1.0f, true)), 0, false, 0, null, null, false, 126, null), emailItem.getState(), c0585q, TextLabelViewStyle.$stable | (TextLabelState.$stable << 3));
            T.s sierra = androidx.compose.foundation.layout.V.sierra(pVar, T.d.red, 2);
            ap delta2 = AbstractC0547m.delta(kVar, false);
            long j7 = c0585q.magenta;
            int i12 = (int) (j7 ^ (j7 >>> 32));
            androidx.compose.runtime.I mike3 = c0585q.mike();
            T.s charlie3 = T.a.charlie(sierra, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            Xd.l a10 = AbstractC0987v.a(c2551k, c0585q, delta2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                AbstractC0990w.a(i12, c0585q, i12, a10);
            }
            C0564b.blue(c2549i, c0585q, charlie3);
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                axVar = axVar2;
                jade2 = new Cb.u(axVar, 9);
                c0585q.f(jade2);
            } else {
                axVar = axVar2;
            }
            StyledImageViewKt.StyledImageView(ImageStyle.copy$default(overflowImageStyle, null, null, null, null, null, null, (Function0) jade2, null, 191, null), "rm_wallet_menu", c0585q, ImageStyle.$stable | 48, 0);
            boolean booleanValue = ((Boolean) axVar.getValue()).booleanValue();
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                jade3 = new Cb.u(axVar, 10);
                c0585q.f(jade3);
            }
            Function0 function0 = (Function0) jade3;
            Object jade4 = c0585q.jade();
            if (jade4 == asVar) {
                jade4 = new X9.i(29);
                c0585q.f(jade4);
            }
            I.a(logoutTextItem, booleanValue, function0, onLogoutClick, androidx.compose.ui.platform.a.alpha(A0.o.bravo(pVar, false, (Function1) jade4), "rm_wallet_menu_logout_button"), c0585q, TextLabelViewItem.$stable | 384 | (i5 & 14) | (i5 & 7168), 0);
            A0.z.papa(c0585q, true, true, true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Gb.j(logoutTextItem, emailItem, overflowImageStyle, onLogoutClick, i4, 4);
        }
    }

    public static final Unit a(ax axVar) {
        axVar.setValue(Boolean.valueOf(!((Boolean) axVar.getValue()).booleanValue()));
        return Unit.INSTANCE;
    }

    public static final Unit a(ad semantics) {
        Intrinsics.echo(semantics, "$this$semantics");
        ab.alpha(semantics);
        return Unit.INSTANCE;
    }
}
