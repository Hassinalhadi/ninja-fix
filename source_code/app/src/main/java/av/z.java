package av;

import android.content.Context;
import android.util.ArrayMap;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.c0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class z implements c0 {
    public final ak bravo;

    public z(Context context) {
        this.bravo = ak.bravo(context);
    }

    @Override // androidx.camera.core.impl.c0
    public final androidx.camera.core.impl.af alpha(b0 b0Var, int i4) {
        int i5;
        int i10;
        Object obj;
        androidx.camera.core.impl.aw bravo = androidx.camera.core.impl.aw.bravo();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        androidx.camera.core.impl.aw bravo2 = androidx.camera.core.impl.aw.bravo();
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.ay alpha = androidx.camera.core.impl.ay.alpha();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int ordinal = b0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                i5 = 3;
            }
            i5 = 1;
        } else {
            if (i4 == 2) {
                i5 = 5;
            }
            i5 = 1;
        }
        C0505c c0505c = Z.uniform;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        androidx.camera.core.impl.B alpha2 = androidx.camera.core.impl.B.alpha(bravo2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        V v4 = V.bravo;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = alpha.alpha;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        bravo.hotel(c0505c, new P(arrayList5, arrayList6, arrayList7, arrayList8, new androidx.camera.core.impl.ad(arrayList9, alpha2, i5, arrayList10, false, new V(arrayMap), null), null, null, null));
        bravo.hotel(Z.whiskey, y.alpha);
        HashSet hashSet2 = new HashSet();
        androidx.camera.core.impl.aw bravo3 = androidx.camera.core.impl.aw.bravo();
        ArrayList arrayList11 = new ArrayList();
        androidx.camera.core.impl.ay alpha3 = androidx.camera.core.impl.ay.alpha();
        int ordinal2 = b0Var.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 3) {
                i10 = 1;
            } else {
                i10 = 3;
            }
        } else if (i4 == 2) {
            i10 = 5;
        } else {
            i10 = 2;
        }
        C0505c c0505c2 = Z.victor;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        androidx.camera.core.impl.B alpha4 = androidx.camera.core.impl.B.alpha(bravo3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        V v6 = V.bravo;
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = alpha3.alpha;
        for (String str2 : arrayMap4.keySet()) {
            arrayMap3.put(str2, arrayMap4.get(str2));
        }
        bravo.hotel(c0505c2, new androidx.camera.core.impl.ad(arrayList12, alpha4, i10, arrayList13, false, new V(arrayMap3), null));
        C0505c c0505c3 = Z.xray;
        if (b0Var == b0.alpha) {
            obj = am.bravo;
        } else {
            obj = x.alpha;
        }
        bravo.hotel(c0505c3, obj);
        b0 b0Var2 = b0.purple;
        ak akVar = this.bravo;
        if (b0Var == b0Var2) {
            bravo.hotel(androidx.camera.core.impl.ap.quebec, akVar.echo());
        }
        bravo.hotel(androidx.camera.core.impl.ap.lima, Integer.valueOf(akVar.charlie(true).getRotation()));
        if (b0Var == b0.silver || b0Var == b0.teal) {
            bravo.hotel(Z.amber, Boolean.TRUE);
        }
        return androidx.camera.core.impl.B.alpha(bravo);
    }
}
