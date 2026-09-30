package com.fingerprintjs.android.fpjs_pro_internal;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1260t extends i3<String> {
    public static int bravo = 0;
    public static int charlie = 1;
    public final String alpha;

    public C1260t(String str) {
        super(null);
        this.alpha = str;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.i3
    public final /* synthetic */ Object alpha() {
        int i4 = bravo + 13;
        charlie = i4 % 128;
        if (i4 % 2 != 0) {
            return bravo();
        }
        bravo();
        throw null;
    }

    public final String bravo() {
        int i4 = charlie;
        int i5 = (i4 ^ 83) + ((i4 & 83) << 1);
        bravo = i5 % 128;
        if (i5 % 2 == 0) {
            return this.alpha;
        }
        throw null;
    }
}
