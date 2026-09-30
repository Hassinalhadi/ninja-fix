package Of;

import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Jf.e(with = h.class)
/* loaded from: classes2.dex */
public final class f extends n implements List<n>, Yd.a {

    @NotNull
    public static final e Companion = new Object();
    public final List alpha;

    public f(List content) {
        Intrinsics.echo(content, "content");
        this.alpha = content;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i4, n nVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection<? extends n> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n element = (n) obj;
        Intrinsics.echo(element, "element");
        return this.alpha.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        return this.alpha.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return Intrinsics.areEqual(this.alpha, obj);
    }

    @Override // java.util.List
    public final n get(int i4) {
        return (n) this.alpha.get(i4);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof n)) {
            return -1;
        }
        n element = (n) obj;
        Intrinsics.echo(element, "element");
        return this.alpha.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.alpha.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.alpha.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof n)) {
            return -1;
        }
        n element = (n) obj;
        Intrinsics.echo(element, "element");
        return this.alpha.lastIndexOf(element);
    }

    @Override // java.util.List
    public final ListIterator<n> listIterator() {
        return this.alpha.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ n remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<n> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ n set(int i4, n nVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.alpha.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super n> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<n> subList(int i4, int i5) {
        return this.alpha.subList(i4, i5);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.charlie(this);
    }

    public final String toString() {
        return CollectionsKt.maroon(this.alpha, Constants.SEPARATOR_COMMA, Constants.AES_PREFIX, Constants.AES_SUFFIX, null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<n> listIterator(int i4) {
        return this.alpha.listIterator(i4);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.echo(array, "array");
        return kotlin.jvm.internal.j.delta(this, array);
    }
}
