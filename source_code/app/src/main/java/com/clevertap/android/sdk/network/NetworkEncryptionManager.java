package com.clevertap.android.sdk.network;

import android.util.Base64;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.cryption.AESGCMCrypt;
import com.clevertap.android.sdk.cryption.CTKeyGenerator;
import com.clevertap.android.sdk.network.api.EncryptedResponseBody;
import com.clevertap.android.sdk.network.api.EncryptionFailure;
import com.clevertap.android.sdk.network.api.EncryptionResult;
import com.clevertap.android.sdk.network.api.EncryptionSuccess;
import java.nio.charset.Charset;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0013\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\rJ\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/clevertap/android/sdk/network/NetworkEncryptionManager;", "", "keyGenerator", "Lcom/clevertap/android/sdk/cryption/CTKeyGenerator;", "aesgcm", "Lcom/clevertap/android/sdk/cryption/AESGCMCrypt;", "<init>", "(Lcom/clevertap/android/sdk/cryption/CTKeyGenerator;Lcom/clevertap/android/sdk/cryption/AESGCMCrypt;)V", "sessionKeyForEncryption", "Ljavax/crypto/SecretKey;", "sessionKeyBytes", "", "sessionEncryptionKey", "", "kotlin.jvm.PlatformType", "()Ljava/lang/String;", "encryptResponse", "Lcom/clevertap/android/sdk/network/api/EncryptionResult;", "response", "decryptResponse", "bodyString", "convertByteArrayToString", "arr", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkEncryptionManager {

    @NotNull
    private static final Object lock = new Object();

    @Nullable
    private static volatile SecretKey sessionKey;

    @NotNull
    private final AESGCMCrypt aesgcm;

    @NotNull
    private final CTKeyGenerator keyGenerator;

    public NetworkEncryptionManager(@NotNull CTKeyGenerator keyGenerator, @NotNull AESGCMCrypt aesgcm) {
        Intrinsics.echo(keyGenerator, "keyGenerator");
        Intrinsics.echo(aesgcm, "aesgcm");
        this.keyGenerator = keyGenerator;
        this.aesgcm = aesgcm;
    }

    private final String convertByteArrayToString(byte[] arr) {
        String encodeToString = Base64.encodeToString(arr, 2);
        Intrinsics.delta(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    private final byte[] sessionKeyBytes() {
        byte[] encoded = sessionKeyForEncryption().getEncoded();
        Intrinsics.delta(encoded, "getEncoded(...)");
        return encoded;
    }

    private final SecretKey sessionKeyForEncryption() {
        if (sessionKey == null) {
            synchronized (lock) {
                if (sessionKey == null) {
                    sessionKey = this.keyGenerator.generateSecretKey();
                }
            }
        }
        SecretKey secretKey = sessionKey;
        Intrinsics.checkNotNull(secretKey);
        return secretKey;
    }

    @NotNull
    public final EncryptionResult decryptResponse(@NotNull String bodyString) {
        Intrinsics.echo(bodyString, "bodyString");
        try {
            EncryptedResponseBody fromJsonString = EncryptedResponseBody.INSTANCE.fromJsonString(bodyString);
            String encryptedPayload = fromJsonString.getEncryptedPayload();
            String iv = fromJsonString.getIv();
            byte[] decode = Base64.decode(encryptedPayload, 2);
            byte[] decode2 = Base64.decode(iv, 2);
            AESGCMCrypt aESGCMCrypt = this.aesgcm;
            Intrinsics.checkNotNull(decode);
            AESGCMCrypt.AESGCMCryptResult performCryptOperation = aESGCMCrypt.performCryptOperation(2, decode, decode2, sessionKeyForEncryption());
            if (performCryptOperation != null) {
                byte[] encryptedBytes = performCryptOperation.getEncryptedBytes();
                Charset charset = a.alpha;
                return new EncryptionSuccess(new String(encryptedBytes, charset), new String(performCryptOperation.getIv(), charset));
            }
            return EncryptionFailure.INSTANCE;
        } catch (Exception e) {
            Logger.v("Error decrypting response", e);
            return EncryptionFailure.INSTANCE;
        }
    }

    @NotNull
    public final EncryptionResult encryptResponse(@NotNull String response) {
        Intrinsics.echo(response, "response");
        AESGCMCrypt aESGCMCrypt = this.aesgcm;
        byte[] bytes = response.getBytes(a.alpha);
        Intrinsics.delta(bytes, "getBytes(...)");
        AESGCMCrypt.AESGCMCryptResult performCryptOperation = aESGCMCrypt.performCryptOperation(1, bytes, null, sessionKeyForEncryption());
        if (performCryptOperation != null) {
            return new EncryptionSuccess(convertByteArrayToString(performCryptOperation.getEncryptedBytes()), convertByteArrayToString(performCryptOperation.getIv()));
        }
        return EncryptionFailure.INSTANCE;
    }

    public final String sessionEncryptionKey() {
        return Base64.encodeToString(sessionKeyBytes(), 2);
    }
}
