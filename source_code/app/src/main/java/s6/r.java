package s6;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class r implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (t6.ad.bravo(getKey(), entry.getKey()) && t6.ad.bravo(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
        int i4 = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i4 = value.hashCode();
        }
        return hashCode ^ i4;
    }

    public final String toString() {
        return ao.ad.amber(String.valueOf(getKey()), "=", String.valueOf(getValue()));
    }
}
