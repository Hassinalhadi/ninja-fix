package z;

import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes3.dex */
public abstract class r {
    public static final float alpha = 24;

    public static final void alpha(int i4, P.d dVar, T.s sVar, InterfaceC0581m interfaceC0581m, Function0 function0, boolean z2) {
        int i5;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1316660641);
        if ((i4 & 6) == 0) {
            if (c0585q.india(function0)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        int i13 = i5 | 3456;
        if ((i4 & 24576) == 0) {
            if (c0585q.india(dVar)) {
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i10 = 8192;
            }
            i13 |= i10;
        }
        if ((i13 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i13 & 1, z10)) {
            E0 e02 = t.alpha;
            T.s charlie = androidx.compose.foundation.a.charlie(sVar.then(MinimumInteractiveModifier.alpha), null, aa.alpha(4), true, new A0.h(0), function0, 8);
            ap delta = AbstractC0547m.delta(T.d.teal, false);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(charlie, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            c0585q.purple(-1874697310);
            androidx.compose.runtime.aa aaVar = AbstractC3451e.alpha;
            float floatValue = ((Number) c0585q.kilo(aaVar)).floatValue();
            c0585q.quebec(false);
            C0564b.alpha(aaVar.alpha(Float.valueOf(floatValue)), dVar, c0585q, ((i13 >> 9) & 112) | 8);
            c0585q.quebec(true);
            z11 = true;
        } else {
            c0585q.ochre();
            z11 = z2;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.z(i4, dVar, sVar, function0, z11);
        }
    }
}
