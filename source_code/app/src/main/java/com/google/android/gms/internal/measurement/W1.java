package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class W1 {
    public final O1 alpha;
    public final String bravo;
    public final Object[] charlie;
    public final int delta;

    public W1(O1 o12, String str, Object[] objArr) {
        this.alpha = o12;
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
