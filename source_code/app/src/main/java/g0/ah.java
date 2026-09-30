package g0;

import a0.C0366t;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public abstract class ah {
    public static final List alpha = CollectionsKt.emptyList();

    static {
        int i4 = C0366t.lima;
    }

    public static final List alpha(String str) {
        if (str == null) {
            return alpha;
        }
        com.google.android.play.core.integrity.k kVar = new com.google.android.play.core.integrity.k(1);
        ArrayList arrayList = (ArrayList) kVar.purple;
        if (arrayList == null) {
            arrayList = new ArrayList();
            kVar.purple = arrayList;
        } else {
            arrayList.clear();
        }
        kVar.hotel(str, arrayList);
        ArrayList arrayList2 = (ArrayList) kVar.purple;
        if (arrayList2 != null) {
            return arrayList2;
        }
        return CollectionsKt.emptyList();
    }
}
