package s8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t6.Z1;

/* loaded from: classes2.dex */
public final class f extends Z1 {
    public static f alpha;
    public static final Map bravo;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(461L, "FIREPERF_AUTOPUSH");
        hashMap.put(462L, "FIREPERF");
        hashMap.put(675L, "FIREPERF_INTERNAL_LOW");
        hashMap.put(676L, "FIREPERF_INTERNAL_HIGH");
        bravo = Collections.unmodifiableMap(hashMap);
    }

    @Override // t6.Z1
    public final String bravo() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
