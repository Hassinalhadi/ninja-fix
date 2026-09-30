package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CleverTapDisplayUnitContent implements Parcelable {
    public static final Parcelable.Creator<CleverTapDisplayUnitContent> CREATOR = new Parcelable.Creator<CleverTapDisplayUnitContent>() { // from class: com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CleverTapDisplayUnitContent createFromParcel(Parcel parcel) {
            return new CleverTapDisplayUnitContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CleverTapDisplayUnitContent[] newArray(int i4) {
            return new CleverTapDisplayUnitContent[i4];
        }
    };
    private String actionUrl;
    private String contentType;
    private String error;
    private String icon;
    private String media;
    private String message;
    private String messageColor;
    private String posterUrl;
    private String title;
    private String titleColor;

    public static CleverTapDisplayUnitContent toContent(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        String str2;
        JSONObject jSONObject3;
        String str3;
        String str4;
        JSONObject jSONObject4;
        String str5;
        JSONObject jSONObject5;
        String str6;
        String str7;
        String str8;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        try {
            JSONObject jSONObject8 = null;
            if (jSONObject.has(Constants.KEY_TITLE)) {
                jSONObject2 = jSONObject.getJSONObject(Constants.KEY_TITLE);
            } else {
                jSONObject2 = null;
            }
            String str9 = "";
            if (jSONObject2 == null) {
                str = "";
                str2 = str;
            } else {
                if (!jSONObject2.has(Constants.KEY_TEXT)) {
                    str2 = "";
                } else {
                    str2 = jSONObject2.getString(Constants.KEY_TEXT);
                }
                str = jSONObject2.has(Constants.KEY_COLOR) ? jSONObject2.getString(Constants.KEY_COLOR) : "";
            }
            if (jSONObject.has(Constants.KEY_MESSAGE)) {
                jSONObject3 = jSONObject.getJSONObject(Constants.KEY_MESSAGE);
            } else {
                jSONObject3 = null;
            }
            if (jSONObject3 == null) {
                str3 = "";
                str4 = str3;
            } else {
                if (!jSONObject3.has(Constants.KEY_TEXT)) {
                    str4 = "";
                } else {
                    str4 = jSONObject3.getString(Constants.KEY_TEXT);
                }
                str3 = jSONObject3.has(Constants.KEY_COLOR) ? jSONObject3.getString(Constants.KEY_COLOR) : "";
            }
            if (jSONObject.has(Constants.KEY_ICON)) {
                jSONObject4 = jSONObject.getJSONObject(Constants.KEY_ICON);
            } else {
                jSONObject4 = null;
            }
            if (jSONObject4 == null || !jSONObject4.has(Constants.KEY_URL)) {
                str5 = "";
            } else {
                str5 = jSONObject4.getString(Constants.KEY_URL);
            }
            if (jSONObject.has(Constants.KEY_MEDIA)) {
                jSONObject5 = jSONObject.getJSONObject(Constants.KEY_MEDIA);
            } else {
                jSONObject5 = null;
            }
            if (jSONObject5 == null) {
                str6 = "";
                str7 = str6;
                str8 = str7;
            } else {
                if (!jSONObject5.has(Constants.KEY_URL)) {
                    str8 = "";
                } else {
                    str8 = jSONObject5.getString(Constants.KEY_URL);
                }
                if (!jSONObject5.has(Constants.KEY_CONTENT_TYPE)) {
                    str7 = "";
                } else {
                    str7 = jSONObject5.getString(Constants.KEY_CONTENT_TYPE);
                }
                str6 = jSONObject5.has(Constants.KEY_POSTER_URL) ? jSONObject5.getString(Constants.KEY_POSTER_URL) : "";
            }
            if (jSONObject.has(Constants.KEY_ACTION)) {
                jSONObject6 = jSONObject.getJSONObject(Constants.KEY_ACTION);
            } else {
                jSONObject6 = null;
            }
            if (jSONObject6 != null) {
                if (jSONObject6.has(Constants.KEY_URL)) {
                    jSONObject7 = jSONObject6.getJSONObject(Constants.KEY_URL);
                } else {
                    jSONObject7 = null;
                }
                if (jSONObject7 != null) {
                    if (jSONObject7.has("android")) {
                        jSONObject8 = jSONObject7.getJSONObject("android");
                    }
                    if (jSONObject8 != null && jSONObject8.has(Constants.KEY_TEXT)) {
                        str9 = jSONObject8.getString(Constants.KEY_TEXT);
                    }
                }
            }
            return new CleverTapDisplayUnitContent(str2, str, str4, str3, str5, str8, str7, str6, str9, null);
        } catch (Exception e) {
            Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Unable to init CleverTapDisplayUnitContent with JSON - " + e.getLocalizedMessage());
            return new CleverTapDisplayUnitContent("", "", "", "", "", "", "", "", "", "Error Creating DisplayUnit Content from JSON : " + e.getLocalizedMessage());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getActionUrl() {
        return this.actionUrl;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getError() {
        return this.error;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getMedia() {
        return this.media;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessageColor() {
        return this.messageColor;
    }

    public String getPosterUrl() {
        return this.posterUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitleColor() {
        return this.titleColor;
    }

    public boolean mediaIsAudio() {
        String str = this.contentType;
        if (str != null && this.media != null && str.startsWith("audio")) {
            return true;
        }
        return false;
    }

    public boolean mediaIsGIF() {
        String str = this.contentType;
        if (str != null && this.media != null && str.equals("image/gif")) {
            return true;
        }
        return false;
    }

    public boolean mediaIsImage() {
        String str = this.contentType;
        if (str != null && this.media != null && str.startsWith("image") && !this.contentType.equals("image/gif")) {
            return true;
        }
        return false;
    }

    public boolean mediaIsVideo() {
        String str = this.contentType;
        if (str != null && this.media != null && str.startsWith("video")) {
            return true;
        }
        return false;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ title:");
        sb2.append(this.title);
        sb2.append(", titleColor:");
        sb2.append(this.titleColor);
        sb2.append(" message:");
        sb2.append(this.message);
        sb2.append(", messageColor:");
        sb2.append(this.messageColor);
        sb2.append(", media:");
        sb2.append(this.media);
        sb2.append(", contentType:");
        sb2.append(this.contentType);
        sb2.append(", posterUrl:");
        sb2.append(this.posterUrl);
        sb2.append(", actionUrl:");
        sb2.append(this.actionUrl);
        sb2.append(", icon:");
        sb2.append(this.icon);
        sb2.append(", error:");
        return P0.gold(sb2, this.error, " ]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.title);
        parcel.writeString(this.titleColor);
        parcel.writeString(this.message);
        parcel.writeString(this.messageColor);
        parcel.writeString(this.icon);
        parcel.writeString(this.media);
        parcel.writeString(this.contentType);
        parcel.writeString(this.posterUrl);
        parcel.writeString(this.actionUrl);
        parcel.writeString(this.error);
    }

    private CleverTapDisplayUnitContent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.title = str;
        this.titleColor = str2;
        this.message = str3;
        this.messageColor = str4;
        this.icon = str5;
        this.media = str6;
        this.contentType = str7;
        this.posterUrl = str8;
        this.actionUrl = str9;
        this.error = str10;
    }

    private CleverTapDisplayUnitContent(Parcel parcel) {
        this.title = parcel.readString();
        this.titleColor = parcel.readString();
        this.message = parcel.readString();
        this.messageColor = parcel.readString();
        this.icon = parcel.readString();
        this.media = parcel.readString();
        this.contentType = parcel.readString();
        this.posterUrl = parcel.readString();
        this.actionUrl = parcel.readString();
        this.error = parcel.readString();
    }
}
