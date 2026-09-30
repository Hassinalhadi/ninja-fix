package androidx.fragment.app;

import ae.C0423b;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o1.C2188a;
import s1.ViewTreeObserverOnPreDrawListenerC2589w;

/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0620o extends h0 {
    public final ArrayList charlie;
    public final i0 delta;
    public final i0 echo;
    public final d0 foxtrot;
    public final Object golf;
    public final ArrayList hotel;
    public final ArrayList india;
    public final bv.e juliet;
    public final ArrayList kilo;
    public final ArrayList lima;
    public final bv.e mike;
    public final bv.e november;
    public final boolean oscar;
    public final C2188a papa = new Object();
    public Object quebec;
    public boolean romeo;

    /* JADX WARN: Type inference failed for: r1v1, types: [o1.a, java.lang.Object] */
    public C0620o(ArrayList arrayList, i0 i0Var, i0 i0Var2, d0 d0Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, bv.e eVar, ArrayList arrayList4, ArrayList arrayList5, bv.e eVar2, bv.e eVar3, boolean z2) {
        this.charlie = arrayList;
        this.delta = i0Var;
        this.echo = i0Var2;
        this.foxtrot = d0Var;
        this.golf = obj;
        this.hotel = arrayList2;
        this.india = arrayList3;
        this.juliet = eVar;
        this.kilo = arrayList4;
        this.lima = arrayList5;
        this.mike = eVar2;
        this.november = eVar3;
        this.oscar = z2;
    }

    public static void foxtrot(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i4 = s1.aw.alpha;
            if (viewGroup.isTransitionGroup()) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (childAt.getVisibility() == 0) {
                    foxtrot(childAt, arrayList);
                }
            }
            return;
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    @Override // androidx.fragment.app.h0
    public final boolean alpha() {
        Object obj;
        d0 d0Var = this.foxtrot;
        if (d0Var.lima()) {
            ArrayList arrayList = this.charlie;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0621p c0621p = (C0621p) it.next();
                    if (Build.VERSION.SDK_INT < 34 || (obj = c0621p.bravo) == null || !d0Var.mike(obj)) {
                        return false;
                    }
                }
            }
            Object obj2 = this.golf;
            if (obj2 == null || d0Var.mike(obj2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.h0
    public final void bravo(ViewGroup container) {
        Intrinsics.echo(container, "container");
        this.papa.alpha();
    }

    @Override // androidx.fragment.app.h0
    public final void charlie(ViewGroup container) {
        int collectionSizeOrDefault;
        Object obj;
        Intrinsics.echo(container, "container");
        boolean isLaidOut = container.isLaidOut();
        ArrayList arrayList = this.charlie;
        if (isLaidOut && !this.romeo) {
            Object obj2 = this.quebec;
            d0 d0Var = this.foxtrot;
            i0 i0Var = this.echo;
            i0 i0Var2 = this.delta;
            if (obj2 != null) {
                Intrinsics.checkNotNull(obj2);
                d0Var.charlie(obj2);
                if (L.gray(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + i0Var2 + " to " + i0Var);
                    return;
                }
                return;
            }
            Pair golf = golf(container, i0Var, i0Var2);
            ArrayList arrayList2 = (ArrayList) golf.first;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C0621p) it.next()).alpha);
            }
            Iterator it2 = arrayList3.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                obj = golf.second;
                if (!hasNext) {
                    break;
                }
                i0 i0Var3 = (i0) it2.next();
                d0Var.uniform(i0Var3.charlie, obj, this.papa, new RunnableC0616k(i0Var3, this, 1));
            }
            india(arrayList2, container, new C0618m(this, container, obj));
            if (L.gray(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + i0Var2 + " to " + i0Var);
                return;
            }
            return;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0621p c0621p = (C0621p) it3.next();
            i0 i0Var4 = c0621p.alpha;
            if (L.gray(2)) {
                if (this.romeo) {
                    Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + i0Var4);
                } else {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + i0Var4);
                }
            }
            c0621p.alpha.charlie(this);
        }
        this.romeo = false;
    }

    @Override // androidx.fragment.app.h0
    public final void delta(C0423b c0423b, ViewGroup container) {
        Intrinsics.echo(container, "container");
        Object obj = this.quebec;
        if (obj != null) {
            this.foxtrot.romeo(obj, c0423b.charlie);
        }
    }

    @Override // androidx.fragment.app.h0
    public final void echo(ViewGroup container) {
        int collectionSizeOrDefault;
        Object obj;
        Intrinsics.echo(container, "container");
        boolean isLaidOut = container.isLaidOut();
        ArrayList arrayList = this.charlie;
        if (!isLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i0 i0Var = ((C0621p) it.next()).alpha;
                if (L.gray(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + i0Var);
                }
            }
            return;
        }
        boolean hotel = hotel();
        i0 i0Var2 = this.echo;
        i0 i0Var3 = this.delta;
        if (hotel && (obj = this.golf) != null && !alpha()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + i0Var3 + " and " + i0Var2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (alpha() && hotel()) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Pair golf = golf(container, i0Var2, i0Var3);
            ArrayList arrayList2 = (ArrayList) golf.first;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((C0621p) it2.next()).alpha);
            }
            Iterator it3 = arrayList3.iterator();
            while (true) {
                boolean hasNext = it3.hasNext();
                Object obj2 = golf.second;
                if (hasNext) {
                    i0 i0Var4 = (i0) it3.next();
                    RunnableC0628x runnableC0628x = new RunnableC0628x(1, objectRef);
                    ai aiVar = i0Var4.charlie;
                    this.foxtrot.victor(obj2, this.papa, runnableC0628x, new RunnableC0616k(i0Var4, this, 0));
                } else {
                    india(arrayList2, container, new C0619n(this, container, obj2, objectRef));
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair golf(ViewGroup viewGroup, i0 i0Var, i0 i0Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        d0 d0Var;
        Object obj;
        Object obj2;
        ArrayList arrayList3;
        int i4;
        ArrayList arrayList4;
        i0 i0Var3 = i0Var;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList5 = this.charlie;
        Iterator it = arrayList5.iterator();
        View view2 = null;
        boolean z2 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.india;
            arrayList2 = this.hotel;
            d0Var = this.foxtrot;
            obj = this.golf;
            if (!hasNext) {
                break;
            }
            if (((C0621p) it.next()).delta != null && i0Var2 != null && i0Var3 != null && !this.juliet.isEmpty() && obj != null) {
                bv.e eVar = this.mike;
                b0 b0Var = W.alpha;
                arrayList4 = arrayList5;
                ai inFragment = i0Var3.charlie;
                Intrinsics.echo(inFragment, "inFragment");
                ai outFragment = i0Var2.charlie;
                Intrinsics.echo(outFragment, "outFragment");
                if (this.oscar) {
                    outFragment.getEnterTransitionCallback();
                } else {
                    inFragment.getEnterTransitionCallback();
                }
                ViewTreeObserverOnPreDrawListenerC2589w.alpha(viewGroup, new A2.s(i0Var3, i0Var2, this, 15));
                arrayList2.addAll(eVar.values());
                ArrayList arrayList6 = this.lima;
                if (!arrayList6.isEmpty()) {
                    Object obj3 = arrayList6.get(0);
                    Intrinsics.delta(obj3, "exitingNames[0]");
                    View view3 = (View) eVar.get((String) obj3);
                    d0Var.sierra(view3, obj);
                    view2 = view3;
                }
                bv.e eVar2 = this.november;
                arrayList.addAll(eVar2.values());
                ArrayList arrayList7 = this.kilo;
                if (!arrayList7.isEmpty()) {
                    Object obj4 = arrayList7.get(0);
                    Intrinsics.delta(obj4, "enteringNames[0]");
                    View view4 = (View) eVar2.get((String) obj4);
                    if (view4 != null) {
                        ViewTreeObserverOnPreDrawListenerC2589w.alpha(viewGroup, new RunnableC0617l(d0Var, view4, rect));
                        z2 = true;
                    }
                }
                d0Var.whiskey(obj, view, arrayList2);
                Object obj5 = this.golf;
                d0Var.quebec(obj5, null, null, obj5, arrayList);
            } else {
                arrayList4 = arrayList5;
            }
            arrayList5 = arrayList4;
        }
        ArrayList arrayList8 = arrayList5;
        ArrayList arrayList9 = arrayList;
        ArrayList arrayList10 = new ArrayList();
        Iterator it2 = arrayList8.iterator();
        Object obj6 = null;
        Object obj7 = null;
        while (it2.hasNext()) {
            ArrayList arrayList11 = arrayList9;
            C0621p c0621p = (C0621p) it2.next();
            Iterator it3 = it2;
            i0 i0Var4 = c0621p.alpha;
            boolean z10 = z2;
            Object hotel = d0Var.hotel(c0621p.bravo);
            if (hotel != null) {
                ArrayList arrayList12 = arrayList2;
                ArrayList arrayList13 = new ArrayList();
                Object obj8 = obj;
                View view5 = i0Var4.charlie.mView;
                Object obj9 = obj7;
                Intrinsics.delta(view5, "operation.fragment.mView");
                foxtrot(view5, arrayList13);
                if (obj8 != null && (i0Var4 == i0Var2 || i0Var4 == i0Var3)) {
                    if (i0Var4 == i0Var2) {
                        arrayList13.removeAll(CollectionsKt.D(arrayList12));
                    } else {
                        arrayList13.removeAll(CollectionsKt.D(arrayList11));
                    }
                }
                if (arrayList13.isEmpty()) {
                    d0Var.alpha(view, hotel);
                    obj2 = hotel;
                    arrayList3 = arrayList13;
                } else {
                    d0Var.bravo(hotel, arrayList13);
                    d0Var.quebec(hotel, hotel, arrayList13, null, null);
                    obj2 = hotel;
                    arrayList3 = arrayList13;
                    if (i0Var4.alpha == 3) {
                        i0Var4.india = false;
                        ArrayList arrayList14 = new ArrayList(arrayList3);
                        ai aiVar = i0Var4.charlie;
                        arrayList14.remove(aiVar.mView);
                        d0Var.papa(obj2, aiVar.mView, arrayList14);
                        i4 = 2;
                        ViewTreeObserverOnPreDrawListenerC2589w.alpha(viewGroup, new RunnableC0628x(i4, arrayList3));
                        if (i0Var4.alpha != i4) {
                            arrayList10.addAll(arrayList3);
                            if (z10) {
                                d0Var.tango(obj2, rect);
                            }
                            if (L.gray(i4)) {
                                Log.v("FragmentManager", "Entering Transition: " + obj2);
                                Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                                Iterator it4 = arrayList3.iterator();
                                while (it4.hasNext()) {
                                    Object transitioningViews = it4.next();
                                    Intrinsics.delta(transitioningViews, "transitioningViews");
                                    Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                                }
                            }
                        } else {
                            d0Var.sierra(view2, obj2);
                            if (L.gray(2)) {
                                Log.v("FragmentManager", "Exiting Transition: " + obj2);
                                Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                                Iterator it5 = arrayList3.iterator();
                                while (it5.hasNext()) {
                                    Object transitioningViews2 = it5.next();
                                    Intrinsics.delta(transitioningViews2, "transitioningViews");
                                    Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                                }
                            }
                        }
                        if (!c0621p.charlie) {
                            obj6 = d0Var.oscar(obj6, obj2);
                            i0Var3 = i0Var;
                            arrayList9 = arrayList11;
                            it2 = it3;
                            z2 = z10;
                            arrayList2 = arrayList12;
                            obj = obj8;
                            obj7 = obj9;
                        } else {
                            obj7 = d0Var.oscar(obj9, obj2);
                            i0Var3 = i0Var;
                            arrayList9 = arrayList11;
                            it2 = it3;
                            z2 = z10;
                            arrayList2 = arrayList12;
                            obj = obj8;
                        }
                    }
                }
                i4 = 2;
                if (i0Var4.alpha != i4) {
                }
                if (!c0621p.charlie) {
                }
            } else {
                arrayList9 = arrayList11;
                it2 = it3;
                z2 = z10;
                i0Var3 = i0Var;
            }
        }
        Object november = d0Var.november(obj6, obj7, obj);
        if (L.gray(2)) {
            Log.v("FragmentManager", "Final merged transition: " + november + " for container " + viewGroup);
        }
        return new Pair(arrayList10, november);
    }

    public final boolean hotel() {
        ArrayList arrayList = this.charlie;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C0621p) it.next()).alpha.charlie.mTransitioning) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final void india(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
        W.alpha(4, arrayList);
        d0 d0Var = this.foxtrot;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.india;
        int size = arrayList3.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList3.get(i4);
            WeakHashMap weakHashMap = s1.au.alpha;
            arrayList2.add(s1.al.foxtrot(view));
            s1.al.mike(view, null);
        }
        boolean gray = L.gray(2);
        ArrayList arrayList4 = this.hotel;
        if (gray) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                Object sharedElementFirstOutViews = it.next();
                Intrinsics.delta(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view2 = (View) sharedElementFirstOutViews;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view2);
                sb2.append(" Name: ");
                WeakHashMap weakHashMap2 = s1.au.alpha;
                sb2.append(s1.al.foxtrot(view2));
                Log.v("FragmentManager", sb2.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object sharedElementLastInViews = it2.next();
                Intrinsics.delta(sharedElementLastInViews, "sharedElementLastInViews");
                View view3 = (View) sharedElementLastInViews;
                StringBuilder sb3 = new StringBuilder("View: ");
                sb3.append(view3);
                sb3.append(" Name: ");
                WeakHashMap weakHashMap3 = s1.au.alpha;
                sb3.append(s1.al.foxtrot(view3));
                Log.v("FragmentManager", sb3.toString());
            }
        }
        function0.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i5 = 0; i5 < size2; i5++) {
            View view4 = (View) arrayList4.get(i5);
            WeakHashMap weakHashMap4 = s1.au.alpha;
            String foxtrot = s1.al.foxtrot(view4);
            arrayList5.add(foxtrot);
            if (foxtrot != null) {
                s1.al.mike(view4, null);
                String str = (String) this.juliet.get(foxtrot);
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i10))) {
                        s1.al.mike((View) arrayList3.get(i10), foxtrot);
                        break;
                    }
                    i10++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC2589w.alpha(viewGroup, new c0(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        W.alpha(0, arrayList);
        d0Var.xray(this.golf, arrayList4, arrayList3);
    }
}
