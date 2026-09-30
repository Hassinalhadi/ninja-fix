package com.fingerprintjs.android.fpjs_pro_internal;

/* loaded from: classes3.dex */
public final class cv {
    public int component5;
    public int setPivotYN16904;
    public int vD14832N6715;

    public static void alpha(int[] iArr) {
        for (int i4 = 0; i4 < iArr.length / 2; i4++) {
            int i5 = iArr[i4];
            iArr[i4] = iArr[(iArr.length - i4) - 1];
            iArr[(iArr.length - i4) - 1] = i5;
        }
    }
}
