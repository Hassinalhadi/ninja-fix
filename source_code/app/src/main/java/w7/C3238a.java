package w7;

import A7.q;
import A7.r;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import t7.b;

/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3238a {
    public KeyStore alpha;

    public C3238a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.alpha = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void alpha(String str) {
        if (!new C3238a().charlie(str)) {
            String bravo = r.bravo(str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(bravo, 3).setKeySize(Barcode.FORMAT_QR_CODE).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
            return;
        }
        throw new IllegalArgumentException(ad.gray("cannot generate a new key ", str, " because it already exists; please delete it with deleteKey() and try again"));
    }

    public final synchronized b bravo(String str) {
        b bVar;
        bVar = new b(r.bravo(str), this.alpha);
        byte[] alpha = q.alpha(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(alpha, bVar.bravo(bVar.alpha(alpha, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return bVar;
    }

    public final synchronized boolean charlie(String str) {
        String bravo;
        bravo = r.bravo(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("a", "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.alpha = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.alpha.containsAlias(bravo);
        }
        return this.alpha.containsAlias(bravo);
    }
}
