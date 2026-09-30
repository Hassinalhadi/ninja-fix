package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public final class ar {
    public final s alpha;
    public final String bravo;
    public final Object[] charlie;
    public final int delta;

    public ar(s sVar, String str, Object[] objArr) {
        this.alpha = sVar;
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

    public final int alpha() {
        int i4 = this.delta;
        if ((i4 & 1) != 0) {
            return 1;
        }
        if ((i4 & 4) == 4) {
            return 3;
        }
        return 2;
    }
}
