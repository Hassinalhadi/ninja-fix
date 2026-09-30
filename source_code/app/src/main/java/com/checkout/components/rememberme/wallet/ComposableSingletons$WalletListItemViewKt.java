package com.checkout.components.rememberme.wallet;

import F.AbstractC0127k2;
import P.b;
import P.d;
import T.a;
import T.p;
import T.s;
import Xd.l;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.rememberme.AbstractC0987v;
import com.checkout.components.rememberme.AbstractC0990w;
import com.checkout.components.rememberme.M1;
import com.checkout.components.ui.model.CardScheme;
import g4.C1752a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$WalletListItemViewKt {

    @NotNull
    public static final ComposableSingletons$WalletListItemViewKt INSTANCE = new ComposableSingletons$WalletListItemViewKt();

    /* renamed from: a */
    private static final b f6365a = new d(new C1752a(7), -1386295083, false);

    /* renamed from: b */
    private static final b f6366b = new d(new C1752a(8), -656657392, false);

    public static final Unit a(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            p pVar = p.alpha;
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = a.charlie(pVar, c0585q);
            C2551k c2551k = InterfaceC2552l.maroon;
            c2551k.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            l a6 = AbstractC0987v.a(c2551k, c0585q, alpha, c0585q, mike);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                AbstractC0990w.a(i5, c0585q, i5, a6);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            M1.a(true, true, false, false, false, CardScheme.MASTERCARD, (InterfaceC0581m) c0585q, 196662, 28);
            M1.a(false, false, false, false, false, CardScheme.AMERICAN_EXPRESS, (InterfaceC0581m) c0585q, 196992, 27);
            M1.a(false, false, false, true, false, CardScheme.JCB, (InterfaceC0581m) c0585q, 199680, 23);
            M1.a(false, false, false, false, false, CardScheme.UNION_PAY, (InterfaceC0581m) c0585q, 196608, 31);
            M1.a(false, false, false, false, true, (CardScheme) null, (InterfaceC0581m) c0585q, 24576, 47);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit b(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0127k2.alpha(null, null, 0L, 0L, 0.0f, 0.0f, null, f6365a, c0585q, 12582912, 127);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* renamed from: getLambda$-1386295083$rememberme_standardRelease */
    public final l m130getLambda$1386295083$rememberme_standardRelease() {
        return f6365a;
    }

    @NotNull
    /* renamed from: getLambda$-656657392$rememberme_standardRelease */
    public final l m131getLambda$656657392$rememberme_standardRelease() {
        return f6366b;
    }
}
