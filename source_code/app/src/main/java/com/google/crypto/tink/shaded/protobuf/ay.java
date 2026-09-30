package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class ay {
    public final ao alpha;
    public final String bravo;
    public final Object[] charlie;
    public final int delta;

    public ay(ao aoVar, String str, Object[] objArr) {
        this.alpha = aoVar;
        this.bravo = str;
        this.charlie = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.delta = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i5 + 1;
            char charAt2 = str.charAt(i5);
            if (charAt2 >= 55296) {
                i4 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i5 = i11;
            } else {
                this.delta = i4 | (charAt2 << i10);
                return;
            }
        }
    }
}
