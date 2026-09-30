package com.incognia.internal;

import android.hardware.Sensor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes2.dex */
public final class Bym {
    public static ArrayList b(List list) {
        int collectionSizeOrDefault;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Sensor sensor = (Sensor) it.next();
            arrayList.add(new pBF(sensor.getName(), sensor.getVendor()));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            pBF pbf = (pBF) obj;
            if (pbf.f11057b != null || pbf.f11056W != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }
}
