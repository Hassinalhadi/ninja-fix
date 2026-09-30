package E8;

import F8.m;
import F8.o;
import G6.q;
import J2.l;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    public final Context alpha;
    public final C7.b bravo;
    public final Executor charlie;
    public final F8.e delta;
    public final F8.e echo;
    public final F8.e foxtrot;
    public final F8.j golf;
    public final F8.k hotel;
    public final o india;
    public final l juliet;
    public final com.google.firebase.messaging.o kilo;

    public b(Context context, C7.b bVar, Executor executor, F8.e eVar, F8.e eVar2, F8.e eVar3, F8.j jVar, F8.k kVar, o oVar, l lVar, com.google.firebase.messaging.o oVar2) {
        this.alpha = context;
        this.bravo = bVar;
        this.charlie = executor;
        this.delta = eVar;
        this.echo = eVar2;
        this.foxtrot = eVar3;
        this.golf = jVar;
        this.hotel = kVar;
        this.india = oVar;
        this.juliet = lVar;
        this.kilo = oVar2;
    }

    public static b echo() {
        return ((j) B7.g.charlie().bravo(j.class)).bravo("firebase");
    }

    public static ArrayList hotel(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i4);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final q alpha() {
        F8.j jVar = this.golf;
        o oVar = jVar.golf;
        return jVar.alpha(oVar.alpha.getLong("minimum_fetch_interval_in_seconds", F8.j.india)).november(J7.i.alpha, new A8.a(12)).november(this.charlie, new a(this));
    }

    public final HashMap bravo() {
        F8.k kVar = this.hotel;
        HashSet hashSet = new HashSet();
        hashSet.addAll(F8.k.charlie(kVar.charlie));
        hashSet.addAll(F8.k.charlie(kVar.delta));
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            hashMap.put(str, kVar.echo(str));
        }
        return hashMap;
    }

    public final boolean charlie(String str) {
        F8.k kVar = this.hotel;
        F8.e eVar = kVar.charlie;
        String delta = F8.k.delta(eVar, str);
        Pattern pattern = F8.k.foxtrot;
        Pattern pattern2 = F8.k.echo;
        if (delta != null) {
            if (pattern2.matcher(delta).matches()) {
                kVar.bravo(str, eVar.charlie());
                return true;
            }
            if (pattern.matcher(delta).matches()) {
                kVar.bravo(str, eVar.charlie());
                return false;
            }
        }
        String delta2 = F8.k.delta(kVar.delta, str);
        if (delta2 != null) {
            if (pattern2.matcher(delta2).matches()) {
                return true;
            }
            if (pattern.matcher(delta2).matches()) {
                return false;
            }
        }
        F8.k.foxtrot(str, "Boolean");
        return false;
    }

    public final F8.q delta() {
        F8.q qVar;
        o oVar = this.india;
        synchronized (oVar.bravo) {
            try {
                oVar.alpha.getLong("last_fetch_time_in_millis", -1L);
                int i4 = oVar.alpha.getInt("last_fetch_status", 0);
                int[] iArr = F8.j.juliet;
                long j5 = oVar.alpha.getLong("fetch_timeout_in_seconds", 60L);
                if (j5 >= 0) {
                    long j6 = oVar.alpha.getLong("minimum_fetch_interval_in_seconds", F8.j.india);
                    if (j6 >= 0) {
                        qVar = new F8.q(i4);
                    } else {
                        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j6 + " is an invalid argument");
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j5)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long foxtrot(String str) {
        Long l10;
        F8.k kVar = this.hotel;
        F8.e eVar = kVar.charlie;
        F8.g charlie = eVar.charlie();
        Long l11 = null;
        if (charlie != null) {
            try {
                l10 = Long.valueOf(charlie.bravo.getLong(str));
            } catch (JSONException unused) {
                l10 = null;
            }
            if (l10 == null) {
                kVar.bravo(str, eVar.charlie());
                return l10.longValue();
            }
            F8.g charlie2 = kVar.delta.charlie();
            if (charlie2 != null) {
                try {
                    l11 = Long.valueOf(charlie2.bravo.getLong(str));
                } catch (JSONException unused2) {
                }
            }
            if (l11 != null) {
                return l11.longValue();
            }
            F8.k.foxtrot(str, "Long");
            return 0L;
        }
        l10 = null;
        if (l10 == null) {
        }
    }

    public final void golf(boolean z2) {
        l lVar = this.juliet;
        synchronized (lVar) {
            ((m) lVar.purple).kilo(z2);
            if (!z2) {
                lVar.echo();
            }
        }
    }
}
