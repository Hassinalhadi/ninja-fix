package com.clevertap.android.sdk.cryption;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.db.Column;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u0007H\u0002J0\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/clevertap/android/sdk/cryption/AESGCMCrypt;", "Lcom/clevertap/android/sdk/cryption/Crypt;", "ctKeyGenerator", "Lcom/clevertap/android/sdk/cryption/CTKeyGenerator;", "<init>", "(Lcom/clevertap/android/sdk/cryption/CTKeyGenerator;)V", "encryptInternal", "", "plainText", "decryptInternal", "cipherText", "parseCipherText", "Lcom/clevertap/android/sdk/cryption/AESGCMCrypt$AESGCMCryptResult;", "performCryptOperation", "mode", "", Column.DATA, "", "iv", "secretKey", "Ljavax/crypto/SecretKey;", "AESGCMCryptResult", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AESGCMCrypt extends Crypt {

    @NotNull
    private final CTKeyGenerator ctKeyGenerator;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/clevertap/android/sdk/cryption/AESGCMCrypt$AESGCMCryptResult;", "", "iv", "", "encryptedBytes", "<init>", "([B[B)V", "getIv", "()[B", "getEncryptedBytes", "equals", "", "other", "hashCode", "", "component1", "component2", Constants.COPY_TYPE, "toString", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class AESGCMCryptResult {

        @NotNull
        private final byte[] encryptedBytes;

        @NotNull
        private final byte[] iv;

        public AESGCMCryptResult(@NotNull byte[] iv, @NotNull byte[] encryptedBytes) {
            Intrinsics.echo(iv, "iv");
            Intrinsics.echo(encryptedBytes, "encryptedBytes");
            this.iv = iv;
            this.encryptedBytes = encryptedBytes;
        }

        public static /* synthetic */ AESGCMCryptResult copy$default(AESGCMCryptResult aESGCMCryptResult, byte[] bArr, byte[] bArr2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                bArr = aESGCMCryptResult.iv;
            }
            if ((i4 & 2) != 0) {
                bArr2 = aESGCMCryptResult.encryptedBytes;
            }
            return aESGCMCryptResult.copy(bArr, bArr2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final byte[] getIv() {
            return this.iv;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final byte[] getEncryptedBytes() {
            return this.encryptedBytes;
        }

        @NotNull
        public final AESGCMCryptResult copy(@NotNull byte[] iv, @NotNull byte[] encryptedBytes) {
            Intrinsics.echo(iv, "iv");
            Intrinsics.echo(encryptedBytes, "encryptedBytes");
            return new AESGCMCryptResult(iv, encryptedBytes);
        }

        public boolean equals(@Nullable Object other) {
            Class<?> cls;
            if (this == other) {
                return true;
            }
            if (other != null) {
                cls = other.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual(AESGCMCryptResult.class, cls)) {
                return false;
            }
            Intrinsics.charlie(other, "null cannot be cast to non-null type com.clevertap.android.sdk.cryption.AESGCMCrypt.AESGCMCryptResult");
            AESGCMCryptResult aESGCMCryptResult = (AESGCMCryptResult) other;
            if (Arrays.equals(this.iv, aESGCMCryptResult.iv) && Arrays.equals(this.encryptedBytes, aESGCMCryptResult.encryptedBytes)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final byte[] getEncryptedBytes() {
            return this.encryptedBytes;
        }

        @NotNull
        public final byte[] getIv() {
            return this.iv;
        }

        public int hashCode() {
            return Arrays.hashCode(this.encryptedBytes) + (Arrays.hashCode(this.iv) * 31);
        }

        @NotNull
        public String toString() {
            return "AESGCMCryptResult(iv=" + Arrays.toString(this.iv) + ", encryptedBytes=" + Arrays.toString(this.encryptedBytes) + ')';
        }
    }

    public AESGCMCrypt(@NotNull CTKeyGenerator ctKeyGenerator) {
        Intrinsics.echo(ctKeyGenerator, "ctKeyGenerator");
        this.ctKeyGenerator = ctKeyGenerator;
    }

    private final AESGCMCryptResult parseCipherText(String cipherText) {
        try {
            List maroon = StringsKt.maroon(StringsKt.magenta(StringsKt.lime(cipherText, Constants.AES_GCM_PREFIX), Constants.AES_GCM_SUFFIX), new String[]{":"}, 6);
            return new AESGCMCryptResult(CryptExtensionsKt.fromBase64((String) maroon.get(0)), CryptExtensionsKt.fromBase64((String) maroon.get(1)));
        } catch (Exception e) {
            Logger.v("Error parsing cipherText", e);
            return null;
        }
    }

    public static /* synthetic */ AESGCMCryptResult performCryptOperation$default(AESGCMCrypt aESGCMCrypt, int i4, byte[] bArr, byte[] bArr2, SecretKey secretKey, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            bArr2 = null;
        }
        if ((i5 & 8) != 0) {
            secretKey = aESGCMCrypt.ctKeyGenerator.generateOrGetKey();
        }
        return aESGCMCrypt.performCryptOperation(i4, bArr, bArr2, secretKey);
    }

    @Override // com.clevertap.android.sdk.cryption.Crypt
    @Nullable
    public String decryptInternal(@NotNull String cipherText) {
        Intrinsics.echo(cipherText, "cipherText");
        AESGCMCryptResult parseCipherText = parseCipherText(cipherText);
        if (parseCipherText != null) {
            AESGCMCryptResult performCryptOperation$default = performCryptOperation$default(this, 2, parseCipherText.getEncryptedBytes(), parseCipherText.getIv(), null, 8, null);
            if (performCryptOperation$default != null) {
                byte[] encryptedBytes = performCryptOperation$default.getEncryptedBytes();
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.delta(UTF_8, "UTF_8");
                return new String(encryptedBytes, UTF_8);
            }
            return null;
        }
        return null;
    }

    @Override // com.clevertap.android.sdk.cryption.Crypt
    @Nullable
    public String encryptInternal(@NotNull String plainText) {
        Intrinsics.echo(plainText, "plainText");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.delta(UTF_8, "UTF_8");
        byte[] bytes = plainText.getBytes(UTF_8);
        Intrinsics.delta(bytes, "getBytes(...)");
        AESGCMCryptResult performCryptOperation$default = performCryptOperation$default(this, 1, bytes, null, null, 12, null);
        if (performCryptOperation$default != null) {
            return Constants.AES_GCM_PREFIX + CryptExtensionsKt.toBase64(performCryptOperation$default.getIv()) + ':' + CryptExtensionsKt.toBase64(performCryptOperation$default.getEncryptedBytes()) + Constants.AES_GCM_SUFFIX;
        }
        return null;
    }

    @Nullable
    public final AESGCMCryptResult performCryptOperation(int mode, @NotNull byte[] data, @Nullable byte[] iv, @Nullable SecretKey secretKey) {
        Intrinsics.echo(data, "data");
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            if (mode != 1) {
                if (mode != 2) {
                    Logger.v("Invalid mode used");
                    return null;
                }
                if (iv != null) {
                    cipher.init(mode, secretKey, new GCMParameterSpec(128, iv));
                    byte[] doFinal = cipher.doFinal(data);
                    Intrinsics.checkNotNull(doFinal);
                    return new AESGCMCryptResult(iv, doFinal);
                }
                Logger.v("IV is required for decryption");
                return null;
            }
            cipher.init(mode, secretKey);
            byte[] iv2 = cipher.getIV();
            byte[] doFinal2 = cipher.doFinal(data);
            Intrinsics.checkNotNull(iv2);
            Intrinsics.checkNotNull(doFinal2);
            return new AESGCMCryptResult(iv2, doFinal2);
        } catch (Exception e) {
            Logger.v("Error performing crypt operation", e);
            return null;
        }
    }
}
