package t6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* renamed from: t6.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2967a3 {
    public static final boolean alpha(D0.g gVar) {
        int length = gVar.purple.length();
        List list = gVar.alpha;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                D0.e eVar = (D0.e) list.get(i4);
                if ((eVar.alpha instanceof D0.m) && D0.h.bravo(0, length, eVar.bravo, eVar.charlie)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final List bravo(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableList(new ArrayList(arrayList));
            }
            return Collections.singletonList(CollectionsKt.gold(arrayList));
        }
        return CollectionsKt.emptyList();
    }

    public static final Map charlie(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableMap(new LinkedHashMap(map));
            }
            Map.Entry entry = (Map.Entry) CollectionsKt.fuchsia(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return kotlin.collections.t.alpha;
    }
}
