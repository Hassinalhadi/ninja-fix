package Y1;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.T;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.navigation.NavControllerViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import o2.C2194d;
import o2.InterfaceC2196f;

/* loaded from: classes3.dex */
public final class l implements androidx.lifecycle.al, d0, InterfaceC0651v, InterfaceC2196f {
    public final H0.a alpha;
    public aa purple;
    public final Bundle red;
    public androidx.lifecycle.ab silver;
    public final NavControllerViewModel teal;
    public final String white;
    public final Bundle yellow;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.navigation.internal.d f2268a = new androidx.navigation.internal.d(this);

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f2269b = LazyKt.lazy(new B2.q(26, this));

    public l(H0.a aVar, aa aaVar, Bundle bundle, androidx.lifecycle.ab abVar, NavControllerViewModel navControllerViewModel, String str, Bundle bundle2) {
        this.alpha = aVar;
        this.purple = aaVar;
        this.red = bundle;
        this.silver = abVar;
        this.teal = navControllerViewModel;
        this.white = str;
        this.yellow = bundle2;
    }

    public final void alpha(androidx.lifecycle.ab abVar) {
        androidx.navigation.internal.d dVar = this.f2268a;
        dVar.getClass();
        dVar.lima = abVar;
        dVar.charlie();
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            if (Intrinsics.areEqual(this.white, lVar.white) && Intrinsics.areEqual(this.purple, lVar.purple) && Intrinsics.areEqual(this.f2268a.kilo, lVar.f2268a.kilo) && Intrinsics.areEqual(getSavedStateRegistry(), lVar.getSavedStateRegistry())) {
                Bundle bundle = this.red;
                Bundle bundle2 = lVar.red;
                if (!Intrinsics.areEqual(bundle, bundle2)) {
                    if (bundle != null && (keySet = bundle.keySet()) != null) {
                        Set<String> set = keySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Object obj3 = bundle.get(str);
                                if (bundle2 != null) {
                                    obj2 = bundle2.get(str);
                                } else {
                                    obj2 = null;
                                }
                                if (!Intrinsics.areEqual(obj3, obj2)) {
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // androidx.lifecycle.InterfaceC0651v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T1.c getDefaultViewModelCreationExtras() {
        Application application;
        Context context;
        androidx.navigation.internal.d dVar = this.f2268a;
        dVar.getClass();
        T1.e eVar = new T1.e(0);
        g7.f fVar = T.alpha;
        LinkedHashMap linkedHashMap = eVar.alpha;
        l lVar = dVar.alpha;
        linkedHashMap.put(fVar, lVar);
        linkedHashMap.put(T.bravo, lVar);
        Bundle alpha = dVar.alpha();
        if (alpha != null) {
            linkedHashMap.put(T.charlie, alpha);
        }
        Application application2 = null;
        H0.a aVar = this.alpha;
        if (aVar != null) {
            Context context2 = aVar.purple;
            if (context2 != null) {
                context = context2.getApplicationContext();
            } else {
                context = null;
            }
            if (context instanceof Application) {
                application = (Application) context;
                if (application != null) {
                    application2 = application;
                }
                if (application2 != null) {
                    linkedHashMap.put(Z.echo, application2);
                }
                return eVar;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return eVar;
    }

    @Override // androidx.lifecycle.InterfaceC0651v
    public final a0 getDefaultViewModelProviderFactory() {
        return this.f2268a.mike;
    }

    @Override // androidx.lifecycle.al
    public final androidx.lifecycle.ac getLifecycle() {
        return this.f2268a.kilo;
    }

    @Override // o2.InterfaceC2196f
    public final C2194d getSavedStateRegistry() {
        return this.f2268a.hotel.bravo;
    }

    @Override // androidx.lifecycle.d0
    public final c0 getViewModelStore() {
        androidx.navigation.internal.d dVar = this.f2268a;
        if (dVar.india) {
            if (dVar.kilo.delta != androidx.lifecycle.ab.alpha) {
                NavControllerViewModel navControllerViewModel = dVar.echo;
                if (navControllerViewModel != null) {
                    String backStackEntryId = dVar.foxtrot;
                    Intrinsics.echo(backStackEntryId, "backStackEntryId");
                    LinkedHashMap linkedHashMap = navControllerViewModel.alpha;
                    c0 c0Var = (c0) linkedHashMap.get(backStackEntryId);
                    if (c0Var == null) {
                        c0 c0Var2 = new c0();
                        linkedHashMap.put(backStackEntryId, c0Var2);
                        return c0Var2;
                    }
                    return c0Var;
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
    }

    public final int hashCode() {
        Set<String> keySet;
        int i4;
        int hashCode = this.purple.hashCode() + (this.white.hashCode() * 31);
        Bundle bundle = this.red;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i5 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                if (obj != null) {
                    i4 = obj.hashCode();
                } else {
                    i4 = 0;
                }
                hashCode = i5 + i4;
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.f2268a.kilo.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.f2268a.toString();
    }
}
