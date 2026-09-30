package com.clevertap.android.sdk.inapp.store.preference;

import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.clevertap.android.sdk.store.preference.ICTPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/clevertap/android/sdk/inapp/store/preference/LegacyInAppStore;", "", "ctPreference", "Lcom/clevertap/android/sdk/store/preference/ICTPreference;", "accountId", "", "<init>", "(Lcom/clevertap/android/sdk/store/preference/ICTPreference;Ljava/lang/String;)V", "inAppKey", "storeInApps", "", "inApps", "Lorg/json/JSONArray;", "readInApps", "removeInApps", "updateAssetCleanupTs", CTProductConfigConstants.KEY_LAST_FETCHED_TIMESTAMP, "", "lastCleanupTs", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LegacyInAppStore {

    @NotNull
    private static final String ASSETS_CLEANUP_TS_KEY = "last_assets_cleanup";

    @NotNull
    private final ICTPreference ctPreference;

    @Nullable
    private final String inAppKey;

    public LegacyInAppStore(@NotNull ICTPreference ctPreference, @NotNull String accountId) {
        Intrinsics.echo(ctPreference, "ctPreference");
        Intrinsics.echo(accountId, "accountId");
        this.ctPreference = ctPreference;
        this.inAppKey = CTXtensions.concatIfNotNull(Constants.INAPP_KEY, accountId, ":");
    }

    public final long lastCleanupTs() {
        return this.ctPreference.readLong(ASSETS_CLEANUP_TS_KEY, 0L);
    }

    @NotNull
    public final JSONArray readInApps() {
        ICTPreference iCTPreference = this.ctPreference;
        String str = this.inAppKey;
        Intrinsics.checkNotNull(str);
        try {
            return new JSONArray(iCTPreference.readString(str, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI));
        } catch (JSONException unused) {
            return new JSONArray();
        }
    }

    public final void removeInApps() {
        ICTPreference iCTPreference = this.ctPreference;
        String str = this.inAppKey;
        Intrinsics.checkNotNull(str);
        iCTPreference.remove(str);
    }

    public final void storeInApps(@NotNull JSONArray inApps) {
        Intrinsics.echo(inApps, "inApps");
        ICTPreference iCTPreference = this.ctPreference;
        String str = this.inAppKey;
        Intrinsics.checkNotNull(str);
        String jSONArray = inApps.toString();
        Intrinsics.delta(jSONArray, "toString(...)");
        iCTPreference.writeStringImmediate(str, jSONArray);
    }

    public final void updateAssetCleanupTs(long ts) {
        this.ctPreference.writeLong(ASSETS_CLEANUP_TS_KEY, ts);
    }
}
