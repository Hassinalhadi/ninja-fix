package com.incognia.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes2.dex */
public final class lDy {
    public final LinkedHashMap b(List list) {
        int collectionSizeOrDefault;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        int quebec = kotlin.collections.y.quebec(collectionSizeOrDefault);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MM mm = (MM) it.next();
            zPj zpj = new zPj(mm.PqK, mm.f9113J);
            double pow = Math.pow(2.0d, mm.f9116b / 10.0d);
            if (mm.sVU) {
                pow *= 3.0d;
            }
            Pair pair = new Pair(zpj, Double.valueOf(pow));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
