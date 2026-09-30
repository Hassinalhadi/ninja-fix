package androidx.coordinatorlayout.widget;

import bv.aw;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class i {
    public final W0.d alpha = new W0.d(10);
    public final aw bravo = new aw(0);
    public final ArrayList charlie = new ArrayList();
    public final HashSet delta = new HashSet();

    public final void alpha(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) this.bravo.get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    alpha(arrayList2.get(i4), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
