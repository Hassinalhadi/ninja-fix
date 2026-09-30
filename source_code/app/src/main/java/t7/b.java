package t7;

import android.util.Log;
import av.q;
import bd.AbstractC0754g;
import com.bumptech.glide.load.engine.h;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import s7.AbstractC2835b;
import s7.InterfaceC2834a;

/* loaded from: classes2.dex */
public final class b implements InterfaceC2834a {
    public final /* synthetic */ int alpha = 0;
    public final Object bravo;

    public b(h hVar) {
        this.bravo = hVar;
    }

    @Override // s7.InterfaceC2834a
    public final byte[] alpha(byte[] bArr, byte[] bArr2) {
        switch (this.alpha) {
            case 0:
                h hVar = (h) this.bravo;
                return AbstractC0754g.alpha(((s7.f) hVar.red).alpha(), ((InterfaceC2834a) ((s7.f) hVar.red).alpha).alpha(bArr, bArr2));
            default:
                try {
                    return delta(bArr, bArr2);
                } catch (GeneralSecurityException | ProviderException e) {
                    Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                    } catch (InterruptedException unused) {
                    }
                    return delta(bArr, bArr2);
                }
        }
    }

    @Override // s7.InterfaceC2834a
    public final byte[] bravo(byte[] bArr, byte[] bArr2) {
        byte[] bravo;
        switch (this.alpha) {
            case 0:
                int length = bArr.length;
                h hVar = (h) this.bravo;
                if (length > 5) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                    Iterator it = hVar.juliet(copyOfRange).iterator();
                    while (it.hasNext()) {
                        try {
                            bravo = ((InterfaceC2834a) ((s7.f) it.next()).alpha).bravo(copyOfRange2, bArr2);
                            return bravo;
                        } catch (GeneralSecurityException e) {
                            c.alpha.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                        }
                    }
                }
                Iterator it2 = hVar.juliet(AbstractC2835b.alpha).iterator();
                while (it2.hasNext()) {
                    try {
                        bravo = ((InterfaceC2834a) ((s7.f) it2.next()).alpha).bravo(bArr, bArr2);
                        return bravo;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("decryption failed");
            default:
                try {
                    return charlie(bArr, bArr2);
                } catch (GeneralSecurityException | ProviderException e4) {
                    Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e4);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                    } catch (InterruptedException unused2) {
                    }
                    return charlie(bArr, bArr2);
                }
        }
    }

    public byte[] charlie(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, (SecretKey) this.bravo, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public byte[] delta(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 28];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, (SecretKey) this.bravo);
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public b(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.bravo = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(q.echo("Keystore cannot load the key with ID: ", str));
        }
    }
}
