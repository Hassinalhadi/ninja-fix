package q0;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0584p;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: q0.K, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2375K {
    public static final av alpha = new av(6);

    public static final void alpha(T.s sVar, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1298353104);
        int i13 = i5 & 1;
        if (i13 != 0) {
            i10 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (i13 != 0) {
                sVar = T.p.alpha;
            }
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new C2379O(av.purple);
                c0585q.f(jade);
            }
            bravo((C2379O) jade, sVar, lVar, c0585q, (i10 << 3) & 1008);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2373I(sVar, lVar, i4, i5);
        }
    }

    public static final void bravo(C2379O c2379o, T.s sVar, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-511989831);
        if ((i4 & 6) == 0) {
            if (c0585q.india(c2379o)) {
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
        if ((i4 & 384) == 0) {
            if (c0585q.india(lVar)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            C0584p beige = C0564b.beige(c0585q);
            T.s charlie = T.a.charlie(sVar, c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            C2550j c2550j = s0.al.f13274K;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2379o.charlie, c0585q, c2379o);
            C0564b.blue(c2379o.delta, c0585q, beige);
            C0564b.blue(c2379o.echo, c0585q, lVar);
            InterfaceC2552l.maroon.getClass();
            C0564b.blue(C2551k.echo, c0585q, mike);
            C0564b.blue(C2551k.delta, c0585q, charlie);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i);
            }
            c0585q.quebec(true);
            if (!c0585q.bronze()) {
                c0585q.purple(-1259274676);
                boolean india = c0585q.india(c2379o);
                Object jade = c0585q.jade();
                if (india || jade == C0580l.alpha) {
                    jade = new je.ab(27, c2379o);
                    c0585q.f(jade);
                }
                C0564b.juliet((Function0) jade, c0585q);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-1259216055);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2374J(c2379o, sVar, lVar, i4);
        }
    }

    public static final float charlie(long j5, long j6) {
        return Math.min(Float.intBitsToFloat((int) (j6 >> 32)) / Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)) / Float.intBitsToFloat((int) (j5 & 4294967295L)));
    }

    public static final float delta(AbstractC2366B abstractC2366B, boolean z2, C2398q[] c2398qArr, float f5) {
        boolean z10;
        float f10 = Float.NaN;
        for (C2398q c2398q : c2398qArr) {
            float delta = abstractC2366B.delta(c2398q);
            if (!Float.isNaN(f10)) {
                if (delta > f10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z2 != z10) {
                }
            }
            f10 = delta;
        }
        if (Float.isNaN(f10)) {
            return f5;
        }
        return f10;
    }

    public static final Z.c echo(z zVar) {
        z amber = zVar.amber();
        if (amber != null) {
            return amber.sierra(zVar, true);
        }
        return new Z.c(0.0f, 0.0f, (int) (zVar.kilo() >> 32), (int) (zVar.kilo() & 4294967295L));
    }

    public static final Z.c foxtrot(z zVar) {
        z hotel = hotel(zVar);
        float kilo = (int) (hotel.kilo() >> 32);
        float kilo2 = (int) (hotel.kilo() & 4294967295L);
        Z.c sierra = hotel.sierra(zVar, true);
        float f5 = sierra.alpha;
        float f10 = 0.0f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > kilo) {
            f5 = kilo;
        }
        float f11 = sierra.bravo;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > kilo2) {
            f11 = kilo2;
        }
        float f12 = sierra.charlie;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 <= kilo) {
            kilo = f12;
        }
        float f13 = sierra.delta;
        if (f13 >= 0.0f) {
            f10 = f13;
        }
        if (f10 <= kilo2) {
            kilo2 = f10;
        }
        if (f5 == kilo || f11 == kilo2) {
            return Z.c.echo;
        }
        long foxtrot = hotel.foxtrot((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
        long foxtrot2 = hotel.foxtrot((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(kilo) << 32));
        long foxtrot3 = hotel.foxtrot((Float.floatToRawIntBits(kilo) << 32) | (Float.floatToRawIntBits(kilo2) & 4294967295L));
        long foxtrot4 = hotel.foxtrot((Float.floatToRawIntBits(kilo2) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (foxtrot >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (foxtrot2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (foxtrot4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (foxtrot3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (foxtrot & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (foxtrot2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (foxtrot4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (4294967295L & foxtrot3));
        return new Z.c(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final boolean golf(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static final z hotel(z zVar) {
        z zVar2;
        s0.L l10;
        z amber = zVar.amber();
        while (true) {
            z zVar3 = amber;
            zVar2 = zVar;
            zVar = zVar3;
            if (zVar == null) {
                break;
            }
            amber = zVar.amber();
        }
        if (zVar2 instanceof s0.L) {
            l10 = (s0.L) zVar2;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            return zVar2;
        }
        s0.L l11 = l10.f13253k;
        while (true) {
            s0.L l12 = l11;
            s0.L l13 = l10;
            l10 = l12;
            if (l10 != null) {
                l11 = l10.f13253k;
            } else {
                return l13;
            }
        }
    }

    public static final s0.au india(s0.au auVar) {
        s0.al alVar;
        s0.al alVar2 = auVar.f13315i.f13251i;
        while (true) {
            s0.al victor = alVar2.victor();
            s0.al alVar3 = null;
            if (victor != null) {
                alVar = victor.yellow;
            } else {
                alVar = null;
            }
            if (alVar != null) {
                s0.al victor2 = alVar2.victor();
                if (victor2 != null) {
                    alVar3 = victor2.yellow;
                }
                Intrinsics.checkNotNull(alVar3);
                alVar3.getClass();
                s0.al victor3 = alVar2.victor();
                Intrinsics.checkNotNull(victor3);
                alVar2 = victor3.yellow;
                Intrinsics.checkNotNull(alVar2);
            } else {
                s0.au y10 = ((s0.L) alVar2.f13305x.foxtrot).y();
                Intrinsics.checkNotNull(y10);
                return y10;
            }
        }
    }

    public static final long juliet(long j5, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) * Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) * Float.intBitsToFloat((int) (j5 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
