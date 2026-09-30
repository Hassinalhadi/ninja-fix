package A7;

import com.google.android.gms.internal.measurement.T0;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import s7.InterfaceC2834a;

/* loaded from: classes2.dex */
public final class d implements InterfaceC2834a {
    public static final a bravo = new a(3);
    public final SecretKeySpec alpha;

    public d(byte[] bArr) {
        r.alpha(bArr.length);
        this.alpha = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec charlie(int i4, byte[] bArr) {
        int i5;
        if (T0.alpha()) {
            try {
                i5 = Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
                i5 = -1;
            }
            if (i5 <= 19) {
                return new IvParameterSpec(bArr, 0, i4);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, i4);
    }

    @Override // s7.InterfaceC2834a
    public final byte[] alpha(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 28];
            byte[] alpha = q.alpha(12);
            System.arraycopy(alpha, 0, bArr3, 0, 12);
            AlgorithmParameterSpec charlie = charlie(alpha.length, alpha);
            a aVar = bravo;
            ((Cipher) aVar.get()).init(1, this.alpha, charlie);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) aVar.get()).updateAAD(bArr2);
            }
            int doFinal = ((Cipher) aVar.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(av.q.delta(doFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // s7.InterfaceC2834a
    public final byte[] bravo(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec charlie = charlie(12, bArr);
            a aVar = bravo;
            ((Cipher) aVar.get()).init(2, this.alpha, charlie);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) aVar.get()).updateAAD(bArr2);
            }
            return ((Cipher) aVar.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
