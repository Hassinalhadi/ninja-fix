package Nb;

import Y1.l;
import android.util.Log;
import androidx.fragment.app.ai;
import androidx.lifecycle.aa;
import androidx.lifecycle.ab;
import androidx.lifecycle.aj;
import androidx.lifecycle.al;
import androidx.navigation.fragment.FragmentNavigator;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import q2.C2406a;
import t0.AbstractC2902a;
import yf.N;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements aj {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ f(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(al alVar, aa aaVar) {
        switch (this.alpha) {
            case 0:
                if (aaVar == aa.ON_START) {
                    h hVar = (h) this.purple;
                    hVar.alpha(e.bravo(hVar.alpha));
                    return;
                }
                return;
            case 1:
                ab alpha = aaVar.alpha();
                androidx.navigation.internal.g gVar = (androidx.navigation.internal.g) this.purple;
                gVar.quebec = alpha;
                if (gVar.charlie != null) {
                    Iterator it = CollectionsKt.B(gVar.foxtrot).iterator();
                    while (it.hasNext()) {
                        l lVar = (l) it.next();
                        lVar.getClass();
                        androidx.navigation.internal.d dVar = lVar.f2268a;
                        dVar.getClass();
                        ab alpha2 = aaVar.alpha();
                        l lVar2 = dVar.alpha;
                        lVar2.getClass();
                        lVar2.silver = alpha2;
                        dVar.delta = aaVar.alpha();
                        dVar.charlie();
                    }
                    return;
                }
                return;
            case 2:
                if (aaVar == aa.ON_DESTROY) {
                    ai aiVar = (ai) alVar;
                    FragmentNavigator fragmentNavigator = (FragmentNavigator) this.purple;
                    Object obj = null;
                    for (Object obj2 : (Iterable) ((N) fragmentNavigator.bravo().foxtrot.alpha).getValue()) {
                        if (Intrinsics.areEqual(((l) obj2).white, aiVar.getTag())) {
                            obj = obj2;
                        }
                    }
                    l lVar3 = (l) obj;
                    if (lVar3 != null) {
                        if (FragmentNavigator.november()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar3 + " due to fragment " + alVar + " lifecycle reaching DESTROYED");
                        }
                        fragmentNavigator.bravo().charlie(lVar3);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                aa aaVar2 = aa.ON_START;
                C2406a c2406a = (C2406a) this.purple;
                if (aaVar == aaVar2) {
                    c2406a.hotel = true;
                    return;
                } else {
                    if (aaVar == aa.ON_STOP) {
                        c2406a.hotel = false;
                        return;
                    }
                    return;
                }
            default:
                if (aaVar == aa.ON_DESTROY) {
                    ((AbstractC2902a) this.purple).delta();
                    return;
                }
                return;
        }
    }
}
