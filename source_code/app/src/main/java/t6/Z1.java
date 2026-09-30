package t6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import of.C2257l;
import s6.Q6;

/* loaded from: classes2.dex */
public abstract class Z1 {
    public static Xe.n alpha(Collection types, String message) {
        int collectionSizeOrDefault;
        Xe.n nVar;
        Intrinsics.echo(message, "message");
        Intrinsics.echo(types, "types");
        Collection collection = types;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.types.y) it.next()).olive());
        }
        C2257l charlie = Q6.charlie(arrayList);
        int i4 = charlie.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                nVar = new Xe.a(message, (Xe.n[]) charlie.toArray(new Xe.n[0]));
            } else {
                nVar = (Xe.n) charlie.get(0);
            }
        } else {
            nVar = Xe.m.bravo;
        }
        if (charlie.alpha <= 1) {
            return nVar;
        }
        return new Xe.j(nVar);
    }

    public String bravo() {
        return null;
    }

    public String charlie() {
        return null;
    }
}
