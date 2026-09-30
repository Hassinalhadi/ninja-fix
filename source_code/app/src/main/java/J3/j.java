package J3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class j {
    public static final Map delta;
    public boolean alpha = true;
    public Map bravo = delta;
    public boolean charlie = true;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = property.charAt(i4);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb2.append(charAt);
                } else {
                    sb2.append('?');
                }
            }
            property = sb2.toString();
        }
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put("User-Agent", Collections.singletonList(new k(property)));
        }
        delta = Collections.unmodifiableMap(hashMap);
    }

    public final void alpha() {
        k kVar = new k("your-user-agent");
        if (this.charlie) {
            bravo();
            List list = (List) this.bravo.get("User-Agent");
            if (list == null) {
                list = new ArrayList();
                this.bravo.put("User-Agent", list);
            }
            list.clear();
            list.add(kVar);
            if (this.charlie) {
                this.charlie = false;
                return;
            }
            return;
        }
        bravo();
        List list2 = (List) this.bravo.get("User-Agent");
        if (list2 == null) {
            list2 = new ArrayList();
            this.bravo.put("User-Agent", list2);
        }
        list2.add(kVar);
    }

    public final void bravo() {
        if (this.alpha) {
            this.alpha = false;
            HashMap hashMap = new HashMap(this.bravo.size());
            for (Map.Entry entry : this.bravo.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            this.bravo = hashMap;
        }
    }
}
