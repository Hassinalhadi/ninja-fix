package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class T {
    public final ArrayList alpha = new ArrayList();

    public static void bravo(ArrayList arrayList, int i4, int[] iArr, int i5) {
        if (i5 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i10 = 0; i10 < i4; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 < i5) {
                    if (i10 == iArr[i11]) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    iArr[i5] = i10;
                    bravo(arrayList, i4, iArr, i5 + 1);
                    break;
                }
            }
        }
    }

    public final void alpha(C0510h c0510h) {
        this.alpha.add(c0510h);
    }

    public final List charlie(List list) {
        boolean z2;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.alpha;
        if (size == arrayList.size()) {
            int size2 = arrayList.size();
            ArrayList arrayList2 = new ArrayList();
            boolean z10 = false;
            bravo(arrayList2, size2, new int[size2], 0);
            C0510h[] c0510hArr = new C0510h[list.size()];
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int[] iArr = (int[]) it.next();
                boolean z11 = true;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (iArr[i4] < list.size()) {
                        C0510h c0510h = (C0510h) arrayList.get(i4);
                        C0510h c0510h2 = (C0510h) list.get(iArr[i4]);
                        c0510h.getClass();
                        int i5 = c0510h2.alpha;
                        if (c0510h2.bravo.alpha <= c0510h.bravo.alpha && i5 == c0510h.alpha) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z11 &= z2;
                        if (!z11) {
                            break;
                        }
                        c0510hArr[iArr[i4]] = (C0510h) arrayList.get(i4);
                    }
                }
                if (z11) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return Arrays.asList(c0510hArr);
            }
            return null;
        }
        return null;
    }
}
