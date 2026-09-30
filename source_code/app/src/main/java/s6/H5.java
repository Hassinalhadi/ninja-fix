package s6;

import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.android.gms.internal.measurement.AbstractC1295b1;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import ob.AbstractC2210c;
import ob.C2211d;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3076w3;
import t6.AbstractC3087z;

/* loaded from: classes2.dex */
public abstract class H5 {
    public static final void alpha(String locationLabel, long j5, T.p pVar, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        T.p pVar2;
        T.s golf;
        String str;
        int i10;
        int i11;
        int i12;
        Intrinsics.echo(locationLabel, "locationLabel");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-343047426);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(locationLabel)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.foxtrot(j5)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        int i13 = i5 | 384;
        if ((i4 & 3072) == 0) {
            if (c0585q.india(function0)) {
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
            T.p pVar3 = T.p.alpha;
            C2093f bravo = AbstractC2094g.bravo(C2211d.oscar);
            if (function0 != null) {
                c0585q.purple(-1998364221);
                T.s golf2 = androidx.compose.foundation.layout.V.golf(AbstractC1295b1.alpha(pVar3, function0, c0585q), C2211d.uniform, 0.0f, 2);
                Object jade = c0585q.jade();
                if (jade == C0580l.alpha) {
                    jade = new hd.l(22);
                    c0585q.f(jade);
                }
                golf = A0.o.bravo(golf2, false, (Function1) jade);
                c0585q.quebec(false);
            } else {
                c0585q.purple(1043921822);
                c0585q.quebec(false);
                golf = androidx.compose.foundation.layout.V.golf(pVar3, C2211d.uniform, 0.0f, 2);
            }
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(t6.R3.charlie(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), bravo).then(golf), C2211d.papa, AbstractC2210c.delta, bravo), C0366t.echo, a0.ao.alpha), C2211d.romeo, C2211d.quebec);
            q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(tango, c0585q);
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
            C0564b.blue(c2549i4, c0585q, charlie);
            T.s charlie2 = androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f);
            androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.echo, T.d.f2061d, c0585q, 54);
            int romeo2 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(charlie2, c0585q);
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
            C0564b.blue(c2549i4, c0585q, charlie3);
            AbstractC1680b charlie4 = AbstractC3076w3.charlie(R.drawable.ic_location_pin_figma, c0585q, 0);
            if (function0 != null) {
                str = locationLabel;
            } else {
                str = null;
            }
            t6.W3.alpha(charlie4, str, androidx.compose.foundation.layout.V.kilo(pVar3, C2211d.tango), null, null, 0.0f, null, c0585q, 384, 120);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.kilo(pVar3, C2211d.sierra), c0585q);
            F.G2.bravo(locationLabel, null, j5, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, D0.an.alpha(((F.S2) c0585q.kilo(F.T2.alpha)).foxtrot, 0L, AbstractC2636d7.charlie(18), H0.v.f1409c, null, 0L, 0, AbstractC2636d7.charlie(18), null, null, 16646137), c0585q, (i13 & 14) | ((i13 << 3) & 896), 0, 65530);
            c0585q = c0585q;
            c0585q.quebec(true);
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Sc.h(locationLabel, j5, pVar2, function0, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        if ((r16[r5] & 192) == 128) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0085, code lost:
    
        if ((r16[r5] & 192) == 128) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String bravo(byte[] bArr, int i4, int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i4;
        if (i15 >= 0 && i5 <= bArr.length && i15 <= i5) {
            char[] cArr = new char[i5 - i15];
            int i16 = 0;
            while (i15 < i5) {
                byte b2 = bArr[i15];
                if (b2 >= 0) {
                    i10 = i16 + 1;
                    cArr[i16] = (char) b2;
                    i15++;
                    while (i15 < i5) {
                        byte b4 = bArr[i15];
                        if (b4 < 0) {
                            break;
                        }
                        i15++;
                        cArr[i10] = (char) b4;
                        i10++;
                    }
                } else {
                    if ((b2 >> 5) == -2) {
                        int i17 = i15 + 1;
                        if (i5 <= i17) {
                            i10 = i16 + 1;
                            cArr[i16] = (char) 65533;
                        } else {
                            byte b6 = bArr[i17];
                            if ((b6 & 192) == 128) {
                                int i18 = (b2 << 6) ^ (b6 ^ 3968);
                                if (i18 < 128) {
                                    i10 = i16 + 1;
                                    cArr[i16] = (char) 65533;
                                } else {
                                    i10 = i16 + 1;
                                    cArr[i16] = (char) i18;
                                }
                                i11 = 2;
                            } else {
                                i10 = i16 + 1;
                                cArr[i16] = (char) 65533;
                            }
                        }
                        i11 = 1;
                    } else if ((b2 >> 4) == -2) {
                        int i19 = i15 + 2;
                        if (i5 <= i19) {
                            i10 = i16 + 1;
                            cArr[i16] = (char) 65533;
                            int i20 = i15 + 1;
                            if (i5 > i20) {
                            }
                            i11 = 1;
                        } else {
                            byte b10 = bArr[i15 + 1];
                            if ((b10 & 192) == 128) {
                                byte b11 = bArr[i19];
                                if ((b11 & 192) == 128) {
                                    int i21 = (b2 << 12) ^ ((b11 ^ (-123008)) ^ (b10 << 6));
                                    if (i21 < 2048) {
                                        i10 = i16 + 1;
                                        cArr[i16] = (char) 65533;
                                    } else if (55296 <= i21 && i21 < 57344) {
                                        i10 = i16 + 1;
                                        cArr[i16] = (char) 65533;
                                    } else {
                                        i10 = i16 + 1;
                                        cArr[i16] = (char) i21;
                                    }
                                    i11 = 3;
                                } else {
                                    i10 = i16 + 1;
                                    cArr[i16] = (char) 65533;
                                    i11 = 2;
                                }
                            } else {
                                i10 = i16 + 1;
                                cArr[i16] = (char) 65533;
                                i11 = 1;
                            }
                        }
                    } else {
                        if ((b2 >> 3) == -2) {
                            int i22 = i15 + 3;
                            if (i5 <= i22) {
                                i12 = i16 + 1;
                                cArr[i16] = 65533;
                                int i23 = i15 + 1;
                                if (i5 > i23 && (bArr[i23] & 192) == 128) {
                                    int i24 = i15 + 2;
                                    if (i5 > i24) {
                                    }
                                    i14 = 2;
                                }
                                i14 = 1;
                            } else {
                                byte b12 = bArr[i15 + 1];
                                if ((b12 & 192) == 128) {
                                    byte b13 = bArr[i15 + 2];
                                    if ((b13 & 192) == 128) {
                                        byte b14 = bArr[i22];
                                        if ((b14 & 192) == 128) {
                                            int i25 = (b2 << 18) ^ (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12));
                                            if (i25 > 1114111) {
                                                i12 = i16 + 1;
                                                cArr[i16] = 65533;
                                            } else if (55296 <= i25 && i25 < 57344) {
                                                i12 = i16 + 1;
                                                cArr[i16] = 65533;
                                            } else if (i25 < 65536) {
                                                i12 = i16 + 1;
                                                cArr[i16] = 65533;
                                            } else {
                                                if (i25 != 65533) {
                                                    cArr[i16] = (char) ((i25 >>> 10) + 55232);
                                                    i13 = i16 + 2;
                                                    cArr[i16 + 1] = (char) ((i25 & 1023) + 56320);
                                                } else {
                                                    cArr[i16] = 65533;
                                                    i13 = i16 + 1;
                                                }
                                                i12 = i13;
                                            }
                                            i14 = 4;
                                        } else {
                                            i12 = i16 + 1;
                                            cArr[i16] = 65533;
                                            i14 = 3;
                                        }
                                    } else {
                                        i12 = i16 + 1;
                                        cArr[i16] = 65533;
                                        i14 = 2;
                                    }
                                } else {
                                    i12 = i16 + 1;
                                    cArr[i16] = 65533;
                                    i14 = 1;
                                }
                            }
                            i15 += i14;
                        } else {
                            i12 = i16 + 1;
                            cArr[i16] = 65533;
                            i15++;
                        }
                        i16 = i12;
                    }
                    i15 += i11;
                }
                i16 = i10;
            }
            return kotlin.text.r.echo(cArr, 0, i16);
        }
        throw new IndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i15 + " endIndex=" + i5);
    }
}
