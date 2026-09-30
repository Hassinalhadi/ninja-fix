package O5;

import B5.d;
import android.util.SparseArray;
import ao.ad;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class a {
    public static final SparseArray alpha = new SparseArray();
    public static final HashMap bravo;

    static {
        HashMap hashMap = new HashMap();
        bravo = hashMap;
        hashMap.put(d.alpha, 0);
        hashMap.put(d.purple, 1);
        hashMap.put(d.red, 2);
        for (d dVar : hashMap.keySet()) {
            alpha.append(((Integer) bravo.get(dVar)).intValue(), dVar);
        }
    }

    public static int alpha(d dVar) {
        Integer num = (Integer) bravo.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d bravo(int i4) {
        d dVar = (d) alpha.get(i4);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(ad.zulu(i4, "Unknown Priority for value "));
    }
}
