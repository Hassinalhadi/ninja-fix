package c2;

import Y1.aa;
import Y1.aj;
import Y1.as;
import Y1.at;
import Y1.l;
import Y1.o;
import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.P0;
import androidx.fragment.app.A;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;
import androidx.fragment.app.L;
import androidx.fragment.app.O;
import androidx.fragment.app.ai;
import androidx.lifecycle.ac;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import o2.C2191a;
import yf.N;

@as("dialog")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lc2/d;", "LY1/at;", "Lc2/b;", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: c2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0826d extends at {
    public final Context charlie;
    public final L delta;
    public final LinkedHashSet echo = new LinkedHashSet();
    public final C2191a foxtrot = new C2191a(3, this);
    public final LinkedHashMap golf = new LinkedHashMap();

    public C0826d(Context context, L l10) {
        this.charlie = context;
        this.delta = l10;
    }

    @Override // Y1.at
    public final aa alpha() {
        return new aa(this);
    }

    @Override // Y1.at
    public final void delta(List list, aj ajVar) {
        L l10 = this.delta;
        if (l10.jade()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            kilo(lVar).romeo(l10, lVar.white);
            l lVar2 = (l) CollectionsKt.olive((List) ((N) bravo().echo.alpha).getValue());
            boolean bronze = CollectionsKt.bronze((Iterable) ((N) bravo().foxtrot.alpha).getValue(), lVar2);
            bravo().india(lVar);
            if (lVar2 != null && !bronze) {
                bravo().charlie(lVar2);
            }
        }
    }

    @Override // Y1.at
    public final void echo(o oVar) {
        ac lifecycle;
        this.alpha = oVar;
        this.bravo = true;
        Iterator it = ((List) ((N) oVar.echo.alpha).getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            L l10 = this.delta;
            if (hasNext) {
                l lVar = (l) it.next();
                DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w = (DialogInterfaceOnCancelListenerC0627w) l10.blue(lVar.white);
                if (dialogInterfaceOnCancelListenerC0627w != null && (lifecycle = dialogInterfaceOnCancelListenerC0627w.getLifecycle()) != null) {
                    lifecycle.alpha(this.foxtrot);
                } else {
                    this.echo.add(lVar.white);
                }
            } else {
                l10.quebec.add(new O() { // from class: c2.a
                    @Override // androidx.fragment.app.O
                    public final void alpha(L l11, ai aiVar) {
                        Intrinsics.echo(l11, "<unused var>");
                        C0826d c0826d = C0826d.this;
                        LinkedHashSet linkedHashSet = c0826d.echo;
                        if (x.alpha(linkedHashSet).remove(aiVar.getTag())) {
                            aiVar.getLifecycle().alpha(c0826d.foxtrot);
                        }
                        LinkedHashMap linkedHashMap = c0826d.golf;
                        x.charlie(linkedHashMap).remove(aiVar.getTag());
                    }
                });
                return;
            }
        }
    }

    @Override // Y1.at
    public final void foxtrot(l lVar) {
        L l10 = this.delta;
        if (l10.jade()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        LinkedHashMap linkedHashMap = this.golf;
        String str = lVar.white;
        DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w = (DialogInterfaceOnCancelListenerC0627w) linkedHashMap.get(str);
        if (dialogInterfaceOnCancelListenerC0627w == null) {
            ai blue = l10.blue(str);
            if (blue instanceof DialogInterfaceOnCancelListenerC0627w) {
                dialogInterfaceOnCancelListenerC0627w = (DialogInterfaceOnCancelListenerC0627w) blue;
            } else {
                dialogInterfaceOnCancelListenerC0627w = null;
            }
        }
        if (dialogInterfaceOnCancelListenerC0627w != null) {
            dialogInterfaceOnCancelListenerC0627w.getLifecycle().charlie(this.foxtrot);
            dialogInterfaceOnCancelListenerC0627w.juliet();
        }
        kilo(lVar).romeo(l10, str);
        o bravo = bravo();
        List list = (List) ((N) bravo.echo.alpha).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            l lVar2 = (l) listIterator.previous();
            if (Intrinsics.areEqual(lVar2.white, str)) {
                N n5 = bravo.charlie;
                n5.juliet(null, ab.november(ab.november((Set) n5.getValue(), lVar2), lVar));
                bravo.delta(lVar);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // Y1.at
    public final void india(l lVar, boolean z2) {
        L l10 = this.delta;
        if (l10.jade()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((N) bravo().echo.alpha).getValue();
        int indexOf = list.indexOf(lVar);
        Iterator it = CollectionsKt.i(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            ai blue = l10.blue(((l) it.next()).white);
            if (blue != null) {
                ((DialogInterfaceOnCancelListenerC0627w) blue).juliet();
            }
        }
        lima(indexOf, lVar, z2);
    }

    public final DialogInterfaceOnCancelListenerC0627w kilo(l lVar) {
        aa aaVar = lVar.purple;
        Intrinsics.charlie(aaVar, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C0824b c0824b = (C0824b) aaVar;
        String str = c0824b.yellow;
        if (str != null) {
            char charAt = str.charAt(0);
            Context context = this.charlie;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            A emerald = this.delta.emerald();
            context.getClassLoader();
            ai alpha = emerald.alpha(str);
            Intrinsics.delta(alpha, "instantiate(...)");
            if (DialogInterfaceOnCancelListenerC0627w.class.isAssignableFrom(alpha.getClass())) {
                DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w = (DialogInterfaceOnCancelListenerC0627w) alpha;
                dialogInterfaceOnCancelListenerC0627w.setArguments(lVar.f2268a.alpha());
                dialogInterfaceOnCancelListenerC0627w.getLifecycle().alpha(this.foxtrot);
                this.golf.put(lVar.white, dialogInterfaceOnCancelListenerC0627w);
                return dialogInterfaceOnCancelListenerC0627w;
            }
            StringBuilder sb2 = new StringBuilder("Dialog destination ");
            String str2 = c0824b.yellow;
            if (str2 != null) {
                throw new IllegalArgumentException(P0.gold(sb2, str2, " is not an instance of DialogFragment").toString());
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public final void lima(int i4, l lVar, boolean z2) {
        l lVar2 = (l) CollectionsKt.jade(i4 - 1, (List) ((N) bravo().echo.alpha).getValue());
        boolean bronze = CollectionsKt.bronze((Iterable) ((N) bravo().foxtrot.alpha).getValue(), lVar2);
        bravo().foxtrot(lVar, z2);
        if (lVar2 != null && !bronze) {
            bravo().charlie(lVar2);
        }
    }
}
