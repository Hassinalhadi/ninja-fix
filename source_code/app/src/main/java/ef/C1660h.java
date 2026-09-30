package ef;

import B9.K;
import Ie.aq;
import cf.InterfaceC0845a;
import cf.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.ae;
import pe.AbstractC2327c;
import pe.AbstractC2340p;
import pe.AbstractC2347w;
import pe.C2339o;
import pe.C2346v;
import pe.C2350z;
import pe.InterfaceC2321ad;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.an;
import qe.C2471g;
import re.InterfaceC2518b;
import se.C2859i;
import xe.EnumC3339b;

/* renamed from: ef.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1660h extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C1661i purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1660h(C1661i c1661i, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c1661i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int collectionSizeOrDefault;
        Object obj;
        C2339o c2339o;
        Object obj2;
        aq aqVar;
        p000if.d dVar;
        int collectionSizeOrDefault2;
        ?? r4;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        int i4 = 4;
        int i5 = 3;
        int i10 = 1;
        C1661i c1661i = this.purple;
        switch (this.alpha) {
            case 0:
                return AbstractC2347w.charlie(c1661i);
            case 1:
                return CollectionsKt.z(((InterfaceC0845a) ((K) c1661i.e.alpha).echo).golf(c1661i.f12597p));
            case 2:
                Ie.j jVar = c1661i.teal;
                if ((jVar.red & 4) != 4) {
                    return null;
                }
                InterfaceC2332h golf = c1661i.cyan().golf(Zd.a.bravo((Ke.e) c1661i.e.bravo, jVar.white), EnumC3339b.yellow);
                if (!(golf instanceof InterfaceC2330f)) {
                    return null;
                }
                return (InterfaceC2330f) golf;
            case 3:
                List list = c1661i.teal.f1568i;
                Intrinsics.delta(list, "classProto.constructorList");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (Ke.d.mike.echo(((Ie.l) obj3).silver).booleanValue()) {
                        arrayList.add(obj3);
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    D5.s sVar = c1661i.e;
                    if (hasNext) {
                        Ie.l it2 = (Ie.l) it.next();
                        cf.q qVar = (cf.q) sVar.india;
                        Intrinsics.delta(it2, "it");
                        arrayList2.add(qVar.delta(it2, false));
                    } else {
                        return CollectionsKt.a(CollectionsKt.a(arrayList2, CollectionsKt.orange(c1661i.lavender())), ((InterfaceC2518b) ((K) sVar.alpha).november).charlie(c1661i));
                    }
                }
            case 4:
                C1661i c1661i2 = this.purple;
                if (AbstractC2327c.oscar(c1661i2.f12586d)) {
                    C2859i c2859i = new C2859i(c1661i2, null, C2471g.alpha, true, 1, an.magenta);
                    List list2 = Collections.EMPTY_LIST;
                    int i11 = Qe.e.alpha;
                    int i12 = c1661i2.f12586d;
                    if (i12 != 3 && !AbstractC2327c.oscar(i12)) {
                        if (Qe.e.quebec(c1661i2)) {
                            c2339o = AbstractC2340p.alpha;
                            if (c2339o == null) {
                                Qe.e.alpha(51);
                                throw null;
                            }
                        } else if (Qe.e.kilo(c1661i2)) {
                            c2339o = AbstractC2340p.juliet;
                            if (c2339o == null) {
                                Qe.e.alpha(52);
                                throw null;
                            }
                        } else {
                            c2339o = AbstractC2340p.echo;
                            if (c2339o == null) {
                                Qe.e.alpha(53);
                                throw null;
                            }
                        }
                    } else {
                        c2339o = AbstractC2340p.alpha;
                        if (c2339o == null) {
                            Qe.e.alpha(49);
                            throw null;
                        }
                    }
                    c2859i.n0(list2, c2339o);
                    c2859i.yellow = c1661i2.oscar();
                    return c2859i;
                }
                List list3 = c1661i2.teal.f1568i;
                Intrinsics.delta(list3, "classProto.constructorList");
                Iterator it3 = list3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (!Ke.d.mike.echo(((Ie.l) obj).silver).booleanValue()) {
                        }
                    } else {
                        obj = null;
                    }
                }
                Ie.l lVar = (Ie.l) obj;
                if (lVar == null) {
                    return null;
                }
                return ((cf.q) c1661i2.e.india).delta(lVar, true);
            case 5:
                if (c1661i.f12584b != 2) {
                    return CollectionsKt.emptyList();
                }
                List<Integer> fqNames = c1661i.teal.f1573n;
                Intrinsics.delta(fqNames, "fqNames");
                if (!fqNames.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Integer index : fqNames) {
                        D5.s sVar2 = c1661i.e;
                        K k6 = (K) sVar2.alpha;
                        Intrinsics.delta(index, "index");
                        InterfaceC2330f bravo = k6.bravo(Zd.a.alpha((Ke.e) sVar2.bravo, index.intValue()));
                        if (bravo != null) {
                            arrayList3.add(bravo);
                        }
                    }
                    return arrayList3;
                }
                if (c1661i.f12584b != 2) {
                    return CollectionsKt.emptyList();
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                InterfaceC2335k interfaceC2335k = c1661i.f12591j;
                if (interfaceC2335k instanceof InterfaceC2321ad) {
                    Qe.l.charlie(c1661i, linkedHashSet, ((InterfaceC2321ad) interfaceC2335k).olive(), false);
                }
                Qe.l.charlie(c1661i, linkedHashSet, c1661i.s(), true);
                return CollectionsKt.p(linkedHashSet, new Qe.h(i10));
            default:
                if (!c1661i.isInline() && !c1661i.hotel()) {
                    return null;
                }
                D5.s sVar3 = c1661i.e;
                Ke.e nameResolver = (Ke.e) sVar3.bravo;
                Ce.l lVar2 = new Ce.l(i10, (z) sVar3.hotel, i5);
                Ce.l lVar3 = new Ce.l(i10, c1661i, i4);
                Ie.j jVar2 = c1661i.teal;
                Intrinsics.echo(jVar2, "<this>");
                Intrinsics.echo(nameResolver, "nameResolver");
                G6.j jVar3 = (G6.j) sVar3.delta;
                if (jVar2.f1578s.size() > 0) {
                    List<Integer> multiFieldValueClassUnderlyingNameList = jVar2.f1578s;
                    Intrinsics.delta(multiFieldValueClassUnderlyingNameList, "multiFieldValueClassUnderlyingNameList");
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(multiFieldValueClassUnderlyingNameList, 10);
                    ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
                    for (Integer it4 : multiFieldValueClassUnderlyingNameList) {
                        Intrinsics.delta(it4, "it");
                        arrayList4.add(Zd.a.bravo(nameResolver, it4.intValue()));
                    }
                    Pair pair = new Pair(Integer.valueOf(jVar2.f1581v.size()), Integer.valueOf(jVar2.f1580u.size()));
                    if (Intrinsics.areEqual(pair, new Pair(Integer.valueOf(arrayList4.size()), 0))) {
                        List<Integer> multiFieldValueClassUnderlyingTypeIdList = jVar2.f1581v;
                        Intrinsics.delta(multiFieldValueClassUnderlyingTypeIdList, "multiFieldValueClassUnderlyingTypeIdList");
                        collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(multiFieldValueClassUnderlyingTypeIdList, 10);
                        r4 = new ArrayList(collectionSizeOrDefault4);
                        for (Integer it5 : multiFieldValueClassUnderlyingTypeIdList) {
                            Intrinsics.delta(it5, "it");
                            r4.add(jVar3.alpha(it5.intValue()));
                        }
                    } else if (Intrinsics.areEqual(pair, new Pair(0, Integer.valueOf(arrayList4.size())))) {
                        r4 = jVar2.f1580u;
                    } else {
                        throw new IllegalStateException(("class " + Zd.a.bravo(nameResolver, jVar2.teal) + " has illegal multi-field value class representation").toString());
                    }
                    Intrinsics.delta(r4, "when (typeIdCount to typ…epresentation\")\n        }");
                    collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(r4, 10);
                    ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault3);
                    Iterator it6 = r4.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(lVar2.invoke(it6.next()));
                    }
                    obj2 = new C2350z(CollectionsKt.H(arrayList4, arrayList5));
                } else if ((jVar2.red & 8) == 8) {
                    Ne.f bravo2 = Zd.a.bravo(nameResolver, jVar2.f1575p);
                    int i13 = jVar2.red;
                    if ((i13 & 16) == 16) {
                        aqVar = jVar2.f1576q;
                    } else if ((i13 & 32) == 32) {
                        aqVar = jVar3.alpha(jVar2.f1577r);
                    } else {
                        aqVar = null;
                    }
                    if ((aqVar != null && (dVar = (p000if.d) lVar2.invoke(aqVar)) != null) || (dVar = (p000if.d) lVar3.invoke(bravo2)) != null) {
                        obj2 = new C2346v(bravo2, dVar);
                    } else {
                        throw new IllegalStateException(("cannot determine underlying type for value class " + Zd.a.bravo(nameResolver, jVar2.teal) + " with property " + bravo2).toString());
                    }
                } else {
                    obj2 = null;
                }
                if (obj2 != null) {
                    return obj2;
                }
                if (c1661i.white.alpha(1, 5, 1)) {
                    return null;
                }
                C2859i lavender = c1661i.lavender();
                if (lavender != null) {
                    List peach = lavender.peach();
                    Intrinsics.delta(peach, "constructor.valueParameters");
                    Ne.f name = ((se.aq) CollectionsKt.gold(peach)).getName();
                    Intrinsics.delta(name, "constructor.valueParameters.first().name");
                    ae gold = c1661i.gold(name);
                    if (gold != null) {
                        return new C2346v(name, gold);
                    }
                    throw new IllegalStateException(("Value class has no underlying property: " + c1661i).toString());
                }
                throw new IllegalStateException(("Inline class has no primary constructor: " + c1661i).toString());
        }
    }
}
