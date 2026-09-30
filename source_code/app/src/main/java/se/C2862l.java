package se;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2347w;
import pe.InterfaceC2325ah;

/* renamed from: se.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2862l implements InterfaceC2325ah {
    public final List alpha;
    public final String bravo;

    public C2862l(List providers, String debugName) {
        Intrinsics.echo(providers, "providers");
        Intrinsics.echo(debugName, "debugName");
        this.alpha = providers;
        this.bravo = debugName;
        providers.size();
        CollectionsKt.D(providers).size();
    }

    @Override // pe.InterfaceC2325ah
    public final boolean alpha(Ne.c fqName) {
        boolean z2;
        Intrinsics.echo(fqName, "fqName");
        List list = this.alpha;
        if (list != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!AbstractC2347w.hotel((InterfaceC2325ah) it.next(), fqName)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // pe.InterfaceC2325ah
    public final void bravo(Ne.c fqName, ArrayList arrayList) {
        Intrinsics.echo(fqName, "fqName");
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            AbstractC2347w.bravo((InterfaceC2325ah) it.next(), fqName, arrayList);
        }
    }

    @Override // pe.InterfaceC2325ah
    public final Collection kilo(Ne.c fqName, Function1 nameFilter) {
        Intrinsics.echo(fqName, "fqName");
        Intrinsics.echo(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC2325ah) it.next()).kilo(fqName, nameFilter));
        }
        return hashSet;
    }

    public final String toString() {
        return this.bravo;
    }
}
