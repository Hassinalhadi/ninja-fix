package androidx.camera.core.impl;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class P {
    public static final List india = Arrays.asList(1, 5, 3);
    public final ArrayList alpha;
    public final C0507e bravo;
    public final List charlie;
    public final List delta;
    public final List echo;
    public final N foxtrot;
    public final ad golf;
    public final InputConfiguration hotel;

    public P(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ad adVar, N n5, InputConfiguration inputConfiguration, C0507e c0507e) {
        this.alpha = arrayList;
        this.charlie = Collections.unmodifiableList(arrayList2);
        this.delta = Collections.unmodifiableList(arrayList3);
        this.echo = Collections.unmodifiableList(arrayList4);
        this.foxtrot = n5;
        this.golf = adVar;
        this.hotel = inputConfiguration;
        this.bravo = c0507e;
    }

    public static P alpha() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        aw bravo = aw.bravo();
        ArrayList arrayList5 = new ArrayList();
        ay alpha = ay.alpha();
        ArrayList arrayList6 = new ArrayList(hashSet);
        B alpha2 = B.alpha(bravo);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        V v4 = V.bravo;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = alpha.alpha;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new P(arrayList, arrayList2, arrayList3, arrayList4, new ad(arrayList6, alpha2, -1, arrayList7, false, new V(arrayMap), null), null, null, null);
    }

    public final List bravo() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            C0507e c0507e = (C0507e) it.next();
            arrayList.add(c0507e.alpha);
            Iterator it2 = c0507e.bravo.iterator();
            while (it2.hasNext()) {
                arrayList.add((ah) it2.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
