package Y1;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.c0;
import androidx.navigation.NavControllerViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yf.AbstractC3428A;
import yf.N;

/* loaded from: classes3.dex */
public final class o {
    public final com.google.mlkit.common.sdkinternal.b alpha;
    public final N bravo;
    public final N charlie;
    public boolean delta;
    public final yf.av echo;
    public final yf.av foxtrot;
    public final at golf;
    public final /* synthetic */ r hotel;

    public o(r rVar, at navigator) {
        Intrinsics.echo(navigator, "navigator");
        this.hotel = rVar;
        this.alpha = new com.google.mlkit.common.sdkinternal.b(15);
        N charlie = AbstractC3428A.charlie(CollectionsKt.emptyList());
        this.bravo = charlie;
        N charlie2 = AbstractC3428A.charlie(kotlin.collections.u.alpha);
        this.charlie = charlie2;
        this.echo = new yf.av(charlie);
        this.foxtrot = new yf.av(charlie2);
        this.golf = navigator;
    }

    public final void alpha(l backStackEntry) {
        Intrinsics.echo(backStackEntry, "backStackEntry");
        synchronized (this.alpha) {
            N n5 = this.bravo;
            n5.india(CollectionsKt.plus((Collection) n5.getValue(), backStackEntry));
        }
    }

    public final l bravo(aa aaVar, Bundle bundle) {
        androidx.navigation.internal.g gVar = this.hotel.bravo;
        gVar.getClass();
        return ar.alpha(gVar.alpha.charlie, aaVar, bundle, gVar.hotel(), gVar.oscar);
    }

    public final void charlie(l entry) {
        NavControllerViewModel navControllerViewModel;
        Intrinsics.echo(entry, "entry");
        androidx.navigation.internal.g gVar = this.hotel.bravo;
        gVar.getClass();
        LinkedHashMap linkedHashMap = gVar.whiskey;
        boolean areEqual = Intrinsics.areEqual(linkedHashMap.get(entry), Boolean.TRUE);
        N n5 = this.charlie;
        n5.juliet(null, kotlin.collections.ab.kilo((Set) n5.getValue(), entry));
        linkedHashMap.remove(entry);
        kotlin.collections.l lVar = gVar.foxtrot;
        boolean contains = lVar.contains(entry);
        N n10 = gVar.hotel;
        if (!contains) {
            gVar.sierra(entry);
            if (entry.f2268a.kilo.delta.compareTo(androidx.lifecycle.ab.red) >= 0) {
                entry.alpha(androidx.lifecycle.ab.alpha);
            }
            boolean isEmpty = lVar.isEmpty();
            String backStackEntryId = entry.white;
            if (!isEmpty) {
                Iterator it = lVar.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((l) it.next()).white, backStackEntryId)) {
                        break;
                    }
                }
            }
            if (!areEqual && (navControllerViewModel = gVar.oscar) != null) {
                Intrinsics.echo(backStackEntryId, "backStackEntryId");
                c0 c0Var = (c0) navControllerViewModel.alpha.remove(backStackEntryId);
                if (c0Var != null) {
                    c0Var.alpha();
                }
            }
            gVar.tango();
            ArrayList papa = gVar.papa();
            n10.getClass();
            n10.juliet(null, papa);
            return;
        }
        if (!this.delta) {
            gVar.tango();
            ArrayList B = CollectionsKt.B(lVar);
            N n11 = gVar.golf;
            n11.getClass();
            n11.juliet(null, B);
            ArrayList papa2 = gVar.papa();
            n10.getClass();
            n10.juliet(null, papa2);
        }
    }

    public final void delta(l lVar) {
        int i4;
        synchronized (this.alpha) {
            try {
                ArrayList B = CollectionsKt.B((Collection) ((N) this.echo.alpha).getValue());
                ListIterator listIterator = B.listIterator(B.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (Intrinsics.areEqual(((l) listIterator.previous()).white, lVar.white)) {
                            i4 = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                B.set(i4, lVar);
                N n5 = this.bravo;
                n5.getClass();
                n5.juliet(null, B);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void echo(l popUpTo, boolean z2) {
        Intrinsics.echo(popUpTo, "popUpTo");
        androidx.navigation.internal.g gVar = this.hotel.bravo;
        Ac.g gVar2 = new Ac.g(this, popUpTo, z2);
        gVar.getClass();
        at bravo = gVar.sierra.bravo(popUpTo.purple.alpha);
        gVar.whiskey.put(popUpTo, Boolean.valueOf(z2));
        if (Intrinsics.areEqual(bravo, this.golf)) {
            androidx.navigation.internal.e eVar = gVar.victor;
            if (eVar != null) {
                eVar.invoke(popUpTo);
                gVar2.invoke();
                return;
            }
            kotlin.collections.l lVar = gVar.foxtrot;
            int indexOf = lVar.indexOf(popUpTo);
            if (indexOf < 0) {
                String message = "Ignoring pop of " + popUpTo + " as it was not found on the current back stack";
                Intrinsics.echo(message, "message");
                Log.i("NavController", message);
                return;
            }
            int i4 = indexOf + 1;
            if (i4 != lVar.red) {
                gVar.mike(((l) lVar.get(i4)).purple.purple.charlie, true, false);
            }
            androidx.navigation.internal.g.oscar(gVar, popUpTo);
            gVar2.invoke();
            gVar.bravo.invoke();
            gVar.bravo();
            return;
        }
        Object obj = gVar.tango.get(bravo);
        Intrinsics.checkNotNull(obj);
        ((o) obj).echo(popUpTo, z2);
    }

    public final void foxtrot(l popUpTo, boolean z2) {
        Object obj;
        Intrinsics.echo(popUpTo, "popUpTo");
        N n5 = this.charlie;
        Iterable iterable = (Iterable) n5.getValue();
        boolean z10 = iterable instanceof Collection;
        yf.av avVar = this.echo;
        if (!z10 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((l) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) ((N) avVar.alpha).getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((l) it2.next()) == popUpTo) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        n5.juliet(null, kotlin.collections.ab.november((Set) n5.getValue(), popUpTo));
        List list = (List) ((N) avVar.alpha).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                l lVar = (l) obj;
                if (!Intrinsics.areEqual(lVar, popUpTo)) {
                    yf.at atVar = avVar.alpha;
                    if (((List) ((N) atVar).getValue()).lastIndexOf(lVar) < ((List) ((N) atVar).getValue()).lastIndexOf(popUpTo)) {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        l lVar2 = (l) obj;
        if (lVar2 != null) {
            n5.juliet(null, kotlin.collections.ab.november((Set) n5.getValue(), lVar2));
        }
        echo(popUpTo, z2);
    }

    public final void golf(l entry) {
        Intrinsics.echo(entry, "entry");
        N n5 = this.charlie;
        n5.juliet(null, kotlin.collections.ab.november((Set) n5.getValue(), entry));
        androidx.navigation.internal.g gVar = this.hotel.bravo;
        gVar.getClass();
        if (gVar.foxtrot.contains(entry)) {
            entry.alpha(androidx.lifecycle.ab.silver);
            return;
        }
        throw new IllegalStateException("Cannot transition entry that is not in the back stack");
    }

    public final void hotel(l backStackEntry) {
        Intrinsics.echo(backStackEntry, "backStackEntry");
        androidx.navigation.internal.g gVar = this.hotel.bravo;
        gVar.getClass();
        at bravo = gVar.sierra.bravo(backStackEntry.purple.alpha);
        if (Intrinsics.areEqual(bravo, this.golf)) {
            Function1 function1 = gVar.uniform;
            if (function1 != null) {
                function1.invoke(backStackEntry);
                alpha(backStackEntry);
                return;
            }
            String message = "Ignoring add of destination " + backStackEntry.purple + " outside of the call to navigate(). ";
            Intrinsics.echo(message, "message");
            Log.i("NavController", message);
            return;
        }
        Object obj = gVar.tango.get(bravo);
        if (obj != null) {
            ((o) obj).hotel(backStackEntry);
            return;
        }
        throw new IllegalStateException(P0.gold(new StringBuilder("NavigatorBackStack for "), backStackEntry.purple.alpha, " should already be created").toString());
    }

    public final void india(l backStackEntry) {
        Intrinsics.echo(backStackEntry, "backStackEntry");
        N n5 = this.charlie;
        Iterable iterable = (Iterable) n5.getValue();
        boolean z2 = iterable instanceof Collection;
        yf.av avVar = this.echo;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((l) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) ((N) avVar.alpha).getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((l) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        l lVar = (l) CollectionsKt.olive((List) ((N) avVar.alpha).getValue());
        if (lVar != null) {
            LinkedHashSet november = kotlin.collections.ab.november((Set) n5.getValue(), lVar);
            n5.getClass();
            n5.juliet(null, november);
        }
        LinkedHashSet november2 = kotlin.collections.ab.november((Set) n5.getValue(), backStackEntry);
        n5.getClass();
        n5.juliet(null, november2);
        hotel(backStackEntry);
    }
}
