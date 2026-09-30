package com.incognia.internal;

import com.incognia.EventProperties;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Uu {
    public final k7Q b(String str, String str2, EventProperties eventProperties, String str3, String str4) {
        LinkedHashMap linkedHashMap;
        if (eventProperties != null) {
            Map<String, Object> map = eventProperties.toMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.y.quebec(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
            }
            linkedHashMap = linkedHashMap2;
        } else {
            linkedHashMap = null;
        }
        k7Q k7q = new k7Q(str, str2, linkedHashMap, str3, str4);
        if (str == null && str2 == null && linkedHashMap == null && str3 == null) {
            if (str4 == null) {
                return null;
            }
            return k7q;
        }
        return k7q;
    }
}
