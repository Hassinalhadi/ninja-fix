package com.checkout.components.rememberme;

import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.ui.utils.extensions.Utils;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class L1 {
    public static final Unit a(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2133969860);
        if (c0585q.magenta(i4 & 1, i4 != 0)) {
            AbstractC0538d.echo(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(T.p.alpha, 1.0f), 1), Utils.INSTANCE.m191toComposeColorvNxB06k(4292730333L), ao.alpha), c0585q);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new F4.g(i4, 19);
        }
    }
}
