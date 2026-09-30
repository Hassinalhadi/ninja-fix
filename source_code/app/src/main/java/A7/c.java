package A7;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import s7.InterfaceC2834a;

/* loaded from: classes2.dex */
public final class c implements InterfaceC2834a {
    public static final a echo = new a(1);
    public static final a foxtrot = new a(2);
    public final byte[] alpha;
    public final byte[] bravo;
    public final SecretKeySpec charlie;
    public final int delta;

    public c(int i4, byte[] bArr) {
        if (i4 != 12 && i4 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.delta = i4;
        r.alpha(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.charlie = secretKeySpec;
        Cipher cipher = (Cipher) echo.get();
        cipher.init(1, secretKeySpec);
        byte[] charlie = charlie(cipher.doFinal(new byte[16]));
        this.alpha = charlie;
        this.bravo = charlie(charlie);
    }

    public static byte[] charlie(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i4 = 0;
        int i5 = 0;
        while (i5 < 15) {
            int i10 = i5 + 1;
            bArr2[i5] = (byte) (((bArr[i5] << 1) ^ ((bArr[i10] & 255) >>> 7)) & 255);
            i5 = i10;
        }
        int i11 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i4 = 135;
        }
        bArr2[15] = (byte) (i11 ^ i4);
        return bArr2;
    }

    public static byte[] echo(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            bArr3[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
        }
        return bArr3;
    }

    @Override // s7.InterfaceC2834a
    public final byte[] alpha(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        int i4 = this.delta;
        if (length <= 2147483631 - i4) {
            byte[] bArr4 = new byte[bArr.length + i4 + 16];
            byte[] alpha = q.alpha(i4);
            System.arraycopy(alpha, 0, bArr4, 0, i4);
            Cipher cipher = (Cipher) echo.get();
            SecretKeySpec secretKeySpec = this.charlie;
            cipher.init(1, secretKeySpec);
            byte[] delta = delta(cipher, 0, alpha, 0, alpha.length);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] delta2 = delta(cipher, 1, bArr3, 0, bArr3.length);
            Cipher cipher2 = (Cipher) foxtrot.get();
            cipher2.init(1, secretKeySpec, new IvParameterSpec(delta));
            cipher2.doFinal(bArr, 0, bArr.length, bArr4, this.delta);
            byte[] delta3 = delta(cipher, 2, bArr4, this.delta, bArr.length);
            int length2 = bArr.length + i4;
            for (int i5 = 0; i5 < 16; i5++) {
                bArr4[length2 + i5] = (byte) ((delta2[i5] ^ delta[i5]) ^ delta3[i5]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // s7.InterfaceC2834a
    public final byte[] bravo(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        int i4 = this.delta;
        int i5 = (length - i4) - 16;
        if (i5 >= 0) {
            Cipher cipher = (Cipher) echo.get();
            SecretKeySpec secretKeySpec = this.charlie;
            cipher.init(1, secretKeySpec);
            byte[] delta = delta(cipher, 0, bArr, 0, this.delta);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] delta2 = delta(cipher, 1, bArr3, 0, bArr3.length);
            byte[] delta3 = delta(cipher, 2, bArr, this.delta, i5);
            int length2 = bArr.length - 16;
            byte b2 = 0;
            for (int i10 = 0; i10 < 16; i10++) {
                b2 = (byte) (b2 | (((bArr[length2 + i10] ^ delta2[i10]) ^ delta[i10]) ^ delta3[i10]));
            }
            if (b2 == 0) {
                Cipher cipher2 = (Cipher) foxtrot.get();
                cipher2.init(1, secretKeySpec, new IvParameterSpec(delta));
                return cipher2.doFinal(bArr, i4, i5);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] delta(Cipher cipher, int i4, byte[] bArr, int i5, int i10) {
        byte[] copyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i4;
        byte[] bArr3 = this.alpha;
        if (i10 == 0) {
            return cipher.doFinal(echo(bArr2, bArr3));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i11 = 0;
        while (i10 - i11 > 16) {
            for (int i12 = 0; i12 < 16; i12++) {
                doFinal[i12] = (byte) (doFinal[i12] ^ bArr[(i5 + i11) + i12]);
            }
            doFinal = cipher.doFinal(doFinal);
            i11 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i11 + i5, i5 + i10);
        if (copyOfRange.length == 16) {
            copyOf = echo(copyOfRange, bArr3);
        } else {
            copyOf = Arrays.copyOf(this.bravo, 16);
            for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                copyOf[i13] = (byte) (copyOf[i13] ^ copyOfRange[i13]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
        }
        return cipher.doFinal(echo(doFinal, copyOf));
    }
}
