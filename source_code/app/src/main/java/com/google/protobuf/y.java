package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class y extends aa {
    public static final Class charlie = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.protobuf.aa
    public final void alpha(long j5, Object obj) {
        Object unmodifiableList;
        List list = (List) L.charlie.india(j5, obj);
        if (list instanceof x) {
            unmodifiableList = ((x) list).echo();
        } else {
            if (!charlie.isAssignableFrom(list.getClass())) {
                if ((list instanceof aq) && (list instanceof InterfaceC1516t)) {
                    AbstractC1499b abstractC1499b = (AbstractC1499b) ((InterfaceC1516t) list);
                    boolean z2 = abstractC1499b.alpha;
                    if (z2 && z2) {
                        abstractC1499b.alpha = false;
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                return;
            }
        }
        L.oscar(obj, j5, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.aa
    public final void bravo(Object obj, long j5, Object obj2) {
        w wVar;
        K k6 = L.charlie;
        List list = (List) k6.india(j5, obj2);
        int size = list.size();
        List list2 = (List) k6.india(j5, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof x) {
                list2 = new w(size);
            } else if ((list2 instanceof aq) && (list2 instanceof InterfaceC1516t)) {
                list2 = ((InterfaceC1516t) list2).golf(size);
            } else {
                list2 = new ArrayList(size);
            }
            L.oscar(obj, j5, list2);
        } else {
            if (charlie.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                L.oscar(obj, j5, arrayList);
                wVar = arrayList;
            } else if (list2 instanceof G) {
                w wVar2 = new w(list2.size() + size);
                wVar2.addAll((G) list2);
                L.oscar(obj, j5, wVar2);
                wVar = wVar2;
            } else if ((list2 instanceof aq) && (list2 instanceof InterfaceC1516t)) {
                InterfaceC1516t interfaceC1516t = (InterfaceC1516t) list2;
                if (!((AbstractC1499b) interfaceC1516t).alpha) {
                    list2 = interfaceC1516t.golf(list2.size() + size);
                    L.oscar(obj, j5, list2);
                }
            }
            list2 = wVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        L.oscar(obj, j5, list);
    }
}
