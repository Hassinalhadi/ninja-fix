package com.checkout.components.rememberme;

import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: com.checkout.components.rememberme.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0926a1 {
    public static final Unit a(CheckoutKMPRememberMe checkoutKMPRememberMe, T.s sVar, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        a(checkoutKMPRememberMe, sVar, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final void a(CheckoutKMPRememberMe kmpRememberMe, T.s sVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        Intrinsics.echo(kmpRememberMe, "kmpRememberMe");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1186628641);
        if ((i4 & 6) == 0) {
            i10 = ((i4 & 8) == 0 ? c0585q.golf(kmpRememberMe) : c0585q.india(kmpRememberMe) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        int i11 = i5 & 2;
        if (i11 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            i10 |= c0585q.golf(sVar) ? 32 : 16;
        }
        if (c0585q.magenta(i10 & 1, (i10 & 19) != 18)) {
            if (i11 != 0) {
                sVar = T.p.alpha;
            }
            T.s charlie = androidx.compose.foundation.layout.V.charlie(sVar, 1.0f);
            androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf, T.d.f2061d, c0585q, 54);
            long j5 = c0585q.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(charlie, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                AbstractC0990w.a(i12, c0585q, i12, a6);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            int i13 = ((i10 << 3) & 112) | (CheckoutKMPRememberMe.$stable << 3);
            kmpRememberMe.SecuredTextView(null, c0585q, i13, 1);
            kmpRememberMe.InfoTextView(null, c0585q, i13, 1);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        T.s sVar2 = sVar;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new a5.u(kmpRememberMe, sVar2, i4, i5, 0);
        }
    }
}
