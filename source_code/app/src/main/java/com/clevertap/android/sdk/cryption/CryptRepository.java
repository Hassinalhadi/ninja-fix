package com.clevertap.android.sdk.cryption;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.StorageHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/clevertap/android/sdk/cryption/CryptRepository;", "Lcom/clevertap/android/sdk/cryption/ICryptRepository;", "context", "Landroid/content/Context;", "accountId", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getAccountId", "()Ljava/lang/String;", "migrationFailureCount", "", "isSSInAppDataMigrated", "", "updateIsSSInAppDataMigrated", "", "migrated", "storedEncryptionLevel", "localEncryptionKey", "updateLocalEncryptionKey", Constants.KEY_KEY, "updateEncryptionLevel", "configEncryptionLevel", "updateMigrationFailureCount", "migrationSuccessful", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CryptRepository implements ICryptRepository {

    @NotNull
    private final String accountId;

    @NotNull
    private final Context context;
    private int migrationFailureCount;

    public CryptRepository(@NotNull Context context, @NotNull String accountId) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(accountId, "accountId");
        this.context = context;
        this.accountId = accountId;
    }

    @NotNull
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.clevertap.android.sdk.cryption.ICryptRepository
    public boolean isSSInAppDataMigrated() {
        return StorageHelper.getBoolean(this.context, StorageHelper.storageKeyWithSuffix(this.accountId, CryptMigrator.SS_IN_APP_MIGRATED), false);
    }

    @Override // com.clevertap.android.sdk.cryption.ICryptRepository
    @Nullable
    public String localEncryptionKey() {
        return StorageHelper.getString(this.context, CryptRepositoryKt.ENCRYPTION_KEY, null);
    }

    @Override // com.clevertap.android.sdk.cryption.ICryptRepository
    public int migrationFailureCount() {
        return StorageHelper.getInt(this.context, StorageHelper.storageKeyWithSuffix(this.accountId, CryptMigrator.MIGRATION_FAILURE_COUNT_KEY), -1);
    }

    @Override // com.clevertap.android.sdk.cryption.ICryptRepository
    public int storedEncryptionLevel() {
        return StorageHelper.getInt(this.context, StorageHelper.storageKeyWithSuffix(this.accountId, CleverTapInstanceConfig.KEY_ENCRYPTION_LEVEL), -1);
    }

    @Override // com.clevertap.android.sdk.cryption.ICryptRepository
    public void updateEncryptionLevel(int configEncryptionLevel) {
        StorageHelper.putInt(this.context, StorageHelper.storageKeyWithSuffix(this.accountId, CleverTapInstanceConfig.KEY_ENCRYPTION_LEVEL), configEncryptionLevel);
    }

    @Override // com.clevertap.android.sdk.cryption.ICryptRepository
    public void updateIsSSInAppDataMigrated(boolean migrated) {
        StorageHelper.putBoolean(this.context, StorageHelper.storageKeyWithSuffix(this.accountId, CryptMigrator.SS_IN_APP_MIGRATED), migrated);
    }

    @Override // com.clevertap.android.sdk.cryption.ICryptRepository
    public void updateLocalEncryptionKey(@NotNull String key) {
        Intrinsics.echo(key, "key");
        StorageHelper.putString(this.context, CryptRepositoryKt.ENCRYPTION_KEY, key);
    }

    @Override // com.clevertap.android.sdk.cryption.ICryptRepository
    public void updateMigrationFailureCount(boolean migrationSuccessful) {
        int i4;
        if (migrationSuccessful) {
            i4 = 0;
        } else {
            i4 = this.migrationFailureCount + 1;
        }
        this.migrationFailureCount = i4;
        Logger.v(this.accountId, "Updating migrationFailureCount to " + this.migrationFailureCount);
        StorageHelper.putInt(this.context, StorageHelper.storageKeyWithSuffix(this.accountId, CryptMigrator.MIGRATION_FAILURE_COUNT_KEY), this.migrationFailureCount);
    }
}
