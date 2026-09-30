package com.incognia.internal;

/* loaded from: classes2.dex */
public final class iAM {

    /* renamed from: f9, reason: collision with root package name */
    public static final byte[] f10611f9 = new byte[64];
    public static final byte[] sVU = new byte[64];

    /* renamed from: W, reason: collision with root package name */
    public final t9 f10612W;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10613b;

    static {
        for (int i4 = 0; i4 < 64; i4++) {
            f10611f9[i4] = 54;
            sVU[i4] = 92;
        }
    }

    public iAM(byte[] bArr) {
        this.f10613b = bArr;
        t9 t9Var = new t9();
        this.f10612W = t9Var;
        byte[] b2 = xFC.b(f10611f9, b(bArr));
        t9Var.b(b2.length, b2);
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3 = new byte[64];
        if (bArr.length > 64) {
            t9 t9Var = new t9();
            t9Var.b(bArr.length, bArr);
            bArr2 = t9Var.b();
        } else {
            bArr2 = bArr;
        }
        if (bArr2.length < 64) {
            int length = 64 - bArr2.length;
            byte[] bArr4 = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                bArr4[i4] = 0;
            }
            int length2 = bArr2.length;
            byte[] bArr5 = new byte[length2 + length];
            System.arraycopy(bArr2, 0, bArr5, 0, length2);
            System.arraycopy(bArr4, 0, bArr5, length2, length);
            bArr3 = bArr5;
        }
        if (bArr2.length == 64) {
            return bArr;
        }
        return bArr3;
    }
}
