package com.clevertap.android.sdk.inbox;

import android.text.TextUtils;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.db.Column;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CTMessageDAO {
    private String campaignId;
    private long date;
    private long expires;

    /* renamed from: id, reason: collision with root package name */
    private String f6608id;
    private JSONObject jsonData;
    private boolean read;
    private List<String> tags;
    private String userId;
    private JSONObject wzrkParams;

    public CTMessageDAO() {
        this.tags = new ArrayList();
    }

    private static JSONObject getWzrkFields(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.startsWith(Constants.WZRK_PREFIX)) {
                jSONObject2.put(next, jSONObject.get(next));
            }
        }
        return jSONObject2;
    }

    public static CTMessageDAO initWithJSON(JSONObject jSONObject, String str) {
        String str2;
        long currentTimeMillis;
        long currentTimeMillis2;
        JSONObject jSONObject2;
        String str3;
        JSONArray jSONArray;
        try {
            if (jSONObject.has(Column.ID)) {
                str2 = jSONObject.getString(Column.ID);
            } else {
                str2 = null;
            }
            if (jSONObject.has(Constants.KEY_DATE)) {
                currentTimeMillis = jSONObject.getInt(Constants.KEY_DATE);
            } else {
                currentTimeMillis = System.currentTimeMillis() / 1000;
            }
            long j5 = currentTimeMillis;
            if (jSONObject.has("wzrk_ttl")) {
                currentTimeMillis2 = jSONObject.getInt("wzrk_ttl");
            } else {
                currentTimeMillis2 = (System.currentTimeMillis() + Constants.ONE_DAY_IN_MILLIS) / 1000;
            }
            long j6 = currentTimeMillis2;
            if (jSONObject.has(Constants.KEY_MSG)) {
                jSONObject2 = jSONObject.getJSONObject(Constants.KEY_MSG);
            } else {
                jSONObject2 = null;
            }
            ArrayList arrayList = new ArrayList();
            if (jSONObject2 != null) {
                if (jSONObject2.has("tags")) {
                    jSONArray = jSONObject2.getJSONArray("tags");
                } else {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        arrayList.add(jSONArray.getString(i4));
                    }
                }
            }
            if (jSONObject.has(Constants.NOTIFICATION_ID_TAG)) {
                str3 = jSONObject.getString(Constants.NOTIFICATION_ID_TAG);
            } else {
                str3 = Constants.TEST_IDENTIFIER;
            }
            if (str3.equalsIgnoreCase(Constants.TEST_IDENTIFIER)) {
                jSONObject.put(Constants.NOTIFICATION_ID_TAG, str3);
            }
            JSONObject wzrkFields = getWzrkFields(jSONObject);
            if (str2 == null) {
                return null;
            }
            return new CTMessageDAO(str2, jSONObject2, false, j5, j6, str, arrayList, str3, wzrkFields);
        } catch (JSONException e) {
            Logger.d("Unable to parse Notification inbox message to CTMessageDao - " + e.getLocalizedMessage());
            return null;
        }
    }

    public boolean containsVideoOrAudio() {
        Logger.d("CTMessageDAO:containsVideoOrAudio() called");
        CTInboxMessageContent cTInboxMessageContent = new CTInboxMessage(toJSON()).getInboxMessageContents().get(0);
        if (!cTInboxMessageContent.mediaIsVideo() && !cTInboxMessageContent.mediaIsAudio()) {
            return false;
        }
        return true;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public long getDate() {
        return this.date;
    }

    public long getExpires() {
        return this.expires;
    }

    public String getId() {
        return this.f6608id;
    }

    public JSONObject getJsonData() {
        return this.jsonData;
    }

    public String getTags() {
        return TextUtils.join(Constants.SEPARATOR_COMMA, this.tags);
    }

    public String getUserId() {
        return this.userId;
    }

    public JSONObject getWzrkParams() {
        return this.wzrkParams;
    }

    public int isRead() {
        if (this.read) {
            return 1;
        }
        return 0;
    }

    public void setCampaignId(String str) {
        this.campaignId = str;
    }

    public void setDate(long j5) {
        this.date = j5;
    }

    public void setExpires(long j5) {
        this.expires = j5;
    }

    public void setId(String str) {
        this.f6608id = str;
    }

    public void setJsonData(JSONObject jSONObject) {
        this.jsonData = jSONObject;
    }

    public void setRead(int i4) {
        boolean z2 = true;
        if (i4 != 1) {
            z2 = false;
        }
        this.read = z2;
    }

    public void setTags(String str) {
        this.tags.addAll(Arrays.asList(str.split(Constants.SEPARATOR_COMMA)));
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setWzrkParams(JSONObject jSONObject) {
        this.wzrkParams = jSONObject;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.KEY_ID, this.f6608id);
            jSONObject.put(Constants.KEY_MSG, this.jsonData);
            jSONObject.put("isRead", this.read);
            jSONObject.put(Constants.KEY_DATE, this.date);
            jSONObject.put("wzrk_ttl", this.expires);
            JSONArray jSONArray = new JSONArray();
            for (int i4 = 0; i4 < this.tags.size(); i4++) {
                jSONArray.put(this.tags.get(i4));
            }
            jSONObject.put("tags", jSONArray);
            jSONObject.put(Constants.NOTIFICATION_ID_TAG, this.campaignId);
            jSONObject.put("wzrkParams", this.wzrkParams);
            return jSONObject;
        } catch (JSONException e) {
            ad.emerald(e, new StringBuilder("Unable to convert CTMessageDao to JSON - "));
            return jSONObject;
        }
    }

    private CTMessageDAO(String str, JSONObject jSONObject, boolean z2, long j5, long j6, String str2, List<String> list, String str3, JSONObject jSONObject2) {
        new ArrayList();
        this.f6608id = str;
        this.jsonData = jSONObject;
        this.read = z2;
        this.date = j5;
        this.expires = j6;
        this.userId = str2;
        this.tags = list;
        this.campaignId = str3;
        this.wzrkParams = jSONObject2;
    }
}
