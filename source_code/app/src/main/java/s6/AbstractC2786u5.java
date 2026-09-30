package s6;

import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.foundation.layout.InterfaceC0541g;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import b.C0704t;
import bz.C0797w;
import d.C1543m;
import h5.C1809a;
import j.C1918a;
import j.C1920c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: s6.u5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2786u5 {
    public static final void alpha(C1918a c1918a, T.s sVar, j.t tVar, androidx.compose.foundation.layout.M m4, InterfaceC0541g interfaceC0541g, InterfaceC0539e interfaceC0539e, C1543m c1543m, boolean z2, C0704t c0704t, Function1 function1, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z10;
        j.t tVar2;
        C1543m c1543m2;
        boolean z11;
        C0704t c0704t2;
        C1543m c1543m3;
        int i11;
        boolean z12;
        C0704t alpha;
        boolean z13;
        InterfaceC0539e interfaceC0539e2;
        boolean z14 = true;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2072102870);
        if (c0585q.golf(c1918a)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5 | 373317760;
        if (c0585q.india(function1)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        if ((306783379 & i12) == 306783378 && (i10 & 3) == 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (c0585q.magenta(i12 & 1, z10)) {
            c0585q.orange();
            int i13 = i4 & 1;
            Object obj = C0580l.alpha;
            if (i13 != 0 && !c0585q.beige()) {
                c0585q.ochre();
                i11 = i12 & (-1908409217);
                tVar2 = tVar;
                c1543m3 = c1543m;
                z13 = z2;
                z12 = false;
                alpha = c0704t;
            } else {
                j.l lVar = j.u.alpha;
                Object[] objArr = new Object[0];
                J2.l lVar2 = j.t.whiskey;
                boolean echo = c0585q.echo(0) | c0585q.echo(0);
                Object jade = c0585q.jade();
                if (echo || jade == obj) {
                    jade = new C1809a(8);
                    c0585q.f(jade);
                }
                tVar2 = (j.t) R.l.charlie(objArr, lVar2, (Function0) jade, c0585q, 0);
                C0797w alpha2 = bx.L.alpha(c0585q);
                boolean golf = c0585q.golf(alpha2);
                Object jade2 = c0585q.jade();
                if (golf || jade2 == obj) {
                    jade2 = new C1543m(alpha2);
                    c0585q.f(jade2);
                }
                c1543m3 = (C1543m) jade2;
                i11 = i12 & (-1908409217);
                z12 = false;
                alpha = b.V.alpha(c0585q);
                z13 = true;
            }
            c0585q.romeo();
            int i14 = (i11 & 14) | 48;
            if ((((i14 & 14) ^ 6) <= 4 || !c0585q.golf(c1918a)) && (i14 & 6) != 4) {
                z14 = z12;
            }
            Object jade3 = c0585q.jade();
            if (!z14 && jade3 != obj) {
                interfaceC0539e2 = interfaceC0539e;
            } else {
                interfaceC0539e2 = interfaceC0539e;
                jade3 = new C1920c(new bz.af(c1918a, interfaceC0539e2));
                c0585q.f(jade3);
            }
            InterfaceC0539e interfaceC0539e3 = interfaceC0539e2;
            C1543m c1543m4 = c1543m3;
            AbstractC2795v5.alpha(sVar, tVar2, (C1920c) jade3, m4, c1543m4, z13, alpha, interfaceC0541g, interfaceC0539e3, function1, c0585q, 818113542, 6 | ((i10 << 3) & 112));
            c0704t2 = alpha;
            z11 = z13;
            c1543m2 = c1543m4;
        } else {
            c0585q.ochre();
            tVar2 = tVar;
            c1543m2 = c1543m;
            z11 = z2;
            c0704t2 = c0704t;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Fb.e(c1918a, sVar, tVar2, m4, interfaceC0541g, interfaceC0539e, c1543m2, z11, c0704t2, function1, i4, 1);
        }
    }
}
