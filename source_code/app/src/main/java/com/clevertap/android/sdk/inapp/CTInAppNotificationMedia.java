package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B3\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\b\u0010\u0017\u001a\u00020\bH\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\bH\u0016J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020\u001dJ\u0013\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "Landroid/os/Parcelable;", "mediaUrl", "", "contentType", "contentDescription", "cacheKey", Constants.KEY_ORIENTATION, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getMediaUrl", "()Ljava/lang/String;", "setMediaUrl", "(Ljava/lang/String;)V", "getContentType", "getContentDescription", "getCacheKey", "getOrientation", "()I", "describeContents", "writeToParcel", "", "dest", "flags", "isAudio", "", "isGIF", "isImage", "isVideo", "isMediaStreamable", "equals", "other", "", "hashCode", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTInAppNotificationMedia implements Parcelable {

    @Nullable
    private final String cacheKey;

    @NotNull
    private final String contentDescription;

    @NotNull
    private final String contentType;

    @NotNull
    private String mediaUrl;
    private final int orientation;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CTInAppNotificationMedia> CREATOR = new Parcelable.Creator<CTInAppNotificationMedia>() { // from class: com.clevertap.android.sdk.inapp.CTInAppNotificationMedia$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CTInAppNotificationMedia createFromParcel(Parcel parcel) {
            Intrinsics.echo(parcel, "parcel");
            return new CTInAppNotificationMedia(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CTInAppNotificationMedia[] newArray(int size) {
            return new CTInAppNotificationMedia[size];
        }
    };

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$Companion;", "", "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "create", "json", "Lorg/json/JSONObject;", Constants.KEY_ORIENTATION, "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CTInAppNotificationMedia create(@NotNull JSONObject json, int orientation) {
            Intrinsics.echo(json, "json");
            String optString = json.optString(Constants.KEY_CONTENT_TYPE);
            Intrinsics.checkNotNull(optString);
            String str = null;
            if (StringsKt.gray(optString)) {
                return null;
            }
            String optString2 = json.optString(Constants.KEY_URL);
            Intrinsics.checkNotNull(optString2);
            if (!StringsKt.gray(optString2) && r.quebec(optString, "image", false)) {
                str = UUID.randomUUID() + json.optString(Constants.KEY_KEY);
            }
            String optString3 = json.optString(Constants.KEY_ALT_TEXT);
            Intrinsics.checkNotNull(optString3);
            return new CTInAppNotificationMedia(optString2, optString, optString3, str, orientation);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CTInAppNotificationMedia(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    @Nullable
    public static final CTInAppNotificationMedia create(@NotNull JSONObject jSONObject, int i4) {
        return INSTANCE.create(jSONObject, i4);
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
        if (!Intrinsics.areEqual(CTInAppNotificationMedia.class, cls)) {
            return false;
        }
        Intrinsics.charlie(other, "null cannot be cast to non-null type com.clevertap.android.sdk.inapp.CTInAppNotificationMedia");
        CTInAppNotificationMedia cTInAppNotificationMedia = (CTInAppNotificationMedia) other;
        if (this.orientation == cTInAppNotificationMedia.orientation && Intrinsics.areEqual(this.mediaUrl, cTInAppNotificationMedia.mediaUrl) && Intrinsics.areEqual(this.contentType, cTInAppNotificationMedia.contentType) && Intrinsics.areEqual(this.contentDescription, cTInAppNotificationMedia.contentDescription) && Intrinsics.areEqual(this.cacheKey, cTInAppNotificationMedia.cacheKey)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    public final String getContentDescription() {
        return this.contentDescription;
    }

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public int hashCode() {
        int i4;
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra(AbstractC2327c.sierra(this.orientation * 31, 31, this.mediaUrl), 31, this.contentType), 31, this.contentDescription);
        String str = this.cacheKey;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return sierra + i4;
    }

    public final boolean isAudio() {
        if (StringsKt.gray(this.mediaUrl) || !r.quebec(this.contentType, "audio", false)) {
            return false;
        }
        return true;
    }

    public final boolean isGIF() {
        if (!StringsKt.gray(this.mediaUrl) && Intrinsics.areEqual(this.contentType, "image/gif")) {
            return true;
        }
        return false;
    }

    public final boolean isImage() {
        if (StringsKt.gray(this.mediaUrl) || !r.quebec(this.contentType, "image", false) || Intrinsics.areEqual(this.contentType, "image/gif")) {
            return false;
        }
        return true;
    }

    public final boolean isMediaStreamable() {
        if (!isVideo() && !isAudio()) {
            return false;
        }
        return true;
    }

    public final boolean isVideo() {
        if (StringsKt.gray(this.mediaUrl) || !r.quebec(this.contentType, "video", false)) {
            return false;
        }
        return true;
    }

    public final void setMediaUrl(@NotNull String str) {
        Intrinsics.echo(str, "<set-?>");
        this.mediaUrl = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.echo(dest, "dest");
        dest.writeString(this.mediaUrl);
        dest.writeString(this.contentType);
        dest.writeString(this.contentDescription);
        dest.writeString(this.cacheKey);
        dest.writeInt(this.orientation);
    }

    public CTInAppNotificationMedia(@NotNull String mediaUrl, @NotNull String contentType, @NotNull String contentDescription, @Nullable String str, int i4) {
        Intrinsics.echo(mediaUrl, "mediaUrl");
        Intrinsics.echo(contentType, "contentType");
        Intrinsics.echo(contentDescription, "contentDescription");
        this.mediaUrl = mediaUrl;
        this.contentType = contentType;
        this.contentDescription = contentDescription;
        this.cacheKey = str;
        this.orientation = i4;
    }

    private CTInAppNotificationMedia(Parcel parcel) {
        String readString = parcel.readString();
        this.mediaUrl = readString == null ? "" : readString;
        String readString2 = parcel.readString();
        this.contentType = readString2 == null ? "" : readString2;
        String readString3 = parcel.readString();
        this.contentDescription = readString3 != null ? readString3 : "";
        this.cacheKey = parcel.readString();
        this.orientation = parcel.readInt();
    }
}
