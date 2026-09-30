package Ce;

import com.google.android.gms.internal.measurement.AbstractC1380u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import of.AbstractC2262q;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public final class ak extends al {
    public static final /* synthetic */ int papa = 0;
    public final ve.q november;
    public final j oscar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(B9.ab abVar, ve.q jClass, j jVar) {
        super(abVar, null);
        Intrinsics.echo(jClass, "jClass");
        this.november = jClass;
        this.oscar = jVar;
    }

    public static pe.al victor(pe.al alVar) {
        int collectionSizeOrDefault;
        if (alVar.november() != 2) {
            return alVar;
        }
        Collection mike = alVar.mike();
        Intrinsics.delta(mike, "this.overriddenDescriptors");
        Collection<pe.al> collection = mike;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (pe.al it : collection) {
            Intrinsics.delta(it, "it");
            arrayList.add(victor(it));
        }
        return (pe.al) CollectionsKt.k(CollectionsKt.coral(arrayList));
    }

    @Override // Xe.o, Xe.p
    public final InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        return null;
    }

    @Override // Ce.ad
    public final Set hotel(Xe.f kindFilter, Xe.k kVar) {
        Intrinsics.echo(kindFilter, "kindFilter");
        return kotlin.collections.u.alpha;
    }

    @Override // Ce.ad
    public final Set india(Xe.f kindFilter, Xe.k kVar) {
        Set set;
        Intrinsics.echo(kindFilter, "kindFilter");
        LinkedHashSet C = CollectionsKt.C(((c) this.echo.invoke()).alpha());
        j jVar = this.oscar;
        ak bravo = AbstractC1380u1.bravo(jVar);
        if (bravo != null) {
            set = bravo.bravo();
        } else {
            set = null;
        }
        if (set == null) {
            set = kotlin.collections.u.alpha;
        }
        C.addAll(set);
        if (this.november.alpha.isEnum()) {
            C.addAll(CollectionsKt.listOf(me.n.charlie, me.n.alpha));
        }
        B9.ab abVar = this.bravo;
        C.addAll(((Ve.a) ((Be.a) abVar.purple).xray).golf(abVar, jVar));
        return C;
    }

    @Override // Ce.ad
    public final void juliet(Ne.f name, ArrayList arrayList) {
        Intrinsics.echo(name, "name");
        B9.ab abVar = this.bravo;
        ((Ve.a) ((Be.a) abVar.purple).xray).delta(abVar, this.oscar, name, arrayList);
    }

    @Override // Ce.ad
    public final c kilo() {
        return new a(this.november, af.alpha);
    }

    @Override // Ce.ad
    public final void mike(LinkedHashSet linkedHashSet, Ne.f name) {
        Collection D10;
        Intrinsics.echo(name, "name");
        j jVar = this.oscar;
        ak bravo = AbstractC1380u1.bravo(jVar);
        if (bravo == null) {
            D10 = kotlin.collections.u.alpha;
        } else {
            D10 = CollectionsKt.D(bravo.charlie(name, EnumC3339b.teal));
        }
        Collection collection = D10;
        Be.a aVar = (Be.a) this.bravo.purple;
        linkedHashSet.addAll(y6.e.foxtrot(name, collection, linkedHashSet, this.oscar, aVar.foxtrot, aVar.uniform.delta));
        if (this.november.alpha.isEnum()) {
            if (Intrinsics.areEqual(name, me.n.charlie)) {
                linkedHashSet.add(Qe.l.india(jVar));
            } else if (Intrinsics.areEqual(name, me.n.alpha)) {
                linkedHashSet.add(Qe.l.juliet(jVar));
            }
        }
    }

    @Override // Ce.al, Ce.ad
    public final void november(Ne.f name, ArrayList arrayList) {
        Intrinsics.echo(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ag agVar = new ag(name, 0);
        j jVar = this.oscar;
        AbstractC2262q.echo(kotlin.collections.ab.juliet(jVar), ae.alpha, new aj(jVar, linkedHashSet, agVar));
        boolean isEmpty = arrayList.isEmpty();
        B9.ab abVar = this.bravo;
        if (!isEmpty) {
            Be.a aVar = (Be.a) abVar.purple;
            arrayList.addAll(y6.e.foxtrot(name, linkedHashSet, arrayList, this.oscar, aVar.foxtrot, aVar.uniform.delta));
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                pe.al victor = victor((pe.al) obj);
                Object obj2 = linkedHashMap.get(victor);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(victor, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                Be.a aVar2 = (Be.a) abVar.purple;
                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, y6.e.foxtrot(name, collection, arrayList, this.oscar, aVar2.foxtrot, aVar2.uniform.delta));
            }
            arrayList.addAll(arrayList2);
        }
        if (this.november.alpha.isEnum() && Intrinsics.areEqual(name, me.n.bravo)) {
            AbstractC2262q.alpha(arrayList, Qe.l.hotel(jVar));
        }
    }

    @Override // Ce.ad
    public final Set oscar(Xe.f kindFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        LinkedHashSet C = CollectionsKt.C(((c) this.echo.invoke()).echo());
        ah ahVar = ah.alpha;
        j jVar = this.oscar;
        AbstractC2262q.echo(kotlin.collections.ab.juliet(jVar), ae.alpha, new aj(jVar, C, ahVar));
        if (this.november.alpha.isEnum()) {
            C.add(me.n.bravo);
        }
        return C;
    }

    @Override // Ce.ad
    public final InterfaceC2335k quebec() {
        return this.oscar;
    }
}
