package z;

import a0.C0366t;
import a0.ao;
import androidx.compose.foundation.layout.M;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.InterfaceC0581m;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3447a {
    public static final M alpha;
    public static final float bravo = 64;
    public static final float charlie = 36;
    public static final M delta;

    static {
        float f5 = 16;
        float f10 = 8;
        alpha = new M(f5, f10, f5, f10);
        delta = new M(f10, f10, f10, f10);
    }

    public static h alpha(long j5, long j6, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        if ((i5 & 1) != 0) {
            j5 = ((C3449c) ((C0585q) interfaceC0581m).kilo(AbstractC3450d.alpha)).bravo();
        }
        long j7 = j5;
        if ((i5 & 2) != 0) {
            j6 = AbstractC3450d.alpha(j7, interfaceC0581m);
        }
        long j10 = j6;
        E0 e02 = AbstractC3450d.alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        long kilo = ao.kilo(C0366t.bravo(0.12f, ((C3449c) c0585q.kilo(e02)).alpha()), ((C3449c) c0585q.kilo(e02)).charlie());
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        long alpha2 = ((C3449c) c0585q2.kilo(e02)).alpha();
        long j11 = ((C0366t) c0585q2.kilo(g.alpha)).alpha;
        if (((C3449c) c0585q2.kilo(e02)).delta()) {
            ao.romeo(j11);
        } else {
            ao.romeo(j11);
        }
        return new h(j7, j10, kilo, C0366t.bravo(0.38f, alpha2));
    }

    public static k bravo(float f5, float f10, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        boolean z2;
        if ((i5 & 1) != 0) {
            f5 = 2;
        }
        float f11 = f5;
        if ((i5 & 2) != 0) {
            f10 = 8;
        }
        float f12 = f10;
        boolean z10 = false;
        float f13 = 0;
        float f14 = 4;
        float f15 = 4;
        if ((((i4 & 14) ^ 6) > 4 && ((C0585q) interfaceC0581m).delta(f11)) || (i4 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((((i4 & 112) ^ 48) > 32 && ((C0585q) interfaceC0581m).delta(f12)) || (i4 & 48) == 32) {
            z10 = true;
        }
        boolean delta2 = z10 | z2 | ((C0585q) interfaceC0581m).delta(f13) | ((C0585q) interfaceC0581m).delta(f14) | ((C0585q) interfaceC0581m).delta(f15);
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        if (delta2 || jade == C0580l.alpha) {
            k kVar = new k(f11, f12, f13, f14, f15);
            c0585q.f(kVar);
            jade = kVar;
        }
        return (k) jade;
    }

    public static h charlie(long j5, InterfaceC0581m interfaceC0581m, int i4) {
        if ((i4 & 1) != 0) {
            j5 = ((C3449c) ((C0585q) interfaceC0581m).kilo(AbstractC3450d.alpha)).charlie();
        }
        long j6 = j5;
        E0 e02 = AbstractC3450d.alpha;
        long bravo2 = ((C3449c) ((C0585q) interfaceC0581m).kilo(e02)).bravo();
        C0585q c0585q = (C0585q) interfaceC0581m;
        long alpha2 = ((C3449c) c0585q.kilo(e02)).alpha();
        long j7 = ((C0366t) c0585q.kilo(g.alpha)).alpha;
        if (((C3449c) c0585q.kilo(e02)).delta()) {
            ao.romeo(j7);
        } else {
            ao.romeo(j7);
        }
        return new h(j6, bravo2, j6, C0366t.bravo(0.38f, alpha2));
    }

    public static h delta(long j5, InterfaceC0581m interfaceC0581m, int i4) {
        long j6 = C0366t.juliet;
        if ((i4 & 2) != 0) {
            j5 = ((C3449c) ((C0585q) interfaceC0581m).kilo(AbstractC3450d.alpha)).bravo();
        }
        long j7 = j5;
        E0 e02 = AbstractC3450d.alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        long alpha2 = ((C3449c) c0585q.kilo(e02)).alpha();
        long j10 = ((C0366t) c0585q.kilo(g.alpha)).alpha;
        if (((C3449c) c0585q.kilo(e02)).delta()) {
            ao.romeo(j10);
        } else {
            ao.romeo(j10);
        }
        return new h(j6, j7, j6, C0366t.bravo(0.38f, alpha2));
    }
}
