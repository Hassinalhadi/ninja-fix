package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0634d {
    public final HashMap alpha = new HashMap();
    public final HashMap bravo;

    public C0634d(HashMap hashMap) {
        this.bravo = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            aa aaVar = (aa) entry.getValue();
            List list = (List) this.alpha.get(aaVar);
            if (list == null) {
                list = new ArrayList();
                this.alpha.put(aaVar, list);
            }
            list.add((C0635e) entry.getKey());
        }
    }

    public static void alpha(List list, al alVar, aa aaVar, ak akVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0635e c0635e = (C0635e) list.get(size);
                c0635e.getClass();
                try {
                    int i4 = c0635e.alpha;
                    Method method = c0635e.bravo;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                method.invoke(akVar, alVar, aaVar);
                            }
                        } else {
                            method.invoke(akVar, alVar);
                        }
                    } else {
                        method.invoke(akVar, null);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to call observer method", e4.getCause());
                }
            }
        }
    }
}
