package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.List;
import pe.AbstractC2327c;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.t1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1262t1 {
    public static int echo = 0;
    public static int foxtrot = 1;
    public final List alpha;
    public final boolean bravo;
    public final String charlie;
    public final long delta;

    public C1262t1(List list, boolean z2, String str, long j5) {
        this.alpha = list;
        this.bravo = z2;
        this.charlie = str;
        this.delta = j5;
    }

    public static /* synthetic */ Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~(i13 | i5);
        int i15 = ~i13;
        int i16 = ~i5;
        int i17 = i15 | i16;
        int i18 = i14 | (~(i17 | i12));
        int i19 = i16 | i13;
        int i20 = (~i17) | i12;
        int i21 = (-665583616) * i10;
        int i22 = ((-1456209920) * i4) + (1500774400 * i11) + i21 + (914001539 * i20) + (i19 * 914001539) + ((-914001539) * i18) + ((-1579585154) * i13) + (i12 * (-1579585154)) + 1163788288;
        int papa = AbstractC2327c.papa(i4, 1302866265, ((-1587644119) * i11) + i12 + i13 + i10);
        if (AbstractC2327c.quebec(papa, 74579968, (i4 * 593082711) + (i11 * (-1467678585)) + (i10 * (-855313873)) + (i20 * 13) + (i19 * 13) + (i18 * (-13)) + (i13 * (-855313886)) + ((i12 * (-855313886)) - 1253577507), -1668153344, ((-2144468992) * papa) + i22) != 1) {
            C1262t1 c1262t1 = (C1262t1) objArr[0];
            int i23 = foxtrot;
            int i24 = (i23 ^ 123) + ((i23 & 123) << 1);
            echo = i24 % 128;
            int i25 = i24 % 2;
            List list = c1262t1.alpha;
            if (i25 == 0) {
                return list;
            }
            throw null;
        }
        C1262t1 c1262t12 = (C1262t1) objArr[0];
        int i26 = echo;
        foxtrot = (i26 + 33) % 128;
        long j5 = c1262t12.delta;
        int i27 = (i26 & 1) + (i26 | 1);
        foxtrot = i27 % 128;
        if (i27 % 2 != 0) {
            return Long.valueOf(j5);
        }
        throw null;
    }
}
