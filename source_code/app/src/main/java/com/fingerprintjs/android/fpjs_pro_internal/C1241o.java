package com.fingerprintjs.android.fpjs_pro_internal;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1241o extends i3<String> {
    public static int bravo;
    public final String alpha;

    static {
        charlie();
        bravo();
        bravo = 0;
    }

    public C1241o(String str) {
        super(null);
        this.alpha = str;
    }

    public static void bravo() {
    }

    public static void charlie() {
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.i3
    public final Object alpha() {
        int i4 = bravo;
        int i5 = (i4 & 9) + (i4 | 9);
        int i10 = i5 % 128;
        if (i5 % 2 != 0) {
            int i11 = i10 + 3;
            bravo = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 61 / 0;
            }
            int i13 = (i10 ^ 125) + ((i10 & 125) << 1);
            bravo = i13 % 128;
            if (i13 % 2 == 0) {
                return this.alpha;
            }
            throw null;
        }
        int i14 = i10 + 3;
        bravo = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 61 / 0;
            throw null;
        }
        throw null;
    }
}
