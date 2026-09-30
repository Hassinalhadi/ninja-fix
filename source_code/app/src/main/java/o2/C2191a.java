package o2;

import Y1.l;
import ae.o;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;
import androidx.lifecycle.C0652w;
import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import androidx.lifecycle.aa;
import androidx.lifecycle.aj;
import androidx.lifecycle.al;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import ao.ad;
import av.q;
import c2.AbstractC0825c;
import c2.C0826d;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yf.N;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2191a implements aj {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ C2191a(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(al alVar, aa aaVar) {
        int i4;
        switch (this.alpha) {
            case 0:
                if (aaVar == aa.ON_CREATE) {
                    alVar.getLifecycle().charlie(this);
                    InterfaceC2196f interfaceC2196f = (InterfaceC2196f) this.purple;
                    Bundle alpha = interfaceC2196f.getSavedStateRegistry().alpha("androidx.savedstate.Restarter");
                    if (alpha != null) {
                        ArrayList<String> stringArrayList = alpha.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            for (String str : stringArrayList) {
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str, false, C2191a.class.getClassLoader()).asSubclass(InterfaceC2192b.class);
                                    Intrinsics.checkNotNull(asSubclass);
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            Intrinsics.checkNotNull(newInstance);
                                            ((C0652w) ((InterfaceC2192b) newInstance)).getClass();
                                            if (interfaceC2196f instanceof d0) {
                                                c0 viewModelStore = ((d0) interfaceC2196f).getViewModelStore();
                                                C2194d savedStateRegistry = interfaceC2196f.getSavedStateRegistry();
                                                viewModelStore.getClass();
                                                LinkedHashMap linkedHashMap = viewModelStore.alpha;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String key = (String) it.next();
                                                    Intrinsics.echo(key, "key");
                                                    Y y10 = (Y) linkedHashMap.get(key);
                                                    if (y10 != null) {
                                                        T.alpha(y10, savedStateRegistry, interfaceC2196f.getLifecycle());
                                                    }
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    savedStateRegistry.delta();
                                                }
                                            } else {
                                                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + interfaceC2196f).toString());
                                            }
                                        } catch (Exception e) {
                                            throw new RuntimeException(q.echo("Failed to instantiate ", str), e);
                                        }
                                    } catch (NoSuchMethodException e4) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                                    }
                                } catch (ClassNotFoundException e5) {
                                    throw new RuntimeException(ad.gray("Class ", str, " wasn't found"), e5);
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                if (aaVar == aa.ON_START) {
                    HomeActivityV2.gold((HomeActivityV2) this.purple);
                    return;
                }
                return;
            case 2:
                o oVar = (o) this.purple;
                o.access$ensureViewModelStore(oVar);
                oVar.getLifecycle().charlie(this);
                return;
            default:
                int i5 = AbstractC0825c.$EnumSwitchMapping$0[aaVar.ordinal()];
                C0826d c0826d = (C0826d) this.purple;
                if (i5 != 1) {
                    Object obj = null;
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 4) {
                                DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w = (DialogInterfaceOnCancelListenerC0627w) alVar;
                                for (Object obj2 : (Iterable) ((N) c0826d.bravo().foxtrot.alpha).getValue()) {
                                    if (Intrinsics.areEqual(((l) obj2).white, dialogInterfaceOnCancelListenerC0627w.getTag())) {
                                        obj = obj2;
                                    }
                                }
                                l lVar = (l) obj;
                                if (lVar != null) {
                                    c0826d.bravo().charlie(lVar);
                                }
                                dialogInterfaceOnCancelListenerC0627w.getLifecycle().charlie(this);
                                return;
                            }
                            return;
                        }
                        DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w2 = (DialogInterfaceOnCancelListenerC0627w) alVar;
                        if (!dialogInterfaceOnCancelListenerC0627w2.november().isShowing()) {
                            List list = (List) ((N) c0826d.bravo().echo.alpha).getValue();
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (Intrinsics.areEqual(((l) listIterator.previous()).white, dialogInterfaceOnCancelListenerC0627w2.getTag())) {
                                        i4 = listIterator.nextIndex();
                                    }
                                } else {
                                    i4 = -1;
                                }
                            }
                            l lVar2 = (l) CollectionsKt.jade(i4, list);
                            if (!Intrinsics.areEqual(CollectionsKt.olive(list), lVar2)) {
                                Log.i("DialogFragmentNavigator", "Dialog " + dialogInterfaceOnCancelListenerC0627w2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                            }
                            if (lVar2 != null) {
                                c0826d.lima(i4, lVar2, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w3 = (DialogInterfaceOnCancelListenerC0627w) alVar;
                    for (Object obj3 : (Iterable) ((N) c0826d.bravo().foxtrot.alpha).getValue()) {
                        if (Intrinsics.areEqual(((l) obj3).white, dialogInterfaceOnCancelListenerC0627w3.getTag())) {
                            obj = obj3;
                        }
                    }
                    l lVar3 = (l) obj;
                    if (lVar3 != null) {
                        c0826d.bravo().charlie(lVar3);
                        return;
                    }
                    return;
                }
                DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w4 = (DialogInterfaceOnCancelListenerC0627w) alVar;
                Iterable iterable = (Iterable) ((N) c0826d.bravo().echo.alpha).getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.areEqual(((l) it2.next()).white, dialogInterfaceOnCancelListenerC0627w4.getTag())) {
                            return;
                        }
                    }
                }
                dialogInterfaceOnCancelListenerC0627w4.juliet();
                return;
        }
    }

    public C2191a(InterfaceC2196f owner) {
        this.alpha = 0;
        Intrinsics.echo(owner, "owner");
        this.purple = owner;
    }
}
