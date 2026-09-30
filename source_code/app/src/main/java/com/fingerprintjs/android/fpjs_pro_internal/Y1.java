package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.List;

/* loaded from: classes3.dex */
public final class Y1 {
    public static int charlie;
    public final List alpha;
    public final List bravo;

    public Y1(List list, List list2) {
        this.alpha = list;
        this.bravo = list2;
    }

    public final List alpha() {
        int i4 = charlie;
        int i5 = ((i4 ^ 7) + ((i4 & 7) << 1)) % 2;
        List list = this.alpha;
        if (i5 == 0) {
            int i10 = 6 / 0;
        }
        return list;
    }

    public final List bravo() {
        int i4 = charlie;
        int i5 = ((i4 | 125) << 1) - (i4 ^ 125);
        int i10 = i5 % 128;
        if (i5 % 2 == 0) {
            int i11 = 80 / 0;
        }
        int i12 = (i10 & 115) + (i10 | 115);
        charlie = i12 % 128;
        if (i12 % 2 == 0) {
            return this.bravo;
        }
        throw null;
    }
}
