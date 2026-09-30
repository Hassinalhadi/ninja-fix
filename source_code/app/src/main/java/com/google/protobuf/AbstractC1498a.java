package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1498a implements aj {
    protected int memoizedHashCode;

    public static void golf(List list, List list2) {
        Charset charset = AbstractC1517u.alpha;
        list.getClass();
        if (list instanceof x) {
            List charlie = ((x) list).charlie();
            x xVar = (x) list2;
            int size = list2.size();
            for (Object obj : charlie) {
                if (obj == null) {
                    String str = "Element at index " + (xVar.size() - size) + " is null.";
                    for (int size2 = xVar.size() - 1; size2 >= size; size2--) {
                        xVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C1502e) {
                    xVar.papa((C1502e) obj);
                } else {
                    xVar.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof aq) {
            list2.addAll(list);
            return;
        }
        if (list2 instanceof ArrayList) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size3 = list2.size();
        for (Object obj2 : list) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list2.size() - size3) + " is null.";
                for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                    list2.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list2.add(obj2);
        }
    }

    public abstract int hotel(au auVar);
}
