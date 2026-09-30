package com.clevertap.android.sdk.inapp.customtemplates;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.CTInAppType;
import com.clevertap.android.sdk.utils.JsonUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\u0018J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ#\u0010\u0019\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0 H\u0000¢\u0006\u0002\b\u001dJ\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\u0015\u0010&\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b'J\r\u0010(\u001a\u00020\u0000H\u0000¢\u0006\u0002\b)J\u0013\u0010*\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020$H\u0016J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002R\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "<init>", "(Landroid/os/Parcel;)V", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "value", "", CustomTemplateInAppData.KEY_TEMPLATE_NAME, "getTemplateName", "()Ljava/lang/String;", CustomTemplateInAppData.KEY_IS_ACTION, "", "isAction$clevertap_core_release", "()Z", "setAction$clevertap_core_release", "(Z)V", CustomTemplateInAppData.KEY_TEMPLATE_ID, CustomTemplateInAppData.KEY_TEMPLATE_DESCRIPTION, "args", "getArguments", "getArguments$clevertap_core_release", "getFileArgsUrls", "", "templatesManager", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;", "getFileArgsUrls$clevertap_core_release", "", "filesList", "", "writeToParcel", "dest", "flags", "", "describeContents", "writeFieldsToJson", "writeFieldsToJson$clevertap_core_release", Constants.COPY_TYPE, "copy$clevertap_core_release", "equals", "other", "", "hashCode", "setFieldsFromJson", "CREATOR", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomTemplateInAppData implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_IS_ACTION = "isAction";

    @NotNull
    private static final String KEY_TEMPLATE_DESCRIPTION = "templateDescription";

    @NotNull
    private static final String KEY_TEMPLATE_ID = "templateId";

    @NotNull
    public static final String KEY_TEMPLATE_NAME = "templateName";

    @NotNull
    public static final String KEY_VARS = "vars";

    @Nullable
    private JSONObject args;
    private boolean isAction;

    @Nullable
    private String templateDescription;

    @Nullable
    private String templateId;

    @Nullable
    private String templateName;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u001d\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "<init>", "()V", "KEY_TEMPLATE_NAME", "", "KEY_VARS", "KEY_IS_ACTION", "KEY_TEMPLATE_ID", "KEY_TEMPLATE_DESCRIPTION", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "createFromJson", Constants.INAPP_KEY, "Lorg/json/JSONObject;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData$CREATOR, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion implements Parcelable.Creator<CustomTemplateInAppData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CustomTemplateInAppData createFromJson(@Nullable JSONObject inApp) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (inApp == null) {
                return null;
            }
            if (CTInAppType.CTInAppTypeCustomCodeTemplate != CTInAppType.INSTANCE.fromString(inApp.optString(Constants.KEY_TYPE))) {
                return null;
            }
            return new CustomTemplateInAppData(inApp, defaultConstructorMarker);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CustomTemplateInAppData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.echo(parcel, "parcel");
            return new CustomTemplateInAppData(parcel, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CustomTemplateInAppData[] newArray(int size) {
            return new CustomTemplateInAppData[size];
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TemplateArgumentType.values().length];
            try {
                iArr[TemplateArgumentType.FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TemplateArgumentType.ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CustomTemplateInAppData(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    @Nullable
    public static final CustomTemplateInAppData createFromJson(@Nullable JSONObject jSONObject) {
        return INSTANCE.createFromJson(jSONObject);
    }

    private final void setFieldsFromJson(JSONObject json) {
        this.templateName = JsonUtilsKt.getStringOrNull(json, KEY_TEMPLATE_NAME);
        this.isAction = json.optBoolean(KEY_IS_ACTION);
        this.templateId = JsonUtilsKt.getStringOrNull(json, KEY_TEMPLATE_ID);
        this.templateDescription = JsonUtilsKt.getStringOrNull(json, KEY_TEMPLATE_DESCRIPTION);
        this.args = json.optJSONObject("vars");
    }

    @NotNull
    public final CustomTemplateInAppData copy$clevertap_core_release() {
        CustomTemplateInAppData customTemplateInAppData = new CustomTemplateInAppData((Parcel) null);
        customTemplateInAppData.templateName = this.templateName;
        customTemplateInAppData.isAction = this.isAction;
        customTemplateInAppData.templateId = this.templateId;
        customTemplateInAppData.templateDescription = this.templateDescription;
        JSONObject jSONObject = this.args;
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            CTXtensions.copyFrom(jSONObject2, jSONObject);
            customTemplateInAppData.args = jSONObject2;
        }
        return customTemplateInAppData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        Class<?> cls;
        String str;
        if (this == other) {
            return true;
        }
        String str2 = null;
        if (other != null) {
            cls = other.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(CustomTemplateInAppData.class, cls)) {
            return false;
        }
        Intrinsics.charlie(other, "null cannot be cast to non-null type com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData");
        CustomTemplateInAppData customTemplateInAppData = (CustomTemplateInAppData) other;
        if (!Intrinsics.areEqual(this.templateName, customTemplateInAppData.templateName) || this.isAction != customTemplateInAppData.isAction || !Intrinsics.areEqual(this.templateId, customTemplateInAppData.templateId) || !Intrinsics.areEqual(this.templateDescription, customTemplateInAppData.templateDescription)) {
            return false;
        }
        JSONObject jSONObject = this.args;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = null;
        }
        JSONObject jSONObject2 = customTemplateInAppData.args;
        if (jSONObject2 != null) {
            str2 = jSONObject2.toString();
        }
        if (Intrinsics.areEqual(str, str2)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final JSONObject getArguments$clevertap_core_release() {
        JSONObject jSONObject = this.args;
        if (jSONObject != null) {
            return CTXtensions.copy(jSONObject);
        }
        return null;
    }

    @NotNull
    public final List<String> getFileArgsUrls$clevertap_core_release(@NotNull TemplatesManager templatesManager) {
        Intrinsics.echo(templatesManager, "templatesManager");
        ArrayList arrayList = new ArrayList();
        getFileArgsUrls$clevertap_core_release(templatesManager, arrayList);
        return arrayList;
    }

    @Nullable
    public final String getTemplateName() {
        return this.templateName;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11;
        String jSONObject;
        String str = this.templateName;
        int i12 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = i4 * 31;
        if (this.isAction) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i14 = (i13 + i5) * 31;
        String str2 = this.templateId;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str3 = this.templateDescription;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        JSONObject jSONObject2 = this.args;
        if (jSONObject2 != null && (jSONObject = jSONObject2.toString()) != null) {
            i12 = jSONObject.hashCode();
        }
        return i16 + i12;
    }

    /* renamed from: isAction$clevertap_core_release, reason: from getter */
    public final boolean getIsAction() {
        return this.isAction;
    }

    public final void setAction$clevertap_core_release(boolean z2) {
        this.isAction = z2;
    }

    public final void writeFieldsToJson$clevertap_core_release(@NotNull JSONObject json) {
        Intrinsics.echo(json, "json");
        json.put(KEY_TEMPLATE_NAME, this.templateName);
        json.put(KEY_IS_ACTION, this.isAction);
        json.put(KEY_TEMPLATE_ID, this.templateId);
        json.put(KEY_TEMPLATE_DESCRIPTION, this.templateDescription);
        json.put("vars", this.args);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.echo(dest, "dest");
        dest.writeString(this.templateName);
        dest.writeByte(this.isAction ? (byte) 1 : (byte) 0);
        dest.writeString(this.templateId);
        dest.writeString(this.templateDescription);
        JsonUtilsKt.writeJson(dest, this.args);
    }

    public /* synthetic */ CustomTemplateInAppData(JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject);
    }

    private CustomTemplateInAppData(Parcel parcel) {
        this.templateName = parcel != null ? parcel.readString() : null;
        boolean z2 = false;
        if (parcel != null && parcel.readByte() == 0) {
            z2 = true;
        }
        this.isAction = !z2;
        this.templateId = parcel != null ? parcel.readString() : null;
        this.templateDescription = parcel != null ? parcel.readString() : null;
        this.args = parcel != null ? JsonUtilsKt.readJson(parcel) : null;
    }

    public final void getFileArgsUrls$clevertap_core_release(@NotNull TemplatesManager templatesManager, @NotNull List<String> filesList) {
        CustomTemplate template;
        JSONObject jSONObject;
        JSONObject optJSONObject;
        CustomTemplateInAppData createFromJson;
        Intrinsics.echo(templatesManager, "templatesManager");
        Intrinsics.echo(filesList, "filesList");
        String str = this.templateName;
        if (str == null || (template = templatesManager.getTemplate(str)) == null || (jSONObject = this.args) == null) {
            return;
        }
        for (TemplateArgument templateArgument : template.getArgs$clevertap_core_release()) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[templateArgument.getType().ordinal()];
            if (i4 == 1) {
                String stringOrNull = JsonUtilsKt.getStringOrNull(jSONObject, templateArgument.getName());
                if (stringOrNull != null) {
                    filesList.add(stringOrNull);
                }
            } else if (i4 == 2 && (optJSONObject = jSONObject.optJSONObject(templateArgument.getName())) != null && (createFromJson = INSTANCE.createFromJson(optJSONObject)) != null) {
                createFromJson.getFileArgsUrls$clevertap_core_release(templatesManager, filesList);
            }
        }
    }

    private CustomTemplateInAppData(JSONObject jSONObject) {
        this((Parcel) null);
        setFieldsFromJson(jSONObject);
    }
}
