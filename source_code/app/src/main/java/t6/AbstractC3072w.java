package t6;

import a2.C0386k;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s.AbstractC2533l;
import s.AbstractC2534m;
import s.C2529h;
import s.C2530i;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import u.AbstractC3134h;
import u.C3130d;

/* renamed from: t6.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3072w {
    public static final void alpha(T.s sVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(790527681);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(dVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.yankee(null, androidx.compose.runtime.as.red);
                c0585q.f(jade);
            }
            androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new C2530i(axVar, 1);
                c0585q.f(jade2);
            }
            Function0 function0 = (Function0) jade2;
            U0.ad adVar = AbstractC2534m.alpha;
            C3130d bravo = AbstractC3055s2.bravo(AbstractC2533l.bravo, c0585q, 6);
            C0564b.bravo(new androidx.compose.runtime.O[]{AbstractC3134h.bravo.alpha(AbstractC3067v.delta(function0, c0585q, 2)), AbstractC3134h.alpha.alpha(bravo)}, P.e.echo(1070596993, new C0386k(sVar, axVar, dVar, bravo, function0, 1), c0585q), c0585q, 56);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2529h(sVar, dVar, i4, 4);
        }
    }

    public static final void bravo(T.s sVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(155925518);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(dVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            if (c0585q.kilo(AbstractC3134h.alpha) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0585q.kilo(AbstractC3134h.bravo) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                c0585q.purple(-1977156178);
                q0.ap delta = AbstractC0547m.delta(T.d.alpha, true);
                long j5 = c0585q.magenta;
                int i12 = (int) (j5 ^ (j5 >>> 32));
                androidx.compose.runtime.I mike = c0585q.mike();
                T.s charlie = T.a.charlie(sVar, c0585q);
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
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                    ao.ad.blue(i12, c0585q, i12, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie);
                dVar.invoke(c0585q, Integer.valueOf((i5 >> 3) & 14));
                c0585q.quebec(true);
                c0585q.quebec(false);
            } else if (z10) {
                c0585q.purple(-1976965962);
                AbstractC3067v.alpha(sVar, dVar, c0585q, i5 & 126);
                c0585q.quebec(false);
            } else if (z11) {
                c0585q.purple(-1976815178);
                AbstractC2534m.delta(sVar, dVar, c0585q, i5 & 126);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-1976684761);
                alpha(sVar, dVar, c0585q, i5 & 126);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2529h(sVar, dVar, i4, 3);
        }
    }

    public static final androidx.compose.runtime.ax charlie(Wf.e key1, Wf.x key2, Object key3, Function0 getDefault, Xd.l block, C0585q c0585q) {
        Intrinsics.echo(key1, "key1");
        Intrinsics.echo(key2, "key2");
        Intrinsics.echo(key3, "key3");
        Intrinsics.echo(getDefault, "getDefault");
        Intrinsics.echo(block, "block");
        c0585q.purple(-1116698203);
        ((Wf.s) c0585q.kilo(Wf.u.bravo)).getClass();
        Wf.r alpha = Wf.s.alpha(c0585q);
        c0585q.purple(406061423);
        boolean golf = c0585q.golf(key1) | c0585q.golf(key2) | c0585q.golf(key3) | c0585q.golf(alpha);
        Object jade = c0585q.jade();
        if (golf || jade == C0580l.alpha) {
            jade = C0564b.zulu(vf.ad.amber(Nd.i.alpha, new Wf.z(block, alpha, null)));
            c0585q.f(jade);
        }
        androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
        c0585q.quebec(false);
        c0585q.quebec(false);
        return axVar;
    }
}
