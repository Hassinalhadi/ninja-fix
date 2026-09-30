package K0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;

/* loaded from: classes3.dex */
public final class b implements Collection, Yd.a {
    public static final b red = new b(CollectionsKt.emptyList());
    public final List alpha;
    public final int purple;

    public b(List list) {
        this.alpha = list;
        this.purple = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final a alpha() {
        return (a) this.alpha.get(0);
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.alpha.contains((a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.alpha.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        if (Intrinsics.areEqual(this.alpha, ((b) obj).alpha)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.alpha.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.alpha.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.purple;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return j.charlie(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.alpha + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.delta(this, objArr);
    }
}
