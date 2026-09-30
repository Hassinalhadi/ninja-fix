package com.clevertap.android.sdk.inapp.store.preference;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.StoreProvider;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.login.ChangeUserCallback;
import com.clevertap.android.sdk.store.preference.ICTPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\tJ\u0006\u0010\u001f\u001a\u00020\tJ\u0006\u0010 \u001a\u00020\u001bJ\u0006\u0010!\u001a\u00020\u001bJ\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\fH\u0002J\u0006\u0010$\u001a\u00020\tJ\u0018\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006)"}, d2 = {"Lcom/clevertap/android/sdk/inapp/store/preference/InAppStore;", "Lcom/clevertap/android/sdk/login/ChangeUserCallback;", "ctPreference", "Lcom/clevertap/android/sdk/store/preference/ICTPreference;", "cryptHandler", "Lcom/clevertap/android/sdk/cryption/CryptHandler;", "<init>", "(Lcom/clevertap/android/sdk/store/preference/ICTPreference;Lcom/clevertap/android/sdk/cryption/CryptHandler;)V", "clientSideInApps", "Lorg/json/JSONArray;", "serverSideInApps", "value", "", "mode", "getMode", "()Ljava/lang/String;", "setMode", "(Ljava/lang/String;)V", "removeClientSideInApps", "", "removeServerSideInAppsMetaData", "storeClientSideInApps", "storeServerSideInAppsMetaData", "serverSideInAppsMetaData", "storeServerSideInApps", "storeEvaluatedServerSideInAppIds", "evaluatedServerSideInAppIds", "Lorg/json/JSONObject;", "storeSuppressedClientSideInAppIds", "suppressedClientSideInAppIds", "readClientSideInApps", "readServerSideInAppsMetaData", "readEvaluatedServerSideInAppIds", "readSuppressedClientSideInAppIds", "migrateInAppHeaderPrefsForEventType", "inAppIds", "readServerSideInApps", "onChangeUser", Constants.DEVICE_ID_TAG, "accountId", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppStore implements ChangeUserCallback {

    @NotNull
    public static final String CLIENT_SIDE_MODE = "CS";

    @NotNull
    public static final String NO_MODE = "NO_MODE";

    @NotNull
    public static final String SERVER_SIDE_MODE = "SS";

    @Nullable
    private JSONArray clientSideInApps;

    @NotNull
    private final CryptHandler cryptHandler;

    @NotNull
    private final ICTPreference ctPreference;

    @Nullable
    private String mode;

    @Nullable
    private JSONArray serverSideInApps;

    public InAppStore(@NotNull ICTPreference ctPreference, @NotNull CryptHandler cryptHandler) {
        Intrinsics.echo(ctPreference, "ctPreference");
        Intrinsics.echo(cryptHandler, "cryptHandler");
        this.ctPreference = ctPreference;
        this.cryptHandler = cryptHandler;
    }

    private final JSONObject migrateInAppHeaderPrefsForEventType(String inAppIds) {
        JSONObject put = new JSONObject().put(Constants.RAISED, new JSONArray(inAppIds));
        Intrinsics.delta(put, "put(...)");
        return put;
    }

    private final void removeClientSideInApps() {
        this.ctPreference.remove("inapp_notifs_cs");
        this.clientSideInApps = null;
    }

    private final void removeServerSideInAppsMetaData() {
        this.ctPreference.remove("inapp_notifs_ss");
    }

    @Nullable
    public final String getMode() {
        return this.mode;
    }

    @Override // com.clevertap.android.sdk.login.ChangeUserCallback
    public void onChangeUser(@NotNull String deviceId, @NotNull String accountId) {
        Intrinsics.echo(deviceId, "deviceId");
        Intrinsics.echo(accountId, "accountId");
        this.ctPreference.changePreferenceName(StoreProvider.INSTANCE.getInstance().constructStorePreferenceName(1, deviceId, accountId));
    }

    @NotNull
    public final JSONArray readClientSideInApps() {
        JSONArray jSONArray;
        JSONArray jSONArray2 = this.clientSideInApps;
        if (jSONArray2 != null) {
            Intrinsics.charlie(jSONArray2, "null cannot be cast to non-null type org.json.JSONArray");
            return jSONArray2;
        }
        String readString = this.ctPreference.readString("inapp_notifs_cs", "");
        if (readString != null && !StringsKt.gray(readString)) {
            try {
                jSONArray = new JSONArray(CryptHandler.decrypt$default(this.cryptHandler, readString, null, 2, null));
            } catch (Exception unused) {
                jSONArray = new JSONArray();
            }
        } else {
            jSONArray = new JSONArray();
        }
        this.clientSideInApps = jSONArray;
        return jSONArray;
    }

    @NotNull
    public final JSONObject readEvaluatedServerSideInAppIds() {
        String readString = this.ctPreference.readString(Constants.PREFS_EVALUATED_INAPP_KEY_SS, "");
        if (readString != null && !StringsKt.gray(readString)) {
            try {
                return new JSONObject(readString);
            } catch (JSONException unused) {
                return migrateInAppHeaderPrefsForEventType(readString);
            }
        }
        return new JSONObject();
    }

    @NotNull
    public final JSONArray readServerSideInApps() {
        JSONArray jSONArray;
        JSONArray jSONArray2 = this.serverSideInApps;
        if (jSONArray2 != null) {
            Intrinsics.charlie(jSONArray2, "null cannot be cast to non-null type org.json.JSONArray");
            return jSONArray2;
        }
        String readString = this.ctPreference.readString(Constants.INAPP_KEY, "");
        if (readString != null && !StringsKt.gray(readString)) {
            try {
                jSONArray = new JSONArray(CryptHandler.decrypt$default(this.cryptHandler, readString, null, 2, null));
            } catch (Exception unused) {
                jSONArray = new JSONArray();
            }
        } else {
            jSONArray = new JSONArray();
        }
        this.serverSideInApps = jSONArray;
        return jSONArray;
    }

    @NotNull
    public final JSONArray readServerSideInAppsMetaData() {
        String readString = this.ctPreference.readString("inapp_notifs_ss", "");
        if (readString != null && !StringsKt.gray(readString)) {
            return new JSONArray(readString);
        }
        return new JSONArray();
    }

    @NotNull
    public final JSONObject readSuppressedClientSideInAppIds() {
        String readString = this.ctPreference.readString(Constants.PREFS_SUPPRESSED_INAPP_KEY_CS, "");
        if (readString != null && !StringsKt.gray(readString)) {
            try {
                return new JSONObject(readString);
            } catch (JSONException unused) {
                return migrateInAppHeaderPrefsForEventType(readString);
            }
        }
        return new JSONObject();
    }

    public final void setMode(@Nullable String str) {
        if (!Intrinsics.areEqual(this.mode, str)) {
            this.mode = str;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1437347487) {
                    if (hashCode != 2160) {
                        if (hashCode == 2656 && str.equals(SERVER_SIDE_MODE)) {
                            removeClientSideInApps();
                            return;
                        }
                        return;
                    }
                    if (str.equals(CLIENT_SIDE_MODE)) {
                        removeServerSideInAppsMetaData();
                        return;
                    }
                    return;
                }
                if (str.equals(NO_MODE)) {
                    removeServerSideInAppsMetaData();
                    removeClientSideInApps();
                }
            }
        }
    }

    public final void storeClientSideInApps(@NotNull JSONArray clientSideInApps) {
        Intrinsics.echo(clientSideInApps, "clientSideInApps");
        this.clientSideInApps = clientSideInApps;
        CryptHandler cryptHandler = this.cryptHandler;
        String jSONArray = clientSideInApps.toString();
        Intrinsics.delta(jSONArray, "toString(...)");
        String encrypt$default = CryptHandler.encrypt$default(cryptHandler, jSONArray, null, 2, null);
        if (encrypt$default != null) {
            this.ctPreference.writeString("inapp_notifs_cs", encrypt$default);
        }
    }

    public final void storeEvaluatedServerSideInAppIds(@NotNull JSONObject evaluatedServerSideInAppIds) {
        Intrinsics.echo(evaluatedServerSideInAppIds, "evaluatedServerSideInAppIds");
        ICTPreference iCTPreference = this.ctPreference;
        String jSONObject = evaluatedServerSideInAppIds.toString();
        Intrinsics.delta(jSONObject, "toString(...)");
        iCTPreference.writeString(Constants.PREFS_EVALUATED_INAPP_KEY_SS, jSONObject);
    }

    public final void storeServerSideInApps(@NotNull JSONArray serverSideInApps) {
        Intrinsics.echo(serverSideInApps, "serverSideInApps");
        this.serverSideInApps = serverSideInApps;
        CryptHandler cryptHandler = this.cryptHandler;
        String jSONArray = serverSideInApps.toString();
        Intrinsics.delta(jSONArray, "toString(...)");
        String encrypt$default = CryptHandler.encrypt$default(cryptHandler, jSONArray, null, 2, null);
        if (encrypt$default != null) {
            this.ctPreference.writeString(Constants.INAPP_KEY, encrypt$default);
        }
    }

    public final void storeServerSideInAppsMetaData(@NotNull JSONArray serverSideInAppsMetaData) {
        Intrinsics.echo(serverSideInAppsMetaData, "serverSideInAppsMetaData");
        ICTPreference iCTPreference = this.ctPreference;
        String jSONArray = serverSideInAppsMetaData.toString();
        Intrinsics.delta(jSONArray, "toString(...)");
        iCTPreference.writeString("inapp_notifs_ss", jSONArray);
    }

    public final void storeSuppressedClientSideInAppIds(@NotNull JSONObject suppressedClientSideInAppIds) {
        Intrinsics.echo(suppressedClientSideInAppIds, "suppressedClientSideInAppIds");
        ICTPreference iCTPreference = this.ctPreference;
        String jSONObject = suppressedClientSideInAppIds.toString();
        Intrinsics.delta(jSONObject, "toString(...)");
        iCTPreference.writeString(Constants.PREFS_SUPPRESSED_INAPP_KEY_CS, jSONObject);
    }
}
