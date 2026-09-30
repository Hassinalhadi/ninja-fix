package com.bumptech.glide;

import com.google.android.gms.internal.measurement.AbstractC1295b1;
import com.google.android.gms.internal.measurement.AbstractC1328i;
import com.google.android.gms.internal.measurement.C1308e;
import com.google.android.gms.internal.measurement.C1318g;
import com.google.android.gms.internal.measurement.C1323h;
import com.google.android.gms.internal.measurement.C1351n;
import com.google.android.gms.internal.measurement.C1378u;
import com.google.android.gms.internal.measurement.InterfaceC1355o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class d {
    public static byte[] alpha(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long bravo = bravo(0, bArr) & 67108863;
            int i4 = 3;
            long bravo2 = (bravo(3, bArr) >> 2) & 67108611;
            long bravo3 = (bravo(6, bArr) >> 4) & 67092735;
            long bravo4 = (bravo(9, bArr) >> 6) & 66076671;
            long bravo5 = (bravo(12, bArr) >> 8) & 1048575;
            long j5 = bravo2 * 5;
            long j6 = bravo3 * 5;
            long j7 = bravo4 * 5;
            long j10 = bravo5 * 5;
            byte[] bArr3 = new byte[17];
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            int i5 = 0;
            while (i5 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i5);
                System.arraycopy(bArr2, i5, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, 17, (byte) 0);
                }
                long bravo6 = j15 + (bravo(0, bArr3) & 67108863);
                long bravo7 = j11 + ((bravo(i4, bArr3) >> 2) & 67108863);
                long bravo8 = j12 + ((bravo(6, bArr3) >> 4) & 67108863);
                long bravo9 = j13 + ((bravo(9, bArr3) >> 6) & 67108863);
                long j16 = bravo2;
                long bravo10 = j14 + (((bravo(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
                long j17 = (bravo10 * j5) + (bravo9 * j6) + (bravo8 * j7) + (bravo7 * j10) + (bravo6 * bravo);
                long j18 = (bravo10 * j6) + (bravo9 * j7) + (bravo8 * j10) + (bravo7 * bravo) + (bravo6 * j16);
                long j19 = (bravo10 * j7) + (bravo9 * j10) + (bravo8 * bravo) + (bravo7 * j16) + (bravo6 * bravo3);
                long j20 = (bravo10 * j10) + (bravo9 * bravo) + (bravo8 * j16) + (bravo7 * bravo3) + (bravo6 * bravo4);
                long j21 = bravo9 * j16;
                long j22 = bravo10 * bravo;
                long j23 = j18 + (j17 >> 26);
                long j24 = j19 + (j23 >> 26);
                long j25 = j20 + (j24 >> 26);
                long j26 = j22 + j21 + (bravo8 * bravo3) + (bravo7 * bravo4) + (bravo6 * bravo5) + (j25 >> 26);
                long j27 = j26 >> 26;
                j14 = j26 & 67108863;
                long j28 = (j27 * 5) + (j17 & 67108863);
                i5 += 16;
                j12 = j24 & 67108863;
                j13 = j25 & 67108863;
                j15 = j28 & 67108863;
                j11 = (j23 & 67108863) + (j28 >> 26);
                bravo2 = j16;
                i4 = 3;
            }
            long j29 = j12 + (j11 >> 26);
            long j30 = j29 & 67108863;
            long j31 = j13 + (j29 >> 26);
            long j32 = j31 & 67108863;
            long j33 = j14 + (j31 >> 26);
            long j34 = j33 & 67108863;
            long j35 = ((j33 >> 26) * 5) + j15;
            long j36 = j35 >> 26;
            long j37 = j35 & 67108863;
            long j38 = (j11 & 67108863) + j36;
            long j39 = j37 + 5;
            long j40 = j39 & 67108863;
            long j41 = j38 + (j39 >> 26);
            long j42 = j30 + (j41 >> 26);
            long j43 = j32 + (j42 >> 26);
            long j44 = j43 & 67108863;
            long j45 = (j34 + (j43 >> 26)) - 67108864;
            long j46 = j45 >> 63;
            long j47 = j37 & j46;
            long j48 = j38 & j46;
            long j49 = j30 & j46;
            long j50 = j32 & j46;
            long j51 = j34 & j46;
            long j52 = ~j46;
            long j53 = j48 | (j41 & 67108863 & j52);
            long j54 = j49 | (j42 & 67108863 & j52);
            long j55 = j50 | (j44 & j52);
            long j56 = (j47 | (j40 & j52) | (j53 << 26)) & 4294967295L;
            long j57 = ((j53 >> 6) | (j54 << 20)) & 4294967295L;
            long j58 = ((j54 >> 12) | (j55 << 14)) & 4294967295L;
            long j59 = ((j55 >> 18) | ((j51 | (j45 & j52)) << 8)) & 4294967295L;
            long bravo11 = bravo(16, bArr) + j56;
            long j60 = bravo11 & 4294967295L;
            long bravo12 = bravo(20, bArr) + j57 + (bravo11 >> 32);
            long bravo13 = bravo(24, bArr) + j58 + (bravo12 >> 32);
            long bravo14 = (bravo(28, bArr) + j59 + (bravo13 >> 32)) & 4294967295L;
            byte[] bArr4 = new byte[16];
            charlie(bArr4, j60, 0);
            charlie(bArr4, bravo12 & 4294967295L, 4);
            charlie(bArr4, bravo13 & 4294967295L, 8);
            charlie(bArr4, bravo14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    public static long bravo(int i4, byte[] bArr) {
        return (((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16)) & 4294967295L;
    }

    public static void charlie(byte[] bArr, long j5, int i4) {
        int i5 = 0;
        while (i5 < 4) {
            bArr[i4 + i5] = (byte) (255 & j5);
            i5++;
            j5 >>= 8;
        }
    }

    public static C1308e delta(C1308e c1308e, J2.i iVar, C1351n c1351n, Boolean bool, Boolean bool2) {
        C1308e c1308e2 = new C1308e();
        Iterator romeo = c1308e.romeo();
        while (romeo.hasNext()) {
            int intValue = ((Integer) romeo.next()).intValue();
            if (c1308e.victor(intValue)) {
                InterfaceC1355o charlie = c1351n.charlie(iVar, Arrays.asList(c1308e.oscar(intValue), new C1323h(Double.valueOf(intValue)), c1308e));
                if (charlie.kilo().equals(bool)) {
                    break;
                }
                if (bool2 == null || charlie.kilo().equals(bool2)) {
                    c1308e2.uniform(intValue, charlie);
                }
            }
        }
        return c1308e2;
    }

    public static InterfaceC1355o echo(C1308e c1308e, J2.i iVar, ArrayList arrayList, boolean z2) {
        InterfaceC1355o interfaceC1355o;
        int i4;
        int i5;
        int i10 = -1;
        AbstractC1295b1.india(arrayList, 1, "reduce");
        AbstractC1295b1.juliet(2, "reduce", arrayList);
        InterfaceC1355o alpha = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
        if (alpha instanceof AbstractC1328i) {
            if (arrayList.size() == 2) {
                interfaceC1355o = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1));
                if (interfaceC1355o instanceof C1318g) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (c1308e.november() != 0) {
                interfaceC1355o = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            AbstractC1328i abstractC1328i = (AbstractC1328i) alpha;
            int november = c1308e.november();
            if (z2) {
                i4 = 0;
            } else {
                i4 = november - 1;
            }
            if (z2) {
                i5 = november - 1;
            } else {
                i5 = 0;
            }
            if (true == z2) {
                i10 = 1;
            }
            if (interfaceC1355o == null) {
                interfaceC1355o = c1308e.oscar(i4);
                i4 += i10;
            }
            while ((i5 - i4) * i10 >= 0) {
                if (!c1308e.victor(i4)) {
                    i4 += i10;
                } else {
                    interfaceC1355o = abstractC1328i.charlie(iVar, Arrays.asList(interfaceC1355o, c1308e.oscar(i4), new C1323h(Double.valueOf(i4)), c1308e));
                    if (!(interfaceC1355o instanceof C1318g)) {
                        i4 += i10;
                    } else {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                }
            }
            return interfaceC1355o;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
