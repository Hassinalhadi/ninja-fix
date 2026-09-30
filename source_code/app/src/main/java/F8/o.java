package F8;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o {
    public static final Date echo = new Date(-1);
    public static final Date foxtrot = new Date(-1);
    public final SharedPreferences alpha;
    public final Object bravo = new Object();
    public final Object charlie = new Object();
    public final Object delta = new Object();

    public o(SharedPreferences sharedPreferences) {
        this.alpha = sharedPreferences;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [F8.n, java.lang.Object] */
    public final n alpha() {
        ?? obj;
        synchronized (this.charlie) {
            int i4 = this.alpha.getInt("num_failed_fetches", 0);
            Date date = new Date(this.alpha.getLong("backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.alpha = i4;
            obj.bravo = date;
        }
        return obj;
    }

    public final HashMap bravo() {
        try {
            JSONObject jSONObject = new JSONObject(this.alpha.getString("customSignals", "{}"));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [F8.n, java.lang.Object] */
    public final n charlie() {
        ?? obj;
        synchronized (this.delta) {
            int i4 = this.alpha.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.alpha.getLong("realtime_backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.alpha = i4;
            obj.bravo = date;
        }
        return obj;
    }

    public final void delta(Date date, int i4) {
        synchronized (this.charlie) {
            this.alpha.edit().putInt("num_failed_fetches", i4).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void echo(String str) {
        synchronized (this.bravo) {
            this.alpha.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void foxtrot(Date date, int i4) {
        synchronized (this.delta) {
            this.alpha.edit().putInt("num_failed_realtime_streams", i4).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void golf() {
        synchronized (this.bravo) {
            this.alpha.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void hotel() {
        synchronized (this.bravo) {
            this.alpha.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
