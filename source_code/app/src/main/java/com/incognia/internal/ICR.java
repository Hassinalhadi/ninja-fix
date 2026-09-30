package com.incognia.internal;

import com.clevertap.android.sdk.customviews.CloseImageView;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.UUID;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import kotlin.collections.ArraysKt;
import kotlin.text.StringsKt;
import kotlin.text.a;
import s6.J4;

/* loaded from: classes2.dex */
public abstract class ICR {
    public static String W(String str) {
        Charset charset = a.alpha;
        byte[] bytes = str.getBytes(charset);
        byte[] bArr = {(byte) 16226659, (byte) 6452, (byte) 2123, (byte) 130348082, (byte) 502699363, (byte) 6246, (byte) 18264, (byte) 459385, (byte) 618, (byte) 199287, (byte) 20592, (byte) 811830326, (byte) 1336690, (byte) 4211, (byte) 3297124, (byte) 117349};
        byte[] b2 = b();
        byte[] W5 = new F(bArr, b2, null).W(bytes);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(b2);
            byteArrayOutputStream.write(W5);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Arrays.fill(bArr, (byte) 0);
            Arrays.fill(b2, (byte) 0);
            return StringsKt.b(new String(cT.W(2, byteArray), charset)).toString();
        } catch (IOException e) {
            throw new SecurityException(e);
        }
    }

    public static String b(String str) {
        byte[] b2 = cT.b(3, str.getBytes());
        byte[] bArr = {(byte) 16226659, (byte) 6452, (byte) 2123, (byte) 130348082, (byte) 502699363, (byte) 6246, (byte) 18264, (byte) 459385, (byte) 618, (byte) 199287, (byte) 20592, (byte) 811830326, (byte) 1336690, (byte) 4211, (byte) 3297124, (byte) 117349};
        byte[] b4 = new F(bArr, ArraysKt.copyOfRange(b2, 0, 16), null).b(ArraysKt.copyOfRange(b2, 16, b2.length));
        Arrays.fill(bArr, (byte) 0);
        return StringsKt.b(new String(b4, a.alpha)).toString();
    }

    public static byte[] f9(byte[] bArr) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr2 = new byte[16];
        secureRandom.nextBytes(bArr2);
        byte[] bArr3 = new byte[32];
        secureRandom.nextBytes(bArr3);
        F f5 = new F(bArr3, bArr2, cT.b(0, Jfe.b().f8940b));
        Deflater deflater = new Deflater(5, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
        try {
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.flush();
                deflaterOutputStream.close();
                deflater.end();
                byte[] W5 = f5.W(byteArrayOutputStream.toByteArray());
                if (f5.f8634W != null) {
                    byte[] bArr4 = f5.f8634W;
                    iAM iam = new iAM(bArr4);
                    iam.f10612W.b(f5.f8635b);
                    iam.f10612W.b(W5);
                    t9 t9Var = new t9();
                    byte[] b2 = xFC.b(iAM.sVU, iAM.b(bArr4));
                    byte[] b4 = iam.f10612W.b();
                    int length = b2.length;
                    int i4 = length + 32;
                    byte[] bArr5 = new byte[i4];
                    System.arraycopy(b2, 0, bArr5, 0, length);
                    System.arraycopy(b4, 0, bArr5, length, 32);
                    t9Var.b(i4, bArr5);
                    byte[] ochre = ArraysKt.ochre(W5, ArraysKt.peach(t9Var.b(), J4.hotel(0, f5.f8633J)));
                    byte[] b6 = ((Q6I) X8.W()).WdK.b(bArr3);
                    byte[] bArr6 = new byte[b6.length + 16 + ochre.length];
                    System.arraycopy(b6, 0, bArr6, 0, b6.length);
                    System.arraycopy(bArr2, 0, bArr6, b6.length, 16);
                    System.arraycopy(ochre, 0, bArr6, b6.length + 16, ochre.length);
                    return bArr6;
                }
                throw new SecurityException();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static String sVU(String str) {
        boolean z2;
        byte[] b2 = cT.b(2, str.getBytes());
        byte b4 = (byte) 614;
        byte[] bArr = {(byte) 16226611, (byte) 6502, (byte) 2099, (byte) 130348086, (byte) 502699313, (byte) 6197, (byte) 18275, (byte) 459365, b4, (byte) 199268, (byte) 20578, (byte) 811830369, (byte) 1336625, (byte) 4198, (byte) 3297079, (byte) 117347};
        if (b2.length != 0) {
            byte b6 = (byte) 16226625;
            byte[] bArr2 = {b6, (byte) 6518, (byte) 2157, (byte) 130348129, (byte) 502699376, (byte) 6260, (byte) 18245, (byte) 459338, b4, (byte) CloseImageView.VIEW_ID, (byte) 20528, (byte) 811830370, (byte) 1336695, (byte) 4186, (byte) 3297072, (byte) 117296};
            if (b2.length >= 16) {
                byte[] copyOfRange = ArraysKt.copyOfRange(b2, 0, 16);
                z2 = Arrays.equals(copyOfRange, bArr2);
                Arrays.fill(copyOfRange, (byte) 0);
                Arrays.fill(bArr2, (byte) 0);
            } else {
                z2 = false;
            }
            if (z2) {
                byte[] b10 = new F(bArr, b(), null).b(ArraysKt.copyOfRange(b2, 16, b2.length));
                byte[] copyOfRange2 = ArraysKt.copyOfRange(b10, 16, b10.length);
                Arrays.fill(bArr, (byte) 0);
                return StringsKt.b(new String(copyOfRange2, a.alpha)).toString();
            }
            byte[] bArr3 = {b6, (byte) 6465, (byte) 2113, (byte) 130348097, (byte) 502699329, (byte) 6209, (byte) 18241, (byte) 459329, (byte) 577, (byte) 199233, (byte) 20545, (byte) 811830337, (byte) 1336641, (byte) 4161, (byte) 3297089, (byte) 117313};
            byte[] b11 = new F(bArr, bArr3, null).b(b2);
            Arrays.fill(bArr3, (byte) 0);
            Arrays.fill(bArr, (byte) 0);
            return StringsKt.b(new String(b11, a.alpha)).toString();
        }
        throw new SecurityException();
    }

    public static byte[] b() {
        t9 t9Var = new t9();
        t9Var.b(UUID.randomUUID().toString().getBytes(a.alpha));
        return ArraysKt.copyOfRange(t9Var.b(), 0, 16);
    }

    public static String b(byte[] bArr) {
        byte[] bArr2 = {(byte) 16226659, (byte) 6452, (byte) 2123, (byte) 130348082, (byte) 502699363, (byte) 6246, (byte) 18264, (byte) 459385, (byte) 618, (byte) 199287, (byte) 20592, (byte) 811830326, (byte) 1336690, (byte) 4211, (byte) 3297124, (byte) 117349};
        byte[] b2 = new F(bArr2, ArraysKt.copyOfRange(bArr, 0, 16), null).b(ArraysKt.copyOfRange(bArr, 16, bArr.length));
        Arrays.fill(bArr2, (byte) 0);
        return StringsKt.b(new String(b2, a.alpha)).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] W(byte[] bArr) {
        boolean z2;
        boolean equals;
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        int length = bArr.length - 16;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
        F f5 = new F(cT.b(0, new byte[]{(byte) 101, (byte) 3790155, (byte) 8086643, (byte) 12405, (byte) 148276, (byte) 331, (byte) 45924, (byte) 374, (byte) 63960388, (byte) 820381528, (byte) 68235585, (byte) 8752, (byte) 15986, (byte) 69, (byte) 58217336, (byte) 67, (byte) 944005204, (byte) 23631, (byte) 993384, (byte) 621, (byte) 121, (byte) 16746873, (byte) 3099760, (byte) 17060150, (byte) 1637, (byte) 749201776, (byte) 13162, (byte) 218706, (byte) 102221, (byte) 52079, (byte) 11892, (byte) 4203, (byte) 27799897, (byte) 2870, (byte) 123718, (byte) 3687, (byte) 1696559, (byte) 3384931, (byte) 43338, (byte) 110182706, (byte) 1343062, (byte) 150593, (byte) 1840, (byte) 104671293}), bArr2, cT.b(0, Jfe.b().f8940b));
        byte[] peach = ArraysKt.peach(bArr3, J4.hotel(0, length - f5.f8633J));
        byte[] peach2 = ArraysKt.peach(bArr3, J4.hotel(length - f5.f8633J, length));
        if (f5.f8634W != null) {
            byte[] bArr4 = f5.f8634W;
            iAM iam = new iAM(bArr4);
            iam.f10612W.b(f5.f8635b);
            iam.f10612W.b(peach);
            t9 t9Var = new t9();
            byte[] b2 = xFC.b(iAM.sVU, iAM.b(bArr4));
            byte[] b4 = iam.f10612W.b();
            int length2 = b2.length;
            int i4 = length2 + 32;
            byte[] bArr5 = new byte[i4];
            System.arraycopy(b2, 0, bArr5, 0, length2);
            System.arraycopy(b4, 0, bArr5, length2, 32);
            t9Var.b(i4, bArr5);
            if (Arrays.equals(ArraysKt.peach(t9Var.b(), J4.hotel(0, f5.f8633J)), peach2)) {
                byte[] b6 = f5.b(peach);
                byte[] bArr6 = new byte[Barcode.FORMAT_QR_CODE];
                System.arraycopy(b6, 0, bArr6, 0, Barcode.FORMAT_QR_CODE);
                int length3 = b6.length - Barcode.FORMAT_QR_CODE;
                byte[] bArr7 = new byte[length3];
                System.arraycopy(b6, Barcode.FORMAT_QR_CODE, bArr7, 0, length3);
                AKn aKn = ((Q6I) X8.W()).WdK;
                aKn.getClass();
                t9 t9Var2 = new t9();
                t9Var2.b(length3, bArr7);
                byte[] b10 = t9Var2.b();
                t9Var2.W();
                BigInteger bigInteger = new BigInteger(1, AKn.b(new BigInteger(1, bArr6).modPow(aKn.f8351W, aKn.f8352b), (aKn.f8352b.bitLength() + 7) >>> 3));
                int bitLength = aKn.f8352b.bitLength() - 1;
                int bitLength2 = (aKn.f8352b.bitLength() + 7) >>> 3;
                int i5 = bitLength2 * 8;
                if (bigInteger.bitLength() <= i5) {
                    byte[] b11 = AKn.b(bigInteger, bitLength2);
                    if (bitLength2 >= 34) {
                        int i10 = bitLength2 - 1;
                        if (b11[i10] == -68) {
                            int i11 = bitLength2 - 32;
                            int i12 = bitLength2 - 33;
                            z2 = false;
                            byte[] copyOfRange = ArraysKt.copyOfRange(b11, 0, i12);
                            byte[] copyOfRange2 = ArraysKt.copyOfRange(b11, i12, i10);
                            byte b12 = (byte) (255 >> (i5 - bitLength));
                            if ((b11[0] & ((byte) (~b12))) == 0) {
                                t9 t9Var3 = new t9();
                                AKn.b(copyOfRange, t9Var3, copyOfRange2);
                                copyOfRange[0] = (byte) (b12 & copyOfRange[0]);
                                int length4 = copyOfRange.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length4) {
                                        i13 = 0;
                                        break;
                                    }
                                    if (copyOfRange[i13] == 1) {
                                        break;
                                    }
                                    i13++;
                                }
                                int length5 = (copyOfRange.length - i13) - 1;
                                int i14 = (i11 - length5) - 2;
                                int i15 = 0;
                                while (true) {
                                    if (i15 < i14) {
                                        if (copyOfRange[i15] != 0) {
                                            break;
                                        }
                                        i15++;
                                    } else if (copyOfRange[i14] == 1) {
                                        byte[] copyOfRange3 = ArraysKt.copyOfRange(copyOfRange, copyOfRange.length - length5, copyOfRange.length);
                                        t9Var3.b(8, new byte[8]);
                                        t9Var3.b(32, b10);
                                        t9Var3.b(copyOfRange3);
                                        equals = Arrays.equals(t9Var3.b(), copyOfRange2);
                                    }
                                }
                                if (equals) {
                                    return vB.b(bArr7);
                                }
                                throw new SecurityException();
                            }
                            equals = z2;
                            if (equals) {
                            }
                        }
                    }
                }
                z2 = false;
                equals = z2;
                if (equals) {
                }
            } else {
                throw new SecurityException();
            }
        } else {
            throw new SecurityException();
        }
    }

    public static String f9(String str) {
        byte[] bytes = str.getBytes(a.alpha);
        byte[] bArr = {1};
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr2 = new byte[16];
        secureRandom.nextBytes(bArr2);
        byte[] bArr3 = new byte[32];
        secureRandom.nextBytes(bArr3);
        F f5 = new F(bArr3, bArr2, cT.b(0, new byte[]{(byte) 16226668, (byte) 6480, (byte) 2166, (byte) 130348110, (byte) 502699365, (byte) 6220, (byte) 18251, (byte) 459368, (byte) 585, (byte) 199242, (byte) 20531, (byte) 811830337, (byte) 1336662, (byte) 4162, (byte) 3297130, (byte) 117347, (byte) 455795, (byte) 16940617, (byte) 1439861, (byte) 98075472, (byte) 1021552, (byte) 108, (byte) 33482611, (byte) 6766, (byte) 759151, (byte) 1400173415, (byte) 757068, (byte) 71, (byte) 468556, (byte) 33878, (byte) 75, (byte) 1519202, (byte) 82, (byte) 197704, (byte) 12154, (byte) 30771, (byte) 1863015, (byte) 369017, (byte) 103657577, (byte) 12023858, (byte) 846180, (byte) 494129, (byte) 144246869, (byte) 2091069}));
        Deflater deflater = new Deflater(5, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
        try {
            try {
                deflaterOutputStream.write(bytes);
                deflaterOutputStream.flush();
                deflaterOutputStream.close();
                deflater.end();
                byte[] W5 = f5.W(byteArrayOutputStream.toByteArray());
                if (f5.f8634W != null) {
                    byte[] bArr4 = f5.f8634W;
                    iAM iam = new iAM(bArr4);
                    iam.f10612W.b(f5.f8635b);
                    iam.f10612W.b(W5);
                    t9 t9Var = new t9();
                    byte[] b2 = xFC.b(iAM.sVU, iAM.b(bArr4));
                    byte[] b4 = iam.f10612W.b();
                    int length = b2.length;
                    int i4 = length + 32;
                    byte[] bArr5 = new byte[i4];
                    System.arraycopy(b2, 0, bArr5, 0, length);
                    System.arraycopy(b4, 0, bArr5, length, 32);
                    t9Var.b(i4, bArr5);
                    byte[] ochre = ArraysKt.ochre(W5, ArraysKt.peach(t9Var.b(), J4.hotel(0, f5.f8633J)));
                    byte[] b6 = ((Q6I) X8.W()).eHc.b(bArr3);
                    byte[] bArr6 = new byte[b6.length + 17 + ochre.length];
                    System.arraycopy(bArr, 0, bArr6, 0, 1);
                    System.arraycopy(b6, 0, bArr6, 1, b6.length);
                    System.arraycopy(bArr2, 0, bArr6, b6.length + 1, 16);
                    System.arraycopy(ochre, 0, bArr6, b6.length + 17, ochre.length);
                    return cT.f9(11, bArr6);
                }
                throw new SecurityException();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }
}
