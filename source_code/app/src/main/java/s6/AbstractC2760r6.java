package s6;

import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.UInt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: s6.r6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2760r6 {
    public static final void alpha(boolean z2, Function1 onCheckedChange, T.p pVar, boolean z10, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z11;
        int i5;
        boolean z12;
        boolean z13;
        T.p pVar2;
        int i10;
        int i11;
        int i12;
        Intrinsics.echo(onCheckedChange, "onCheckedChange");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2093439491);
        if ((i4 & 6) == 0) {
            z11 = z2;
            if (c0585q.hotel(z11)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            z11 = z2;
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(onCheckedChange)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        int i13 = i5 | 384;
        if ((i4 & 3072) == 0) {
            z12 = z10;
            if (c0585q.hotel(z12)) {
                i10 = 2048;
            } else {
                i10 = Barcode.FORMAT_UPC_E;
            }
            i13 |= i10;
        } else {
            z12 = z10;
        }
        if ((i13 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0585q.magenta(i13 & 1, z13)) {
            int i14 = i13;
            T.p pVar3 = T.p.alpha;
            float f5 = 48;
            T.s november = androidx.compose.foundation.layout.V.november(pVar3, f5, f5, 0.0f, 12);
            q0.ap delta = AbstractC0547m.delta(T.d.teal, false);
            long j5 = c0585q.magenta;
            int i15 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(november, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q, i15, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            long j6 = Db.c.tango;
            long j7 = Db.c.papa;
            long j10 = Db.c.romeo;
            long j11 = Db.c.sierra;
            c0585q = c0585q;
            androidx.compose.material3.a.alpha(z11, onCheckedChange, pVar3, z12, F.K1.oscar(j6, j7, j7, j6, j10, j10, j11, j10, j10, j11, j10, j10, c0585q, 34952), c0585q, ((i14 << 3) & 57344) | (i14 & 14) | 384 | (i14 & 112));
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Mb.b(z2, onCheckedChange, pVar2, z10, i4, 0);
        }
    }

    public static final void bravo(boolean z2, Function1 onCheckedChange, T.p pVar, boolean z10, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z11;
        T.p pVar2;
        Intrinsics.echo(onCheckedChange, "onCheckedChange");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1888474088);
        if (c0585q.hotel(z2)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q.india(onCheckedChange)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10 | 384;
        if (c0585q.hotel(z10)) {
            i11 = 2048;
        } else {
            i11 = Barcode.FORMAT_UPC_E;
        }
        int i14 = i13 | i11;
        if ((i14 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0585q.magenta(i14 & 1, z11)) {
            T.p pVar3 = T.p.alpha;
            float f5 = 48;
            T.s november = androidx.compose.foundation.layout.V.november(pVar3, f5, f5, 0.0f, 12);
            q0.ap delta = AbstractC0547m.delta(T.d.teal, false);
            long j5 = c0585q.magenta;
            int i15 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(november, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q, i15, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            long j6 = Db.c.tango;
            long j7 = Db.c.papa;
            long j10 = Db.c.quebec;
            long j11 = Db.c.sierra;
            long j12 = Db.c.romeo;
            c0585q = c0585q;
            androidx.compose.material3.a.alpha(z2, onCheckedChange, pVar3, z10, F.K1.oscar(j6, j7, j7, j6, j10, j10, j11, j12, j12, j11, j12, j12, c0585q, 34952), c0585q, (i14 & 14) | 384 | (i14 & 112) | ((i14 << 3) & 57344));
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Mb.c(z2, onCheckedChange, pVar2, z10, i4);
        }
    }

    public static final int charlie(String str) {
        UInt delta = delta(16, str);
        if (delta != null) {
            return delta.alpha;
        }
        kotlin.text.r.kilo(str);
        throw null;
    }

    public static final UInt delta(int i4, String str) {
        int i5;
        AbstractC2743p6.alpha(i4);
        int length = str.length();
        if (length != 0) {
            int i10 = 0;
            char charAt = str.charAt(0);
            if (Intrinsics.golf(charAt, 48) < 0) {
                i5 = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            } else {
                i5 = 0;
            }
            int m210constructorimpl = UInt.m210constructorimpl(i4);
            int i11 = 119304647;
            int i12 = 119304647;
            while (i5 < length) {
                int digit = Character.digit((int) str.charAt(i5), i4);
                if (digit >= 0) {
                    int i13 = i10 ^ RecyclerView.UNDEFINED_DURATION;
                    if (Integer.compare(i13, i12 ^ RecyclerView.UNDEFINED_DURATION) > 0) {
                        if (i12 == i11) {
                            i12 = (int) (((-1) & 4294967295L) / (m210constructorimpl & 4294967295L));
                            if (Integer.compare(i13, i12 ^ RecyclerView.UNDEFINED_DURATION) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    int m210constructorimpl2 = UInt.m210constructorimpl(i10 * m210constructorimpl);
                    int m210constructorimpl3 = UInt.m210constructorimpl(UInt.m210constructorimpl(digit) + m210constructorimpl2);
                    if (Integer.compare(m210constructorimpl3 ^ RecyclerView.UNDEFINED_DURATION, m210constructorimpl2 ^ RecyclerView.UNDEFINED_DURATION) < 0) {
                        return null;
                    }
                    i5++;
                    i10 = m210constructorimpl3;
                    i11 = 119304647;
                } else {
                    return null;
                }
            }
            return new UInt(i10);
        }
        return null;
    }

    public static final kotlin.p echo(String str) {
        int i4;
        long j5;
        int i5;
        Intrinsics.echo(str, "<this>");
        int i10 = 10;
        AbstractC2743p6.alpha(10);
        int length = str.length();
        if (length != 0) {
            char charAt = str.charAt(0);
            int i11 = 1;
            if (Intrinsics.golf(charAt, 48) < 0) {
                if (length != 1 && charAt == '+') {
                    i4 = 1;
                } else {
                    return null;
                }
            } else {
                i4 = 0;
            }
            long j6 = 10;
            long j7 = 0;
            long j10 = 512409557603043100L;
            while (i4 < length) {
                if (Character.digit((int) str.charAt(i4), i10) >= 0) {
                    int i12 = length;
                    long j11 = j7 ^ Long.MIN_VALUE;
                    int i13 = i4;
                    if (Long.compare(j11, j10 ^ Long.MIN_VALUE) > 0) {
                        if (j10 == 512409557603043100L) {
                            if (j6 < 0) {
                                if (Long.MAX_VALUE < (j6 ^ Long.MIN_VALUE)) {
                                    j5 = j6;
                                    j10 = 0;
                                } else {
                                    j10 = 1;
                                    j5 = j6;
                                }
                            } else {
                                long j12 = (Long.MAX_VALUE / j6) << i11;
                                if ((((-1) - (j12 * j6)) ^ Long.MIN_VALUE) >= (j6 ^ Long.MIN_VALUE)) {
                                    i5 = i11;
                                } else {
                                    i5 = 0;
                                }
                                j5 = j6;
                                j10 = j12 + i5;
                            }
                            if (Long.compare(j11, j10 ^ Long.MIN_VALUE) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    } else {
                        j5 = j6;
                    }
                    long j13 = j7 * j5;
                    long m210constructorimpl = (UInt.m210constructorimpl(r5) & 4294967295L) + j13;
                    if (Long.compare(m210constructorimpl ^ Long.MIN_VALUE, j13 ^ Long.MIN_VALUE) < 0) {
                        return null;
                    }
                    i4 = i13 + 1;
                    j7 = m210constructorimpl;
                    length = i12;
                    j6 = j5;
                    i10 = 10;
                    i11 = 1;
                } else {
                    return null;
                }
            }
            return new kotlin.p(j7);
        }
        return null;
    }
}
