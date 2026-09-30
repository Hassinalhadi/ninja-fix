package androidx.fragment.app;

import ae.C0423b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ay extends ae.ac {
    public final /* synthetic */ L alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(L l10) {
        super(false);
        this.alpha = l10;
    }

    @Override // ae.ac
    public final void handleOnBackCancelled() {
        boolean gray = L.gray(3);
        L l10 = this.alpha;
        if (gray) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + l10);
        }
        l10.getClass();
        if (L.gray(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + l10.hotel);
        }
        C0606a c0606a = l10.hotel;
        if (c0606a != null) {
            c0606a.sierra = false;
            c0606a.hotel();
            C0606a c0606a2 = l10.hotel;
            RunnableC0628x runnableC0628x = new RunnableC0628x(4, l10);
            if (c0606a2.quebec == null) {
                c0606a2.quebec = new ArrayList();
            }
            c0606a2.quebec.add(runnableC0628x);
            l10.hotel.india();
            l10.india = true;
            l10.zulu(true);
            l10.coral();
            l10.india = false;
            l10.hotel = null;
        }
    }

    @Override // ae.ac
    public final void handleOnBackPressed() {
        boolean gray = L.gray(3);
        L l10 = this.alpha;
        if (gray) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + l10);
        }
        l10.india = true;
        l10.zulu(true);
        l10.india = false;
        C0606a c0606a = l10.hotel;
        ay ayVar = l10.juliet;
        if (c0606a != null) {
            ArrayList arrayList = l10.oscar;
            if (!arrayList.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(L.crimson(l10.hotel));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    G g2 = (G) it.next();
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        g2.onBackStackChangeCommitted((ai) it2.next(), true);
                    }
                }
            }
            Iterator it3 = l10.hotel.alpha.iterator();
            while (it3.hasNext()) {
                ai aiVar = ((U) it3.next()).bravo;
                if (aiVar != null) {
                    aiVar.mTransitioning = false;
                }
            }
            Iterator it4 = l10.foxtrot(new ArrayList(Collections.singletonList(l10.hotel)), 0, 1).iterator();
            while (it4.hasNext()) {
                C0622q c0622q = (C0622q) it4.next();
                c0622q.getClass();
                if (L.gray(3)) {
                    Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                }
                ArrayList arrayList2 = c0622q.charlie;
                c0622q.mike(arrayList2);
                c0622q.charlie(arrayList2);
            }
            Iterator it5 = l10.hotel.alpha.iterator();
            while (it5.hasNext()) {
                ai aiVar2 = ((U) it5.next()).bravo;
                if (aiVar2 != null && aiVar2.mContainer == null) {
                    l10.golf(aiVar2).kilo();
                }
            }
            l10.hotel = null;
            l10.yellow();
            if (L.gray(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + ayVar.isEnabled() + " for  FragmentManager " + l10);
                return;
            }
            return;
        }
        if (ayVar.isEnabled()) {
            if (L.gray(3)) {
                Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
            }
            l10.magenta();
        } else {
            if (L.gray(3)) {
                Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
            }
            l10.golf.delta();
        }
    }

    @Override // ae.ac
    public final void handleOnBackProgressed(C0423b backEvent) {
        boolean gray = L.gray(2);
        L l10 = this.alpha;
        if (gray) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + l10);
        }
        if (l10.hotel != null) {
            Iterator it = l10.foxtrot(new ArrayList(Collections.singletonList(l10.hotel)), 0, 1).iterator();
            while (it.hasNext()) {
                C0622q c0622q = (C0622q) it.next();
                c0622q.getClass();
                Intrinsics.echo(backEvent, "backEvent");
                if (L.gray(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.charlie);
                }
                ArrayList arrayList = c0622q.charlie;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList2, ((i0) it2.next()).kilo);
                }
                List z2 = CollectionsKt.z(CollectionsKt.D(arrayList2));
                int size = z2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((h0) z2.get(i4)).delta(backEvent, c0622q.alpha);
                }
            }
            Iterator it3 = l10.oscar.iterator();
            while (it3.hasNext()) {
                ((G) it3.next()).onBackStackChangeProgressed(backEvent);
            }
        }
    }

    @Override // ae.ac
    public final void handleOnBackStarted(C0423b c0423b) {
        boolean gray = L.gray(3);
        L l10 = this.alpha;
        if (gray) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + l10);
        }
        l10.whiskey();
        l10.xray(new J(l10), false);
    }
}
