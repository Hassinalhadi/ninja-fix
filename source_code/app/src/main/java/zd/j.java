package zd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pf.C2363m;

/* loaded from: classes2.dex */
public final class j implements Set, Yd.f {
    public final Set alpha;
    public final Function1 purple;
    public final Function1 red;
    public final int silver;

    public j(Set delegate, Function1 function1, Function1 function12) {
        Intrinsics.echo(delegate, "delegate");
        this.alpha = delegate;
        this.purple = function1;
        this.red = function12;
        this.silver = delegate.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.alpha.add(this.red.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        return this.alpha.addAll(alpha(elements));
    }

    public final ArrayList alpha(Collection collection) {
        int collectionSizeOrDefault;
        Collection collection2 = collection;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.red.invoke(it.next()));
        }
        return arrayList;
    }

    public final ArrayList bravo(Collection collection) {
        int collectionSizeOrDefault;
        Intrinsics.echo(collection, "<this>");
        Collection collection2 = collection;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.purple.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.alpha.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.alpha.contains(this.red.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        return this.alpha.containsAll(alpha(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Set)) {
            ArrayList bravo = bravo(this.alpha);
            if (((Set) obj).containsAll(bravo) && bravo.containsAll((Collection) obj)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.alpha.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2363m(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.alpha.remove(this.red.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        return this.alpha.removeAll(CollectionsKt.D(alpha(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        return this.alpha.retainAll(CollectionsKt.D(alpha(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.silver;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.charlie(this);
    }

    public final String toString() {
        return bravo(this.alpha).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.echo(array, "array");
        return kotlin.jvm.internal.j.delta(this, array);
    }
}
