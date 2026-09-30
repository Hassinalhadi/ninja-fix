package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.utils.JsonUtilsKt;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0013\u0010&\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020#H\u0016R\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R`\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u00122&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u0012@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\t\u001a\u0004\u0018\u00010\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u001c8G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "<init>", "(Landroid/os/Parcel;)V", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "value", "Lcom/clevertap/android/sdk/inapp/InAppActionType;", Constants.KEY_TYPE, "getType", "()Lcom/clevertap/android/sdk/inapp/InAppActionType;", "", "actionUrl", "getActionUrl", "()Ljava/lang/String;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "keyValues", "getKeyValues", "()Ljava/util/HashMap;", "Ljava/util/HashMap;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "customTemplateInAppData", "getCustomTemplateInAppData", "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "", "shouldFallbackToSettings", "()Z", "writeToParcel", "", "dest", "flags", "", "describeContents", "setFieldsFromJson", "equals", "other", "", "hashCode", "CREATOR", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTInAppAction implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String actionUrl;

    @Nullable
    private CustomTemplateInAppData customTemplateInAppData;

    @Nullable
    private HashMap<String, String> keyValues;
    private boolean shouldFallbackToSettings;

    @Nullable
    private InAppActionType type;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0002H\u0007¨\u0006\u0014"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppAction$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "createFromJson", "json", "Lorg/json/JSONObject;", "createOpenUrlAction", Constants.KEY_URL, "", "createCloseAction", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.clevertap.android.sdk.inapp.CTInAppAction$CREATOR, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion implements Parcelable.Creator<CTInAppAction> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final CTInAppAction createCloseAction() {
            CTInAppAction cTInAppAction = new CTInAppAction((Parcel) null, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            cTInAppAction.type = InAppActionType.CLOSE;
            return cTInAppAction;
        }

        @Nullable
        public final CTInAppAction createFromJson(@Nullable JSONObject json) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (json == null) {
                return null;
            }
            return new CTInAppAction(json, defaultConstructorMarker);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final CTInAppAction createOpenUrlAction(@NotNull String url) {
            Intrinsics.echo(url, "url");
            CTInAppAction cTInAppAction = new CTInAppAction((Parcel) null, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            cTInAppAction.type = InAppActionType.OPEN_URL;
            cTInAppAction.actionUrl = url;
            return cTInAppAction;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CTInAppAction createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.echo(parcel, "parcel");
            return new CTInAppAction(parcel, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CTInAppAction[] newArray(int size) {
            return new CTInAppAction[size];
        }
    }

    public /* synthetic */ CTInAppAction(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    @NotNull
    public static final CTInAppAction createCloseAction() {
        return INSTANCE.createCloseAction();
    }

    @Nullable
    public static final CTInAppAction createFromJson(@Nullable JSONObject jSONObject) {
        return INSTANCE.createFromJson(jSONObject);
    }

    @NotNull
    public static final CTInAppAction createOpenUrlAction(@NotNull String str) {
        return INSTANCE.createOpenUrlAction(str);
    }

    private final void setFieldsFromJson(JSONObject json) {
        InAppActionType inAppActionType;
        String stringOrNull = JsonUtilsKt.getStringOrNull(json, Constants.KEY_TYPE);
        if (stringOrNull != null) {
            inAppActionType = InAppActionType.INSTANCE.fromString(stringOrNull);
        } else {
            inAppActionType = null;
        }
        this.type = inAppActionType;
        this.actionUrl = JsonUtilsKt.getStringOrNull(json, "android");
        this.customTemplateInAppData = CustomTemplateInAppData.INSTANCE.createFromJson(json);
        this.shouldFallbackToSettings = json.optBoolean(Constants.KEY_FALLBACK_NOTIFICATION_SETTINGS);
        if (Constants.KEY_KV.equalsIgnoreCase(json.optString(Constants.KEY_TYPE)) && json.has(Constants.KEY_KV)) {
            JSONObject optJSONObject = json.optJSONObject(Constants.KEY_KV);
            HashMap<String, String> hashMap = this.keyValues;
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                Intrinsics.delta(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = optJSONObject.optString(next);
                    Intrinsics.checkNotNull(optString);
                    if (optString.length() > 0) {
                        hashMap.put(next, optString);
                    }
                }
                this.keyValues = hashMap;
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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
        if (!Intrinsics.areEqual(CTInAppAction.class, cls)) {
            return false;
        }
        Intrinsics.charlie(other, "null cannot be cast to non-null type com.clevertap.android.sdk.inapp.CTInAppAction");
        CTInAppAction cTInAppAction = (CTInAppAction) other;
        if (this.shouldFallbackToSettings == cTInAppAction.shouldFallbackToSettings && this.type == cTInAppAction.type && Intrinsics.areEqual(this.actionUrl, cTInAppAction.actionUrl) && Intrinsics.areEqual(this.keyValues, cTInAppAction.keyValues) && Intrinsics.areEqual(this.customTemplateInAppData, cTInAppAction.customTemplateInAppData)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getActionUrl() {
        return this.actionUrl;
    }

    @Nullable
    public final CustomTemplateInAppData getCustomTemplateInAppData() {
        return this.customTemplateInAppData;
    }

    @Nullable
    public final HashMap<String, String> getKeyValues() {
        return this.keyValues;
    }

    @Nullable
    public final InAppActionType getType() {
        return this.type;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11;
        if (this.shouldFallbackToSettings) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i12 = i4 * 31;
        InAppActionType inAppActionType = this.type;
        int i13 = 0;
        if (inAppActionType != null) {
            i5 = inAppActionType.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i12 + i5) * 31;
        String str = this.actionUrl;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        HashMap<String, String> hashMap = this.keyValues;
        if (hashMap != null) {
            i11 = hashMap.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        CustomTemplateInAppData customTemplateInAppData = this.customTemplateInAppData;
        if (customTemplateInAppData != null) {
            i13 = customTemplateInAppData.hashCode();
        }
        return i16 + i13;
    }

    /* renamed from: shouldFallbackToSettings, reason: from getter */
    public final boolean getShouldFallbackToSettings() {
        return this.shouldFallbackToSettings;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        String str;
        Intrinsics.echo(dest, "dest");
        InAppActionType inAppActionType = this.type;
        if (inAppActionType != null) {
            str = inAppActionType.getStringValue();
        } else {
            str = null;
        }
        dest.writeString(str);
        dest.writeString(this.actionUrl);
        dest.writeMap(this.keyValues);
        dest.writeParcelable(this.customTemplateInAppData, flags);
        dest.writeByte(this.shouldFallbackToSettings ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ CTInAppAction(JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject);
    }

    private CTInAppAction(Parcel parcel) {
        String readString;
        this.type = (parcel == null || (readString = parcel.readString()) == null) ? null : InAppActionType.INSTANCE.fromString(readString);
        this.actionUrl = parcel != null ? parcel.readString() : null;
        HashMap<String, String> readHashMap = parcel != null ? parcel.readHashMap(null) : null;
        this.keyValues = readHashMap == null ? null : readHashMap;
        this.customTemplateInAppData = parcel != null ? (CustomTemplateInAppData) parcel.readParcelable(CustomTemplateInAppData.class.getClassLoader()) : null;
        boolean z2 = false;
        if (parcel != null && parcel.readByte() == 0) {
            z2 = true;
        }
        this.shouldFallbackToSettings = !z2;
    }

    private CTInAppAction(JSONObject jSONObject) {
        this((Parcel) null);
        setFieldsFromJson(jSONObject);
    }
}
