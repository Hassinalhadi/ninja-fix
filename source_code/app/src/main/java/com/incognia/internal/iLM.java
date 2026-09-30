package com.incognia.internal;

/* loaded from: classes2.dex */
public abstract class iLM {
    public static final void b(int[] iArr, byte[] bArr) {
        int i4 = 0;
        int i5 = 0;
        int i10 = 16;
        while (true) {
            int i11 = i10 - 1;
            if (i10 > 0) {
                int i12 = i5 + 3;
                int i13 = ((bArr[i5 + 1] & 255) << 16) | (bArr[i5] << 24) | ((bArr[i5 + 2] & 255) << 8);
                i5 += 4;
                iArr[i4] = i13 | (bArr[i12] & 255);
                i4++;
                i10 = i11;
            } else {
                return;
            }
        }
    }
}
