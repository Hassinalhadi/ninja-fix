package com.fingerprintjs.android.fpjs_pro_internal;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1245p extends i3<Integer> {
    public static int bravo = 0;
    public static int charlie = 1;
    public final int alpha;

    public C1245p(int i4) {
        super(null);
        this.alpha = i4;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.i3
    public final /* synthetic */ Object alpha() {
        int i4 = charlie + 39;
        bravo = i4 % 128;
        if (i4 % 2 == 0) {
            return bravo();
        }
        bravo();
        throw null;
    }

    public final Integer bravo() {
        int i4 = bravo;
        int i5 = ((i4 | 21) << 1) - (i4 ^ 21);
        charlie = i5 % 128;
        if (i5 % 2 != 0) {
            return Integer.valueOf(this.alpha);
        }
        throw null;
    }
}
