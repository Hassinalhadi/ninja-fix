package t6;

import Nf.C0246d;
import af.AbstractC0435f;
import af.C0430a;
import af.C0431b;
import af.C0437h;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.measurement.internal.C1473v;
import ge.InterfaceC1772d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import s6.AbstractC2644e6;
import s6.T5;

/* renamed from: t6.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3012j3 {
    public static final KSerializer alpha(Collection collection, C1473v c1473v) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Collection collection2 = collection;
        ArrayList emerald = CollectionsKt.emerald(collection2);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(emerald, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = emerald.iterator();
        while (it.hasNext()) {
            arrayList.add(bravo(it.next(), c1473v));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((KSerializer) next).getDescriptor().oscar())) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb2 = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((KSerializer) it3.next()).getDescriptor().oscar());
            }
            sb2.append(arrayList3);
            throw new IllegalStateException(sb2.toString().toString());
        }
        KSerializer kSerializer = (KSerializer) CollectionsKt.m(arrayList2);
        if (kSerializer == null) {
            kSerializer = Nf.P.alpha;
        }
        if (!kSerializer.getDescriptor().papa() && (!(collection2 instanceof Collection) || !collection2.isEmpty())) {
            Iterator it4 = collection2.iterator();
            while (it4.hasNext()) {
                if (it4.next() == null) {
                    return AbstractC2644e6.bravo(kSerializer);
                }
            }
        }
        return kSerializer;
    }

    public static final KSerializer bravo(Object obj, C1473v module) {
        Intrinsics.echo(module, "module");
        if (obj == null) {
            return AbstractC2644e6.bravo(Nf.P.alpha);
        }
        if (obj instanceof List) {
            return new C0246d(alpha((Collection) obj, module), 0);
        }
        if (obj instanceof Object[]) {
            Object gold = ArraysKt.gold((Object[]) obj);
            if (gold != null) {
                return bravo(gold, module);
            }
            return new C0246d(Nf.P.alpha, 0);
        }
        if (obj instanceof Set) {
            return new C0246d(alpha((Collection) obj, module), 2);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            return new Nf.ae(alpha(map.keySet(), module), alpha(map.values(), module), 1);
        }
        Class<?> cls = obj.getClass();
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        C1473v.bravo(module, vVar.bravo(cls));
        return T5.bravo(vVar.bravo(obj.getClass()));
    }

    public static final C0437h charlie(ai.b bVar, Function1 function1, InterfaceC0581m interfaceC0581m) {
        ai.b bVar2;
        androidx.compose.runtime.ax black = C0564b.black(bVar, interfaceC0581m);
        androidx.compose.runtime.ax black2 = C0564b.black(function1, interfaceC0581m);
        String str = (String) R.l.delta(new Object[0], null, C0431b.purple, interfaceC0581m, 3072, 6);
        C0585q c0585q = (C0585q) interfaceC0581m;
        ah.i iVar = (ah.i) c0585q.kilo(AbstractC0435f.alpha);
        if (iVar == null) {
            c0585q.purple(1006590171);
            Object obj = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
            while (true) {
                if (obj instanceof ContextWrapper) {
                    if (obj instanceof ah.i) {
                        break;
                    }
                    obj = ((ContextWrapper) obj).getBaseContext();
                } else {
                    obj = null;
                    break;
                }
            }
            iVar = (ah.i) obj;
        } else {
            c0585q.purple(1006589303);
        }
        c0585q.quebec(false);
        if (iVar != null) {
            ah.h activityResultRegistry = iVar.getActivityResultRegistry();
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new Object();
                c0585q.f(jade);
            }
            C0430a c0430a = (C0430a) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new C0437h(c0430a, black);
                c0585q.f(jade2);
            }
            C0437h c0437h = (C0437h) jade2;
            boolean india = c0585q.india(c0430a) | c0585q.india(activityResultRegistry) | c0585q.golf(str) | c0585q.india(bVar) | c0585q.golf(black2);
            Object jade3 = c0585q.jade();
            if (!india && jade3 != asVar) {
                bVar2 = bVar;
            } else {
                bVar2 = bVar;
                jade3 = new U0.g(c0430a, activityResultRegistry, str, bVar2, black2);
                c0585q.f(jade3);
            }
            Function1 function12 = (Function1) jade3;
            boolean golf = c0585q.golf(activityResultRegistry) | c0585q.golf(str) | c0585q.golf(bVar2);
            Object jade4 = c0585q.jade();
            if (golf || jade4 == asVar) {
                jade4 = new androidx.compose.runtime.ae(function12);
                c0585q.f(jade4);
            }
            return c0437h;
        }
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
    }

    public static final KSerializer delta(C1473v c1473v, Ed.a typeInfo) {
        KSerializer charlie;
        Intrinsics.echo(c1473v, "<this>");
        Intrinsics.echo(typeInfo, "typeInfo");
        ge.w wVar = typeInfo.bravo;
        if (wVar != null) {
            if (wVar.delta().isEmpty()) {
                charlie = null;
            } else {
                charlie = T5.charlie(c1473v, wVar);
            }
            if (charlie != null) {
                return charlie;
            }
        }
        InterfaceC1772d interfaceC1772d = typeInfo.alpha;
        C1473v.bravo(c1473v, interfaceC1772d);
        KSerializer bravo = T5.bravo(interfaceC1772d);
        if (wVar != null && wVar.alpha()) {
            return AbstractC2644e6.bravo(bravo);
        }
        return bravo;
    }
}
