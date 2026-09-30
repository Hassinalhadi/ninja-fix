package s6;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import ib.C1909a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import ob.AbstractC2210c;
import ob.C2211d;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;

/* renamed from: s6.l5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2706l5 {
    public static final void alpha(int i4, int i5, T.s sVar, InterfaceC0581m interfaceC0581m, String text, Function0 onConfirm) {
        int i10;
        boolean z2;
        C0585q c0585q;
        boolean z10;
        boolean z11;
        String alpha;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(text, "text");
        Intrinsics.echo(onConfirm, "onConfirm");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1331258013);
        if ((i5 & 6) == 0) {
            if (c0585q2.golf(text)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q2.india(onConfirm)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i5 & 384) == 0) {
            if (c0585q2.golf(sVar)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i5 & 3072) == 0) {
            if (c0585q2.echo(i4)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i10 & 1, z2)) {
            Object[] objArr = {Integer.valueOf(i4)};
            if ((i10 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q2.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (z10 || jade == asVar) {
                jade = new com.clevertap.android.sdk.task.a(i4, 1);
                c0585q2.f(jade);
            }
            androidx.compose.runtime.p0 p0Var = (androidx.compose.runtime.p0) R.l.echo(objArr, (Function0) jade, c0585q2, 0);
            Integer valueOf = Integer.valueOf(i4);
            boolean golf = c0585q2.golf(p0Var);
            Object jade2 = c0585q2.jade();
            if (golf || jade2 == asVar) {
                jade2 = new C1909a(p0Var, null);
                c0585q2.f(jade2);
            }
            C0564b.foxtrot((Xd.l) jade2, c0585q2, valueOf);
            C2093f bravo = AbstractC2094g.bravo(8);
            float f5 = C2211d.bravo;
            if (p0Var.juliet() <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                c0585q2.purple(-561286591);
                c0585q2.quebec(false);
                alpha = text;
            } else {
                c0585q2.purple(-561286215);
                alpha = AbstractC3086y3.alpha(R.string.confirm_with_timer, new Object[]{text, Integer.valueOf(p0Var.juliet())}, c0585q2);
                c0585q2.quebec(false);
            }
            T.j jVar = T.d.f2061d;
            a0.an anVar = a0.ao.alpha;
            if (z11) {
                c0585q2.purple(-219906077);
                T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.delta(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), 56), bravo), AbstractC2210c.golf, anVar), false, null, null, onConfirm, 7), 16);
                androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.echo, jVar, c0585q2, 54);
                int romeo = C0564b.romeo(c0585q2);
                androidx.compose.runtime.I mike = c0585q2.mike();
                T.s charlie = T.a.charlie(sierra, c0585q2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
                C0564b.blue(C2551k.echo, c0585q2, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                    ao.ad.blue(romeo, c0585q2, romeo, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q2, charlie);
                F.G2.bravo(alpha, null, C2211d.azure, AbstractC2636d7.charlie(18), H0.v.f1409c, null, 0L, null, AbstractC2636d7.charlie(18), 0, false, 0, 0, null, null, c0585q2, 200064, 6, 130002);
                c0585q = c0585q2;
                c0585q.quebec(true);
                c0585q.quebec(false);
            } else {
                String str = alpha;
                c0585q = c0585q2;
                c0585q.purple(-219230835);
                T.s sierra2 = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(t6.R3.charlie(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), 56), bravo), 1, AbstractC2210c.delta, bravo), AbstractC2210c.alpha, anVar), 16);
                androidx.compose.foundation.layout.S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.echo, jVar, c0585q, 54);
                int romeo2 = C0564b.romeo(c0585q);
                androidx.compose.runtime.I mike2 = c0585q.mike();
                T.s charlie2 = T.a.charlie(sierra2, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j2 = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j2);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, alpha3);
                C0564b.blue(C2551k.echo, c0585q, mike2);
                C2549i c2549i2 = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                    ao.ad.blue(romeo2, c0585q, romeo2, c2549i2);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie2);
                F.G2.bravo(str, null, C2211d.amber, AbstractC2636d7.charlie(18), H0.v.f1409c, null, 0L, null, AbstractC2636d7.charlie(18), 0, false, 0, 0, null, null, c0585q, 200064, 6, 130002);
                c0585q.quebec(true);
                c0585q.quebec(false);
            }
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Lb.at(text, onConfirm, sVar, i4, i5);
        }
    }

    public static final H0.l bravo(Context context) {
        int i4;
        H0.a aVar = new H0.a(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i4 = H0.w.alpha.alpha(context);
        } else {
            i4 = 0;
        }
        return new H0.l(aVar, new H0.b(i4));
    }
}
