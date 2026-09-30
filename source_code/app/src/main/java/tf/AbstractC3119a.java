package tf;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3119a extends kotlin.collections.e implements sf.b, Collection, Yd.a {
    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.e, java.util.List
    public final List subList(int i4, int i5) {
        return new sf.a(this, i4, i5);
    }
}
