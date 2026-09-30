package ef;

import B9.K;
import gf.C1791f;
import gf.InterfaceC1796k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import re.InterfaceC2518b;
import re.InterfaceC2520d;
import xe.C3338a;
import xe.EnumC3339b;

/* renamed from: ef.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1659g extends o {
    public final C1791f golf;
    public final ff.i hotel;
    public final ff.i india;
    public final /* synthetic */ C1661i juliet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1659g(C1661i c1661i, C1791f kotlinTypeRefiner) {
        super(r2, r3, r4, r5, new C1656d(0, r1));
        int collectionSizeOrDefault;
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.juliet = c1661i;
        D5.s sVar = c1661i.e;
        Ie.j jVar = c1661i.teal;
        List list = jVar.f1569j;
        Intrinsics.delta(list, "classProto.functionList");
        List list2 = jVar.f1570k;
        Intrinsics.delta(list2, "classProto.propertyList");
        List list3 = jVar.f1571l;
        Intrinsics.delta(list3, "classProto.typeAliasList");
        List list4 = jVar.f1564d;
        Intrinsics.delta(list4, "classProto.nestedClassNameList");
        Ke.e eVar = (Ke.e) c1661i.e.bravo;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(Zd.a.bravo(eVar, ((Number) it.next()).intValue()));
        }
        this.golf = kotlinTypeRefiner;
        K k6 = (K) sVar.alpha;
        this.hotel = ((ff.l) k6.alpha).bravo(new C1657e(this, 0));
        this.india = ((ff.l) k6.alpha).bravo(new C1657e(this, 1));
    }

    @Override // Xe.o, Xe.p
    public final Collection alpha(Xe.f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        return (Collection) this.hotel.invoke();
    }

    @Override // ef.o, Xe.o, Xe.n
    public final Collection charlie(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        sierra(name, enumC3339b);
        return super.charlie(name, enumC3339b);
    }

    @Override // ef.o, Xe.o, Xe.n
    public final Collection foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        sierra(name, enumC3339b);
        return super.foxtrot(name, enumC3339b);
    }

    @Override // ef.o, Xe.o, Xe.p
    public final InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        InterfaceC2330f interfaceC2330f;
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        sierra(name, location);
        J2.i iVar = this.juliet.f12590i;
        if (iVar != null && (interfaceC2330f = (InterfaceC2330f) ((ff.j) iVar.purple).invoke(name)) != null) {
            return interfaceC2330f;
        }
        return super.golf(name, location);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // ef.o
    public final void hotel(ArrayList arrayList, Function1 nameFilter) {
        ?? r12;
        Intrinsics.echo(nameFilter, "nameFilter");
        J2.i iVar = this.juliet.f12590i;
        if (iVar != null) {
            Set<Ne.f> keySet = ((LinkedHashMap) iVar.alpha).keySet();
            r12 = new ArrayList();
            for (Ne.f name : keySet) {
                Intrinsics.echo(name, "name");
                InterfaceC2330f interfaceC2330f = (InterfaceC2330f) ((ff.j) iVar.purple).invoke(name);
                if (interfaceC2330f != null) {
                    r12.add(interfaceC2330f);
                }
            }
        } else {
            r12 = 0;
        }
        if (r12 == 0) {
            r12 = CollectionsKt.emptyList();
        }
        arrayList.addAll(r12);
    }

    @Override // ef.o
    public final void juliet(Ne.f name, ArrayList arrayList) {
        Intrinsics.echo(name, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.india.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((y) it.next()).olive().charlie(name, EnumC3339b.red));
        }
        D5.s sVar = this.bravo;
        arrayList.addAll(((InterfaceC2518b) ((K) sVar.alpha).november).bravo(name, this.juliet));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((gf.l) ((InterfaceC1796k) ((K) sVar.alpha).quebec)).delta.hotel(name, arrayList2, arrayList3, this.juliet, new C1658f(arrayList, 0));
    }

    @Override // ef.o
    public final void kilo(Ne.f name, ArrayList arrayList) {
        Intrinsics.echo(name, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.india.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((y) it.next()).olive().foxtrot(name, EnumC3339b.red));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((gf.l) ((InterfaceC1796k) ((K) this.bravo.alpha).quebec)).delta.hotel(name, arrayList2, arrayList3, this.juliet, new C1658f(arrayList, 0));
    }

    @Override // ef.o
    public final Ne.b lima(Ne.f name) {
        Intrinsics.echo(name, "name");
        return this.juliet.f12583a.delta(name);
    }

    @Override // ef.o
    public final Set november() {
        List lima = this.juliet.f12588g.lima();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = lima.iterator();
        while (it.hasNext()) {
            Set delta = ((y) it.next()).olive().delta();
            if (delta != null) {
                CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, delta);
            } else {
                return null;
            }
        }
        return linkedHashSet;
    }

    @Override // ef.o
    public final Set oscar() {
        C1661i c1661i = this.juliet;
        List lima = c1661i.f12588g.lima();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = lima.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, ((y) it.next()).olive().bravo());
        }
        linkedHashSet.addAll(((InterfaceC2518b) ((K) this.bravo.alpha).november).alpha(c1661i));
        return linkedHashSet;
    }

    @Override // ef.o
    public final Set papa() {
        List lima = this.juliet.f12588g.lima();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = lima.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, ((y) it.next()).olive().echo());
        }
        return linkedHashSet;
    }

    @Override // ef.o
    public final boolean romeo(r rVar) {
        return ((InterfaceC2520d) ((K) this.bravo.alpha).oscar).delta(this.juliet, rVar);
    }

    public final void sierra(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        Intrinsics.echo((C3338a) ((K) this.bravo.alpha).india, "<this>");
        C1661i scopeOwner = this.juliet;
        Intrinsics.echo(scopeOwner, "scopeOwner");
    }
}
