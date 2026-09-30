package s6;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import dd.C1614e;
import dd.C1615f;
import dd.C1616g;
import delivery.samurai.android.R;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import q0.C2391j;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3071v3;
import t6.AbstractC3076w3;
import t6.AbstractC3087z;

/* renamed from: s6.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2790v0 {
    public static final void alpha(String str, String str2, String str3, Integer num, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        int i12;
        Integer num2;
        int i13;
        int i14;
        boolean z2;
        Integer num3;
        Integer num4;
        int i15;
        T.p pVar;
        char c3;
        H0.v vVar;
        int i16;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-256584015);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i4 | i16;
        } else {
            i10 = i4;
        }
        if (c0585q.golf(str2)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i17 = i10 | i11;
        if (c0585q.golf(str3)) {
            i12 = Barcode.FORMAT_QR_CODE;
        } else {
            i12 = 128;
        }
        int i18 = i17 | i12;
        int i19 = i5 & 8;
        if (i19 != 0) {
            i14 = i18 | 3072;
            num2 = num;
        } else {
            num2 = num;
            if (c0585q.golf(num2)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i14 = i18 | i13;
        }
        if ((i14 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            if (i19 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            T.i iVar = T.d.f2063g;
            T.p pVar2 = T.p.alpha;
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, iVar, c0585q, 48);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(pVar2, c0585q);
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
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            if (num4 != null) {
                c0585q.purple(-660191968);
                i15 = i14;
                pVar = pVar2;
                c3 = '0';
                vVar = null;
                t6.W3.alpha(AbstractC3076w3.charlie(num4.intValue(), c0585q, (i14 >> 9) & 14), null, androidx.compose.foundation.layout.V.kilo(pVar2, 44), null, null, 0.0f, null, c0585q, 432, 120);
                c0585q.quebec(false);
            } else {
                i15 = i14;
                pVar = pVar2;
                c3 = '0';
                vVar = null;
                c0585q.purple(-659997133);
                N2.p.charlie(str, null, AbstractC3087z.alpha(androidx.compose.foundation.layout.V.kilo(pVar, 48), AbstractC2094g.bravo(8)), C2391j.alpha, c0585q, (i15 & 14) | 1572912);
                c0585q.quebec(false);
            }
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, 8), c0585q);
            T.p pVar3 = pVar;
            z.ak.bravo(str2, androidx.compose.foundation.layout.V.echo(pVar, 25), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(AbstractC3071v3.alpha(c0585q, R.color.colorPrimary), AbstractC2636d7.charlie(20), new H0.v(900), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, vVar, 0, 14)})), 0L, 3, 0L, 0, 16744408), c0585q, ((i15 >> 3) & 14) | 48, 0, 65532);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar3, 2), c0585q);
            float f5 = 40;
            z.ak.bravo(str3, AbstractC0538d.uniform(androidx.compose.foundation.layout.V.echo(pVar3, f5), f5, 0.0f, 2), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(Db.c.maroon, AbstractC2636d7.charlie(16), new H0.v(HttpConstants.HTTP_BLOCKED), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744408), c0585q, ((i15 >> 6) & 14) | 48, 0, 65532);
            c0585q = c0585q;
            c0585q.quebec(true);
            num3 = num4;
        } else {
            c0585q.ochre();
            num3 = num2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Bb.e(str, str2, str3, num3, i4, i5, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(C1614e c1614e, Pd.c cVar) {
        C1615f c1615f;
        int i4;
        if (cVar instanceof C1615f) {
            C1615f c1615f2 = (C1615f) cVar;
            int i5 = c1615f2.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1615f2.red = i5 - RecyclerView.UNDEFINED_DURATION;
                c1615f = c1615f2;
                Object obj = c1615f.purple;
                Od.a aVar = Od.a.alpha;
                i4 = c1615f.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        c1614e = c1615f.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    io.ktor.utils.io.t delta = c1614e.echo().delta();
                    c1615f.alpha = c1614e;
                    c1615f.red = 1;
                    obj = io.ktor.utils.io.ak.mike(delta, c1615f);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                Gf.i iVar = (Gf.i) obj;
                Intrinsics.echo(iVar, "<this>");
                return new C1616g(c1614e.alpha, c1614e.delta(), c1614e.echo(), Gf.k.echo(iVar, -1));
            }
        }
        c1615f = new Pd.c(cVar);
        Object obj2 = c1615f.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = c1615f.red;
        if (i4 == 0) {
        }
        Gf.i iVar2 = (Gf.i) obj2;
        Intrinsics.echo(iVar2, "<this>");
        return new C1616g(c1614e.alpha, c1614e.delta(), c1614e.echo(), Gf.k.echo(iVar2, -1));
    }
}
