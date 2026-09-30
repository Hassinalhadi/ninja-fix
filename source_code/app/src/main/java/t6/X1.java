package t6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class X1 {
    public static final HashSet alpha(Iterable iterable) {
        Intrinsics.echo(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set delta = ((Xe.n) it.next()).delta();
            if (delta != null) {
                CollectionsKt__MutableCollectionsKt.addAll(hashSet, delta);
            } else {
                return null;
            }
        }
        return hashSet;
    }

    public abstract s6.as bravo(s6.A a6);

    public abstract s6.az charlie(s6.A a6);

    public abstract void delta(s6.az azVar, s6.az azVar2);

    public abstract void echo(s6.az azVar, Thread thread);

    public abstract boolean foxtrot(s6.A a6, s6.as asVar, s6.as asVar2);

    public abstract boolean golf(s6.A a6, Object obj, Object obj2);

    public abstract boolean hotel(s6.A a6, s6.az azVar, s6.az azVar2);
}
