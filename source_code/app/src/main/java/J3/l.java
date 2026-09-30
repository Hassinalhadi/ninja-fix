package J3;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l implements i {
    public final Map bravo;
    public volatile Map charlie;

    public l(Map map) {
        this.bravo = Collections.unmodifiableMap(map);
    }

    public final HashMap alpha() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.bravo.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                String str = ((k) list.get(i4)).alpha;
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                    if (i4 != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                hashMap.put(entry.getKey(), sb3);
            }
        }
        return hashMap;
    }

    public final Map bravo() {
        if (this.charlie == null) {
            synchronized (this) {
                try {
                    if (this.charlie == null) {
                        this.charlie = Collections.unmodifiableMap(alpha());
                    }
                } finally {
                }
            }
        }
        return this.charlie;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.bravo.equals(((l) obj).bravo);
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.bravo + '}';
    }
}
