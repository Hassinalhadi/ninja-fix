package A7;

import com.airbnb.lottie.compose.LottieConstants;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class b implements n {
    public static final a delta = new a(0);
    public final SecretKeySpec alpha;
    public final int bravo;
    public final int charlie;

    public b(int i4, byte[] bArr) {
        r.alpha(bArr.length);
        this.alpha = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) delta.get()).getBlockSize();
        this.charlie = blockSize;
        if (i4 >= 12 && i4 <= blockSize) {
            this.bravo = i4;
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }

    @Override // A7.n
    public final byte[] alpha(byte[] bArr) {
        int length = bArr.length;
        int i4 = this.bravo;
        if (length <= LottieConstants.IterateForever - i4) {
            byte[] bArr2 = new byte[bArr.length + i4];
            byte[] alpha = q.alpha(i4);
            System.arraycopy(alpha, 0, bArr2, 0, i4);
            charlie(bArr, 0, bArr.length, bArr2, this.bravo, alpha, true);
            return bArr2;
        }
        throw new GeneralSecurityException("plaintext length can not exceed " + (LottieConstants.IterateForever - i4));
    }

    @Override // A7.n
    public final byte[] bravo(byte[] bArr) {
        int length = bArr.length;
        int i4 = this.bravo;
        if (length >= i4) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, 0, bArr2, 0, i4);
            int length2 = bArr.length;
            int i5 = this.bravo;
            byte[] bArr3 = new byte[length2 - i5];
            charlie(bArr, i5, bArr.length - i5, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final void charlie(byte[] bArr, int i4, int i5, byte[] bArr2, int i10, byte[] bArr3, boolean z2) {
        Cipher cipher = (Cipher) delta.get();
        byte[] bArr4 = new byte[this.charlie];
        System.arraycopy(bArr3, 0, bArr4, 0, this.bravo);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.alpha;
        if (z2) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i4, i5, bArr2, i10) == i5) {
        } else {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
