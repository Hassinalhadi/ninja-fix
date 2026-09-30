package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class al {
    public static int alpha = 0;
    public static int bravo = 0;
    public static int charlie = 0;
    public static int delta = 1;

    public static Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i4 | i11 | i14;
        int i16 = ~i4;
        int i17 = (~i11) | i14;
        int i18 = (~i17) | i16;
        int i19 = (~(i11 | i16 | i14)) | (~(i17 | i4));
        int i20 = 511705088 * i5;
        int i21 = ((-1639972864) * i12) + i20 + ((-1589641216) * i13) + ((-1203980746) * i19) + (i18 * (-1203980746)) + (1203980746 * i15) + (1501345335 * i4) + (((-385660469) * i10) - 1543503872);
        int papa = AbstractC2327c.papa(i12, -167119771, (2053704882 * i5) + i10 + i4 + i13);
        if (AbstractC2327c.quebec(papa, 1163984896, ((-1784727723) * i12) + (927583762 * i5) + ((-1228230607) * i13) + (i19 * 86) + (i18 * 86) + (i15 * (-86)) + (i4 * (-1228230521)) + ((i10 * (-1228230693)) - 288632672), 992935936, (1278279680 * papa) + i21) != 1) {
            try {
                Object[] objArr2 = {0L, r0, r0, new Lambda(0), 7, null};
                Boolean bool = Boolean.FALSE;
                Object echo = am.echo(373658851);
                if (echo == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int alpha2 = Color.alpha(0) + 52;
                    int alpha3 = 904 - Color.alpha(0);
                    Class cls = Boolean.TYPE;
                    echo = am.charlie(longPressTimeout, alpha2, alpha3, 532045125, "D8871", new Class[]{Long.TYPE, cls, cls, Function0.class, Integer.TYPE, Object.class});
                }
                Object invoke = ((Method) echo).invoke(null, objArr2);
                List emptyList = CollectionsKt.emptyList();
                Result.Companion companion = Result.INSTANCE;
                if (invoke instanceof kotlin.k) {
                    int i22 = delta;
                    int i23 = (i22 ^ 69) + ((i22 & 69) << 1);
                    charlie = i23 % 128;
                    if (i23 % 2 != 0) {
                        int i24 = 69 / 0;
                    }
                    invoke = emptyList;
                } else {
                    int i25 = delta;
                    charlie = ((i25 ^ 55) + ((i25 & 55) << 1)) % 128;
                }
                List list = (List) invoke;
                delta = (charlie + 1) % 128;
                return list;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int intValue = ((Number) objArr[0]).intValue();
        int i26 = charlie;
        int i27 = i26 + 87;
        int i28 = i27 % 128;
        delta = i28;
        if (i27 % 2 != 0) {
            if (intValue != 0) {
                if (intValue != 1) {
                    delta = (i26 + 47) % 128;
                    return "";
                }
                int i29 = i28 + 71;
                charlie = i29 % 128;
                if (i29 % 2 == 0) {
                    return "front";
                }
                throw null;
            }
            return "back";
        }
        throw null;
    }

    public static int bravo() {
        int i4 = alpha;
        int i5 = i4 % 7992873;
        alpha = i4 + 1;
        if (i5 != 0) {
            return bravo;
        }
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        bravo = freeMemory;
        return freeMemory;
    }
}
