package com.checkout.components.kmp.rememberme.preview;

import F.AbstractC0127k2;
import Lb.C0222e;
import P.d;
import T.a;
import T.n;
import T.p;
import T.s;
import Xd.l;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.d0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import com.checkout.components.kmp.rememberme.view.authentication.AuthenticationViewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t0.AbstractC2911e0;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$AuthenticationViewPreviewKt {

    @NotNull
    public static final ComposableSingletons$AuthenticationViewPreviewKt INSTANCE = new ComposableSingletons$AuthenticationViewPreviewKt();

    @NotNull
    private static l lambda$177383199 = new d(new C0222e(28), 177383199, false);

    @NotNull
    private static l lambda$1623638340 = new d(new C0222e(29), 1623638340, false);

    public static final Unit lambda_1623638340$lambda$2(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0127k2.alpha(new n(AbstractC2911e0.alpha, new d0(2)), null, 0L, 0L, 0.0f, 0.0f, null, lambda$177383199, c0585q, 12582912, 126);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_177383199$lambda$1(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            C0540f golf = AbstractC0542h.golf(12);
            p pVar = p.alpha;
            C0554u alpha = AbstractC0553t.alpha(golf, T.d.f2062f, c0585q, 6);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            s charlie = a.charlie(pVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            AuthenticationViewKt.AuthenticationView(c0585q, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final l getLambda$1623638340$rememberme_release() {
        return lambda$1623638340;
    }

    @NotNull
    public final l getLambda$177383199$rememberme_release() {
        return lambda$177383199;
    }
}
