package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes2.dex */
public abstract class njx {
    public static final Set b(Set set) {
        int collectionSizeOrDefault;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).toLowerCase(Locale.ROOT));
        }
        return CollectionsKt.C(arrayList);
    }
}
