package androidx.navigation.fragment;

import Cb.ac;
import Fe.t;
import J2.i;
import Lb.ae;
import Nb.f;
import T1.a;
import T1.d;
import Y1.aa;
import Y1.aj;
import Y1.as;
import Y1.at;
import Y1.l;
import Y1.o;
import Ya.c;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.A;
import androidx.fragment.app.C0606a;
import androidx.fragment.app.I;
import androidx.fragment.app.K;
import androidx.fragment.app.L;
import androidx.fragment.app.O;
import androidx.fragment.app.ai;
import androidx.lifecycle.Y;
import androidx.lifecycle.c0;
import androidx.navigation.fragment.FragmentNavigator;
import bz.h0;
import c2.g;
import ge.InterfaceC1772d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import pf.AbstractC2360j;
import pf.C2364n;
import s6.S6;
import t6.AbstractC3062u;
import yf.N;

@as("fragment")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "LY1/at;", "Lc2/f;", "ClearEntryStateViewModel", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class FragmentNavigator extends at {
    public final Context charlie;
    public final L delta;
    public final int echo;
    public final LinkedHashSet foxtrot = new LinkedHashSet();
    public final ArrayList golf = new ArrayList();
    public final f hotel = new f(2, this);
    public final c india = new c(19, this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$ClearEntryStateViewModel;", "Landroidx/lifecycle/Y;", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ClearEntryStateViewModel extends Y {
        public WeakReference alpha;

        @Override // androidx.lifecycle.Y
        public final void onCleared() {
            super.onCleared();
            WeakReference weakReference = this.alpha;
            if (weakReference != null) {
                Function0 function0 = (Function0) weakReference.get();
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            Intrinsics.lima("completeTransition");
            throw null;
        }
    }

    public FragmentNavigator(Context context, L l10, int i4) {
        this.charlie = context;
        this.delta = l10;
        this.echo = i4;
    }

    public static void kilo(FragmentNavigator fragmentNavigator, String str, int i4) {
        boolean z2;
        boolean z10 = true;
        if ((i4 & 2) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i4 & 4) == 0) {
            z10 = false;
        }
        ArrayList arrayList = fragmentNavigator.golf;
        if (z10) {
            CollectionsKt.d(arrayList, new ae(str, 8));
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z2)));
    }

    public static boolean november() {
        if (!Log.isLoggable("FragmentManager", 2) && !Log.isLoggable("FragmentNavigator", 2)) {
            return false;
        }
        return true;
    }

    @Override // Y1.at
    public final aa alpha() {
        return new aa(this);
    }

    @Override // Y1.at
    public final void delta(List list, aj ajVar) {
        L l10 = this.delta;
        if (l10.jade()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            boolean isEmpty = ((List) ((N) bravo().echo.alpha).getValue()).isEmpty();
            if (ajVar != null && !isEmpty && ajVar.bravo && this.foxtrot.remove(lVar.white)) {
                l10.xray(new K(l10, lVar.white, 0), false);
                bravo().india(lVar);
            } else {
                C0606a mike = mike(lVar, ajVar);
                if (!isEmpty) {
                    l lVar2 = (l) CollectionsKt.olive((List) ((N) bravo().echo.alpha).getValue());
                    if (lVar2 != null) {
                        kilo(this, lVar2.white, 6);
                    }
                    String str = lVar.white;
                    kilo(this, str, 6);
                    mike.charlie(str);
                }
                mike.india();
                if (november()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + lVar);
                }
                bravo().india(lVar);
            }
        }
    }

    @Override // Y1.at
    public final void echo(final o oVar) {
        this.alpha = oVar;
        this.bravo = true;
        if (november()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        O o5 = new O() { // from class: c2.e
            @Override // androidx.fragment.app.O
            public final void alpha(L l10, ai aiVar) {
                Object obj;
                Intrinsics.echo(l10, "<unused var>");
                o oVar2 = o.this;
                List list = (List) ((N) oVar2.echo.alpha).getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (Intrinsics.areEqual(((l) obj).white, aiVar.getTag())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                l lVar = (l) obj;
                FragmentNavigator fragmentNavigator = this;
                fragmentNavigator.getClass();
                if (FragmentNavigator.november()) {
                    Log.v("FragmentNavigator", "Attaching fragment " + aiVar + " associated with entry " + lVar + " to FragmentManager " + fragmentNavigator.delta);
                }
                if (lVar != null) {
                    aiVar.getViewLifecycleOwnerLiveData().observe(aiVar, new Aa.f(22, new ac(fragmentNavigator, aiVar, lVar, 13)));
                    aiVar.getLifecycle().alpha(fragmentNavigator.hotel);
                    fragmentNavigator.lima(aiVar, lVar, oVar2);
                }
            }
        };
        L l10 = this.delta;
        l10.quebec.add(o5);
        l10.oscar.add(new g(oVar, this));
    }

    @Override // Y1.at
    public final void foxtrot(l lVar) {
        L l10 = this.delta;
        if (l10.jade()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C0606a mike = mike(lVar, null);
        List list = (List) ((N) bravo().echo.alpha).getValue();
        if (list.size() > 1) {
            l lVar2 = (l) CollectionsKt.jade(CollectionsKt.ivory(list) - 1, list);
            if (lVar2 != null) {
                kilo(this, lVar2.white, 6);
            }
            String str = lVar.white;
            kilo(this, str, 4);
            l10.xray(new I(l10, str, -1, 1), false);
            kilo(this, str, 2);
            mike.charlie(str);
        }
        mike.india();
        bravo().delta(lVar);
    }

    @Override // Y1.at
    public final void golf(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.foxtrot;
            linkedHashSet.clear();
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, stringArrayList);
        }
    }

    @Override // Y1.at
    public final Bundle hotel() {
        LinkedHashSet linkedHashSet = this.foxtrot;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return S6.charlie(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[SYNTHETIC] */
    @Override // Y1.at
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void india(l lVar, boolean z2) {
        int i4;
        boolean z10;
        boolean z11;
        L l10 = this.delta;
        if (l10.jade()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((N) bravo().echo.alpha).getValue();
        int indexOf = list.indexOf(lVar);
        List subList = list.subList(indexOf, list.size());
        l lVar2 = (l) CollectionsKt.gold(list);
        l lVar3 = (l) CollectionsKt.jade(indexOf - 1, list);
        if (lVar3 != null) {
            kilo(this, lVar3.white, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            l lVar4 = (l) obj;
            C2364n oscar = AbstractC2360j.oscar(CollectionsKt.beige(this.golf), new h0(6));
            String str = lVar4.white;
            Iterator it = oscar.alpha.iterator();
            int i5 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object invoke = oscar.bravo.invoke(it.next());
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (Intrinsics.areEqual(str, invoke)) {
                        i4 = i5;
                        break;
                    }
                    i5++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (Intrinsics.areEqual(lVar4.white, lVar2.white)) {
                    z11 = false;
                    if (!z11) {
                        arrayList.add(obj);
                    }
                }
            }
            z11 = true;
            if (!z11) {
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            kilo(this, ((l) it2.next()).white, 4);
        }
        if (z2) {
            for (l lVar5 : CollectionsKt.i(subList)) {
                if (Intrinsics.areEqual(lVar5, lVar2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + lVar5);
                } else {
                    l10.xray(new K(l10, lVar5.white, 1), false);
                    this.foxtrot.add(lVar5.white);
                }
            }
        } else {
            l10.xray(new I(l10, lVar.white, -1, 1), false);
        }
        if (november()) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + lVar + " with savedState " + z2);
        }
        bravo().foxtrot(lVar, z2);
    }

    public final void lima(ai fragment, l lVar, o oVar) {
        Intrinsics.echo(fragment, "fragment");
        c0 viewModelStore = fragment.getViewModelStore();
        Intrinsics.delta(viewModelStore, "<get-viewModelStore>(...)");
        t tVar = new t(1);
        tVar.alpha(u.alpha.bravo(ClearEntryStateViewModel.class), new h0(7));
        d bravo = tVar.bravo();
        a defaultCreationExtras = a.bravo;
        Intrinsics.echo(defaultCreationExtras, "defaultCreationExtras");
        i iVar = new i(viewModelStore, bravo, defaultCreationExtras);
        InterfaceC1772d echo = AbstractC3062u.echo(ClearEntryStateViewModel.class);
        String juliet = echo.juliet();
        if (juliet != null) {
            ((ClearEntryStateViewModel) iVar.charlie(echo, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(juliet))).alpha = new WeakReference(new Ac.l(lVar, oVar, this, fragment));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final C0606a mike(l lVar, aj ajVar) {
        int i4;
        int i5;
        int i10;
        int i11;
        aa aaVar = lVar.purple;
        Intrinsics.charlie(aaVar, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle alpha = lVar.f2268a.alpha();
        String str = ((c2.f) aaVar).yellow;
        if (str != null) {
            int i12 = 0;
            char charAt = str.charAt(0);
            Context context = this.charlie;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            L l10 = this.delta;
            A emerald = l10.emerald();
            context.getClassLoader();
            ai alpha2 = emerald.alpha(str);
            Intrinsics.delta(alpha2, "instantiate(...)");
            alpha2.setArguments(alpha);
            C0606a c0606a = new C0606a(l10);
            if (ajVar != null) {
                i4 = ajVar.foxtrot;
            } else {
                i4 = -1;
            }
            if (ajVar != null) {
                i5 = ajVar.golf;
            } else {
                i5 = -1;
            }
            if (ajVar != null) {
                i10 = ajVar.hotel;
            } else {
                i10 = -1;
            }
            if (ajVar != null) {
                i11 = ajVar.india;
            } else {
                i11 = -1;
            }
            if (i4 != -1 || i5 != -1 || i10 != -1 || i11 != -1) {
                if (i4 == -1) {
                    i4 = 0;
                }
                if (i5 == -1) {
                    i5 = 0;
                }
                if (i10 == -1) {
                    i10 = 0;
                }
                if (i11 != -1) {
                    i12 = i11;
                }
                c0606a.bravo = i4;
                c0606a.charlie = i5;
                c0606a.delta = i10;
                c0606a.echo = i12;
            }
            c0606a.echo(alpha2, lVar.white, this.echo);
            c0606a.november(alpha2);
            c0606a.papa = true;
            return c0606a;
        }
        throw new IllegalStateException("Fragment class was not set");
    }
}
