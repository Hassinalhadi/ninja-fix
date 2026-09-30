package aw;

import android.os.Build;
import av.aa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class v {
    public final u alpha;

    public v(ArrayList arrayList, bd.h hVar, aa aaVar) {
        if (Build.VERSION.SDK_INT < 28) {
            this.alpha = new t(arrayList, hVar, aaVar);
        } else {
            this.alpha = new s(arrayList, hVar, aaVar);
        }
    }

    public static ArrayList alpha(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Rf.a.delta(((i) it.next()).alpha.charlie()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        return this.alpha.equals(((v) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }
}
