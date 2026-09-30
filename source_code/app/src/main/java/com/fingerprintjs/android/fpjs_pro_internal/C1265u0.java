package com.fingerprintjs.android.fpjs_pro_internal;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1265u0 {
    public static int delta = 1;
    public final Integer alpha;
    public final Boolean bravo;
    public final Boolean charlie;

    public C1265u0(Integer num, Boolean bool, Boolean bool2) {
        this.alpha = num;
        this.bravo = bool;
        this.charlie = bool2;
    }

    public final Boolean alpha() {
        int i4 = delta;
        if (((i4 ^ 111) + ((i4 & 111) << 1)) % 2 == 0) {
            return this.bravo;
        }
        throw null;
    }
}
