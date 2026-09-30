package Ce;

import B9.K;
import cf.InterfaceC0854j;
import ef.C1660h;
import ef.C1661i;
import fe.C1713e;
import fe.C1714f;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractC2040b;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlin.reflect.jvm.internal.impl.types.ax;
import me.AbstractC2120h;
import of.AbstractC2262q;
import pe.C2319ab;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2336l;
import pe.ao;
import pe.aq;
import qe.InterfaceC2466b;
import re.InterfaceC2518b;
import s6.AbstractC2672h7;
import s6.G4;
import se.AbstractC2852b;
import se.C2873w;
import xe.EnumC3339b;
import ye.EnumC3424b;

/* loaded from: classes2.dex */
public final class h extends AbstractC2040b {
    public final /* synthetic */ int charlie = 0;
    public final ff.i delta;
    public final /* synthetic */ AbstractC2852b echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(((Be.a) jVar.f909c.purple).alpha);
        this.echo = jVar;
        this.delta = ((Be.a) jVar.f909c.purple).alpha.bravo(new g(jVar, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01fd, code lost:
    
        if (r10 == null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x035a  */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    @Override // kotlin.reflect.jvm.internal.impl.types.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection bravo() {
        int collectionSizeOrDefault;
        List<ve.s> list;
        Se.v vVar;
        String str;
        Ne.c cVar;
        Ne.c cVar2;
        InterfaceC2330f interfaceC2330f;
        int collectionSizeOrDefault2;
        ArrayList arrayList;
        kotlin.reflect.jvm.internal.impl.types.ae bravo;
        int collectionSizeOrDefault3;
        InterfaceC2330f interfaceC2330f2;
        kotlin.reflect.jvm.internal.impl.types.y yVar;
        int collectionSizeOrDefault4;
        ap apVar;
        int collectionSizeOrDefault5;
        int collectionSizeOrDefault6;
        String bravo2;
        C2319ab c2319ab;
        int collectionSizeOrDefault7;
        AbstractC2852b abstractC2852b = this.echo;
        switch (this.charlie) {
            case 0:
                j jVar = (j) abstractC2852b;
                Class cls = jVar.f907a.alpha;
                Type type = Object.class;
                if (Intrinsics.areEqual(cls, type)) {
                    list = CollectionsKt.emptyList();
                } else {
                    T3.b bVar = new T3.b(2);
                    Type genericSuperclass = cls.getGenericSuperclass();
                    if (genericSuperclass != null) {
                        type = genericSuperclass;
                    }
                    bVar.alpha(type);
                    Type[] genericInterfaces = cls.getGenericInterfaces();
                    Intrinsics.delta(genericInterfaces, "klass.genericInterfaces");
                    bVar.bravo(genericInterfaces);
                    ArrayList arrayList2 = bVar.alpha;
                    List listOf = CollectionsKt.listOf(arrayList2.toArray(new Type[arrayList2.size()]));
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10);
                    ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                    Iterator it = listOf.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new ve.s((Type) it.next()));
                    }
                    list = arrayList3;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                ArrayList arrayList5 = new ArrayList(0);
                Ne.c PURELY_IMPLEMENTS_ANNOTATION = ye.ab.november;
                Intrinsics.delta(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
                InterfaceC2466b gray = jVar.f919n.gray(PURELY_IMPLEMENTS_ANNOTATION);
                if (gray != null) {
                    Object l10 = CollectionsKt.l(gray.bravo().values());
                    if (l10 instanceof Se.v) {
                        vVar = (Se.v) l10;
                    } else {
                        vVar = null;
                    }
                    if (vVar != null && (str = (String) vVar.alpha) != null) {
                        int i4 = 1;
                        int i5 = 0;
                        while (true) {
                            if (i5 < str.length()) {
                                char charAt = str.charAt(i5);
                                int mike = av.q.mike(i4);
                                if (mike != 0) {
                                    if (mike != 1) {
                                        if (mike != 2) {
                                            continue;
                                        }
                                    } else if (charAt == '.') {
                                        i4 = 3;
                                    } else if (!Character.isJavaIdentifierPart(charAt)) {
                                    }
                                    i5++;
                                }
                                if (Character.isJavaIdentifierStart(charAt)) {
                                    i4 = 2;
                                    i5++;
                                }
                            } else if (i4 != 3) {
                                cVar = new Ne.c(str);
                            }
                        }
                    }
                }
                cVar = null;
                if (cVar == null || cVar.delta() || !cVar.hotel(me.n.india)) {
                    cVar = null;
                }
                B9.ab abVar = jVar.f909c;
                if (cVar == null) {
                    LinkedHashMap linkedHashMap = ye.o.alpha;
                    cVar2 = (Ne.c) ye.o.bravo.get(Ue.e.golf(jVar));
                    break;
                } else {
                    cVar2 = cVar;
                }
                Be.a aVar = (Be.a) abVar.purple;
                EnumC3339b enumC3339b = EnumC3339b.f14130a;
                int i10 = Ue.e.alpha;
                se.z zVar = aVar.oscar;
                Intrinsics.echo(zVar, "<this>");
                cVar2.delta();
                Ne.c echo = cVar2.echo();
                Intrinsics.delta(echo, "topLevelClassFqName.parent()");
                C2873w c2873w = (C2873w) zVar.amber(echo);
                Ne.f foxtrot = cVar2.foxtrot();
                Intrinsics.delta(foxtrot, "topLevelClassFqName.shortName()");
                InterfaceC2332h golf = c2873w.yellow.golf(foxtrot, enumC3339b);
                if (golf instanceof InterfaceC2330f) {
                    interfaceC2330f = (InterfaceC2330f) golf;
                } else {
                    interfaceC2330f = null;
                }
                if (interfaceC2330f != null) {
                    int size = interfaceC2330f.tango().getParameters().size();
                    List parameters = jVar.f914i.getParameters();
                    Intrinsics.delta(parameters, "getTypeConstructor().parameters");
                    int size2 = parameters.size();
                    if (size2 == size) {
                        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10);
                        arrayList = new ArrayList(collectionSizeOrDefault3);
                        Iterator it2 = parameters.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new at(1, ((aq) it2.next()).oscar()));
                        }
                    } else if (size2 == 1 && size > 1 && cVar == null) {
                        at atVar = new at(1, ((aq) CollectionsKt.k(parameters)).oscar());
                        C1713e c1713e = new C1713e(1, size, 1);
                        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(c1713e, 10);
                        ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault2);
                        Iterator it3 = c1713e.iterator();
                        while (((C1714f) it3).red) {
                            ((kotlin.collections.x) it3).alpha();
                            arrayList6.add(atVar);
                        }
                        arrayList = arrayList6;
                    }
                    kotlin.reflect.jvm.internal.impl.types.al.purple.getClass();
                    bravo = kotlin.reflect.jvm.internal.impl.types.ab.bravo(kotlin.reflect.jvm.internal.impl.types.al.red, interfaceC2330f, arrayList);
                    for (ve.s sVar : list) {
                        kotlin.reflect.jvm.internal.impl.types.y amber = ((J2.t) abVar.teal).amber(sVar, G4.delta(1, false, null, 7));
                        Fe.e eVar = ((Be.a) abVar.purple).romeo;
                        eVar.getClass();
                        kotlin.reflect.jvm.internal.impl.types.y bravo3 = eVar.bravo(new Fe.u((InterfaceC2336l) null, false, abVar, EnumC3424b.TYPE_USE, true), amber, CollectionsKt.emptyList(), null, false);
                        if (bravo3 == null) {
                            bravo3 = amber;
                        }
                        if (bravo3.green().kilo() instanceof C2319ab) {
                            arrayList5.add(sVar);
                        }
                        ap green = bravo3.green();
                        if (bravo != null) {
                            apVar = bravo.green();
                        } else {
                            apVar = null;
                        }
                        if (!Intrinsics.areEqual(green, apVar) && !AbstractC2120h.whiskey(bravo3)) {
                            arrayList4.add(bravo3);
                        }
                    }
                    interfaceC2330f2 = jVar.f908b;
                    if (interfaceC2330f2 == null) {
                        yVar = new ax(AbstractC2672h7.bravo(interfaceC2330f2, jVar)).india(1, interfaceC2330f2.oscar());
                    } else {
                        yVar = null;
                    }
                    AbstractC2262q.alpha(arrayList4, yVar);
                    AbstractC2262q.alpha(arrayList4, bravo);
                    if (arrayList5.isEmpty()) {
                        Be.a aVar2 = (Be.a) abVar.purple;
                        collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10);
                        ArrayList arrayList7 = new ArrayList(collectionSizeOrDefault4);
                        Iterator it4 = arrayList5.iterator();
                        while (it4.hasNext()) {
                            Ee.d dVar = (Ee.d) it4.next();
                            Intrinsics.charlie(dVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                            arrayList7.add(((ve.s) dVar).alpha.toString());
                        }
                        aVar2.foxtrot.charlie(jVar, arrayList7);
                        throw null;
                    }
                    if (!arrayList4.isEmpty()) {
                        return CollectionsKt.z(arrayList4);
                    }
                    return kotlin.collections.ab.juliet(((Be.a) abVar.purple).oscar.silver.echo());
                }
                bravo = null;
                while (r5.hasNext()) {
                }
                interfaceC2330f2 = jVar.f908b;
                if (interfaceC2330f2 == null) {
                }
                AbstractC2262q.alpha(arrayList4, yVar);
                AbstractC2262q.alpha(arrayList4, bravo);
                if (arrayList5.isEmpty()) {
                }
                break;
            default:
                C1661i c1661i = (C1661i) abstractC2852b;
                Ie.j jVar2 = c1661i.teal;
                D5.s sVar2 = c1661i.e;
                G6.j jVar3 = (G6.j) sVar2.delta;
                Intrinsics.echo(jVar2, "<this>");
                List list2 = jVar2.f1561a;
                boolean isEmpty = list2.isEmpty();
                ?? r32 = list2;
                if (isEmpty) {
                    r32 = 0;
                }
                if (r32 == 0) {
                    List<Integer> supertypeIdList = jVar2.f1562b;
                    Intrinsics.delta(supertypeIdList, "supertypeIdList");
                    collectionSizeOrDefault7 = CollectionsKt__IterablesKt.collectionSizeOrDefault(supertypeIdList, 10);
                    r32 = new ArrayList(collectionSizeOrDefault7);
                    for (Integer it5 : supertypeIdList) {
                        Intrinsics.delta(it5, "it");
                        r32.add(jVar3.alpha(it5.intValue()));
                    }
                }
                collectionSizeOrDefault5 = CollectionsKt__IterablesKt.collectionSizeOrDefault(r32, 10);
                ArrayList arrayList8 = new ArrayList(collectionSizeOrDefault5);
                Iterator it6 = r32.iterator();
                while (it6.hasNext()) {
                    arrayList8.add(((cf.z) sVar2.hotel).golf((Ie.aq) it6.next()));
                }
                ArrayList a6 = CollectionsKt.a(arrayList8, ((InterfaceC2518b) ((K) sVar2.alpha).november).echo(c1661i));
                ArrayList arrayList9 = new ArrayList();
                Iterator it7 = a6.iterator();
                while (it7.hasNext()) {
                    InterfaceC2332h kilo = ((kotlin.reflect.jvm.internal.impl.types.y) it7.next()).green().kilo();
                    if (kilo instanceof C2319ab) {
                        c2319ab = (C2319ab) kilo;
                    } else {
                        c2319ab = null;
                    }
                    if (c2319ab != null) {
                        arrayList9.add(c2319ab);
                    }
                }
                if (!arrayList9.isEmpty()) {
                    InterfaceC0854j interfaceC0854j = (InterfaceC0854j) ((K) sVar2.alpha).hotel;
                    collectionSizeOrDefault6 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10);
                    ArrayList arrayList10 = new ArrayList(collectionSizeOrDefault6);
                    Iterator it8 = arrayList9.iterator();
                    while (it8.hasNext()) {
                        C2319ab c2319ab2 = (C2319ab) it8.next();
                        Ne.b foxtrot2 = Ue.e.foxtrot(c2319ab2);
                        if (foxtrot2 != null) {
                            bravo2 = foxtrot2.bravo().bravo();
                        } else {
                            bravo2 = c2319ab2.getName().bravo();
                        }
                        arrayList10.add(bravo2);
                    }
                    interfaceC0854j.charlie(c1661i, arrayList10);
                }
                return CollectionsKt.z(a6);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    public final ao echo() {
        switch (this.charlie) {
            case 0:
                return ((Be.a) ((j) this.echo).f909c.purple).mike;
            default:
                return ao.red;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final List getParameters() {
        switch (this.charlie) {
            case 0:
                return (List) this.delta.invoke();
            default:
                return (List) this.delta.invoke();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC2040b, kotlin.reflect.jvm.internal.impl.types.ap
    public final InterfaceC2332h kilo() {
        switch (this.charlie) {
            case 0:
                return (j) this.echo;
            default:
                return (C1661i) this.echo;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final boolean mike() {
        switch (this.charlie) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC2040b
    /* renamed from: oscar */
    public final InterfaceC2330f kilo() {
        switch (this.charlie) {
            case 0:
                return (j) this.echo;
            default:
                return (C1661i) this.echo;
        }
    }

    public final String toString() {
        switch (this.charlie) {
            case 0:
                String bravo = ((j) this.echo).getName().bravo();
                Intrinsics.delta(bravo, "name.asString()");
                return bravo;
            default:
                String str = ((C1661i) this.echo).getName().alpha;
                Intrinsics.delta(str, "name.toString()");
                return str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C1661i c1661i) {
        super((ff.l) ((K) c1661i.e.alpha).alpha);
        this.echo = c1661i;
        this.delta = ((ff.l) ((K) c1661i.e.alpha).alpha).bravo(new C1660h(c1661i, 0));
    }
}
