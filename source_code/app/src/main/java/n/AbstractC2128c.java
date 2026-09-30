package n;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.C0545k;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import d.C1534h0;
import kotlin.jvm.functions.Function1;
import t0.AbstractC2911e0;
import t6.AbstractC3032n3;
import y.InterfaceC3372l;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2128c {
    public static final float alpha;
    public static final float bravo;

    static {
        float f5 = 25;
        alpha = f5;
        bravo = (f5 * 2.0f) / 2.4142137f;
    }

    public static final void alpha(InterfaceC3372l interfaceC3372l, T.s sVar, long j5, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1776202187);
        if (c0585q.golf(interfaceC3372l)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i5 | i4;
        if (c0585q.golf(sVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10 | 128;
        boolean z10 = true;
        if ((i13 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i13 & 1, z2)) {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                i11 = i13 & (-897);
            } else {
                i11 = i13 & (-897);
                j5 = 9205357640488583168L;
            }
            c0585q.romeo();
            int i14 = i11 & 14;
            if (i14 != 4) {
                z10 = false;
            }
            Object jade = c0585q.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new C1534h0(29, interfaceC3372l);
                c0585q.f(jade);
            }
            AbstractC3032n3.alpha(interfaceC3372l, T.d.purple, P.e.echo(-1653527038, new C2126a(j5, A0.o.bravo(sVar, false, (Function1) jade)), c0585q), c0585q, i14 | 432);
        } else {
            c0585q.ochre();
        }
        long j6 = j5;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Sb.f(interfaceC3372l, sVar, j6, i4, 1);
        }
    }

    public static final void bravo(T.s sVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(694251107);
        int i12 = i5 & 1;
        if (i12 != 0) {
            i11 = i4 | 6;
        } else {
            if (c0585q.golf(sVar)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i11 = i10 | i4;
        }
        if ((i11 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            if (i12 != 0) {
                sVar = T.p.alpha;
            }
            AbstractC0538d.echo(T.a.alpha(androidx.compose.foundation.layout.V.lima(sVar, bravo, alpha), AbstractC2911e0.alpha, C2127b.purple), c0585q);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0545k(sVar, i4, i5);
        }
    }
}
