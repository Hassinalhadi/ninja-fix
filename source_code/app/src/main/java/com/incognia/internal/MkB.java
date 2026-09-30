package com.incognia.internal;

import android.security.keystore.KeyGenParameterSpec;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.spec.ECGenParameterSpec;
import javax.crypto.KeyGenerator;
import kotlin.text.a;

/* loaded from: classes2.dex */
public final class MkB {

    /* renamed from: W, reason: collision with root package name */
    public static final String f9167W = (String) wGk.hyF.getValue();

    /* renamed from: b, reason: collision with root package name */
    public final KeyStore f9168b;

    public MkB() {
        KeyStore keyStore;
        try {
            keyStore = KeyStore.getInstance(f9167W);
        } catch (KeyStoreException unused) {
            keyStore = null;
        }
        this.f9168b = keyStore;
    }

    public static void b(MkB mkB, String str) {
        KeyGenParameterSpec.Builder invalidatedByBiometricEnrollment;
        try {
            if (CnH.b(CnH.f8484b, 24, 0, 2)) {
                invalidatedByBiometricEnrollment = new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setUserAuthenticationRequired(true).setInvalidatedByBiometricEnrollment(true);
                KeyGenParameterSpec build = invalidatedByBiometricEnrollment.build();
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", f9167W);
                keyGenerator.init(build);
                keyGenerator.generateKey();
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(String str, String str2) {
        KeyGenParameterSpec.Builder attestationChallenge;
        if (CnH.b(CnH.f8484b, 24, 0, 2)) {
            attestationChallenge = new KeyGenParameterSpec.Builder(str, 12).setAlgorithmParameterSpec(new ECGenParameterSpec((String) wGk.CD.getValue())).setDigests("SHA-256").setKeySize(Barcode.FORMAT_QR_CODE).setAttestationChallenge(str2.getBytes(a.alpha));
            KeyGenParameterSpec build = attestationChallenge.build();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", f9167W);
            keyPairGenerator.initialize(build);
            keyPairGenerator.generateKeyPair();
        }
    }
}
