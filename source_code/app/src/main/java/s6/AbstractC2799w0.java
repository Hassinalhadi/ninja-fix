package s6;

import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3071v3;

/* renamed from: s6.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2799w0 {
    public static final void alpha(String value, String label, T.s sVar, C0366t c0366t, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        C0585q c0585q;
        long j5;
        Intrinsics.echo(value, "value");
        Intrinsics.echo(label, "label");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(53917193);
        if (c0585q2.golf(value)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q2.golf(label)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q2.golf(sVar)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q2.golf(c0366t)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i16 = i15 | i12;
        if ((i16 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i16 & 1, z2)) {
            T.p pVar = T.p.alpha;
            T.s then = AbstractC0538d.uniform(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.romeo(sVar), C0366t.echo, AbstractC2094g.bravo(12)), 0.0f, 16, 1).then(androidx.compose.foundation.layout.V.bravo);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2063g, c0585q2, 48);
            int romeo = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie = T.a.charlie(then, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, alpha);
            C0564b.blue(C2551k.echo, c0585q2, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q2, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie);
            long charlie2 = AbstractC2636d7.charlie(18);
            H0.n nVar = new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)}));
            H0.v vVar = new H0.v(700);
            if (c0366t == null) {
                c0585q2.purple(259837935);
                j5 = AbstractC3071v3.alpha(c0585q2, R.color.colorPrimary);
                c0585q2.quebec(false);
            } else {
                c0585q2.purple(259837501);
                c0585q2.quebec(false);
                j5 = c0366t.alpha;
            }
            z.ak.bravo(value, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j5, charlie2, vVar, null, nVar, 0L, 3, 0L, 0, 16744408), c0585q2, i16 & 14, 0, 65534);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, 4), c0585q2);
            z.ak.bravo(label, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(AbstractC3071v3.alpha(c0585q2, R.color.coolgray_500), AbstractC2636d7.charlie(12), new H0.v(HttpConstants.HTTP_INTERNAL_ERROR), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744408), c0585q2, (i16 >> 3) & 14, 0, 65534);
            c0585q = c0585q2;
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.h(value, label, sVar, c0366t, i4);
        }
    }

    public static final void bravo(Long l10, long j5, sd.s method) {
        Intrinsics.echo(method, "method");
        if (l10 != null && l10.longValue() >= 0) {
            sd.s sVar = sd.s.bravo;
            if (Intrinsics.areEqual(method, sd.s.delta) || l10.longValue() == j5) {
                return;
            }
            throw new IllegalStateException(("Content-Length mismatch: expected " + l10 + " bytes, but received " + j5 + " bytes").toString());
        }
    }
}
