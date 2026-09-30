package Ce;

import B2.ap;
import cf.InterfaceC0854j;
import com.google.android.gms.internal.measurement.AbstractC1380u1;
import gf.InterfaceC1789d;
import java.lang.annotation.Annotation;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.az;
import me.AbstractC2120h;
import of.AbstractC2262q;
import of.C2259n;
import pe.AbstractC2340p;
import pe.C2339o;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.InterfaceC2344t;
import pe.InterfaceC2345u;
import qe.C2470f;
import qe.C2471g;
import s6.A0;
import s6.AbstractC2661g5;
import s6.F0;
import s6.G4;
import se.AbstractC2863m;
import se.C2871u;
import se.aq;
import t6.I3;
import t6.J3;
import t6.K3;
import t6.L3;
import ve.AbstractC3192d;
import xe.EnumC3339b;
import ye.AbstractC3427e;

/* loaded from: classes2.dex */
public final class p extends ad {
    public final InterfaceC2330f november;
    public final ve.q oscar;
    public final boolean papa;
    public final ff.i quebec;
    public final ff.i romeo;
    public final ff.i sierra;
    public final ff.i tango;
    public final ff.j uniform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(B9.ab c3, InterfaceC2330f ownerDescriptor, ve.q jClass, boolean z2, p pVar) {
        super(c3, pVar);
        Intrinsics.echo(c3, "c");
        Intrinsics.echo(ownerDescriptor, "ownerDescriptor");
        Intrinsics.echo(jClass, "jClass");
        this.november = ownerDescriptor;
        this.oscar = jClass;
        this.papa = z2;
        ff.l lVar = ((Be.a) c3.purple).alpha;
        this.quebec = lVar.bravo(new n(this, c3));
        this.romeo = lVar.bravo(new o(this, 1));
        this.sierra = lVar.bravo(new n(c3, this));
        this.tango = lVar.bravo(new o(this, 0));
        this.uniform = lVar.delta(new ap(2, this, c3));
    }

    public static se.ak beige(se.ak akVar, InterfaceC2345u interfaceC2345u, AbstractCollection abstractCollection) {
        if (!abstractCollection.isEmpty()) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                se.ak akVar2 = (se.ak) it.next();
                if (!Intrinsics.areEqual(akVar, akVar2) && akVar2.f13795u == null && bronze(akVar2, interfaceC2345u)) {
                    InterfaceC2345u build = akVar.w().sierra().build();
                    Intrinsics.checkNotNull(build);
                    return (se.ak) build;
                }
            }
            return akVar;
        }
        return akVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static se.ak black(se.ak akVar) {
        Ne.c cVar;
        List valueParameters = akVar.peach();
        Intrinsics.delta(valueParameters, "valueParameters");
        aq aqVar = (aq) CollectionsKt.olive(valueParameters);
        if (aqVar != null) {
            InterfaceC2332h kilo = aqVar.getType().green().kilo();
            if (kilo != null) {
                Ne.e hotel = Ue.e.hotel(kilo);
                if (!hotel.delta()) {
                    hotel = null;
                }
                if (hotel != null) {
                    cVar = hotel.golf();
                    if (!Intrinsics.areEqual(cVar, me.n.foxtrot)) {
                        aqVar = null;
                    }
                    if (aqVar != null) {
                        InterfaceC2344t w4 = akVar.w();
                        List valueParameters2 = akVar.peach();
                        Intrinsics.delta(valueParameters2, "valueParameters");
                        se.ak akVar2 = (se.ak) w4.bravo(CollectionsKt.cyan(valueParameters2)).hotel(((as) aqVar.getType().cyan().get(0)).bravo()).build();
                        if (akVar2 == null) {
                            return akVar2;
                        }
                        akVar2.f13788n = true;
                        return akVar2;
                    }
                }
            }
            cVar = null;
            if (!Intrinsics.areEqual(cVar, me.n.foxtrot)) {
            }
            if (aqVar != null) {
            }
        }
        return null;
    }

    public static boolean bronze(InterfaceC2345u interfaceC2345u, InterfaceC2345u interfaceC2345u2) {
        int charlie = Qe.k.charlie.november(interfaceC2345u2, interfaceC2345u, true).charlie();
        com.google.android.material.datepicker.j.sierra(charlie, "DEFAULT.isOverridableByW…iptor, this, true).result");
        if (charlie == 1 && !I3.alpha(interfaceC2345u2, interfaceC2345u)) {
            return true;
        }
        return false;
    }

    public static boolean coral(se.ak akVar, se.ak akVar2) {
        int i4 = AbstractC3427e.lima;
        Intrinsics.echo(akVar, "<this>");
        if (Intrinsics.areEqual(akVar.getName().bravo(), "removeAt") && Intrinsics.areEqual(AbstractC2661g5.echo(akVar), ye.am.golf.bravo)) {
            akVar2 = akVar2.alpha();
        }
        Intrinsics.delta(akVar2, "if (superDescriptor.isRe…iginal else subDescriptor");
        return bronze(akVar2, akVar);
    }

    public static se.ak crimson(pe.al alVar, String str, Function1 function1) {
        se.ak akVar;
        boolean bravo;
        Iterator it = ((Iterable) function1.invoke(Ne.f.echo(str))).iterator();
        do {
            akVar = null;
            if (!it.hasNext()) {
                break;
            }
            se.ak akVar2 = (se.ak) it.next();
            if (akVar2.peach().size() == 0) {
                gf.l lVar = InterfaceC1789d.alpha;
                kotlin.reflect.jvm.internal.impl.types.y yVar = akVar2.yellow;
                if (yVar == null) {
                    bravo = false;
                } else {
                    bravo = lVar.bravo(yVar, alVar.getType());
                }
                if (bravo) {
                    akVar = akVar2;
                }
            }
        } while (akVar == null);
        return akVar;
    }

    public static se.ak emerald(pe.al alVar, Function1 function1) {
        se.ak akVar;
        kotlin.reflect.jvm.internal.impl.types.y yVar;
        String bravo = alVar.getName().bravo();
        Intrinsics.delta(bravo, "name.asString()");
        Iterator it = ((Iterable) function1.invoke(Ne.f.echo(ye.aa.bravo(bravo)))).iterator();
        do {
            akVar = null;
            if (!it.hasNext()) {
                break;
            }
            se.ak akVar2 = (se.ak) it.next();
            if (akVar2.peach().size() == 1 && (yVar = akVar2.yellow) != null) {
                Ne.f fVar = AbstractC2120h.echo;
                if (AbstractC2120h.beige(yVar, me.m.delta)) {
                    gf.l lVar = InterfaceC1789d.alpha;
                    List peach = akVar2.peach();
                    Intrinsics.delta(peach, "descriptor.valueParameters");
                    if (lVar.alpha(((aq) CollectionsKt.k(peach)).getType(), alVar.getType())) {
                        akVar = akVar2;
                    }
                }
            }
        } while (akVar == null);
        return akVar;
    }

    public static boolean gray(se.ak akVar, InterfaceC2345u interfaceC2345u) {
        String delta = AbstractC2661g5.delta(akVar, 2);
        InterfaceC2345u alpha = interfaceC2345u.alpha();
        Intrinsics.delta(alpha, "builtinWithErasedParameters.original");
        if (Intrinsics.areEqual(delta, AbstractC2661g5.delta(alpha, 2)) && !bronze(akVar, interfaceC2345u)) {
            return true;
        }
        return false;
    }

    public static final ArrayList victor(p pVar, Ne.f fVar) {
        int collectionSizeOrDefault;
        List bravo = ((c) pVar.echo.invoke()).bravo(fVar);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(bravo, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = bravo.iterator();
        while (it.hasNext()) {
            arrayList.add(pVar.tango((ve.z) it.next()));
        }
        return arrayList;
    }

    public static final ArrayList whiskey(p pVar, Ne.f fVar) {
        LinkedHashSet fuchsia = pVar.fuchsia(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : fuchsia) {
            se.ak akVar = (se.ak) obj;
            Intrinsics.echo(akVar, "<this>");
            if (K3.charlie(akVar) == null && ye.h.alpha(akVar) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void amber(Set set, AbstractCollection abstractCollection, C2259n c2259n, Function1 function1) {
        se.ak akVar;
        boolean z2;
        se.aj ajVar;
        Ae.g gVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            pe.al alVar = (pe.al) it.next();
            if (!blue(alVar, function1)) {
                gVar = null;
            } else {
                se.ak getterMethod = cyan(alVar, function1);
                Intrinsics.checkNotNull(getterMethod);
                if (alVar.e()) {
                    akVar = emerald(alVar, function1);
                    Intrinsics.checkNotNull(akVar);
                } else {
                    akVar = null;
                }
                if (akVar != null) {
                    akVar.golf();
                    getterMethod.golf();
                }
                InterfaceC2330f ownerDescriptor = this.november;
                Intrinsics.echo(ownerDescriptor, "ownerDescriptor");
                Intrinsics.echo(getterMethod, "getterMethod");
                C2470f c2470f = C2471g.alpha;
                int golf = getterMethod.golf();
                C2339o visibility = getterMethod.getVisibility();
                if (akVar != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Ae.g gVar2 = new Ae.g(ownerDescriptor, c2470f, golf, visibility, z2, alVar.getName(), getterMethod.echo(), null, 1, false, null);
                kotlin.reflect.jvm.internal.impl.types.y yVar = getterMethod.yellow;
                Intrinsics.checkNotNull(yVar);
                gVar2.g0(yVar, CollectionsKt.emptyList(), papa(), null, CollectionsKt.emptyList());
                se.ai lima = Qe.l.lima(gVar2, getterMethod.getAnnotations(), false, getterMethod.echo());
                lima.e = getterMethod;
                lima.c0(gVar2.getType());
                if (akVar != null) {
                    List peach = akVar.peach();
                    Intrinsics.delta(peach, "setterMethod.valueParameters");
                    aq aqVar = (aq) CollectionsKt.green(peach);
                    if (aqVar != null) {
                        ajVar = Qe.l.mike(gVar2, akVar.getAnnotations(), aqVar.getAnnotations(), false, akVar.getVisibility(), akVar.echo());
                        ajVar.e = akVar;
                    } else {
                        throw new AssertionError("No parameter found for " + akVar);
                    }
                } else {
                    ajVar = null;
                }
                gVar2.d0(lima, ajVar, null, null);
                gVar = gVar2;
            }
            if (gVar != null) {
                abstractCollection.add(gVar);
                if (c2259n != null) {
                    c2259n.add(alVar);
                    return;
                }
                return;
            }
        }
    }

    public final Collection azure() {
        boolean z2 = this.papa;
        InterfaceC2330f classDescriptor = this.november;
        if (z2) {
            Collection lima = classDescriptor.tango().lima();
            Intrinsics.delta(lima, "ownerDescriptor.typeConstructor.supertypes");
            return lima;
        }
        ((Be.a) this.bravo.purple).uniform.getClass();
        Intrinsics.echo(classDescriptor, "classDescriptor");
        Collection lima2 = classDescriptor.tango().lima();
        Intrinsics.delta(lima2, "classDescriptor.typeConstructor.supertypes");
        return lima2;
    }

    public final boolean blue(pe.al alVar, Function1 function1) {
        if (!F0.bravo(alVar)) {
            se.ak cyan = cyan(alVar, function1);
            se.ak emerald = emerald(alVar, function1);
            if (cyan != null) {
                if (alVar.e()) {
                    if (emerald != null && emerald.golf() == cyan.golf()) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // Ce.ad, Xe.o, Xe.n
    public final Collection charlie(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        indigo(name, enumC3339b);
        return super.charlie(name, enumC3339b);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    public final se.ak cyan(pe.al alVar, Function1 function1) {
        se.ai aiVar;
        Ne.f fVar;
        se.ai bravo = alVar.bravo();
        String str = null;
        if (bravo != null) {
            aiVar = (se.ai) K3.charlie(bravo);
        } else {
            aiVar = null;
        }
        if (aiVar != null) {
            AbstractC2120h.yankee(aiVar);
            InterfaceC2328d bravo2 = Ue.e.bravo(Ue.e.kilo(aiVar), ye.j.alpha);
            if (bravo2 != null && (fVar = (Ne.f) ye.i.alpha.get(Ue.e.golf(bravo2))) != null) {
                str = fVar.bravo();
            }
        }
        if (str != null && !K3.echo(this.november, aiVar)) {
            return crimson(alVar, str, function1);
        }
        String bravo3 = alVar.getName().bravo();
        Intrinsics.delta(bravo3, "name.asString()");
        return crimson(alVar, ye.aa.alpha(bravo3), function1);
    }

    @Override // Ce.ad, Xe.o, Xe.n
    public final Collection foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        indigo(name, enumC3339b);
        return super.foxtrot(name, enumC3339b);
    }

    public final LinkedHashSet fuchsia(Ne.f fVar) {
        Collection azure = azure();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = azure.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.types.y) it.next()).olive().charlie(fVar, EnumC3339b.teal));
        }
        return linkedHashSet;
    }

    public final Set gold(Ne.f fVar) {
        int collectionSizeOrDefault;
        Collection azure = azure();
        ArrayList arrayList = new ArrayList();
        Iterator it = azure.iterator();
        while (it.hasNext()) {
            Collection foxtrot = ((kotlin.reflect.jvm.internal.impl.types.y) it.next()).olive().foxtrot(fVar, EnumC3339b.teal);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(foxtrot, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            Iterator it2 = foxtrot.iterator();
            while (it2.hasNext()) {
                arrayList2.add((pe.al) it2.next());
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
        }
        return CollectionsKt.D(arrayList);
    }

    @Override // Xe.o, Xe.p
    public final InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        ff.j jVar;
        InterfaceC2330f interfaceC2330f;
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        indigo(name, location);
        p pVar = this.charlie;
        if (pVar != null && (jVar = pVar.uniform) != null && (interfaceC2330f = (InterfaceC2330f) jVar.invoke(name)) != null) {
            return interfaceC2330f;
        }
        return (InterfaceC2332h) this.uniform.invoke(name);
    }

    public final boolean green(se.ak akVar) {
        List orange;
        int i4 = 1;
        Ne.f name = akVar.getName();
        Intrinsics.delta(name, "function.name");
        String bravo = name.bravo();
        Intrinsics.delta(bravo, "name.asString()");
        Ne.c cVar = ye.aa.alpha;
        if (!kotlin.text.r.quebec(bravo, "get", false) && !kotlin.text.r.quebec(bravo, "is", false)) {
            if (kotlin.text.r.quebec(bravo, "set", false)) {
                orange = CollectionsKt.peach(J3.echo(name, "set", null, 4), J3.echo(name, "set", "is", 4));
            } else {
                orange = (List) ye.i.bravo.get(name);
                if (orange == null) {
                    orange = CollectionsKt.emptyList();
                }
            }
        } else {
            Ne.f echo = J3.echo(name, "get", null, 12);
            if (echo == null) {
                echo = J3.echo(name, "is", null, 8);
            }
            orange = CollectionsKt.orange(echo);
        }
        if (orange == null || !orange.isEmpty()) {
            Iterator it = orange.iterator();
            loop5: while (it.hasNext()) {
                Set<pe.al> gold = gold((Ne.f) it.next());
                if (!(gold instanceof Collection) || !gold.isEmpty()) {
                    for (pe.al alVar : gold) {
                        if (blue(alVar, new ap(i4, akVar, this))) {
                            if (alVar.e()) {
                                break loop5;
                            }
                            String bravo2 = akVar.getName().bravo();
                            Intrinsics.delta(bravo2, "function.name.asString()");
                            if (!kotlin.text.r.quebec(bravo2, "set", false)) {
                                break loop5;
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList = ye.am.alpha;
        Ne.f name2 = akVar.getName();
        Intrinsics.delta(name2, "name");
        Ne.f fVar = (Ne.f) ye.am.kilo.get(name2);
        if (fVar != null) {
            LinkedHashSet fuchsia = fuchsia(fVar);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : fuchsia) {
                se.ak akVar2 = (se.ak) obj;
                Intrinsics.echo(akVar2, "<this>");
                if (K3.charlie(akVar2) != null) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC2344t w4 = akVar.w();
                w4.foxtrot(fVar);
                w4.xray();
                w4.echo();
                InterfaceC2345u build = w4.build();
                Intrinsics.checkNotNull(build);
                se.ak akVar3 = (se.ak) build;
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (coral((se.ak) it2.next(), akVar3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i5 = ye.h.lima;
        Ne.f name3 = akVar.getName();
        Intrinsics.delta(name3, "name");
        if (ye.h.bravo(name3)) {
            Ne.f name4 = akVar.getName();
            Intrinsics.delta(name4, "name");
            LinkedHashSet fuchsia2 = fuchsia(name4);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = fuchsia2.iterator();
            while (it3.hasNext()) {
                InterfaceC2345u alpha = ye.h.alpha((se.ak) it3.next());
                if (alpha != null) {
                    arrayList3.add(alpha);
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    if (gray(akVar, (InterfaceC2345u) it4.next())) {
                        break;
                    }
                }
            }
        }
        se.ak black = black(akVar);
        if (black != null) {
            Ne.f name5 = akVar.getName();
            Intrinsics.delta(name5, "name");
            LinkedHashSet<se.ak> fuchsia3 = fuchsia(name5);
            if (!fuchsia3.isEmpty()) {
                for (se.ak akVar4 : fuchsia3) {
                    if (akVar4.isSuspend() && bronze(black, akVar4)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // Ce.ad
    public final Set hotel(Xe.f kindFilter, Xe.k kVar) {
        Intrinsics.echo(kindFilter, "kindFilter");
        return kotlin.collections.ab.mike((Set) this.romeo.invoke(), ((Map) this.tango.invoke()).keySet());
    }

    @Override // Ce.ad
    public final Set india(Xe.f kindFilter, Xe.k kVar) {
        Intrinsics.echo(kindFilter, "kindFilter");
        InterfaceC2330f interfaceC2330f = this.november;
        Collection lima = interfaceC2330f.tango().lima();
        Intrinsics.delta(lima, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = lima.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.types.y) it.next()).olive().bravo());
        }
        ff.i iVar = this.echo;
        linkedHashSet.addAll(((c) iVar.invoke()).alpha());
        linkedHashSet.addAll(((c) iVar.invoke()).delta());
        linkedHashSet.addAll(hotel(kindFilter, kVar));
        B9.ab abVar = this.bravo;
        linkedHashSet.addAll(((Ve.a) ((Be.a) abVar.purple).xray).echo(abVar, interfaceC2330f));
        return linkedHashSet;
    }

    public final void indigo(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        Intrinsics.echo(((Be.a) this.bravo.purple).november, "<this>");
        InterfaceC2330f scopeOwner = this.november;
        Intrinsics.echo(scopeOwner, "scopeOwner");
    }

    @Override // Ce.ad
    public final void juliet(Ne.f name, ArrayList arrayList) {
        Intrinsics.echo(name, "name");
        boolean foxtrot = this.oscar.foxtrot();
        InterfaceC2330f interfaceC2330f = this.november;
        B9.ab abVar = this.bravo;
        if (foxtrot) {
            ff.i iVar = this.echo;
            if (((c) iVar.invoke()).charlie(name) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((se.ak) it.next()).peach().isEmpty()) {
                            break;
                        }
                    }
                }
                ve.ac charlie = ((c) iVar.invoke()).charlie(name);
                Intrinsics.checkNotNull(charlie);
                Be.c bravo = A0.bravo(abVar, charlie);
                Ne.f charlie2 = charlie.charlie();
                Be.a aVar = (Be.a) abVar.purple;
                Ae.f o02 = Ae.f.o0(interfaceC2330f, bravo, charlie2, aVar.juliet.alpha(charlie), true);
                De.a delta = G4.delta(2, false, null, 6);
                o02.n0(null, papa(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), ((J2.t) abVar.teal).amber(charlie.foxtrot(), delta), 3, AbstractC2340p.echo, null);
                o02.f61w = 1;
                aVar.golf.getClass();
                arrayList.add(o02);
            }
        }
        ((Ve.a) ((Be.a) abVar.purple).xray).bravo(abVar, interfaceC2330f, name, arrayList);
    }

    @Override // Ce.ad
    public final c kilo() {
        return new a(this.oscar, k.alpha);
    }

    @Override // Ce.ad
    public final void mike(LinkedHashSet linkedHashSet, Ne.f name) {
        int i4 = 1;
        int i5 = 0;
        Intrinsics.echo(name, "name");
        LinkedHashSet fuchsia = fuchsia(name);
        ArrayList arrayList = ye.am.alpha;
        if (!ye.am.juliet.contains(name)) {
            int i10 = ye.h.lima;
            if (!ye.h.bravo(name)) {
                if (!fuchsia.isEmpty()) {
                    Iterator it = fuchsia.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC2345u) it.next()).isSuspend()) {
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : fuchsia) {
                    if (green((se.ak) obj)) {
                        arrayList2.add(obj);
                    }
                }
                yankee(linkedHashSet, name, arrayList2, false);
                return;
            }
        }
        C2259n c2259n = new C2259n();
        LinkedHashSet echo = y6.e.echo(name, fuchsia, CollectionsKt.emptyList(), this.november, InterfaceC0854j.alpha, ((Be.a) this.bravo.purple).uniform.delta);
        zulu(name, linkedHashSet, echo, linkedHashSet, new l(i4, this, i5));
        zulu(name, linkedHashSet, echo, c2259n, new l(i4, this, i4));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : fuchsia) {
            if (green((se.ak) obj2)) {
                arrayList3.add(obj2);
            }
        }
        yankee(linkedHashSet, name, CollectionsKt.a(arrayList3, c2259n), true);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // Ce.ad
    public final void november(Ne.f name, ArrayList arrayList) {
        Set set;
        ve.z zVar;
        Intrinsics.echo(name, "name");
        boolean isAnnotation = this.oscar.alpha.isAnnotation();
        B9.ab abVar = this.bravo;
        if (isAnnotation && (zVar = (ve.z) CollectionsKt.l(((c) this.echo.invoke()).bravo(name))) != null) {
            Ae.g h02 = Ae.g.h0(this.november, A0.bravo(abVar, zVar), L3.bravo(zVar.echo()), false, zVar.charlie(), ((Be.a) abVar.purple).juliet.alpha(zVar), false);
            se.ai foxtrot = Qe.l.foxtrot(h02, C2471g.alpha);
            h02.d0(foxtrot, null, null, null);
            Intrinsics.echo(abVar, "<this>");
            kotlin.reflect.jvm.internal.impl.types.y lima = ad.lima(zVar, new B9.ab((Be.a) abVar.purple, new Be.e(abVar, h02, zVar, 0), (Lazy) abVar.red));
            h02.g0(lima, CollectionsKt.emptyList(), papa(), null, CollectionsKt.emptyList());
            foxtrot.f13736f = lima;
            arrayList.add(h02);
        }
        Set gold = gold(name);
        if (gold.isEmpty()) {
            return;
        }
        C2259n c2259n = new C2259n();
        C2259n c2259n2 = new C2259n();
        amber(gold, arrayList, c2259n, new m(this, 0));
        if (c2259n.isEmpty()) {
            set = CollectionsKt.D(gold);
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : gold) {
                if (!c2259n.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            set = linkedHashSet;
        }
        amber(set, c2259n2, null, new m(this, 1));
        LinkedHashSet mike = kotlin.collections.ab.mike(gold, c2259n2);
        Be.a aVar = (Be.a) abVar.purple;
        arrayList.addAll(y6.e.echo(name, mike, arrayList, this.november, aVar.foxtrot, aVar.uniform.delta));
    }

    @Override // Ce.ad
    public final Set oscar(Xe.f kindFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        if (this.oscar.alpha.isAnnotation()) {
            return bravo();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((c) this.echo.invoke()).echo());
        Collection lima = this.november.tango().lima();
        Intrinsics.delta(lima, "ownerDescriptor.typeConstructor.supertypes");
        Iterator it = lima.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.types.y) it.next()).olive().echo());
        }
        return linkedHashSet;
    }

    @Override // Ce.ad
    public final C2871u papa() {
        InterfaceC2330f interfaceC2330f = this.november;
        if (interfaceC2330f != null) {
            int i4 = Qe.e.alpha;
            return interfaceC2330f.C();
        }
        Qe.e.alpha(0);
        throw null;
    }

    @Override // Ce.ad
    public final InterfaceC2335k quebec() {
        return this.november;
    }

    @Override // Ce.ad
    public final boolean romeo(Ae.f fVar) {
        if (this.oscar.alpha.isAnnotation()) {
            return false;
        }
        return green(fVar);
    }

    @Override // Ce.ad
    public final x sierra(ve.z method, ArrayList arrayList, kotlin.reflect.jvm.internal.impl.types.y yVar, List valueParameters) {
        Intrinsics.echo(method, "method");
        Intrinsics.echo(valueParameters, "valueParameters");
        ((Be.a) this.bravo.purple).echo.getClass();
        if (this.november != null) {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return new x(yVar, valueParameters, arrayList, list);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Ce.ad
    public final String toString() {
        return "Lazy Java member scope for " + this.oscar.charlie();
    }

    public final void xray(ArrayList arrayList, Ae.b bVar, int i4, ve.z zVar, kotlin.reflect.jvm.internal.impl.types.y yVar, kotlin.reflect.jvm.internal.impl.types.y yVar2) {
        ve.f fVar;
        boolean z2;
        C2470f c2470f = C2471g.alpha;
        Ne.f charlie = zVar.charlie();
        B b2 = null;
        if (yVar != null) {
            B hotel = az.hotel(yVar, false);
            Object defaultValue = zVar.alpha.getDefaultValue();
            if (defaultValue != null) {
                Class<?> cls = defaultValue.getClass();
                List list = AbstractC3192d.alpha;
                if (Enum.class.isAssignableFrom(cls)) {
                    fVar = new ve.v(null, (Enum) defaultValue);
                } else if (defaultValue instanceof Annotation) {
                    fVar = new ve.g(null, (Annotation) defaultValue);
                } else if (defaultValue instanceof Object[]) {
                    fVar = new ve.h(null, (Object[]) defaultValue);
                } else if (defaultValue instanceof Class) {
                    fVar = new ve.r(null, (Class) defaultValue);
                } else {
                    fVar = new ve.x(null, defaultValue);
                }
            } else {
                fVar = null;
            }
            if (fVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (yVar2 != null) {
                b2 = az.hotel(yVar2, false);
            }
            arrayList.add(new aq(bVar, null, i4, c2470f, charlie, hotel, z2, false, false, b2, ((Be.a) this.bravo.purple).juliet.alpha(zVar)));
            return;
        }
        az.alpha(2);
        throw null;
    }

    public final void yankee(LinkedHashSet linkedHashSet, Ne.f fVar, ArrayList arrayList, boolean z2) {
        int collectionSizeOrDefault;
        Be.a aVar = (Be.a) this.bravo.purple;
        LinkedHashSet<se.ak> echo = y6.e.echo(fVar, arrayList, linkedHashSet, this.november, aVar.foxtrot, aVar.uniform.delta);
        if (!z2) {
            linkedHashSet.addAll(echo);
            return;
        }
        ArrayList a6 = CollectionsKt.a(linkedHashSet, echo);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(echo, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (se.ak akVar : echo) {
            se.ak akVar2 = (se.ak) K3.delta(akVar);
            if (akVar2 != null) {
                akVar = beige(akVar, akVar2, a6);
            }
            arrayList2.add(akVar);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0132 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zulu(Ne.f fVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, Function1 function1) {
        se.ak beige;
        Object obj;
        se.ak akVar;
        se.ak beige2;
        int collectionSizeOrDefault;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            se.ak akVar2 = (se.ak) it.next();
            se.ak akVar3 = (se.ak) K3.charlie(akVar2);
            se.ak akVar4 = null;
            if (akVar3 != null) {
                String bravo = K3.bravo(akVar3);
                Intrinsics.checkNotNull(bravo);
                Iterator it2 = ((Collection) function1.invoke(Ne.f.echo(bravo))).iterator();
                while (it2.hasNext()) {
                    InterfaceC2344t w4 = ((se.ak) it2.next()).w();
                    w4.foxtrot(fVar);
                    w4.xray();
                    w4.echo();
                    InterfaceC2345u build = w4.build();
                    Intrinsics.checkNotNull(build);
                    se.ak akVar5 = (se.ak) build;
                    if (coral(akVar3, akVar5)) {
                        beige = beige(akVar5, akVar3, linkedHashSet);
                        break;
                    }
                }
            }
            beige = null;
            AbstractC2262q.alpha(abstractSet, beige);
            InterfaceC2345u alpha = ye.h.alpha(akVar2);
            if (alpha != 0) {
                Ne.f name = ((AbstractC2863m) alpha).getName();
                Intrinsics.delta(name, "overridden.name");
                Iterator it3 = ((Iterable) function1.invoke(name)).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (gray((se.ak) obj, alpha)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                se.ak akVar6 = (se.ak) obj;
                if (akVar6 != null) {
                    InterfaceC2344t w10 = akVar6.w();
                    List peach = alpha.peach();
                    Intrinsics.delta(peach, "overridden.valueParameters");
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(peach, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    Iterator it4 = peach.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((aq) it4.next()).getType());
                    }
                    List peach2 = akVar6.peach();
                    Intrinsics.delta(peach2, "override.valueParameters");
                    w10.bravo(AbstractC1380u1.alpha(arrayList, peach2, alpha));
                    w10.xray();
                    w10.echo();
                    w10.kilo();
                    akVar = (se.ak) w10.build();
                } else {
                    akVar = null;
                }
                if (akVar != null) {
                    if (!green(akVar)) {
                        akVar = null;
                    }
                    if (akVar != null) {
                        beige2 = beige(akVar, alpha, linkedHashSet);
                        AbstractC2262q.alpha(abstractSet, beige2);
                        if (!akVar2.isSuspend()) {
                            Ne.f name2 = akVar2.getName();
                            Intrinsics.delta(name2, "descriptor.name");
                            Iterator it5 = ((Iterable) function1.invoke(name2)).iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                se.ak black = black((se.ak) it5.next());
                                if (black == null || !bronze(black, akVar2)) {
                                    black = null;
                                }
                                if (black != null) {
                                    akVar4 = black;
                                    break;
                                }
                            }
                        }
                        AbstractC2262q.alpha(abstractSet, akVar4);
                    }
                }
            }
            beige2 = null;
            AbstractC2262q.alpha(abstractSet, beige2);
            if (!akVar2.isSuspend()) {
            }
            AbstractC2262q.alpha(abstractSet, akVar4);
        }
    }
}
