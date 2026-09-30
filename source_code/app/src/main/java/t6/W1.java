package t6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import of.C2257l;

/* loaded from: classes2.dex */
public abstract class W1 {
    public static Xe.n alpha(String debugName, List scopes) {
        Xe.m mVar;
        Intrinsics.echo(debugName, "debugName");
        Intrinsics.echo(scopes, "scopes");
        C2257l c2257l = new C2257l();
        Iterator it = scopes.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            mVar = Xe.m.bravo;
            if (!hasNext) {
                break;
            }
            Xe.n nVar = (Xe.n) it.next();
            if (nVar != mVar) {
                if (nVar instanceof Xe.a) {
                    CollectionsKt.amber(c2257l, ((Xe.a) nVar).charlie);
                } else {
                    c2257l.add(nVar);
                }
            }
        }
        int i4 = c2257l.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                return new Xe.a(debugName, (Xe.n[]) c2257l.toArray(new Xe.n[0]));
            }
            return (Xe.n) c2257l.get(0);
        }
        return mVar;
    }

    public static int bravo(Set set) {
        int i4;
        int i5 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i4 = obj.hashCode();
            } else {
                i4 = 0;
            }
            i5 += i4;
        }
        return i5;
    }

    public static boolean charlie(s6.ap apVar, Collection collection) {
        collection.getClass();
        if (collection instanceof s6.ai) {
            collection = ((s6.ai) collection).zza();
        }
        boolean z2 = false;
        if ((collection instanceof Set) && collection.size() > apVar.size()) {
            Iterator<E> it = apVar.iterator();
            collection.getClass();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            z2 |= apVar.remove(it2.next());
        }
        return z2;
    }
}
