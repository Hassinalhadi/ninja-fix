package com.clevertap.android.sdk.cryption;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u0003H\u0002J$\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/clevertap/android/sdk/cryption/AESCrypt;", "Lcom/clevertap/android/sdk/cryption/Crypt;", "accountID", "", "<init>", "(Ljava/lang/String;)V", "keyPassword", "encryptInternal", "plainText", "decryptInternal", "cipherText", "parseCipherText", "", "performCryptOperation", "mode", "", "password", Constants.KEY_TEXT, "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AESCrypt extends Crypt {

    @NotNull
    private final String keyPassword;

    @NotNull
    private static final String APP_ID_KEY_PREFIX = "Lq3fz";

    @NotNull
    private static final String APP_ID_KEY_SUFFIX = "bLti2";

    public AESCrypt(@NotNull String accountID) {
        Intrinsics.echo(accountID, "accountID");
        this.keyPassword = APP_ID_KEY_PREFIX + accountID + APP_ID_KEY_SUFFIX;
    }

    private final byte[] parseCipherText(String cipherText) {
        try {
            String substring = cipherText.substring(1, cipherText.length() - 1);
            Intrinsics.delta(substring, "substring(...)");
            List hotel = new Regex("\\s*,\\s*").hotel(StringsKt.b(substring).toString());
            byte[] bArr = new byte[hotel.size()];
            int size = hotel.size();
            for (int i4 = 0; i4 < size; i4++) {
                bArr[i4] = Byte.parseByte((String) hotel.get(i4));
            }
            return bArr;
        } catch (Exception e) {
            Logger.v("Unable to parse cipher text", e);
            return null;
        }
    }

    private final byte[] performCryptOperation(int mode, String password, byte[] text) {
        try {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.delta(UTF_8, "UTF_8");
            byte[] bytes = Constants.CRYPTION_SALT.getBytes(UTF_8);
            Intrinsics.delta(bytes, "getBytes(...)");
            Intrinsics.delta(UTF_8, "UTF_8");
            byte[] bytes2 = Constants.CRYPTION_IV.getBytes(UTF_8);
            Intrinsics.delta(bytes2, "getBytes(...)");
            char[] charArray = password.toCharArray();
            Intrinsics.delta(charArray, "toCharArray(...)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWithMD5And128BitAES-CBC-OpenSSL").generateSecret(new PBEKeySpec(charArray, bytes, 1000, Barcode.FORMAT_QR_CODE)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(mode, secretKeySpec, new IvParameterSpec(bytes2));
            return cipher.doFinal(text);
        } catch (Exception e) {
            Logger.v("Unable to perform crypt operation", e);
            return null;
        }
    }

    @Override // com.clevertap.android.sdk.cryption.Crypt
    @Nullable
    public String decryptInternal(@NotNull String cipherText) {
        byte[] performCryptOperation;
        Intrinsics.echo(cipherText, "cipherText");
        byte[] parseCipherText = parseCipherText(cipherText);
        if (parseCipherText != null && (performCryptOperation = performCryptOperation(2, this.keyPassword, parseCipherText)) != null) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.delta(UTF_8, "UTF_8");
            return new String(performCryptOperation, UTF_8);
        }
        return null;
    }

    @Override // com.clevertap.android.sdk.cryption.Crypt
    @Nullable
    public String encryptInternal(@NotNull String plainText) {
        Intrinsics.echo(plainText, "plainText");
        String str = this.keyPassword;
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.delta(UTF_8, "UTF_8");
        byte[] bytes = plainText.getBytes(UTF_8);
        Intrinsics.delta(bytes, "getBytes(...)");
        byte[] performCryptOperation = performCryptOperation(1, str, bytes);
        if (performCryptOperation != null) {
            String arrays = Arrays.toString(performCryptOperation);
            Intrinsics.delta(arrays, "toString(...)");
            return arrays;
        }
        return null;
    }
}
