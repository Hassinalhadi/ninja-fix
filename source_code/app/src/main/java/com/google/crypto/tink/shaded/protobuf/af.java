package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class af extends ah {
    public static final Class charlie = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List delta(long j5, int i4, Object obj) {
        List arrayList;
        List list = (List) M.delta.india(j5, obj);
        if (list.isEmpty()) {
            if (list instanceof ae) {
                arrayList = new ad(i4);
            } else if ((list instanceof av) && (list instanceof aa)) {
                arrayList = ((aa) list).golf(i4);
            } else {
                arrayList = new ArrayList(i4);
            }
            M.oscar(obj, j5, arrayList);
            return arrayList;
        }
        if (charlie.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i4);
            arrayList2.addAll(list);
            M.oscar(obj, j5, arrayList2);
            return arrayList2;
        }
        if (list instanceof H) {
            ad adVar = new ad(list.size() + i4);
            adVar.addAll((H) list);
            M.oscar(obj, j5, adVar);
            return adVar;
        }
        if ((list instanceof av) && (list instanceof aa)) {
            aa aaVar = (aa) list;
            if (!((AbstractC1484b) aaVar).alpha) {
                aa golf = aaVar.golf(list.size() + i4);
                M.oscar(obj, j5, golf);
                return golf;
            }
        }
        return list;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ah
    public final void alpha(long j5, Object obj) {
        Object unmodifiableList;
        List list = (List) M.delta.india(j5, obj);
        if (list instanceof ae) {
            unmodifiableList = ((ae) list).echo();
        } else {
            if (!charlie.isAssignableFrom(list.getClass())) {
                if ((list instanceof av) && (list instanceof aa)) {
                    AbstractC1484b abstractC1484b = (AbstractC1484b) ((aa) list);
                    if (abstractC1484b.alpha) {
                        abstractC1484b.alpha = false;
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                return;
            }
        }
        M.oscar(obj, j5, unmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ah
    public final void bravo(x xVar, x xVar2, long j5) {
        List list = (List) M.delta.india(j5, xVar2);
        List delta = delta(j5, list.size(), xVar);
        int size = delta.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            delta.addAll(list);
        }
        if (size > 0) {
            list = delta;
        }
        M.oscar(xVar, j5, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ah
    public final List charlie(long j5, Object obj) {
        return delta(j5, 10, obj);
    }
}
