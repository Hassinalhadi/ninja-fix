package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class aw extends B implements av {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.core.impl.B, androidx.camera.core.impl.aw] */
    public static aw bravo() {
        return new B(new TreeMap(B.purple));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.camera.core.impl.B, androidx.camera.core.impl.aw] */
    public static aw delta(af afVar) {
        TreeMap treeMap = new TreeMap(B.purple);
        for (C0505c c0505c : afVar.romeo()) {
            Set<ae> beige = afVar.beige(c0505c);
            ArrayMap arrayMap = new ArrayMap();
            for (ae aeVar : beige) {
                arrayMap.put(aeVar, afVar.juliet(c0505c, aeVar));
            }
            treeMap.put(c0505c, arrayMap);
        }
        return new B(treeMap);
    }

    public final void foxtrot(C0505c c0505c, ae aeVar, Object obj) {
        ae aeVar2;
        TreeMap treeMap = this.alpha;
        Map map = (Map) treeMap.get(c0505c);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(c0505c, arrayMap);
            arrayMap.put(aeVar, obj);
            return;
        }
        ae aeVar3 = (ae) Collections.min(map.keySet());
        if (!Objects.equals(map.get(aeVar3), obj) && aeVar3 == (aeVar2 = ae.purple) && aeVar == aeVar2) {
            throw new IllegalArgumentException("Option values conflicts: " + c0505c.alpha + ", existing value (" + aeVar3 + ")=" + map.get(aeVar3) + ", conflicting (" + aeVar + ")=" + obj);
        }
        map.put(aeVar, obj);
    }

    public final void hotel(C0505c c0505c, Object obj) {
        foxtrot(c0505c, ae.red, obj);
    }
}
