package Fe;

import B2.ap;
import gf.AbstractC1792g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ab;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.az;
import kotlin.reflect.jvm.internal.impl.types.y;
import oe.C2233d;
import oe.C2234e;
import pe.AbstractC2347w;
import pe.InterfaceC2326b;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.InterfaceC2336l;
import pe.InterfaceC2345u;
import pe.aq;
import qe.C2471g;
import qe.C2473i;
import qe.InterfaceC2472h;
import s6.AbstractC2643e5;
import s6.AbstractC2661g5;
import s6.AbstractC2777t5;
import s6.AbstractC2826z0;
import s6.F0;
import s6.O5;
import s6.S4;
import se.C2871u;
import se.ai;
import ve.C3193e;
import ye.C3426d;
import ye.EnumC3424b;
import ye.ac;
import ye.af;

/* loaded from: classes2.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021b  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d charlie(ae aeVar, ap apVar, int i4, int i5, boolean z2, boolean z10) {
        boolean z11;
        boolean z12;
        InterfaceC2330f interfaceC2330f;
        Boolean bool;
        kotlin.reflect.jvm.internal.impl.types.ap green;
        int i10;
        Iterator it;
        ArrayList arrayList;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int i11;
        int size;
        InterfaceC2472h interfaceC2472h;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        boolean indigo;
        boolean z13;
        c cVar;
        B b2;
        Object obj;
        int i12;
        int i13 = 1;
        int i14 = 0;
        com.google.android.material.datepicker.j.papa(i5, "<this>");
        if (i5 != 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z2) {
            z12 = false;
        } else {
            z12 = true;
        }
        Object obj2 = null;
        if (!z11 && aeVar.cyan().isEmpty()) {
            return new d(null, 1, false);
        }
        InterfaceC2332h kilo = aeVar.green().kilo();
        if (kilo == null) {
            return new d(null, 1, false);
        }
        f fVar = (f) apVar.invoke(Integer.valueOf(i4));
        C2473i c2473i = x.alpha;
        com.google.android.material.datepicker.j.papa(i5, "<this>");
        if (i5 != 3 && (kilo instanceof InterfaceC2330f)) {
            if (fVar.bravo == g.alpha && i5 == 1) {
                InterfaceC2330f interfaceC2330f2 = (InterfaceC2330f) kilo;
                String str = C2233d.alpha;
                Ne.e golf = Qe.e.golf(interfaceC2330f2);
                HashMap hashMap = C2233d.juliet;
                if (hashMap.containsKey(golf)) {
                    Ne.c cVar2 = (Ne.c) hashMap.get(Qe.e.golf(interfaceC2330f2));
                    if (cVar2 != null) {
                        interfaceC2330f = Ue.e.echo(interfaceC2330f2).india(cVar2);
                        com.google.android.material.datepicker.j.papa(i5, "<this>");
                        if (i5 != 3) {
                            i iVar = fVar.alpha;
                            if (iVar == null) {
                                i12 = -1;
                            } else {
                                i12 = w.$EnumSwitchMapping$0[iVar.ordinal()];
                            }
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    bool = Boolean.FALSE;
                                }
                            } else {
                                bool = Boolean.TRUE;
                            }
                            if (interfaceC2330f != null || (green = interfaceC2330f.tango()) == null) {
                                green = aeVar.green();
                            }
                            Intrinsics.delta(green, "enhancedClassifier?.typeConstructor ?: constructor");
                            i10 = i4 + 1;
                            List cyan = aeVar.cyan();
                            List parameters = green.getParameters();
                            Intrinsics.delta(parameters, "typeConstructor.parameters");
                            it = parameters.iterator();
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(cyan, 10);
                            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10);
                            arrayList = new ArrayList(Math.min(collectionSizeOrDefault, collectionSizeOrDefault2));
                            while (r15.hasNext() && it.hasNext()) {
                                aq aqVar = (aq) it.next();
                                as asVar = (as) r13;
                                if (z12) {
                                    cVar = new c(obj2, i14, i14);
                                } else if (!asVar.charlie()) {
                                    cVar = delta(asVar.bravo().ochre(), apVar, i10, z10);
                                } else if (((f) apVar.invoke(Integer.valueOf(i10))).alpha == i.alpha) {
                                    B ochre = asVar.bravo().ochre();
                                    cVar = new c(ab.alpha(kotlin.reflect.jvm.internal.impl.types.c.kilo(ochre).pink(i14), kotlin.reflect.jvm.internal.impl.types.c.yankee(ochre).pink(true)), 1, 0);
                                } else {
                                    cVar = new c((Object) null, i13, i14);
                                }
                                i10 += cVar.purple;
                                b2 = (B) cVar.red;
                                if (b2 == null) {
                                    int alpha = asVar.alpha();
                                    com.google.android.material.datepicker.j.sierra(alpha, "arg.projectionKind");
                                    obj = O5.charlie(b2, alpha, aqVar);
                                } else if (interfaceC2330f != null && !asVar.charlie()) {
                                    y bravo = asVar.bravo();
                                    Intrinsics.delta(bravo, "arg.type");
                                    int alpha2 = asVar.alpha();
                                    com.google.android.material.datepicker.j.sierra(alpha2, "arg.projectionKind");
                                    obj = O5.charlie(bravo, alpha2, aqVar);
                                } else if (interfaceC2330f != null) {
                                    obj = az.kilo(aqVar);
                                } else {
                                    obj = null;
                                }
                                arrayList.add(obj);
                                i13 = 1;
                                i14 = 0;
                                obj2 = null;
                            }
                            i11 = i10 - i4;
                            if (interfaceC2330f == null && bool == null) {
                                if (!arrayList.isEmpty()) {
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        if (((as) it2.next()) == null) {
                                        }
                                    }
                                }
                                return new d(null, i11, false);
                            }
                            C2473i c2473i2 = null;
                            InterfaceC2472h annotations = aeVar.getAnnotations();
                            C2473i c2473i3 = x.bravo;
                            if (interfaceC2330f == null) {
                                c2473i3 = null;
                            }
                            C2473i c2473i4 = x.alpha;
                            if (bool != null) {
                                c2473i2 = c2473i4;
                            }
                            List peach = CollectionsKt.peach(annotations, c2473i3, c2473i2);
                            size = peach.size();
                            if (size == 0) {
                                if (size != 1) {
                                    interfaceC2472h = new C2473i(1, CollectionsKt.z(peach));
                                } else {
                                    interfaceC2472h = (InterfaceC2472h) CollectionsKt.k(peach);
                                }
                                al whiskey = kotlin.reflect.jvm.internal.impl.types.c.whiskey(interfaceC2472h);
                                List cyan2 = aeVar.cyan();
                                Iterator it3 = arrayList.iterator();
                                Iterator it4 = cyan2.iterator();
                                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                                collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(cyan2, 10);
                                ArrayList arrayList2 = new ArrayList(Math.min(collectionSizeOrDefault3, collectionSizeOrDefault4));
                                while (it3.hasNext() && it4.hasNext()) {
                                    Object next = it3.next();
                                    as asVar2 = (as) it4.next();
                                    as asVar3 = (as) next;
                                    if (asVar3 != null) {
                                        asVar2 = asVar3;
                                    }
                                    arrayList2.add(asVar2);
                                }
                                if (bool != null) {
                                    indigo = bool.booleanValue();
                                } else {
                                    indigo = aeVar.indigo();
                                }
                                ae charlie = ab.charlie(arrayList2, whiskey, green, indigo);
                                if (fVar.charlie) {
                                    charlie = new h(charlie);
                                }
                                if (bool != null && fVar.delta) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                return new d(charlie, i11, z13);
                            }
                            throw new IllegalStateException("At least one Annotations object expected");
                        }
                        bool = null;
                        if (interfaceC2330f != null) {
                        }
                        green = aeVar.green();
                        Intrinsics.delta(green, "enhancedClassifier?.typeConstructor ?: constructor");
                        i10 = i4 + 1;
                        List cyan3 = aeVar.cyan();
                        List parameters2 = green.getParameters();
                        Intrinsics.delta(parameters2, "typeConstructor.parameters");
                        it = parameters2.iterator();
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(cyan3, 10);
                        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters2, 10);
                        arrayList = new ArrayList(Math.min(collectionSizeOrDefault, collectionSizeOrDefault2));
                        for (Object obj3 : cyan3) {
                            aq aqVar2 = (aq) it.next();
                            as asVar4 = (as) obj3;
                            if (z12) {
                            }
                            i10 += cVar.purple;
                            b2 = (B) cVar.red;
                            if (b2 == null) {
                            }
                            arrayList.add(obj);
                            i13 = 1;
                            i14 = 0;
                            obj2 = null;
                        }
                        i11 = i10 - i4;
                        if (interfaceC2330f == null) {
                            if (!arrayList.isEmpty()) {
                            }
                            return new d(null, i11, false);
                        }
                        C2473i c2473i22 = null;
                        InterfaceC2472h annotations2 = aeVar.getAnnotations();
                        C2473i c2473i32 = x.bravo;
                        if (interfaceC2330f == null) {
                        }
                        C2473i c2473i42 = x.alpha;
                        if (bool != null) {
                        }
                        List peach2 = CollectionsKt.peach(annotations2, c2473i32, c2473i22);
                        size = peach2.size();
                        if (size == 0) {
                        }
                    } else {
                        throw new IllegalArgumentException("Given class " + interfaceC2330f2 + " is not a mutable collection");
                    }
                }
            }
            if (fVar.bravo == g.purple && i5 == 2) {
                InterfaceC2330f interfaceC2330f3 = (InterfaceC2330f) kilo;
                String str2 = C2233d.alpha;
                if (C2233d.kilo.containsKey(Qe.e.golf(interfaceC2330f3))) {
                    interfaceC2330f = C2234e.alpha(interfaceC2330f3);
                    com.google.android.material.datepicker.j.papa(i5, "<this>");
                    if (i5 != 3) {
                    }
                    bool = null;
                    if (interfaceC2330f != null) {
                    }
                    green = aeVar.green();
                    Intrinsics.delta(green, "enhancedClassifier?.typeConstructor ?: constructor");
                    i10 = i4 + 1;
                    List cyan32 = aeVar.cyan();
                    List parameters22 = green.getParameters();
                    Intrinsics.delta(parameters22, "typeConstructor.parameters");
                    it = parameters22.iterator();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(cyan32, 10);
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters22, 10);
                    arrayList = new ArrayList(Math.min(collectionSizeOrDefault, collectionSizeOrDefault2));
                    while (r15.hasNext()) {
                    }
                    i11 = i10 - i4;
                    if (interfaceC2330f == null) {
                    }
                    C2473i c2473i222 = null;
                    InterfaceC2472h annotations22 = aeVar.getAnnotations();
                    C2473i c2473i322 = x.bravo;
                    if (interfaceC2330f == null) {
                    }
                    C2473i c2473i422 = x.alpha;
                    if (bool != null) {
                    }
                    List peach22 = CollectionsKt.peach(annotations22, c2473i322, c2473i222);
                    size = peach22.size();
                    if (size == 0) {
                    }
                }
            }
        }
        interfaceC2330f = null;
        com.google.android.material.datepicker.j.papa(i5, "<this>");
        if (i5 != 3) {
        }
        bool = null;
        if (interfaceC2330f != null) {
        }
        green = aeVar.green();
        Intrinsics.delta(green, "enhancedClassifier?.typeConstructor ?: constructor");
        i10 = i4 + 1;
        List cyan322 = aeVar.cyan();
        List parameters222 = green.getParameters();
        Intrinsics.delta(parameters222, "typeConstructor.parameters");
        it = parameters222.iterator();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(cyan322, 10);
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters222, 10);
        arrayList = new ArrayList(Math.min(collectionSizeOrDefault, collectionSizeOrDefault2));
        while (r15.hasNext()) {
        }
        i11 = i10 - i4;
        if (interfaceC2330f == null) {
        }
        C2473i c2473i2222 = null;
        InterfaceC2472h annotations222 = aeVar.getAnnotations();
        C2473i c2473i3222 = x.bravo;
        if (interfaceC2330f == null) {
        }
        C2473i c2473i4222 = x.alpha;
        if (bool != null) {
        }
        List peach222 = CollectionsKt.peach(annotations222, c2473i3222, c2473i2222);
        size = peach222.size();
        if (size == 0) {
        }
    }

    public static c delta(B b2, ap apVar, int i4, boolean z2) {
        y yVar;
        Object obj = null;
        if (kotlin.reflect.jvm.internal.impl.types.c.india(b2)) {
            return new c((Object) null, 1, 0);
        }
        if (b2 instanceof kotlin.reflect.jvm.internal.impl.types.s) {
            boolean z10 = b2 instanceof De.f;
            kotlin.reflect.jvm.internal.impl.types.s sVar = (kotlin.reflect.jvm.internal.impl.types.s) b2;
            d charlie = charlie(sVar.purple, apVar, i4, 1, z10, z2);
            d charlie2 = charlie(sVar.red, apVar, i4, 2, z10, z2);
            ae aeVar = (ae) charlie2.charlie;
            ae aeVar2 = (ae) charlie.charlie;
            if (aeVar2 != null || aeVar != null) {
                if (!charlie.alpha && !charlie2.alpha) {
                    ae aeVar3 = sVar.red;
                    ae aeVar4 = sVar.purple;
                    ae aeVar5 = aeVar2;
                    if (z10) {
                        ae aeVar6 = aeVar2;
                        if (aeVar2 == null) {
                            aeVar6 = aeVar4;
                        }
                        if (aeVar == null) {
                            aeVar = aeVar3;
                        }
                        obj = new De.f(aeVar6, aeVar);
                    } else {
                        if (aeVar2 == null) {
                            aeVar5 = aeVar4;
                        }
                        if (aeVar == null) {
                            aeVar = aeVar3;
                        }
                        obj = ab.alpha(aeVar5, aeVar);
                    }
                } else {
                    if (aeVar != null) {
                        if (aeVar2 == null) {
                            aeVar2 = aeVar;
                        }
                        yVar = ab.alpha(aeVar2, aeVar);
                    } else {
                        Intrinsics.checkNotNull(aeVar2);
                        yVar = aeVar2;
                    }
                    obj = kotlin.reflect.jvm.internal.impl.types.c.amber(b2, yVar);
                }
            }
            return new c(obj, charlie.bravo, 0);
        }
        if (b2 instanceof ae) {
            d charlie3 = charlie((ae) b2, apVar, i4, 3, false, z2);
            boolean z11 = charlie3.alpha;
            y yVar2 = (ae) charlie3.charlie;
            if (z11) {
                yVar2 = kotlin.reflect.jvm.internal.impl.types.c.amber(b2, yVar2);
            }
            return new c(yVar2, charlie3.bravo, 0);
        }
        throw new NoWhenBranchMatchedException();
    }

    public y alpha(Ae.a aVar, InterfaceC2326b interfaceC2326b, boolean z2, B9.ab abVar, EnumC3424b enumC3424b, v vVar, boolean z10, Function1 function1) {
        int collectionSizeOrDefault;
        u uVar = new u((InterfaceC2336l) interfaceC2326b, z2, abVar, enumC3424b, false);
        y yVar = (y) function1.invoke(aVar);
        Collection overriddenDescriptors = aVar.mike();
        Intrinsics.delta(overriddenDescriptors, "overriddenDescriptors");
        Collection<InterfaceC2328d> collection = overriddenDescriptors;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (InterfaceC2328d it : collection) {
            Intrinsics.delta(it, "it");
            arrayList.add((y) function1.invoke(it));
        }
        return bravo(uVar, yVar, arrayList, vVar, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x024b, code lost:
    
        if (r7.compareTo(r11) <= 0) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y bravo(u uVar, y yVar, List overrides, v vVar, boolean z2) {
        int collectionSizeOrDefault;
        int size;
        aq aqVar;
        boolean z10;
        Iterable emptyList;
        aq aqVar2;
        ArrayList arrayList;
        boolean z11;
        boolean z12;
        boolean z13;
        Iterable emptyList2;
        EnumC3424b enumC3424b;
        B9.ab abVar;
        aq aqVar3;
        EnumC3424b enumC3424b2;
        ye.r rVar;
        j jVar;
        j jVar2;
        i iVar;
        boolean z14;
        j jVar3;
        i iVar2;
        boolean z15;
        f fVar;
        boolean z16;
        C3426d c3426d;
        g gVar;
        kotlin.reflect.jvm.internal.impl.types.ap maroon;
        Iterator it;
        int i4;
        boolean z17;
        boolean z18;
        Iterator it2;
        boolean z19;
        i iVar3;
        i iVar4;
        Iterator it3;
        i iVar5;
        boolean z20;
        boolean z21;
        i iVar6;
        Iterator it4;
        int i5;
        f fVar2;
        p000if.c cVar;
        i iVar7;
        g gVar2;
        boolean z22;
        boolean z23;
        int i10;
        Intrinsics.echo(yVar, "<this>");
        Intrinsics.echo(overrides, "overrides");
        ArrayList echo = uVar.echo(yVar);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(overrides, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it5 = overrides.iterator();
        while (it5.hasNext()) {
            arrayList2.add(uVar.echo((p000if.c) it5.next()));
        }
        B9.ab abVar2 = (B9.ab) uVar.delta;
        boolean z24 = uVar.alpha;
        if (z24 && !overrides.isEmpty()) {
            Iterator it6 = overrides.iterator();
            while (it6.hasNext()) {
                p000if.c other = (p000if.c) it6.next();
                Intrinsics.echo(other, "other");
                if (!((Be.a) abVar2.purple).uniform.alpha(yVar, (y) other)) {
                    size = 1;
                    break;
                }
            }
        }
        size = echo.size();
        f[] fVarArr = new f[size];
        int i11 = 0;
        while (i11 < size) {
            a aVar = (a) echo.get(i11);
            p000if.c cVar2 = aVar.alpha;
            i iVar8 = i.purple;
            i iVar9 = i.red;
            gf.m mVar = gf.m.alpha;
            g gVar3 = g.purple;
            g gVar4 = g.alpha;
            i iVar10 = i.alpha;
            ArrayList arrayList3 = echo;
            InterfaceC2336l interfaceC2336l = (InterfaceC2336l) uVar.charlie;
            int i12 = size;
            aq aqVar4 = aVar.charlie;
            if (cVar2 == null) {
                if (aqVar4 != null) {
                    int fuchsia = aqVar4.fuchsia();
                    aqVar = aqVar4;
                    com.google.android.material.datepicker.j.sierra(fuchsia, "this.variance");
                    i10 = AbstractC2777t5.alpha(fuchsia);
                } else {
                    aqVar = aqVar4;
                    i10 = 0;
                }
                if (i10 == 1) {
                    fVar = f.echo;
                    arrayList = arrayList2;
                    abVar = abVar2;
                    z11 = z24;
                    ArrayList arrayList4 = new ArrayList();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        a aVar2 = (a) CollectionsKt.jade(i11, (List) it.next());
                        if (aVar2 != null && (cVar = aVar2.alpha) != null) {
                            i delta = u.delta(cVar);
                            if (delta == null) {
                                y echo2 = kotlin.reflect.jvm.internal.impl.types.c.echo((y) cVar);
                                if (echo2 != null) {
                                    iVar7 = u.delta(echo2);
                                } else {
                                    iVar7 = null;
                                }
                            } else {
                                iVar7 = delta;
                            }
                            String str = C2233d.alpha;
                            it4 = it;
                            i5 = i11;
                            if (C2233d.kilo.containsKey(u.charlie(mVar.lime(cVar)))) {
                                gVar2 = gVar4;
                            } else if (C2233d.juliet.containsKey(u.charlie(mVar.blue(cVar)))) {
                                gVar2 = gVar3;
                            } else {
                                gVar2 = null;
                            }
                            if (!mVar.v(cVar) && !(((y) cVar).ochre() instanceof h)) {
                                z22 = false;
                            } else {
                                z22 = true;
                            }
                            if (iVar7 != delta) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            fVar2 = new f(iVar7, gVar2, z22, z23);
                        } else {
                            it4 = it;
                            i5 = i11;
                            fVar2 = null;
                        }
                        if (fVar2 != null) {
                            arrayList4.add(fVar2);
                        }
                        i11 = i5;
                        it = it4;
                    }
                    i4 = i11;
                    if (i4 != 0 && z11) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i4 != 0 && (interfaceC2336l instanceof se.aq) && ((se.aq) interfaceC2336l).f13747c != null) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        f fVar3 = (f) it2.next();
                        if (fVar3.delta) {
                            iVar6 = null;
                        } else {
                            iVar6 = fVar3.alpha;
                        }
                        if (iVar6 != null) {
                            arrayList5.add(iVar6);
                        }
                    }
                    Set D10 = CollectionsKt.D(arrayList5);
                    z19 = fVar.delta;
                    i iVar11 = fVar.alpha;
                    if (!z19) {
                        iVar3 = null;
                    } else {
                        iVar3 = iVar11;
                    }
                    if (iVar3 != iVar10) {
                        iVar4 = iVar10;
                    } else {
                        iVar4 = (i) S4.bravo(D10, iVar9, iVar8, iVar3, z17);
                    }
                    if (iVar4 != null) {
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it7 = arrayList4.iterator();
                        while (it7.hasNext()) {
                            i iVar12 = ((f) it7.next()).alpha;
                            if (iVar12 != null) {
                                arrayList6.add(iVar12);
                            }
                        }
                        Set D11 = CollectionsKt.D(arrayList6);
                        if (iVar11 != iVar10) {
                            iVar10 = (i) S4.bravo(D11, iVar9, iVar8, iVar11, z17);
                        }
                    } else {
                        iVar10 = iVar4;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        g gVar5 = ((f) it3.next()).bravo;
                        if (gVar5 != null) {
                            arrayList7.add(gVar5);
                        }
                    }
                    g gVar6 = (g) S4.bravo(CollectionsKt.D(arrayList7), gVar3, gVar4, fVar.bravo, z17);
                    if (iVar10 == null && !z2 && (!z18 || iVar10 != iVar8)) {
                        iVar5 = iVar10;
                    } else {
                        iVar5 = null;
                    }
                    if (iVar5 == iVar9) {
                        if (!fVar.charlie) {
                            if (!arrayList4.isEmpty()) {
                                Iterator it8 = arrayList4.iterator();
                                while (it8.hasNext()) {
                                    if (((f) it8.next()).charlie) {
                                    }
                                }
                            }
                        }
                        z20 = true;
                        if (iVar5 == null && iVar4 != iVar10) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        fVarArr[i4] = new f(iVar5, gVar6, z20, z21);
                        i11 = i4 + 1;
                        echo = arrayList3;
                        size = i12;
                        arrayList2 = arrayList;
                        z24 = z11;
                        abVar2 = abVar;
                    }
                    z20 = false;
                    if (iVar5 == null) {
                    }
                    z21 = false;
                    fVarArr[i4] = new f(iVar5, gVar6, z20, z21);
                    i11 = i4 + 1;
                    echo = arrayList3;
                    size = i12;
                    arrayList2 = arrayList;
                    z24 = z11;
                    abVar2 = abVar;
                }
            } else {
                aqVar = aqVar4;
            }
            if (aqVar == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            p000if.c cVar3 = aVar.alpha;
            if (cVar3 != null) {
                emptyList = ((y) cVar3).getAnnotations();
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            boolean z25 = z10;
            Iterable annotations = emptyList;
            if (cVar3 != null && (maroon = mVar.maroon(cVar3)) != null) {
                aqVar2 = AbstractC1792g.sierra(maroon);
            } else {
                aqVar2 = null;
            }
            arrayList = arrayList2;
            EnumC3424b enumC3424b3 = EnumC3424b.TYPE_PARAMETER_BOUNDS;
            z11 = z24;
            EnumC3424b enumC3424b4 = (EnumC3424b) uVar.echo;
            if (enumC3424b4 == enumC3424b3) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z25) {
                z13 = z12;
            } else {
                z13 = z12;
                if (!z12) {
                    ((Be.a) abVar2.purple).tango.getClass();
                }
                if (interfaceC2336l == null || (emptyList2 = interfaceC2336l.getAnnotations()) == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
                annotations = CollectionsKt.yellow(emptyList2, annotations);
            }
            ((Be.a) abVar2.purple).quebec.getClass();
            Intrinsics.echo(annotations, "annotations");
            Iterator it9 = annotations.iterator();
            Iterable iterable = annotations;
            g gVar7 = null;
            while (true) {
                if (it9.hasNext()) {
                    Iterator it10 = it9;
                    Ne.c echo3 = C3426d.echo(it9.next());
                    enumC3424b = enumC3424b4;
                    if (ac.oscar.contains(echo3)) {
                        gVar = gVar4;
                    } else if (ac.papa.contains(echo3)) {
                        gVar = gVar3;
                    } else {
                        continue;
                        enumC3424b4 = enumC3424b;
                        it9 = it10;
                    }
                    if (gVar7 != null && gVar7 != gVar) {
                        gVar7 = null;
                        break;
                    }
                    gVar7 = gVar;
                    enumC3424b4 = enumC3424b;
                    it9 = it10;
                } else {
                    enumC3424b = enumC3424b4;
                    break;
                }
            }
            Be.a aVar3 = (Be.a) abVar2.purple;
            abVar = abVar2;
            ap apVar = new ap(11, uVar, aVar);
            C3426d c3426d2 = aVar3.quebec;
            c3426d2.getClass();
            Iterator it11 = iterable.iterator();
            j jVar4 = null;
            while (it11.hasNext()) {
                aqVar3 = aqVar2;
                j charlie = c3426d2.charlie(it11.next(), apVar);
                if (jVar4 == null) {
                    c3426d = c3426d2;
                } else {
                    if (charlie == null || Intrinsics.areEqual(charlie, jVar4)) {
                        c3426d = c3426d2;
                    } else {
                        c3426d = c3426d2;
                        boolean z26 = jVar4.bravo;
                        boolean z27 = charlie.bravo;
                        if (!z27 || z26) {
                            if (z27 || !z26) {
                                jVar4 = null;
                                break;
                            }
                        }
                    }
                    aqVar2 = aqVar3;
                    c3426d2 = c3426d;
                }
                jVar4 = charlie;
                aqVar2 = aqVar3;
                c3426d2 = c3426d;
            }
            aqVar3 = aqVar2;
            if (jVar4 != null) {
                i iVar13 = jVar4.alpha;
                if (iVar13 == iVar9 && aqVar3 != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                fVar = new f(iVar13, gVar7, z16, jVar4.bravo);
            } else {
                if (!z25 && !z13) {
                    enumC3424b2 = EnumC3424b.TYPE_USE;
                } else {
                    enumC3424b2 = enumC3424b;
                }
                ye.y yVar2 = aVar.bravo;
                if (yVar2 != null) {
                    rVar = (ye.r) yVar2.alpha.get(enumC3424b2);
                } else {
                    rVar = null;
                }
                if (aqVar3 != null) {
                    jVar = u.bravo(aqVar3);
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    jVar2 = j.alpha(jVar, iVar9, false, 2);
                } else if (rVar != null) {
                    jVar2 = rVar.alpha;
                } else {
                    jVar2 = null;
                }
                if (jVar != null) {
                    iVar = jVar.alpha;
                } else {
                    iVar = null;
                }
                if (iVar != iVar9 && (aqVar3 == null || rVar == null || !rVar.charlie)) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (aqVar != null && (jVar3 = u.bravo(aqVar)) != null) {
                    if (jVar3.alpha == iVar8) {
                        jVar3 = j.alpha(jVar3, iVar10, false, 2);
                    }
                } else {
                    jVar3 = null;
                }
                if (jVar3 != null) {
                    if (jVar2 != null) {
                        boolean z28 = jVar2.bravo;
                        boolean z29 = jVar3.bravo;
                        if (!z29 || z28) {
                            if (z29 || !z28) {
                                i iVar14 = jVar3.alpha;
                                i iVar15 = jVar2.alpha;
                                if (iVar14.compareTo(iVar15) >= 0) {
                                }
                            }
                        }
                    }
                    jVar2 = jVar3;
                }
                if (jVar2 != null) {
                    iVar2 = jVar2.alpha;
                } else {
                    iVar2 = null;
                }
                if (jVar2 != null && jVar2.bravo) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                fVar = new f(iVar2, gVar7, z14, z15);
            }
            ArrayList arrayList42 = new ArrayList();
            it = arrayList.iterator();
            while (it.hasNext()) {
            }
            i4 = i11;
            if (i4 != 0) {
            }
            z17 = false;
            if (i4 != 0) {
            }
            z18 = false;
            ArrayList arrayList52 = new ArrayList();
            it2 = arrayList42.iterator();
            while (it2.hasNext()) {
            }
            Set D102 = CollectionsKt.D(arrayList52);
            z19 = fVar.delta;
            i iVar112 = fVar.alpha;
            if (!z19) {
            }
            if (iVar3 != iVar10) {
            }
            if (iVar4 != null) {
            }
            ArrayList arrayList72 = new ArrayList();
            it3 = arrayList42.iterator();
            while (it3.hasNext()) {
            }
            g gVar62 = (g) S4.bravo(CollectionsKt.D(arrayList72), gVar3, gVar4, fVar.bravo, z17);
            if (iVar10 == null) {
            }
            iVar5 = null;
            if (iVar5 == iVar9) {
            }
            z20 = false;
            if (iVar5 == null) {
            }
            z21 = false;
            fVarArr[i4] = new f(iVar5, gVar62, z20, z21);
            i11 = i4 + 1;
            echo = arrayList3;
            size = i12;
            arrayList2 = arrayList;
            z24 = z11;
            abVar2 = abVar;
        }
        return (B) delta(yVar.ochre(), new ap(10, vVar, fVarArr), 0, uVar.bravo).red;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fc A[EDGE_INSN: B:124:0x02fc->B:125:0x02fc BREAK  A[LOOP:3: B:113:0x02cc->B:122:0x02f8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0293  */
    /* JADX WARN: Type inference failed for: r23v0, types: [Fe.e] */
    /* JADX WARN: Type inference failed for: r3v3, types: [pe.k, pe.b, pe.d] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [Ae.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList echo(B9.ab c3, Collection platformSignatures) {
        int collectionSizeOrDefault;
        Ce.j jVar;
        List list;
        InterfaceC2472h annotations;
        int collectionSizeOrDefault2;
        ai aiVar;
        y yVar;
        Ae.f fVar;
        n nVar;
        int i4;
        boolean z2;
        int collectionSizeOrDefault3;
        pe.al alVar;
        EnumC3424b enumC3424b;
        v vVar;
        y alpha;
        y returnType;
        o oVar;
        y yVar2;
        boolean z10;
        Pair pair;
        y yVar3;
        ArrayList arrayList;
        int collectionSizeOrDefault4;
        Iterator it;
        boolean z11;
        boolean z12;
        boolean z13;
        v vVar2;
        B9.ab abVar;
        ai aiVar2;
        se.aq aqVar;
        B9.ab abVar2;
        ai aiVar3;
        Intrinsics.echo(c3, "c");
        Intrinsics.echo(platformSignatures, "platformSignatures");
        Collection<??> collection = platformSignatures;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (?? r32 : collection) {
            if (r32 instanceof Ae.a) {
                Ae.a aVar = (Ae.a) r32;
                boolean z14 = true;
                if (aVar.november() != 2 || aVar.alpha().mike().size() != 1) {
                    InterfaceC2332h golf = AbstractC2347w.golf(r32);
                    if (golf == null) {
                        annotations = ((G3.a) r32).getAnnotations();
                    } else {
                        if (golf instanceof Ce.j) {
                            jVar = (Ce.j) golf;
                        } else {
                            jVar = null;
                        }
                        if (jVar != null) {
                            list = (List) jVar.f910d.getValue();
                        } else {
                            list = null;
                        }
                        if (list != null && !list.isEmpty()) {
                            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(new Ce.f(c3, (C3193e) it2.next(), true));
                            }
                            ArrayList yellow = CollectionsKt.yellow(((G3.a) r32).getAnnotations(), arrayList3);
                            if (yellow.isEmpty()) {
                                annotations = C2471g.alpha;
                            } else {
                                annotations = new C2473i(0, yellow);
                            }
                        } else {
                            annotations = ((G3.a) r32).getAnnotations();
                        }
                    }
                    B9.ab bravo = AbstractC2826z0.bravo(c3, annotations);
                    if ((r32 instanceof Ae.g) && (aiVar3 = ((Ae.g) r32).f13732p) != null && !aiVar3.teal) {
                        Intrinsics.checkNotNull(aiVar3);
                        aiVar = aiVar3;
                    } else {
                        aiVar = r32;
                    }
                    C2871u g2 = aVar.g();
                    EnumC3424b enumC3424b2 = EnumC3424b.VALUE_PARAMETER;
                    if (g2 != null) {
                        if (aiVar instanceof InterfaceC2345u) {
                            aiVar2 = aiVar;
                        } else {
                            aiVar2 = null;
                        }
                        if (aiVar2 != null) {
                            aqVar = (se.aq) aiVar2.orange(Ae.f.f59y);
                        } else {
                            aqVar = null;
                        }
                        p pVar = p.alpha;
                        Ae.a aVar2 = (Ae.a) r32;
                        if (aqVar != null) {
                            abVar2 = AbstractC2826z0.bravo(bravo, aqVar.getAnnotations());
                        } else {
                            abVar2 = bravo;
                        }
                        yVar = alpha(aVar2, aqVar, false, abVar2, enumC3424b2, null, false, pVar);
                    } else {
                        yVar = null;
                    }
                    if (r32 instanceof Ae.f) {
                        fVar = (Ae.f) r32;
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        InterfaceC2335k lima = fVar.lima();
                        Intrinsics.charlie(lima, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String foxtrot = AbstractC2643e5.foxtrot((InterfaceC2330f) lima, AbstractC2661g5.delta(fVar, 3));
                        if (foxtrot != null) {
                            nVar = (n) m.delta.get(foxtrot);
                            if (nVar != null) {
                                nVar.bravo.size();
                                aVar.peach().size();
                            }
                            ye.x javaTypeEnhancementState = ((Be.a) c3.purple).victor;
                            Intrinsics.echo(javaTypeEnhancementState, "javaTypeEnhancementState");
                            i4 = 0;
                            if (ye.w.alpha.invoke(ye.u.alpha) != af.STRICT) {
                                if ((r32 instanceof InterfaceC2345u) && Intrinsics.areEqual(r32.orange(Ae.f.f60z), Boolean.TRUE)) {
                                    z2 = true;
                                    List<se.aq> peach = aiVar.peach();
                                    Intrinsics.delta(peach, "annotationOwnerForMember.valueParameters");
                                    collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(peach, 10);
                                    ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault3);
                                    for (se.aq aqVar2 : peach) {
                                        if (nVar != null) {
                                            vVar2 = (v) CollectionsKt.jade(aqVar2.white, nVar.bravo);
                                        } else {
                                            vVar2 = null;
                                        }
                                        A0.p pVar2 = new A0.p(13, aqVar2);
                                        Ae.a aVar3 = (Ae.a) r32;
                                        if (aqVar2 != null) {
                                            abVar = AbstractC2826z0.bravo(bravo, aqVar2.getAnnotations());
                                        } else {
                                            abVar = bravo;
                                        }
                                        arrayList4.add(alpha(aVar3, aqVar2, false, abVar, enumC3424b2, vVar2, z2, pVar2));
                                    }
                                    if (r32 instanceof pe.al) {
                                        alVar = (pe.al) r32;
                                    } else {
                                        alVar = null;
                                    }
                                    if (alVar == null && F0.bravo(alVar)) {
                                        enumC3424b = EnumC3424b.FIELD;
                                    } else {
                                        enumC3424b = EnumC3424b.METHOD_RETURN_TYPE;
                                    }
                                    EnumC3424b enumC3424b3 = enumC3424b;
                                    if (nVar != null) {
                                        vVar = nVar.alpha;
                                    } else {
                                        vVar = null;
                                    }
                                    alpha = alpha((Ae.a) r32, aiVar, true, bravo, enumC3424b3, vVar, false, q.alpha);
                                    returnType = aVar.getReturnType();
                                    Intrinsics.checkNotNull(returnType);
                                    oVar = o.alpha;
                                    if (!az.charlie(returnType, oVar)) {
                                        C2871u g5 = aVar.g();
                                        if (g5 != null) {
                                            yVar2 = null;
                                            z12 = az.delta(g5.getType(), oVar, null);
                                        } else {
                                            yVar2 = null;
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            List valueParameters = aVar.peach();
                                            Intrinsics.delta(valueParameters, "valueParameters");
                                            if (!valueParameters.isEmpty()) {
                                                Iterator it3 = valueParameters.iterator();
                                                while (it3.hasNext()) {
                                                    y type = ((se.aq) it3.next()).getType();
                                                    Intrinsics.delta(type, "it.type");
                                                    if (az.charlie(type, o.alpha)) {
                                                        z13 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            z13 = false;
                                            if (!z13) {
                                                z10 = false;
                                                if (!z10) {
                                                    pair = new Pair(Te.a.alpha, new Object());
                                                } else {
                                                    pair = yVar2;
                                                }
                                                if (yVar == null && alpha == null) {
                                                    if (!arrayList4.isEmpty()) {
                                                        Iterator it4 = arrayList4.iterator();
                                                        while (it4.hasNext()) {
                                                            if (((y) it4.next()) != null) {
                                                                z11 = true;
                                                            } else {
                                                                z11 = false;
                                                            }
                                                            if (z11) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    z14 = false;
                                                    if (!z14 && pair == null) {
                                                    }
                                                }
                                                if (yVar != null) {
                                                    C2871u g10 = aVar.g();
                                                    if (g10 != null) {
                                                        yVar3 = g10.getType();
                                                    } else {
                                                        yVar3 = yVar2;
                                                    }
                                                } else {
                                                    yVar3 = yVar;
                                                }
                                                collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
                                                arrayList = new ArrayList(collectionSizeOrDefault4);
                                                it = arrayList4.iterator();
                                                while (true) {
                                                    int i5 = i4;
                                                    if (it.hasNext()) {
                                                        break;
                                                    }
                                                    Object next = it.next();
                                                    i4 = i5 + 1;
                                                    if (i5 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    y yVar4 = (y) next;
                                                    if (yVar4 == null) {
                                                        yVar4 = ((se.aq) aVar.peach().get(i5)).getType();
                                                        Intrinsics.delta(yVar4, "valueParameters[index].type");
                                                    }
                                                    arrayList.add(yVar4);
                                                }
                                                if (alpha == null) {
                                                    alpha = aVar.getReturnType();
                                                    Intrinsics.checkNotNull(alpha);
                                                }
                                                r32 = aVar.i(yVar3, arrayList, alpha, pair);
                                            }
                                        }
                                    } else {
                                        yVar2 = null;
                                    }
                                    z10 = true;
                                    if (!z10) {
                                    }
                                    if (yVar == null) {
                                        if (!arrayList4.isEmpty()) {
                                        }
                                        z14 = false;
                                        if (!z14) {
                                        }
                                    }
                                    if (yVar != null) {
                                    }
                                    collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
                                    arrayList = new ArrayList(collectionSizeOrDefault4);
                                    it = arrayList4.iterator();
                                    while (true) {
                                        int i52 = i4;
                                        if (it.hasNext()) {
                                        }
                                        arrayList.add(yVar4);
                                    }
                                    if (alpha == null) {
                                    }
                                    r32 = aVar.i(yVar3, arrayList, alpha, pair);
                                }
                            } else {
                                ((Be.a) bravo.purple).tango.getClass();
                            }
                            z2 = false;
                            List<se.aq> peach2 = aiVar.peach();
                            Intrinsics.delta(peach2, "annotationOwnerForMember.valueParameters");
                            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(peach2, 10);
                            ArrayList arrayList42 = new ArrayList(collectionSizeOrDefault3);
                            while (r9.hasNext()) {
                            }
                            if (r32 instanceof pe.al) {
                            }
                            if (alVar == null) {
                            }
                            enumC3424b = EnumC3424b.METHOD_RETURN_TYPE;
                            EnumC3424b enumC3424b32 = enumC3424b;
                            if (nVar != null) {
                            }
                            alpha = alpha((Ae.a) r32, aiVar, true, bravo, enumC3424b32, vVar, false, q.alpha);
                            returnType = aVar.getReturnType();
                            Intrinsics.checkNotNull(returnType);
                            oVar = o.alpha;
                            if (!az.charlie(returnType, oVar)) {
                            }
                            z10 = true;
                            if (!z10) {
                            }
                            if (yVar == null) {
                            }
                            if (yVar != null) {
                            }
                            collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList42, 10);
                            arrayList = new ArrayList(collectionSizeOrDefault4);
                            it = arrayList42.iterator();
                            while (true) {
                                int i522 = i4;
                                if (it.hasNext()) {
                                }
                                arrayList.add(yVar4);
                            }
                            if (alpha == null) {
                            }
                            r32 = aVar.i(yVar3, arrayList, alpha, pair);
                        }
                    }
                    nVar = null;
                    if (nVar != null) {
                    }
                    ye.x javaTypeEnhancementState2 = ((Be.a) c3.purple).victor;
                    Intrinsics.echo(javaTypeEnhancementState2, "javaTypeEnhancementState");
                    i4 = 0;
                    if (ye.w.alpha.invoke(ye.u.alpha) != af.STRICT) {
                    }
                    z2 = false;
                    List<se.aq> peach22 = aiVar.peach();
                    Intrinsics.delta(peach22, "annotationOwnerForMember.valueParameters");
                    collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(peach22, 10);
                    ArrayList arrayList422 = new ArrayList(collectionSizeOrDefault3);
                    while (r9.hasNext()) {
                    }
                    if (r32 instanceof pe.al) {
                    }
                    if (alVar == null) {
                    }
                    enumC3424b = EnumC3424b.METHOD_RETURN_TYPE;
                    EnumC3424b enumC3424b322 = enumC3424b;
                    if (nVar != null) {
                    }
                    alpha = alpha((Ae.a) r32, aiVar, true, bravo, enumC3424b322, vVar, false, q.alpha);
                    returnType = aVar.getReturnType();
                    Intrinsics.checkNotNull(returnType);
                    oVar = o.alpha;
                    if (!az.charlie(returnType, oVar)) {
                    }
                    z10 = true;
                    if (!z10) {
                    }
                    if (yVar == null) {
                    }
                    if (yVar != null) {
                    }
                    collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList422, 10);
                    arrayList = new ArrayList(collectionSizeOrDefault4);
                    it = arrayList422.iterator();
                    while (true) {
                        int i5222 = i4;
                        if (it.hasNext()) {
                        }
                        arrayList.add(yVar4);
                    }
                    if (alpha == null) {
                    }
                    r32 = aVar.i(yVar3, arrayList, alpha, pair);
                }
            }
            arrayList2.add(r32);
        }
        return arrayList2;
    }
}
