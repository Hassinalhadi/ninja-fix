package com.checkout.components.rememberme;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.view.TextLabelViewKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import q0.ap;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes3.dex */
public abstract class K1 {
    public static final Unit a(long j5, TextLabelViewItem textLabelViewItem, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(j5, textLabelViewItem, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(long j5, TextLabelViewItem viewItem, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(viewItem, "viewItem");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1715921986);
        if ((i4 & 6) == 0) {
            i5 = (c0585q.foxtrot(j5) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= (i4 & 64) == 0 ? c0585q.golf(viewItem) : c0585q.india(viewItem) ? 32 : 16;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 19) != 18)) {
            T.s uniform = AbstractC0538d.uniform(androidx.compose.foundation.a.bravo(T.p.alpha, j5, AbstractC2094g.bravo(4)), 8, 0.0f, 2);
            ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j6 = c0585q.magenta;
            int i10 = (int) (j6 ^ (j6 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(uniform, c0585q);
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
            C0564b.blue(C2551k.delta, c0585q, charlie);
            TextLabelViewKt.TextLabelView(viewItem.getStyle(), viewItem.getState(), c0585q, TextLabelViewStyle.$stable | (TextLabelState.$stable << 3));
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new a5.b(j5, viewItem, i4, 0);
        }
    }
}
