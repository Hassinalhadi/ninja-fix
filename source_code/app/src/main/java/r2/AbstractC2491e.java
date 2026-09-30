package r2;

import android.security.keystore.KeyGenParameterSpec;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.security.KeyStore;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* renamed from: r2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2491e {
    public static final KeyGenParameterSpec alpha = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(Barcode.FORMAT_QR_CODE).build();

    public static String alpha(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() == 256) {
            if (Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                if (keyGenParameterSpec.getPurposes() == 3) {
                    if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                        }
                        String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                        keyStore.load(null);
                        if (!keyStore.containsAlias(keystoreAlias)) {
                            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                            keyGenerator.init(keyGenParameterSpec);
                            keyGenerator.generateKey();
                        }
                        return keyGenParameterSpec.getKeystoreAlias();
                    }
                    throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
                }
                throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
            }
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
    }
}
