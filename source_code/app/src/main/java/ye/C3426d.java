package ye;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2330f;
import qe.InterfaceC2466b;
import qe.InterfaceC2472h;

/* renamed from: ye.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3426d {
    public static final LinkedHashMap charlie;
    public final x alpha;
    public final ConcurrentHashMap bravo;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC3424b enumC3424b : EnumC3424b.values()) {
            String str = enumC3424b.alpha;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, enumC3424b);
            }
        }
        charlie = linkedHashMap;
    }

    public C3426d(x javaTypeEnhancementState) {
        Intrinsics.echo(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.alpha = javaTypeEnhancementState;
        this.bravo = new ConcurrentHashMap();
    }

    public static ArrayList alpha(Object obj, boolean z2) {
        List kilo;
        InterfaceC2466b interfaceC2466b = (InterfaceC2466b) obj;
        Intrinsics.echo(interfaceC2466b, "<this>");
        Map bravo = interfaceC2466b.bravo();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : bravo.entrySet()) {
            Ne.f fVar = (Ne.f) entry.getKey();
            Se.g gVar = (Se.g) entry.getValue();
            if (z2 && !Intrinsics.areEqual(fVar, ab.bravo)) {
                kilo = CollectionsKt.emptyList();
            } else {
                kilo = kilo(gVar);
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, kilo);
        }
        return arrayList;
    }

    public static Object delta(Object obj, Ne.c cVar) {
        for (Object obj2 : foxtrot(obj)) {
            if (Intrinsics.areEqual(echo(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    public static Ne.c echo(Object obj) {
        InterfaceC2466b interfaceC2466b = (InterfaceC2466b) obj;
        Intrinsics.echo(interfaceC2466b, "<this>");
        return interfaceC2466b.alpha();
    }

    public static Iterable foxtrot(Object obj) {
        InterfaceC2472h annotations;
        InterfaceC2466b interfaceC2466b = (InterfaceC2466b) obj;
        Intrinsics.echo(interfaceC2466b, "<this>");
        InterfaceC2330f delta = Ue.e.delta(interfaceC2466b);
        if (delta != null && (annotations = delta.getAnnotations()) != null) {
            return annotations;
        }
        return CollectionsKt.emptyList();
    }

    public static boolean golf(Object obj, Ne.c cVar) {
        Iterable foxtrot = foxtrot(obj);
        if (!(foxtrot instanceof Collection) || !((Collection) foxtrot).isEmpty()) {
            Iterator it = foxtrot.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(echo(it.next()), cVar)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static List kilo(Se.g gVar) {
        if (gVar instanceof Se.b) {
            Iterable iterable = (Iterable) ((Se.b) gVar).alpha;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, kilo((Se.g) it.next()));
            }
            return arrayList;
        }
        if (gVar instanceof Se.i) {
            return kotlin.collections.ab.juliet(((Se.i) gVar).charlie.charlie());
        }
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fa  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y bravo(y yVar, InterfaceC2472h annotations) {
        boolean z2;
        EnumMap enumMap;
        r rVar;
        af india;
        boolean z10;
        r rVar2;
        Object delta;
        Object obj;
        Pair pair;
        Fe.j charlie2;
        Intrinsics.echo(annotations, "annotations");
        x xVar = this.alpha;
        if (!xVar.bravo) {
            ArrayList arrayList = new ArrayList();
            Iterator it = annotations.iterator();
            while (true) {
                z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                af afVar = af.WARN;
                af afVar2 = af.IGNORE;
                r rVar3 = null;
                if (!xVar.bravo && (rVar = (r) AbstractC3425c.foxtrot.get(echo(next))) != null) {
                    Ne.c echo = echo(next);
                    if (echo != null && AbstractC3425c.echo.containsKey(echo)) {
                        india = (af) w.alpha.invoke(echo);
                    } else {
                        india = india(next);
                        if (india == null) {
                            india = xVar.alpha.alpha;
                        }
                    }
                    if (india == afVar2) {
                        india = null;
                    }
                    if (india != null) {
                        if (india == afVar) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Fe.j alpha = Fe.j.alpha(rVar.alpha, null, z10, 1);
                        Collection qualifierApplicabilityTypes = rVar.bravo;
                        Intrinsics.echo(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
                        rVar2 = new r(alpha, qualifierApplicabilityTypes, rVar.charlie);
                        if (rVar2 == null) {
                            rVar3 = rVar2;
                        } else {
                            if (!xVar.alpha.echo && (delta = delta(next, AbstractC3425c.charlie)) != null) {
                                Iterator it2 = foxtrot(next).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = it2.next();
                                        if (juliet(obj) != null) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                if (obj != null) {
                                    ArrayList alpha2 = alpha(delta, true);
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    Iterator it3 = alpha2.iterator();
                                    while (it3.hasNext()) {
                                        EnumC3424b enumC3424b = (EnumC3424b) charlie.get((String) it3.next());
                                        if (enumC3424b != null) {
                                            linkedHashSet.add(enumC3424b);
                                        }
                                    }
                                    if (linkedHashSet.contains(EnumC3424b.TYPE_USE)) {
                                        linkedHashSet = kotlin.collections.ab.mike(kotlin.collections.ab.kilo(ArraysKt.g(EnumC3424b.values()), EnumC3424b.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                                    }
                                    pair = new Pair(obj, linkedHashSet);
                                    if (pair != null) {
                                        Set set = (Set) pair.second;
                                        af india2 = india(next);
                                        Object obj2 = pair.first;
                                        if (india2 == null && (india2 = india(obj2)) == null) {
                                            india2 = xVar.alpha.alpha;
                                        }
                                        if (india2 != afVar2 && (charlie2 = charlie(obj2, C3423a.alpha)) != null) {
                                            if (india2 == afVar) {
                                                z2 = true;
                                            }
                                            rVar3 = new r(Fe.j.alpha(charlie2, null, z2, 1), set);
                                        }
                                    }
                                }
                            }
                            pair = null;
                            if (pair != null) {
                            }
                        }
                        if (rVar3 == null) {
                            arrayList.add(rVar3);
                        }
                    }
                }
                rVar2 = null;
                if (rVar2 == null) {
                }
                if (rVar3 == null) {
                }
            }
            if (!arrayList.isEmpty()) {
                if (yVar != null) {
                    enumMap = new EnumMap(yVar.alpha);
                } else {
                    enumMap = new EnumMap(EnumC3424b.class);
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    r rVar4 = (r) it4.next();
                    Iterator it5 = rVar4.bravo.iterator();
                    while (it5.hasNext()) {
                        enumMap.put((EnumMap) it5.next(), (EnumC3424b) rVar4);
                        z2 = true;
                    }
                }
                if (z2) {
                    return new y(enumMap);
                }
            }
        }
        return yVar;
    }

    public final Fe.j charlie(Object obj, Function1 function1) {
        Fe.j hotel;
        boolean z2;
        Fe.j hotel2 = hotel(obj, ((Boolean) function1.invoke(obj)).booleanValue());
        if (hotel2 != null) {
            return hotel2;
        }
        Object juliet = juliet(obj);
        if (juliet != null) {
            af india = india(obj);
            if (india == null) {
                india = this.alpha.alpha.alpha;
            }
            if (india != af.IGNORE && (hotel = hotel(juliet, ((Boolean) function1.invoke(juliet)).booleanValue())) != null) {
                if (india == af.WARN) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Fe.j.alpha(hotel, null, z2, 1);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (r10.equals("ALWAYS") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r10.equals("UNKNOWN") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r10.equals("NEVER") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (r10.equals("MAYBE") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, ye.ac.mike) != false) goto L57;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x007c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Fe.j hotel(Object obj, boolean z2) {
        boolean z10;
        boolean areEqual;
        boolean areEqual2;
        Ne.c echo = echo(obj);
        if (echo != null) {
            this.alpha.getClass();
            af afVar = (af) w.alpha.invoke(echo);
            afVar.getClass();
            if (afVar == af.IGNORE) {
                return null;
            }
            boolean contains = ac.golf.contains(echo);
            Fe.i iVar = Fe.i.purple;
            boolean z11 = true;
            if (!contains) {
                boolean contains2 = ac.juliet.contains(echo);
                Fe.i iVar2 = Fe.i.red;
                if (!contains2) {
                    if (Intrinsics.areEqual(echo, ac.alpha)) {
                        areEqual = true;
                    } else {
                        areEqual = Intrinsics.areEqual(echo, ac.delta);
                    }
                    if (!areEqual) {
                        if (Intrinsics.areEqual(echo, ac.bravo)) {
                            areEqual2 = true;
                        } else {
                            areEqual2 = Intrinsics.areEqual(echo, ac.echo);
                        }
                        Fe.i iVar3 = Fe.i.alpha;
                        if (!areEqual2) {
                            if (Intrinsics.areEqual(echo, ac.hotel)) {
                                String str = (String) CollectionsKt.gray(alpha(obj, false));
                                if (str != null) {
                                    switch (str.hashCode()) {
                                        case 73135176:
                                            break;
                                        case 74175084:
                                            break;
                                        case 433141802:
                                            break;
                                        case 1933739535:
                                            break;
                                    }
                                }
                            } else if (!Intrinsics.areEqual(echo, ac.kilo)) {
                                if (!Intrinsics.areEqual(echo, ac.lima) && !Intrinsics.areEqual(echo, ac.november)) {
                                }
                            }
                        }
                        iVar = iVar3;
                    }
                }
                iVar = iVar2;
            }
            if (afVar == af.WARN) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !z2) {
                z11 = false;
            }
            return new Fe.j(iVar, z11);
        }
        return null;
    }

    public final af india(Object obj) {
        String str;
        x xVar = this.alpha;
        af afVar = (af) xVar.alpha.charlie.get(echo(obj));
        if (afVar != null) {
            return afVar;
        }
        Object delta = delta(obj, AbstractC3425c.delta);
        if (delta != null && (str = (String) CollectionsKt.gray(alpha(delta, false))) != null) {
            af afVar2 = xVar.alpha.bravo;
            if (afVar2 == null) {
                int hashCode = str.hashCode();
                if (hashCode != -2137067054) {
                    if (hashCode != -1838656823) {
                        if (hashCode == 2656902 && str.equals("WARN")) {
                            return af.WARN;
                        }
                        return null;
                    }
                    if (str.equals("STRICT")) {
                        return af.STRICT;
                    }
                    return null;
                }
                if (str.equals("IGNORE")) {
                    return af.IGNORE;
                }
                return null;
            }
            return afVar2;
        }
        return null;
    }

    public final Object juliet(Object annotation) {
        Object obj;
        Intrinsics.echo(annotation, "annotation");
        if (!this.alpha.alpha.echo) {
            if (!CollectionsKt.bronze(AbstractC3425c.golf, echo(annotation)) && !golf(annotation, AbstractC3425c.bravo)) {
                if (golf(annotation, AbstractC3425c.alpha)) {
                    ConcurrentHashMap concurrentHashMap = this.bravo;
                    InterfaceC2330f delta = Ue.e.delta((InterfaceC2466b) annotation);
                    Intrinsics.checkNotNull(delta);
                    Object obj2 = concurrentHashMap.get(delta);
                    if (obj2 == null) {
                        Iterator it = foxtrot(annotation).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = juliet(it.next());
                                if (obj != null) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        if (obj != null) {
                            Object putIfAbsent = concurrentHashMap.putIfAbsent(delta, obj);
                            if (putIfAbsent == null) {
                                return obj;
                            }
                            return putIfAbsent;
                        }
                    } else {
                        return obj2;
                    }
                }
            } else {
                return annotation;
            }
        }
        return null;
    }
}
