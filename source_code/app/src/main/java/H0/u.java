package H0;

import androidx.appcompat.widget.P0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u {
    public final ArrayList alpha;

    public u(t... tVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (tVarArr.length <= 0) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, list);
                } else {
                    throw new IllegalArgumentException(P0.fuchsia(Q0.c.victor("'", str, "' must be unique. Actual [ ["), CollectionsKt.maroon(list, null, null, null, null, 63), ']').toString());
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.alpha = arrayList2;
            if (arrayList2.size() <= 0) {
                return;
            }
            arrayList2.get(0).getClass();
            throw new ClassCastException();
        }
        t tVar = tVarArr[0];
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof u) || !Intrinsics.areEqual(this.alpha, ((u) obj).alpha)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }
}
