package com.checkout.components.core.ui.content;

import G4.b;
import T.a;
import T.d;
import T.p;
import T.s;
import Xd.l;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import com.checkout.components.core.utils.constants.PaymentComponentContainerConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "", "componentUi", "PaymentComponentContainerView", "(LXd/l;Landroidx/compose/runtime/m;I)V", "core_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentComponentContainerViewKt {
    public static final void PaymentComponentContainerView(@NotNull l componentUi, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        Intrinsics.echo(componentUi, "componentUi");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2002677556);
        if ((i4 & 6) == 0) {
            if (c0585q.india(componentUi)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            p pVar = p.alpha;
            PaymentComponentContainerConstants paymentComponentContainerConstants = PaymentComponentContainerConstants.INSTANCE;
            s whiskey = AbstractC0538d.whiskey(pVar, paymentComponentContainerConstants.m108getPaddingStartD9Ej5fM(), 0.0f, paymentComponentContainerConstants.m107getPaddingEndD9Ej5fM(), paymentComponentContainerConstants.m106getPaddingBottomD9Ej5fM(), 2);
            ap delta = AbstractC0547m.delta(d.alpha, false);
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = a.charlie(whiskey, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ad.blue(i11, c0585q, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            componentUi.invoke(c0585q, Integer.valueOf(i5 & 14));
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new b(componentUi, i4, 0);
        }
    }

    public static final Unit a(l lVar, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        PaymentComponentContainerView(lVar, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
