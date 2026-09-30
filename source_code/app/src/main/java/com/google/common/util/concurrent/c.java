package com.google.common.util.concurrent;

import a0.C0366t;
import a0.au;
import androidx.compose.foundation.layout.ag;
import com.google.android.gms.internal.measurement.AbstractC1392x1;
import com.google.android.gms.internal.measurement.C1361p1;
import com.google.android.gms.internal.measurement.C1396y1;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.Q1;
import com.google.android.gms.internal.measurement.X1;
import com.google.android.gms.internal.measurement.Z1;
import com.google.android.gms.internal.measurement.zzmm;
import g0.C1725e;
import g0.C1726f;
import g0.ah;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c {
    public static C1726f alpha;

    public static final C1726f alpha() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = ah.alpha;
        au auVar = new au(C0366t.bravo);
        T3.b bVar = new T3.b(2, false);
        bVar.juliet(19.0f, 13.0f);
        bVar.golf(-6.0f);
        bVar.november(6.0f);
        bVar.golf(-2.0f);
        bVar.november(-6.0f);
        bVar.foxtrot(5.0f);
        bVar.november(-2.0f);
        bVar.golf(6.0f);
        bVar.mike(5.0f);
        bVar.golf(2.0f);
        bVar.november(6.0f);
        bVar.golf(6.0f);
        bVar.november(2.0f);
        bVar.charlie();
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", bVar.alpha);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }

    public static int bravo(byte[] bArr, int i4, ag agVar) {
        int golf = golf(bArr, i4, agVar);
        int i5 = agVar.alpha;
        if (i5 >= 0) {
            if (i5 <= bArr.length - golf) {
                if (i5 == 0) {
                    agVar.delta = C1361p1.red;
                    return golf;
                }
                agVar.delta = C1361p1.india(bArr, golf, i5);
                return golf + i5;
            }
            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int charlie(int i4, byte[] bArr) {
        int i5 = bArr[i4] & 255;
        int i10 = bArr[i4 + 1] & 255;
        int i11 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i10 << 8) | i5 | (i11 << 16);
    }

    public static int delta(X1 x12, int i4, byte[] bArr, int i5, int i10, D1 d12, ag agVar) {
        AbstractC1392x1 alpha2 = x12.alpha();
        X1 x13 = x12;
        byte[] bArr2 = bArr;
        int i11 = i10;
        ag agVar2 = agVar;
        int lima = lima(alpha2, x13, bArr2, i5, i11, agVar2);
        x13.bravo(alpha2);
        agVar2.delta = alpha2;
        d12.add(alpha2);
        while (lima < i11) {
            ag agVar3 = agVar2;
            int i12 = i11;
            int golf = golf(bArr2, lima, agVar3);
            if (i4 != agVar3.alpha) {
                break;
            }
            byte[] bArr3 = bArr2;
            X1 x14 = x13;
            AbstractC1392x1 alpha3 = x14.alpha();
            lima = lima(alpha3, x14, bArr3, golf, i12, agVar3);
            x13 = x14;
            bArr2 = bArr3;
            i11 = i12;
            agVar2 = agVar3;
            x13.bravo(alpha3);
            agVar2.delta = alpha3;
            d12.add(alpha3);
        }
        return lima;
    }

    public static int echo(byte[] bArr, int i4, D1 d12, ag agVar) {
        C1396y1 c1396y1 = (C1396y1) d12;
        int golf = golf(bArr, i4, agVar);
        int i5 = agVar.alpha + golf;
        while (golf < i5) {
            golf = golf(bArr, golf, agVar);
            c1396y1.hotel(agVar.alpha);
        }
        if (golf == i5) {
            return golf;
        }
        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int foxtrot(int i4, byte[] bArr, int i5, int i10, Z1 z12, ag agVar) {
        if ((i4 >>> 3) != 0) {
            int i11 = i4 & 7;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 5) {
                                z12.charlie(i4, Integer.valueOf(charlie(i5, bArr)));
                                return i5 + 4;
                            }
                            throw new zzmm("Protocol message contained an invalid tag (zero).");
                        }
                        int i12 = (i4 & (-8)) | 4;
                        Z1 bravo = Z1.bravo();
                        int i13 = agVar.charlie + 1;
                        agVar.charlie = i13;
                        if (i13 < 100) {
                            int i14 = 0;
                            while (true) {
                                if (i5 >= i10) {
                                    break;
                                }
                                int golf = golf(bArr, i5, agVar);
                                int i15 = agVar.alpha;
                                if (i15 == i12) {
                                    i14 = i15;
                                    i5 = golf;
                                    break;
                                }
                                i5 = foxtrot(i15, bArr, golf, i10, bravo, agVar);
                                i14 = i15;
                            }
                            agVar.charlie--;
                            if (i5 <= i10 && i14 == i12) {
                                z12.charlie(i4, bravo);
                                return i5;
                            }
                            throw new zzmm("Failed to parse the message.");
                        }
                        throw new zzmm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    int golf2 = golf(bArr, i5, agVar);
                    int i16 = agVar.alpha;
                    if (i16 >= 0) {
                        if (i16 <= bArr.length - golf2) {
                            if (i16 == 0) {
                                z12.charlie(i4, C1361p1.red);
                            } else {
                                z12.charlie(i4, C1361p1.india(bArr, golf2, i16));
                            }
                            return golf2 + i16;
                        }
                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                z12.charlie(i4, Long.valueOf(mike(i5, bArr)));
                return i5 + 8;
            }
            int juliet = juliet(bArr, i5, agVar);
            z12.charlie(i4, Long.valueOf(agVar.bravo));
            return juliet;
        }
        throw new zzmm("Protocol message contained an invalid tag (zero).");
    }

    public static int golf(byte[] bArr, int i4, ag agVar) {
        int i5 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            agVar.alpha = b2;
            return i5;
        }
        return hotel(b2, bArr, i5, agVar);
    }

    public static int hotel(int i4, byte[] bArr, int i5, ag agVar) {
        byte b2 = bArr[i5];
        int i10 = i5 + 1;
        int i11 = i4 & 127;
        if (b2 >= 0) {
            agVar.alpha = i11 | (b2 << 7);
            return i10;
        }
        int i12 = i11 | ((b2 & Byte.MAX_VALUE) << 7);
        int i13 = i5 + 2;
        byte b4 = bArr[i10];
        if (b4 >= 0) {
            agVar.alpha = i12 | (b4 << 14);
            return i13;
        }
        int i14 = i12 | ((b4 & Byte.MAX_VALUE) << 14);
        int i15 = i5 + 3;
        byte b6 = bArr[i13];
        if (b6 >= 0) {
            agVar.alpha = i14 | (b6 << 21);
            return i15;
        }
        int i16 = i14 | ((b6 & Byte.MAX_VALUE) << 21);
        int i17 = i5 + 4;
        byte b10 = bArr[i15];
        if (b10 >= 0) {
            agVar.alpha = i16 | (b10 << 28);
            return i17;
        }
        int i18 = i16 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] < 0) {
                i17 = i19;
            } else {
                agVar.alpha = i18;
                return i19;
            }
        }
    }

    public static int india(int i4, byte[] bArr, int i5, int i10, D1 d12, ag agVar) {
        C1396y1 c1396y1 = (C1396y1) d12;
        int golf = golf(bArr, i5, agVar);
        c1396y1.hotel(agVar.alpha);
        while (golf < i10) {
            int golf2 = golf(bArr, golf, agVar);
            if (i4 != agVar.alpha) {
                break;
            }
            golf = golf(bArr, golf2, agVar);
            c1396y1.hotel(agVar.alpha);
        }
        return golf;
    }

    public static int juliet(byte[] bArr, int i4, ag agVar) {
        long j5 = bArr[i4];
        int i5 = i4 + 1;
        if (j5 >= 0) {
            agVar.bravo = j5;
            return i5;
        }
        int i10 = i4 + 2;
        byte b2 = bArr[i5];
        long j6 = (j5 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i11 = 7;
        while (b2 < 0) {
            int i12 = i10 + 1;
            i11 += 7;
            j6 |= (r10 & Byte.MAX_VALUE) << i11;
            b2 = bArr[i10];
            i10 = i12;
        }
        agVar.bravo = j6;
        return i10;
    }

    public static int kilo(Object obj, X1 x12, byte[] bArr, int i4, int i5, int i10, ag agVar) {
        Q1 q12 = (Q1) x12;
        int i11 = agVar.charlie + 1;
        agVar.charlie = i11;
        if (i11 < 100) {
            int tango = q12.tango(obj, bArr, i4, i5, i10, agVar);
            agVar.charlie--;
            agVar.delta = obj;
            return tango;
        }
        throw new zzmm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static int lima(Object obj, X1 x12, byte[] bArr, int i4, int i5, ag agVar) {
        int i10 = i4 + 1;
        int i11 = bArr[i4];
        if (i11 < 0) {
            i10 = hotel(i11, bArr, i10, agVar);
            i11 = agVar.alpha;
        }
        int i12 = i10;
        if (i11 >= 0 && i11 <= i5 - i12) {
            int i13 = agVar.charlie + 1;
            agVar.charlie = i13;
            if (i13 < 100) {
                int i14 = i12 + i11;
                x12.india(obj, bArr, i12, i14, agVar);
                agVar.charlie--;
                agVar.delta = obj;
                return i14;
            }
            throw new zzmm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static long mike(int i4, byte[] bArr) {
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48) | ((bArr[i4 + 7] & 255) << 56);
    }
}
