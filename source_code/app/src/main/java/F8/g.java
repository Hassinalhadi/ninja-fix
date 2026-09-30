package F8;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g {
    public static final Date hotel = new Date(0);
    public final JSONObject alpha;
    public final JSONObject bravo;
    public final Date charlie;
    public final JSONArray delta;
    public final JSONObject echo;
    public final long foxtrot;
    public final JSONArray golf;

    public g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j5, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j5);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.bravo = jSONObject;
        this.charlie = date;
        this.delta = jSONArray;
        this.echo = jSONObject2;
        this.foxtrot = j5;
        this.golf = jSONArray2;
        this.alpha = jSONObject3;
    }

    public static g alpha(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, F8.f] */
    public static f charlie() {
        ?? obj = new Object();
        obj.alpha = new JSONObject();
        obj.bravo = hotel;
        obj.charlie = new JSONArray();
        obj.delta = new JSONObject();
        obj.echo = 0L;
        obj.foxtrot = new JSONArray();
        return obj;
    }

    public final HashMap bravo() {
        HashMap hashMap = new HashMap();
        int i4 = 0;
        while (true) {
            JSONArray jSONArray = this.golf;
            if (i4 < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                String string = jSONObject.getString("rolloutId");
                String string2 = jSONObject.getString("variantId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                    String string3 = jSONArray2.getString(i5);
                    if (!hashMap.containsKey(string3)) {
                        hashMap.put(string3, new HashMap());
                    }
                    Map map = (Map) hashMap.get(string3);
                    if (map != null) {
                        map.put(string, string2);
                    }
                }
                i4++;
            } else {
                return hashMap;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.alpha.toString().equals(((g) obj).alpha.toString());
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return this.alpha.toString();
    }
}
