package G;

import F.C0090b1;
import F.R0;
import a0.AbstractC0358l;
import a0.C0354h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.V;
import androidx.compose.material3.pulltorefresh.PullToRefreshElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import ao.ad;
import av.ah;
import bz.AbstractC0779d;
import bz.AbstractC0782g;
import bz.AbstractC0800z;
import bz.f0;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.H2;
import t6.T3;

/* loaded from: classes3.dex */
public abstract class l {
    public static final float alpha = (float) 2.5d;
    public static final float bravo = (float) 5.5d;
    public static final float charlie = 16;
    public static final float delta = 40;
    public static final float echo = 10;
    public static final float foxtrot = 5;
    public static final f0 golf = AbstractC0779d.kilo(300, 0, AbstractC0800z.delta, 2);

    public static final void alpha(boolean z2, Function0 function0, T.s sVar, v vVar, T.k kVar, Xd.m mVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        v vVar2;
        int i10;
        T.k kVar2;
        Xd.m echo2;
        T.k kVar3;
        Xd.m mVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1902956467);
        if ((i4 & 6) == 0) {
            if (c0585q.hotel(z2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(function0)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 |= i13;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i5 |= i12;
        }
        if ((i4 & 3072) == 0) {
            i5 |= Barcode.FORMAT_UPC_E;
        }
        int i15 = i5 | 221184;
        if ((1572864 & i4) == 0) {
            if (c0585q.india(dVar)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i15 |= i11;
        }
        if ((599187 & i15) == 599186 && c0585q.bronze()) {
            c0585q.ochre();
            vVar2 = vVar;
            kVar3 = kVar;
            mVar2 = mVar;
        } else {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                i10 = i15 & (-7169);
                vVar2 = vVar;
                kVar2 = kVar;
                echo2 = mVar;
            } else {
                vVar2 = (v) R.l.delta(new Object[0], v.bravo, k.alpha, c0585q, 3072, 4);
                i10 = i15 & (-7169);
                kVar2 = T.d.alpha;
                echo2 = P.e.echo(1989171225, new g(vVar2, z2), c0585q);
            }
            c0585q.romeo();
            T.s then = sVar.then(new PullToRefreshElement(z2, function0, vVar2, d.charlie));
            ap delta2 = AbstractC0547m.delta(kVar2, false);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(then, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            Object obj = C0551q.alpha;
            dVar.invoke(obj, c0585q, Integer.valueOf(((i10 >> 15) & 112) | 6));
            echo2.invoke(obj, c0585q, Integer.valueOf(((i10 >> 12) & 112) | 6));
            c0585q.quebec(true);
            kVar3 = kVar2;
            mVar2 = echo2;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new h(z2, function0, sVar, vVar2, kVar3, mVar2, dVar, i4);
        }
    }

    public static final void bravo(Function0 function0, long j5, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-569718810);
        if ((i4 & 6) == 0) {
            if (c0585q.india(function0)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.foxtrot(j5)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) == 18 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            boolean z11 = true;
            Object obj = jade;
            if (jade == asVar) {
                C0354h alpha2 = AbstractC0358l.alpha();
                alpha2.echo(1);
                c0585q.f(alpha2);
                obj = alpha2;
            }
            C0354h c0354h = (C0354h) obj;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = C0564b.quebec(new C0090b1(function0, 3));
                c0585q.f(jade2);
            }
            D0 bravo2 = AbstractC0782g.bravo(((Number) ((D0) jade2).getValue()).floatValue(), golf, null, c0585q, 48, 28);
            int i12 = i5 & 14;
            if (i12 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object jade3 = c0585q.jade();
            if (z2 || jade3 == asVar) {
                jade3 = new R0(function0, 3);
                c0585q.f(jade3);
            }
            T.s kilo = V.kilo(new AppendedSemanticsElement((Function1) jade3, true), charlie);
            if (i12 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean golf2 = z10 | c0585q.golf(bravo2);
            if ((i5 & 112) != 32) {
                z11 = false;
            }
            boolean india = golf2 | z11 | c0585q.india(c0354h);
            Object jade4 = c0585q.jade();
            if (india || jade4 == asVar) {
                e eVar = new e(function0, bravo2, j5, c0354h);
                c0585q.f(eVar);
                jade4 = eVar;
            }
            T3.alpha(kilo, (Function1) jade4, c0585q, 0);
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new f(function0, j5, i4);
        }
    }

    public static final void charlie(c0.d dVar, C0354h c0354h, Z.c cVar, long j5, float f5, a aVar) {
        c0354h.delta();
        c0354h.alpha.moveTo(0.0f, 0.0f);
        float f10 = echo;
        float lavender = dVar.lavender(f10);
        float f11 = aVar.bravo;
        c0354h.bravo((lavender * f11) / 2, dVar.lavender(foxtrot) * f11);
        c0354h.bravo(dVar.lavender(f10) * f11, 0.0f);
        float intBitsToFloat = (Float.intBitsToFloat((int) (cVar.alpha() >> 32)) + (Math.min(cVar.charlie - cVar.alpha, cVar.delta - cVar.bravo) / 2.0f)) - ((dVar.lavender(f10) * f11) / 2.0f);
        float delta2 = Z.b.delta(cVar.alpha());
        float f12 = alpha;
        c0354h.foxtrot(H2.alpha(intBitsToFloat, delta2 - dVar.lavender(f12)));
        float lavender2 = aVar.alpha - dVar.lavender(f12);
        long orange = dVar.orange();
        J2.t lime = dVar.lime();
        long oscar = lime.oscar();
        lime.mike().golf();
        try {
            ((ah) lime.alpha).ochre(lavender2, orange);
            ad.lima(dVar, c0354h, j5, f5, new c0.h(dVar.lavender(f12), 0.0f, 0, 0, null, 30), 48);
        } finally {
            ad.coral(lime, oscar);
        }
    }
}
