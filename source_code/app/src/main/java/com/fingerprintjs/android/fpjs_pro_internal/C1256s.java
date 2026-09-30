package com.fingerprintjs.android.fpjs_pro_internal;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1256s extends i3<String> {
    public static int bravo;
    public static int charlie;
    public final String alpha;

    static {
        delta();
        charlie();
        bravo = 0;
        charlie = 1;
    }

    public C1256s(String str) {
        super(null);
        this.alpha = str;
    }

    public static void charlie() {
    }

    public static void delta() {
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.i3
    public final /* synthetic */ Object alpha() {
        int i4 = charlie + 1;
        bravo = i4 % 128;
        if (i4 % 2 == 0) {
            String bravo2 = bravo();
            int i5 = bravo;
            int i10 = (i5 ^ 101) + ((i5 & 101) << 1);
            charlie = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 44 / 0;
            }
            return bravo2;
        }
        bravo();
        throw null;
    }

    public final String bravo() {
        int i4 = charlie;
        int i5 = (i4 ^ 5) + ((i4 & 5) << 1);
        bravo = i5 % 128;
        if (i5 % 2 == 0) {
            bravo = (i4 + 9) % 128;
            return this.alpha;
        }
        throw null;
    }
}
