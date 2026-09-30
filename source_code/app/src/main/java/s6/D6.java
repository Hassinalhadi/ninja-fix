package s6;

import com.google.android.gms.measurement.internal.C1473v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import ne.C2180d;
import ne.EnumC2181e;
import of.AbstractC2262q;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import qe.C2471g;
import qe.C2473i;
import qe.C2475k;
import qe.InterfaceC2466b;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public abstract class D6 {
    public static final int alpha(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        Intrinsics.echo(yVar, "<this>");
        InterfaceC2466b gray = yVar.getAnnotations().gray(me.m.quebec);
        if (gray == null) {
            return 0;
        }
        Se.g gVar = (Se.g) kotlin.collections.y.papa(gray.bravo(), me.n.delta);
        Intrinsics.charlie(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((Se.k) gVar).alpha).intValue();
    }

    public static final kotlin.reflect.jvm.internal.impl.types.ae bravo(AbstractC2120h abstractC2120h, InterfaceC2472h interfaceC2472h, kotlin.reflect.jvm.internal.impl.types.y yVar, List contextReceiverTypes, List parameterTypes, kotlin.reflect.jvm.internal.impl.types.y yVar2, boolean z2) {
        int i4;
        int collectionSizeOrDefault;
        kotlin.reflect.jvm.internal.impl.types.at atVar;
        InterfaceC2472h interfaceC2472h2;
        InterfaceC2330f juliet;
        int i5 = 1;
        Intrinsics.echo(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.echo(parameterTypes, "parameterTypes");
        int size = contextReceiverTypes.size() + parameterTypes.size();
        if (yVar != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        ArrayList arrayList = new ArrayList(size + i4 + 1);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(contextReceiverTypes, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = contextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList2.add(O5.alpha((kotlin.reflect.jvm.internal.impl.types.y) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (yVar != null) {
            atVar = O5.alpha(yVar);
        } else {
            atVar = null;
        }
        AbstractC2262q.alpha(arrayList, atVar);
        Iterator it2 = parameterTypes.iterator();
        int i10 = 0;
        while (true) {
            boolean hasNext = it2.hasNext();
            interfaceC2472h2 = C2471g.alpha;
            if (!hasNext) {
                break;
            }
            Object next = it2.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(O5.alpha((kotlin.reflect.jvm.internal.impl.types.y) next));
            i10 = i11;
        }
        arrayList.add(O5.alpha(yVar2));
        int size2 = contextReceiverTypes.size() + parameterTypes.size();
        if (yVar == null) {
            i5 = 0;
        }
        int i12 = size2 + i5;
        if (z2) {
            juliet = abstractC2120h.uniform(i12);
        } else {
            Ne.f fVar = me.n.alpha;
            juliet = abstractC2120h.juliet("Function" + i12);
        }
        if (yVar != null) {
            Ne.c cVar = me.m.papa;
            if (!interfaceC2472h.D(cVar)) {
                List annotations = CollectionsKt.b(interfaceC2472h, new C2475k(abstractC2120h, cVar, kotlin.collections.t.alpha));
                Intrinsics.echo(annotations, "annotations");
                if (annotations.isEmpty()) {
                    interfaceC2472h = interfaceC2472h2;
                } else {
                    interfaceC2472h = new C2473i(0, annotations);
                }
            }
        }
        if (!contextReceiverTypes.isEmpty()) {
            int size3 = contextReceiverTypes.size();
            Ne.c cVar2 = me.m.quebec;
            if (!interfaceC2472h.D(cVar2)) {
                List annotations2 = CollectionsKt.b(interfaceC2472h, new C2475k(abstractC2120h, cVar2, kotlin.collections.y.romeo(new Pair(me.n.delta, new Se.k(size3)))));
                Intrinsics.echo(annotations2, "annotations");
                if (!annotations2.isEmpty()) {
                    interfaceC2472h2 = new C2473i(0, annotations2);
                }
                interfaceC2472h = interfaceC2472h2;
            }
        }
        return kotlin.reflect.jvm.internal.impl.types.ab.bravo(kotlin.reflect.jvm.internal.impl.types.c.whiskey(interfaceC2472h), juliet, arrayList);
    }

    public static final Ne.f charlie(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        Se.v vVar;
        String str;
        InterfaceC2466b gray = yVar.getAnnotations().gray(me.m.romeo);
        if (gray != null) {
            Object l10 = CollectionsKt.l(gray.bravo().values());
            if (l10 instanceof Se.v) {
                vVar = (Se.v) l10;
            } else {
                vVar = null;
            }
            if (vVar != null && (str = (String) vVar.alpha) != null) {
                if (!Ne.f.foxtrot(str)) {
                    str = null;
                }
                if (str != null) {
                    return Ne.f.echo(str);
                }
            }
        }
        return null;
    }

    public static final List delta(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        int collectionSizeOrDefault;
        Intrinsics.echo(yVar, "<this>");
        hotel(yVar);
        int alpha = alpha(yVar);
        if (alpha == 0) {
            return CollectionsKt.emptyList();
        }
        List subList = yVar.cyan().subList(0, alpha);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(subList, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.y bravo = ((kotlin.reflect.jvm.internal.impl.types.as) it.next()).bravo();
            Intrinsics.delta(bravo, "it.type");
            arrayList.add(bravo);
        }
        return arrayList;
    }

    public static final EnumC2181e echo(InterfaceC2332h interfaceC2332h) {
        if ((interfaceC2332h instanceof InterfaceC2330f) && AbstractC2120h.crimson(interfaceC2332h)) {
            Ne.e hotel = Ue.e.hotel(interfaceC2332h);
            if (hotel.delta() && !hotel.alpha.isEmpty()) {
                C1473v c1473v = EnumC2181e.red;
                String bravo = hotel.foxtrot().bravo();
                Intrinsics.delta(bravo, "shortName().asString()");
                Ne.c echo = hotel.golf().echo();
                Intrinsics.delta(echo, "toSafe().parent()");
                c1473v.getClass();
                C2180d delta = C1473v.delta(bravo, echo);
                if (delta != null) {
                    return delta.alpha;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.y foxtrot(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        Intrinsics.echo(yVar, "<this>");
        hotel(yVar);
        if (yVar.getAnnotations().gray(me.m.papa) != null) {
            return ((kotlin.reflect.jvm.internal.impl.types.as) yVar.cyan().get(alpha(yVar))).bravo();
        }
        return null;
    }

    public static final List golf(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        int i4;
        Intrinsics.echo(yVar, "<this>");
        hotel(yVar);
        List cyan = yVar.cyan();
        int alpha = alpha(yVar);
        if (hotel(yVar) && yVar.getAnnotations().gray(me.m.papa) != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        return cyan.subList(i4 + alpha, cyan.size() - 1);
    }

    public static final boolean hotel(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        Intrinsics.echo(yVar, "<this>");
        InterfaceC2332h kilo = yVar.green().kilo();
        if (kilo != null) {
            EnumC2181e echo = echo(kilo);
            if (echo == EnumC2181e.silver || echo == EnumC2181e.teal) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean india(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        EnumC2181e enumC2181e;
        Intrinsics.echo(yVar, "<this>");
        InterfaceC2332h kilo = yVar.green().kilo();
        if (kilo != null) {
            enumC2181e = echo(kilo);
        } else {
            enumC2181e = null;
        }
        if (enumC2181e == EnumC2181e.teal) {
            return true;
        }
        return false;
    }

    public static String juliet(int i4) {
        if (i4 == 1) {
            return "Clip";
        }
        if (i4 == 2) {
            return "Ellipsis";
        }
        if (i4 == 5) {
            return "MiddleEllipsis";
        }
        if (i4 == 3) {
            return "Visible";
        }
        if (i4 == 4) {
            return "StartEllipsis";
        }
        return "Invalid";
    }
}
