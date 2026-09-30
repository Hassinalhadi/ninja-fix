package D0;

import java.util.ArrayList;
import java.util.List;
import s6.J4;

/* loaded from: classes3.dex */
public abstract class h {
    public static final g alpha = new g("");

    public static final List alpha(g gVar, int i4, int i5, A4.a aVar) {
        List list;
        boolean z2;
        if (i4 == i5 || (list = gVar.alpha) == null) {
            return null;
        }
        if (i4 == 0 && i5 >= gVar.purple.length()) {
            if (aVar == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                if (((Boolean) aVar.invoke(((e) obj).alpha)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            e eVar = (e) list.get(i11);
            boolean z10 = true;
            if (aVar != null) {
                z2 = ((Boolean) aVar.invoke(eVar.alpha)).booleanValue();
            } else {
                z2 = true;
            }
            if (!z2 || !bravo(i4, i5, eVar.bravo, eVar.charlie)) {
                z10 = false;
            }
            if (z10) {
                arrayList2.add(new e(eVar.delta, J4.delta(eVar.bravo, i4, i5) - i4, J4.delta(eVar.charlie, i4, i5) - i4, (b) eVar.alpha));
            }
        }
        return arrayList2;
    }

    public static final boolean bravo(int i4, int i5, int i10, int i11) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (i4 == i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i10 == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z14 = z2 | z10;
        if (i4 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z15 = z14 & z11;
        if (i4 < i11) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i10 < i5) {
            z13 = true;
        }
        return (z12 & z13) | z15;
    }
}
