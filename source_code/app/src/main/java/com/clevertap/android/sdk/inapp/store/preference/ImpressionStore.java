package com.clevertap.android.sdk.inapp.store.preference;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.StoreProvider;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.login.ChangeUserCallback;
import com.clevertap.android.sdk.store.preference.ICTPreference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/clevertap/android/sdk/inapp/store/preference/ImpressionStore;", "Lcom/clevertap/android/sdk/login/ChangeUserCallback;", "ctPreference", "Lcom/clevertap/android/sdk/store/preference/ICTPreference;", "<init>", "(Lcom/clevertap/android/sdk/store/preference/ICTPreference;)V", "read", "", "", Column.CAMPAIGN, "", "write", "", "timestamp", "clear", "saveLongListToPrefs", Constants.KEY_KEY, "list", "getLongListFromPrefs", "onChangeUser", Constants.DEVICE_ID_TAG, "accountId", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImpressionStore implements ChangeUserCallback {

    @NotNull
    public static final String PREF_PREFIX = "__impressions";

    @NotNull
    private final ICTPreference ctPreference;

    public ImpressionStore(@NotNull ICTPreference ctPreference) {
        Intrinsics.echo(ctPreference, "ctPreference");
        this.ctPreference = ctPreference;
    }

    private final List<Long> getLongListFromPrefs(String key) {
        String readString = this.ctPreference.readString(key, "");
        if (readString != null && !StringsKt.gray(readString)) {
            List maroon = StringsKt.maroon(readString, new String[]{Constants.SEPARATOR_COMMA}, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = maroon.iterator();
            while (it.hasNext()) {
                Long uniform = r.uniform((String) it.next());
                if (uniform != null) {
                    arrayList.add(uniform);
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    private final void saveLongListToPrefs(String key, List<Long> list) {
        this.ctPreference.writeString(key, CollectionsKt.maroon(list, Constants.SEPARATOR_COMMA, null, null, null, 62));
    }

    public final void clear(@NotNull String campaignId) {
        Intrinsics.echo(campaignId, "campaignId");
        this.ctPreference.remove("__impressions_".concat(campaignId));
    }

    @Override // com.clevertap.android.sdk.login.ChangeUserCallback
    public void onChangeUser(@NotNull String deviceId, @NotNull String accountId) {
        Intrinsics.echo(deviceId, "deviceId");
        Intrinsics.echo(accountId, "accountId");
        this.ctPreference.changePreferenceName(StoreProvider.INSTANCE.getInstance().constructStorePreferenceName(2, deviceId, accountId));
    }

    @NotNull
    public final List<Long> read(@NotNull String campaignId) {
        Intrinsics.echo(campaignId, "campaignId");
        return getLongListFromPrefs("__impressions_".concat(campaignId));
    }

    public final void write(@NotNull String campaignId, long timestamp) {
        Intrinsics.echo(campaignId, "campaignId");
        ArrayList B = CollectionsKt.B(read(campaignId));
        B.add(Long.valueOf(timestamp));
        saveLongListToPrefs("__impressions_".concat(campaignId), B);
    }
}
