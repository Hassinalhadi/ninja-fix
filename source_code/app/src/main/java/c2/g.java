package c2;

import Y1.l;
import Y1.o;
import ae.C0423b;
import android.util.Log;
import androidx.appcompat.widget.P0;
import androidx.fragment.app.G;
import androidx.fragment.app.ai;
import androidx.navigation.fragment.FragmentNavigator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yf.N;

/* loaded from: classes3.dex */
public final class g implements G {
    public final /* synthetic */ o alpha;
    public final /* synthetic */ FragmentNavigator bravo;

    public g(o oVar, FragmentNavigator fragmentNavigator) {
        this.alpha = oVar;
        this.bravo = fragmentNavigator;
    }

    @Override // androidx.fragment.app.G
    public final /* synthetic */ void onBackStackChangeCancelled() {
    }

    @Override // androidx.fragment.app.G
    public final void onBackStackChangeCommitted(ai fragment, boolean z2) {
        Object obj;
        Object obj2;
        boolean z10;
        Intrinsics.echo(fragment, "fragment");
        o oVar = this.alpha;
        ArrayList a6 = CollectionsKt.a((Collection) ((N) oVar.echo.alpha).getValue(), (Iterable) ((N) oVar.foxtrot.alpha).getValue());
        ListIterator listIterator = a6.listIterator(a6.size());
        while (true) {
            obj = null;
            if (listIterator.hasPrevious()) {
                obj2 = listIterator.previous();
                if (Intrinsics.areEqual(((l) obj2).white, fragment.getTag())) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        l lVar = (l) obj2;
        boolean z11 = true;
        FragmentNavigator fragmentNavigator = this.bravo;
        if (z2 && fragmentNavigator.golf.isEmpty() && fragment.isRemoving()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Iterator it = fragmentNavigator.golf.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((Pair) next).getFirst(), fragment.getTag())) {
                obj = next;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            fragmentNavigator.golf.remove(pair);
        }
        if (!z10 && FragmentNavigator.november()) {
            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + lVar);
        }
        if (pair == null || !((Boolean) pair.getSecond()).booleanValue()) {
            z11 = false;
        }
        if (!z2 && !z11 && lVar == null) {
            throw new IllegalArgumentException(P0.coral("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
        }
        if (lVar != null) {
            fragmentNavigator.lima(fragment, lVar, oVar);
            if (z10) {
                if (FragmentNavigator.november()) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + lVar + " via system back");
                }
                oVar.foxtrot(lVar, false);
            }
        }
    }

    @Override // androidx.fragment.app.G
    public final /* synthetic */ void onBackStackChangeProgressed(C0423b c0423b) {
    }

    @Override // androidx.fragment.app.G
    public final void onBackStackChangeStarted(ai fragment, boolean z2) {
        Object obj;
        Intrinsics.echo(fragment, "fragment");
        if (z2) {
            o oVar = this.alpha;
            List list = (List) ((N) oVar.echo.alpha).getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (Intrinsics.areEqual(((l) obj).white, fragment.getTag())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            l lVar = (l) obj;
            this.bravo.getClass();
            if (FragmentNavigator.november()) {
                Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + lVar);
            }
            if (lVar != null) {
                oVar.golf(lVar);
            }
        }
    }

    @Override // androidx.fragment.app.G
    public final void onBackStackChanged() {
    }
}
