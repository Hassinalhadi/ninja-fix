package Ce;

import B2.ap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import of.AbstractC2254i;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public final class w extends al {
    public final ve.aa november;
    public final r oscar;
    public final ff.h papa;
    public final ff.j quebec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(B9.ab abVar, ve.aa aaVar, r ownerDescriptor) {
        super(abVar, null);
        Intrinsics.echo(ownerDescriptor, "ownerDescriptor");
        this.november = aaVar;
        this.oscar = ownerDescriptor;
        ff.l lVar = ((Be.a) abVar.purple).alpha;
        Aa.i iVar = new Aa.i(7, abVar, this);
        lVar.getClass();
        this.papa = new ff.h(lVar, iVar);
        this.quebec = lVar.delta(new ap(3, this, abVar));
    }

    @Override // Ce.ad, Xe.o, Xe.p
    public final Collection alpha(Xe.f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        if (!kindFilter.alpha(Xe.f.lima | Xe.f.echo)) {
            return CollectionsKt.emptyList();
        }
        Iterable iterable = (Iterable) this.delta.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC2335k interfaceC2335k = (InterfaceC2335k) obj;
            if (interfaceC2335k instanceof InterfaceC2330f) {
                Ne.f name = ((InterfaceC2330f) interfaceC2335k).getName();
                Intrinsics.delta(name, "it.name");
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // Ce.ad, Xe.o, Xe.n
    public final Collection foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        return CollectionsKt.emptyList();
    }

    @Override // Xe.o, Xe.p
    public final InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        return victor(name, null);
    }

    @Override // Ce.ad
    public final Set hotel(Xe.f kindFilter, Xe.k kVar) {
        Intrinsics.echo(kindFilter, "kindFilter");
        if (!kindFilter.alpha(Xe.f.echo)) {
            return kotlin.collections.u.alpha;
        }
        Set set = (Set) this.papa.invoke();
        Function1 nameFilter = kVar;
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(Ne.f.echo((String) it.next()));
            }
            return hashSet;
        }
        if (kVar == null) {
            nameFilter = AbstractC2254i.alpha;
        }
        this.november.getClass();
        Intrinsics.echo(nameFilter, "nameFilter");
        List<ve.q> emptyList = CollectionsKt.emptyList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ve.q qVar : emptyList) {
            qVar.getClass();
            linkedHashSet.add(Ne.f.echo(qVar.alpha.getSimpleName()));
        }
        return linkedHashSet;
    }

    @Override // Ce.ad
    public final Set india(Xe.f kindFilter, Xe.k kVar) {
        Intrinsics.echo(kindFilter, "kindFilter");
        return kotlin.collections.u.alpha;
    }

    @Override // Ce.ad
    public final c kilo() {
        return b.alpha;
    }

    @Override // Ce.ad
    public final void mike(LinkedHashSet linkedHashSet, Ne.f name) {
        Intrinsics.echo(name, "name");
    }

    @Override // Ce.ad
    public final Set oscar(Xe.f kindFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        return kotlin.collections.u.alpha;
    }

    @Override // Ce.ad
    public final InterfaceC2335k quebec() {
        return this.oscar;
    }

    public final InterfaceC2330f victor(Ne.f name, ve.q qVar) {
        Ne.f fVar = Ne.h.alpha;
        Intrinsics.echo(name, "name");
        String bravo = name.bravo();
        Intrinsics.delta(bravo, "name.asString()");
        if (bravo.length() > 0 && !name.purple) {
            Set set = (Set) this.papa.invoke();
            if (qVar != null || set == null || set.contains(name.bravo())) {
                return (InterfaceC2330f) this.quebec.invoke(new s(name, qVar));
            }
            return null;
        }
        return null;
    }
}
