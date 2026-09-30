package g8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class g {
    public final SharedPreferences alpha;

    public g(Context context, String str) {
        this.alpha = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void alpha() {
        try {
            long j5 = this.alpha.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.alpha.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.alpha.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.alpha.edit().putStringSet(str, hashSet).putLong("fire-count", j5 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void bravo() {
        try {
            SharedPreferences.Editor edit = this.alpha.edit();
            int i4 = 0;
            for (Map.Entry<String, ?> entry : this.alpha.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String delta = delta(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(delta)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(delta);
                        i4++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i4 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i4);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList charlie() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.alpha.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(delta(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C1757a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            lima(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String delta(long j5) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j5).toInstant();
            unused = ZoneOffset.UTC;
            atOffset = instant.atOffset(ZoneOffset.UTC);
            localDateTime = atOffset.toLocalDateTime();
            unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j5));
    }

    public final synchronized String echo(String str) {
        for (Map.Entry<String, ?> entry : this.alpha.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized boolean foxtrot(long j5, long j6) {
        return delta(j5).equals(delta(j6));
    }

    public final synchronized void golf() {
        String delta = delta(System.currentTimeMillis());
        this.alpha.edit().putString("last-used-date", delta).commit();
        hotel(delta);
    }

    public final synchronized void hotel(String str) {
        try {
            String echo = echo(str);
            if (echo == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.alpha.getStringSet(echo, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.alpha.edit().remove(echo).commit();
            } else {
                this.alpha.edit().putStringSet(echo, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean india(long j5) {
        return juliet(j5);
    }

    public final synchronized boolean juliet(long j5) {
        if (this.alpha.contains("fire-global")) {
            if (!foxtrot(this.alpha.getLong("fire-global", -1L), j5)) {
                this.alpha.edit().putLong("fire-global", j5).commit();
                return true;
            }
            return false;
        }
        this.alpha.edit().putLong("fire-global", j5).commit();
        return true;
    }

    public final synchronized void kilo(long j5, String str) {
        String delta = delta(j5);
        if (this.alpha.getString("last-used-date", "").equals(delta)) {
            String echo = echo(delta);
            if (echo == null) {
                return;
            }
            if (echo.equals(str)) {
                return;
            }
            mike(str, delta);
            return;
        }
        long j6 = this.alpha.getLong("fire-count", 0L);
        if (j6 + 1 == 30) {
            alpha();
            j6 = this.alpha.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.alpha.getStringSet(str, new HashSet()));
        hashSet.add(delta);
        this.alpha.edit().putStringSet(str, hashSet).putLong("fire-count", j6 + 1).putString("last-used-date", delta).commit();
    }

    public final synchronized void lima(long j5) {
        this.alpha.edit().putLong("fire-global", j5).commit();
    }

    public final synchronized void mike(String str, String str2) {
        hotel(str2);
        HashSet hashSet = new HashSet(this.alpha.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.alpha.edit().putStringSet(str, hashSet).commit();
    }
}
