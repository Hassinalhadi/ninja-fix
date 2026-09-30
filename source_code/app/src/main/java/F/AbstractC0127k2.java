package F;

import a0.C0366t;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import f.InterfaceC1673j;
import kotlin.jvm.functions.Function0;
import t6.AbstractC3087z;

/* renamed from: F.k2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0127k2 {
    public static final androidx.compose.runtime.aa alpha = new androidx.compose.runtime.aa(P.f1049g);

    public static final void alpha(T.s sVar, a0.as asVar, long j5, long j6, float f5, float f10, b.ab abVar, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        T.s sVar2;
        a0.as asVar2;
        long j7;
        long j10;
        float f11;
        float f12;
        b.ab abVar2;
        if ((i5 & 1) != 0) {
            sVar2 = T.p.alpha;
        } else {
            sVar2 = sVar;
        }
        if ((i5 & 2) != 0) {
            asVar2 = a0.ao.alpha;
        } else {
            asVar2 = asVar;
        }
        if ((i5 & 4) != 0) {
            j7 = ((O) ((C0585q) interfaceC0581m).kilo(Q.alpha)).papa;
        } else {
            j7 = j5;
        }
        if ((i5 & 8) != 0) {
            j10 = Q.bravo(j7, interfaceC0581m);
        } else {
            j10 = j6;
        }
        if ((i5 & 16) != 0) {
            f11 = 0;
        } else {
            f11 = f5;
        }
        if ((i5 & 32) != 0) {
            f12 = 0;
        } else {
            f12 = f10;
        }
        if ((i5 & 64) != 0) {
            abVar2 = null;
        } else {
            abVar2 = abVar;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        androidx.compose.runtime.aa aaVar = alpha;
        float f13 = ((Q0.g) c0585q.kilo(aaVar)).alpha + f11;
        C0564b.bravo(new androidx.compose.runtime.O[]{Y.alpha.alpha(new C0366t(j10)), aaVar.alpha(new Q0.g(f13))}, P.e.echo(-70914509, new C0115h2(sVar2, asVar2, j7, f13, abVar2, f12, lVar), c0585q), c0585q, 56);
    }

    public static final void bravo(float f5, int i4, int i5, long j5, long j6, P.d dVar, T.s sVar, a0.as asVar, InterfaceC0581m interfaceC0581m, b.ab abVar, InterfaceC1673j interfaceC1673j, Function0 function0, boolean z2) {
        boolean z10;
        long j7;
        float f10;
        InterfaceC1673j interfaceC1673j2;
        if ((i5 & 4) != 0) {
            z10 = true;
        } else {
            z10 = z2;
        }
        if ((i5 & 32) != 0) {
            j7 = Q.bravo(j5, interfaceC0581m);
        } else {
            j7 = j6;
        }
        float f11 = 0;
        if ((i5 & 128) != 0) {
            f10 = 0;
        } else {
            f10 = f5;
        }
        if ((i5 & 512) != 0) {
            interfaceC1673j2 = null;
        } else {
            interfaceC1673j2 = interfaceC1673j;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        androidx.compose.runtime.aa aaVar = alpha;
        float f12 = f11 + ((Q0.g) c0585q.kilo(aaVar)).alpha;
        C0564b.bravo(new androidx.compose.runtime.O[]{Y.alpha.alpha(new C0366t(j7)), aaVar.alpha(new Q0.g(f12))}, P.e.echo(1279702876, new C0119i2(f12, f10, j5, dVar, sVar, asVar, abVar, interfaceC1673j2, function0, z10), c0585q), c0585q, 56);
    }

    public static final T.s charlie(T.s sVar, a0.as asVar, long j5, b.ab abVar, float f5) {
        a0.as asVar2;
        T.s sVar2;
        T.s sVar3 = T.p.alpha;
        if (f5 > 0.0f) {
            asVar2 = asVar;
            sVar2 = androidx.compose.ui.graphics.a.bravo(sVar3, 0.0f, 0.0f, 0.0f, f5, asVar2, 124895);
        } else {
            asVar2 = asVar;
            sVar2 = sVar3;
        }
        T.s then = sVar.then(sVar2);
        if (abVar != null) {
            sVar3 = new BorderModifierNodeElement(abVar.alpha, abVar.bravo, asVar2);
        }
        return AbstractC3087z.alpha(androidx.compose.foundation.a.bravo(then.then(sVar3), j5, asVar2), asVar2);
    }

    public static final long delta(long j5, float f5, InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        O o5 = (O) c0585q.kilo(Q.alpha);
        boolean booleanValue = ((Boolean) c0585q.kilo(Q.bravo)).booleanValue();
        if (C0366t.charlie(j5, o5.papa) && booleanValue) {
            boolean alpha2 = Q0.g.alpha(f5, 0);
            long j6 = o5.papa;
            if (alpha2) {
                return j6;
            }
            return a0.ao.kilo(C0366t.bravo(((((float) Math.log(f5 + 1)) * 4.5f) + 2.0f) / 100.0f, o5.tango), j6);
        }
        return j5;
    }
}
