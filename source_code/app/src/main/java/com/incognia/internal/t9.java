package com.incognia.internal;

import Q0.c;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class t9 {

    /* renamed from: W, reason: collision with root package name */
    public int f11362W;

    /* renamed from: b, reason: collision with root package name */
    public int f11363b;

    /* renamed from: f9, reason: collision with root package name */
    public final byte[] f11364f9 = new byte[64];
    public final int[] sVU = new int[8];
    public final int[] gmP = new int[16];

    /* renamed from: J, reason: collision with root package name */
    public final int[] f11361J = new int[64];

    public t9() {
        W();
    }

    public static int b(int i4, int i5) {
        return (i4 << (32 - i5)) | (i4 >>> i5);
    }

    public static int f9(int i4) {
        return (i4 >>> 3) ^ (b(i4, 7) ^ b(i4, 18));
    }

    public static int sVU(int i4) {
        return (i4 >>> 10) ^ (b(i4, 17) ^ b(i4, 19));
    }

    public final void W() {
        Arrays.fill(this.f11364f9, (byte) 0);
        this.f11363b = 0;
        this.f11362W = 0;
        int[] iArr = this.sVU;
        iArr[0] = 1779033703;
        iArr[1] = -1150833019;
        iArr[2] = 1013904242;
        iArr[3] = -1521486534;
        iArr[4] = 1359893119;
        iArr[5] = -1694144372;
        iArr[6] = 528734635;
        iArr[7] = 1541459225;
    }

    public final void b(byte[] bArr) {
        if (bArr != null) {
            b(bArr.length, bArr);
            return;
        }
        throw new NullPointerException("Input data buffer is null");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r11v28 ?? I:int), method size: 3489
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void f9() {
        /*
            Method dump skipped, instructions count: 3489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incognia.internal.t9.f9():void");
    }

    public final void b(int i4, byte[] bArr) {
        if (bArr != null) {
            if (i4 > bArr.length) {
                throw new IllegalArgumentException(androidx.appcompat.widget.P0.cyan(c.sierra(i4, "reading ", " bytes of input starting at offset 0 will overrun end of input buffer ("), bArr.length, " bytes long)"));
            }
            if (i4 >= 0) {
                this.f11362W += i4;
                int i5 = 0;
                while (true) {
                    int i10 = this.f11363b;
                    int i11 = i10 + i4;
                    byte[] bArr2 = this.f11364f9;
                    if (i11 >= bArr2.length) {
                        int length = bArr2.length - i10;
                        System.arraycopy(bArr, i5, bArr2, i10, length);
                        f9();
                        i4 -= length;
                        i5 += length;
                        this.f11363b = 0;
                    } else {
                        System.arraycopy(bArr, i5, bArr2, i10, i4);
                        this.f11363b += i4;
                        return;
                    }
                }
            } else {
                throw new IllegalArgumentException("input length is negative (0)");
            }
        } else {
            throw new NullPointerException("Input data buffer is null");
        }
    }

    public static int W(int i4) {
        return b(i4, 25) ^ (b(i4, 6) ^ b(i4, 11));
    }

    public final byte[] b() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = this.f11364f9;
        int i4 = this.f11363b;
        int i5 = i4 + 1;
        this.f11363b = i5;
        bArr2[i4] = Byte.MIN_VALUE;
        if (i4 + 9 > bArr2.length) {
            Arrays.fill(bArr2, i5, 64, (byte) 0);
            f9();
            this.f11363b = 0;
        }
        byte[] bArr3 = this.f11364f9;
        Arrays.fill(bArr3, this.f11363b, bArr3.length - 8, (byte) 0);
        long j5 = this.f11362W * 8;
        for (int i10 = 0; i10 < 8; i10++) {
            this.f11364f9[(r6.length - i10) - 1] = (byte) j5;
            j5 >>>= 8;
        }
        f9();
        int i11 = 0;
        for (int i12 : this.sVU) {
            bArr[i11] = (byte) (i12 >>> 24);
            bArr[i11 + 1] = (byte) (i12 >>> 16);
            int i13 = i11 + 3;
            bArr[i11 + 2] = (byte) (i12 >>> 8);
            i11 += 4;
            bArr[i13] = (byte) i12;
        }
        W();
        return bArr;
    }

    public static int b(int i4) {
        return b(i4, 22) ^ (b(i4, 2) ^ b(i4, 13));
    }
}
