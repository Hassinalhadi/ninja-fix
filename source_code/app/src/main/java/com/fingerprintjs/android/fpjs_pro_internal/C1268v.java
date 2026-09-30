package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.List;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1268v extends i3<List<? extends C1193c>> {
    public static int bravo;
    public final List alpha;

    public C1268v(List list) {
        super(null);
        this.alpha = list;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.i3
    public final Object alpha() {
        int i4 = bravo;
        int i5 = ((((i4 | 97) << 1) - (i4 ^ 97)) % 128) + 121;
        bravo = i5 % 128;
        if (i5 % 2 == 0) {
            return this.alpha;
        }
        throw null;
    }
}
