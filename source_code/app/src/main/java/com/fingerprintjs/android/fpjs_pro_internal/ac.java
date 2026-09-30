package com.fingerprintjs.android.fpjs_pro_internal;

/* loaded from: classes3.dex */
public final class ac extends i3<Long> {
    public static int bravo = 0;
    public static int charlie = 1;
    public final long alpha;

    public ac(long j5) {
        super(null);
        this.alpha = j5;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.i3
    public final /* synthetic */ Object alpha() {
        int i4 = bravo;
        int i5 = ((i4 | 123) << 1) - (i4 ^ 123);
        charlie = i5 % 128;
        if (i5 % 2 != 0) {
            Long bravo2 = bravo();
            int i10 = charlie;
            int i11 = (i10 ^ 117) + ((i10 & 117) << 1);
            bravo = i11 % 128;
            if (i11 % 2 == 0) {
                return bravo2;
            }
            throw null;
        }
        bravo();
        throw null;
    }

    public final Long bravo() {
        int i4 = bravo;
        int i5 = (i4 ^ 101) + ((i4 & 101) << 1);
        charlie = i5 % 128;
        if (i5 % 2 != 0) {
            return Long.valueOf(this.alpha);
        }
        throw null;
    }
}
