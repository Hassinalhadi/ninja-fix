package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1193c {
    public static int charlie = 0;
    public static int delta = 1;
    public final String alpha;
    public final String bravo;

    public C1193c(String str, String str2) {
        this.alpha = str;
        this.bravo = str2;
    }

    public static /* synthetic */ Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = ~(i12 | i4);
        int i16 = ~i12;
        int i17 = ~i4;
        int i18 = i16 | i17;
        int i19 = i15 | (~(i18 | i10));
        int i20 = i17 | i12;
        int i21 = (~i18) | i10;
        int i22 = (-665583616) * i5;
        int i23 = ((-1456209920) * i13) + (1500774400 * i11) + i22 + (914001539 * i21) + (i20 * 914001539) + ((-914001539) * i19) + ((-1579585154) * i12) + (i10 * (-1579585154)) + 1163788288;
        int papa = AbstractC2327c.papa(i13, 1302866265, ((-1587644119) * i11) + i10 + i12 + i5);
        if (AbstractC2327c.quebec(papa, 74579968, (i13 * 593082711) + (i11 * (-1467678585)) + (i5 * (-855313873)) + (i21 * 13) + (i20 * 13) + (i19 * (-13)) + (i12 * (-855313886)) + ((i10 * (-855313886)) - 1253577507), -1668153344, ((-2144468992) * papa) + i23) != 1) {
            C1193c c1193c = (C1193c) objArr[0];
            Object obj = objArr[1];
            int i24 = charlie;
            int i25 = (i24 + 17) % 128;
            delta = i25;
            if (c1193c == obj) {
                int i26 = (i25 & 59) + (i25 | 59);
                charlie = i26 % 128;
                if (i26 % 2 != 0) {
                    return Boolean.TRUE;
                }
                return Boolean.TRUE;
            }
            if (!(!(obj instanceof C1193c))) {
                C1193c c1193c2 = (C1193c) obj;
                if (!Intrinsics.areEqual(c1193c.alpha, c1193c2.alpha)) {
                    int i27 = (charlie + 69) % 128;
                    delta = i27;
                    int i28 = ((i27 | 93) << 1) - (i27 ^ 93);
                    charlie = i28 % 128;
                    if (i28 % 2 == 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                if (!Intrinsics.areEqual(c1193c.bravo, c1193c2.bravo)) {
                    int i29 = delta;
                    charlie = ((i29 & 81) + (i29 | 81)) % 128;
                    return Boolean.FALSE;
                }
                return Boolean.TRUE;
            }
            delta = (((i24 | 119) << 1) - (i24 ^ 119)) % 128;
            return Boolean.FALSE;
        }
        C1193c c1193c3 = (C1193c) objArr[0];
        int i30 = delta + 25;
        charlie = i30 % 128;
        if (i30 % 2 != 0) {
            int hashCode = c1193c3.alpha.hashCode();
            i14 = (((hashCode | (-13)) << 1) - (hashCode ^ (-13))) / c1193c3.bravo.hashCode();
        } else {
            int hashCode2 = c1193c3.alpha.hashCode() * 31;
            int hashCode3 = c1193c3.bravo.hashCode();
            i14 = (hashCode2 & hashCode3) + (hashCode3 | hashCode2);
        }
        return Integer.valueOf(i14);
    }

    public final boolean equals(Object obj) {
        return ((Boolean) alpha(new Object[]{this, obj}, I0.foxtrot(), I0.foxtrot(), -544107344, I0.foxtrot(), 544107344, I0.foxtrot())).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) alpha(new Object[]{this}, I0.foxtrot(), I0.foxtrot(), 504699682, I0.foxtrot(), -504699681, I0.foxtrot())).intValue();
    }

    public final String toString() {
        String golf;
        int i4 = delta;
        int i5 = ((i4 | 1) << 1) - (i4 ^ 1);
        charlie = i5 % 128;
        int i10 = i5 % 2;
        String str = this.bravo;
        String str2 = this.alpha;
        if (i10 != 0) {
            golf = av.q.golf("InputDeviceData(name=", str2, ", vendor=", str, ")");
            int i11 = 15 / 0;
        } else {
            golf = av.q.golf("InputDeviceData(name=", str2, ", vendor=", str, ")");
        }
        delta = (charlie + 25) % 128;
        return golf;
    }
}
