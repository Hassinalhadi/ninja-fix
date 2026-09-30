package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.displayunits.CTDisplayUnitType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CleverTapDisplayUnit implements Parcelable {
    public static final Parcelable.Creator<CleverTapDisplayUnit> CREATOR = new Parcelable.Creator<CleverTapDisplayUnit>() { // from class: com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CleverTapDisplayUnit createFromParcel(Parcel parcel) {
            return new CleverTapDisplayUnit(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CleverTapDisplayUnit[] newArray(int i4) {
            return new CleverTapDisplayUnit[i4];
        }
    };
    private String bgColor;
    private ArrayList<CleverTapDisplayUnitContent> contents;
    private HashMap<String, String> customExtras;
    private String error;
    private JSONObject jsonObject;
    private CTDisplayUnitType type;
    private String unitID;

    public static CleverTapDisplayUnit toDisplayUnit(JSONObject jSONObject) {
        String str;
        CTDisplayUnitType cTDisplayUnitType;
        String str2;
        JSONArray jSONArray;
        try {
            if (jSONObject.has(Constants.NOTIFICATION_ID_TAG)) {
                str = jSONObject.getString(Constants.NOTIFICATION_ID_TAG);
            } else {
                str = Constants.TEST_IDENTIFIER;
            }
            String str3 = str;
            JSONObject jSONObject2 = null;
            if (jSONObject.has(Constants.KEY_TYPE)) {
                cTDisplayUnitType = CTDisplayUnitType.type(jSONObject.getString(Constants.KEY_TYPE));
            } else {
                cTDisplayUnitType = null;
            }
            if (jSONObject.has(Constants.KEY_BG)) {
                str2 = jSONObject.getString(Constants.KEY_BG);
            } else {
                str2 = "";
            }
            String str4 = str2;
            if (jSONObject.has(Constants.KEY_CONTENT)) {
                jSONArray = jSONObject.getJSONArray(Constants.KEY_CONTENT);
            } else {
                jSONArray = null;
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    CleverTapDisplayUnitContent content = CleverTapDisplayUnitContent.toContent(jSONArray.getJSONObject(i4));
                    if (TextUtils.isEmpty(content.getError())) {
                        arrayList.add(content);
                    }
                }
            }
            if (jSONObject.has(Constants.KEY_CUSTOM_KV)) {
                jSONObject2 = jSONObject.getJSONObject(Constants.KEY_CUSTOM_KV);
            }
            return new CleverTapDisplayUnit(jSONObject, str3, cTDisplayUnitType, str4, arrayList, jSONObject2, null);
        } catch (Exception e) {
            Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Unable to init CleverTapDisplayUnit with JSON - " + e.getLocalizedMessage());
            return new CleverTapDisplayUnit(null, "", null, null, null, null, "Error Creating Display Unit from JSON : " + e.getLocalizedMessage());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public ArrayList<CleverTapDisplayUnitContent> getContents() {
        return this.contents;
    }

    public HashMap<String, String> getCustomExtras() {
        return this.customExtras;
    }

    public String getError() {
        return this.error;
    }

    public JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public HashMap<String, String> getKeyValues(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                if (keys != null) {
                    HashMap<String, String> hashMap = null;
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string = jSONObject.getString(next);
                        if (!TextUtils.isEmpty(next)) {
                            if (hashMap == null) {
                                hashMap = new HashMap<>();
                            }
                            hashMap.put(next, string);
                        }
                    }
                    return hashMap;
                }
            } catch (Exception e) {
                Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Error in getting Key Value Pairs " + e.getLocalizedMessage());
            }
        }
        return null;
    }

    public CTDisplayUnitType getType() {
        return this.type;
    }

    public String getUnitID() {
        return this.unitID;
    }

    public JSONObject getWZRKFields() {
        try {
            JSONObject jSONObject = this.jsonObject;
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                JSONObject jSONObject2 = new JSONObject();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.startsWith(Constants.WZRK_PREFIX)) {
                        jSONObject2.put(next, this.jsonObject.get(next));
                    }
                }
                return jSONObject2;
            }
            return null;
        } catch (Exception e) {
            Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Error in getting WiZRK fields " + e.getLocalizedMessage());
            return null;
        }
    }

    public String toString() {
        String str;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Constants.AES_PREFIX);
            sb2.append(" Unit id- ");
            sb2.append(this.unitID);
            sb2.append(", Type- ");
            CTDisplayUnitType cTDisplayUnitType = this.type;
            if (cTDisplayUnitType != null) {
                str = cTDisplayUnitType.toString();
            } else {
                str = null;
            }
            sb2.append(str);
            sb2.append(", bgColor- ");
            sb2.append(this.bgColor);
            ArrayList<CleverTapDisplayUnitContent> arrayList = this.contents;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i4 = 0; i4 < this.contents.size(); i4++) {
                    CleverTapDisplayUnitContent cleverTapDisplayUnitContent = this.contents.get(i4);
                    if (cleverTapDisplayUnitContent != null) {
                        sb2.append(", Content Item:");
                        sb2.append(i4);
                        sb2.append(" ");
                        sb2.append(cleverTapDisplayUnitContent.toString());
                        sb2.append("\n");
                    }
                }
            }
            if (this.customExtras != null) {
                sb2.append(", Custom KV:");
                sb2.append(this.customExtras);
            }
            sb2.append(", JSON -");
            sb2.append(this.jsonObject);
            sb2.append(", Error-");
            sb2.append(this.error);
            sb2.append(" ]");
            return sb2.toString();
        } catch (Exception e) {
            Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Exception in toString:" + e);
            return super.toString();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.unitID);
        parcel.writeValue(this.type);
        parcel.writeString(this.bgColor);
        if (this.contents == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.contents);
        }
        parcel.writeMap(this.customExtras);
        if (this.jsonObject == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.jsonObject.toString());
        }
        parcel.writeString(this.error);
    }

    private CleverTapDisplayUnit(JSONObject jSONObject, String str, CTDisplayUnitType cTDisplayUnitType, String str2, ArrayList<CleverTapDisplayUnitContent> arrayList, JSONObject jSONObject2, String str3) {
        this.jsonObject = jSONObject;
        this.unitID = str;
        this.type = cTDisplayUnitType;
        this.bgColor = str2;
        this.contents = arrayList;
        this.customExtras = getKeyValues(jSONObject2);
        this.error = str3;
    }

    private CleverTapDisplayUnit(Parcel parcel) {
        try {
            this.unitID = parcel.readString();
            this.type = (CTDisplayUnitType) parcel.readValue(CTDisplayUnitType.class.getClassLoader());
            this.bgColor = parcel.readString();
            JSONObject jSONObject = null;
            if (parcel.readByte() == 1) {
                ArrayList<CleverTapDisplayUnitContent> arrayList = new ArrayList<>();
                this.contents = arrayList;
                parcel.readList(arrayList, CleverTapDisplayUnitContent.class.getClassLoader());
            } else {
                this.contents = null;
            }
            this.customExtras = parcel.readHashMap(null);
            if (parcel.readByte() != 0) {
                jSONObject = new JSONObject(parcel.readString());
            }
            this.jsonObject = jSONObject;
            this.error = parcel.readString();
        } catch (Exception e) {
            String str = "Error Creating Display Unit from parcel : " + e.getLocalizedMessage();
            this.error = str;
            Logger.d(Constants.FEATURE_DISPLAY_UNIT, str);
        }
    }
}
