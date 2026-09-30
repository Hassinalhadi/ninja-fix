package pe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;
import pf.InterfaceC2358h;
import se.C2873w;
import xe.EnumC3339b;

/* renamed from: pe.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2347w {
    public static final K1.r alpha = new K1.r("InvalidModuleNotifier", 2);

    public static final com.bumptech.glide.load.engine.h alpha(kotlin.reflect.jvm.internal.impl.types.ae aeVar, InterfaceC2333i interfaceC2333i, int i4) {
        InterfaceC2333i interfaceC2333i2 = null;
        if (interfaceC2333i == null || hf.i.foxtrot(interfaceC2333i)) {
            return null;
        }
        int size = interfaceC2333i.papa().size() + i4;
        if (!interfaceC2333i.india()) {
            if (size != aeVar.cyan().size()) {
                Qe.e.oscar(interfaceC2333i);
            }
            return new com.bumptech.glide.load.engine.h(interfaceC2333i, aeVar.cyan().subList(i4, aeVar.cyan().size()), (com.bumptech.glide.load.engine.h) null);
        }
        List subList = aeVar.cyan().subList(i4, size);
        InterfaceC2335k lima = interfaceC2333i.lima();
        if (lima instanceof InterfaceC2333i) {
            interfaceC2333i2 = (InterfaceC2333i) lima;
        }
        return new com.bumptech.glide.load.engine.h(interfaceC2333i, subList, alpha(aeVar, interfaceC2333i2, size));
    }

    public static final void bravo(InterfaceC2325ah interfaceC2325ah, Ne.c fqName, ArrayList arrayList) {
        Intrinsics.echo(interfaceC2325ah, "<this>");
        Intrinsics.echo(fqName, "fqName");
        interfaceC2325ah.bravo(fqName, arrayList);
    }

    public static final List charlie(InterfaceC2333i interfaceC2333i) {
        List list;
        Object obj;
        int collectionSizeOrDefault;
        kotlin.reflect.jvm.internal.impl.types.ap tango;
        Intrinsics.echo(interfaceC2333i, "<this>");
        List declaredTypeParameters = interfaceC2333i.papa();
        Intrinsics.delta(declaredTypeParameters, "declaredTypeParameters");
        if (!interfaceC2333i.india() && !(interfaceC2333i.lima() instanceof InterfaceC2326b)) {
            return declaredTypeParameters;
        }
        int i4 = Ue.e.alpha;
        Ue.d dVar = Ue.d.alpha;
        InterfaceC2358h foxtrot = AbstractC2360j.foxtrot(AbstractC2360j.lima(interfaceC2333i, dVar), 1);
        ar predicate = ar.alpha;
        Intrinsics.echo(predicate, "predicate");
        List quebec = AbstractC2360j.quebec(AbstractC2360j.juliet(AbstractC2360j.golf(new kotlin.io.h(foxtrot, predicate), as.alpha), at.alpha));
        Iterator it = AbstractC2360j.foxtrot(AbstractC2360j.lima(interfaceC2333i, dVar), 1).iterator();
        while (true) {
            list = null;
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof InterfaceC2330f) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC2330f interfaceC2330f = (InterfaceC2330f) obj;
        if (interfaceC2330f != null && (tango = interfaceC2330f.tango()) != null) {
            list = tango.getParameters();
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (quebec.isEmpty() && list.isEmpty()) {
            List declaredTypeParameters2 = interfaceC2333i.papa();
            Intrinsics.delta(declaredTypeParameters2, "declaredTypeParameters");
            return declaredTypeParameters2;
        }
        ArrayList a6 = CollectionsKt.a(quebec, list);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(a6, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it2 = a6.iterator();
        while (it2.hasNext()) {
            aq it3 = (aq) it2.next();
            Intrinsics.delta(it3, "it");
            arrayList.add(new C2329e(it3, interfaceC2333i, declaredTypeParameters.size()));
        }
        return CollectionsKt.a(declaredTypeParameters, arrayList);
    }

    public static final InterfaceC2330f delta(InterfaceC2349y interfaceC2349y, Ne.b classId) {
        Intrinsics.echo(interfaceC2349y, "<this>");
        Intrinsics.echo(classId, "classId");
        InterfaceC2332h echo = echo(interfaceC2349y, classId);
        if (echo instanceof InterfaceC2330f) {
            return (InterfaceC2330f) echo;
        }
        return null;
    }

    public static final InterfaceC2332h echo(InterfaceC2349y interfaceC2349y, Ne.b classId) {
        Intrinsics.echo(interfaceC2349y, "<this>");
        Intrinsics.echo(classId, "classId");
        if (interfaceC2349y.silver(Qe.l.alpha) == null) {
            Ne.c golf = classId.golf();
            Intrinsics.delta(golf, "classId.packageFqName");
            ai amber = interfaceC2349y.amber(golf);
            List echo = classId.hotel().alpha.echo();
            Xe.j jVar = ((C2873w) amber).yellow;
            Object gold = CollectionsKt.gold(echo);
            Intrinsics.delta(gold, "segments.first()");
            EnumC3339b enumC3339b = EnumC3339b.yellow;
            InterfaceC2332h golf2 = jVar.golf((Ne.f) gold, enumC3339b);
            if (golf2 != null) {
                for (Ne.f name : echo.subList(1, echo.size())) {
                    if (golf2 instanceof InterfaceC2330f) {
                        Xe.n s3 = ((InterfaceC2330f) golf2).s();
                        Intrinsics.delta(name, "name");
                        InterfaceC2332h golf3 = s3.golf(name, enumC3339b);
                        if (golf3 instanceof InterfaceC2330f) {
                            golf2 = (InterfaceC2330f) golf3;
                        } else {
                            golf2 = null;
                        }
                        if (golf2 != null) {
                        }
                    }
                }
                return golf2;
            }
            return null;
        }
        throw new ClassCastException();
    }

    public static final InterfaceC2330f foxtrot(InterfaceC2349y interfaceC2349y, Ne.b classId, J2.i notFoundClasses) {
        Intrinsics.echo(interfaceC2349y, "<this>");
        Intrinsics.echo(classId, "classId");
        Intrinsics.echo(notFoundClasses, "notFoundClasses");
        InterfaceC2330f delta = delta(interfaceC2349y, classId);
        if (delta != null) {
            return delta;
        }
        return notFoundClasses.alpha(classId, AbstractC2360j.quebec(AbstractC2360j.oscar(AbstractC2360j.lima(classId, C2342r.alpha), C2343s.alpha)));
    }

    public static final InterfaceC2332h golf(InterfaceC2335k interfaceC2335k) {
        Intrinsics.echo(interfaceC2335k, "<this>");
        InterfaceC2335k lima = interfaceC2335k.lima();
        if (lima == null || (interfaceC2335k instanceof InterfaceC2321ad)) {
            return null;
        }
        if (!(lima.lima() instanceof InterfaceC2321ad)) {
            return golf(lima);
        }
        if (lima instanceof InterfaceC2332h) {
            return (InterfaceC2332h) lima;
        }
        return null;
    }

    public static final boolean hotel(InterfaceC2325ah interfaceC2325ah, Ne.c fqName) {
        Intrinsics.echo(interfaceC2325ah, "<this>");
        Intrinsics.echo(fqName, "fqName");
        return interfaceC2325ah.alpha(fqName);
    }

    public static final ArrayList india(InterfaceC2325ah interfaceC2325ah, Ne.c fqName) {
        Intrinsics.echo(interfaceC2325ah, "<this>");
        Intrinsics.echo(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        bravo(interfaceC2325ah, fqName, arrayList);
        return arrayList;
    }

    public static final InterfaceC2330f juliet(se.z zVar, Ne.c fqName) {
        InterfaceC2330f interfaceC2330f;
        InterfaceC2332h interfaceC2332h;
        Xe.n s3;
        EnumC3339b enumC3339b = EnumC3339b.alpha;
        Intrinsics.echo(zVar, "<this>");
        Intrinsics.echo(fqName, "fqName");
        if (!fqName.delta()) {
            Ne.c echo = fqName.echo();
            Intrinsics.delta(echo, "fqName.parent()");
            C2873w c2873w = (C2873w) zVar.amber(echo);
            Ne.f foxtrot = fqName.foxtrot();
            Intrinsics.delta(foxtrot, "fqName.shortName()");
            InterfaceC2332h golf = c2873w.yellow.golf(foxtrot, enumC3339b);
            if (golf instanceof InterfaceC2330f) {
                interfaceC2330f = (InterfaceC2330f) golf;
            } else {
                interfaceC2330f = null;
            }
            if (interfaceC2330f != null) {
                return interfaceC2330f;
            }
            Ne.c echo2 = fqName.echo();
            Intrinsics.delta(echo2, "fqName.parent()");
            InterfaceC2330f juliet = juliet(zVar, echo2);
            if (juliet != null && (s3 = juliet.s()) != null) {
                Ne.f foxtrot2 = fqName.foxtrot();
                Intrinsics.delta(foxtrot2, "fqName.shortName()");
                interfaceC2332h = s3.golf(foxtrot2, enumC3339b);
            } else {
                interfaceC2332h = null;
            }
            if (interfaceC2332h instanceof InterfaceC2330f) {
                return (InterfaceC2330f) interfaceC2332h;
            }
        }
        return null;
    }
}
