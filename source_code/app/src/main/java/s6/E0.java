package s6;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import ob.AbstractC2215h;
import s6.E0;
import t6.AbstractC3087z;

/* loaded from: classes2.dex */
public abstract class E0 {
    public static final void alpha(final String str, final T.s sVar, long j5, long j6, C2093f c2093f, float f5, long j7, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        final long j10;
        final long j11;
        final C2093f c2093f2;
        final float f10;
        final long j12;
        long j13;
        C2093f bravo;
        int i10;
        float f11;
        long j14;
        long j15;
        int i11;
        int i12;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(468181685);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(str)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(sVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        int i13 = i5 | 3456;
        if ((i4 & 24576) == 0) {
            i13 = i5 | 11648;
        }
        int i14 = 1769472 | i13;
        if ((599187 & i14) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i14 & 1, z2)) {
            c0585q2.orange();
            if ((1 & i4) != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
                j13 = j5;
                j15 = j6;
                f11 = f5;
                j14 = j7;
                i10 = i14 & (-57345);
                bravo = c2093f;
            } else {
                j13 = AbstractC2215h.alpha;
                long j16 = AbstractC2215h.delta;
                bravo = AbstractC2094g.bravo(AbstractC2215h.bravo);
                i10 = i14 & (-57345);
                f11 = AbstractC2215h.golf;
                j14 = AbstractC2215h.hotel;
                j15 = j16;
            }
            c0585q2.romeo();
            float f12 = AbstractC2215h.bravo;
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.delta(upperCase, "toUpperCase(...)");
            C2093f c2093f3 = bravo;
            float f13 = f11;
            long j17 = j14;
            c0585q = c0585q2;
            F.G2.bravo(upperCase, AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(t6.ac.alpha(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), f13, c2093f3, j17, j14, 4), c2093f3), j13, a0.ao.alpha), AbstractC2215h.charlie), j15, AbstractC2215h.echo, AbstractC2215h.foxtrot, null, 0L, null, 0L, 2, false, 1, 0, null, null, c0585q, ((i10 >> 3) & 896) | 199680, 3120, 120784);
            j10 = j13;
            f10 = f13;
            j12 = j17;
            c2093f2 = c2093f3;
            j11 = j15;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            j10 = j5;
            j11 = j6;
            c2093f2 = c2093f;
            f10 = f5;
            j12 = j7;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: eb.c
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    String str2 = str;
                    float f14 = f10;
                    long j18 = j12;
                    E0.alpha(str2, sVar, j10, j11, c2093f2, f14, j18, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final rg.b bravo(String str) {
        return rg.d.bravo().bravo().alpha(str);
    }
}
