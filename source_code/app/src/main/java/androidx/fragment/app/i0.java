package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import androidx.appcompat.widget.P0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i0 {
    public int alpha;
    public int bravo;
    public final ai charlie;
    public final ArrayList delta;
    public boolean echo;
    public boolean foxtrot;
    public boolean golf;
    public boolean hotel;
    public boolean india;
    public final ArrayList juliet;
    public final ArrayList kilo;
    public final S lima;

    public i0(int i4, int i5, S s3) {
        com.google.android.material.datepicker.j.papa(i4, "finalState");
        com.google.android.material.datepicker.j.papa(i5, "lifecycleImpact");
        ai fragment = s3.charlie;
        Intrinsics.delta(fragment, "fragmentStateManager.fragment");
        com.google.android.material.datepicker.j.papa(i4, "finalState");
        com.google.android.material.datepicker.j.papa(i5, "lifecycleImpact");
        Intrinsics.echo(fragment, "fragment");
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = fragment;
        this.delta = new ArrayList();
        this.india = true;
        ArrayList arrayList = new ArrayList();
        this.juliet = arrayList;
        this.kilo = arrayList;
        this.lima = s3;
    }

    public final void alpha(ViewGroup container) {
        Intrinsics.echo(container, "container");
        this.hotel = false;
        if (!this.echo) {
            this.echo = true;
            if (this.juliet.isEmpty()) {
                bravo();
                return;
            }
            for (h0 h0Var : CollectionsKt.z(this.kilo)) {
                h0Var.getClass();
                if (!h0Var.bravo) {
                    h0Var.bravo(container);
                }
                h0Var.bravo = true;
            }
        }
    }

    public final void bravo() {
        this.hotel = false;
        if (!this.foxtrot) {
            if (L.gray(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.foxtrot = true;
            Iterator it = this.delta.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.charlie.mTransitioning = false;
        this.lima.kilo();
    }

    public final void charlie(h0 effect) {
        Intrinsics.echo(effect, "effect");
        ArrayList arrayList = this.juliet;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            bravo();
        }
    }

    public final void delta(int i4, int i5) {
        com.google.android.material.datepicker.j.papa(i4, "finalState");
        com.google.android.material.datepicker.j.papa(i5, "lifecycleImpact");
        int mike = av.q.mike(i5);
        ai aiVar = this.charlie;
        if (mike != 0) {
            if (mike != 1) {
                if (mike == 2) {
                    if (L.gray(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + aiVar + " mFinalState = " + P0.magenta(this.alpha) + " -> REMOVED. mLifecycleImpact  = " + P0.lime(this.bravo) + " to REMOVING.");
                    }
                    this.alpha = 1;
                    this.bravo = 3;
                    this.india = true;
                    return;
                }
                return;
            }
            if (this.alpha == 1) {
                if (L.gray(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + aiVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + P0.lime(this.bravo) + " to ADDING.");
                }
                this.alpha = 2;
                this.bravo = 2;
                this.india = true;
                return;
            }
            return;
        }
        if (this.alpha != 1) {
            if (L.gray(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + aiVar + " mFinalState = " + P0.magenta(this.alpha) + " -> " + P0.magenta(i4) + '.');
            }
            this.alpha = i4;
        }
    }

    public final String toString() {
        StringBuilder victor = Q0.c.victor("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        victor.append(P0.magenta(this.alpha));
        victor.append(" lifecycleImpact = ");
        victor.append(P0.lime(this.bravo));
        victor.append(" fragment = ");
        victor.append(this.charlie);
        victor.append('}');
        return victor.toString();
    }
}
