package A7;

import androidx.appcompat.widget.P0;
import bd.AbstractC0754g;
import com.google.android.gms.internal.measurement.T0;
import id.C1915c;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import s7.InterfaceC2836c;

/* loaded from: classes2.dex */
public final class e implements InterfaceC2836c {
    public static final List charlie = Arrays.asList(64);
    public static final byte[] delta = new byte[16];
    public static final byte[] echo = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public final C1915c alpha;
    public final byte[] bravo;

    public e(byte[] bArr) {
        if (charlie.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.bravo = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.alpha = new C1915c(copyOfRange);
            return;
        }
        throw new InvalidKeyException(P0.cyan(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
    }

    @Override // s7.InterfaceC2836c
    public final byte[] alpha(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) l.echo.alpha("AES/CTR/NoPadding");
            byte[] charlie2 = charlie(bArr2, bArr);
            byte[] bArr3 = (byte[]) charlie2.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.bravo, "AES"), new IvParameterSpec(bArr3));
            return AbstractC0754g.alpha(charlie2, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // s7.InterfaceC2836c
    public final byte[] bravo(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher cipher = (Cipher) l.echo.alpha("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.bravo, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && T0.alpha()) {
                doFinal = new byte[0];
            }
            if (AbstractC0754g.bravo(copyOfRange, charlie(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    public final byte[] charlie(byte[]... bArr) {
        byte[] echo2;
        int length = bArr.length;
        C1915c c1915c = this.alpha;
        if (length == 0) {
            return c1915c.delta(16, echo);
        }
        byte[] delta2 = c1915c.delta(16, delta);
        for (int i4 = 0; i4 < bArr.length - 1; i4++) {
            byte[] bArr2 = bArr[i4];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            delta2 = AbstractC0754g.echo(D6.b.bravo(delta2), c1915c.delta(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length >= delta2.length) {
                int length2 = bArr3.length - delta2.length;
                echo2 = Arrays.copyOf(bArr3, bArr3.length);
                for (int i5 = 0; i5 < delta2.length; i5++) {
                    int i10 = length2 + i5;
                    echo2[i10] = (byte) (echo2[i10] ^ delta2[i5]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
        } else if (bArr3.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = Byte.MIN_VALUE;
            echo2 = AbstractC0754g.echo(copyOf, D6.b.bravo(delta2));
        } else {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        return c1915c.delta(16, echo2);
    }
}
