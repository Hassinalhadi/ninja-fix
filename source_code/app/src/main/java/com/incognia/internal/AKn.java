package com.incognia.internal;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class AKn {

    /* renamed from: W, reason: collision with root package name */
    public final BigInteger f8351W;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f8352b;

    /* renamed from: f9, reason: collision with root package name */
    public final SecureRandom f8353f9 = new SecureRandom();

    public AKn(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f8352b = bigInteger;
        this.f8351W = bigInteger2;
    }

    public final byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        int bitLength = (this.f8352b.bitLength() + 7) >>> 3;
        if (bArr.length <= bitLength - 66) {
            t9 t9Var = new t9();
            t9Var.b(0, bArr2);
            byte[] b2 = t9Var.b();
            t9Var.W();
            byte[] bArr3 = new byte[32];
            int i4 = bitLength - 33;
            byte[] bArr4 = new byte[i4];
            System.arraycopy(b2, 0, bArr4, 0, 32);
            bArr4[(i4 - bArr.length) - 1] = 1;
            System.arraycopy(bArr, 0, bArr4, i4 - bArr.length, bArr.length);
            int i5 = 0;
            int i10 = 32;
            while (i10 > 0) {
                int i11 = i10 + 4;
                byte[] bArr5 = new byte[i11];
                this.f8353f9.nextBytes(bArr5);
                for (int i12 = 0; i12 < i11 && i10 > 0; i12++) {
                    byte b4 = bArr5[i12];
                    if (b4 != 0) {
                        bArr3[i5] = b4;
                        i10--;
                        i5++;
                    }
                }
            }
            b(bArr4, t9Var, bArr3);
            b(bArr3, t9Var, bArr4);
            byte[] bArr6 = new byte[bitLength];
            System.arraycopy(bArr3, 0, bArr6, 1, 32);
            System.arraycopy(bArr4, 0, bArr6, 33, i4);
            return b(new BigInteger(1, bArr6).modPow(this.f8351W, this.f8352b), (this.f8352b.bitLength() + 7) >>> 3);
        }
        throw new SecurityException();
    }

    public static byte[] b(BigInteger bigInteger, int i4) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i4) {
            return byteArray;
        }
        if (length == i4 + 1 && byteArray[0] == 0) {
            byte[] bArr = new byte[i4];
            System.arraycopy(byteArray, 1, bArr, 0, i4);
            Arrays.fill(byteArray, (byte) 0);
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(byteArray, 0, bArr2, i4 - length, length);
        Arrays.fill(byteArray, (byte) 0);
        return bArr2;
    }

    public static void b(byte[] bArr, t9 t9Var, byte[] bArr2) {
        byte[] bArr3 = new byte[4];
        int i4 = 0;
        while (i4 < bArr.length) {
            t9Var.b(bArr2);
            t9Var.b(4, bArr3);
            byte[] b2 = t9Var.b();
            t9Var.W();
            for (int i5 = 0; i5 < 32 && i4 < bArr.length; i5++) {
                bArr[i4] = (byte) (bArr[i4] ^ b2[i5]);
                i4++;
            }
            byte b4 = (byte) (bArr3[3] + 1);
            bArr3[3] = b4;
            if (b4 == 0) {
                byte b6 = (byte) (bArr3[2] + 1);
                bArr3[2] = b6;
                if (b6 == 0) {
                    byte b10 = (byte) (bArr3[1] + 1);
                    bArr3[1] = b10;
                    if (b10 == 0) {
                        bArr3[0] = (byte) (bArr3[0] + 1);
                    }
                }
            }
        }
    }
}
