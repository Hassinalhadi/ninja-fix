package kotlin.reflect.jvm.internal.impl.types;

import gf.AbstractC1792g;
import gf.InterfaceC1787b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import lf.AbstractC2075a;
import me.AbstractC2120h;
import of.C2259n;
import pe.InterfaceC2332h;
import pe.InterfaceC2333i;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import qe.C2471g;
import qe.InterfaceC2472h;
import s6.O5;

/* loaded from: classes2.dex */
public abstract class c {
    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 4) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i4 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i4 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i4 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final B amber(B b2, y yVar) {
        Intrinsics.echo(b2, "<this>");
        if (b2 instanceof A) {
            return amber(((A) b2).crimson(), yVar);
        }
        if (yVar != null && !Intrinsics.areEqual(yVar, b2)) {
            if (b2 instanceof ae) {
                return new ah((ae) b2, yVar);
            }
            if (b2 instanceof s) {
                return new u((s) b2, yVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        return b2;
    }

    public static final ae bravo(y yVar) {
        ae aeVar;
        Intrinsics.echo(yVar, "<this>");
        B ochre = yVar.ochre();
        if (ochre instanceof ae) {
            aeVar = (ae) ochre;
        } else {
            aeVar = null;
        }
        if (aeVar != null) {
            return aeVar;
        }
        throw new IllegalStateException(("This is should be simple type: " + yVar).toString());
    }

    public static final y charlie(ArrayList arrayList, List list, AbstractC2120h abstractC2120h) {
        y india = new ax(new ak(0, arrayList)).india(3, (y) CollectionsKt.gold(list));
        if (india == null) {
            return abstractC2120h.november();
        }
        return india;
    }

    public static final p000if.c delta(p000if.c receiver, HashSet hashSet) {
        p000if.c delta;
        boolean z2;
        gf.m mVar = gf.m.alpha;
        ap maroon = mVar.maroon(receiver);
        if (hashSet.add(maroon)) {
            pe.aq sierra = AbstractC1792g.sierra(maroon);
            if (sierra != null) {
                p000if.c foxtrot = O5.foxtrot(sierra);
                p000if.c delta2 = delta(foxtrot, hashSet);
                if (delta2 != null) {
                    if (!AbstractC1792g.beige(mVar.maroon(foxtrot)) && (!(foxtrot instanceof p000if.d) || !AbstractC1792g.cyan((p000if.d) foxtrot))) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if ((delta2 instanceof p000if.d) && AbstractC1792g.cyan((p000if.d) delta2) && AbstractC1792g.crimson(receiver) && z2) {
                        return mVar.alpha(foxtrot);
                    }
                    if (!AbstractC1792g.crimson(delta2) && (receiver instanceof p000if.d) && AbstractC1792g.bronze((p000if.d) receiver)) {
                        return mVar.alpha(delta2);
                    }
                    return delta2;
                }
                return null;
            }
            if (AbstractC1792g.beige(maroon)) {
                Intrinsics.echo(receiver, "$receiver");
                if (receiver instanceof y) {
                    ae foxtrot2 = Qe.g.foxtrot((y) receiver);
                    if (foxtrot2 == null || (delta = delta(foxtrot2, hashSet)) == null) {
                        return null;
                    }
                    if (!AbstractC1792g.crimson(receiver)) {
                        return delta;
                    }
                    if (!AbstractC1792g.crimson(delta) && (!(delta instanceof p000if.d) || !AbstractC1792g.cyan((p000if.d) delta))) {
                        return mVar.alpha(delta);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(receiver);
                    sb2.append(", ");
                    throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, receiver.getClass(), sb2).toString());
                }
            }
            return receiver;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final y echo(y yVar) {
        Intrinsics.echo(yVar, "<this>");
        if (yVar instanceof A) {
            return ((A) yVar).foxtrot();
        }
        return null;
    }

    public static boolean foxtrot(ao aoVar, p000if.d type, c cVar) {
        c cVar2;
        Intrinsics.echo(type, "type");
        InterfaceC1787b interfaceC1787b = aoVar.charlie;
        if ((interfaceC1787b.juliet(type) && !interfaceC1787b.papa(type)) || interfaceC1787b.v(type)) {
            return true;
        }
        aoVar.bravo();
        ArrayDeque arrayDeque = aoVar.golf;
        Intrinsics.checkNotNull(arrayDeque);
        C2259n c2259n = aoVar.hotel;
        Intrinsics.checkNotNull(c2259n);
        arrayDeque.push(type);
        while (!arrayDeque.isEmpty()) {
            if (c2259n.purple <= 1000) {
                p000if.d current = (p000if.d) arrayDeque.pop();
                Intrinsics.delta(current, "current");
                if (c2259n.add(current)) {
                    boolean papa = interfaceC1787b.papa(current);
                    an anVar = an.charlie;
                    if (papa) {
                        cVar2 = anVar;
                    } else {
                        cVar2 = cVar;
                    }
                    if (Intrinsics.areEqual(cVar2, anVar)) {
                        cVar2 = null;
                    }
                    if (cVar2 == null) {
                        continue;
                    } else {
                        Iterator it = interfaceC1787b.golf(interfaceC1787b.x(current)).iterator();
                        while (it.hasNext()) {
                            p000if.d xray = cVar2.xray(aoVar, (p000if.c) it.next());
                            if ((interfaceC1787b.juliet(xray) && !interfaceC1787b.papa(xray)) || interfaceC1787b.v(xray)) {
                                aoVar.alpha();
                                return true;
                            }
                            arrayDeque.add(xray);
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + CollectionsKt.maroon(c2259n, null, null, null, null, 63)).toString());
            }
        }
        aoVar.alpha();
        return false;
    }

    public static final B golf(B b2, y origin) {
        Intrinsics.echo(b2, "<this>");
        Intrinsics.echo(origin, "origin");
        return amber(b2, echo(origin));
    }

    public static boolean hotel(ao aoVar, p000if.d dVar, p000if.f fVar) {
        InterfaceC1787b interfaceC1787b = aoVar.charlie;
        if (interfaceC1787b.black(dVar)) {
            return true;
        }
        if (interfaceC1787b.papa(dVar)) {
            return false;
        }
        if (aoVar.bravo) {
            interfaceC1787b.c(dVar);
        }
        return interfaceC1787b.e(interfaceC1787b.x(dVar), fVar);
    }

    public static final boolean india(y yVar) {
        Intrinsics.echo(yVar, "<this>");
        B ochre = yVar.ochre();
        if (!(ochre instanceof hf.f)) {
            if (!(ochre instanceof s) || !(((s) ochre).d() instanceof hf.f)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean juliet(y yVar) {
        Intrinsics.echo(yVar, "<this>");
        return yVar.ochre() instanceof s;
    }

    public static final ae kilo(y yVar) {
        Intrinsics.echo(yVar, "<this>");
        B ochre = yVar.ochre();
        if (ochre instanceof s) {
            return ((s) ochre).purple;
        }
        if (ochre instanceof ae) {
            return (ae) ochre;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final B lima(B b2, boolean z2) {
        Intrinsics.echo(b2, "<this>");
        o oscar = e.oscar(b2, z2);
        if (oscar != null) {
            return oscar;
        }
        ae mike = mike(b2);
        if (mike != null) {
            return mike;
        }
        return b2.pink(false);
    }

    public static final ae mike(B b2) {
        x xVar;
        int collectionSizeOrDefault;
        x xVar2;
        ap green = b2.green();
        if (green instanceof x) {
            xVar = (x) green;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            LinkedHashSet<y> linkedHashSet = xVar.bravo;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            boolean z2 = false;
            for (y yVar : linkedHashSet) {
                if (az.foxtrot(yVar)) {
                    yVar = lima(yVar.ochre(), false);
                    z2 = true;
                }
                arrayList.add(yVar);
            }
            if (!z2) {
                xVar2 = null;
            } else {
                y yVar2 = xVar.alpha;
                if (yVar2 != null) {
                    if (az.foxtrot(yVar2)) {
                        yVar2 = lima(yVar2.ochre(), false);
                    }
                } else {
                    yVar2 = null;
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                xVar2 = new x(linkedHashSet2);
                xVar2.alpha = yVar2;
            }
            if (xVar2 != null) {
                return xVar2.bravo();
            }
        }
        return null;
    }

    public static final ae november(ae aeVar, List newArguments, al newAttributes) {
        Intrinsics.echo(aeVar, "<this>");
        Intrinsics.echo(newArguments, "newArguments");
        Intrinsics.echo(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == aeVar.gold()) {
            return aeVar;
        }
        if (newArguments.isEmpty()) {
            return aeVar.white(newAttributes);
        }
        if (aeVar instanceof hf.f) {
            hf.f fVar = (hf.f) aeVar;
            String[] strArr = fVar.yellow;
            return new hf.f(fVar.purple, fVar.red, fVar.silver, newArguments, fVar.white, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        return ab.charlie(newArguments, newAttributes, aeVar.green(), aeVar.indigo());
    }

    public static y oscar(y yVar, List list, InterfaceC2472h interfaceC2472h, int i4) {
        if ((i4 & 2) != 0) {
            interfaceC2472h = yVar.getAnnotations();
        }
        Intrinsics.echo(yVar, "<this>");
        if ((list.isEmpty() || list == yVar.cyan()) && interfaceC2472h == yVar.getAnnotations()) {
            return yVar;
        }
        al gold = yVar.gold();
        if ((interfaceC2472h instanceof qe.m) && interfaceC2472h.isEmpty()) {
            interfaceC2472h = C2471g.alpha;
        }
        al quebec = quebec(gold, interfaceC2472h);
        B ochre = yVar.ochre();
        if (ochre instanceof s) {
            s sVar = (s) ochre;
            return ab.alpha(november(sVar.purple, list, quebec), november(sVar.red, list, quebec));
        }
        if (ochre instanceof ae) {
            return november((ae) ochre, list, quebec);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ ae papa(ae aeVar, List list, al alVar, int i4) {
        if ((i4 & 1) != 0) {
            list = aeVar.cyan();
        }
        if ((i4 & 2) != 0) {
            alVar = aeVar.gold();
        }
        return november(aeVar, list, alVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final al quebec(al alVar, InterfaceC2472h interfaceC2472h) {
        al alVar2;
        Intrinsics.echo(alVar, "<this>");
        if (k.alpha(alVar) == interfaceC2472h) {
            return alVar;
        }
        ge.v property = k.alpha[0];
        F8.q qVar = k.bravo;
        qVar.getClass();
        Intrinsics.echo(property, "property");
        j jVar = (j) alVar.alpha.get(qVar.alpha);
        if (jVar != null) {
            if (!alVar.isEmpty()) {
                AbstractC2075a abstractC2075a = alVar.alpha;
                ArrayList arrayList = new ArrayList();
                for (Object obj : abstractC2075a) {
                    if (!Intrinsics.areEqual((j) obj, jVar)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() != alVar.alpha.alpha()) {
                    al.purple.getClass();
                    alVar2 = com.google.android.play.core.integrity.k.echo(arrayList);
                    if (alVar2 != null) {
                        alVar = alVar2;
                    }
                }
            }
            alVar2 = alVar;
            if (alVar2 != null) {
            }
        }
        if (interfaceC2472h.iterator().hasNext() || !interfaceC2472h.isEmpty()) {
            j jVar2 = new j(interfaceC2472h);
            if (alVar.alpha.get(al.purple.foxtrot(kotlin.jvm.internal.u.alpha.bravo(j.class))) == null) {
                if (alVar.isEmpty()) {
                    return new al(kotlin.collections.ab.juliet(jVar2));
                }
                return com.google.android.play.core.integrity.k.echo(CollectionsKt.plus(CollectionsKt.z(alVar), jVar2));
            }
        }
        return alVar;
    }

    public static final y romeo(pe.aq aqVar) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.echo(aqVar, "<this>");
        InterfaceC2335k lima = aqVar.lima();
        Intrinsics.delta(lima, "this.containingDeclaration");
        if (lima instanceof InterfaceC2333i) {
            List parameters = ((InterfaceC2333i) lima).tango().getParameters();
            Intrinsics.delta(parameters, "descriptor.typeConstructor.parameters");
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault2);
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                ap tango = ((pe.aq) it.next()).tango();
                Intrinsics.delta(tango, "it.typeConstructor");
                arrayList.add(tango);
            }
            List upperBounds = aqVar.getUpperBounds();
            Intrinsics.delta(upperBounds, "upperBounds");
            return charlie(arrayList, upperBounds, Ue.e.echo(aqVar));
        }
        if (lima instanceof InterfaceC2345u) {
            List typeParameters = ((InterfaceC2345u) lima).getTypeParameters();
            Intrinsics.delta(typeParameters, "descriptor.typeParameters");
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            Iterator it2 = typeParameters.iterator();
            while (it2.hasNext()) {
                ap tango2 = ((pe.aq) it2.next()).tango();
                Intrinsics.delta(tango2, "it.typeConstructor");
                arrayList2.add(tango2);
            }
            List upperBounds2 = aqVar.getUpperBounds();
            Intrinsics.delta(upperBounds2, "upperBounds");
            return charlie(arrayList2, upperBounds2, Ue.e.echo(aqVar));
        }
        throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
    }

    public static boolean sierra(InterfaceC1787b interfaceC1787b, p000if.d dVar, p000if.d dVar2) {
        boolean z2;
        boolean z10;
        if (interfaceC1787b.bronze(dVar) == interfaceC1787b.bronze(dVar2) && interfaceC1787b.papa(dVar) == interfaceC1787b.papa(dVar2)) {
            if (interfaceC1787b.ochre(dVar) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (interfaceC1787b.ochre(dVar2) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z2 == z10 && interfaceC1787b.e(interfaceC1787b.x(dVar), interfaceC1787b.x(dVar2))) {
                if (!interfaceC1787b.lavender(dVar, dVar2)) {
                    int bronze = interfaceC1787b.bronze(dVar);
                    for (int i4 = 0; i4 < bronze; i4++) {
                        as tango = interfaceC1787b.tango(dVar, i4);
                        as tango2 = interfaceC1787b.tango(dVar2, i4);
                        if (interfaceC1787b.zulu(tango) == interfaceC1787b.zulu(tango2) && (interfaceC1787b.zulu(tango) || (interfaceC1787b.q(tango) == interfaceC1787b.q(tango2) && tango(interfaceC1787b, interfaceC1787b.f(tango), interfaceC1787b.f(tango2))))) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean tango(InterfaceC1787b interfaceC1787b, p000if.c cVar, p000if.c cVar2) {
        if (cVar != cVar2) {
            ae quebec = interfaceC1787b.quebec(cVar);
            ae quebec2 = interfaceC1787b.quebec(cVar2);
            if (quebec != null && quebec2 != null) {
                return sierra(interfaceC1787b, quebec, quebec2);
            }
            s oscar = interfaceC1787b.oscar(cVar);
            s oscar2 = interfaceC1787b.oscar(cVar2);
            if (oscar != null && oscar2 != null && sierra(interfaceC1787b, interfaceC1787b.p(oscar), interfaceC1787b.p(oscar2)) && sierra(interfaceC1787b, interfaceC1787b.coral(oscar), interfaceC1787b.coral(oscar2))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static ax uniform(List list, av avVar, InterfaceC2335k interfaceC2335k, ArrayList arrayList) {
        if (avVar != null) {
            if (interfaceC2335k != null) {
                if (arrayList != null) {
                    ax victor = victor(list, avVar, interfaceC2335k, arrayList, null);
                    if (victor != null) {
                        return victor;
                    }
                    throw new AssertionError("Substitution failed");
                }
                alpha(3);
                throw null;
            }
            alpha(2);
            throw null;
        }
        alpha(1);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ax victor(List list, av avVar, InterfaceC2335k interfaceC2335k, ArrayList arrayList, boolean[] zArr) {
        ax axVar;
        y india;
        if (avVar != null) {
            if (interfaceC2335k != null) {
                if (arrayList != null) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    Iterator it = list.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        pe.aq aqVar = (pe.aq) it.next();
                        se.ao c02 = se.ao.c0(interfaceC2335k, aqVar.getAnnotations(), aqVar.black(), aqVar.fuchsia(), aqVar.getName(), i4, aqVar.b());
                        hashMap.put(aqVar.tango(), new at(1, c02.oscar()));
                        hashMap2.put(aqVar, c02);
                        arrayList.add(c02);
                        i4++;
                    }
                    ak akVar = new ak(1, hashMap);
                    ax echo = ax.echo(avVar, akVar);
                    ax echo2 = ax.echo(new Re.d(avVar, 1), akVar);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        pe.aq aqVar2 = (pe.aq) it2.next();
                        se.ao aoVar = (se.ao) hashMap2.get(aqVar2);
                        for (y yVar : aqVar2.getUpperBounds()) {
                            InterfaceC2332h kilo = yVar.green().kilo();
                            if (kilo instanceof pe.aq) {
                                pe.aq typeParameter = (pe.aq) kilo;
                                Intrinsics.echo(typeParameter, "typeParameter");
                                if (O5.india(typeParameter, null, 6)) {
                                    axVar = echo;
                                    india = axVar.india(3, yVar);
                                    if (india != null) {
                                        return null;
                                    }
                                    if (india != yVar && zArr != null) {
                                        zArr[0] = true;
                                    }
                                    if (!aoVar.e) {
                                        if (!india(india)) {
                                            aoVar.f13744d.add(india);
                                        }
                                    } else {
                                        throw new IllegalStateException("Type parameter descriptor is already initialized: " + aoVar.e0());
                                    }
                                }
                            }
                            axVar = echo2;
                            india = axVar.india(3, yVar);
                            if (india != null) {
                            }
                        }
                        if (!aoVar.e) {
                            aoVar.e = true;
                        } else {
                            throw new IllegalStateException("Type parameter descriptor is already initialized: " + aoVar.e0());
                        }
                    }
                    return echo;
                }
                alpha(8);
                throw null;
            }
            alpha(7);
            throw null;
        }
        alpha(6);
        throw null;
    }

    public static final al whiskey(InterfaceC2472h interfaceC2472h) {
        Intrinsics.echo(interfaceC2472h, "<this>");
        if (interfaceC2472h.isEmpty()) {
            al.purple.getClass();
            return al.red;
        }
        com.google.android.play.core.integrity.k kVar = al.purple;
        List juliet = kotlin.collections.ab.juliet(new j(interfaceC2472h));
        kVar.getClass();
        return com.google.android.play.core.integrity.k.echo(juliet);
    }

    public static final ae yankee(y yVar) {
        Intrinsics.echo(yVar, "<this>");
        B ochre = yVar.ochre();
        if (ochre instanceof s) {
            return ((s) ochre).red;
        }
        if (ochre instanceof ae) {
            return (ae) ochre;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ae zulu(ae aeVar, ae abbreviatedType) {
        Intrinsics.echo(aeVar, "<this>");
        Intrinsics.echo(abbreviatedType, "abbreviatedType");
        if (india(aeVar)) {
            return aeVar;
        }
        return new C2039a(aeVar, abbreviatedType);
    }

    public abstract p000if.d xray(ao aoVar, p000if.c cVar);
}
