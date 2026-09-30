package L;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public abstract class c extends kotlin.collections.e implements List, Collection, Yd.a {
    public abstract c bravo(int i4, Object obj);

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract c delta(Object obj);

    public c hotel(Collection collection) {
        g india = india();
        india.addAll(collection);
        return india.delta();
    }

    public abstract g india();

    @Override // kotlin.collections.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract c kilo(b bVar);

    public abstract c lima(int i4);

    @Override // kotlin.collections.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract c mike(int i4, Object obj);

    @Override // kotlin.collections.e, java.util.List
    public final List subList(int i4, int i5) {
        return new K.a(this, i4, i5);
    }
}
