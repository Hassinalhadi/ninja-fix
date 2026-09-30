package com.clevertap.android.sdk;

import android.content.Context;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.inapp.store.preference.FileStore;
import com.clevertap.android.sdk.inapp.store.preference.ImpressionStore;
import com.clevertap.android.sdk.inapp.store.preference.InAppAssetsStore;
import com.clevertap.android.sdk.inapp.store.preference.InAppStore;
import com.clevertap.android.sdk.inapp.store.preference.LegacyInAppStore;
import com.clevertap.android.sdk.store.preference.CTPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ&\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\tH\u0007J\"\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\u001c"}, d2 = {"Lcom/clevertap/android/sdk/StoreProvider;", "", "<init>", "()V", "provideInAppAssetsStore", "Lcom/clevertap/android/sdk/inapp/store/preference/InAppAssetsStore;", "context", "Landroid/content/Context;", "accountId", "", "provideFileStore", "Lcom/clevertap/android/sdk/inapp/store/preference/FileStore;", "provideInAppStore", "Lcom/clevertap/android/sdk/inapp/store/preference/InAppStore;", "cryptHandler", "Lcom/clevertap/android/sdk/cryption/CryptHandler;", Constants.DEVICE_ID_TAG, "provideImpressionStore", "Lcom/clevertap/android/sdk/inapp/store/preference/ImpressionStore;", "provideLegacyInAppStore", "Lcom/clevertap/android/sdk/inapp/store/preference/LegacyInAppStore;", "getCTPreference", "Lcom/clevertap/android/sdk/store/preference/CTPreference;", "prefName", "constructStorePreferenceName", "storeType", "", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreProvider {

    @NotNull
    private static final String ASSET_STORE_PREFIX = "inapp_assets";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String FILE_STORE_PREFIX = "ct_files";

    @Nullable
    private static volatile StoreProvider INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\u0005H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/StoreProvider$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/clevertap/android/sdk/StoreProvider;", "ASSET_STORE_PREFIX", "", "FILE_STORE_PREFIX", "getInstance", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StoreProvider getInstance() {
            StoreProvider storeProvider;
            StoreProvider storeProvider2 = StoreProvider.INSTANCE;
            if (storeProvider2 == null) {
                synchronized (this) {
                    storeProvider = StoreProvider.INSTANCE;
                    if (storeProvider == null) {
                        storeProvider = new StoreProvider();
                        StoreProvider.INSTANCE = storeProvider;
                    }
                }
                return storeProvider;
            }
            return storeProvider2;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ String constructStorePreferenceName$default(StoreProvider storeProvider, int i4, String str, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = "";
        }
        if ((i5 & 4) != 0) {
            str2 = "";
        }
        return storeProvider.constructStorePreferenceName(i4, str, str2);
    }

    @NotNull
    public static final StoreProvider getInstance() {
        return INSTANCE.getInstance();
    }

    @NotNull
    public final String constructStorePreferenceName(int storeType, @NotNull String deviceId, @NotNull String accountId) {
        Intrinsics.echo(deviceId, "deviceId");
        Intrinsics.echo(accountId, "accountId");
        if (storeType != 1) {
            if (storeType != 2) {
                if (storeType == 3) {
                    return Constants.CLEVERTAP_STORAGE_TAG;
                }
                if (storeType != 4) {
                    if (storeType != 5) {
                        return Constants.CLEVERTAP_STORAGE_TAG;
                    }
                    return "ct_files:".concat(accountId);
                }
                return "inapp_assets:".concat(accountId);
            }
            return "counts_per_inapp:" + deviceId + ':' + accountId;
        }
        return "inApp:" + deviceId + ':' + accountId;
    }

    @NotNull
    public final CTPreference getCTPreference(@NotNull Context context, @NotNull String prefName) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(prefName, "prefName");
        return new CTPreference(context, prefName);
    }

    @NotNull
    public final FileStore provideFileStore(@NotNull Context context, @NotNull String accountId) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(accountId, "accountId");
        return new FileStore(getCTPreference(context, constructStorePreferenceName$default(this, 5, null, accountId, 2, null)));
    }

    @NotNull
    public final ImpressionStore provideImpressionStore(@NotNull Context context, @NotNull String deviceId, @NotNull String accountId) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(deviceId, "deviceId");
        Intrinsics.echo(accountId, "accountId");
        return new ImpressionStore(getCTPreference(context, constructStorePreferenceName(2, deviceId, accountId)));
    }

    @NotNull
    public final InAppAssetsStore provideInAppAssetsStore(@NotNull Context context, @NotNull String accountId) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(accountId, "accountId");
        return new InAppAssetsStore(getCTPreference(context, constructStorePreferenceName$default(this, 4, null, accountId, 2, null)));
    }

    @NotNull
    public final InAppStore provideInAppStore(@NotNull Context context, @NotNull CryptHandler cryptHandler, @NotNull String deviceId, @NotNull String accountId) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(cryptHandler, "cryptHandler");
        Intrinsics.echo(deviceId, "deviceId");
        Intrinsics.echo(accountId, "accountId");
        return new InAppStore(getCTPreference(context, constructStorePreferenceName(1, deviceId, accountId)), cryptHandler);
    }

    @NotNull
    public final LegacyInAppStore provideLegacyInAppStore(@NotNull Context context, @NotNull String accountId) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(accountId, "accountId");
        return new LegacyInAppStore(getCTPreference(context, constructStorePreferenceName$default(this, 3, null, null, 6, null)), accountId);
    }
}
