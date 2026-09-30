package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class J {
    public final B alpha;
    public final String bravo;
    public final Object[] charlie;
    public final int delta;

    public J(B b2, String str, Object[] objArr) {
        this.alpha = b2;
        this.bravo = str;
        this.charlie = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.delta = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 13;
        int i10 = 1;
        while (true) {
            int i11 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                i4 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i10 = i11;
            } else {
                this.delta = i4 | (charAt2 << i5);
                return;
            }
        }
    }

    public final int alpha() {
        int i4 = this.delta;
        if ((i4 & 1) != 0) {
            return 1;
        }
        return (i4 & 4) == 4 ? 3 : 2;
    }
}
