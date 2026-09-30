package X2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements Iterable, Yd.a {
    public static final l purple = new l(t.alpha);
    public final Map alpha;

    public l(Map map) {
        this.alpha = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            if (Intrinsics.areEqual(this.alpha, ((l) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.alpha;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() == null) {
                arrayList.add(new Pair(str, null));
            } else {
                throw new ClassCastException();
            }
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.alpha + ')';
    }
}
