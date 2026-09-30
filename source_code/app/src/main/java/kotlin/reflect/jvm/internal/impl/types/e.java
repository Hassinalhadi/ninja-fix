package kotlin.reflect.jvm.internal.impl.types;

import gf.AbstractC1792g;
import gf.C1793h;
import gf.InterfaceC1787b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jf.C1987a;
import jf.C1988b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import of.AbstractC2262q;
import of.C2257l;
import of.C2259n;
import pe.InterfaceC2332h;
import qe.InterfaceC2466b;
import qe.InterfaceC2472h;
import s6.F7;
import se.C2855e;

/* loaded from: classes2.dex */
public final class e {
    public static final e alpha = new Object();

    public static final boolean bravo(InterfaceC1787b interfaceC1787b, p000if.d dVar) {
        if (!interfaceC1787b.t(dVar)) {
            if (dVar instanceof p000if.b) {
                as cyan = interfaceC1787b.cyan(interfaceC1787b.g((p000if.b) dVar));
                if (interfaceC1787b.zulu(cyan) || !interfaceC1787b.t(interfaceC1787b.blue(interfaceC1787b.f(cyan)))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean charlie(InterfaceC1787b interfaceC1787b, ao aoVar, p000if.d dVar, p000if.d dVar2, boolean z2) {
        Collection<p000if.c> bravo = interfaceC1787b.bravo(dVar);
        if (!(bravo instanceof Collection) || !bravo.isEmpty()) {
            for (p000if.c cVar : bravo) {
                if (!Intrinsics.areEqual(interfaceC1787b.maroon(cVar), interfaceC1787b.x(dVar2))) {
                    if (z2 && mike(alpha, aoVar, dVar2, cVar)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static List delta(ao aoVar, p000if.d dVar, p000if.f fVar) {
        c peach;
        InterfaceC1787b interfaceC1787b = aoVar.charlie;
        interfaceC1787b.silver(dVar, fVar);
        if (!interfaceC1787b.l(fVar) && interfaceC1787b.juliet(dVar)) {
            return CollectionsKt.emptyList();
        }
        if (interfaceC1787b.november(fVar)) {
            if (interfaceC1787b.e(interfaceC1787b.x(dVar), fVar)) {
                ae yankee = interfaceC1787b.yankee(dVar);
                if (yankee != null) {
                    dVar = yankee;
                }
                return kotlin.collections.ab.juliet(dVar);
            }
            return CollectionsKt.emptyList();
        }
        C2257l c2257l = new C2257l();
        aoVar.bravo();
        ArrayDeque arrayDeque = aoVar.golf;
        Intrinsics.checkNotNull(arrayDeque);
        C2259n c2259n = aoVar.hotel;
        Intrinsics.checkNotNull(c2259n);
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            if (c2259n.purple <= 1000) {
                p000if.d current = (p000if.d) arrayDeque.pop();
                Intrinsics.delta(current, "current");
                if (c2259n.add(current)) {
                    ae yankee2 = interfaceC1787b.yankee(current);
                    if (yankee2 == null) {
                        yankee2 = current;
                    }
                    boolean e = interfaceC1787b.e(interfaceC1787b.x(yankee2), fVar);
                    an anVar = an.charlie;
                    if (e) {
                        c2257l.add(yankee2);
                        peach = anVar;
                    } else if (interfaceC1787b.bronze(yankee2) == 0) {
                        peach = an.bravo;
                    } else {
                        peach = interfaceC1787b.peach(yankee2);
                    }
                    if (Intrinsics.areEqual(peach, anVar)) {
                        peach = null;
                    }
                    if (peach != null) {
                        Iterator it = interfaceC1787b.golf(interfaceC1787b.x(current)).iterator();
                        while (it.hasNext()) {
                            arrayDeque.add(peach.xray(aoVar, (p000if.c) it.next()));
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + dVar + ". Supertypes = " + CollectionsKt.maroon(c2259n, null, null, null, null, 63)).toString());
            }
        }
        aoVar.alpha();
        return c2257l;
    }

    public static List echo(ao aoVar, p000if.d dVar, p000if.f fVar) {
        List delta = delta(aoVar, dVar, fVar);
        if (delta.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : delta) {
                InterfaceC1787b interfaceC1787b = aoVar.charlie;
                p000if.e amber = interfaceC1787b.amber((p000if.d) obj);
                int o5 = interfaceC1787b.o(amber);
                int i4 = 0;
                while (true) {
                    if (i4 < o5) {
                        if (interfaceC1787b.oscar(interfaceC1787b.f(interfaceC1787b.foxtrot(amber, i4))) == null) {
                            i4++;
                        }
                    } else {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return delta;
    }

    public static boolean golf(ao aoVar, p000if.c a6, p000if.c b2) {
        Intrinsics.echo(a6, "a");
        Intrinsics.echo(b2, "b");
        if (a6 != b2) {
            e eVar = alpha;
            InterfaceC1787b interfaceC1787b = aoVar.charlie;
            if (kilo(interfaceC1787b, a6) && kilo(interfaceC1787b, b2)) {
                B charlie = aoVar.charlie(aoVar.delta(a6));
                B charlie2 = aoVar.charlie(aoVar.delta(b2));
                ae lime = interfaceC1787b.lime(charlie);
                if (interfaceC1787b.e(interfaceC1787b.maroon(charlie), interfaceC1787b.maroon(charlie2))) {
                    if (interfaceC1787b.bronze(lime) == 0) {
                        if (interfaceC1787b.white(charlie) || interfaceC1787b.white(charlie2) || interfaceC1787b.papa(lime) == interfaceC1787b.papa(interfaceC1787b.lime(charlie2))) {
                            return true;
                        }
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (mike(eVar, aoVar, a6, b2) && mike(eVar, aoVar, b2, a6)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        return r6.plum(r6.maroon(r7), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pe.aq juliet(InterfaceC1787b interfaceC1787b, p000if.c cVar, p000if.d dVar) {
        B f5;
        boolean z2;
        int bronze = interfaceC1787b.bronze(cVar);
        int i4 = 0;
        while (true) {
            as asVar = null;
            if (i4 >= bronze) {
                return null;
            }
            as tango = interfaceC1787b.tango(cVar, i4);
            if (!interfaceC1787b.zulu(tango)) {
                asVar = tango;
            }
            if (asVar != null && (f5 = interfaceC1787b.f(asVar)) != null) {
                if (interfaceC1787b.crimson(interfaceC1787b.kilo(interfaceC1787b.lime(f5))) && interfaceC1787b.crimson(interfaceC1787b.kilo(interfaceC1787b.lime(dVar)))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Intrinsics.areEqual(f5, dVar) || (z2 && Intrinsics.areEqual(interfaceC1787b.maroon(f5), interfaceC1787b.maroon(dVar)))) {
                    break;
                }
                pe.aq juliet = juliet(interfaceC1787b, f5, dVar);
                if (juliet != null) {
                    return juliet;
                }
            }
            i4++;
        }
    }

    public static boolean kilo(InterfaceC1787b interfaceC1787b, p000if.c cVar) {
        if (interfaceC1787b.charlie(interfaceC1787b.maroon(cVar))) {
            interfaceC1787b.h(cVar);
            if (!interfaceC1787b.v(cVar) && !interfaceC1787b.navy(cVar) && Intrinsics.areEqual(interfaceC1787b.x(interfaceC1787b.lime(cVar)), interfaceC1787b.x(interfaceC1787b.blue(cVar)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean lima(ao aoVar, p000if.e capturedSubArguments, p000if.d dVar) {
        boolean mike;
        Intrinsics.echo(capturedSubArguments, "capturedSubArguments");
        InterfaceC1787b interfaceC1787b = aoVar.charlie;
        ap x4 = interfaceC1787b.x(dVar);
        int o5 = interfaceC1787b.o(capturedSubArguments);
        int whiskey = interfaceC1787b.whiskey(x4);
        if (o5 == whiskey && o5 == interfaceC1787b.bronze(dVar)) {
            for (int i4 = 0; i4 < whiskey; i4++) {
                as tango = interfaceC1787b.tango(dVar, i4);
                if (!interfaceC1787b.zulu(tango)) {
                    B f5 = interfaceC1787b.f(tango);
                    as foxtrot = interfaceC1787b.foxtrot(capturedSubArguments, i4);
                    interfaceC1787b.q(foxtrot);
                    B f10 = interfaceC1787b.f(foxtrot);
                    int gray = interfaceC1787b.gray(interfaceC1787b.plum(x4, i4));
                    int q4 = interfaceC1787b.q(tango);
                    com.google.android.material.datepicker.j.papa(gray, "declared");
                    com.google.android.material.datepicker.j.papa(q4, "useSite");
                    if (gray == 3) {
                        gray = q4;
                    } else if (q4 != 3 && gray != q4) {
                        gray = 0;
                    }
                    if (gray == 0) {
                        return aoVar.alpha;
                    }
                    e eVar = alpha;
                    if (gray == 3) {
                        november(interfaceC1787b, f10, f5);
                        november(interfaceC1787b, f5, f10);
                    }
                    int i5 = aoVar.foxtrot;
                    if (i5 <= 100) {
                        aoVar.foxtrot = i5 + 1;
                        int mike2 = av.q.mike(gray);
                        if (mike2 != 0) {
                            if (mike2 != 1) {
                                if (mike2 == 2) {
                                    mike = golf(aoVar, f10, f5);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                mike = mike(eVar, aoVar, f10, f5);
                            }
                        } else {
                            mike = mike(eVar, aoVar, f5, f10);
                        }
                        aoVar.foxtrot--;
                        if (!mike) {
                        }
                    } else {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + f10).toString());
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x02d4, code lost:
    
        r3 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x02d2, code lost:
    
        if (charlie(r7, r26, r5, r3, true) != false) goto L168;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02dd  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.am] */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.reflect.jvm.internal.impl.types.d] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractCollection, if.e, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [gf.b] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean mike(e eVar, ao aoVar, p000if.c subType, p000if.c superType) {
        Boolean valueOf;
        Boolean bool;
        boolean z2;
        List<p000if.d> list;
        an anVar;
        int collectionSizeOrDefault;
        int size;
        an anVar2;
        int collectionSizeOrDefault2;
        B f5;
        an anVar3;
        ae aeVar;
        p000if.c cVar;
        boolean z10;
        eVar.getClass();
        Intrinsics.echo(subType, "subType");
        Intrinsics.echo(superType, "superType");
        if (subType == superType) {
            return true;
        }
        aoVar.getClass();
        boolean z11 = false;
        B charlie = aoVar.charlie(aoVar.delta(subType));
        B charlie2 = aoVar.charlie(aoVar.delta(superType));
        ?? r72 = aoVar.charlie;
        ae lime = r72.lime(charlie);
        ae blue = r72.blue(charlie2);
        boolean echo = r72.echo(lime);
        e eVar2 = alpha;
        if (!echo && !r72.echo(blue)) {
            r72.fuchsia(lime);
            r72.c(lime);
            r72.c(blue);
            o ochre = r72.ochre(blue);
            if (ochre == null || (aeVar = r72.orange(ochre)) == null) {
                aeVar = blue;
            }
            p000if.b romeo = r72.romeo(aeVar);
            if (romeo != null) {
                cVar = r72.purple(romeo);
            } else {
                cVar = null;
            }
            if (romeo != null && cVar != null) {
                if (r72.papa(blue)) {
                    cVar = r72.jade(cVar);
                } else if (r72.v(blue)) {
                    cVar = r72.victor(cVar);
                }
                if (mike(eVar2, aoVar, lime, cVar)) {
                    valueOf = Boolean.TRUE;
                }
            }
            ap x4 = r72.x(blue);
            if (r72.mike(x4)) {
                r72.papa(blue);
                Collection golf = r72.golf(x4);
                if (!(golf instanceof Collection) || !golf.isEmpty()) {
                    Iterator it = golf.iterator();
                    while (it.hasNext()) {
                        if (!mike(eVar2, aoVar, lime, (p000if.c) it.next())) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                valueOf = Boolean.valueOf(z10);
            } else {
                ap x5 = r72.x(lime);
                if (!(lime instanceof p000if.b)) {
                    if (r72.mike(x5)) {
                        Collection golf2 = r72.golf(x5);
                        if (!(golf2 instanceof Collection) || !golf2.isEmpty()) {
                            Iterator it2 = golf2.iterator();
                            while (it2.hasNext()) {
                                if (!(((p000if.c) it2.next()) instanceof p000if.b)) {
                                    break;
                                }
                            }
                        }
                    }
                    valueOf = null;
                }
                pe.aq juliet = juliet(r72, blue, lime);
                if (juliet != null && r72.yellow(juliet, r72.x(blue))) {
                    valueOf = Boolean.TRUE;
                }
                valueOf = null;
            }
        } else if (aoVar.alpha) {
            valueOf = Boolean.TRUE;
        } else if (r72.papa(lime) && !r72.papa(blue)) {
            valueOf = Boolean.FALSE;
        } else {
            ae a6 = r72.j(lime, false);
            ae b2 = r72.j(blue, false);
            Intrinsics.echo(a6, "a");
            Intrinsics.echo(b2, "b");
            valueOf = Boolean.valueOf(c.tango(r72, a6, b2));
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        p000if.d subType2 = r72.lime(charlie);
        ae superType2 = r72.blue(charlie2);
        Intrinsics.echo(subType2, "subType");
        Intrinsics.echo(superType2, "superType");
        boolean papa = r72.papa(superType2);
        an anVar4 = an.charlie;
        an anVar5 = an.bravo;
        int i4 = 1000;
        if (!papa && !r72.v(subType2) && !r72.navy(subType2) && ((!(subType2 instanceof p000if.b) || !r72.delta((p000if.b) subType2)) && !c.foxtrot(aoVar, subType2, anVar5))) {
            if (r72.v(superType2) || c.foxtrot(aoVar, superType2, an.delta) || r72.juliet(subType2)) {
                return false;
            }
            ap end = r72.x(superType2);
            Intrinsics.echo(end, "end");
            if (!c.hotel(aoVar, subType2, end)) {
                aoVar.bravo();
                ArrayDeque arrayDeque = aoVar.golf;
                Intrinsics.checkNotNull(arrayDeque);
                C2259n c2259n = aoVar.hotel;
                Intrinsics.checkNotNull(c2259n);
                arrayDeque.push(subType2);
                while (!arrayDeque.isEmpty()) {
                    if (c2259n.purple <= i4) {
                        p000if.d current = (p000if.d) arrayDeque.pop();
                        Intrinsics.delta(current, "current");
                        if (c2259n.add(current)) {
                            if (r72.papa(current)) {
                                anVar3 = anVar4;
                            } else {
                                anVar3 = anVar5;
                            }
                            if (Intrinsics.areEqual(anVar3, anVar4)) {
                                anVar3 = null;
                            }
                            if (anVar3 != null) {
                                Iterator it3 = r72.golf(r72.x(current)).iterator();
                                while (it3.hasNext()) {
                                    p000if.d xray = anVar3.xray(aoVar, (p000if.c) it3.next());
                                    if (c.hotel(aoVar, xray, end)) {
                                        aoVar.alpha();
                                    } else {
                                        arrayDeque.add(xray);
                                    }
                                }
                            }
                            i4 = 1000;
                        }
                    } else {
                        throw new IllegalStateException(("Too many supertypes for type: " + subType2 + ". Supertypes = " + CollectionsKt.maroon(c2259n, null, null, null, null, 63)).toString());
                    }
                }
                aoVar.alpha();
                return false;
            }
        }
        ae lime2 = r72.lime(subType2);
        ae blue2 = r72.blue(superType2);
        if (r72.t(lime2) || r72.t(blue2)) {
            if (bravo(r72, lime2) && bravo(r72, blue2)) {
                bool = Boolean.TRUE;
            } else if (r72.t(lime2)) {
                if (charlie(r72, aoVar, lime2, blue2, false)) {
                    bool = Boolean.TRUE;
                }
            } else if (r72.t(blue2)) {
                ap x10 = r72.x(lime2);
                if (x10 instanceof x) {
                    Collection golf3 = r72.golf(x10);
                    if (!(golf3 instanceof Collection) || !golf3.isEmpty()) {
                        Iterator it4 = golf3.iterator();
                        while (it4.hasNext()) {
                            ae quebec = r72.quebec((p000if.c) it4.next());
                            if (quebec != null && r72.t(quebec)) {
                                break;
                            }
                        }
                    }
                }
            }
            if (bool == null) {
                return bool.booleanValue();
            }
            ap superConstructor = r72.x(superType2);
            if ((r72.e(r72.x(subType2), superConstructor) && r72.whiskey(superConstructor) == 0) || r72.w(r72.x(superType2))) {
                return true;
            }
            Intrinsics.echo(superConstructor, "superConstructor");
            if (r72.juliet(subType2)) {
                list = echo(aoVar, subType2, superConstructor);
            } else if (!r72.l(superConstructor) && !r72.hotel(superConstructor)) {
                list = delta(aoVar, subType2, superConstructor);
            } else {
                C2257l c2257l = new C2257l();
                aoVar.bravo();
                ArrayDeque arrayDeque2 = aoVar.golf;
                Intrinsics.checkNotNull(arrayDeque2);
                C2259n c2259n2 = aoVar.hotel;
                Intrinsics.checkNotNull(c2259n2);
                arrayDeque2.push(subType2);
                while (!arrayDeque2.isEmpty()) {
                    if (c2259n2.purple <= 1000) {
                        p000if.d current2 = (p000if.d) arrayDeque2.pop();
                        Intrinsics.delta(current2, "current");
                        if (c2259n2.add(current2)) {
                            if (r72.juliet(current2)) {
                                c2257l.add(current2);
                                anVar = anVar4;
                            } else {
                                anVar = anVar5;
                            }
                            if (Intrinsics.areEqual(anVar, anVar4)) {
                                anVar = null;
                            }
                            if (anVar != null) {
                                Iterator it5 = r72.golf(r72.x(current2)).iterator();
                                while (it5.hasNext()) {
                                    arrayDeque2.add(anVar.xray(aoVar, (p000if.c) it5.next()));
                                    z11 = z11;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException(("Too many supertypes for type: " + subType2 + ". Supertypes = " + CollectionsKt.maroon(c2259n2, null, null, null, null, 63)).toString());
                    }
                }
                z2 = z11;
                aoVar.alpha();
                ArrayList arrayList = new ArrayList();
                Iterator it6 = c2257l.iterator();
                while (it6.hasNext()) {
                    p000if.d it7 = (p000if.d) it6.next();
                    Intrinsics.delta(it7, "it");
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, echo(aoVar, it7, superConstructor));
                }
                list = arrayList;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                for (p000if.d dVar : list) {
                    ae quebec2 = r72.quebec(aoVar.charlie(dVar));
                    if (quebec2 != null) {
                        dVar = quebec2;
                    }
                    arrayList2.add(dVar);
                }
                size = arrayList2.size();
                if (size == 0) {
                    if (size != 1) {
                        ?? arrayList3 = new ArrayList(r72.whiskey(superConstructor));
                        int whiskey = r72.whiskey(superConstructor);
                        boolean z12 = z2;
                        boolean z13 = z12;
                        for (?? r82 = z12; r82 < whiskey; r82++) {
                            if (!z13 && r72.gray(r72.plum(superConstructor, r82)) == 2) {
                                z13 = z2;
                            } else {
                                z13 = true;
                            }
                            if (!z13) {
                                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                                ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
                                Iterator it8 = arrayList2.iterator();
                                while (it8.hasNext()) {
                                    p000if.d dVar2 = (p000if.d) it8.next();
                                    as u4 = r72.u(dVar2, r82);
                                    if (u4 != null) {
                                        if (r72.q(u4) != 3) {
                                            u4 = null;
                                        }
                                        if (u4 != null && (f5 = r72.f(u4)) != null) {
                                            arrayList4.add(f5);
                                        }
                                    }
                                    throw new IllegalStateException(("Incorrect type: " + dVar2 + ", subType: " + subType2 + ", superType: " + superType2).toString());
                                }
                                arrayList3.add(r72.uniform(r72.red(arrayList4)));
                            }
                        }
                        if (!z13 && lima(aoVar, arrayList3, superType2)) {
                            return true;
                        }
                        ?? dVar3 = new d(arrayList2, aoVar, r72, superType2);
                        ?? obj = new Object();
                        dVar3.invoke(obj);
                        return obj.alpha;
                    }
                    return lima(aoVar, r72.amber((p000if.d) CollectionsKt.gold(arrayList2)), superType2);
                }
                ap x11 = r72.x(subType2);
                if (r72.l(x11)) {
                    return r72.sierra(x11);
                }
                if (r72.sierra(r72.x(subType2))) {
                    return true;
                }
                aoVar.bravo();
                ArrayDeque arrayDeque3 = aoVar.golf;
                Intrinsics.checkNotNull(arrayDeque3);
                C2259n c2259n3 = aoVar.hotel;
                Intrinsics.checkNotNull(c2259n3);
                arrayDeque3.push(subType2);
                while (!arrayDeque3.isEmpty()) {
                    if (c2259n3.purple <= 1000) {
                        p000if.d current3 = (p000if.d) arrayDeque3.pop();
                        Intrinsics.delta(current3, "current");
                        if (c2259n3.add(current3)) {
                            if (r72.juliet(current3)) {
                                anVar2 = anVar4;
                            } else {
                                anVar2 = anVar5;
                            }
                            if (Intrinsics.areEqual(anVar2, anVar4)) {
                                anVar2 = null;
                            }
                            if (anVar2 == null) {
                                continue;
                            } else {
                                Iterator it9 = r72.golf(r72.x(current3)).iterator();
                                while (it9.hasNext()) {
                                    p000if.d xray2 = anVar2.xray(aoVar, (p000if.c) it9.next());
                                    if (r72.sierra(r72.x(xray2))) {
                                        aoVar.alpha();
                                        return true;
                                    }
                                    arrayDeque3.add(xray2);
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException(("Too many supertypes for type: " + subType2 + ". Supertypes = " + CollectionsKt.maroon(c2259n3, null, null, null, null, 63)).toString());
                    }
                }
                aoVar.alpha();
                return z2;
            }
            z2 = false;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList22 = new ArrayList(collectionSizeOrDefault);
            while (r5.hasNext()) {
            }
            size = arrayList22.size();
            if (size == 0) {
            }
        }
        bool = null;
        if (bool == null) {
        }
    }

    public static void november(InterfaceC1787b interfaceC1787b, p000if.c cVar, p000if.c cVar2) {
        p000if.d quebec = interfaceC1787b.quebec(cVar);
        if (quebec instanceof p000if.b) {
            p000if.b bVar = (p000if.b) quebec;
            if (!interfaceC1787b.r(bVar) && interfaceC1787b.zulu(interfaceC1787b.cyan(interfaceC1787b.g(bVar))) && interfaceC1787b.olive(bVar) == 1) {
                interfaceC1787b.maroon(cVar2);
            }
        }
    }

    public static o oscar(B type, boolean z2) {
        se.ao aoVar;
        boolean z10;
        Intrinsics.echo(type, "type");
        if (type instanceof o) {
            return (o) type;
        }
        type.green();
        if (!(type.green().kilo() instanceof pe.aq) && !(type instanceof C1793h)) {
            z10 = false;
        } else {
            InterfaceC2332h kilo = type.green().kilo();
            if (kilo instanceof se.ao) {
                aoVar = (se.ao) kilo;
            } else {
                aoVar = null;
            }
            z10 = true;
            if (aoVar == null || aoVar.e) {
                if (z2 && (type.green().kilo() instanceof pe.aq)) {
                    z10 = az.foxtrot(type);
                } else {
                    z10 = true ^ c.foxtrot(AbstractC1792g.lima(false, null, 24), c.kilo(type), an.bravo);
                }
            }
        }
        if (!z10) {
            return null;
        }
        if (type instanceof s) {
            s sVar = (s) type;
            Intrinsics.areEqual(sVar.purple.green(), sVar.red.green());
        }
        return new o(c.kilo(type).pink(false), z2);
    }

    public void alpha(InterfaceC2472h interfaceC2472h, InterfaceC2472h interfaceC2472h2) {
        HashSet hashSet = new HashSet();
        Iterator it = interfaceC2472h.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC2466b) it.next()).alpha());
        }
        Iterator it2 = interfaceC2472h2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((InterfaceC2466b) it2.next()).alpha());
        }
    }

    public av foxtrot(ap typeConstructor, List arguments) {
        int collectionSizeOrDefault;
        Intrinsics.echo(typeConstructor, "typeConstructor");
        Intrinsics.echo(arguments, "arguments");
        List parameters = typeConstructor.getParameters();
        Intrinsics.delta(parameters, "typeConstructor.parameters");
        pe.aq aqVar = (pe.aq) CollectionsKt.olive(parameters);
        if (aqVar != null && aqVar.j()) {
            List parameters2 = typeConstructor.getParameters();
            Intrinsics.delta(parameters2, "typeConstructor.parameters");
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(((pe.aq) it.next()).tango());
            }
            return new ak(1, kotlin.collections.y.yankee(CollectionsKt.H(arrayList, arguments)));
        }
        return new v((pe.aq[]) parameters.toArray(new pe.aq[0]), (as[]) arguments.toArray(new as[0]), false);
    }

    public ae hotel(J2.i iVar, al alVar, boolean z2, int i4, boolean z10) {
        al echo;
        ef.s sVar = (ef.s) iVar.purple;
        as india = india(new at(1, sVar.b0()), iVar, null, i4);
        y bravo = india.bravo();
        Intrinsics.delta(bravo, "expandedProjection.type");
        ae bravo2 = c.bravo(bravo);
        if (c.india(bravo2)) {
            return bravo2;
        }
        india.alpha();
        alpha(bravo2.getAnnotations(), k.alpha(alVar));
        if (!c.india(bravo2)) {
            if (c.india(bravo2)) {
                echo = bravo2.gold();
            } else {
                al other = bravo2.gold();
                Intrinsics.echo(other, "other");
                if (alVar.isEmpty() && other.isEmpty()) {
                    echo = alVar;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection values = ((ConcurrentHashMap) al.purple.purple).values();
                    Intrinsics.delta(values, "idPerType.values");
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        j jVar = (j) alVar.alpha.get(intValue);
                        j jVar2 = (j) other.alpha.get(intValue);
                        if (jVar == null) {
                            if (jVar2 != null) {
                                if (jVar != null) {
                                    jVar2 = new j(F7.alpha(jVar2.alpha, jVar.alpha));
                                }
                            } else {
                                jVar2 = null;
                            }
                        } else {
                            if (jVar2 != null) {
                                jVar = new j(F7.alpha(jVar.alpha, jVar2.alpha));
                            }
                            jVar2 = jVar;
                        }
                        AbstractC2262q.alpha(arrayList, jVar2);
                    }
                    echo = com.google.android.play.core.integrity.k.echo(arrayList);
                }
            }
            bravo2 = c.papa(bravo2, null, echo, 1);
        }
        ae juliet = az.juliet(bravo2, z2);
        if (z10) {
            C2855e c2855e = sVar.yellow;
            Intrinsics.delta(c2855e, "descriptor.typeConstructor");
            return c.zulu(juliet, ab.delta(Xe.m.bravo, (List) iVar.red, alVar, c2855e, z2));
        }
        return juliet;
    }

    public as india(as asVar, J2.i iVar, pe.aq aqVar, int i4) {
        as asVar2;
        int i5;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        ef.s typeAlias = (ef.s) iVar.purple;
        if (i4 <= 100) {
            if (asVar.charlie()) {
                Intrinsics.checkNotNull(aqVar);
                return az.kilo(aqVar);
            }
            y bravo = asVar.bravo();
            Intrinsics.delta(bravo, "underlyingProjection.type");
            ap constructor = bravo.green();
            Intrinsics.echo(constructor, "constructor");
            InterfaceC2332h kilo = constructor.kilo();
            if (kilo instanceof pe.aq) {
                asVar2 = (as) ((Map) iVar.silver).get(kilo);
            } else {
                asVar2 = null;
            }
            if (asVar2 == null) {
                ae bravo2 = c.bravo(asVar.bravo().ochre());
                if (!c.india(bravo2)) {
                    C1988b predicate = C1988b.alpha;
                    Intrinsics.echo(predicate, "predicate");
                    if (az.delta(bravo2, predicate, null)) {
                        ap green = bravo2.green();
                        InterfaceC2332h kilo2 = green.kilo();
                        green.getParameters().size();
                        bravo2.cyan().size();
                        if (!(kilo2 instanceof pe.aq)) {
                            int i10 = 0;
                            if (kilo2 instanceof ef.s) {
                                ef.s sVar = (ef.s) kilo2;
                                if (iVar.echo(sVar)) {
                                    hf.h hVar = hf.h.white;
                                    String str = sVar.getName().alpha;
                                    Intrinsics.delta(str, "typeDescriptor.name.toString()");
                                    return new at(1, hf.i.charlie(hVar, str));
                                }
                                List cyan = bravo2.cyan();
                                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(cyan, 10);
                                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                                for (Object obj : cyan) {
                                    int i11 = i10 + 1;
                                    if (i10 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    arrayList.add(india((as) obj, iVar, (pe.aq) green.getParameters().get(i10), i4 + 1));
                                    i10 = i11;
                                }
                                List parameters = sVar.yellow.getParameters();
                                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10);
                                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                                Iterator it = parameters.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((pe.aq) it.next()).alpha());
                                }
                                return new at(asVar.alpha(), c.zulu(hotel(new J2.i(iVar, sVar, arrayList, kotlin.collections.y.yankee(CollectionsKt.H(arrayList2, arrayList))), bravo2.gold(), bravo2.indigo(), i4 + 1, false), papa(bravo2, iVar, i4)));
                            }
                            ae papa = papa(bravo2, iVar, i4);
                            ax.delta(papa);
                            for (Object obj2 : papa.cyan()) {
                                int i12 = i10 + 1;
                                if (i10 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                as asVar3 = (as) obj2;
                                if (!asVar3.charlie()) {
                                    y bravo3 = asVar3.bravo();
                                    Intrinsics.delta(bravo3, "substitutedArgument.type");
                                    C1987a predicate2 = C1987a.alpha;
                                    Intrinsics.echo(predicate2, "predicate");
                                    if (!az.delta(bravo3, predicate2, null)) {
                                    }
                                }
                                i10 = i12;
                            }
                            return new at(asVar.alpha(), papa);
                        }
                    }
                }
                return asVar;
            }
            if (asVar2.charlie()) {
                Intrinsics.checkNotNull(aqVar);
                return az.kilo(aqVar);
            }
            B ochre = asVar2.bravo().ochre();
            int alpha2 = asVar2.alpha();
            com.google.android.material.datepicker.j.sierra(alpha2, "argument.projectionKind");
            int alpha3 = asVar.alpha();
            com.google.android.material.datepicker.j.sierra(alpha3, "underlyingProjection.projectionKind");
            if (alpha3 != alpha2 && alpha3 != 1) {
                if (alpha2 == 1) {
                    alpha2 = alpha3;
                } else {
                    Intrinsics.echo(typeAlias, "typeAlias");
                }
            }
            if (aqVar == null || (i5 = aqVar.fuchsia()) == 0) {
                i5 = 1;
            }
            if (i5 != alpha2 && i5 != 1) {
                if (alpha2 == 1) {
                    alpha2 = 1;
                } else {
                    Intrinsics.echo(typeAlias, "typeAlias");
                }
            }
            alpha(bravo.getAnnotations(), ochre.getAnnotations());
            ae juliet = az.juliet(c.bravo(ochre), bravo.indigo());
            al gold = bravo.gold();
            if (!c.india(juliet)) {
                if (c.india(juliet)) {
                    gold = juliet.gold();
                } else {
                    al other = juliet.gold();
                    gold.getClass();
                    Intrinsics.echo(other, "other");
                    if (!gold.isEmpty() || !other.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        Collection values = ((ConcurrentHashMap) al.purple.purple).values();
                        Intrinsics.delta(values, "idPerType.values");
                        Iterator it2 = values.iterator();
                        while (it2.hasNext()) {
                            int intValue = ((Number) it2.next()).intValue();
                            j jVar = (j) gold.alpha.get(intValue);
                            j jVar2 = (j) other.alpha.get(intValue);
                            if (jVar == null) {
                                if (jVar2 != null) {
                                    if (jVar != null) {
                                        jVar2 = new j(F7.alpha(jVar2.alpha, jVar.alpha));
                                    }
                                } else {
                                    jVar2 = null;
                                }
                            } else {
                                if (jVar2 != null) {
                                    jVar = new j(F7.alpha(jVar.alpha, jVar2.alpha));
                                }
                                jVar2 = jVar;
                            }
                            AbstractC2262q.alpha(arrayList3, jVar2);
                        }
                        gold = com.google.android.play.core.integrity.k.echo(arrayList3);
                    }
                }
                juliet = c.papa(juliet, null, gold, 1);
            }
            return new at(alpha2, juliet);
        }
        throw new AssertionError("Too deep recursion while expanding type alias " + typeAlias.getName());
    }

    public ae papa(ae aeVar, J2.i iVar, int i4) {
        int collectionSizeOrDefault;
        ap green = aeVar.green();
        List cyan = aeVar.cyan();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(cyan, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        int i5 = 0;
        for (Object obj : cyan) {
            int i10 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            as asVar = (as) obj;
            as india = india(asVar, iVar, (pe.aq) green.getParameters().get(i5), i4 + 1);
            if (!india.charlie()) {
                india = new at(india.alpha(), az.india(india.bravo(), asVar.bravo().indigo()));
            }
            arrayList.add(india);
            i5 = i10;
        }
        return c.papa(aeVar, arrayList, null, 2);
    }
}
