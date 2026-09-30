package s6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: s6.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2780u extends AbstractC2771t implements Serializable {
    public final transient C2825z silver;
    public transient int teal;

    public C2780u() {
        C2825z c2825z = new C2825z();
        if (c2825z.isEmpty()) {
            this.silver = c2825z;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void charlie() {
        C2825z c2825z = this.silver;
        Iterator it = c2825z.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        c2825z.clear();
        this.teal = 0;
    }

    public final boolean delta(Object obj, Object obj2) {
        C2825z c2825z = this.silver;
        Collection collection = (Collection) c2825z.get(obj);
        if (collection == null) {
            ArrayList arrayList = new ArrayList(3);
            if (arrayList.add(obj2)) {
                this.teal++;
                c2825z.put(obj, arrayList);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(obj2)) {
            this.teal++;
            return true;
        }
        return false;
    }
}
