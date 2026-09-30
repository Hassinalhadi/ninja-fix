package com.clevertap.android.sdk.cryption;

import Qd.a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2708l7;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J$\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/clevertap/android/sdk/cryption/CryptHandler;", "", CleverTapInstanceConfig.KEY_ENCRYPTION_LEVEL, "Lcom/clevertap/android/sdk/cryption/EncryptionLevel;", "accountID", "", "repository", "Lcom/clevertap/android/sdk/cryption/CryptRepository;", "cryptFactory", "Lcom/clevertap/android/sdk/cryption/CryptFactory;", "<init>", "(Lcom/clevertap/android/sdk/cryption/EncryptionLevel;Ljava/lang/String;Lcom/clevertap/android/sdk/cryption/CryptRepository;Lcom/clevertap/android/sdk/cryption/CryptFactory;)V", "encrypt", "plainText", Constants.KEY_KEY, "algorithm", "Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;", "decrypt", "cipherText", "updateMigrationFailureCount", "", "migrationSuccessful", "", "EncryptionAlgorithm", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CryptHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String accountID;

    @NotNull
    private final CryptFactory cryptFactory;

    @NotNull
    private final EncryptionLevel encryptionLevel;

    @NotNull
    private final CryptRepository repository;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/cryption/CryptHandler$Companion;", "", "<init>", "()V", "isTextEncrypted", "", "plainText", "", "isTextAESEncrypted", "isTextAESGCMEncrypted", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isTextAESEncrypted(@NotNull String plainText) {
            Intrinsics.echo(plainText, "plainText");
            if (!r.quebec(plainText, Constants.AES_PREFIX, false) || !r.golf(plainText, Constants.AES_SUFFIX, false)) {
                return false;
            }
            return true;
        }

        public final boolean isTextAESGCMEncrypted(@NotNull String plainText) {
            Intrinsics.echo(plainText, "plainText");
            if (!r.quebec(plainText, Constants.AES_GCM_PREFIX, false) || !r.golf(plainText, Constants.AES_GCM_SUFFIX, false)) {
                return false;
            }
            return true;
        }

        public final boolean isTextEncrypted(@NotNull String plainText) {
            Intrinsics.echo(plainText, "plainText");
            if (!isTextAESEncrypted(plainText) && !isTextAESGCMEncrypted(plainText)) {
                return false;
            }
            return true;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/cryption/CryptHandler$EncryptionAlgorithm;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AES", "AES_GCM", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class EncryptionAlgorithm extends Enum<EncryptionAlgorithm> {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ EncryptionAlgorithm[] $VALUES;
        public static final EncryptionAlgorithm AES = new EncryptionAlgorithm("AES", 0, 0);
        public static final EncryptionAlgorithm AES_GCM = new EncryptionAlgorithm("AES_GCM", 1, 1);
        private final int value;

        private static final /* synthetic */ EncryptionAlgorithm[] $values() {
            return new EncryptionAlgorithm[]{AES, AES_GCM};
        }

        static {
            EncryptionAlgorithm[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC2708l7.bravo($values);
        }

        private EncryptionAlgorithm(String str, int i4, int i5) {
            super(str, i4);
            this.value = i5;
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static EncryptionAlgorithm valueOf(String str) {
            return (EncryptionAlgorithm) Enum.valueOf(EncryptionAlgorithm.class, str);
        }

        public static EncryptionAlgorithm[] values() {
            return (EncryptionAlgorithm[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EncryptionLevel.values().length];
            try {
                iArr[EncryptionLevel.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CryptHandler(@NotNull EncryptionLevel encryptionLevel, @NotNull String accountID, @NotNull CryptRepository repository, @NotNull CryptFactory cryptFactory) {
        Intrinsics.echo(encryptionLevel, "encryptionLevel");
        Intrinsics.echo(accountID, "accountID");
        Intrinsics.echo(repository, "repository");
        Intrinsics.echo(cryptFactory, "cryptFactory");
        this.encryptionLevel = encryptionLevel;
        this.accountID = accountID;
        this.repository = repository;
        this.cryptFactory = cryptFactory;
    }

    public static /* synthetic */ String decrypt$default(CryptHandler cryptHandler, String str, String str2, EncryptionAlgorithm encryptionAlgorithm, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            encryptionAlgorithm = EncryptionAlgorithm.AES_GCM;
        }
        return cryptHandler.decrypt(str, str2, encryptionAlgorithm);
    }

    public static /* synthetic */ String encrypt$default(CryptHandler cryptHandler, String str, String str2, EncryptionAlgorithm encryptionAlgorithm, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            encryptionAlgorithm = EncryptionAlgorithm.AES_GCM;
        }
        return cryptHandler.encrypt(str, str2, encryptionAlgorithm);
    }

    public static final boolean isTextEncrypted(@NotNull String str) {
        return INSTANCE.isTextEncrypted(str);
    }

    @Nullable
    public final String decrypt(@NotNull String cipherText) {
        Intrinsics.echo(cipherText, "cipherText");
        return decrypt$default(this, cipherText, null, 2, null);
    }

    @Nullable
    public final String encrypt(@NotNull String plainText, @NotNull String key) {
        Intrinsics.echo(plainText, "plainText");
        Intrinsics.echo(key, "key");
        return encrypt$default(this, plainText, key, null, 4, null);
    }

    public final void updateMigrationFailureCount(boolean migrationSuccessful) {
        this.repository.updateMigrationFailureCount(migrationSuccessful);
    }

    @Nullable
    public final String decrypt(@NotNull String cipherText, @NotNull String key) {
        Intrinsics.echo(cipherText, "cipherText");
        Intrinsics.echo(key, "key");
        return decrypt$default(this, cipherText, key, null, 4, null);
    }

    @Nullable
    public final String encrypt(@NotNull String plainText, @NotNull String r4, @NotNull EncryptionAlgorithm algorithm) {
        Intrinsics.echo(plainText, "plainText");
        Intrinsics.echo(r4, "key");
        Intrinsics.echo(algorithm, "algorithm");
        if (INSTANCE.isTextEncrypted(plainText)) {
            return plainText;
        }
        return (WhenMappings.$EnumSwitchMapping$0[this.encryptionLevel.ordinal()] == 1 && Constants.MEDIUM_CRYPT_KEYS.contains(r4)) ? this.cryptFactory.getCryptInstance(algorithm).encryptInternal(plainText) : plainText;
    }

    public static /* synthetic */ String decrypt$default(CryptHandler cryptHandler, String str, EncryptionAlgorithm encryptionAlgorithm, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            encryptionAlgorithm = EncryptionAlgorithm.AES_GCM;
        }
        return cryptHandler.decrypt(str, encryptionAlgorithm);
    }

    public static /* synthetic */ String encrypt$default(CryptHandler cryptHandler, String str, EncryptionAlgorithm encryptionAlgorithm, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            encryptionAlgorithm = EncryptionAlgorithm.AES_GCM;
        }
        return cryptHandler.encrypt(str, encryptionAlgorithm);
    }

    @Nullable
    public final String decrypt(@NotNull String cipherText, @NotNull String r4, @NotNull EncryptionAlgorithm algorithm) {
        Intrinsics.echo(cipherText, "cipherText");
        Intrinsics.echo(r4, "key");
        Intrinsics.echo(algorithm, "algorithm");
        if (!INSTANCE.isTextEncrypted(cipherText)) {
            return cipherText;
        }
        Crypt cryptInstance = this.cryptFactory.getCryptInstance(algorithm);
        if (WhenMappings.$EnumSwitchMapping$0[this.encryptionLevel.ordinal()] == 1) {
            return Constants.MEDIUM_CRYPT_KEYS.contains(r4) ? cryptInstance.decryptInternal(cipherText) : cipherText;
        }
        return cryptInstance.decryptInternal(cipherText);
    }

    @Nullable
    public final String encrypt(@NotNull String plainText, @NotNull EncryptionAlgorithm algorithm) {
        Intrinsics.echo(plainText, "plainText");
        Intrinsics.echo(algorithm, "algorithm");
        return this.cryptFactory.getCryptInstance(algorithm).encryptInternal(plainText);
    }

    @Nullable
    public final String decrypt(@NotNull String cipherText, @NotNull EncryptionAlgorithm algorithm) {
        Intrinsics.echo(cipherText, "cipherText");
        Intrinsics.echo(algorithm, "algorithm");
        return this.cryptFactory.getCryptInstance(algorithm).decryptInternal(cipherText);
    }
}
