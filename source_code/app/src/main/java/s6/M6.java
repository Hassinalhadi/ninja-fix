package s6;

import a0.C0366t;
import android.os.Bundle;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.AbstractC2094g;
import ob.C2211d;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3087z;

/* loaded from: classes2.dex */
public abstract class M6 {
    public static final void alpha(String str, long j5, T.s sVar, C0366t c0366t, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z2;
        C0585q c0585q;
        long j6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1784100797);
        if (c0585q2.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q2.foxtrot(j5)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if (c0585q2.golf(c0366t)) {
            i11 = 2048;
        } else {
            i11 = Barcode.FORMAT_UPC_E;
        }
        int i14 = i13 | i11;
        if ((i14 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i14 & 1, z2)) {
            T.p pVar = T.p.alpha;
            if (c0366t == null) {
                c0585q2.purple(828921412);
                j6 = ((F.O) c0585q2.kilo(F.Q.alpha)).papa;
                c0585q2.quebec(false);
            } else {
                c0585q2.purple(828920048);
                c0585q2.quebec(false);
                j6 = c0366t.alpha;
            }
            if (StringsKt.black(str, '<') && StringsKt.black(str, '>')) {
                z10 = true;
            } else {
                z10 = false;
            }
            T.s charlie = androidx.compose.foundation.layout.V.charlie(sVar, 1.0f);
            float f5 = C2211d.yankee;
            boolean z14 = z10;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(t6.R3.charlie(AbstractC3087z.alpha(charlie, AbstractC2094g.bravo(f5)), C2211d.echo, Db.c.azure, AbstractC2094g.bravo(f5)), j6, a0.ao.alpha), C2211d.zulu);
            q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
            int romeo = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie2 = T.a.charlie(sierra, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, delta);
            C0564b.blue(C2551k.echo, c0585q2, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q2, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie2);
            if (z14) {
                c0585q2.purple(-922023698);
                D0.an anVar = ((F.S2) c0585q2.kilo(F.T2.alpha)).kilo;
                T.s charlie3 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                Object jade = c0585q2.jade();
                androidx.compose.runtime.as asVar = C0580l.alpha;
                if (jade == asVar) {
                    jade = new kd.l(24);
                    c0585q2.f(jade);
                }
                Function1 function1 = (Function1) jade;
                if ((i14 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean golf = z12 | c0585q2.golf(anVar);
                if ((i14 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z15 = z13 | golf;
                Object jade2 = c0585q2.jade();
                if (z15 || jade2 == asVar) {
                    Vc.a aVar = new Vc.a(j5, anVar, str, 1);
                    c0585q2.f(aVar);
                    jade2 = aVar;
                }
                Function1 function12 = (Function1) jade2;
                c0585q = c0585q2;
                androidx.compose.ui.viewinterop.a.alpha(function1, charlie3, function12, c0585q, 54, 0);
                c0585q.quebec(false);
                z11 = true;
            } else {
                c0585q = c0585q2;
                c0585q.purple(-921123148);
                int i15 = (i14 << 3) & 896;
                z11 = true;
                F.G2.bravo("STORE REF: ".concat(str), null, j5, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((F.S2) c0585q.kilo(F.T2.alpha)).kilo, c0585q, i15, 0, 65530);
                c0585q.quebec(false);
            }
            c0585q.quebec(z11);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.am(str, j5, sVar, c0366t, i4);
        }
    }

    public static Pb.c bravo() {
        Pb.c cVar = new Pb.c();
        Bundle bundle = new Bundle();
        bundle.putString("arg_tutorial", "");
        cVar.setArguments(bundle);
        return cVar;
    }
}
