package gf;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ab;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.x;
import kotlin.reflect.jvm.internal.impl.types.y;
import of.AbstractC2262q;

/* loaded from: classes2.dex */
public final class u {
    public static final u alpha = new Object();

    public static ArrayList alpha(AbstractCollection abstractCollection, Xd.l lVar) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        Intrinsics.delta(it, "filteredTypes.iterator()");
        while (it.hasNext()) {
            ae upper = (ae) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ae lower = (ae) it2.next();
                    if (lower != upper) {
                        Intrinsics.delta(lower, "lower");
                        Intrinsics.delta(upper, "upper");
                        if (((Boolean) lVar.invoke(lower, upper)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.reflect.jvm.internal.impl.types.al] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [lf.d, java.lang.Object, kotlin.reflect.jvm.internal.impl.types.al] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v18, types: [kotlin.reflect.jvm.internal.impl.types.ae] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlin.reflect.jvm.internal.impl.types.ae, kotlin.reflect.jvm.internal.impl.types.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Set, java.util.LinkedHashSet] */
    public final ae bravo(ArrayList arrayList) {
        int collectionSizeOrDefault;
        ae aeVar;
        ae bravo;
        int collectionSizeOrDefault2;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ae aeVar2 = (ae) it.next();
            if (aeVar2.green() instanceof x) {
                Collection lima = aeVar2.green().lima();
                Intrinsics.delta(lima, "type.constructor.supertypes");
                Collection<y> collection = lima;
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
                ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
                for (y it2 : collection) {
                    Intrinsics.delta(it2, "it");
                    ae yankee = kotlin.reflect.jvm.internal.impl.types.c.yankee(it2);
                    if (aeVar2.indigo()) {
                        yankee = yankee.pink(true);
                    }
                    arrayList3.add(yankee);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(aeVar2);
            }
        }
        s sVar = s.alpha;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            sVar = sVar.alpha((B) it3.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            ae aeVar3 = (ae) it4.next();
            if (sVar == s.silver) {
                if (aeVar3 instanceof C1793h) {
                    C1793h c1793h = (C1793h) aeVar3;
                    Intrinsics.echo(c1793h, "<this>");
                    aeVar3 = new C1793h(c1793h.purple, c1793h.red, c1793h.silver, c1793h.teal, c1793h.white, true);
                }
                Intrinsics.echo(aeVar3, "<this>");
                ae oscar = kotlin.reflect.jvm.internal.impl.types.e.oscar(aeVar3, false);
                if (oscar != null || (oscar = kotlin.reflect.jvm.internal.impl.types.c.mike(aeVar3)) != null) {
                    aeVar3 = oscar;
                } else {
                    aeVar3 = aeVar3.pink(false);
                }
            }
            linkedHashSet.add(aeVar3);
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault);
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((ae) it5.next()).gold());
        }
        Iterator it6 = arrayList4.iterator();
        if (it6.hasNext()) {
            ?? next = it6.next();
            while (true) {
                aeVar = null;
                if (!it6.hasNext()) {
                    break;
                }
                al other = (al) it6.next();
                next = (al) next;
                next.getClass();
                Intrinsics.echo(other, "other");
                if (!next.isEmpty() || !other.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    Collection values = ((ConcurrentHashMap) al.purple.purple).values();
                    Intrinsics.delta(values, "idPerType.values");
                    Iterator it7 = values.iterator();
                    while (it7.hasNext()) {
                        int intValue = ((Number) it7.next()).intValue();
                        kotlin.reflect.jvm.internal.impl.types.j jVar = (kotlin.reflect.jvm.internal.impl.types.j) next.alpha.get(intValue);
                        kotlin.reflect.jvm.internal.impl.types.j jVar2 = (kotlin.reflect.jvm.internal.impl.types.j) other.alpha.get(intValue);
                        if (jVar == null) {
                            if (jVar2 == null || !Intrinsics.areEqual(jVar, jVar2)) {
                                jVar2 = null;
                            }
                        } else {
                            if (!Intrinsics.areEqual(jVar2, jVar)) {
                                jVar = null;
                            }
                            jVar2 = jVar;
                        }
                        AbstractC2262q.alpha(arrayList5, jVar2);
                    }
                    next = com.google.android.play.core.integrity.k.echo(arrayList5);
                }
            }
            al alVar = (al) next;
            if (linkedHashSet.size() == 1) {
                bravo = (ae) CollectionsKt.j(linkedHashSet);
            } else {
                new Xe.s(29, linkedHashSet);
                ArrayList alpha2 = alpha(linkedHashSet, new t(2, this, 0));
                alpha2.isEmpty();
                if (!alpha2.isEmpty()) {
                    Iterator it8 = alpha2.iterator();
                    if (it8.hasNext()) {
                        ae next2 = it8.next();
                        while (it8.hasNext()) {
                            ae aeVar4 = (ae) it8.next();
                            next2 = next2;
                            if (next2 != 0 && aeVar4 != null) {
                                ap green = next2.green();
                                ap green2 = aeVar4.green();
                                boolean z2 = green instanceof Se.m;
                                if (z2 && (green2 instanceof Se.m)) {
                                    Se.m mVar = new Se.m(CollectionsKt.E(((Se.m) green).alpha, ((Se.m) green2).alpha));
                                    al.purple.getClass();
                                    al attributes = al.red;
                                    Intrinsics.echo(attributes, "attributes");
                                    next2 = ab.delta(hf.i.alpha(2, true, "unknown integer literal type"), CollectionsKt.emptyList(), attributes, mVar, false);
                                } else if (z2) {
                                    if (!((Se.m) green).alpha.contains(aeVar4)) {
                                        aeVar4 = null;
                                    }
                                    next2 = aeVar4;
                                } else if ((green2 instanceof Se.m) && ((Se.m) green2).alpha.contains(next2)) {
                                }
                            }
                            next2 = 0;
                        }
                        aeVar = next2;
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                }
                if (aeVar != null) {
                    bravo = aeVar;
                } else {
                    InterfaceC1796k.bravo.getClass();
                    ArrayList alpha3 = alpha(alpha2, new t(2, C1795j.bravo, 1));
                    alpha3.isEmpty();
                    if (alpha3.size() < 2) {
                        bravo = (ae) CollectionsKt.j(alpha3);
                    } else {
                        bravo = new x(linkedHashSet).bravo();
                    }
                }
            }
            return bravo.white(alVar);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
