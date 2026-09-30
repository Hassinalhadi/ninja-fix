package com.fingerprintjs.android.fpjs_pro_internal;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1272w extends i3<String> {
    public static int bravo = 1;
    public final String alpha;

    public C1272w(String str) {
        super(null);
        this.alpha = str;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.i3
    public final Object alpha() {
        int i4 = bravo;
        int i5 = (i4 & 9) + (i4 | 9);
        int i10 = i5 % 128;
        if (i5 % 2 == 0) {
            int i11 = i10 + 123;
            bravo = i11 % 128;
            if (i11 % 2 != 0) {
                return this.alpha;
            }
            throw null;
        }
        int i12 = i10 + 123;
        bravo = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        throw null;
    }
}
