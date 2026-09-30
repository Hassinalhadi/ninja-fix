package s6;

import Nf.C0246d;
import com.google.android.gms.measurement.internal.C1473v;
import ge.InterfaceC1772d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import t6.AbstractC3062u;

/* loaded from: classes2.dex */
public abstract class T5 {
    public static final /* synthetic */ int alpha = 0;

    public static final KSerializer alpha(InterfaceC1772d interfaceC1772d, ArrayList serializers, Function0 function0) {
        KSerializer c0246d;
        KSerializer i4;
        Intrinsics.echo(interfaceC1772d, "<this>");
        Intrinsics.echo(serializers, "serializers");
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        if (!Intrinsics.areEqual(interfaceC1772d, vVar.bravo(Collection.class)) && !Intrinsics.areEqual(interfaceC1772d, vVar.bravo(List.class)) && !Intrinsics.areEqual(interfaceC1772d, vVar.bravo(List.class)) && !Intrinsics.areEqual(interfaceC1772d, vVar.bravo(ArrayList.class))) {
            if (Intrinsics.areEqual(interfaceC1772d, vVar.bravo(HashSet.class))) {
                c0246d = new C0246d((KSerializer) serializers.get(0), 1);
            } else if (!Intrinsics.areEqual(interfaceC1772d, vVar.bravo(Set.class)) && !Intrinsics.areEqual(interfaceC1772d, vVar.bravo(Set.class)) && !Intrinsics.areEqual(interfaceC1772d, vVar.bravo(LinkedHashSet.class))) {
                if (Intrinsics.areEqual(interfaceC1772d, vVar.bravo(HashMap.class))) {
                    c0246d = new Nf.ae((KSerializer) serializers.get(0), (KSerializer) serializers.get(1), 0);
                } else if (!Intrinsics.areEqual(interfaceC1772d, vVar.bravo(Map.class)) && !Intrinsics.areEqual(interfaceC1772d, vVar.bravo(Map.class)) && !Intrinsics.areEqual(interfaceC1772d, vVar.bravo(LinkedHashMap.class))) {
                    if (Intrinsics.areEqual(interfaceC1772d, vVar.bravo(Map.Entry.class))) {
                        KSerializer keySerializer = (KSerializer) serializers.get(0);
                        KSerializer valueSerializer = (KSerializer) serializers.get(1);
                        Intrinsics.echo(keySerializer, "keySerializer");
                        Intrinsics.echo(valueSerializer, "valueSerializer");
                        i4 = new Nf.ar(keySerializer, valueSerializer, 0);
                    } else if (Intrinsics.areEqual(interfaceC1772d, vVar.bravo(Pair.class))) {
                        KSerializer keySerializer2 = (KSerializer) serializers.get(0);
                        KSerializer valueSerializer2 = (KSerializer) serializers.get(1);
                        Intrinsics.echo(keySerializer2, "keySerializer");
                        Intrinsics.echo(valueSerializer2, "valueSerializer");
                        i4 = new Nf.ar(keySerializer2, valueSerializer2, 1);
                    } else if (Intrinsics.areEqual(interfaceC1772d, vVar.bravo(Triple.class))) {
                        KSerializer aSerializer = (KSerializer) serializers.get(0);
                        KSerializer bSerializer = (KSerializer) serializers.get(1);
                        KSerializer cSerializer = (KSerializer) serializers.get(2);
                        Intrinsics.echo(aSerializer, "aSerializer");
                        Intrinsics.echo(bSerializer, "bSerializer");
                        Intrinsics.echo(cSerializer, "cSerializer");
                        c0246d = new Nf.Q(aSerializer, bSerializer, cSerializer);
                    } else if (AbstractC3062u.bravo(interfaceC1772d).isArray()) {
                        Object invoke = function0.invoke();
                        Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                        KSerializer elementSerializer = (KSerializer) serializers.get(0);
                        Intrinsics.echo(elementSerializer, "elementSerializer");
                        i4 = new Nf.I((InterfaceC1772d) invoke, elementSerializer);
                    } else {
                        c0246d = null;
                    }
                    c0246d = i4;
                } else {
                    c0246d = new Nf.ae((KSerializer) serializers.get(0), (KSerializer) serializers.get(1), 1);
                }
            } else {
                c0246d = new C0246d((KSerializer) serializers.get(0), 2);
            }
        } else {
            c0246d = new C0246d((KSerializer) serializers.get(0), 0);
        }
        if (c0246d == null) {
            KSerializer[] kSerializerArr = (KSerializer[]) serializers.toArray(new KSerializer[0]);
            return Nf.az.delta(interfaceC1772d, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        }
        return c0246d;
    }

    public static final KSerializer bravo(InterfaceC1772d interfaceC1772d) {
        Intrinsics.echo(interfaceC1772d, "<this>");
        KSerializer delta = delta(interfaceC1772d);
        if (delta != null) {
            return delta;
        }
        Nf.az.india(interfaceC1772d);
        throw null;
    }

    public static final KSerializer charlie(C1473v c1473v, ge.w type) {
        Intrinsics.echo(c1473v, "<this>");
        Intrinsics.echo(type, "type");
        return U5.alpha(c1473v, type, false);
    }

    public static final KSerializer delta(InterfaceC1772d interfaceC1772d) {
        Intrinsics.echo(interfaceC1772d, "<this>");
        KSerializer delta = Nf.az.delta(interfaceC1772d, new KSerializer[0]);
        if (delta == null) {
            return (KSerializer) Nf.H.alpha.get(interfaceC1772d);
        }
        return delta;
    }

    public static final ArrayList echo(C1473v c1473v, List typeArguments, boolean z2) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.echo(c1473v, "<this>");
        Intrinsics.echo(typeArguments, "typeArguments");
        if (z2) {
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(typeArguments, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault2);
            Iterator it = typeArguments.iterator();
            while (it.hasNext()) {
                ge.w type = (ge.w) it.next();
                Intrinsics.echo(type, "type");
                KSerializer alpha2 = U5.alpha(c1473v, type, true);
                if (alpha2 != null) {
                    arrayList.add(alpha2);
                } else {
                    InterfaceC1772d hotel = Nf.az.hotel(type);
                    Intrinsics.echo(hotel, "<this>");
                    Nf.az.india(hotel);
                    throw null;
                }
            }
            return arrayList;
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(typeArguments, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it2 = typeArguments.iterator();
        while (it2.hasNext()) {
            KSerializer charlie = charlie(c1473v, (ge.w) it2.next());
            if (charlie == null) {
                return null;
            }
            arrayList2.add(charlie);
        }
        return arrayList2;
    }
}
