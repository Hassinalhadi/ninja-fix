package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class c0 {
    public final LinkedHashMap alpha = new LinkedHashMap();

    public final void alpha() {
        LinkedHashMap linkedHashMap = this.alpha;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((Y) it.next()).clear$lifecycle_viewmodel_release();
        }
        linkedHashMap.clear();
    }
}
