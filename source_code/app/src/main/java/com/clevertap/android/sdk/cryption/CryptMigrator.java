package com.clevertap.android.sdk.cryption;

import Q0.c;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ILogger;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.utils.JsonUtilsKt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k4.C2007a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0080\b\u0018\u0000 22\u00020\u0001:\u00012B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0003H\u0002J \u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002J\u0018\u0010#\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002J\u0018\u0010$\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002J\u0010\u0010%\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010&\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002J\t\u0010'\u001a\u00020\u0003HÂ\u0003J\t\u0010(\u001a\u00020\u0005HÂ\u0003J\t\u0010)\u001a\u00020\u0007HÂ\u0003J\t\u0010*\u001a\u00020\tHÂ\u0003J\t\u0010+\u001a\u00020\u000bHÂ\u0003J\t\u0010,\u001a\u00020\rHÂ\u0003JE\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010.\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0005HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/clevertap/android/sdk/cryption/CryptMigrator;", "", "logPrefix", "", "configEncryptionLevel", "", "logger", "Lcom/clevertap/android/sdk/ILogger;", "cryptHandler", "Lcom/clevertap/android/sdk/cryption/CryptHandler;", "cryptRepository", "Lcom/clevertap/android/sdk/cryption/CryptRepository;", "dataMigrationRepository", "Lcom/clevertap/android/sdk/cryption/DataMigrationRepository;", "<init>", "(Ljava/lang/String;ILcom/clevertap/android/sdk/ILogger;Lcom/clevertap/android/sdk/cryption/CryptHandler;Lcom/clevertap/android/sdk/cryption/CryptRepository;Lcom/clevertap/android/sdk/cryption/DataMigrationRepository;)V", "migrateEncryption", "", "handleAllMigrations", "", "encrypt", "firstUpgrade", "migrateCachedGuidsKeyPref", "migrateFormatForCachedGuidsKeyPref", "Lorg/json/JSONObject;", "migrateDBProfile", "migrateInAppData", "performMigrationStep", "Lcom/clevertap/android/sdk/cryption/MigrationResult;", Column.DATA, "transitionEncryptionState", "currentState", "Lcom/clevertap/android/sdk/cryption/EncryptionState;", "targetState", "handleEncryptedAesTransition", "handleEncryptedAesGcmTransition", "handlePlainTextTransition", "getFinalEncryptionState", "getCurrentEncryptionState", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CryptMigrator {

    @NotNull
    public static final String MIGRATION_FAILURE_COUNT_KEY = "encryptionMigrationFailureCount";
    public static final int MIGRATION_FIRST_UPGRADE = -1;
    public static final int MIGRATION_NEEDED = 1;
    public static final int MIGRATION_NOT_NEEDED = 0;

    @NotNull
    public static final String SS_IN_APP_MIGRATED = "ssInAppMigrated";
    public static final int UNKNOWN_LEVEL = -1;
    private final int configEncryptionLevel;

    @NotNull
    private final CryptHandler cryptHandler;

    @NotNull
    private final CryptRepository cryptRepository;

    @NotNull
    private final DataMigrationRepository dataMigrationRepository;

    @NotNull
    private final String logPrefix;

    @NotNull
    private final ILogger logger;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EncryptionState.values().length];
            try {
                iArr[EncryptionState.ENCRYPTED_AES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EncryptionState.ENCRYPTED_AES_GCM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EncryptionState.PLAIN_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CryptMigrator(@NotNull String logPrefix, int i4, @NotNull ILogger logger, @NotNull CryptHandler cryptHandler, @NotNull CryptRepository cryptRepository, @NotNull DataMigrationRepository dataMigrationRepository) {
        Intrinsics.echo(logPrefix, "logPrefix");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(cryptHandler, "cryptHandler");
        Intrinsics.echo(cryptRepository, "cryptRepository");
        Intrinsics.echo(dataMigrationRepository, "dataMigrationRepository");
        this.logPrefix = logPrefix;
        this.configEncryptionLevel = i4;
        this.logger = logger;
        this.cryptHandler = cryptHandler;
        this.cryptRepository = cryptRepository;
        this.dataMigrationRepository = dataMigrationRepository;
    }

    /* renamed from: component1, reason: from getter */
    private final String getLogPrefix() {
        return this.logPrefix;
    }

    /* renamed from: component2, reason: from getter */
    private final int getConfigEncryptionLevel() {
        return this.configEncryptionLevel;
    }

    /* renamed from: component3, reason: from getter */
    private final ILogger getLogger() {
        return this.logger;
    }

    /* renamed from: component4, reason: from getter */
    private final CryptHandler getCryptHandler() {
        return this.cryptHandler;
    }

    /* renamed from: component5, reason: from getter */
    private final CryptRepository getCryptRepository() {
        return this.cryptRepository;
    }

    /* renamed from: component6, reason: from getter */
    private final DataMigrationRepository getDataMigrationRepository() {
        return this.dataMigrationRepository;
    }

    public static /* synthetic */ CryptMigrator copy$default(CryptMigrator cryptMigrator, String str, int i4, ILogger iLogger, CryptHandler cryptHandler, CryptRepository cryptRepository, DataMigrationRepository dataMigrationRepository, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = cryptMigrator.logPrefix;
        }
        if ((i5 & 2) != 0) {
            i4 = cryptMigrator.configEncryptionLevel;
        }
        if ((i5 & 4) != 0) {
            iLogger = cryptMigrator.logger;
        }
        if ((i5 & 8) != 0) {
            cryptHandler = cryptMigrator.cryptHandler;
        }
        if ((i5 & 16) != 0) {
            cryptRepository = cryptMigrator.cryptRepository;
        }
        if ((i5 & 32) != 0) {
            dataMigrationRepository = cryptMigrator.dataMigrationRepository;
        }
        CryptRepository cryptRepository2 = cryptRepository;
        DataMigrationRepository dataMigrationRepository2 = dataMigrationRepository;
        return cryptMigrator.copy(str, i4, iLogger, cryptHandler, cryptRepository2, dataMigrationRepository2);
    }

    private final EncryptionState getCurrentEncryptionState(String data) {
        CryptHandler.Companion companion = CryptHandler.INSTANCE;
        if (companion.isTextAESEncrypted(data)) {
            return EncryptionState.ENCRYPTED_AES;
        }
        if (companion.isTextAESGCMEncrypted(data)) {
            return EncryptionState.ENCRYPTED_AES_GCM;
        }
        return EncryptionState.PLAIN_TEXT;
    }

    private final EncryptionState getFinalEncryptionState(boolean encrypt) {
        if (encrypt) {
            return EncryptionState.ENCRYPTED_AES_GCM;
        }
        return EncryptionState.PLAIN_TEXT;
    }

    private final boolean handleAllMigrations(boolean encrypt, boolean firstUpgrade) {
        boolean migrateCachedGuidsKeyPref = migrateCachedGuidsKeyPref(encrypt, firstUpgrade);
        boolean migrateDBProfile = migrateDBProfile(encrypt);
        boolean migrateInAppData = migrateInAppData();
        if (migrateCachedGuidsKeyPref && migrateDBProfile && migrateInAppData) {
            return true;
        }
        return false;
    }

    private final MigrationResult handleEncryptedAesGcmTransition(EncryptionState targetState, String data) {
        boolean z2;
        String decrypt = this.cryptHandler.decrypt(data, CryptHandler.EncryptionAlgorithm.AES_GCM);
        if (WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()] == 3) {
            if (decrypt != null) {
                data = decrypt;
            }
            if (decrypt != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new MigrationResult(data, z2);
        }
        this.logger.verbose(this.logPrefix, "Invalid transition from ENCRYPTED_AES_GCM to " + targetState);
        return MigrationResult.INSTANCE.failure(data);
    }

    private final MigrationResult handleEncryptedAesTransition(EncryptionState targetState, String data) {
        String str;
        String str2;
        String decrypt = this.cryptHandler.decrypt(data, CryptHandler.EncryptionAlgorithm.AES);
        int i4 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        boolean z2 = false;
        if (i4 != 2) {
            if (i4 != 3) {
                this.logger.verbose(this.logPrefix, "Invalid transition from ENCRYPTED_AES to " + targetState);
                return MigrationResult.INSTANCE.failure(data);
            }
            if (decrypt != null) {
                data = decrypt;
            }
            if (decrypt != null) {
                z2 = true;
            }
            return new MigrationResult(data, z2);
        }
        if (decrypt != null) {
            str = this.cryptHandler.encrypt(decrypt, CryptHandler.EncryptionAlgorithm.AES_GCM);
        } else {
            str = null;
        }
        if (str == null) {
            str2 = decrypt;
        } else {
            str2 = str;
        }
        if (str != null || decrypt == null) {
            z2 = true;
        }
        return new MigrationResult(str2, z2);
    }

    private final MigrationResult handlePlainTextTransition(EncryptionState targetState, String data) {
        boolean z2;
        if (WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()] == 2) {
            String encrypt = this.cryptHandler.encrypt(data, CryptHandler.EncryptionAlgorithm.AES_GCM);
            if (encrypt != null) {
                data = encrypt;
            }
            if (encrypt != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new MigrationResult(data, z2);
        }
        this.logger.verbose(this.logPrefix, "Invalid transition from PLAIN_TEXT to " + targetState);
        return MigrationResult.INSTANCE.failure(data);
    }

    private final boolean migrateCachedGuidsKeyPref(boolean encrypt, boolean firstUpgrade) {
        String cachedGuidString;
        this.logger.verbose(this.logPrefix, "Migrating encryption level for cachedGUIDsKey prefs");
        if (firstUpgrade) {
            JSONObject migrateFormatForCachedGuidsKeyPref = migrateFormatForCachedGuidsKeyPref();
            int length = migrateFormatForCachedGuidsKeyPref.length();
            this.dataMigrationRepository.saveCachedGuidJsonLength(length);
            if (length == 0) {
                this.dataMigrationRepository.removeCachedGuidJson();
                return true;
            }
            cachedGuidString = migrateFormatForCachedGuidsKeyPref.toString();
            Intrinsics.checkNotNull(cachedGuidString);
        } else {
            cachedGuidString = this.dataMigrationRepository.cachedGuidString();
            if (cachedGuidString == null) {
                return true;
            }
        }
        MigrationResult performMigrationStep = performMigrationStep(encrypt, cachedGuidString);
        this.dataMigrationRepository.saveCachedGuidJson(performMigrationStep.getData());
        this.logger.verbose(this.logPrefix, "Cached GUIDs migrated with success = " + performMigrationStep + ".migrationSuccessful = " + performMigrationStep.getData());
        return performMigrationStep.getMigrationSuccessful();
    }

    private final boolean migrateDBProfile(boolean encrypt) {
        this.logger.verbose(this.logPrefix, "Migrating encryption level for user profiles in DB");
        boolean z2 = true;
        for (Map.Entry<String, JSONObject> entry : this.dataMigrationRepository.userProfilesInAccount().entrySet()) {
            String key = entry.getKey();
            JSONObject value = entry.getValue();
            try {
                HashSet<String> piiDBKeys = Constants.piiDBKeys;
                Intrinsics.delta(piiDBKeys, "piiDBKeys");
                for (String str : piiDBKeys) {
                    Intrinsics.checkNotNull(str);
                    String stringOrNull = JsonUtilsKt.getStringOrNull(value, str);
                    if (stringOrNull != null) {
                        MigrationResult performMigrationStep = performMigrationStep(encrypt, stringOrNull);
                        if (z2 && performMigrationStep.getMigrationSuccessful()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        value.put(str, performMigrationStep.getData());
                    }
                }
                this.logger.verbose(this.logPrefix, "DB migrated with success = " + z2 + " = " + value);
            } catch (Exception e) {
                this.logger.verbose(this.logPrefix, "Error migrating profile " + key + ": " + e);
            }
            if (this.dataMigrationRepository.saveUserProfile(key, value) <= -1) {
                z2 = false;
            }
        }
        return z2;
    }

    private final JSONObject migrateFormatForCachedGuidsKeyPref() {
        JSONObject cachedGuidJsonObject = this.dataMigrationRepository.cachedGuidJsonObject();
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> keys = cachedGuidJsonObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Intrinsics.checkNotNull(next);
                List maroon = StringsKt.maroon(next, new String[]{"_"}, 2);
                String str = (String) maroon.get(0);
                MigrationResult performMigrationStep = performMigrationStep(false, (String) maroon.get(1));
                if (performMigrationStep.getMigrationSuccessful()) {
                    jSONObject.put(str + '_' + performMigrationStep.getData(), cachedGuidJsonObject.get(next));
                }
            }
        } catch (Throwable th) {
            this.logger.verbose(this.logPrefix, "Error migrating format for cached GUIDs: Clearing and starting fresh " + th);
        }
        return jSONObject;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.q, java.lang.Object] */
    private final boolean migrateInAppData() {
        this.logger.verbose(this.logPrefix, "Migrating encryption for InAppData");
        ?? obj = new Object();
        obj.alpha = true;
        C2007a c2007a = new C2007a(10, this, obj);
        this.dataMigrationRepository.inAppDataFiles(CollectionsKt.listOf("inapp_notifs_cs", Constants.INAPP_KEY), c2007a);
        return obj.alpha;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateInAppData$lambda$2(CryptMigrator this$0, q migrationSuccessful, String spData) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(migrationSuccessful, "$migrationSuccessful");
        Intrinsics.echo(spData, "spData");
        boolean z2 = true;
        MigrationResult performMigrationStep = this$0.performMigrationStep(true, spData);
        if (!migrationSuccessful.alpha || !performMigrationStep.getMigrationSuccessful()) {
            z2 = false;
        }
        migrationSuccessful.alpha = z2;
        return performMigrationStep.getData();
    }

    private final MigrationResult performMigrationStep(boolean encrypt, String data) {
        return transitionEncryptionState(getCurrentEncryptionState(data), getFinalEncryptionState(encrypt), data);
    }

    private final MigrationResult transitionEncryptionState(EncryptionState currentState, EncryptionState targetState, String data) {
        if (currentState == targetState) {
            return new MigrationResult(data, true);
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[currentState.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return handlePlainTextTransition(targetState, data);
                }
                throw new NoWhenBranchMatchedException();
            }
            return handleEncryptedAesGcmTransition(targetState, data);
        }
        return handleEncryptedAesTransition(targetState, data);
    }

    @NotNull
    public final CryptMigrator copy(@NotNull String logPrefix, int configEncryptionLevel, @NotNull ILogger logger, @NotNull CryptHandler cryptHandler, @NotNull CryptRepository cryptRepository, @NotNull DataMigrationRepository dataMigrationRepository) {
        Intrinsics.echo(logPrefix, "logPrefix");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(cryptHandler, "cryptHandler");
        Intrinsics.echo(cryptRepository, "cryptRepository");
        Intrinsics.echo(dataMigrationRepository, "dataMigrationRepository");
        return new CryptMigrator(logPrefix, configEncryptionLevel, logger, cryptHandler, cryptRepository, dataMigrationRepository);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptMigrator)) {
            return false;
        }
        CryptMigrator cryptMigrator = (CryptMigrator) other;
        return Intrinsics.areEqual(this.logPrefix, cryptMigrator.logPrefix) && this.configEncryptionLevel == cryptMigrator.configEncryptionLevel && Intrinsics.areEqual(this.logger, cryptMigrator.logger) && Intrinsics.areEqual(this.cryptHandler, cryptMigrator.cryptHandler) && Intrinsics.areEqual(this.cryptRepository, cryptMigrator.cryptRepository) && Intrinsics.areEqual(this.dataMigrationRepository, cryptMigrator.dataMigrationRepository);
    }

    public int hashCode() {
        return this.dataMigrationRepository.hashCode() + ((this.cryptRepository.hashCode() + ((this.cryptHandler.hashCode() + ((this.logger.hashCode() + (((this.logPrefix.hashCode() * 31) + this.configEncryptionLevel) * 31)) * 31)) * 31)) * 31);
    }

    public final void migrateEncryption() {
        boolean z2;
        int storedEncryptionLevel = this.cryptRepository.storedEncryptionLevel();
        int migrationFailureCount = this.cryptRepository.migrationFailureCount();
        boolean isSSInAppDataMigrated = this.cryptRepository.isSSInAppDataMigrated();
        boolean z10 = true;
        if (!isSSInAppDataMigrated || (storedEncryptionLevel != this.configEncryptionLevel && migrationFailureCount != -1)) {
            migrationFailureCount = 1;
        }
        this.cryptRepository.updateEncryptionLevel(this.configEncryptionLevel);
        if (migrationFailureCount == 0) {
            this.logger.verbose(this.logPrefix, "Migration not required: config-encryption-level " + this.configEncryptionLevel + ", stored-encryption-level " + storedEncryptionLevel);
            return;
        }
        ILogger iLogger = this.logger;
        String str = this.logPrefix;
        StringBuilder sierra = c.sierra(storedEncryptionLevel, "Starting migration from encryption level ", " to ");
        sierra.append(this.configEncryptionLevel);
        sierra.append(" with migrationFailureCount ");
        sierra.append(migrationFailureCount);
        sierra.append(" and isSSInAppDataMigrated ");
        sierra.append(isSSInAppDataMigrated);
        iLogger.verbose(str, sierra.toString());
        if (this.configEncryptionLevel == EncryptionLevel.MEDIUM.getValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (migrationFailureCount != -1) {
            z10 = false;
        }
        boolean handleAllMigrations = handleAllMigrations(z2, z10);
        this.cryptRepository.updateIsSSInAppDataMigrated(handleAllMigrations);
        this.cryptRepository.updateMigrationFailureCount(handleAllMigrations);
    }

    @NotNull
    public String toString() {
        return "CryptMigrator(logPrefix=" + this.logPrefix + ", configEncryptionLevel=" + this.configEncryptionLevel + ", logger=" + this.logger + ", cryptHandler=" + this.cryptHandler + ", cryptRepository=" + this.cryptRepository + ", dataMigrationRepository=" + this.dataMigrationRepository + ')';
    }
}
