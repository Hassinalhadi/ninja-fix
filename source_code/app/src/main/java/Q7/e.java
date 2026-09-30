package Q7;

import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e {
    public final HashMap alpha = new HashMap();
    public final int bravo = 64;
    public final int charlie;

    public e(int i4) {
        this.charlie = i4;
    }

    public static String bravo(int i4, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i4) {
                return str.substring(0, i4);
            }
        }
        return str;
    }

    public final synchronized Map alpha() {
        return Collections.unmodifiableMap(new HashMap(this.alpha));
    }

    public final synchronized boolean charlie(String str, String str2) {
        boolean equals;
        if (str != null) {
            String bravo = bravo(this.charlie, str);
            if (this.alpha.size() >= this.bravo && !this.alpha.containsKey(bravo)) {
                Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.bravo, null);
                return false;
            }
            String bravo2 = bravo(this.charlie, str2);
            String str3 = (String) this.alpha.get(bravo);
            if (str3 == null) {
                if (bravo2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = str3.equals(bravo2);
            }
            if (equals) {
                return false;
            }
            HashMap hashMap = this.alpha;
            if (str2 == null) {
                bravo2 = "";
            }
            hashMap.put(bravo, bravo2);
            return true;
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public final synchronized void delta(Map map) {
        String bravo;
        try {
            int i4 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String bravo2 = bravo(this.charlie, str);
                    if (this.alpha.size() >= this.bravo && !this.alpha.containsKey(bravo2)) {
                        i4++;
                    }
                    String str2 = (String) entry.getValue();
                    HashMap hashMap = this.alpha;
                    if (str2 == null) {
                        bravo = "";
                    } else {
                        bravo = bravo(this.charlie, str2);
                    }
                    hashMap.put(bravo2, bravo);
                } else {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
            }
            if (i4 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i4 + " entries when adding custom keys. Maximum allowable: " + this.bravo, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
