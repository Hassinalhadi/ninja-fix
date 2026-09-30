package com.incognia.internal;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class wNN {
    public static final void b(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i4) {
        if (i4 == arrayList2.size()) {
            arrayList.add(arrayList3);
            return;
        }
        int i5 = i4 + 1;
        b(arrayList, arrayList2, new ArrayList(arrayList3), i5);
        arrayList3.add(arrayList2.get(i4));
        b(arrayList, arrayList2, new ArrayList(arrayList3), i5);
    }
}
