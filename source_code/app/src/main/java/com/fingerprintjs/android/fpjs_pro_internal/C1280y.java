package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.List;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1280y extends i3<List<? extends C1188a2>> {
    public static int bravo;
    public final List alpha;

    public C1280y(List list) {
        super(null);
        this.alpha = list;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.i3
    public final Object alpha() {
        int i4 = bravo + 25;
        int i5 = i4 % 128;
        if (i4 % 2 != 0) {
            int i10 = (i5 ^ 85) + ((i5 & 85) << 1);
            bravo = i10 % 128;
            int i11 = i10 % 2;
            List list = this.alpha;
            if (i11 != 0) {
                int i12 = 83 / 0;
            }
            return list;
        }
        throw null;
    }
}
