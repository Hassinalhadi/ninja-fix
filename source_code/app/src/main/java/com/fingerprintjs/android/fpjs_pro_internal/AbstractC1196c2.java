package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.W;
import java.util.List;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.c2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1196c2 {
    public static int alpha = 0;
    public static int bravo = 1;

    public static final int alpha(List list) {
        int i4 = alpha;
        bravo = ((i4 & 23) + (i4 | 23)) % 128;
        int i5 = 0;
        if (list.contains(W.b.alpha)) {
            int i10 = bravo;
            int i11 = ((i10 & 67) + (i10 | 67)) % 128;
            alpha = i11;
            int i12 = i11 + 41;
            bravo = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } else {
            int i13 = bravo + 59;
            alpha = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 28 / 0;
            }
            i5 = 1;
        }
        int i15 = bravo;
        alpha = ((i15 & 23) + (i15 | 23)) % 128;
        return i5;
    }
}
