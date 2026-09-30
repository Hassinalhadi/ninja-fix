package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import o1.C2188a;

/* loaded from: classes3.dex */
public final class b0 extends d0 {
    public static boolean zulu(Transition transition) {
        if (d0.kilo(transition.getTargetIds()) && d0.kilo(transition.getTargetNames()) && d0.kilo(transition.getTargetTypes())) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.d0
    public final void alpha(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    public final void amber(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        int size;
        Transition transition = (Transition) obj;
        int i4 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i4 < transitionCount) {
                amber(transitionSet.getTransitionAt(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (!zulu(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            while (i4 < size) {
                transition.addTarget((View) arrayList2.get(i4));
                i4++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.d0
    public final void bravo(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i4 = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i4 < transitionCount) {
                    bravo(transitionSet.getTransitionAt(i4), arrayList);
                    i4++;
                }
                return;
            }
            if (!zulu(transition) && d0.kilo(transition.getTargets())) {
                int size = arrayList.size();
                while (i4 < size) {
                    transition.addTarget((View) arrayList.get(i4));
                    i4++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.d0
    public final void echo(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.d0
    public final boolean golf(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.d0
    public final Object hotel(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.d0
    public final boolean lima() {
        if (L.gray(4)) {
            Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.d0
    public final boolean mike(Object obj) {
        if (L.gray(2)) {
            Log.v("FragmentManager", "Predictive back not available for framework transition " + obj + ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.d0
    public final Object november(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.d0
    public final Object oscar(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.d0
    public final void papa(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new Y(view, arrayList));
    }

    @Override // androidx.fragment.app.d0
    public final void quebec(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new Z(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.d0
    public final void sierra(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            d0.juliet(view, rect);
            ((Transition) obj).setEpicenterCallback(new X(0, rect));
        }
    }

    @Override // androidx.fragment.app.d0
    public final void tango(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new X(1, rect));
    }

    @Override // androidx.fragment.app.d0
    public final void uniform(ai aiVar, Object obj, C2188a c2188a, Runnable runnable) {
        ((Transition) obj).addListener(new a0(runnable));
    }

    @Override // androidx.fragment.app.d0
    public final void whiskey(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            d0.foxtrot(targets, (View) arrayList.get(i4));
        }
        targets.add(view);
        arrayList.add(view);
        bravo(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.d0
    public final void xray(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            amber(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.d0
    public final Object yankee(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
