package com.clevertap.android.sdk.cryption;

import U7.b;
import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.StorageHelper;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.db.DBAdapter;
import com.clevertap.android.sdk.utils.CTJsonConverter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\rH\u0016J,\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/clevertap/android/sdk/cryption/DataMigrationRepository;", "Lcom/clevertap/android/sdk/cryption/IDataMigrationRepository;", "context", "Landroid/content/Context;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "dbAdapter", "Lcom/clevertap/android/sdk/db/DBAdapter;", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lcom/clevertap/android/sdk/db/DBAdapter;)V", "cachedGuidString", "", "cachedGuidJsonObject", "Lorg/json/JSONObject;", "saveCachedGuidJson", "", "json", "removeCachedGuidJson", "saveCachedGuidJsonLength", "length", "", "userProfilesInAccount", "", "saveUserProfile", "", Column.DEVICE_ID, Constants.PROFILE, "inAppDataFiles", "keysToMigrate", "", "migrate", "Lkotlin/Function1;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DataMigrationRepository implements IDataMigrationRepository {

    @NotNull
    private final CleverTapInstanceConfig config;

    @NotNull
    private final Context context;

    @NotNull
    private final DBAdapter dbAdapter;

    public DataMigrationRepository(@NotNull Context context, @NotNull CleverTapInstanceConfig config, @NotNull DBAdapter dbAdapter) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(config, "config");
        Intrinsics.echo(dbAdapter, "dbAdapter");
        this.context = context;
        this.config = config;
        this.dbAdapter = dbAdapter;
    }

    public static final boolean inAppDataFiles$lambda$0(DataMigrationRepository this$0, File file, String str) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.checkNotNull(str);
        if (r.quebec(str, Constants.INAPP_KEY, false)) {
            if (r.golf(str, this$0.config.getAccountId() + ".xml", false)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.clevertap.android.sdk.cryption.IDataMigrationRepository
    @NotNull
    public JSONObject cachedGuidJsonObject() {
        JSONObject jsonObject = CTJsonConverter.toJsonObject(cachedGuidString(), this.config.getLogger(), this.config.getAccountId());
        Intrinsics.delta(jsonObject, "toJsonObject(...)");
        return jsonObject;
    }

    @Override // com.clevertap.android.sdk.cryption.IDataMigrationRepository
    @Nullable
    public String cachedGuidString() {
        return StorageHelper.getStringFromPrefs(this.context, this.config, Constants.CACHED_GUIDS_KEY, null);
    }

    @Override // com.clevertap.android.sdk.cryption.IDataMigrationRepository
    public void inAppDataFiles(@NotNull List<String> keysToMigrate, @NotNull Function1<? super String, String> migrate) {
        Intrinsics.echo(keysToMigrate, "keysToMigrate");
        Intrinsics.echo(migrate, "migrate");
        File[] listFiles = new File(this.context.getApplicationInfo().dataDir, "shared_prefs").listFiles(new b(1, this));
        if (listFiles != null) {
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                Intrinsics.checkNotNull(file);
                Intrinsics.echo(file, "<this>");
                String name = file.getName();
                Intrinsics.delta(name, "getName(...)");
                arrayList.add(this.context.getSharedPreferences(StringsKt.teal(name, name), 0));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                SharedPreferences sharedPreferences = (SharedPreferences) it.next();
                for (String str : keysToMigrate) {
                    String string = sharedPreferences.getString(str, null);
                    if (string != null) {
                        sharedPreferences.edit().putString(str, migrate.invoke(string)).apply();
                    }
                }
            }
        }
    }

    @Override // com.clevertap.android.sdk.cryption.IDataMigrationRepository
    public void removeCachedGuidJson() {
        StorageHelper.remove(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), Constants.CACHED_GUIDS_KEY));
    }

    @Override // com.clevertap.android.sdk.cryption.IDataMigrationRepository
    public void saveCachedGuidJson(@Nullable String json) {
        StorageHelper.putString(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), Constants.CACHED_GUIDS_KEY), json);
    }

    @Override // com.clevertap.android.sdk.cryption.IDataMigrationRepository
    public void saveCachedGuidJsonLength(int length) {
        StorageHelper.putInt(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), Constants.CACHED_GUIDS_LENGTH_KEY), length);
    }

    @Override // com.clevertap.android.sdk.cryption.IDataMigrationRepository
    public long saveUserProfile(@NotNull String r32, @NotNull JSONObject r4) {
        Intrinsics.echo(r32, "deviceID");
        Intrinsics.echo(r4, "profile");
        return this.dbAdapter.storeUserProfile(this.config.getAccountId(), r32, r4);
    }

    @Override // com.clevertap.android.sdk.cryption.IDataMigrationRepository
    @NotNull
    public Map<String, JSONObject> userProfilesInAccount() {
        return this.dbAdapter.fetchUserProfilesByAccountId(this.config.getAccountId());
    }
}
