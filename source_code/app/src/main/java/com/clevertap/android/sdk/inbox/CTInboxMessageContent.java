package com.clevertap.android.sdk.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CTInboxMessageContent implements Parcelable {
    public static final Parcelable.Creator<CTInboxMessageContent> CREATOR = new Parcelable.Creator<CTInboxMessageContent>() { // from class: com.clevertap.android.sdk.inbox.CTInboxMessageContent.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CTInboxMessageContent createFromParcel(Parcel parcel) {
            return new CTInboxMessageContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CTInboxMessageContent[] newArray(int i4) {
            return new CTInboxMessageContent[i4];
        }
    };
    private String actionUrl;
    private String contentType;
    private Boolean hasLinks;
    private Boolean hasUrl;
    private String icon;
    private String iconContentDescription;
    private JSONArray links;
    private String media;
    private String mediaContentDescription;
    private String message;
    private String messageColor;
    private String posterUrl;
    private String title;
    private String titleColor;

    public CTInboxMessageContent() {
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

    public String getIcon() {
        return this.icon;
    }

    public String getIconContentDescription() {
        return this.iconContentDescription;
    }

    public String getLinkBGColor(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(Constants.KEY_BG)) {
                return jSONObject.getString(Constants.KEY_BG);
            }
            return "";
        } catch (JSONException e) {
            ad.emerald(e, new StringBuilder("Unable to get Link Text Color with JSON - "));
            return null;
        }
    }

    public String getLinkColor(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(Constants.KEY_COLOR)) {
                return jSONObject.getString(Constants.KEY_COLOR);
            }
            return "";
        } catch (JSONException e) {
            ad.emerald(e, new StringBuilder("Unable to get Link Text Color with JSON - "));
            return null;
        }
    }

    public String getLinkCopyText(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return "";
        }
        try {
            if (jSONObject.has("copyText")) {
                jSONObject2 = jSONObject.getJSONObject("copyText");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 == null || !jSONObject2.has(Constants.KEY_TEXT)) {
                return "";
            }
            return jSONObject2.getString(Constants.KEY_TEXT);
        } catch (JSONException e) {
            ad.emerald(e, new StringBuilder("Unable to get Link Text with JSON - "));
            return "";
        }
    }

    public HashMap<String, String> getLinkKeyValue(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has(Constants.KEY_KV)) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.KEY_KV);
                Iterator<String> keys = jSONObject2.keys();
                HashMap<String, String> hashMap = new HashMap<>();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject2.getString(next);
                    if (!TextUtils.isEmpty(next)) {
                        hashMap.put(next, string);
                    }
                }
                if (hashMap.isEmpty()) {
                    return null;
                }
                return hashMap;
            } catch (JSONException e) {
                ad.emerald(e, new StringBuilder("Unable to get Link Key Value with JSON - "));
            }
        }
        return null;
    }

    public String getLinkText(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(Constants.KEY_TEXT)) {
                return jSONObject.getString(Constants.KEY_TEXT);
            }
            return "";
        } catch (JSONException e) {
            ad.emerald(e, new StringBuilder("Unable to get Link Text with JSON - "));
            return null;
        }
    }

    public String getLinkUrl(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(Constants.KEY_URL)) {
                jSONObject2 = jSONObject.getJSONObject(Constants.KEY_URL);
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 == null) {
                return null;
            }
            if (jSONObject2.has("android")) {
                jSONObject3 = jSONObject2.getJSONObject("android");
            } else {
                jSONObject3 = null;
            }
            if (jSONObject3 == null || !jSONObject3.has(Constants.KEY_TEXT)) {
                return "";
            }
            return jSONObject3.getString(Constants.KEY_TEXT);
        } catch (JSONException e) {
            ad.emerald(e, new StringBuilder("Unable to get Link URL with JSON - "));
            return null;
        }
    }

    public JSONArray getLinks() {
        return this.links;
    }

    public String getLinktype(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(Constants.KEY_TYPE)) {
                return jSONObject.getString(Constants.KEY_TYPE);
            }
            return "";
        } catch (JSONException e) {
            ad.emerald(e, new StringBuilder("Unable to get Link Type with JSON - "));
            return null;
        }
    }

    public String getMedia() {
        return this.media;
    }

    public String getMediaContentDescription() {
        return this.mediaContentDescription;
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

    public CTInboxMessageContent initWithJSON(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        boolean z2;
        JSONObject jSONObject7;
        JSONArray jSONArray;
        JSONObject jSONObject8;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        try {
            if (jSONObject.has(Constants.KEY_TITLE)) {
                jSONObject2 = jSONObject.getJSONObject(Constants.KEY_TITLE);
            } else {
                jSONObject2 = null;
            }
            String str10 = "";
            if (jSONObject2 != null) {
                if (jSONObject2.has(Constants.KEY_TEXT)) {
                    String string = jSONObject2.getString(Constants.KEY_TEXT);
                    str = Constants.KEY_LINKS;
                    str8 = string;
                } else {
                    str = Constants.KEY_LINKS;
                    str8 = "";
                }
                this.title = str8;
                if (!jSONObject2.has(Constants.KEY_COLOR)) {
                    str9 = "";
                } else {
                    str9 = jSONObject2.getString(Constants.KEY_COLOR);
                }
                this.titleColor = str9;
            } else {
                str = Constants.KEY_LINKS;
            }
            if (jSONObject.has(Constants.KEY_MESSAGE)) {
                jSONObject3 = jSONObject.getJSONObject(Constants.KEY_MESSAGE);
            } else {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                if (!jSONObject3.has(Constants.KEY_TEXT)) {
                    str6 = "";
                } else {
                    str6 = jSONObject3.getString(Constants.KEY_TEXT);
                }
                this.message = str6;
                if (!jSONObject3.has(Constants.KEY_COLOR)) {
                    str7 = "";
                } else {
                    str7 = jSONObject3.getString(Constants.KEY_COLOR);
                }
                this.messageColor = str7;
            }
            if (jSONObject.has(Constants.KEY_ICON)) {
                jSONObject4 = jSONObject.getJSONObject(Constants.KEY_ICON);
            } else {
                jSONObject4 = null;
            }
            if (jSONObject4 != null) {
                if (!jSONObject4.has(Constants.KEY_URL)) {
                    str5 = "";
                } else {
                    str5 = jSONObject4.getString(Constants.KEY_URL);
                }
                this.icon = str5;
                this.iconContentDescription = jSONObject4.optString(Constants.KEY_ALT_TEXT, "");
            }
            if (jSONObject.has(Constants.KEY_MEDIA)) {
                jSONObject5 = jSONObject.getJSONObject(Constants.KEY_MEDIA);
            } else {
                jSONObject5 = null;
            }
            if (jSONObject5 != null) {
                if (!jSONObject5.has(Constants.KEY_URL)) {
                    str2 = "";
                } else {
                    str2 = jSONObject5.getString(Constants.KEY_URL);
                }
                this.media = str2;
                this.mediaContentDescription = jSONObject5.optString(Constants.KEY_ALT_TEXT, "");
                if (!jSONObject5.has(Constants.KEY_CONTENT_TYPE)) {
                    str3 = "";
                } else {
                    str3 = jSONObject5.getString(Constants.KEY_CONTENT_TYPE);
                }
                this.contentType = str3;
                if (!jSONObject5.has(Constants.KEY_POSTER_URL)) {
                    str4 = "";
                } else {
                    str4 = jSONObject5.getString(Constants.KEY_POSTER_URL);
                }
                this.posterUrl = str4;
            }
            if (jSONObject.has(Constants.KEY_ACTION)) {
                jSONObject6 = jSONObject.getJSONObject(Constants.KEY_ACTION);
            } else {
                jSONObject6 = null;
            }
            if (jSONObject6 != null) {
                boolean z10 = false;
                if (jSONObject6.has(Constants.KEY_HAS_URL) && jSONObject6.getBoolean(Constants.KEY_HAS_URL)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.hasUrl = Boolean.valueOf(z2);
                if (jSONObject6.has(Constants.KEY_HAS_LINKS) && jSONObject6.getBoolean(Constants.KEY_HAS_LINKS)) {
                    z10 = true;
                }
                this.hasLinks = Boolean.valueOf(z10);
                if (jSONObject6.has(Constants.KEY_URL)) {
                    jSONObject7 = jSONObject6.getJSONObject(Constants.KEY_URL);
                } else {
                    jSONObject7 = null;
                }
                if (jSONObject7 != null && this.hasUrl.booleanValue()) {
                    if (jSONObject7.has("android")) {
                        jSONObject8 = jSONObject7.getJSONObject("android");
                    } else {
                        jSONObject8 = null;
                    }
                    if (jSONObject8 != null) {
                        if (jSONObject8.has(Constants.KEY_TEXT)) {
                            str10 = jSONObject8.getString(Constants.KEY_TEXT);
                        }
                        this.actionUrl = str10;
                    }
                }
                if (jSONObject7 != null && this.hasLinks.booleanValue()) {
                    String str11 = str;
                    if (jSONObject6.has(str11)) {
                        jSONArray = jSONObject6.getJSONArray(str11);
                    } else {
                        jSONArray = null;
                    }
                    this.links = jSONArray;
                    return this;
                }
            }
        } catch (JSONException e) {
            ad.emerald(e, new StringBuilder("Unable to init CTInboxMessageContent with JSON - "));
        }
        return this;
    }

    public boolean isFallbackSettingsEnabled(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            if (!jSONObject.has(Constants.KEY_FALLBACK_NOTIFICATION_SETTINGS)) {
                return false;
            }
            return jSONObject.getBoolean(Constants.KEY_FALLBACK_NOTIFICATION_SETTINGS);
        } catch (JSONException e) {
            ad.emerald(e, new StringBuilder("Unable to get fallback settings key with JSON - "));
            return false;
        }
    }

    public boolean mediaIsAudio() {
        String contentType = getContentType();
        if (contentType != null && this.media != null && contentType.startsWith("audio")) {
            return true;
        }
        return false;
    }

    public boolean mediaIsGIF() {
        String contentType = getContentType();
        if (contentType != null && this.media != null && contentType.equals("image/gif")) {
            return true;
        }
        return false;
    }

    public boolean mediaIsImage() {
        String contentType = getContentType();
        if (contentType != null && this.media != null && contentType.startsWith("image") && !contentType.equals("image/gif")) {
            return true;
        }
        return false;
    }

    public boolean mediaIsStreamable() {
        if (!mediaIsAudio() && !mediaIsVideo()) {
            return false;
        }
        return true;
    }

    public boolean mediaIsVideo() {
        String contentType = getContentType();
        if (contentType != null && this.media != null && contentType.startsWith("video")) {
            return true;
        }
        return false;
    }

    public void setActionUrl(String str) {
        this.actionUrl = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setIconContentDescription(String str) {
        this.iconContentDescription = str;
    }

    public void setLinks(JSONArray jSONArray) {
        this.links = jSONArray;
    }

    public void setMedia(String str) {
        this.media = str;
    }

    public void setMediaContentDescription(String str) {
        this.mediaContentDescription = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setMessageColor(String str) {
        this.messageColor = str;
    }

    public void setPosterUrl(String str) {
        this.posterUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTitleColor(String str) {
        this.titleColor = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.title);
        parcel.writeString(this.titleColor);
        parcel.writeString(this.message);
        parcel.writeString(this.messageColor);
        parcel.writeString(this.media);
        parcel.writeString(this.mediaContentDescription);
        parcel.writeByte(this.hasUrl.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hasLinks.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeString(this.actionUrl);
        parcel.writeString(this.icon);
        parcel.writeString(this.iconContentDescription);
        if (this.links == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.links.toString());
        }
        parcel.writeString(this.contentType);
        parcel.writeString(this.posterUrl);
    }

    public CTInboxMessageContent(Parcel parcel) {
        this.title = parcel.readString();
        this.titleColor = parcel.readString();
        this.message = parcel.readString();
        this.messageColor = parcel.readString();
        this.media = parcel.readString();
        this.mediaContentDescription = parcel.readString();
        this.hasUrl = Boolean.valueOf(parcel.readByte() != 0);
        this.hasLinks = Boolean.valueOf(parcel.readByte() != 0);
        this.actionUrl = parcel.readString();
        this.icon = parcel.readString();
        this.iconContentDescription = parcel.readString();
        try {
            this.links = parcel.readByte() == 0 ? null : new JSONArray(parcel.readString());
        } catch (JSONException e) {
            ad.emerald(e, new StringBuilder("Unable to init CTInboxMessageContent with Parcel - "));
        }
        this.contentType = parcel.readString();
        this.posterUrl = parcel.readString();
    }
}
