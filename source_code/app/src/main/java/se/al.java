package se;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import of.AbstractC2262q;
import pe.InterfaceC2349y;
import s6.K4;

/* loaded from: classes2.dex */
public final class al extends Xe.o {
    public final InterfaceC2349y bravo;
    public final Ne.c charlie;

    public al(InterfaceC2349y moduleDescriptor, Ne.c fqName) {
        Intrinsics.echo(moduleDescriptor, "moduleDescriptor");
        Intrinsics.echo(fqName, "fqName");
        this.bravo = moduleDescriptor;
        this.charlie = fqName;
    }

    @Override // Xe.o, Xe.p
    public final Collection alpha(Xe.f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        if (!kindFilter.alpha(Xe.f.hotel)) {
            return CollectionsKt.emptyList();
        }
        Ne.c cVar = this.charlie;
        if (cVar.delta()) {
            if (kindFilter.alpha.contains(Xe.c.alpha)) {
                return CollectionsKt.emptyList();
            }
        }
        InterfaceC2349y interfaceC2349y = this.bravo;
        Collection kilo = interfaceC2349y.kilo(cVar, nameFilter);
        ArrayList arrayList = new ArrayList(kilo.size());
        Iterator it = kilo.iterator();
        while (it.hasNext()) {
            Ne.f foxtrot = ((Ne.c) it.next()).foxtrot();
            Intrinsics.delta(foxtrot, "subFqName.shortName()");
            if (((Boolean) nameFilter.invoke(foxtrot)).booleanValue()) {
                C2873w c2873w = null;
                if (!foxtrot.purple) {
                    C2873w c2873w2 = (C2873w) interfaceC2349y.amber(cVar.charlie(foxtrot));
                    if (!((Boolean) K4.alpha(c2873w2.white, C2873w.f13797a[1])).booleanValue()) {
                        c2873w = c2873w2;
                    }
                }
                AbstractC2262q.alpha(arrayList, c2873w);
            }
        }
        return arrayList;
    }

    @Override // Xe.o, Xe.n
    public final Set delta() {
        return kotlin.collections.u.alpha;
    }

    public final String toString() {
        return "subpackages of " + this.charlie + " from " + this.bravo;
    }
}
