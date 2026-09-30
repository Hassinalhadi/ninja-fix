package androidx.fragment.app;

import android.util.Log;
import androidx.appcompat.widget.P0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class J implements H {
    public final /* synthetic */ L alpha;

    public J(L l10) {
        this.alpha = l10;
    }

    @Override // androidx.fragment.app.H
    public final boolean alpha(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean navy;
        L l10 = this.alpha;
        l10.getClass();
        if (L.gray(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + l10.alpha);
        }
        if (l10.delta.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            arrayList3 = arrayList;
            navy = false;
            arrayList4 = arrayList2;
        } else {
            C0606a c0606a = (C0606a) P0.amber(1, l10.delta);
            l10.hotel = c0606a;
            Iterator it = c0606a.alpha.iterator();
            while (it.hasNext()) {
                ai aiVar = ((U) it.next()).bravo;
                if (aiVar != null) {
                    aiVar.mTransitioning = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            navy = l10.navy(arrayList3, arrayList4, null, -1, 0);
        }
        if (!l10.oscar.isEmpty() && arrayList3.size() > 0) {
            boolean booleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(L.crimson((C0606a) it2.next()));
            }
            Iterator it3 = l10.oscar.iterator();
            while (it3.hasNext()) {
                G g2 = (G) it3.next();
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    g2.onBackStackChangeStarted((ai) it4.next(), booleanValue);
                }
            }
        }
        return navy;
    }
}
