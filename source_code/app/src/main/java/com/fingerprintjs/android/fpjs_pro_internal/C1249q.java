package com.fingerprintjs.android.fpjs_pro_internal;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1249q extends i3<String> {
    public static int bravo = 1;
    public final String alpha;

    public C1249q(String str) {
        super(null);
        this.alpha = str;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.i3
    public final Object alpha() {
        int i4 = (bravo + 75) % 128;
        int i5 = ((i4 | 67) << 1) - (i4 ^ 67);
        bravo = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 63 / 0;
        }
        bravo = ((i4 ^ 63) + ((i4 & 63) << 1)) % 128;
        return this.alpha;
    }
}
