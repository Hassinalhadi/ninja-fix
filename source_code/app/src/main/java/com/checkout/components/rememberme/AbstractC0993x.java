package com.checkout.components.rememberme;

import Ec.aa;
import F.AbstractC0141o0;
import Y1.ag;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.ui.picker.PickerBottomSheetScreenKt;
import com.checkout.components.ui.utils.extensions.Utils;
import g0.C1726f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: com.checkout.components.rememberme.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0993x {
    public static final Unit a(ag agVar, DiComponent diComponent, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(agVar, diComponent, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(ag navController, DiComponent di, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        ag agVar;
        Intrinsics.echo(navController, "navController");
        Intrinsics.echo(di, "di");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-957663630);
        if ((i4 & 6) == 0) {
            i5 = (c0585q.india(navController) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= (i4 & 64) == 0 ? c0585q.golf(di) : c0585q.india(di) ? 32 : 16;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 19) != 18)) {
            Utils utils = Utils.INSTANCE;
            long m191toComposeColorvNxB06k = utils.m191toComposeColorvNxB06k(utils.backgroundColor(di.styleProvider().getDesignTokens()));
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new Vc.i(23);
                c0585q.f(jade);
            }
            agVar = navController;
            PickerBottomSheetScreenKt.m184PickerBottomSheetScreencf5BqRc((Function0) jade, agVar, m191toComposeColorvNxB06k, "GetToKnowUsDialog", P.e.echo(-2093972019, new Cb.d(11, di), c0585q), c0585q, ((i5 << 3) & 112) | 27654);
        } else {
            agVar = navController;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(i4, 8, agVar, di);
        }
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Unit a(DiComponent diComponent, Function0 dismissBottomSheet, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(dismissBottomSheet, "dismissBottomSheet");
        if ((i4 & 6) == 0) {
            i5 = i4 | (((C0585q) interfaceC0581m).india(dismissBottomSheet) ? 4 : 2);
        } else {
            i5 = i4;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i5 & 1, (i5 & 19) != 18)) {
            T.p pVar = T.p.alpha;
            C0537c c0537c = AbstractC0542h.alpha;
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.india(8, T.d.f2060c), T.d.f2062f, c0585q, 6);
            long j5 = c0585q.magenta;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(pVar, c0585q);
            C2551k c2551k = InterfaceC2552l.maroon;
            c2551k.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            Xd.l a6 = AbstractC0987v.a(c2551k, c0585q, alpha, c0585q, mike);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                AbstractC0990w.a(i10, c0585q, i10, a6);
            }
            C2549i c2549i = C2551k.delta;
            C0564b.blue(c2549i, c0585q, charlie);
            T.s uniform = AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 16, 0.0f, 2);
            ap delta = AbstractC0547m.delta(T.d.white, false);
            long j6 = c0585q.magenta;
            int i11 = (int) (j6 ^ (j6 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(uniform, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            Xd.l a8 = AbstractC0987v.a(c2551k, c0585q, delta, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                AbstractC0990w.a(i11, c0585q, i11, a8);
            }
            C0564b.blue(c2549i, c0585q, charlie2);
            int i12 = i5 & 14;
            F.K1.foxtrot(dismissBottomSheet, null, false, null, P.e.echo(1050721620, new Ac.k(23, diComponent), c0585q), c0585q, i12 | 196608, 30);
            c0585q.quebec(true);
            diComponent.kmpRememberMe().InfoDialogView(dismissBottomSheet, AbstractC0538d.uniform(pVar, 32, 0.0f, 2), c0585q, (CheckoutKMPRememberMe.$stable << 6) | i12 | 48, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(DiComponent diComponent, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            C1726f alpha = AbstractC2056a.alpha();
            Utils utils = Utils.INSTANCE;
            AbstractC0141o0.bravo(alpha, "", null, utils.m191toComposeColorvNxB06k(utils.primaryColor(diComponent.designTokens())), c0585q, 48, 4);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
