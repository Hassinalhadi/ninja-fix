package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.AbstractC1210g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class P2 {
    public static int alpha = 0;
    public static int bravo = 1;

    public static final int alpha(AbstractC1210g0 abstractC1210g0) {
        int i4 = bravo;
        int i5 = 1;
        alpha = (((i4 | 65) << 1) - (i4 ^ 65)) % 128;
        if (Intrinsics.areEqual(abstractC1210g0, AbstractC1210g0.c.alpha)) {
            int i10 = alpha;
            bravo = ((i10 ^ 39) + ((i10 & 39) << 1)) % 128;
            return 0;
        }
        if (Intrinsics.areEqual(abstractC1210g0, AbstractC1210g0.a.alpha)) {
            int i11 = bravo;
            int i12 = ((i11 | 73) << 1) - (i11 ^ 73);
            int i13 = i12 % 128;
            alpha = i13;
            if (i12 % 2 != 0) {
                i5 = 0;
            }
            bravo = (i13 + 75) % 128;
            return i5;
        }
        if (!Intrinsics.areEqual(abstractC1210g0, AbstractC1210g0.d.alpha)) {
            if (Intrinsics.areEqual(abstractC1210g0, AbstractC1210g0.b.alpha)) {
                int alpha2 = g3.alpha();
                int i14 = ~(((-2095077881) & alpha2) | ((-2095077881) ^ alpha2));
                int i15 = 1127373648 - (~(-(-(((i14 & 1881145416) | (1881145416 ^ i14)) * 1504))));
                int i16 = -(-((~((alpha2 & (-213932465)) | ((-213932465) ^ alpha2))) * (-1504)));
                int i17 = (i15 & i16) + (i16 | i15);
                int i18 = ((i17 | 1876260848) << 1) - (1876260848 ^ i17);
                int alpha3 = g3.alpha();
                int i19 = ~((-1516150028) | (~alpha3));
                int i20 = (i19 & 403705097) | (i19 ^ 403705097);
                int i21 = ~((-513) | alpha3);
                int i22 = -(-(((i20 & i21) | (i20 ^ i21)) * (-713)));
                int i23 = (((((-1587811554) | i22) << 1) - (i22 ^ (-1587811554))) - (~((~(((-513) ^ alpha3) | ((-513) & alpha3))) * 1426))) - 1;
                int i24 = ~alpha3;
                if (i18 <= ((~((i24 & (-1112445443)) | ((-1112445443) ^ i24))) * 713) + i23) {
                    return 2;
                }
                return 3;
            }
            throw new NoWhenBranchMatchedException();
        }
        int alpha4 = g3.alpha();
        int i25 = (~alpha4) | (-385879554);
        int i26 = ~((i25 & (-1664890427)) | (i25 ^ (-1664890427)));
        int i27 = (((i26 & (-2000436796)) | ((-2000436796) ^ i26)) * (-828)) + 718734967;
        int i28 = ((~alpha4) | (-50333185)) * (-828);
        int i29 = (i27 & i28) + (i28 | i27);
        int i30 = (i29 & (-1273796608)) + ((-1273796608) | i29);
        int alpha5 = g3.alpha();
        int i31 = ~((~alpha5) | (-318061912));
        int i32 = ((i31 & 275844117) | (i31 ^ 275844117)) * 529;
        int i33 = (1276791254 ^ i32) + ((i32 & 1276791254) << 1);
        int i34 = ~((alpha5 & (-318061912)) | ((-318061912) ^ alpha5));
        int i35 = ((i34 & 1551486493) | (1551486493 ^ i34)) * 529;
        if (i30 <= (i33 & i35) + (i35 | i33)) {
            return 2;
        }
        return 4;
    }
}
