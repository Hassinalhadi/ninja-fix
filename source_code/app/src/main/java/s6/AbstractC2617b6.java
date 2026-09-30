package s6;

import F.AbstractC0141o0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import cb.C0837b;
import cb.C0840e;
import com.google.mlkit.vision.barcode.common.Barcode;
import g0.C1726f;
import h.AbstractC1797a;
import java.util.List;
import kb.C2027c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import ob.AbstractC2210c;
import ob.C2209b;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: s6.b6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2617b6 {
    public static final void alpha(String str, T.p pVar, C1726f c1726f, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        T.p pVar2;
        T.p pVar3;
        int i10;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1672190774);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(null)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        int i13 = i5 | 384;
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(c1726f)) {
                i10 = 2048;
            } else {
                i10 = Barcode.FORMAT_UPC_E;
            }
            i13 |= i10;
        }
        if ((i13 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i13 & 1, z2)) {
            c0585q.orange();
            int i14 = i4 & 1;
            T.p pVar4 = T.p.alpha;
            if (i14 != 0 && !c0585q.beige()) {
                c0585q.ochre();
                pVar3 = pVar;
            } else {
                pVar3 = pVar4;
            }
            c0585q.romeo();
            float f5 = C2209b.alpha;
            T.s charlie = androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f);
            C0537c c0537c = AbstractC0542h.alpha;
            androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(C2209b.hotel), T.d.f2061d, c0585q, 54);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(charlie, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            float f10 = 36;
            T.s kilo = androidx.compose.foundation.layout.V.kilo(pVar4, f10);
            long j5 = AbstractC2210c.bravo;
            float f11 = C2209b.echo;
            T.s bravo = androidx.compose.foundation.a.bravo(kilo, j5, AbstractC2094g.bravo(f11));
            float f12 = C2209b.golf;
            int i15 = i13;
            long j6 = AbstractC2210c.delta;
            T.s charlie3 = t6.R3.charlie(bravo, f12, j6, AbstractC2094g.bravo(f11));
            T.k kVar = T.d.teal;
            q0.ap delta = AbstractC0547m.delta(kVar, false);
            int romeo2 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie4 = T.a.charlie(charlie3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            T.s kilo2 = androidx.compose.foundation.layout.V.kilo(pVar4, C2209b.foxtrot);
            long j7 = AbstractC2210c.golf;
            AbstractC0141o0.bravo(c1726f, null, kilo2, j7, c0585q, ((i15 >> 9) & 14) | 432, 0);
            c0585q.quebec(true);
            long delta2 = AbstractC2636d7.delta(22.0f, 4294967296L);
            H0.v vVar = H0.v.f1409c;
            T.p pVar5 = pVar3;
            F.G2.bravo("Cabinet no.", null, j7, delta2, vVar, null, AbstractC2636d7.charlie(0), null, AbstractC2636d7.delta(22.0f, 4294967296L), 0, false, 0, 0, null, null, c0585q, 12782592, 6, 129874);
            T.s sierra = AbstractC0538d.sierra(t6.R3.charlie(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.oscar(pVar4, f10), j5, AbstractC2094g.bravo(f11)), f12, j6, AbstractC2094g.bravo(f11)), 4);
            q0.ap delta3 = AbstractC0547m.delta(kVar, false);
            int romeo3 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike3 = c0585q.mike();
            T.s charlie5 = T.a.charlie(sierra, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo3))) {
                ao.ad.blue(romeo3, c0585q, romeo3, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie5);
            F.G2.bravo(str, null, j7, AbstractC2636d7.delta(22.0f, 4294967296L), vVar, null, AbstractC2636d7.charlie(0), null, AbstractC2636d7.delta(22.0f, 4294967296L), 0, false, 0, 0, null, null, c0585q, (i15 & 14) | 12782592, 6, 129874);
            c0585q = c0585q;
            c0585q.quebec(true);
            c0585q.quebec(true);
            pVar2 = pVar5;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.al(str, pVar2, c1726f, i4, 19);
        }
    }

    public static final void bravo(C0840e cabinet, T.s sVar, boolean z2, C1726f c1726f, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z10;
        Function0 function0;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(cabinet, "cabinet");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1002745392);
        if ((i4 & 6) == 0) {
            if (c0585q.india(cabinet)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 |= i13;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.hotel(z2)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i5 |= i12;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(c1726f)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i11;
        }
        int i15 = i5 | 24576;
        if ((1572864 & i4) == 0) {
            if (c0585q.india(lVar)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i15 |= i10;
        }
        if ((533651 & i15) != 533650) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i15 & 1, z10)) {
            c0585q.orange();
            int i16 = i4 & 1;
            T.p pVar = T.p.alpha;
            if (i16 != 0 && !c0585q.beige()) {
                c0585q.ochre();
            }
            c0585q.romeo();
            float f5 = C2209b.alpha;
            T.s charlie = androidx.compose.foundation.layout.V.charlie(sVar, 1.0f);
            long j5 = AbstractC2210c.alpha;
            float f10 = C2209b.bravo;
            T.s tango = AbstractC0538d.tango(t6.R3.charlie(androidx.compose.foundation.a.bravo(charlie, j5, AbstractC2094g.bravo(f10)), C2209b.oscar, AbstractC2210c.charlie, AbstractC2094g.bravo(f10)), C2209b.charlie, C2209b.delta);
            q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(tango, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            T.s charlie3 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
            C0537c c0537c = AbstractC0542h.alpha;
            float f11 = C2209b.november;
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(f11), T.d.f2062f, c0585q, 6);
            int romeo2 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie4 = T.a.charlie(charlie3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            Function0 function02 = null;
            alpha(cabinet.alpha, null, c1726f, c0585q, i15 & 7168);
            T.s charlie5 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f11), T.d.f2060c, c0585q, 6);
            int romeo3 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike3 = c0585q.mike();
            T.s charlie6 = T.a.charlie(charlie5, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo3))) {
                ao.ad.blue(romeo3, c0585q, romeo3, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie6);
            c0585q.purple(932094244);
            for (C0837b c0837b : cabinet.bravo) {
                String str = c0837b.alpha;
                String str2 = c0837b.bravo;
                if (str2 == null) {
                    str2 = "";
                }
                if (z2 && c0837b.echo != null && lVar != null) {
                    c0585q.purple(-1296283411);
                    if ((i15 & 3670016) == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean golf = z11 | c0585q.golf(c0837b);
                    Object jade = c0585q.jade();
                    if (!golf && jade != C0580l.alpha) {
                        z12 = false;
                    } else {
                        z12 = false;
                        jade = new C2027c(lVar, c0837b, 0);
                        c0585q.f(jade);
                    }
                    function0 = (Function0) jade;
                    c0585q.quebec(z12);
                } else {
                    c0585q.purple(-1296176431);
                    c0585q.quebec(false);
                    function0 = function02;
                }
                C0585q c0585q2 = c0585q;
                if (1.0f <= 0.0d) {
                    AbstractC1797a.alpha("invalid weight; must be greater than zero");
                }
                c0585q = c0585q2;
                AbstractC2608a6.alpha(str, str2, new LayoutWeightElement(1.0f, true), null, c0837b.delta, z2, function0, c0585q, (3670016 & (i15 << 12)) | ((i15 << 9) & 29360128), 16);
                i15 = i15;
                function02 = null;
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Za.e(cabinet, sVar, z2, c1726f, lVar, i4);
        }
    }

    public static final Object charlie(Oe.l lVar, Oe.n extension) {
        Intrinsics.echo(lVar, "<this>");
        Intrinsics.echo(extension, "extension");
        if (lVar.lima(extension)) {
            return lVar.kilo(extension);
        }
        return null;
    }

    public static final Object delta(Oe.l lVar, Oe.n extension, int i4) {
        int size;
        Intrinsics.echo(lVar, "<this>");
        Intrinsics.echo(extension, "extension");
        lVar.oscar(extension);
        Oe.i iVar = lVar.alpha;
        iVar.getClass();
        Oe.m mVar = extension.delta;
        if (mVar.red) {
            Oe.ab abVar = iVar.alpha;
            Object obj = abVar.get(mVar);
            if (obj == null) {
                size = 0;
            } else {
                size = ((List) obj).size();
            }
            if (i4 < size) {
                lVar.oscar(extension);
                if (mVar.red) {
                    Object obj2 = abVar.get(mVar);
                    if (obj2 != null) {
                        return extension.alpha(((List) obj2).get(i4));
                    }
                    throw new IndexOutOfBoundsException();
                }
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            return null;
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
