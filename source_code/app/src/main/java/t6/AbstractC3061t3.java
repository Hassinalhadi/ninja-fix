package t6;

import android.media.ImageReader;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import k5.C2015h;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: t6.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3061t3 {
    public static final void alpha(T.s sVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1854833411);
        if (c0585q.golf(sVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = y.an.alpha;
                c0585q.f(jade);
            }
            q0.ap apVar = (q0.ap) jade;
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
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
            C0564b.blue(C2551k.foxtrot, c0585q, apVar);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            androidx.appcompat.widget.P0.indigo(6, dVar, c0585q, true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2015h(i4, 7, sVar, dVar);
        }
    }

    public static R3.s bravo(int i4, int i5, int i10, int i11) {
        return new R3.s(ImageReader.newInstance(i4, i5, i10, i11));
    }
}
