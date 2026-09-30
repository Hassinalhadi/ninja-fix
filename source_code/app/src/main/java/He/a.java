package He;

import java.util.LinkedHashMap;
import kotlin.collections.y;

/* loaded from: classes2.dex */
public enum a {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);

    public static final LinkedHashMap purple;
    public final int alpha;

    static {
        a[] values = values();
        int quebec = y.quebec(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec < 16 ? 16 : quebec);
        for (a aVar : values) {
            linkedHashMap.put(Integer.valueOf(aVar.alpha), aVar);
        }
        purple = linkedHashMap;
    }

    a(int i4) {
        this.alpha = i4;
    }
}
