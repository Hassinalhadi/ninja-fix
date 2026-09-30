package s6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2333i;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public abstract class O5 {
    public static final kotlin.reflect.jvm.internal.impl.types.at alpha(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        Intrinsics.echo(yVar, "<this>");
        return new kotlin.reflect.jvm.internal.impl.types.at(1, yVar);
    }

    public static final boolean bravo(kotlin.reflect.jvm.internal.impl.types.y yVar, kotlin.reflect.jvm.internal.impl.types.ap apVar, Set set) {
        InterfaceC2333i interfaceC2333i;
        List list;
        pe.aq aqVar;
        boolean bravo;
        if (!Intrinsics.areEqual(yVar.green(), apVar)) {
            InterfaceC2332h kilo = yVar.green().kilo();
            if (kilo instanceof InterfaceC2333i) {
                interfaceC2333i = (InterfaceC2333i) kilo;
            } else {
                interfaceC2333i = null;
            }
            if (interfaceC2333i != null) {
                list = interfaceC2333i.papa();
            } else {
                list = null;
            }
            Iterable G9 = CollectionsKt.G(yVar.cyan());
            if (!(G9 instanceof Collection) || !((Collection) G9).isEmpty()) {
                Iterator it = G9.iterator();
                do {
                    kotlin.collections.w wVar = (kotlin.collections.w) it;
                    if (((Iterator) wVar.red).hasNext()) {
                        kotlin.collections.v vVar = (kotlin.collections.v) wVar.next();
                        int i4 = vVar.alpha;
                        kotlin.reflect.jvm.internal.impl.types.as asVar = (kotlin.reflect.jvm.internal.impl.types.as) vVar.bravo;
                        if (list != null) {
                            aqVar = (pe.aq) CollectionsKt.jade(i4, list);
                        } else {
                            aqVar = null;
                        }
                        if ((aqVar != null && set != null && set.contains(aqVar)) || asVar.charlie()) {
                            bravo = false;
                        } else {
                            kotlin.reflect.jvm.internal.impl.types.y bravo2 = asVar.bravo();
                            Intrinsics.delta(bravo2, "argument.type");
                            bravo = bravo(bravo2, apVar, set);
                        }
                    }
                } while (!bravo);
                return true;
            }
            return false;
        }
        return true;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.at charlie(kotlin.reflect.jvm.internal.impl.types.y type, int i4, pe.aq aqVar) {
        int i5;
        Intrinsics.echo(type, "type");
        com.google.android.material.datepicker.j.papa(i4, "projectionKind");
        if (aqVar != null) {
            i5 = aqVar.fuchsia();
        } else {
            i5 = 0;
        }
        if (i5 == i4) {
            i4 = 1;
        }
        return new kotlin.reflect.jvm.internal.impl.types.at(i4, type);
    }

    public static final void delta(kotlin.reflect.jvm.internal.impl.types.y yVar, kotlin.reflect.jvm.internal.impl.types.ae aeVar, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC2333i interfaceC2333i;
        List list;
        pe.aq aqVar;
        InterfaceC2332h kilo = yVar.green().kilo();
        if (kilo instanceof pe.aq) {
            if (!Intrinsics.areEqual(yVar.green(), aeVar.green())) {
                linkedHashSet.add(kilo);
                return;
            }
            for (kotlin.reflect.jvm.internal.impl.types.y upperBound : ((pe.aq) kilo).getUpperBounds()) {
                Intrinsics.delta(upperBound, "upperBound");
                delta(upperBound, aeVar, linkedHashSet, set);
            }
            return;
        }
        InterfaceC2332h kilo2 = yVar.green().kilo();
        if (kilo2 instanceof InterfaceC2333i) {
            interfaceC2333i = (InterfaceC2333i) kilo2;
        } else {
            interfaceC2333i = null;
        }
        if (interfaceC2333i != null) {
            list = interfaceC2333i.papa();
        } else {
            list = null;
        }
        int i4 = 0;
        for (kotlin.reflect.jvm.internal.impl.types.as asVar : yVar.cyan()) {
            int i5 = i4 + 1;
            if (list != null) {
                aqVar = (pe.aq) CollectionsKt.jade(i4, list);
            } else {
                aqVar = null;
            }
            if ((aqVar == null || set == null || !set.contains(aqVar)) && !asVar.charlie() && !CollectionsKt.bronze(linkedHashSet, asVar.bravo().green().kilo()) && !Intrinsics.areEqual(asVar.bravo().green(), aeVar.green())) {
                kotlin.reflect.jvm.internal.impl.types.y bravo = asVar.bravo();
                Intrinsics.delta(bravo, "argument.type");
                delta(bravo, aeVar, linkedHashSet, set);
            }
            i4 = i5;
        }
    }

    public static final AbstractC2120h echo(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        Intrinsics.echo(yVar, "<this>");
        AbstractC2120h juliet = yVar.green().juliet();
        Intrinsics.delta(juliet, "constructor.builtIns");
        return juliet;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.y foxtrot(pe.aq aqVar) {
        Object obj;
        List upperBounds = aqVar.getUpperBounds();
        Intrinsics.delta(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List upperBounds2 = aqVar.getUpperBounds();
        Intrinsics.delta(upperBounds2, "upperBounds");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            InterfaceC2330f interfaceC2330f = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC2332h kilo = ((kotlin.reflect.jvm.internal.impl.types.y) next).green().kilo();
            if (kilo instanceof InterfaceC2330f) {
                interfaceC2330f = (InterfaceC2330f) kilo;
            }
            if (interfaceC2330f != null && interfaceC2330f.c() != 2 && interfaceC2330f.c() != 5) {
                obj = next;
                break;
            }
        }
        kotlin.reflect.jvm.internal.impl.types.y yVar = (kotlin.reflect.jvm.internal.impl.types.y) obj;
        if (yVar == null) {
            List upperBounds3 = aqVar.getUpperBounds();
            Intrinsics.delta(upperBounds3, "upperBounds");
            Object gold = CollectionsKt.gold(upperBounds3);
            Intrinsics.delta(gold, "upperBounds.first()");
            return (kotlin.reflect.jvm.internal.impl.types.y) gold;
        }
        return yVar;
    }

    public static final boolean hotel(pe.aq typeParameter, kotlin.reflect.jvm.internal.impl.types.ap apVar, Set set) {
        Intrinsics.echo(typeParameter, "typeParameter");
        List<kotlin.reflect.jvm.internal.impl.types.y> upperBounds = typeParameter.getUpperBounds();
        Intrinsics.delta(upperBounds, "typeParameter.upperBounds");
        if (!upperBounds.isEmpty()) {
            for (kotlin.reflect.jvm.internal.impl.types.y upperBound : upperBounds) {
                Intrinsics.delta(upperBound, "upperBound");
                if (bravo(upperBound, typeParameter.oscar().green(), set) && (apVar == null || Intrinsics.areEqual(upperBound.green(), apVar))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static /* synthetic */ boolean india(pe.aq aqVar, kotlin.reflect.jvm.internal.impl.types.ap apVar, int i4) {
        if ((i4 & 2) != 0) {
            apVar = null;
        }
        return hotel(aqVar, apVar, null);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.B juliet(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        Intrinsics.echo(yVar, "<this>");
        kotlin.reflect.jvm.internal.impl.types.B hotel = kotlin.reflect.jvm.internal.impl.types.az.hotel(yVar, true);
        Intrinsics.delta(hotel, "makeNullable(this)");
        return hotel;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.y kilo(kotlin.reflect.jvm.internal.impl.types.y yVar, InterfaceC2472h interfaceC2472h) {
        if (yVar.getAnnotations().isEmpty() && interfaceC2472h.isEmpty()) {
            return yVar;
        }
        return yVar.ochre().white(kotlin.reflect.jvm.internal.impl.types.c.quebec(yVar.gold(), interfaceC2472h));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.reflect.jvm.internal.impl.types.B] */
    public static final kotlin.reflect.jvm.internal.impl.types.B lima(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        int collectionSizeOrDefault;
        kotlin.reflect.jvm.internal.impl.types.ae aeVar;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        Intrinsics.echo(yVar, "<this>");
        kotlin.reflect.jvm.internal.impl.types.B ochre = yVar.ochre();
        if (ochre instanceof kotlin.reflect.jvm.internal.impl.types.s) {
            kotlin.reflect.jvm.internal.impl.types.s sVar = (kotlin.reflect.jvm.internal.impl.types.s) ochre;
            kotlin.reflect.jvm.internal.impl.types.ae aeVar2 = sVar.purple;
            if (!aeVar2.green().getParameters().isEmpty() && aeVar2.green().kilo() != null) {
                List parameters = aeVar2.green().getParameters();
                Intrinsics.delta(parameters, "constructor.parameters");
                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault3);
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new kotlin.reflect.jvm.internal.impl.types.aj((pe.aq) it.next()));
                }
                aeVar2 = kotlin.reflect.jvm.internal.impl.types.c.papa(aeVar2, arrayList, null, 2);
            }
            kotlin.reflect.jvm.internal.impl.types.ae aeVar3 = sVar.red;
            if (!aeVar3.green().getParameters().isEmpty() && aeVar3.green().kilo() != null) {
                List parameters2 = aeVar3.green().getParameters();
                Intrinsics.delta(parameters2, "constructor.parameters");
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters2, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new kotlin.reflect.jvm.internal.impl.types.aj((pe.aq) it2.next()));
                }
                aeVar3 = kotlin.reflect.jvm.internal.impl.types.c.papa(aeVar3, arrayList2, null, 2);
            }
            aeVar = kotlin.reflect.jvm.internal.impl.types.ab.alpha(aeVar2, aeVar3);
        } else if (ochre instanceof kotlin.reflect.jvm.internal.impl.types.ae) {
            kotlin.reflect.jvm.internal.impl.types.ae aeVar4 = (kotlin.reflect.jvm.internal.impl.types.ae) ochre;
            boolean isEmpty = aeVar4.green().getParameters().isEmpty();
            aeVar = aeVar4;
            if (!isEmpty) {
                InterfaceC2332h kilo = aeVar4.green().kilo();
                aeVar = aeVar4;
                if (kilo != null) {
                    List parameters3 = aeVar4.green().getParameters();
                    Intrinsics.delta(parameters3, "constructor.parameters");
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters3, 10);
                    ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new kotlin.reflect.jvm.internal.impl.types.aj((pe.aq) it3.next()));
                    }
                    aeVar = kotlin.reflect.jvm.internal.impl.types.c.papa(aeVar4, arrayList3, null, 2);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return kotlin.reflect.jvm.internal.impl.types.c.golf(aeVar, ochre);
    }

    public abstract float golf(Object obj);

    public abstract void mike(Object obj, float f5);
}
