package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt;
import s6.AbstractC2743p6;

/* loaded from: classes2.dex */
public abstract class np {
    public static final byte[] b(String str) {
        int collectionSizeOrDefault;
        byte[] byteArray;
        if (str.length() % 2 == 0) {
            ArrayList azure = StringsKt.azure(str);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(azure, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = azure.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                AbstractC2743p6.alpha(16);
                arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
            }
            byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
            return byteArray;
        }
        throw new IllegalStateException("Must have an even length");
    }
}
